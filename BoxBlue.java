import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Spawns blue boxes to be interacted with
 * 
 * @author Jason Chen
 * @version June 2022
 */
public class BoxBlue extends Actor
{
    /**
     * Act - do whatever the Box wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage blue = new GreenfootImage("images/blueSquare.png");
    private int size = 50;
    public static boolean perfectZone = false;

    public BoxBlue()
    {
        blue.scale(size, size);
        setImage(blue);
    }

    public void act()
    {
        move(-6);
        GameWorld world = (GameWorld) getWorld();
        if (getX() <= 100)
        {
            perfectZone = true;
        }

        else
        {
            perfectZone = false;
        }

    }
}
