package com.bianisoft.games.pool;


//Standard Java imports
import java.util.ArrayList;

//Bianisoft imports
import com.bianisoft.engine.Obj;
import com.bianisoft.engine.App;
import com.bianisoft.engine.Context;
import com.bianisoft.engine.backgrounds.Background;
import com.bianisoft.engine.PhysObj;
import com.bianisoft.engine.helper.Random;
import com.bianisoft.engine.sprites.Sprite;
import com.bianisoft.engine.labels.Label;
//import com.bianisoft.engine.music.Music;
//import com.bianisoft.engine.Sound;
import com.bianisoft.engine.Timer;
//import com.bianisoft.engine.resmng.SoundCache;
import com.bianisoft.engine.manager.MngInput;
import com.bianisoft.engine.manager.physic.MngPhysic;
import com.bianisoft.engine.manager.physic.HitInfo;
import com.bianisoft.engine.manager.physic.I_ColliderCallback;


public class CtxGame extends Context  implements I_ColliderCallback{
	private class TimerDelayMusicPlay implements Timer.I_Callback{
		public void TimerEvent(Timer p_timer, Object p_objHint){
//			m_musicIntro.stop();
//			m_musicPlay.play();
//			m_sndBallWhiteReAppear.play();
			m_isGameStarted= true;
			m_sprAim.show();
			for(Obj obj : getCountainer(COUNTAINER_TYPE_WORLD_2D).getVectorChilds()){
				if(obj.isKindOf(SprBall.IDCLASS_Ball)){
					SprBall objBall= (SprBall)obj;
					objBall.show();
				}
			}
		}
	}

	private class TimerDelaySounds implements Timer.I_Callback{
		public void TimerEvent(Timer p_timer, Object p_objHint){
			m_canPlaySound= true;
			p_timer.m_isEnable= true;
		}
	}

	private class TimerDelayFinished implements Timer.I_Callback{
		public void TimerEvent(Timer p_timer, Object p_objHint){
			if(/*m_musicFinished.isPlaying() && */m_isChallengingPerfect){
				m_nbBallLeft[m_nCurPlayer]++;
//				m_musicFinished.stop();
//				m_musicPerfect.play();
				p_timer.m_isEnable= true;
				p_timer.setDelay(4000);
			}else
				App.g_theApp.setCurContext(AppPool.IDCTX_GAME);
		}
	}

	private class MyScore{
		Label	m_lblAttached= null;
		int		m_nScore= 0;
		int		m_nScoreDst= 0;

		public void setAttachedLabel(Label p_lblAttached){
			m_lblAttached= p_lblAttached;
			m_lblAttached.set(m_nScore);
		}

		public void manage(){
			if(m_nScore == m_nScoreDst)
				return;

			if((m_nScore+= 5) > m_nScoreDst){
				m_nScore= m_nScoreDst;
			}
			if(m_canPlaySound){
//				m_sndPtsUp.play();
				m_canPlaySound= false;
			}

			m_lblAttached.set(m_nScore);
		}

		public void addPoints(int p_nAdd)	{m_nScoreDst+= p_nAdd;}
	}


	private static final float[][]	COLORS_BACK= {
		{1.00f, 0.45f, 0.70f},
		{0.00f, 0.65f, 0.00f},
		{0.70f, 1.00f, 0.80f},
		{0.75f, 0.00f, 0.75f}
	};

//	public Music m_musicIntro;
//	public Music m_musicPlay;
//	public Music m_musicFinished;
//	public Music m_musicPerfect;

	//GUI related
	Label[]		m_lblScoreValue= new Label[2];
	Label		m_lblHiScoreValue;
	Label		m_lblStageValue;
	Label		m_lblNbBallsValue;
	SprSelector	m_sprSelector;
	SprShots	m_sprShots;

	//Game Related
	SprBall			m_ballWhite;
	SprPowerGauge	m_powerGauge;
	Sprite			m_sprAim;

