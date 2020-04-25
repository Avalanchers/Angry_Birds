package com.mygdx.game.desktop.screens;
import com.mygdx.game.desktop.Objects.*;

import java.io.File;

import javax.swing.Spring;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Window;
import com.mygdx.game.*;
import org.w3c.dom.events.MouseEvent;

public class Level1 implements Screen{

	MainGame game;
	Red r = new Red();
	Yellow y = new Yellow();
	Background back = new Background();
	Ground ground = new Ground();
	Blocks block = new Blocks(),block2 = new Blocks();
	Slingshot slingy = new Slingshot();
	SpriteBatch batch;

	public Level1(MainGame game)
	{
		this.game = game;
	}
	
	@Override
	public void render(float delta) {
		System.out.println("render");
		Gdx.graphics.setWindowedMode(1150, 720);
		batch=new SpriteBatch();
		batch.begin();
		back.getSprite().draw(batch);
		ground.getSground().draw(batch);
		slingy.getSslingshot().draw(batch);
		block.getSvblock().draw(batch);
		block2.getSvblock().draw(batch);
		block.getShblock().draw(batch);
		r.getSred().draw(batch);
		batch.end();
		
	}

	@Override
	public void resize (int width, int height) {
		System.out.println("Resize- w"+ width+"| h:"+height);
	Gdx.graphics.setContinuousRendering(false);
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

	@Override
	public void show() {
		System.out.println("Create");

		
		r.getSred().setX(970);
		r.getSred().setY(135);
		slingy.getSslingshot().setX(90);
		slingy.getSslingshot().setY(140);
		block.getSvblock().setY(-30);
		block.getSvblock().setX(350);
		block2.getSvblock().setY(-30);
		block2.getSvblock().setX(165);
		block.getShblock().setY(80);
		block.getShblock().setX(260);
		
	}

	@Override
	public void hide() {
		
	}
}
