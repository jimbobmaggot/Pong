package com.game.base.uncategorized;

/**
 *
 * @author Stephen Rumpel
 */
public class GOPlayer extends GameObject
{

    public static final int SIZEX = 16;
    public static final int SIZEY = SIZEX * 7;
    public static final float SPEED = 4f;

    private GOBall ball;

    public GOPlayer(float x, float y, GOBall ball)
    {
        this.x = x;
        this.y = y;
        this.width = SIZEX;
        this.height = SIZEY;
        this.ball = ball;
    }

    @Override
    public void update()
    {
        if (Physics.checkCollisions(this, ball))
        {
            ball.reverseX(getCenterY());
        }
    }

    public void move(float mag)
    {
        y += SPEED * mag;
    }
}