	MyScore[]	m_objScore= new MyScore[2];
	int			m_nCurPlayer;
	int[]		m_nbBallLeft= new int[2];
	int			m_nScoreThisRound;
	int			m_nCptBallInLastRound;
	int			m_nCptBallInThisRound;
	boolean		m_isBallMoving;
	boolean		m_hasPendingReload;
	boolean		m_hasMoved;
	boolean		m_isChallengingPerfect;
	float		m_fAngleThrow;
	float		m_fLenMire;

	float[]		m_arPosXSaved;
	float[]		m_arPosYSaved;
	boolean[]	m_arStateSaved;
	boolean		m_isGameStarted;
	boolean		m_isFirstManage;
	boolean		m_canPlaySound;

//	Sound		m_sndBallScore;
//	Sound		m_sndBallWhiteFall;
//	Sound		m_sndBallWhiteReAppear;
//	Sound		m_sndBallWhiteShoot;
//	Sound		m_sndBallCollision;
//	Sound		m_sndWallCollision;
//	Sound		m_sndAimMove;
//	Sound		m_sndPtsUp;

	Timer		m_timDelayLevelFinished;


	public void reInit(){
		m_nCurPlayer= 0;
		m_nbBallLeft[0]= 3;
		m_nbBallLeft[1]= GlobalSettings.m_nNbPlayer == 2? 3:0;
		m_objScore[0]= new MyScore();
		m_objScore[1]= new MyScore();
		m_isBallMoving= true;
		m_hasMoved= false;
		m_fAngleThrow= 0;
		m_fLenMire= 100;
		m_nCptBallInThisRound= 0;
		GlobalSettings.m_bReInit= false;
	}

