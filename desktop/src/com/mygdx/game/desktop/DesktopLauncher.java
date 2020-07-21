package com.mygdx.game.desktop;

import javax.swing.WindowConstants;


import com.badlogic.gdx.Screen;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.scenes.scene2d.ui.Window;
import com.mygdx.game.MainGame;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class DesktopLauncher {
	public static void main(String[] arg) throws LWJGLException {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.foregroundFPS=60;
		config.width=MainGame.width;
		config.height=MainGame.height;
		config.resizable=false;
		new LwjglApplication(new MainGame(), config);
	}
}
