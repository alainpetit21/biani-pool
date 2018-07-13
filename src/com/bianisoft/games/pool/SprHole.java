package com.bianisoft.games.pool;


//Bianisoft imports
import com.bianisoft.engine.Obj;
import com.bianisoft.engine.sprites.Sprite;


public class SprHole extends Sprite{
	static final public int IDCLASS_Hole= (1<<17) | Obj.IDCLASS_GAME | Obj.IDCLASS_Sprite;


	public SprHole(String p_stResFile)	{super(p_stResFile);	init();}
//	public SprHole()					{super();				init();}

	public void init(){
		setClassID(IDCLASS_Hole, "IDCLASS_Hole");

		m_isCollidable	= true;
		m_fRadius	= 7;
	}
}
