package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainMenu implements Screen
{
	Texture background;
	Sprite sbackgroung;
	Texture background1;
	Sprite sbackgroung1; 
	int counter=0;

	MainGame game;
	public MainMenu(MainGame game)
	{
		this.game=game;
	}
	
	
	@Override
	public void show() 
	{
		background=new Texture("SS.jpg");
		sbackgroung=new Sprite(background);
		sbackgroung.setOrigin(0, 0);
		sbackgroung.setScale(.66f, .52f);
	}

	@Override
	public void render(float delta) {
		game.batch.begin();

		
		sbackgroung.draw(game.batch);
		sbackgroung.draw(game.batch);
		
		if(Gdx.input.getX()>400&&Gdx.input.getX()<786&&Gdx.input.getY()>327 &&Gdx.input.getY()<380)
		{
			if(Gdx.input.isTouched())
			{
				this.dispose();
				game.setScreen(new LevelsMenu(game));			
			}
		}
		System.out.println(Gdx.input.getX());
		System.out.println(Gdx.input.getY());

		game.batch.end();
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
		
	}



}