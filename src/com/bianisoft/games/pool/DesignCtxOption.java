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


public class DesignCtxOption{
	public static void load(Context p_ctxUnder){
		/*DATA_BACKGROUND_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS*/
		/*DATA:0|Background|Back_Option|/res/Back/BackOption.png|0|0|10|1|*/
		Background backBack_Option= new Background("/res/Back/BackOption.png");
		backBack_Option.setTextID("Back_Option");
		backBack_Option.setPos(0, 0, 10);
		backBack_Option.load();
		p_ctxUnder.addChild(backBack_Option, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:1|com.bianisoft.games.pool.SprSelector|Spr_OptionSelector|/res/Sprite/OtherBalls.png|-110|-60|9|1|1|0|3|PowerGauge|1|0.0|Selector|1|0.0|Shots|1|0.0|*/
		com.bianisoft.games.pool.SprSelector sprSpr_OptionSelector= new com.bianisoft.games.pool.SprSelector("/res/Sprite/OtherBalls.png");
		sprSpr_OptionSelector.setTextID("Spr_OptionSelector");
		sprSpr_OptionSelector.setPos(-110, -60, 9);
		sprSpr_OptionSelector.addState(sprSpr_OptionSelector.new State("PowerGauge", 1, 0.0f));
		sprSpr_OptionSelector.addState(sprSpr_OptionSelector.new State("Selector", 1, 0.0f));
		sprSpr_OptionSelector.addState(sprSpr_OptionSelector.new State("Shots", 1, 0.0f));
		sprSpr_OptionSelector.load();
		sprSpr_OptionSelector.setCurState(1);
		sprSpr_OptionSelector.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_OptionSelector, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:2|Label|Lbl_OptionHiScore|/res/Font/FreeSerif.ttf|-50|-225|9|1|25|Hi-Score|1|false|-295|-12|590|25|*/
		Label lblLbl_OptionHiScore= new Label("/res/Font/FreeSerif.ttf", 25, "Hi-Score", 1, false, new Rectangle(-295, -12, 590, 25));
		lblLbl_OptionHiScore.setTextID("Lbl_OptionHiScore");
		lblLbl_OptionHiScore.setPos(-50, -225, 9);
		lblLbl_OptionHiScore.load();
		p_ctxUnder.addChild(lblLbl_OptionHiScore, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:3|Label|Lbl_OptionHiScoreValue|/res/Font/FreeSerif.ttf|50|-225|9|1|25|0|1|false|-295|-12|590|25|*/
		Label lblLbl_OptionHiScoreValue= new Label("/res/Font/FreeSerif.ttf", 25, "0", 1, false, new Rectangle(-295, -12, 590, 25));
		lblLbl_OptionHiScoreValue.setTextID("Lbl_OptionHiScoreValue");
		lblLbl_OptionHiScoreValue.setPos(50, -225, 9);
		lblLbl_OptionHiScoreValue.load();
		p_ctxUnder.addChild(lblLbl_OptionHiScoreValue, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:4|Label|Lbl_OptionControls|/res/Font/FreeSerif.ttf|0|-150|9|1|25|Up - Down : Change Rounds\nLeft - Right : Change Friction\nSelect : Change Players Play Type|1|true|-320|-37|640|75|*/
		Label lblLbl_OptionControls= new Label("/res/Font/FreeSerif.ttf", 25, "Up - Down : Change Rounds\nLeft - Right : Change Friction\nSelect : Change Players Play Type", 1, true, new Rectangle(-320, -37, 640, 75));
		lblLbl_OptionControls.setTextID("Lbl_OptionControls");
		lblLbl_OptionControls.setPos(0, -150, 9);
		lblLbl_OptionControls.load();
		p_ctxUnder.addChild(lblLbl_OptionControls, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:5|Label|Lbl_Option1Player|/res/Font/FreeSerif.ttf|-90|-60|9|1|25|1 Player|0|false|0|-12|100|25|*/
		Label lblLbl_Option1Player= new Label("/res/Font/FreeSerif.ttf", 25, "1 Player", 0, false, new Rectangle(0, -12, 100, 25));
		lblLbl_Option1Player.setTextID("Lbl_Option1Player");
		lblLbl_Option1Player.setPos(-90, -60, 9);
		lblLbl_Option1Player.load();
		p_ctxUnder.addChild(lblLbl_Option1Player, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:6|Label|Lbl_Option2Player|/res/Font/FreeSerif.ttf|-90|-15|9|1|25|2 Player|0|false|0|-12|100|25|*/
		Label lblLbl_Option2Player= new Label("/res/Font/FreeSerif.ttf", 25, "2 Player", 0, false, new Rectangle(0, -12, 100, 25));
		lblLbl_Option2Player.setTextID("Lbl_Option2Player");
		lblLbl_Option2Player.setPos(-90, -15, 9);
		lblLbl_Option2Player.load();
		p_ctxUnder.addChild(lblLbl_Option2Player, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:7|Label|Lbl_OptionVSPlayer|/res/Font/FreeSerif.ttf|-90|30|9|1|25|Vs. Computer|0|false|0|-12|150|25|*/
		Label lblLbl_OptionVSPlayer= new Label("/res/Font/FreeSerif.ttf", 25, "Vs. Computer", 0, false, new Rectangle(0, -12, 150, 25));
		lblLbl_OptionVSPlayer.setTextID("Lbl_OptionVSPlayer");
		lblLbl_OptionVSPlayer.setPos(-90, 30, 9);
		lblLbl_OptionVSPlayer.load();
		p_ctxUnder.addChild(lblLbl_OptionVSPlayer, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:8|Label|Lbl_OptionRound|/res/Font/FreeSerif.ttf|-90|125|9|1|25|Round|0|false|0|-12|100|25|*/
		Label lblLbl_OptionRound= new Label("/res/Font/FreeSerif.ttf", 25, "Round", 0, false, new Rectangle(0, -12, 100, 25));
		lblLbl_OptionRound.setTextID("Lbl_OptionRound");
		lblLbl_OptionRound.setPos(-90, 125, 9);
		lblLbl_OptionRound.load();
		p_ctxUnder.addChild(lblLbl_OptionRound, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:9|Label|Lbl_OptionFriction|/res/Font/FreeSerif.ttf|-90|170|9|1|25|Friction|0|false|0|-12|100|25|*/
		Label lblLbl_OptionFriction= new Label("/res/Font/FreeSerif.ttf", 25, "Friction", 0, false, new Rectangle(0, -12, 100, 25));
		lblLbl_OptionFriction.setTextID("Lbl_OptionFriction");
		lblLbl_OptionFriction.setPos(-90, 170, 9);
		lblLbl_OptionFriction.load();
		p_ctxUnder.addChild(lblLbl_OptionFriction, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:10|Label|Lbl_OptionFrictionValue|/res/Font/FreeSerif.ttf|100|170|9|1|25|32|2|false|-50|-12|50|25|*/
		Label lblLbl_OptionFrictionValue= new Label("/res/Font/FreeSerif.ttf", 25, "32", 2, false, new Rectangle(-50, -12, 50, 25));
		lblLbl_OptionFrictionValue.setTextID("Lbl_OptionFrictionValue");
		lblLbl_OptionFrictionValue.setPos(100, 170, 9);
		lblLbl_OptionFrictionValue.load();
		p_ctxUnder.addChild(lblLbl_OptionFrictionValue, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:11|Label|Lbl_OptionRoundValue|/res/Font/FreeSerif.ttf|100|125|9|1|25|1|2|false|-50|-12|50|25|*/
		Label lblLbl_OptionRoundValue= new Label("/res/Font/FreeSerif.ttf", 25, "1", 2, false, new Rectangle(-50, -12, 50, 25));
		lblLbl_OptionRoundValue.setTextID("Lbl_OptionRoundValue");
		lblLbl_OptionRoundValue.setPos(100, 125, 9);
		lblLbl_OptionRoundValue.load();
		p_ctxUnder.addChild(lblLbl_OptionRoundValue, false, false);

	}
}
