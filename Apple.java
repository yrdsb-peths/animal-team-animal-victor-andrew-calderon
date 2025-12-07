import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Desc: apple will fall down from random areas of the map, the player must eat/collect them before they fall to the
   ground, or else the game will end and the player loses.
 * 
 * @author (your name) Andrew
 * @version (a version number or a date)1.0
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + 3);

        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight()) {

            world.gameOver();
            world.removeObject(this);
        }
    }
}

