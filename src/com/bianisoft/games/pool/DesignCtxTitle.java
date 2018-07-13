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


public class DesignCtxTitle{
	public static void load(Context p_ctxUnder){
		/*DATA_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:0|Sprite|Spr_LblTitle|/res/Sprite/Title.png|20|-150|0|1|0|0|1|Idle|1|0.0|*/
		Sprite sprSpr_LblTitle= new Sprite("/res/Sprite/Title.png");
		sprSpr_LblTitle.setTextID("Spr_LblTitle");
		sprSpr_LblTitle.setPos(20, -150, 0);
		sprSpr_LblTitle.addState(sprSpr_LblTitle.new State("Idle", 1, 0.0f));
		sprSpr_LblTitle.load();
		sprSpr_LblTitle.setCurState(0);
		sprSpr_LblTitle.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_LblTitle, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:1|Label|Lbl_TitleHiScore|/res/Font/FreeSerif.ttf|-50|-230|0|1|25|Hi-Score|1|false|-295|-12|590|25|*/
		Label lblLbl_TitleHiScore= new Label("/res/Font/FreeSerif.ttf", 25, "Hi-Score", 1, false, new Rectangle(-295, -12, 590, 25));
		lblLbl_TitleHiScore.setTextID("Lbl_TitleHiScore");
		lblLbl_TitleHiScore.setPos(-50, -230, 0);
		lblLbl_TitleHiScore.load();
		p_ctxUnder.addChild(lblLbl_TitleHiScore, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:2|Label|Lbl_TitleHiScoreValue|/res/Font/FreeSerif.ttf|50|-230|0|1|25|0|1|false|-295|-12|590|25|*/
		Label lblLbl_TitleHiScoreValue= new Label("/res/Font/FreeSerif.ttf", 25, "0", 1, false, new Rectangle(-295, -12, 590, 25));
		lblLbl_TitleHiScoreValue.setTextID("Lbl_TitleHiScoreValue");
		lblLbl_TitleHiScoreValue.setPos(50, -230, 0);
		lblLbl_TitleHiScoreValue.load();
		p_ctxUnder.addChild(lblLbl_TitleHiScoreValue, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:3|Label|Lbl_TitlePressStart|/res/Font/FreeSerif.ttf|0|0|0|1|25|Press Start to Play|1|false|-320|-12|640|25|*/
		Label lblLbl_TitlePressStart= new Label("/res/Font/FreeSerif.ttf", 25, "Press Start to Play", 1, false, new Rectangle(-320, -12, 640, 25));
		lblLbl_TitlePressStart.setTextID("Lbl_TitlePressStart");
		lblLbl_TitlePressStart.setPos(0, 0, 0);
		lblLbl_TitlePressStart.load();
		p_ctxUnder.addChild(lblLbl_TitlePressStart, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:4|Label|Lbl_Credits|/res/Font/FreeSerif.ttf|0|100|0|1|25|™ and © 1985, 1987 Pony inc.\nPresented by FCI inc.\n\nJava remake by \nBianisoft|1|true|-320|-75|640|150|*/
		Label lblLbl_Credits= new Label("/res/Font/FreeSerif.ttf", 25, "™ and © 1985, 1987 Pony inc.\nPresented by FCI inc.\n\nJava remake by \nBianisoft", 1, true, new Rectangle(-320, -75, 640, 150));
		lblLbl_Credits.setTextID("Lbl_Credits");
		lblLbl_Credits.setPos(0, 100, 0);
		lblLbl_Credits.load();
		p_ctxUnder.addChild(lblLbl_Credits, false, false);

	}
}
