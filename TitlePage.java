import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title page that looks nice
 * 
 * @author Jason Chen
 * @version June 2022
 */
public class TitlePage extends World
{
    public TitlePage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public void act()
    {
        //Moves to the instructions when [space] is pressed
        if (Greenfoot.isKeyDown("space"))
        {
            Controls controls = new Controls();
            Greenfoot.setWorld(controls);
        }
    }
    
    private void prepare()
    {
        Label label = new Label("Beat Box", 70);
        addObject(label,300,200);
        
        Label label2 = new Label("{Press [Space] to Start}", 50);
        addObject(label2,321,290);
        label2.setLocation(315,310);
    }
}
