import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameEnd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameEnd extends World
{
    
    public GameEnd()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label label = new Label("Game End", 40);
        addObject(label,300,50);
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