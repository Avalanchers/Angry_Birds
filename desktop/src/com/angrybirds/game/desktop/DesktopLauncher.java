package com.angrybirds.game.desktop;

import com.angrybirds.game.MainGame;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main(String[] arg) {
		System.out.println("rerf");
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.foregroundFPS=60;
		config.width=MainGame.width;
		config.height=MainGame.height;
		config.resizable=false;
		new LwjglApplication(new MainGame(), config);

	}
}
	