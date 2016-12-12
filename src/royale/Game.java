package royale;

import java.awt.Container;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Game extends Application {
	
	public Player[] players;
	public Scene scene;
	public Group root;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		players = new Player[2];
		players[0] = new Player("Player", Color.DEEPSKYBLUE, true);
		players[1] = new Player("Bot", Color.DEEPPINK, false);
		
		stage.setTitle("Cash Royale");
		root = new Group();
		scene = 
				new Scene(root, Constants.GAME_WIDTH, Constants.GAME_HEIGHT);
		stage.setScene(scene);
		
		setupLayout();

		players[0].createTowers(root);
		players[1].createTowers(root);
		
		new AnimationTimer() {
			
			@Override
			public void handle(long now) {
				//u1.move();
				//u2.move();
			}
		}.start();
		
		stage.show();
	}
	
	public void setupLayout() {
		scene.setFill(Color.BEIGE);
		
		Rectangle r1 = new Rectangle(0, 0, Constants.GAME_WIDTH, Constants.REC1_Y2);
		r1.setFill(Color.ANTIQUEWHITE);
		root.getChildren().add(r1);
		
		Rectangle r2 = new Rectangle(0, Constants.REC1_Y3, Constants.GAME_WIDTH, Constants.GAME_HEIGHT);
		r2.setFill(Color.DIMGRAY);
		root.getChildren().add(r2);
		
	}

}
