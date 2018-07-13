package com.bianisoft.games.pool;


//Bianisoft imports
import com.bianisoft.engine.App;
import com.bianisoft.engine.Context;
import com.bianisoft.engine.sprites.Sprite;
import com.bianisoft.engine.labels.Label;
//import com.bianisoft.engine.music.Music;
import com.bianisoft.engine.manager.MngInput;


public class CtxOption extends Context{
	public int[][]	POS_CURSOR	= {{-110, -60}, {-110, -15}, {-110, 30}};
	public int		MAX_ROUNDS	= 9;
	public int		MAX_FRICTION= 256;

	public int		m_nPosCursor= 0;
	public Sprite	m_sprSelector;
	public Label	m_lblRoundValue;
	public Label	m_lblFrictionValue;

//	Music m_musicThisContext;


	public void activate(){
		super.activate();

		DesignCtxOption.load(this);

		((Label)findByTextID("Lbl_OptionHiScoreValue")).set(GlobalSettings.m_nHighScore);

//		m_musicThisContext= Music.create(Music.TYPE_EMU, "/res/Music/LunarPool.nsf", 1);
//		m_musicThisContext.load();
//		m_musicThisContext.play();

		m_sprSelector		= (Sprite)findByTextID("Spr_OptionSelector");
		m_lblRoundValue		= (Label)findByTextID("Lbl_OptionRoundValue");
		m_lblFrictionValue	= (Label)findByTextID("Lbl_OptionFrictionValue");

		m_lblRoundValue.set(GlobalSettings.m_nCurLevel + 1);
		m_lblFrictionValue.set(GlobalSettings.m_nFrictionLevel);
		m_sprSelector.moveTo(POS_CURSOR[m_nPosCursor][0], POS_CURSOR[m_nPosCursor][1], m_sprSelector.getPosZ(), m_sprSelector.getAngleX(), m_sprSelector.getAngleY(), m_sprSelector.getAngleZ(), 1000);

		GlobalSettings.m_bReInit= true;
	}

	public void deActivate(){
		super.deActivate();
//		m_musicThisContext.stop();

		GlobalSettings.m_nNbPlayer		= (m_nPosCursor == 0)? 1:2;
		GlobalSettings.m_isAgainstCPU	= (m_nPosCursor == 2)? true: false;
	}

	public void manage(float p_fTimeScaleFactor){
		super.manage(p_fTimeScaleFactor);

		MngInput mngInput= MngInput.get();

		if(mngInput.isKeyboardClicked(MngInput.K_ENTER)){
			App.g_theApp.setCurContext(AppPool.IDCTX_GAME);
		}else if(mngInput.isKeyboardClicked(MngInput.K_SPACE)){
			if((++m_nPosCursor) > 2)
				m_nPosCursor= 0;
			m_sprSelector.moveTo(POS_CURSOR[m_nPosCursor][0], POS_CURSOR[m_nPosCursor][1], m_sprSelector.getPosZ(), m_sprSelector.getAngleX(), m_sprSelector.getAngleY(), m_sprSelector.getAngleZ(), 1000);
		}else if(mngInput.isKeyboardClicked(MngInput.K_ARROW_UP)){
			if((--GlobalSettings.m_nCurLevel) < 0)
				GlobalSettings.m_nCurLevel= 0;
			m_lblRoundValue.set(GlobalSettings.m_nCurLevel + 1);
		}else if(mngInput.isKeyboardClicked(MngInput.K_ARROW_DOWN)){
			if((++GlobalSettings.m_nCurLevel) > MAX_ROUNDS)
				GlobalSettings.m_nCurLevel= MAX_ROUNDS;
			m_lblRoundValue.set(GlobalSettings.m_nCurLevel + 1);
		}else if(mngInput.isKeyboardClicked(MngInput.K_ARROW_LEFT)){
			if((--GlobalSettings.m_nFrictionLevel) < 1)
				GlobalSettings.m_nFrictionLevel= 1;
			m_lblFrictionValue.set(GlobalSettings.m_nFrictionLevel);
		}else if(mngInput.isKeyboardClicked(MngInput.K_ARROW_RIGHT)){
			if((++GlobalSettings.m_nFrictionLevel) > MAX_FRICTION)
				GlobalSettings.m_nFrictionLevel= MAX_FRICTION;
			m_lblFrictionValue.set(GlobalSettings.m_nFrictionLevel);
		}
	}
}
