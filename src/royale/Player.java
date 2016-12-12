package royale;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import royale.unit.impl.Tower;
import royale.unit.impl.Unit;

public class Player {

	public int energy;
	public Color color;
	
	public Tower[] towers;
	public Unit[] deck;
	public List<Unit> deployedUnits;
	
	public boolean isPlayer;
	
	public String name;
	
	// constructor
	public Player(String name, Color color, boolean isPlayer) {
		this.name = name;
		this.color = color;
		this.isPlayer = isPlayer;
		
		this.towers = new Tower[Constants.NUM_TOWERS];
		this.deck = new Unit[Constants.DECK_SIZE];
		this.deployedUnits = new ArrayList<>();
	}
	
	public void createTowers(Group root) {
		for(int i=0; i<Constants.NUM_TOWERS; i++) {
			double x = Constants.GAME_WIDTH / (Constants.NUM_TOWERS+1) * (i+1);
			double y = (this.isPlayer) ? Constants.REC1_Y1 + 50 : Constants.REC1_Y3 - 50;
			Tower t = new Tower(this);
			root.getChildren().add(t.deploy(x, y));
			this.towers[i] = t;
		}
	}
}







