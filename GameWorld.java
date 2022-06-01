import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Main World
 * 
 * @author Jason Chen
 * @version June 2022
 */
public class GameWorld extends World
{
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        Blue tester = new Blue();
        addObject(tester, 100, 300);
        
        //Creates a TimeKeeper
        createTimer();
    }

    //Creates the in game timer
    public void createTimer()
    {
        TimeKeeper one = new TimeKeeper();
        int x = 0;
        int y = 0;
        addObject(one, x, y);

    }
}
