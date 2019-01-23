import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ladders here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ladder extends Actor
{
    private GreenfootImage ladders[] = new GreenfootImage[19];
    public Ladder(int imageNum)
    {
        GreenfootImage image = new GreenfootImage("LadderUpTwo.png");
        
        if( imageNum == 0 )
        {
            image = new GreenfootImage("Ladder1.png");
            image.scale(17, 95);
        }
        else if( imageNum == 1 )
        {
            image = new GreenfootImage("Ladder2.png");
            image.scale(17, 36);
        }
        else if( imageNum == 2 )
        {
            image = new GreenfootImage("Ladder3.png");
            image.scale(17, 40);
        }
        else if( imageNum == 3 )
        {
            image = new GreenfootImage("Ladder3.5.png");
            image.scale(17, 10);
        }
        else if( imageNum == 4 )
        {
            image = new GreenfootImage("Ladder4.png");
            image.scale(17, 20);
        }
        else if( imageNum == 5 )
        {
            image = new GreenfootImage("Ladder5.png");
            image.scale(17, 40);
        }
        else if( imageNum == 6 )
        {
            image = new GreenfootImage("Ladder6.png");
            image.scale(17, 50);
        }
        else if( imageNum == 7 )
        {
            image = new GreenfootImage("Ladder6.5.png");
            image.scale(17, 17);
        }
        else if( imageNum == 8 )
        {
            image = new GreenfootImage("Ladder7.png");
            image.scale(17, 17);
        }
        else if( imageNum == 9 )
        {
            image = new GreenfootImage("Ladder8.png");
            image.scale(17, 39);
        }
        else if( imageNum == 10 )
        {
            image = new GreenfootImage("Ladder9.png");
            image.scale(17, 56);
        }
        else if( imageNum == 11 )
        {
            image = new GreenfootImage("Ladder9.5.png");
            image.scale(17, 13);
        }
        else if( imageNum == 12 )
        {
            image = new GreenfootImage("Ladder10.png");
            image.scale(17, 20);
        }
        else if( imageNum == 13 )
        {
            image = new GreenfootImage("Ladder11.png");
            image.scale(17, 40);
        }
        else if( imageNum == 14 )
        {
            image = new GreenfootImage("Ladder12.png");
            image.scale(17, 58);
        }
        else if( imageNum == 15 )
        {
            image = new GreenfootImage("Ladder13.png");
            image.scale(17, 40);
        }
        else if( imageNum == 16 )
        {
            image = new GreenfootImage("Ladder13.5.png");
            image.scale(17, 10);
        }
        else if( imageNum == 17 )
        {
            image = new GreenfootImage("Ladder14.png");
            image.scale(17, 20);
        }
        else if( imageNum == 18 )
        {
            image = new GreenfootImage("Ladder1.5.png");
            image.scale(17, 95);
        }
        setImage(image);
    }
    /**
     * Act - do whatever the Ladders wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
