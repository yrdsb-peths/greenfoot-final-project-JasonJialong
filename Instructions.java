import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends World
{

    /**
     * Constructor for objects of class Instructions.
     * 
     */
    private SimpleTimer timerInput = new SimpleTimer(); 
    
    public Instructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        timerInput.mark();
        prepare();
    }
    
    public void act()
    {
        //Starts game if spacebar pressed
        if (timerInput.millisElapsed() > 100 && Greenfoot.isKeyDown("space"))
        {
            GameWorld gameWorld = new GameWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    private void prepare()
    {
        
    }
}
