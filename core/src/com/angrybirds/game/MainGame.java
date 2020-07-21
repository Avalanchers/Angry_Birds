package com.angrybirds.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainGame extends Game {
	
	public SpriteBatch batch;
	public static final int width=1150;
	public static final int height=720;
	
	@Override
	public void create () {
		batch=new SpriteBatch();
		this.setScreen(new MainMenu(this));
	}

	@Override
	public void render () {
		super.render();
	}

}