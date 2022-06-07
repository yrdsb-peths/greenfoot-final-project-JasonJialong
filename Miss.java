import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Miss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Miss extends Actor
{

    GreenfootImage miss = new GreenfootImage("images/missLine.png");
    private int size = 50;

    public Miss()
    {
        setImage(miss);
        miss.scale(size, size);
    }

    public void act()
    {
        if (isTouching(Perfect.class) || isTouching(Box.class))
        {
            removeTouching(Box.class);
            removeTouching(Perfect.class);
        }
    }
}
