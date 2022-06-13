import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * User is the way the player interacts with the game, eliminating Boxes
 * 
 * @author Jason Chen
 * @version June 2022
 */
public class User extends Actor
{
    GreenfootImage dotted = new GreenfootImage("images/dotted.png");
    private int size = 60;

    public void act()
    {
        GameWorld world = (GameWorld) getWorld();

        if (Greenfoot.isKeyDown("a") && isTouching(BoxBlue.class) && BoxBlue.perfectZone == true)
        {
            removeTouching(BoxBlue.class);
            world.increaseScorePerfect();
        }
        
        else if (Greenfoot.isKeyDown("a") && isTouching(BoxBlue.class))
        {
            removeTouching(BoxBlue.class);
            world.increaseScoreGood();
        }
        
        
        if (Greenfoot.isKeyDown("l") && isTouching(BoxGreen.class) && BoxGreen.perfectZone == true)
        {
            removeTouching(BoxGreen.class);
            world.increaseScorePerfect();
        }
        
        else if (Greenfoot.isKeyDown("l") && isTouching(BoxGreen.class))
        {
            removeTouching(BoxGreen.class);
            world.increaseScoreGood();
        }
    }

    public User()
    {
        setImage(dotted);
        dotted.scale(size, size);
    }
}
