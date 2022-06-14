import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This shows the insructions to the game
 * 
 * @author Jason Chen
 * @version June 2022
 */
public class Controls extends World
{
    //Timer to avoid the user double clicking [space] by accident
    private SimpleTimer timerInput = new SimpleTimer(); 

    public Controls()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        timerInput.mark();

        // Creates many lables to show the user the controls
        Label label = new Label("Instructions", 70);
        addObject(label,300,50);

        Label label2 = new Label("{Press [Space] to Continue}", 50);
        addObject(label2,300,350);

        Label label3 = new Label("Press [A]", 50);
        addObject(label3,250 ,150);

        Label label4 = new Label("Press D]", 50);
        addObject(label4,250 ,250);

        Images blue = new Images("blue");
        addObject(blue, 100, 150);

        //Images to go along the instructions
        Images green = new Images("green");
        addObject(green, 100, 250);

    }
    public void act()
    {
        //Starts game if spacebar pressed, the timer avoids a double input
        if (timerInput.millisElapsed() > 250 && Greenfoot.isKeyDown("space"))
        {
            GameWorld gameWorld = new GameWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
