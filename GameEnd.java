import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world at the end of the game 
 * 
 * @author Jason Chen
 * @version June 2022
 */
public class GameEnd extends World
{
    public GameEnd(int finalScore)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label end = new Label("Game End", 70);
        addObject(end,300,50);
        
        Label finalScoreLable1 = new Label("Final Score:", 50);
        addObject(finalScoreLable1,150,200);
        
        Label finalScoreLable2 = new Label(finalScore, 50);
        addObject(finalScoreLable2,290,200);
    }
    
    public void act()
    {   
        //Goes back to the intstructions
        if (Greenfoot.isKeyDown("space"))
        {
            Instructions instructions = new Instructions();
            Greenfoot.setWorld(instructions);
        }
    }
}