import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Main World
 * 
 * @author Jason Chen
 * @version June 2022
 */
public class GameWorld extends World
{
    Label scoreLabel;
    public int score = 0;
    
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 

        UserGood click = new UserGood();
        addObject(click, 100, 200);
        
        createBlue();

        //Create a label
        scoreLabel = new Label(100, 220);
        addObject(scoreLabel, 100, 100);
        
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

    //Creates Blue 
    public void createBlue()
    {
        Blue blueSquare = new Blue();
        addObject(blueSquare, 600, 200);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
}
