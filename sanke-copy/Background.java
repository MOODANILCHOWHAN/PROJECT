import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Font;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public static int score=0; 
    public int numberOfApple=0;
    public int count=0;
    //instalizing score
    //showing score at lefttop 
    public void act()
    {
        showText("score :"+score,50,30);
         
        if (numberOfApple<6)
        {
            for (int i=1;i<=3;i++)
            {
                int x = Greenfoot.getRandomNumber(899);
                int y = Greenfoot.getRandomNumber(430);
                addObject(new apple(),x,y);
                Background count1 = new Background();
                count1.count=+1;
                
            }
            numberOfApple=numberOfApple+3;
        }
        
        
    }

    
    
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900,450, 1); 
        //setting automatic creation of bug/hero
        addObject(new Bug(),getWidth()/2,getHeight()/2);
        //setting trees automatically as soon as world created
        addObject(new flowers(),111,222);
        addObject(new flowers(),191,272);
        addObject(new flowers(),311,322);
        addObject(new flowers(),511,352);
        addObject(new flowers(),611,292);
        addObject(new flowers(),711,202);
        addObject(new flowers(),811,2);
        addObject(new flowers(),531,22);
        addObject(new flowers(),161,62);
        addObject(new flowers(),881,102);
        //creating apples as soon as world created
        /*addObject(new apple(),120,200);
        addObject(new apple(),550,120);
        addObject(new apple(),620,280);
        addObject(new apple(),820,300);
        */
          
        //enemies
        addObject(new enemy(),112,232);
        addObject(new enemy(),700,178);
        addObject(new enemy(),300,450);
        
        
        
        
    }
    
    
   }
