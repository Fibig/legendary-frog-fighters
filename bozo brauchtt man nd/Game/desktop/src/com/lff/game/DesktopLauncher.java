package com.lff.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.lff.game.LFFGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
    public static void main(String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setTitle("Legendary-Frog-Fighters");
        config.setWindowedMode(1200, 600);
        config.useVsync(true);
        config.setForegroundFPS(60);
        config.setResizable(false);
        new Lwjgl3Application(new LFFGame(), config);
    }
}
