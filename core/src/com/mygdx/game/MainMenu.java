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
		sbackgroung.setScale(.7f, .8f);
	}

	@Override
	public void render(float delta) {
		game.batch.begin();

		
		sbackgroung.draw(game.batch);
		sbackgroung.draw(game.batch);
		
		if(Gdx.input.getX()>431&&Gdx.input.getX()<830&&Gdx.input.getY()>394 &&Gdx.input.getY()<480)
		{
			if(Gdx.input.isTouched())
			{
				this.dispose();
				game.setScreen(new LevelsMenu(game));			
			}
		}

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