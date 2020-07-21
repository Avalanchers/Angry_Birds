package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.tween.SpriteAccessor;

import aurelienribon.tweenengine.*;

public class LoadingScreen implements Screen {

	MainGame game;
	private Sprite splash,logo;
	
	private Texture text = new Texture("AngryBackground.jpg"), logotext = new Texture("IconAbs.png");
	private TweenManager tweenmanager,tweenmanager1;
	
	public LoadingScreen(MainGame game)
	{
		this.game = game;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		tweenmanager = new TweenManager();
		tweenmanager1 = new TweenManager();
		Tween.registerAccessor(Sprite.class, new SpriteAccessor());
		Tween.registerAccessor(LoadingScreen.class, new SpriteAccessor());
		splash = new Sprite(text);
		logo = new Sprite(logotext);
		logo.setSize(70, 70);
		logo.setX(1080);
		logo.setY(0);
		splash.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		Tween.set(splash, SpriteAccessor.ALPHA).target(0).start(tweenmanager);
		Tween.to(splash, SpriteAccessor.ALPHA, 2).target(1).start(tweenmanager);
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(0,0,0,1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		//Tween.registerAccessor(Sprite.class, new SpriteAccessor());
		//Tween.registerAccessor(LoadingScreen.class, new SpriteAccessor());
		tweenmanager.update(delta);
		game.batch.begin();
		splash.draw(game.batch);
		logo.draw(game.batch);		
		if(Gdx.input.isKeyJustPressed(Input.Keys.ENTER))
		{
			this.dispose();
			game.setScreen(new MainMenu(game));					
		}
		game.batch.end();
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
