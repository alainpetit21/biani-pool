package com.bianisoft.games.pool;


//Bianisoft imports
import com.bianisoft.engine.Applet;


public class AppletPool extends Applet{
	public static final int IDCTX_TITLE		= 0x0;
	public static final int IDCTX_OPTION	= 0x1;
	public static final int IDCTX_GAME		= 0x2;
	public static final int IDCTX_GAME_OVER	= 0x3;


	public AppletPool(){
		super("Pool", 640, 480);
	}

	public String getVersion(){
		return "1.2";
	}

	public void load(){
		addContext(new CtxTitle());
		addContext(new CtxOption());
		addContext(new CtxGame());
		addContext(new CtxGameOver());
		setCurContext(IDCTX_TITLE);
	}
}