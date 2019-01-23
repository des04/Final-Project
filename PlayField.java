import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.io.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayField extends World
{
    private Ladder[] ladders = new Ladder[]{ new Ladder(0), new Ladder(1),
    new Ladder(2),new Ladder(3),new Ladder(4),new Ladder(5),new Ladder(6),new Ladder(7),
    new Ladder(8),new Ladder(9),new Ladder(10),new Ladder(11),new Ladder(12),
    new Ladder(13),new Ladder(14),new Ladder(15),new Ladder(16),new Ladder(17),new Ladder(18)};
    
    private int[] ladderXs = new int[]{ 146,262,373,200,200,54,138,330,330,374,246,120,120,74,202,374,170,170,169};
    private int[] ladderYs = new int[]{ 150,177,240,218,262,320,321,289,350,399,399,367,427,476,476,552,525,575,150};
    
    private int animateCounter = 0;     
    private boolean startGame = true;
    private boolean nameSelected;
    private Mario player = null;
    private Donkey_Kong dk = null;
    private HighScorePic highScore = null;
    private OilBucket bucket = null;
    private long score = 10;
    private long highScoreNum= 0;
    private String playerName = "";
    int p ;
    int x = 17;
    int y = 20;

    public PlayField()
    {        
        super(450, 600, 1);
        
        setPaintOrder(Mario.class, Donkey_Kong.class);
        
        initializePlayingField(); 
        
        nameSelected = true;
        player = new Mario();
        
        addObject(player, 90, 570);
        
        dk = new Donkey_Kong();
        addObject(dk ,100, 170);
        
        highScore = new HighScorePic();
        addObject(highScore, 225, 15);

        bucket = new OilBucket();
        addObject(bucket, 40, 561);
        //The Ground Mario is standing on when first intilized
        addObject(new MetalBar(), 17, 592);
        addObject(new MetalBar(), 49, 592);
        addObject(new MetalBar(), 81, 592);
        addObject(new MetalBar(), 113, 592);
        addObject(new MetalBar(), 145, 592);
        addObject(new MetalBar(), 177, 592);
        addObject(new MetalBar(), 209, 592);
        //The Ground starts to rise up
        addObject(new MetalBar(), 241, 589);
        addObject(new MetalBar(), 273, 587);
        addObject(new MetalBar(), 305, 585);
        addObject(new MetalBar(), 337, 583);
        addObject(new MetalBar(), 369, 581);
        addObject(new MetalBar(), 401, 579);
        addObject(new MetalBar(), 433, 577);
        //The First ramp moving upwards towards the left side of the screen
        addObject(new MetalBar(), 401, 525);
        addObject(new MetalBar(), 369, 523);
        addObject(new MetalBar(), 337, 521);
        addObject(new MetalBar(), 305, 519);
        addObject(new MetalBar(), 273, 517);
        addObject(new MetalBar(), 241, 515);
        addObject(new MetalBar(), 209, 513);
        addObject(new MetalBar(), 177, 511);
        addObject(new MetalBar(), 145, 509);
        addObject(new MetalBar(), 113, 507);
        addObject(new MetalBar(), 81, 505);
        addObject(new MetalBar(), 49, 503);
        addObject(new MetalBar(), 17, 501);
        //The Second ramp moving upwards towards the right side of the screen
        addObject(new MetalBar(), 49, 448);
        addObject(new MetalBar(), 81, 446);
        addObject(new MetalBar(), 113, 444);
        addObject(new MetalBar(), 145, 442);
        addObject(new MetalBar(), 177, 440);
        addObject(new MetalBar(), 209, 438);
        addObject(new MetalBar(), 241, 436);
        addObject(new MetalBar(), 273, 434);
        addObject(new MetalBar(), 305, 432);
        addObject(new MetalBar(), 337, 430);
        addObject(new MetalBar(), 369, 428);
        addObject(new MetalBar(), 401, 426);
        addObject(new MetalBar(), 433, 424);
        //The Second ramp moving upwards towards the left side of the screen
        addObject(new MetalBar(), 401, 371);
        addObject(new MetalBar(), 369, 369);
        addObject(new MetalBar(), 337, 367);
        addObject(new MetalBar(), 305, 365);
        addObject(new MetalBar(), 273, 363);
        addObject(new MetalBar(), 241, 361);
        addObject(new MetalBar(), 209, 359);
        addObject(new MetalBar(), 177, 357);
        addObject(new MetalBar(), 145, 355);
        addObject(new MetalBar(), 113, 353);
        addObject(new MetalBar(), 81, 351);
        addObject(new MetalBar(), 49, 349);
        addObject(new MetalBar(), 17, 347);
        //The Third ramp moving upwards towards the right side of the screen
        addObject(new MetalBar(), 49, 289);
        addObject(new MetalBar(), 81, 287);
        addObject(new MetalBar(), 113, 285);
        addObject(new MetalBar(), 145, 283);
        addObject(new MetalBar(), 177, 281);
        addObject(new MetalBar(), 209, 279);
        addObject(new MetalBar(), 241, 277);
        addObject(new MetalBar(), 273, 275);
        addObject(new MetalBar(), 305, 273);
        addObject(new MetalBar(), 337, 271);
        addObject(new MetalBar(), 369, 269);
        addObject(new MetalBar(), 401, 267);
        addObject(new MetalBar(), 433, 265);
        //The ramp starts to move up four blocks to the 
        addObject(new MetalBar(), 401, 212);
        addObject(new MetalBar(), 369, 210);
        addObject(new MetalBar(), 337, 208);
        addObject(new MetalBar(), 305, 206);
        addObject(new MetalBar(), 273, 204);
        //The Ground Donkeykong and the Barrells are located on when first intilized
        addObject(new MetalBar(), 241, 204);
        addObject(new MetalBar(), 209, 204);
        addObject(new MetalBar(), 241, 204);
        addObject(new MetalBar(), 209, 204);
        addObject(new MetalBar(), 177, 204);
        addObject(new MetalBar(), 145, 204);
        addObject(new MetalBar(), 113, 204); 
        addObject(new MetalBar(), 81, 204);
        addObject(new MetalBar(), 49, 204);
        addObject(new MetalBar(), 17, 204);
        //The Ground Princess Pauline is standing on
        addObject(new MetalBar(), 255, 149);
        addObject(new MetalBar(), 225, 149);
        addObject(new MetalBar(), 195, 149);
        addLadder();
        getData();
        saveData();
        if(score > highScoreNum)
        {
            showText(Long.toString(score),220,40);
        }
        else
        {
            showText(Long.toString(highScoreNum),220,40);
        }   
    }    
    public void act()
    {
        boolean playerLose= true;   
        if(nameSelected == true)
        {
            playerName = JOptionPane.showInputDialog( "Please enter your name:",null );
            nameSelected = false;
        }
        
    }
    private void initializePlayingField()
    {
        getBackground().setColor(Color.BLACK);
        getBackground().fillRect( 0, 0, getWidth() ,getHeight());
    }
    private void addLadder()
    {
        for(int i = 0; i < ladders.length; i++)
        {
            addObject(ladders[i],ladderXs[i],ladderYs[i]);
        }
    }
    public void getData()
    {
        FileInputStream fis;
        BufferedReader r = null;
        try
        { 
            fis = new FileInputStream("HighScore.txt");
            r = new BufferedReader(new InputStreamReader(fis));
            highScoreNum = Long.parseLong(r.readLine());
        }
        catch(FileNotFoundException e1)
        {
            e1.printStackTrace();
        }
        catch(IOException e2)
        {
            e2.printStackTrace();
        }
    }
    public void saveData()
    {
        if(score >  highScoreNum)
        {
            highScoreNum = score;
        }
        try
        {
            FileWriter writer = null;
            writer = new FileWriter("HighScore.txt");
            writer.write(Long.toString(highScoreNum));
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public void addBarrel()
    {
        addObject(new BarrelsSpinning(),144,190);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
    