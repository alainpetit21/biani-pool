package com.bianisoft.games.pool;


//Bianisoft imports
import com.bianisoft.engine.helper.Random;


public class GlobalSettings{
	public static Random	m_objRandom=	 new Random();

	public static boolean	m_bReInit		= true;
	public static int		m_nHighScore	= 5000;
	public static int		m_nCurLevel		= 0;
	public static int		m_nNbPlayer		= 1;
	public static boolean	m_isAgainstCPU	= false;
	public static int		m_nFrictionLevel= 32;



}
