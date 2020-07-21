package com.mygdx.game.desktop.Objects;

import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;

public class Slingshot {

	Texture Slingshot;
	Sprite Sslingshot;
	public Slingshot()
	{
		Slingshot = new Texture("slingshot2.png");
		Sslingshot = new Sprite(Slingshot);
	}
	public void setSlingshot(Texture slingshot) {
		Slingshot = slingshot;
	}public void setSslingshot(Sprite sslingshot) {
		Sslingshot = sslingshot;
	}public Texture getSlingshot() {
		return Slingshot;
	}public Sprite getSslingshot() {
		return Sslingshot;
	}
}
