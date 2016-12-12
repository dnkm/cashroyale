package royale.unit.impl;

import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import royale.Player;

public class Tower extends Unit {
	
	public static final int TOWER_WIDTH = 50;
	public static final int TOWER_HEIGHT = 50;
	
	public Tower(Player player) {
		super(0, player);
	}

	@Override
	public Node deploy(double x, double y) {
		Rectangle r = new Rectangle(x - TOWER_WIDTH/2, y - TOWER_HEIGHT/2, TOWER_WIDTH, TOWER_HEIGHT);
		r.setFill(this.player.color);
		
		this.node = r;
		return this.node;
	}
	
	@Override
	public void move() {
		
	}
	
}
