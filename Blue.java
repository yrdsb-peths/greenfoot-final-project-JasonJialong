import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blue extends Actor
{
    GreenfootImage blue = new GreenfootImage("images/blueSquare.png");
    private int size = 50;
    
    public Blue()
    {
        setImage(blue);
        blue.scale(size, size);
    }
    public void act()
    {
        int x = getX()-6;
        int y = getY();
        setLocation(x, y);
    }
}
