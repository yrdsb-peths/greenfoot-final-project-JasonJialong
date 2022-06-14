import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Main World where the player plays the game 
 * 
 * @author Jason Chen
 * @version June 2022
 */
public class GameWorld extends World
{
    //Setting up the score system
    Label scoreLabel;
    Label streakLabel;
    Label ratingLabel;
    public static int score = 0;
    public static int streak = 0;

    //Adding in the song: Clock Tower (Remix) by Mewmore
    GreenfootSound song = new GreenfootSound("Clock Tower (Remix).mp3");

    //The SimpleTimers used throught the GameWorld
    private SimpleTimer songLength = new SimpleTimer(); 
    private SimpleTimer boxSpawnInterval = new SimpleTimer();

    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 

        //Plays the song when the GameWorld is created
        song.play();

        //Creates a User in the game world
        User click = new User();
        addObject(click, 100, 200);

        //Create a label for score
        scoreLabel = new Label(0, 40);
        addObject(scoreLabel, 100, 150);

        //Creates labels for the player's streak
        streakLabel = new Label(0, 40);
        addObject(streakLabel, 200, 150);

        //Creates labels for how the player is doing
        ratingLabel = new Label(" ", 40);
        addObject(ratingLabel, 100, 300);

        //Create a Miss object
        createMiss();

        //Starts the timers
        boxSpawnInterval.mark();       
        songLength.mark();
    }

    public void act()
    {
        //Spawns a Box (blue or green based on random number) every 0.70588 seconds
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

        //Sets the streak value
        streakLabel.setValue(streak);

        //Ends the game when the song is over or if the player clicks [esc]
        GameEnd end = new GameEnd(score);
        if (songLength.millisElapsed() >= 285000 || Greenfoot.isKeyDown("escape"))
        {
            //Resets the game if the player wants to play again
            song.stop();
            score = 0;
            streak = 0;

            //goes to the GameEnd world
            Greenfoot.setWorld(end);
        }

    }

    //Creates Box  
    public void createBox(String colour)
    {
        if (colour.equals("blue"))
        {
            BoxBlue blueSquare = new BoxBlue();
            addObject(blueSquare, 600, 200);
        }

        if (colour.equals("green"))
        {
            BoxGreen greenSquare = new BoxGreen();
            addObject(greenSquare, 600, 200);
        }
    }

    //Creats a Miss object
    public void createMiss()
    {
        Miss miss = new Miss();
        addObject(miss, 1, 200);
    }

    /**
     * The missed method resets the 
     * streak to 0  and changes the 
     * ratingLable to "miss"
     */
    public void missed()
    {
        streak = 0;
        ratingLabel.setValue("Miss");
    }

    /**
     * The increaseScoreGood method 
     * increases score by 10 and 
     * increases streak by 1
     */
    public void increaseScoreGood()
    {
        score += (10 + streak);
        scoreLabel.setValue(score);
        streak += 1;
        ratingLabel.setValue("Good");
    }

    /**
     * The increaseScorePerfect
     * method increases score by
     * 30 and increases streak
     * by 1
     */
    public void increaseScorePerfect()
    {
        score += (30 + streak);
        scoreLabel.setValue(score);
        streak += 1;
        ratingLabel.setValue("Perfect");
    }
}
