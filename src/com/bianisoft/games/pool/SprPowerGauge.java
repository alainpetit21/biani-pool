package com.bianisoft.games.pool;


//Bianisoft imports
import com.bianisoft.engine.sprites.Sprite;
import com.bianisoft.engine.Obj;


public class SprPowerGauge extends Sprite{
	static final public int IDCLASS_PowerGauge	= (1<<18) | Obj.IDCLASS_GAME | Obj.IDCLASS_Sprite;

	boolean	m_canMove;
	float	m_fCptPower;
	float	m_fIncPower;

	
	public SprPowerGauge(String p_stResFile)	{super(p_stResFile);	init();}
//	public SprPowerGauge()						{super();				init();}

	public void init(){
		setClassID(IDCLASS_PowerGauge, "IDCLASS_PowerGauge");

		m_canMove	= true;
		m_fCptPower= 0;
		m_fIncPower= 0.15f;
	}

	public void draw(){
		float posX= getPosX();
		float posY= getPosY();
		
		setFilterColor(1, 1, 1, 1);
		for(int i= 0; i < (int)m_fCptPower; ++i){
			super.draw();
			setPosX(getPosX() + 16);
		}

		setFilterColor(0, 0, 0, 1);
		for(int i= (int)m_fCptPower; i < 10; ++i){
			super.draw();
			setPosX(getPosX() + 16);
		}
				
		setPosX(posX);
		setPosY(posY);
	}

	public void manage(float f){
		super.manage(f);

		if(!m_canMove)
			return;
		
		m_fCptPower+= m_fIncPower;

		if(m_fCptPower >= 11){
			m_fCptPower= 10.9f;
			m_fIncPower*= -1;
		}
		if(m_fCptPower < 0){
			m_fCptPower= 0;
			m_fIncPower*= -1;
		}
	}
}
