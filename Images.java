import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a place to store all my images, used a lot for the Instructions world
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Images extends Actor
{
    GreenfootImage blue = new GreenfootImage("images/blueSquare.png");
    GreenfootImage green = new GreenfootImage("images/greenSquare.png");
    GreenfootImage dotted = new GreenfootImage("images/dotted.png");
    private static int size = 80;
    
    public Images(String image)
    {
        blue.scale(size, size);
        green.scale(size, size);
        dotted.scale(50, 50);
        
        if (image.equals("blue"))
        {
            setImage(blue);
        }

        if (image.equals("green"))
        {
            setImage(green);
        }
        
        if (image.equals("dotted"))
        {
            setImage(dotted);
        }
        
    }

    public void act()
    {
        
    }
}
