package com.bianisoft.games.pool;


//LWJGL library imports
import org.lwjgl.util.Rectangle;

//Bianisoft imports
import com.bianisoft.engine.Context;
import com.bianisoft.engine.backgrounds.Background;
import com.bianisoft.engine.labels.Label;
import com.bianisoft.engine.sprites.Sprite;
import com.bianisoft.engine.sprites.Sprite.State;
import com.bianisoft.engine.sprites.Button;


public class DesignCtxGameOver{
	public static void load(Context p_ctxUnder){
		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:0|Label|Lbl_GameOver|/res/Font/FreeSerif.ttf|0|0|0|1|25|Game Over|1|false|-320|-12|640|25|*/
		Label lblLbl_GameOver= new Label("/res/Font/FreeSerif.ttf", 25, "Game Over", 1, false, new Rectangle(-320, -12, 640, 25));
		lblLbl_GameOver.setTextID("Lbl_GameOver");
		lblLbl_GameOver.setPos(0, 0, 0);
		lblLbl_GameOver.load();
		p_ctxUnder.addChild(lblLbl_GameOver, false, false);

	}
}
