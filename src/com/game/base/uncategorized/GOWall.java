package com.game.base.uncategorized;

/**
 *
 * @author Stephen Rumpel
 */
public class GOWall extends GameObject
{

    public static final int STDSIZE = 16;

    private GOBall ball;

    public GOWall(float x, float y, float width, float height, GOBall ball)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.ball = ball;
    }

    @Override
    public void update()
    {
        if (Physics.checkCollisions(this, ball))
        {
            ball.reverseY();
        }
    }

}
