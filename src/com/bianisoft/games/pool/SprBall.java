package com.bianisoft.games.pool;


//Bianisoft imports
import com.bianisoft.engine.Obj;
import com.bianisoft.engine.sprites.Sprite;


public class SprBall extends Sprite{
	static final public int IDCLASS_Ball= (1<<16) | Obj.IDCLASS_GAME | Obj.IDCLASS_Sprite;

	float m_fColor;
	float m_fIncColor;
	float m_fIncZoom;


	public SprBall(String p_stResFile)	{super(p_stResFile);	init();}

	public void init(){
		setClassID(IDCLASS_Ball, "IDCLASS_Ball");
		
		m_fRadius		= 11;
		m_isCollidable	= true;
		m_fColor= 0;
		m_fIncColor= 0.02f;
		m_nZoom= 0;
		super.show();
	}

	public void show(){
		super.show();
		m_nZoom= 0;
		m_fIncZoom= 0.02f;
	}

	public void hide(){
		m_fIncZoom= -0.02f;
	}

	public void resetAngle(){
		moveTo(getPosX(), getPosY(), getPosZ(), 0, 0, 0, 1000);
	}
	
	public void manage(float p_fScaleFactor){
		super.manage(p_fScaleFactor);

//		if(CtxGame.m_musicIntro.isPlaying())
//			return;

		//White Ball animation
		if(getCurState() == 1){
			m_fColor+= m_fIncColor;
			if((m_fColor >= 1.0) || (m_fColor <= 0.0)){
				m_fIncColor*= -1;
			}
			setFilterColor(m_fColor, m_fColor, m_fColor, 1);
		}

		//Zoom Appear animation
		m_nZoom+= m_fIncZoom;
		if(m_nZoom >= 1.0f){
			m_fIncZoom= 0.0f;
			m_nZoom= 1.0f;
		}else if(m_nZoom <= 0.0001f){
			m_fIncZoom= 0.0f;
			m_nZoom= 0.0f;
			super.hide();
		}

		//Rotation based on X velocity
		setAngleZ(getAngleZ() + getVelX()*2);
		if(getAngleZ() > 360)
			setAngleZ(getAngleZ() - 360);

		//Friction
		float len= (float)Math.sqrt((getVelX()*getVelX()) + (getVelY()*getVelY()));

		if(len > 0.0){
			setVelX(getVelX() / len);
			setVelY(getVelY() / len);

			len-= ((double)GlobalSettings.m_nFrictionLevel) / 2000.0;

			setVelX(getVelX() * len);
			setVelY(getVelY() * len);
		}

		//If movement is so small, put 0
		if(len < 0.1){
			setVelX(0);
			setVelY(0);
		}
	}
}
