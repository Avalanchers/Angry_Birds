package com.mygdx.game.desktop;
import com.mygdx.game.desktop.screens.*;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.SplashScreen;
import java.io.File;
import javax.swing.Spring;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.ui.Window;
import org.w3c.dom.events.MouseEvent;

public class MyGdxGame extends Game {
	private Game game;
	SpriteBatch batch;
	Texture img;
	public AssetManager assets;
	public int height,width;
	public MyGdxGame app = this;
	@Override
	public void create ()
	{
		assets = new AssetManager();
		setScreen(new Level1());
	}
	
	public void SetScreen(Screen screen)
	{
		setScreen(screen);
	}
	
	@Override
	public void render () 
	{
		super.render();
	}
	
	public void onEvent(int type)
	{
		
	}
	
	@Override
	public void dispose () 
	{
		super.dispose();
	}
	
	@Override
	public void resume()
	{
		super.resume();
	}
	
	@Override
	public void pause()
	{
		super.pause();
	}
	
	@Override
	public void resize(int width,int height)
	{
		super.resize(width, height);
	}
}
