package com.bianisoft.games.pool;


//Bianisoft imports
import com.bianisoft.engine.App;
import com.bianisoft.engine.Context;
//import com.bianisoft.engine.music.Music;
import com.bianisoft.engine.Timer;
import com.bianisoft.engine.manager.MngInput;


public class CtxGameOver extends Context{
	private class TimerDelayKeyboard implements Timer.I_Callback{
		public void TimerEvent(Timer p_timer, Object p_objHint){
			m_canClick= true;
		}
	};


//	private Music	m_musicThisContext;
	private boolean	m_canClick= false;


	public void activate(){
		super.activate();

		DesignCtxGameOver.load(this);

//		m_musicThisContext= Music.create(Music.TYPE_EMU, "/res/Music/LunarPool.nsf", 6);
//		m_musicThisContext.load();
//		m_musicThisContext.play();

		m_canClick= false;
		addTimer(3000, new TimerDelayKeyboard(), this);
	}

	public void manage(float p_fTimeScaleFactor){
		super.manage(p_fTimeScaleFactor);

		if(!m_canClick)
			return;

		MngInput mngInput= MngInput.get();

		if(mngInput.isKeyboardClicked(MngInput.K_ENTER))
			App.g_theApp.setCurContext(AppPool.IDCTX_TITLE);
	}
}
