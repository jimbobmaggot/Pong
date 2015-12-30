package com.game.base.uncategorized;

/**
 *
 * @author Stephen Rumpel
 */
public abstract class GameObject
{

    protected float x;
    protected float y;
    protected float width;
    protected float height;

    abstract void update();

    public void render()
    {
        Draw.rect(x, y, width, height);
    }

    public float getX()
    {
        return x;
    }

    public float getY()
    {
        return y;
    }

    public float getWidth()
    {
        return width;
    }

    public float getHeight()
    {
        return height;
    }

    public float getCenterY()
    {
        return y + height / 2;
    }
}
