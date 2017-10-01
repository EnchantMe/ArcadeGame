package com.mygdx.game.ScreenManager;

import com.mygdx.game.ScreenManager.Screens.MainMenuScreen;
import com.mygdx.game.ScreenManager.Screens.PlayScreen;
import com.mygdx.game.ScreenManager.Screens.SelectLevelScreen;

public enum ScreenEnum {
    MAIN_MENU {
        public AbstractScreen getScreen(Object... param) {
            return new MainMenuScreen();
        }
    },
    PLAY {
      public AbstractScreen getScreen(Object... param) { return new PlayScreen(0); }
    },
    SELECT_LEVEL {
      public AbstractScreen getScreen(Object... param) { return new SelectLevelScreen(); }
    };
    public abstract AbstractScreen getScreen(Object... params);
}
