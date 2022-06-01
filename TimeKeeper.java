import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TimeKeeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimeKeeper extends Actor
{
    /**
     * Act - do whatever the TimeKeeper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY()+14;
        setLocation(x, y);
        
        //When the timer falls to the bottom of the world
        GameWorld world = (GameWorld) getWorld();
        if (getY() >= world.getHeight())
        {
            world.removeObject(this);
            world.createTimer();
        }
    }
    
}
