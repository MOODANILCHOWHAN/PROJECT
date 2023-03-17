  import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bug extends Actor
{
    /**
     * Act - do whatever the Bug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //providing the address for score
    Background thisGame;
    //all actions are done in act()
    public void act()
    {
        navigation();
        eatingApple();
        distroy();
        
        
        
    }
       
    public void navigation()
    {
        
     //moving dirctions
        if (Greenfoot.isKeyDown("right"))
        {
            move(2);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            move(-2);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            turn(4);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            turn(-4);
        }
    }
    public int noOfEaten=0;
    public void eatingApple()
    {
        if (isTouching(apple.class))
        {
            removeTouching(apple.class);       //removing spples
            thisGame.score++; 
            //storing score
            noOfEaten=0;
            
            
        }
    }
    public void distroy()
    {
        if (isTouching(enemy.class)  )
        {
            setImage( new GreenfootImage( "GAME OVER SCORE:"+thisGame.score ,50 , Color. WHITE, Color. BLACK));
            Greenfoot.stop();
            setLocation(450,200);
            setRotation(getRotation()-getRotation());
            thisGame.score=0;
            
            
            
        }
        /*if(noOfEaten==count1.count )
        {
            setImage( new GreenfootImage( "GAME OVER SCORE:"+thisGame.score ,50 , Color. WHITE, Color. BLACK));
            Greenfoot.stop();
            setLocation(450,200);
            setRotation(getRotation()-getRotation());
            thisGame.score=0;
        }
        */
       
    }
            
    
        
        
    
}
