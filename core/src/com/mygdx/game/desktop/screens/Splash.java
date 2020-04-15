package com.mygdx.game.desktop.screens;

import com.mygdx.game.desktop.*;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.PauseableThread;
import com.badlogic.gdx.graphics.*;

public class Splash implements Screen{

	private SpriteBatch batch = new SpriteBatch();
	private Sprite splash;
	private MyGdxGame app;
	
	public Splash(MyGdxGame app)
	{
		this.app = app;
		Gdx.graphics.setContinuousRendering(false);
	}
	
	@Override
	public void show() {
		Texture text = new Texture("AngryBackground.jpg");
		splash = new Sprite(text);
		splash.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0,0,0,1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		splash.draw(batch);
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void dispose() {
		
		batch.dispose();
	}

}
