package com.angrybirds.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class LevelsMenu implements Screen
{
	Texture background1;
    Sprite sbackgroung1;    
    MainGame Game;
   
   
    public LevelsMenu(MainGame Game)
    {
        this.Game=Game;
    } 

    @Override
    public void show() {
		background1=new Texture("LEVELS.jpg");
		sbackgroung1=new Sprite(background1);
		sbackgroung1.setOrigin(0, 0);
		sbackgroung1.setScale(.66f, .52f);	
    }

    @Override
    public void render(float delta) 
    {
        Game.batch.begin();
        sbackgroung1.draw(Game.batch);
		sbackgroung1.draw(Game.batch);
		if(Gdx.input.getY()>=279&&Gdx.input.getY()<=335&&Gdx.input.getX()>=400&&Gdx.input.getX()<=777)
		{
			if(Gdx.input.isTouched())
			{
				this.dispose();
				Game.setScreen((Screen) new game(Game));
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