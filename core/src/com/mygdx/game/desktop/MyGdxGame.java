package com.mygdx.game.desktop;

import java.io.File;

import javax.swing.Spring;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.ui.Window;

import org.w3c.dom.events.MouseEvent;

public class MyGdxGame implements ApplicationListener{
	Texture tex;
	Texture yellow;
	Texture vblock;
	Texture hblock;
	Texture ground;
	Texture slingshot;
	Sprite sprite;
	Sprite syellow;
	Sprite svblock;
	Sprite svblock2;
	Sprite shblock;
	Sprite sground;
	Sprite Sslingshot;

	SpriteBatch batch;
	@Override
	public void create () {
		System.out.println("Create");
		
    	tex =new Texture("background.png");
		ground =new Texture("ground.png");
		slingshot=new Texture("slingshot2.png");
		vblock=new Texture("veeticalblock.png");
		hblock=new 	Texture("horizentalblock.png");
		yellow=new Texture("yellow.png");
		syellow=new Sprite(yellow);
		svblock=new Sprite(vblock);
		svblock2=new Sprite(vblock);
		sground=new Sprite(ground);
		shblock=new Sprite(hblock);
		sprite=new Sprite(tex);
    	Sslingshot=new Sprite(slingshot);

		syellow.setOrigin(0, 0);
		svblock.setOrigin(0, 0);
		svblock2.setOrigin(0, 0);
		sprite.setOrigin(0,  0);
		sground.setOrigin(0,  0);
		shblock.setOrigin(0,  0);
		syellow.setScale(.18f, .18f);

		syellow.setX(970);
		syellow.setY(135);
//sground.ser
		Sslingshot.setX(90);
		Sslingshot.setY(140);

		svblock.setY(-30);
		svblock.setX(350);

		svblock2.setY(-30);
		svblock2.setX(165);

		shblock.setY(80);
		shblock.setX(260);

	}


	@Override
	public void resize (int width, int height) {
		System.out.println("Resize- w"+ width+"| h:"+height);
	Gdx.graphics.setContinuousRendering(false);
	}

	@Override
	public void render () {
		System.out.println("render");
	Gdx.graphics.setWindowedMode(1280, 720);
batch=new SpriteBatch();
batch.begin();
		
		sprite.draw(batch);
		sground.draw(batch);
		Sslingshot.draw(batch);
		svblock.draw(batch);
		svblock2.draw(batch);
		shblock.draw(batch);
		syellow.draw(batch);
		batch.end();
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
