 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class enemy extends devil
{
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public  enemy()
    {
        super(2);
        
    }
    public void act()
    {
        move(3);
        setRotation(getRotation()+Greenfoot.getRandomNumber(5));
        
        
        EnemyAtedge();
    
        
    }
    
    public void EnemyAtedge()
    {
        if(getX()==899)
        {
            setLocation(0,getY());
        }
        if (getY()==449)
        {
            setLocation(getX(),0);
        }
    }
}
