package com.mygdx.game.desktop.Objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;

public class Background {
	private Texture tex;
	private Sprite sprite;
	public Background()
	{
    	tex =new Texture("background.png");
    	sprite = new Sprite(tex);
    	sprite.setOrigin(0, 0);
	}
	public Sprite getSprite() {
		return sprite;
	}public Texture getTex() {
		return tex;
	}public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}public void setTex(Texture tex) {
		this.tex = tex;
	}
}
