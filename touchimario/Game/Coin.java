import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Object Coi
 * 
 * @author (Gion Felchlin, Leandro Mansch, Till Bischof) 
 * @version (1.0.1)
 */
public class Coin extends Actor
{
    GifImage coinAnimation = new GifImage("coin.gif"); //Erzeugen eines Objektes für die Animation

    public void act()
    {
        //Abruf der Methode
        coinAnimation();
    }
    
    private void coinAnimation(){
        setImage(coinAnimation.getCurrentImage()); //Setze das Gif   
        
    
    }
}
