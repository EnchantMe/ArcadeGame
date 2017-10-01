package com.mygdx.game.Objects.Player;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;
import com.mygdx.game.ScreenManager.Screens.PlayScreen;

public class Player {

    public World world;
    public Body body;

    public Player(PlayScreen playScreen) {

        DefinePlayer();
    }

    private void DefinePlayer() {
        BodyDef bdef = new BodyDef();
        bdef.fixedRotation = true;
        bdef.position.set(new Vector2(50,50));
        bdef.type = BodyDef.BodyType.DynamicBody;
        body = world.createBody(bdef);

        FixtureDef fdef = new FixtureDef();

        PolygonShape shape = new PolygonShape();
        shape.setAsBox(10,10);
        fdef.shape = shape;

        body.createFixture(fdef);
    }

    public void update(float dt) {

    }
}
