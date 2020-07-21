package com.mygdx.game.desktop.screens;

import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.*;

public class Loading implements Screen {
	
	private ShapeRenderer shaperenderer;
	
	@Override
	public void show() {
		System.out.println("it works!");
	}

	//private void update(float delta)
	//{
	//	queueAssets();
	//	if(app.assets.update())
	//	{
	//		app.setScreen(new Level1());
	//	}
	//}
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0,0,0,1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		//update(delta);
		
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
	
	//private void queueAssets()
	//{
	//	app.assets.load("AngryBackground.jpg" , Texture.class);
	//}
	
	@Override
	public void dispose() {
		shaperenderer.dispose();
	}
	
}
