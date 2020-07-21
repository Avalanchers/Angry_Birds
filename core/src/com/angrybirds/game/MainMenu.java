package com.angrybirds.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class MainMenu implements Screen
{
	Texture background;
	Sprite sbackgroung;
	Texture background1;
	Sprite sbackgroung1; 
	int counter=0;

	MainGame Game;
	public MainMenu(MainGame Game)
	{
		this.Game=Game;
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
		Game.batch.begin();

		
		sbackgroung.draw(Game.batch);
		sbackgroung.draw(Game.batch);
		
		if(Gdx.input.getX()>400&&Gdx.input.getX()<786&&Gdx.input.getY()>327 &&Gdx.input.getY()<380)
		{
			if(Gdx.input.isTouched())
			{
				this.dispose();
				Game.setScreen(new LevelsMenu(Game));			
			}
		}
		System.out.println(Gdx.input.getX());
		System.out.println(Gdx.input.getY());

		Game.batch.end();
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