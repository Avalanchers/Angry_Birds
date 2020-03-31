package com.mygdx.game.desktop;

import javax.swing.WindowConstants;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.scenes.scene2d.ui.Window;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class DesktopLauncher {
	public static void main(String[] arg) throws LWJGLException {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
	
		new LwjglApplication(new MyGdxGame(), config);
	}
}
