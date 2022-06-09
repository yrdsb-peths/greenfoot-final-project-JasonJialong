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
    Label streakLabel;
    Label ratingLabel;
    public static int score = 0;
    public static int streak = 0;

    GreenfootSound song = new GreenfootSound("Clock Tower (Remix).mp3");
    private SimpleTimer songLength = new SimpleTimer(); 
    private SimpleTimer boxSpawnInterval = new SimpleTimer();
    private SimpleTimer actionCooldown = new SimpleTimer();

    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 

        song.play();

        User click = new User();
        addObject(click, 100, 200);
        
        Images dots = new Images("dotted");
        addObject(dots, 100, 200);

        //Create a label for score
        scoreLabel = new Label(0, 40);
        addObject(scoreLabel, 100, 150);

        //Create a label for streak
        streakLabel = new Label(0, 40);
        addObject(streakLabel, 200, 150);
        
        //Create a label for how the player is doing
        ratingLabel = new Label(" ", 40);
        addObject(ratingLabel, 100, 300);

        //Create a Miss object
        createMiss();

        boxSpawnInterval.mark();       
        songLength.mark();
    }

    public void act()
    {
        if (boxSpawnInterval.millisElapsed() > 705.88)
        {
            boxSpawnInterval.mark();
            int x = Greenfoot.getRandomNumber(2);
            if (x == 1)
            {
                createBox("blue");
            }
            
            if (x == 0)
            {
                createBox("green");
            }
        }

        streakLabel.setValue(streak);
        
        if (songLength.millisElapsed() >= 285000)
        {
            GameEnd end= new GameEnd();
            Greenfoot.setWorld(end);
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
        
        if (colour.equals("green"))
        {
            Box blueSquare = new Box("green");
            addObject(blueSquare, 600, 200);
        }
    }

    //Increase score by 10
    public void increaseScoreGood()
    {
        score += (10 + streak);
        scoreLabel.setValue(score);
        streak += 1;
        ratingLabel.setValue("Good");
    }

    //Increase score by 30
    public void increaseScorePerfect()
    {
        score += (30 + streak);
        scoreLabel.setValue(score);
        streak += 1;
        ratingLabel.setValue("Perfect");
    }

    //Creats a Miss object
    public void createMiss()
    {
        Miss miss = new Miss();
        addObject(miss, 1, 200);
    }

    //Loses streak if Missed
    public void missed()
    {
        streak = 0;
        ratingLabel.setValue("Miss");
    }
}
