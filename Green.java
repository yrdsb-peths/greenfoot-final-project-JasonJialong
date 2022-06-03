import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Green here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Green extends Actor
{
    GreenfootImage green = new GreenfootImage("images/greenSquare.png");
    private int size = 50;

    public Green()
    {
        setImage(green);
        green.scale(size, size);
    }

    public void act()
    {
        int x = getX()-6;
        int y = getY();
        setLocation(x, y);
    }
}
