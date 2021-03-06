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


public class DesignCtxGameDebug{
	public static void load(Context p_ctxUnder){
		/*DATA_BACKGROUND_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS*/
		/*DATA:0|Background|Back_Table00|/res/Back/BackGame00.png|0|50|10|1|*/
		Background backBack_Table00= new Background("/res/Back/BackGame00.png");
		backBack_Table00.setTextID("Back_Table00");
		backBack_Table00.setPos(0, 50, 10);
		backBack_Table00.load();
		p_ctxUnder.addChild(backBack_Table00, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:1|com.bianisoft.games.pool.SprHole|Spr_Hole1|/res/Sprite/Holes.png|-220|-100|9|1|2|0|3|Quarters|4|0.0|Halfs|4|0.0|Full|1|0.0|*/
		com.bianisoft.games.pool.SprHole sprSpr_Hole1= new com.bianisoft.games.pool.SprHole("/res/Sprite/Holes.png");
		sprSpr_Hole1.setTextID("Spr_Hole1");
		sprSpr_Hole1.setPos(-220, -100, 9);
		sprSpr_Hole1.addState(sprSpr_Hole1.new State("Quarters", 4, 0.0f));
		sprSpr_Hole1.addState(sprSpr_Hole1.new State("Halfs", 4, 0.0f));
		sprSpr_Hole1.addState(sprSpr_Hole1.new State("Full", 1, 0.0f));
		sprSpr_Hole1.load();
		sprSpr_Hole1.setCurState(2);
		sprSpr_Hole1.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_Hole1, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:2|com.bianisoft.games.pool.SprHole|Spr_Hole2|/res/Sprite/Holes.png|0|-120|9|1|1|0|3|Quarters|4|0.0|Halfs|4|0.0|Full|1|0.0|*/
		com.bianisoft.games.pool.SprHole sprSpr_Hole2= new com.bianisoft.games.pool.SprHole("/res/Sprite/Holes.png");
		sprSpr_Hole2.setTextID("Spr_Hole2");
		sprSpr_Hole2.setPos(0, -120, 9);
		sprSpr_Hole2.addState(sprSpr_Hole2.new State("Quarters", 4, 0.0f));
		sprSpr_Hole2.addState(sprSpr_Hole2.new State("Halfs", 4, 0.0f));
		sprSpr_Hole2.addState(sprSpr_Hole2.new State("Full", 1, 0.0f));
		sprSpr_Hole2.load();
		sprSpr_Hole2.setCurState(1);
		sprSpr_Hole2.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_Hole2, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:3|com.bianisoft.games.pool.SprHole|Spr_Hole3|/res/Sprite/Holes.png|220|-100|9|1|2|0|3|Quarters|4|0.0|Halfs|4|0.0|Full|1|0.0|*/
		com.bianisoft.games.pool.SprHole sprSpr_Hole3= new com.bianisoft.games.pool.SprHole("/res/Sprite/Holes.png");
		sprSpr_Hole3.setTextID("Spr_Hole3");
		sprSpr_Hole3.setPos(220, -100, 9);
		sprSpr_Hole3.addState(sprSpr_Hole3.new State("Quarters", 4, 0.0f));
		sprSpr_Hole3.addState(sprSpr_Hole3.new State("Halfs", 4, 0.0f));
		sprSpr_Hole3.addState(sprSpr_Hole3.new State("Full", 1, 0.0f));
		sprSpr_Hole3.load();
		sprSpr_Hole3.setCurState(2);
		sprSpr_Hole3.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_Hole3, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:4|com.bianisoft.games.pool.SprHole|Spr_Hole4|/res/Sprite/Holes.png|220|200|9|1|2|0|3|Quarters|4|0.0|Halfs|4|0.0|Full|1|0.0|*/
		com.bianisoft.games.pool.SprHole sprSpr_Hole4= new com.bianisoft.games.pool.SprHole("/res/Sprite/Holes.png");
		sprSpr_Hole4.setTextID("Spr_Hole4");
		sprSpr_Hole4.setPos(220, 200, 9);
		sprSpr_Hole4.addState(sprSpr_Hole4.new State("Quarters", 4, 0.0f));
		sprSpr_Hole4.addState(sprSpr_Hole4.new State("Halfs", 4, 0.0f));
		sprSpr_Hole4.addState(sprSpr_Hole4.new State("Full", 1, 0.0f));
		sprSpr_Hole4.load();
		sprSpr_Hole4.setCurState(2);
		sprSpr_Hole4.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_Hole4, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:5|com.bianisoft.games.pool.SprHole|Spr_Hole5|/res/Sprite/Holes.png|0|220|9|1|1|2|3|Quarters|4|0.0|Halfs|4|0.0|Full|1|0.0|*/
		com.bianisoft.games.pool.SprHole sprSpr_Hole5= new com.bianisoft.games.pool.SprHole("/res/Sprite/Holes.png");
		sprSpr_Hole5.setTextID("Spr_Hole5");
		sprSpr_Hole5.setPos(0, 220, 9);
		sprSpr_Hole5.addState(sprSpr_Hole5.new State("Quarters", 4, 0.0f));
		sprSpr_Hole5.addState(sprSpr_Hole5.new State("Halfs", 4, 0.0f));
		sprSpr_Hole5.addState(sprSpr_Hole5.new State("Full", 1, 0.0f));
		sprSpr_Hole5.load();
		sprSpr_Hole5.setCurState(1);
		sprSpr_Hole5.setCurFrame(2);
		p_ctxUnder.addChild(sprSpr_Hole5, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:6|com.bianisoft.games.pool.SprHole|Spr_Hole6|/res/Sprite/Holes.png|-220|200|9|1|2|0|3|Quarters|4|0.0|Halfs|4|0.0|Full|1|0.0|*/
		com.bianisoft.games.pool.SprHole sprSpr_Hole6= new com.bianisoft.games.pool.SprHole("/res/Sprite/Holes.png");
		sprSpr_Hole6.setTextID("Spr_Hole6");
		sprSpr_Hole6.setPos(-220, 200, 9);
		sprSpr_Hole6.addState(sprSpr_Hole6.new State("Quarters", 4, 0.0f));
		sprSpr_Hole6.addState(sprSpr_Hole6.new State("Halfs", 4, 0.0f));
		sprSpr_Hole6.addState(sprSpr_Hole6.new State("Full", 1, 0.0f));
		sprSpr_Hole6.load();
		sprSpr_Hole6.setCurState(2);
		sprSpr_Hole6.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_Hole6, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:7|com.bianisoft.games.pool.SprBall|Spr_BallWhite|/res/Sprite/Ball.png|123|-20|8|1|1|0|2|BallsOthers|7|0.0|BallWhite|1|0.0|*/
		com.bianisoft.games.pool.SprBall sprSpr_BallWhite= new com.bianisoft.games.pool.SprBall("/res/Sprite/Ball.png");
		sprSpr_BallWhite.setTextID("Spr_BallWhite");
		sprSpr_BallWhite.setPos(123, -20, 8);
		sprSpr_BallWhite.addState(sprSpr_BallWhite.new State("BallsOthers", 7, 0.0f));
		sprSpr_BallWhite.addState(sprSpr_BallWhite.new State("BallWhite", 1, 0.0f));
		sprSpr_BallWhite.load();
		sprSpr_BallWhite.setCurState(1);
		sprSpr_BallWhite.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_BallWhite, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:8|com.bianisoft.games.pool.SprBall|Spr_Ball1|/res/Sprite/Ball.png|183|-70|8|1|0|0|2|BallsOthers|7|0.0|BallWhite|1|0.0|*/
		com.bianisoft.games.pool.SprBall sprSpr_Ball1= new com.bianisoft.games.pool.SprBall("/res/Sprite/Ball.png");
		sprSpr_Ball1.setTextID("Spr_Ball1");
		sprSpr_Ball1.setPos(183, -70, 8);
		sprSpr_Ball1.addState(sprSpr_Ball1.new State("BallsOthers", 7, 0.0f));
		sprSpr_Ball1.addState(sprSpr_Ball1.new State("BallWhite", 1, 0.0f));
		sprSpr_Ball1.load();
		sprSpr_Ball1.setCurState(0);
		sprSpr_Ball1.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_Ball1, false, false);

		/*DATA_BACKGROUND_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS*/
		/*DATA:9|Background|Back_Panel|/res/Back/BackGamePanel.png|0|-200|5|1|*/
		Background backBack_Panel= new Background("/res/Back/BackGamePanel.png");
		backBack_Panel.setTextID("Back_Panel");
		backBack_Panel.setPos(0, -200, 5);
		backBack_Panel.load();
		p_ctxUnder.addChild(backBack_Panel, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:10|com.bianisoft.games.pool.SprSelector|Spr_GameSelector|/res/Sprite/OtherBalls.png|-260|-230|4|1|1|0|3|PowerGauge|1|0.0|Selector|1|0.0|Shots|1|0.0|*/
		com.bianisoft.games.pool.SprSelector sprSpr_GameSelector= new com.bianisoft.games.pool.SprSelector("/res/Sprite/OtherBalls.png");
		sprSpr_GameSelector.setTextID("Spr_GameSelector");
		sprSpr_GameSelector.setPos(-260, -230, 4);
		sprSpr_GameSelector.addState(sprSpr_GameSelector.new State("PowerGauge", 1, 0.0f));
		sprSpr_GameSelector.addState(sprSpr_GameSelector.new State("Selector", 1, 0.0f));
		sprSpr_GameSelector.addState(sprSpr_GameSelector.new State("Shots", 1, 0.0f));
		sprSpr_GameSelector.load();
		sprSpr_GameSelector.setCurState(1);
		sprSpr_GameSelector.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_GameSelector, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:11|com.bianisoft.games.pool.SprPowerGauge|Spr_GamePowerGauge|/res/Sprite/OtherBalls.png|90|-190|4|1|0|0|3|PowerGauge|1|0.0|Selector|1|0.0|Shots|1|0.0|*/
		com.bianisoft.games.pool.SprPowerGauge sprSpr_GamePowerGauge= new com.bianisoft.games.pool.SprPowerGauge("/res/Sprite/OtherBalls.png");
		sprSpr_GamePowerGauge.setTextID("Spr_GamePowerGauge");
		sprSpr_GamePowerGauge.setPos(90, -190, 4);
		sprSpr_GamePowerGauge.addState(sprSpr_GamePowerGauge.new State("PowerGauge", 1, 0.0f));
		sprSpr_GamePowerGauge.addState(sprSpr_GamePowerGauge.new State("Selector", 1, 0.0f));
		sprSpr_GamePowerGauge.addState(sprSpr_GamePowerGauge.new State("Shots", 1, 0.0f));
		sprSpr_GamePowerGauge.load();
		sprSpr_GamePowerGauge.setCurState(0);
		sprSpr_GamePowerGauge.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_GamePowerGauge, false, false);

		/*DATA_CUSTOM_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:12|com.bianisoft.games.pool.SprShots|Spr_GameShots|/res/Sprite/OtherBalls.png|170|-230|4|1|2|0|3|PowerGauge|1|0.0|Selector|1|0.0|Shots|1|0.0|*/
		com.bianisoft.games.pool.SprShots sprSpr_GameShots= new com.bianisoft.games.pool.SprShots("/res/Sprite/OtherBalls.png");
		sprSpr_GameShots.setTextID("Spr_GameShots");
		sprSpr_GameShots.setPos(170, -230, 4);
		sprSpr_GameShots.addState(sprSpr_GameShots.new State("PowerGauge", 1, 0.0f));
		sprSpr_GameShots.addState(sprSpr_GameShots.new State("Selector", 1, 0.0f));
		sprSpr_GameShots.addState(sprSpr_GameShots.new State("Shots", 1, 0.0f));
		sprSpr_GameShots.load();
		sprSpr_GameShots.setCurState(2);
		sprSpr_GameShots.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_GameShots, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:13|Label|Lbl_GamePlayer1Score|/res/Font/FreeSerif.ttf|-285|-230|4|1|20|1|0|false|0|-10|10|20|*/
		Label lblLbl_GamePlayer1Score= new Label("/res/Font/FreeSerif.ttf", 20, "1", 0, false, new Rectangle(0, -10, 10, 20));
		lblLbl_GamePlayer1Score.setTextID("Lbl_GamePlayer1Score");
		lblLbl_GamePlayer1Score.setPos(-285, -230, 4);
		lblLbl_GamePlayer1Score.load();
		p_ctxUnder.addChild(lblLbl_GamePlayer1Score, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:14|Label|Lbl_GamePlayer2Score|/res/Font/FreeSerif.ttf|-285|-210|4|1|20|2|0|false|0|-10|10|20|*/
		Label lblLbl_GamePlayer2Score= new Label("/res/Font/FreeSerif.ttf", 20, "2", 0, false, new Rectangle(0, -10, 10, 20));
		lblLbl_GamePlayer2Score.setTextID("Lbl_GamePlayer2Score");
		lblLbl_GamePlayer2Score.setPos(-285, -210, 4);
		lblLbl_GamePlayer2Score.load();
		p_ctxUnder.addChild(lblLbl_GamePlayer2Score, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:15|Label|Lbl_GameHiScore|/res/Font/FreeSerif.ttf|-285|-190|4|1|20|Hi.|0|false|0|-10|25|20|*/
		Label lblLbl_GameHiScore= new Label("/res/Font/FreeSerif.ttf", 20, "Hi.", 0, false, new Rectangle(0, -10, 25, 20));
		lblLbl_GameHiScore.setTextID("Lbl_GameHiScore");
		lblLbl_GameHiScore.setPos(-285, -190, 4);
		lblLbl_GameHiScore.load();
		p_ctxUnder.addChild(lblLbl_GameHiScore, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:16|Label|Lbl_GameHiScoreValue|/res/Font/FreeSerif.ttf|-100|-190|4|1|20|0|2|false|-150|-10|150|20|*/
		Label lblLbl_GameHiScoreValue= new Label("/res/Font/FreeSerif.ttf", 20, "0", 2, false, new Rectangle(-150, -10, 150, 20));
		lblLbl_GameHiScoreValue.setTextID("Lbl_GameHiScoreValue");
		lblLbl_GameHiScoreValue.setPos(-100, -190, 4);
		lblLbl_GameHiScoreValue.load();
		p_ctxUnder.addChild(lblLbl_GameHiScoreValue, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:17|Label|Lbl_GamePlayer2ScoreValue|/res/Font/FreeSerif.ttf|-100|-210|4|1|20|0|2|false|-150|-10|150|20|*/
		Label lblLbl_GamePlayer2ScoreValue= new Label("/res/Font/FreeSerif.ttf", 20, "0", 2, false, new Rectangle(-150, -10, 150, 20));
		lblLbl_GamePlayer2ScoreValue.setTextID("Lbl_GamePlayer2ScoreValue");
		lblLbl_GamePlayer2ScoreValue.setPos(-100, -210, 4);
		lblLbl_GamePlayer2ScoreValue.load();
		p_ctxUnder.addChild(lblLbl_GamePlayer2ScoreValue, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:18|Label|Lbl_GamePlayer1ScoreValue|/res/Font/FreeSerif.ttf|-100|-230|4|1|20|0|2|false|-150|-10|150|20|*/
		Label lblLbl_GamePlayer1ScoreValue= new Label("/res/Font/FreeSerif.ttf", 20, "0", 2, false, new Rectangle(-150, -10, 150, 20));
		lblLbl_GamePlayer1ScoreValue.setTextID("Lbl_GamePlayer1ScoreValue");
		lblLbl_GamePlayer1ScoreValue.setPos(-100, -230, 4);
		lblLbl_GamePlayer1ScoreValue.load();
		p_ctxUnder.addChild(lblLbl_GamePlayer1ScoreValue, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:19|Label|Lbl_GameNbBalls|/res/Font/FreeSerif.ttf|-85|-200|4|1|20|# Balls|0|false|0|-10|75|20|*/
		Label lblLbl_GameNbBalls= new Label("/res/Font/FreeSerif.ttf", 20, "# Balls", 0, false, new Rectangle(0, -10, 75, 20));
		lblLbl_GameNbBalls.setTextID("Lbl_GameNbBalls");
		lblLbl_GameNbBalls.setPos(-85, -200, 4);
		lblLbl_GameNbBalls.load();
		p_ctxUnder.addChild(lblLbl_GameNbBalls, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:20|Label|Lbl_GameNbBallsValue|/res/Font/FreeSerif.ttf|60|-200|4|1|20|3|2|false|-20|-10|20|20|*/
		Label lblLbl_GameNbBallsValue= new Label("/res/Font/FreeSerif.ttf", 20, "3", 2, false, new Rectangle(-20, -10, 20, 20));
		lblLbl_GameNbBallsValue.setTextID("Lbl_GameNbBallsValue");
		lblLbl_GameNbBallsValue.setPos(60, -200, 4);
		lblLbl_GameNbBallsValue.load();
		p_ctxUnder.addChild(lblLbl_GameNbBallsValue, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:21|Label|Lbl_GameStage|/res/Font/FreeSerif.ttf|-85|-220|4|1|20|Stage|0|false|0|-10|75|20|*/
		Label lblLbl_GameStage= new Label("/res/Font/FreeSerif.ttf", 20, "Stage", 0, false, new Rectangle(0, -10, 75, 20));
		lblLbl_GameStage.setTextID("Lbl_GameStage");
		lblLbl_GameStage.setPos(-85, -220, 4);
		lblLbl_GameStage.load();
		p_ctxUnder.addChild(lblLbl_GameStage, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:22|Label|Lbl_GameStageValue|/res/Font/FreeSerif.ttf|60|-220|4|1|20|1|2|false|-20|-10|20|20|*/
		Label lblLbl_GameStageValue= new Label("/res/Font/FreeSerif.ttf", 20, "1", 2, false, new Rectangle(-20, -10, 20, 20));
		lblLbl_GameStageValue.setTextID("Lbl_GameStageValue");
		lblLbl_GameStageValue.setPos(60, -220, 4);
		lblLbl_GameStageValue.load();
		p_ctxUnder.addChild(lblLbl_GameStageValue, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:23|Label|Lbl_GameShots|/res/Font/FreeSerif.ttf|75|-230|4|1|20|# Shots|0|false|0|-10|75|20|*/
		Label lblLbl_GameShots= new Label("/res/Font/FreeSerif.ttf", 20, "# Shots", 0, false, new Rectangle(0, -10, 75, 20));
		lblLbl_GameShots.setTextID("Lbl_GameShots");
		lblLbl_GameShots.setPos(75, -230, 4);
		lblLbl_GameShots.load();
		p_ctxUnder.addChild(lblLbl_GameShots, false, false);

		/*DATA_LABEL_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|FONT_SIZE|TEXT|ALIGNMENT|MULTILINE|REC_LEFT|REC_TOP|REC_WIDTH|RECT_HEIGHT*/
		/*DATA:24|Label|Lbl_GamePowerGauge|/res/Font/FreeSerif.ttf|75|-210|4|1|20|Power Gauge|0|false|0|-10|125|20|*/
		Label lblLbl_GamePowerGauge= new Label("/res/Font/FreeSerif.ttf", 20, "Power Gauge", 0, false, new Rectangle(0, -10, 125, 20));
		lblLbl_GamePowerGauge.setTextID("Lbl_GamePowerGauge");
		lblLbl_GamePowerGauge.setPos(75, -210, 4);
		lblLbl_GamePowerGauge.load();
		p_ctxUnder.addChild(lblLbl_GamePowerGauge, false, false);

		/*DATA_SPRITE_TEMPLATE:#|CLASS_ID|NAME|RESSOURCE_NAME|POS_X|POS_Y|POS_Z|DEEPNESS|DEFAULT_STATE|DEFAULT_FRAME|NB_STATES|STATE_NAME|STATE_NB_FRAMES|STATE_SPEED*/
		/*DATA:25|Sprite|Spr_GameAim|/res/Sprite/Aim.png|0|0|0|1|0|0|1|Idle|1|0.0|*/
		Sprite sprSpr_GameAim= new Sprite("/res/Sprite/Aim.png");
		sprSpr_GameAim.setTextID("Spr_GameAim");
		sprSpr_GameAim.setPos(0, 0, 0);
		sprSpr_GameAim.addState(sprSpr_GameAim.new State("Idle", 1, 0.0f));
		sprSpr_GameAim.load();
		sprSpr_GameAim.setCurState(0);
		sprSpr_GameAim.setCurFrame(0);
		p_ctxUnder.addChild(sprSpr_GameAim, false, false);

	}
}