	public void activate(){
		super.activate();

		if(GlobalSettings.m_bReInit)
			reInit();

		int nRandomColor= Random.rand(4);
		Background back0= new Background("/res/Back/BackMoon" + Random.rand(6) + ".png");
		back0.setPosZ(11);
		back0.load();
		back0.setFilterColor(COLORS_BACK[nRandomColor][0], COLORS_BACK[nRandomColor][1], COLORS_BACK[nRandomColor][2], 1);
		addChild(back0);

		switch(GlobalSettings.m_nCurLevel){
			case 0:		DesignCtxGame0.load(this);		break;
			case 1:		DesignCtxGame1.load(this);		break;
			case 2:		DesignCtxGame2.load(this);		break;
			case 3:		DesignCtxGame3.load(this);		break;
			case 4:		DesignCtxGame4.load(this);		break;
			case 5:		DesignCtxGame5.load(this);		break;
			case 6:		DesignCtxGame6.load(this);		break;
			case 7:		DesignCtxGame7.load(this);		break;
			case 8:		DesignCtxGame8.load(this);		break;
			case 9:		DesignCtxGame9.load(this);		break;
			default:	DesignCtxGameDebug.load(this);	break;
		}

		MngPhysic.get().loadCollisionFile("/res/Collisions/ColGame" + GlobalSettings.m_nCurLevel + ".col");
		MngPhysic.get().setCallback(this);

//		m_musicIntro= Music.create(Music.TYPE_EMU, "/res/Music/LunarPool.nsf", 3);
//		m_musicPlay= Music.create(Music.TYPE_EMU, "/res/Music/LunarPool.nsf", 2);
//		m_musicFinished= Music.create(Music.TYPE_EMU, "/res/Music/LunarPool.nsf", 4);
//		m_musicPerfect= Music.create(Music.TYPE_EMU, "/res/Music/LunarPool.nsf", 5);

//		m_musicIntro.load();
//		m_musicPlay.load();
//		m_musicFinished.load();
//		m_musicPerfect.load();
//		m_musicIntro.play();

//		m_sndBallScore			= SoundCache.getSound("/res/Sound/BallScore.wav");
//		m_sndBallWhiteFall		= SoundCache.getSound("/res/Sound/BallWhiteFall.wav");
//		m_sndBallWhiteReAppear	= SoundCache.getSound("/res/Sound/BallWhiteReAppear.wav");
//		m_sndBallCollision		= SoundCache.getSound("/res/Sound/CollBall.wav");
//		m_sndWallCollision		= SoundCache.getSound("/res/Sound/CollWall.wav");
//		m_sndAimMove			= SoundCache.getSound("/res/Sound/CursorMove.wav");
//		m_sndPtsUp				= SoundCache.getSound("/res/Sound/PtsUp.wav");
//		m_sndBallWhiteShoot		= SoundCache.getSound("/res/Sound/BallShoot.wav");

//		m_sndBallScore.load();
//		m_sndBallWhiteFall.load();
//		m_sndBallWhiteReAppear.load();
//		m_sndBallCollision.load();
//		m_sndWallCollision.load();
//		m_sndAimMove.load();
//		m_sndPtsUp.load();
//		m_sndBallWhiteShoot.load();

		m_lblHiScoreValue	= (Label)findByTextID("Lbl_GameHiScoreValue");
		m_lblScoreValue[0]	= (Label)findByTextID("Lbl_GamePlayer1ScoreValue");
		m_lblScoreValue[1]	= (Label)findByTextID("Lbl_GamePlayer2ScoreValue");
		m_lblNbBallsValue	= (Label)findByTextID("Lbl_GameNbBallsValue");
		m_lblStageValue		= (Label)findByTextID("Lbl_GameStageValue");

		m_sprSelector	= (SprSelector)findByTextID("Spr_GameSelector");
		m_sprShots		= (SprShots)findByTextID("Spr_GameShots");
		m_sprAim		= (Sprite)findByTextID("Spr_GameAim");	m_sprAim.hide();
		m_powerGauge	= (SprPowerGauge)findByTextID("Spr_GamePowerGauge");
		m_ballWhite		= (SprBall)findByTextID("Spr_BallWhite");

		if(m_nCurPlayer == 1)
			m_sprSelector.switchPlayer();

		m_objScore[0].setAttachedLabel(m_lblScoreValue[0]);
		m_objScore[1].setAttachedLabel(m_lblScoreValue[1]);

		m_lblHiScoreValue.set(GlobalSettings.m_nHighScore);
		m_lblNbBallsValue.set(m_nbBallLeft[m_nCurPlayer]);
		m_lblStageValue.set(GlobalSettings.m_nCurLevel + 1);

		m_arPosXSaved= new float[16];
		m_arPosYSaved= new float[16];
		m_arStateSaved= new boolean[16];
		m_isFirstManage= true;
		m_isGameStarted= false;
		m_isChallengingPerfect= true;

		m_timDelayLevelFinished= new Timer(3000, new TimerDelayFinished(), this);
		m_timDelayLevelFinished.m_isEnable= false;

		addTimer(3000, new TimerDelayMusicPlay(), this);
		addTimer(75, new TimerDelaySounds(), this);
		addTimer(m_timDelayLevelFinished);
	}

	public void deActivate(){
		super.deActivate();
//		m_musicPlay.stop();
	}

	public void onCollideObj2Line(HitInfo p_hitStruct, PhysObj p_physObj1){
		MngPhysic.get().onCollideObj2Line(p_hitStruct, p_physObj1);
//		m_sndWallCollision.play();
	}

	public void onCollideObj2Obj(HitInfo p_hitStruct, PhysObj p_physObj1, PhysObj p_physObj2){
		MngPhysic.get().onCollideObj2Obj(p_hitStruct, p_physObj1, p_physObj2);

		SprBall objBall= null;
		SprHole objHole= null;

		if(p_physObj1.isKindOf(SprHole.IDCLASS_Hole) && p_physObj2.isKindOf(SprBall.IDCLASS_Ball)){
			objBall= (SprBall)p_physObj2;
			objHole= (SprHole)p_physObj1;
		}else if(p_physObj2.isKindOf(SprHole.IDCLASS_Hole) && p_physObj1.isKindOf(SprBall.IDCLASS_Ball)){
			objBall= (SprBall)p_physObj1;
			objHole= (SprHole)p_physObj2;
		}else{
//			m_sndBallCollision.play();
			return;
		}

		objHole.setVel(0, 0, 0);

		objBall.hide();
		objBall.setVel(0, 0, 0);
		objBall.m_isCollidable= false;
		objBall.setPos(objHole.getPosX(), objHole.getPosY(), objBall.getPosZ());

		if(objBall.getCurState() == 1){	//This is the white Ball
//			m_sndBallWhiteFall.play();
			m_lblNbBallsValue.set(--m_nbBallLeft[m_nCurPlayer]);
			m_nCptBallInThisRound= 0;
		}else{
//			m_sndBallScore.play();
			++m_nCptBallInThisRound;
			m_nScoreThisRound+= (objBall.getCurFrame()+1) * 10;
			if(m_nCptBallInLastRound > 0)
				m_nScoreThisRound+= 10;
		}
	}

