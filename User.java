import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UserGood here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User extends Actor
{
    GreenfootImage dotted = new GreenfootImage("images/dotted.png");
    private int size = 10;

    public void act()
    {
        GameWorld world = (GameWorld) getWorld();

        if (Greenfoot.isKeyDown("a") && isTouching(Box.class))
        {
            removeTouching(Box.class);
            world.increaseScoreGood();
        }
        
        if (Greenfoot.isKeyDown("l") && isTouching(Box.class))
        {
            removeTouching(Box.class);
            world.increaseScoreGood();
        }
    }

    public User()
    {
        setImage(dotted);
        dotted.scale(size, size);
    }
}
