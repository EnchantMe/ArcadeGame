package com.mygdx.game.ScreenManager;

import com.badlogic.gdx.Screen;
import com.mygdx.game.Arcade;

public class ScreenManager {

    private static ScreenManager instance;

    public Arcade game;

    public static ScreenManager getInstance() {
        if(instance == null) {
            instance = new ScreenManager();
        }
        return instance;
    }
    private ScreenManager() {
        super();
    }

    public void Initialize(Arcade game) {
        this.game = game;
    }

    public void ShowScreen(ScreenEnum screenEnum, Object... params) {
        Screen currentScreen = game.getScreen();

        AbstractScreen newScreen = screenEnum.getScreen(params);
        newScreen.BuildStage();
        game.setScreen(newScreen);

        if(currentScreen != null){
            currentScreen.dispose();
        }
    }
}