	public void saveBallsPositions(){
		ArrayList<PhysObj> vecPhysObj= getCountainer(COUNTAINER_TYPE_WORLD_2D).getVectorChilds();
		int i= 0;

		for(Obj obj : vecPhysObj){
			if(obj.isKindOf(SprBall.IDCLASS_Ball)){
				SprBall objBall= (SprBall)obj;

				m_arPosXSaved[i]= objBall.getPosX();
				m_arPosYSaved[i]= objBall.getPosY();
				m_arStateSaved[i]= m_isFirstManage || objBall.isShown();
				++i;
			}
		}
	}

	public void reloadLastBallsPosition(){
//		m_sndBallWhiteReAppear.play();

		//Switch Player
		m_nCurPlayer= m_sprSelector.switchPlayer();
		m_lblNbBallsValue.set(m_nbBallLeft[m_nCurPlayer]);

		//If Switched Player has no more balls, switch Back
		if(m_nbBallLeft[m_nCurPlayer] == 0){
			m_nCurPlayer= m_sprSelector.switchPlayer();
			m_lblNbBallsValue.set(m_nbBallLeft[m_nCurPlayer]);
		}

		ArrayList<PhysObj> vecPhysObj= getCountainer(COUNTAINER_TYPE_WORLD_2D).getVectorChilds();
		int i= 0;
		for(Obj obj : vecPhysObj){
			if(obj.isKindOf(SprBall.IDCLASS_Ball)){
				SprBall objBall= (SprBall)obj;

				objBall.setPosX(m_arPosXSaved[i]);
				objBall.setPosY(m_arPosYSaved[i]);

				if(m_arStateSaved[i]){
					objBall.show();
					objBall.m_isCollidable= true;
				}
				++i;
			}
		}

		m_hasPendingReload= false;
	}

