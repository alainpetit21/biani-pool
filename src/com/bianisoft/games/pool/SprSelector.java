package com.bianisoft.games.pool;


//Bianisoft imports
import com.bianisoft.engine.Obj;
import com.bianisoft.engine.sprites.Sprite;


public class SprSelector extends Sprite{
	public static final int		IDCLASS_Selector	= (1<<19) | Obj.IDCLASS_GAME | Obj.IDCLASS_Sprite;
	public static final int[][]	POS_CURSOR	= {{-270, -230}, {-270, -210}};

	public int	m_nCurPlayer= 0;
	float m_fColor;
	float m_fIncColor;


	public SprSelector(String p_stResFile)	{super(p_stResFile);	init();}
//	public SprSelector()					{super();				init();}

	public void init(){
		setClassID(IDCLASS_Selector, "IDCLASS_Selector");

		m_fColor= 0;
		m_fIncColor= 0.05f;
	}

	public int switchPlayer(){
		if(++m_nCurPlayer >= GlobalSettings.m_nNbPlayer)
			m_nCurPlayer= 0;

		moveTo(POS_CURSOR[m_nCurPlayer][0], POS_CURSOR[m_nCurPlayer][1], getPosZ(), getAngleX(), getAngleY(), getAngleZ(), 1000);

		return m_nCurPlayer;
	}

	public void manage(float p_fScaleFactor){
		super.manage(p_fScaleFactor);

		//Manage Filter Animation
		m_fColor+= m_fIncColor;
		if((m_fColor >= 1.0) || (m_fColor <= 0.0)){
			m_fIncColor*= -1;
		}
		setFilterColor(m_fColor, m_fColor, m_fColor, 1);
	}
}
