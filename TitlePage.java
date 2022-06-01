import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitlePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitlePage extends World
{

    /**
     * Constructor for objects of class TitlePage.
     * 
     */
    public TitlePage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public void act()
    {
        //Starts game if spacebar pressed
        if (Greenfoot.isKeyDown("space"))
        {
            GameWorld gameWorld = new GameWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Beat Box", 70);
        addObject(label,187,116);
        label.setLocation(323,197);
        label.setLocation(322,190);
        label.setLocation(283,274);
        label.setLocation(341,217);
        label.setLocation(280,176);
        label.setLocation(348,181);
        label.setLocation(262,196);
        label.setLocation(194,183);
    }
}
