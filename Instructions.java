import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This shows the insructions to the game
 * 
 * Jason Chen
 * @version June 2022
 */
public class Instructions extends World
{
    private SimpleTimer timerInput = new SimpleTimer(); 
    
    public Instructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        timerInput.mark();
    }
    
    public void act()
    {
        //Starts game if spacebar pressed, the timer avoids a double input
        if (timerInput.millisElapsed() > 100 && Greenfoot.isKeyDown("space"))
        {
            GameWorld gameWorld = new GameWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
