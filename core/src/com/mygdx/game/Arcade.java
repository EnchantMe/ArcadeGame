package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.ScreenManager.ScreenEnum;
import com.mygdx.game.ScreenManager.ScreenManager;


public class Arcade extends Game {
	public static final int V_WIDTH = 1920;
	public static final int V_HEIGHT = 1080;
	public static final float PPM = 100;
	public SpriteBatch batch;

	@Override
	public void create () {
		batch = new SpriteBatch();
		ScreenManager.getInstance().Initialize(this);
		ScreenManager.getInstance().ShowScreen(ScreenEnum.MAIN_MENU);
	}

	@Override
	public void render () {

		super.render();

	}
	
	@Override
	public void dispose () {

	}

	public void resize (int w, int h){     }

	public void pause() {}

	public void resume() {}
}
