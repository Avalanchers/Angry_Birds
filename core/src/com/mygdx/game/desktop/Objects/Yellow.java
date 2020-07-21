package com.mygdx.game.desktop.Objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
public class Yellow {
	private Texture yellow;
	private Sprite syellow;
	public Yellow()
	{
		yellow=new Texture("yellow.png");
		syellow = new Sprite(yellow);
		syellow.setOrigin(0, 0);
		syellow.setScale(.18f, .18f);

	}
	public Sprite getSyellow() {
		return syellow;
	}public void setSyellow(Sprite syellow) {
		this.syellow = syellow;
	}public Texture getYellow() {
		return yellow;
	}public void setYellow(Texture yellow) {
		this.yellow = yellow;
	}
}
