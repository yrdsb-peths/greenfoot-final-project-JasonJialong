import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Miss Class creates an object that can be used to detect if the player
 * missed an input, making them lose their streak.
 * 
 * @author Jason Chen 
 * @version June 2022
 */
public class Miss extends Actor
{
    GreenfootImage miss = new GreenfootImage("images/missLine.png");
    private static int size = 50;

    public Miss()
    {
        setImage(miss);
        miss.scale(size, size);
    }

    public void act()
    {
        if (isTouching(Perfect.class) || isTouching(Box.class))
        {
            GameWorld.streak = 0;
            removeTouching(Box.class);
            removeTouching(Perfect.class);
        }
    }
}
