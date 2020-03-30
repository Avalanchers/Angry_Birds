package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame implements ApplicationListener{
	@Override
	public void create () {
		System.out.println("Create");
	}

	@Override
	public void resize (int width, int height) {
		System.out.println("Resize- w"+ width+"| h:"+height);
	Gdx.graphics.setContinuousRendering(false);
	}

	@Override
	public void render () {
		System.out.println("render");
	}

	@Override
	public void pause () {
		System.out.println("Pause");
	}

	@Override
	public void resume () {
		System.out.println("resume");
	}

	@Override
	public void dispose () {
		System.out.println("dispose");
	}
}
