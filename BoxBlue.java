import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Spawns blue boxes to be interacted with
 * 
 * @author Jason Chen
 * @version June 2022
 */
public class BoxBlue extends Actor
{
    GreenfootImage blue = new GreenfootImage("images/blueSquares.jpg");
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
        
        //Gets the location of itself in the GameWorld, and if it is in between certain values the user gets "perfect" when hitting it
        GameWorld world = (GameWorld) getWorld();
        if (getX() <= 115 && getX() >= 85)
        {
            perfectZone = true;
        }

        else
        {
            perfectZone = false;
        }

    }
}
