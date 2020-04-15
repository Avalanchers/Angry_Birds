package com.mygdx.game.desktop.Objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
public class Ground {
	private Texture Ground;
	private Sprite sground;
	public Ground()
	{
		Ground =new Texture("ground.png");
		sground = new Sprite(Ground);
		sground.setOrigin(0, 0);
	}public Texture getGround() {
		return Ground;
	}public Sprite getSground() {
		return sground;
	}public void setGround(Texture ground) {
		Ground = ground;
	}public void setSground(Sprite sground) {
		this.sground = sground;
	}
}