	public void manage(float p_fTimeScaleFactor){
		super.manage(p_fTimeScaleFactor);

		m_powerGauge.m_canMove= !m_isBallMoving;
		m_sprAim.show(!m_isBallMoving);
		m_sprAim.setAngleZ(m_fAngleThrow*1000);
		m_sprAim.setPos(m_ballWhite.getPosX() + (m_fLenMire * (float)Math.cos(m_fAngleThrow)), m_ballWhite.getPosY() + (m_fLenMire * (float)Math.sin(m_fAngleThrow)), m_ballWhite.getPosZ());

		if(!m_isGameStarted)
			return;

		MngInput mngInput= MngInput.get();
		if(mngInput.isKeyboardDown(MngInput.K_ARROW_LEFT)){
			if(!m_isBallMoving){
				if(m_canPlaySound){
//					m_sndAimMove.play();
					m_canPlaySound= false;
				}
				m_fAngleThrow-= 0.01f;
			}
		}else if(mngInput.isKeyboardDown(MngInput.K_ARROW_RIGHT)){
			if(!m_isBallMoving){
				if(m_canPlaySound){
//					m_sndAimMove.play();
					m_canPlaySound= false;
				}
				m_fAngleThrow+= 0.01f;
			}
		}
		if(mngInput.isKeyboardDown(MngInput.K_ARROW_UP)){
			if(!m_isBallMoving){
				m_fLenMire+= 1;
				if(m_fLenMire > 200)
					m_fLenMire= 200;
			}
		}else if(mngInput.isKeyboardDown(MngInput.K_ARROW_DOWN)){
			if(!m_isBallMoving){
				m_fLenMire-= 1;
				if(m_fLenMire < 5)
					m_fLenMire= 5;
			}
		}

		if(mngInput.isKeyboardClicked(MngInput.K_A) || mngInput.isKeyboardClicked(MngInput.K_ENTER)){
			if(!m_isBallMoving){
				m_ballWhite.setVelX((float)Math.cos(m_fAngleThrow) * m_powerGauge.m_fCptPower);
				m_ballWhite.setVelY((float)Math.sin(m_fAngleThrow) * m_powerGauge.m_fCptPower);
				m_hasMoved= true;
//				m_sndBallWhiteShoot.play();
			}
		}

		if((m_nbBallLeft[0] == 0) && (m_nbBallLeft[1] == 0)){
			App.g_theApp.setCurContext(AppPool.IDCTX_GAME_OVER);
			return;
		}

		if(m_isFirstManage){
			saveBallsPositions();
			m_isFirstManage= false;
		}

		m_isBallMoving= false;
		for(Obj obj : getCountainer(COUNTAINER_TYPE_WORLD_2D).getVectorChilds()){
			if(obj.isKindOf(SprBall.IDCLASS_Ball)){
				SprBall objBall= (SprBall)obj;

				if((objBall.isMoving()) || (objBall.getZoom() > 0.0 && objBall.getZoom() < 1.0)){
					objBall.isMoving();
					m_isBallMoving= true;
				}
			}
		}

		if(!m_isBallMoving){
			if(m_hasPendingReload){
				m_isChallengingPerfect= false;
				m_nCptBallInLastRound= 0;
				m_nCptBallInLastRound= 0;
				m_nScoreThisRound= 0;
				reloadLastBallsPosition();
				m_sprShots.reset();
				m_hasMoved= false;
				return;
			}

			if(!m_ballWhite.isShown())
				m_hasPendingReload= true;

			if(!m_hasPendingReload && m_hasMoved){
				m_nCptBallInLastRound= m_nCptBallInThisRound;
				m_hasMoved= false;
				saveBallsPositions();
				if(m_nCptBallInThisRound > 0){
					m_sprShots.reset();
					m_objScore[m_nCurPlayer].addPoints(m_nScoreThisRound * m_nCptBallInThisRound);

					if(m_objScore[m_sprSelector.m_nCurPlayer].m_nScoreDst > GlobalSettings.m_nHighScore){
						GlobalSettings.m_nHighScore= m_objScore[m_sprSelector.m_nCurPlayer].m_nScoreDst;
						m_lblHiScoreValue.set(GlobalSettings.m_nHighScore);
					}
					m_nCptBallInThisRound= 0;
					m_nScoreThisRound= 0;
				}else{
					m_isChallengingPerfect= false;
					if((--m_sprShots.m_nShotsLeft) == 0){
						m_lblNbBallsValue.set(--m_nbBallLeft[m_nCurPlayer]);
						m_hasPendingReload= true;
					}
				}

			}

			//If All the balls are in ->Change level
			//Do the reset angle at the same time
			if(!m_hasPendingReload){
				boolean	levelFinished= true;
				for(Obj obj : getCountainer(COUNTAINER_TYPE_WORLD_2D).getVectorChilds()){
					if(obj.isKindOf(SprBall.IDCLASS_Ball)){
						if(obj == m_ballWhite)
							continue;

						SprBall objBall= (SprBall)obj;
						objBall.resetAngle();

						if(objBall.isShown())
							levelFinished= false;
					}
				}

				if(levelFinished){
					if(m_ballWhite.isShown()){
						if(++GlobalSettings.m_nCurLevel > 9)
							GlobalSettings.m_nCurLevel= 9;

						m_nbBallLeft[m_nCurPlayer]++;
//						m_musicPlay.stop();
						m_timDelayLevelFinished.m_isEnable= true;
						m_timDelayLevelFinished.setDelay(3000);
//						m_musicFinished.play();
					}
				}
			}
		}
		
		m_objScore[0].manage();
		m_objScore[1].manage();
	}
}
