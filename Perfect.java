import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Perfect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perfect extends Actor
{
    GreenfootImage perfect = new GreenfootImage("images/perfect.jpg");
    private int size = 20;

    public Perfect()
    {
        setImage(perfect);
        perfect.scale(size, size);
    }

    public void act()
    {
        int x = getX()-5;
        int y = getY();
        setLocation(x, y);
    }
}
