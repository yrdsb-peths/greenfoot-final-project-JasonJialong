import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Spawns different green boxes to be interacted with
 * 
 * @author Jason Chen
 * @version June 2022
 */
public class BoxGreen extends Actor
{
    /**
     * Act - do whatever the BoxGreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage green = new GreenfootImage("images/greenSquare.png");
    private int size = 50;
    public static boolean perfectZone = false;
    
    public BoxGreen()
    {
        green.scale(size, size);
        setImage(green); 
    }
    
    public void act()
    {
        move(-6);
        GameWorld world = (GameWorld) getWorld();
        if (getX() <= 115 && getX() >= 85)
        {
            perfectZone = true;
        }

        else
        {
            perfectZone = false;
        }

    }
}
