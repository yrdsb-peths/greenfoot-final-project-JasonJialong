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
    GreenfootSound song = new GreenfootSound("Clock Tower (Remix).mp3");
    private SimpleTimer timerSong = new SimpleTimer(); 
    private SimpleTimer timerSpawn = new SimpleTimer();

    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 

        song.play();

        UserGood click = new UserGood();
        addObject(click, 100, 200);
        
        UserPerfect tap = new UserPerfect();
        addObject(tap, 100, 200);
        
        //Create a label for score
        scoreLabel = new Label(0, 40);
        addObject(scoreLabel, 100, 150);

        timerSpawn.mark();       

    }
    
    public void act()
    {
        if (timerSpawn.millisElapsed() > 705.88)
        {
            timerSpawn.mark();
            createBox("blue");
        }
    }

    //Creates Box  
    public void createBox(String colour)
    {
        if (colour.equals("blue"))
        {
            Box blueSquare = new Box("blue");
            addObject(blueSquare, 600, 200);
        }
        
        Perfect perfect = new Perfect();
        addObject(perfect, 600, 200);
    }
    
    //Increase score by 10
    public void increaseScoreGood()
    {
        score += 10;
        scoreLabel.setValue(score);
    }
    
    //Increase score by 30
    public void increaseScorePerfect()
    {
        score += 30;
        scoreLabel.setValue(score);
    }
}
