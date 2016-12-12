package royale.unit.impl;

import javafx.scene.Node;
import royale.Player;

public abstract class Unit {

	public double speed;
	public Node node;
	public Player player;
	
	public Unit(double speed, Player player) {
		this.speed = speed;
		this.player = player;
	}

	public abstract void move();

	public abstract Node deploy(double x, double y);

}

//this.x += (target.x > this.x) ? 1 : -1;
//this.y += (target.y > this.y) ? 1 : -1;
//c.setCenterX(this.x);
//c.setCenterY(this.y);