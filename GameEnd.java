import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world at the end of the game, shows score and rating
 * 
 * @author Jason Chen
 * @version June 2022
 */
public class GameEnd extends World
{
    Label ratingLabel; 
    
    //Takes in the final score from the GameWorld and prints it out
    public GameEnd(int finalScore)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label end = new Label("Game End", 70);
        addObject(end,300,50);

        Label finalScoreLable1 = new Label("Final Score:", 50);
        addObject(finalScoreLable1,150,150);

        Label finalScoreLable2 = new Label(finalScore, 50);
        addObject(finalScoreLable2,400,150);
        
        //The rating the player gets
        String rating = "F";
        
        if (finalScore >= 93000)
        {
            rating.equals("SSS");
        }
        else if (finalScore >= 85000)
        {
            rating.equals("S");
        }
        else if (finalScore >= 50000)
        {
            rating.equals("A");
        }
        else if (finalScore >= 30000)
        {
            rating.equals("B");
        }
        else if (finalScore >= 17000)
        {
            rating.equals("C");
        }
        else if (finalScore >= 8000)
        {
            rating.equals("D");
        }
        else if (finalScore < 8000)
        {
            rating.equals("F");
        }
        
        Label rating1 = new Label("Rating:", 50);
        addObject(rating1,150,250);
        
        ratingLabel = new Label(rating, 40);
        addObject(ratingLabel, 400,250);
        
        Label again = new Label("{Press [Space] to Play Again}", 50);
        addObject(again,300,350);
    }

    public void act()
    {   
        //Goes back to the intstructions
        if (Greenfoot.isKeyDown("space"))
        {
            Controls controls = new Controls();
            Greenfoot.setWorld(controls);
        }
    }
}