import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Spawns different coloured boxes to be interacted with
 * 
 * @author Jason Chen
 * @version June 2022
 */
public class Box extends Actor
{
    /**
     * Act - do whatever the Box wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage blue = new GreenfootImage("images/blueSquare.png");
    GreenfootImage green = new GreenfootImage("images/greenSquare.png");
    private int size = 50;
    
    public Box(String colour)
    {
        if (colour.equals("blue"))
        {
            setImage(blue);
        }
        
        if (colour.equals("green"))
        {
            setImage(green);
        }
        
        blue.scale(size, size);
    }
    public void act()
    {
        int x = getX()-5;
        int y = getY();
        setLocation(x, y);
    }
}