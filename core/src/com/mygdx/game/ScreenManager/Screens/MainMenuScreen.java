package com.mygdx.game.ScreenManager.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.mygdx.game.Arcade;
import com.mygdx.game.ScreenManager.AbstractScreen;
import com.mygdx.game.ScreenManager.ScreenEnum;
import com.mygdx.game.ScreenManager.ScreenManager;

public class MainMenuScreen extends AbstractScreen {

    private Skin skin = new Skin(Gdx.files.internal("Skins/MainMenuSkin.json"));
    public MainMenuScreen(){
        super();
    }

    @Override
    public void BuildStage() {

        Table table = new Table(skin);
        table.setBounds(0,0, Arcade.V_WIDTH, Arcade.V_HEIGHT);

        TextButton playButton = new TextButton("Play",skin);
        playButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                ScreenManager.getInstance().ShowScreen(ScreenEnum.PLAY);
            }
        });
        playButton.pad(20);

        TextButton exitButton = new TextButton("Exit",skin);
        exitButton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Gdx.app.exit();
            }
        });

        table.add(playButton);
        table.add(exitButton);

        addActor(table);
    }

    public void dispose() {
        super.dispose();
        skin.dispose();
    }

}
