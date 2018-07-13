package com.bianisoft.games.pool;


//Bianisoft imports
import com.bianisoft.engine.sprites.Sprite;
import com.bianisoft.engine.Obj;


public class SprShots extends Sprite{
	static final public int IDCLASS_Shots	= (1<<20) | Obj.IDCLASS_GAME | Obj.IDCLASS_Sprite;

	public float m_fColor;
	public float m_fIncColor;
	public int m_nShotsLeft;


	public SprShots(String p_stResFile)	{super(p_stResFile);	init();}
//	public SprShots()					{super();				init();}

	public void init(){
		setClassID(IDCLASS_Shots, "IDCLASS_Shots");

		m_nShotsLeft= 3;
		m_fColor= 0;
		m_fIncColor= 0.05f;
	}

	public void reset(){
		m_nShotsLeft= 3;
	}

	public void manage(float p_fScaleFactor){
		super.manage(p_fScaleFactor);

		//Manage Filter Animation
		m_fColor+= m_fIncColor;
		if((m_fColor >= 1.0) || (m_fColor <= 0.0)){
			m_fIncColor*= -1;
		}
	}

	public void draw(){
		float posX= getPosX();

//		m_lblShots.draw();

		setFilterColor(m_fColor, m_fColor, m_fColor, 1);
		for(int i= 0; i < (int)m_nShotsLeft; ++i){
			super.draw();
			setPosX(getPosX() + 16);
		}
		setFilterColor(0, 0, 0, 1);
		for(int i= (int)m_nShotsLeft; i < 3; ++i){
			super.draw();
			setPosX(getPosX() + 16);
		}

		setPosX(posX);
	}
}
