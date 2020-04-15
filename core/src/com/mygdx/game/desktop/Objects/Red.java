package com.mygdx.game.desktop.Objects;
import com.badlogic.gdx.graphics.g2d.*;

import aurelienribon.tweenengine.TweenAccessor;

import com.badlogic.gdx.graphics.*;
public class Red {
	private Texture red;
	private Sprite sred;
	public Red()
	{
		red = new Texture("red.png");
		sred = new Sprite(red);
		sred.setOrigin(0, 0);
		sred.setScale(.08f,.08f);
	}public Texture getRed() {
		return red;
	}public Sprite getSred() {
		return sred;
	}public void setRed(Texture red) {
		this.red = red;
	}public void setSred(Sprite sred) {
		this.sred = sred;
	}
}
