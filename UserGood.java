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
        if (Greenfoot.isKeyDown("a"))
        {
            if (isTouching(Blue.class))
            {
                removeTouching(Blue.class);
            }
            // Add your action code here.
        }
    }

    public UserGood()
    {
        setImage(dotted);
        dotted.scale(size, size);
    }
}
