package com.game.base.uncategorized;

/**
 *
 * @author Stephen Rumpel
 */
public class GOEnemy extends GameObject
{

    public static final int SIZEX = 16;
    public static final int SIZEY = SIZEX * 7;
    public static final float MAX_SPEEDY = 4f;
    public static final float DAMPING = 0.05f;

    private GOBall ball;

    public GOEnemy(float x, float y, GOBall ball)
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

        float speed = (ball.getCenterY() - getCenterY()) * DAMPING;

        if (speed > MAX_SPEEDY)
        {
            speed = MAX_SPEEDY;
        }
        if (speed < -MAX_SPEEDY)
        {
            speed = -MAX_SPEEDY;
        }

        y += speed;
    }
}
