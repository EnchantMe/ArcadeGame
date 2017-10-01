package com.mygdx.game.Objects.Enemy;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public abstract class Enemy extends Sprite {
    public int damage;
    protected int hp;
    public Vector2 speed;

    public abstract void Move(int damage);
    public abstract void update(float dt);
    public abstract void Damaged(int damage);

}
