import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UserGood here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UserGood extends Actor
{
    GreenfootImage dotted = new GreenfootImage("images/dotted.png");
    private int size = 60;

    public void act()
    {
        GameWorld world = (GameWorld) getWorld();
        
        if (Greenfoot.isKeyDown("a"))
        {
            if (isTouching(Box.class))
            {
                removeTouching(Box.class);
                world.increaseScoreGood();
            }
        }
        
    }

    public UserGood()
    {
        setImage(dotted);
        dotted.scale(size, size);
    }
}
