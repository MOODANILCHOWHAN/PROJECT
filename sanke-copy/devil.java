import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class devil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class devil extends Actor
{
    /**
     * Act - do whatever the devil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public  devil(int divisionSize)
    {
        
        //resizing of enemies
        int newWidth=getImage().getWidth()*divisionSize;
        int newHeight=getImage().getHeight()*divisionSize;
        getImage().scale(newWidth,newHeight);
        
    }
    public void act()
    {
        
    }
    
    
}
