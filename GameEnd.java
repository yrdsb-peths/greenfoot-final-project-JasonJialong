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
        Label label = new Label("This page not implemented yet :p", 40);
        addObject(label,300,50);
    }
    
    public void act()
    {
        //Starts game if spacebar pressed
        if (Greenfoot.isKeyDown("space"))
        {
            Instructions instructions = new Instructions();
            Greenfoot.setWorld(instructions);
        }
    }
}