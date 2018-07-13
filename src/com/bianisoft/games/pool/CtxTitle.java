package com.bianisoft.games.pool;


//Bianisoft imports
import com.bianisoft.engine.App;
import com.bianisoft.engine.labels.Label;
import com.bianisoft.engine.Context;
import com.bianisoft.engine.sprites.Sprite;
//import com.bianisoft.engine.music.Music;
import com.bianisoft.engine.manager.MngInput;


public class CtxTitle extends Context{
	private class MyTitleSprite{
		float	m_fRedInc;
		float	m_fGreenInc;
		float	m_fBlueInc;
		Sprite	m_spr;

		public MyTitleSprite(Sprite p_spr){
			m_spr= p_spr;

			m_spr.m_colorFilterRed= 0.75f;
			m_spr.m_colorFilterGreen= 0.5f;
			m_spr.m_colorFilterBlue= 0.25f;

			if(m_spr.m_colorFilterRed >= 1)		m_spr.m_colorFilterRed= 1;
			if(m_spr.m_colorFilterGreen >= 1)	m_spr.m_colorFilterGreen= 1;
			if(m_spr.m_colorFilterBlue >= 1)	m_spr.m_colorFilterBlue= 1;

			m_fRedInc= 0.002f;
			m_fGreenInc= 0.002f;
			m_fBlueInc= 0.002f;
		}

		public void manage(double p_fScaleFactor){
			m_spr.m_colorFilterRed+= m_fRedInc;
			if((m_spr.m_colorFilterRed >= 1.0) || (m_spr.m_colorFilterRed <= 0.25)){
				m_fRedInc*= -1;
			}

			m_spr.m_colorFilterGreen+= m_fGreenInc;
			if((m_spr.m_colorFilterGreen >= 1.0) || (m_spr.m_colorFilterGreen <= 0.25)){
				m_fGreenInc*= -1;
			}
			
			m_spr.m_colorFilterBlue+= m_fBlueInc;
			if((m_spr.m_colorFilterBlue >= 1.0) || (m_spr.m_colorFilterBlue <= 0.25)){
				m_fBlueInc*= -1;
			}
		}
	};

	private class MyPressStartLabel{
		float	m_fRedInc;
		float	m_fGreenInc;
		float	m_fBlueInc;
		Label	m_lblPressStart;

		public MyPressStartLabel(Label p_lbl){
			m_lblPressStart= p_lbl;
			m_lblPressStart.m_colorFilterRed= 0.5f;
			m_lblPressStart.m_colorFilterGreen= 0;
			m_lblPressStart.m_colorFilterBlue= 0;

			m_fRedInc	= 0.005f;
			m_fGreenInc	= 0.01f;
			m_fBlueInc	= 0.005f;
		}

		public void manage(double f){
			m_lblPressStart.m_colorFilterRed+= m_fRedInc;
			if((m_lblPressStart.m_colorFilterRed >= 1.0) || (m_lblPressStart.m_colorFilterRed <= 0.5)){
				m_fRedInc*= -1;
			}

			m_lblPressStart.m_colorFilterGreen+= m_fGreenInc;
			if((m_lblPressStart.m_colorFilterGreen >= 1.0) || (m_lblPressStart.m_colorFilterGreen <= 0.0)){
				m_fGreenInc*= -1;
			}

			m_lblPressStart.m_colorFilterBlue+= m_fBlueInc;
			if((m_lblPressStart.m_colorFilterBlue >= 0.5) || (m_lblPressStart.m_colorFilterBlue <= 0.0)){
				m_fBlueInc*= -1;
			}
		}
	};

//	Music m_musicThisContext;
	MyPressStartLabel	m_lblPressStart;
	MyTitleSprite		m_sprTitle;


	public void activate(){
		super.activate();

		DesignCtxTitle.load(this);

		m_lblPressStart	= new MyPressStartLabel((Label)findByTextID("Lbl_TitlePressStart"));
		m_sprTitle		= new MyTitleSprite((Sprite)findByTextID("Spr_LblTitle"));
		((Label)findByTextID("Lbl_TitleHiScoreValue")).set(GlobalSettings.m_nHighScore);

//		m_musicThisContext= Music.create(Music.TYPE_EMU, "/res/Music/LunarPool.nsf", 0);
//		m_musicThisContext.load();
//		m_musicThisContext.play();
	}

	public void deActivate(){
		super.deActivate();
//		m_musicThisContext.stop();
	}
	
	public void manage(float p_fTimeScaleFactor){
		super.manage(p_fTimeScaleFactor);

		m_lblPressStart.manage(p_fTimeScaleFactor);
		m_sprTitle.manage(p_fTimeScaleFactor);

		MngInput mngInput= MngInput.get();

		if(mngInput.isKeyboardClicked(MngInput.K_ENTER)){
			App.g_theApp.setCurContext(AppPool.IDCTX_OPTION);
		}
	}
}
