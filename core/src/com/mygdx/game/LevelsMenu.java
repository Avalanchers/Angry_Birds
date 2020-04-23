package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class LevelsMenu implements Screen
{
	Texture background1;
    Sprite sbackgroung1;    
    MainGame game;
   
   
    public LevelsMenu(MainGame game)
    {
        this.game=game;
    } 

    @Override
    public void show() {
		background1=new Texture("LEVELS.jpg");
		sbackgroung1=new Sprite(background1);
		sbackgroung1.setOrigin(0, 0);
		sbackgroung1.setScale(.7f, .8f);	
    }

    @Override
    public void render(float delta) 
    {
        game.batch.begin();
        sbackgroung1.draw(game.batch);
		sbackgroung1.draw(game.batch);
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