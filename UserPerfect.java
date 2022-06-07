import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UserPerfect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UserPerfect extends Actor
{
    GreenfootImage dotted = new GreenfootImage("images/dotted.png");
    private int size = 30;

    public void act()
    {
        GameWorld world = (GameWorld) getWorld();
        
        if (Greenfoot.isKeyDown("a"))
        {
            if (isTouching(Perfect.class))
            {
                removeTouching(Box.class);
                removeTouching(Perfect.class);
                world.increaseScorePerfect();
            }
        }
        
    }

    public UserPerfect()
    {
        setImage(dotted);
        dotted.scale(size, size);
    }
}
