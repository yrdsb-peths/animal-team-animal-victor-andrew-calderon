import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
<<<<<<< HEAD
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() <= world.getHeight())
        {
=======
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight()) {
>>>>>>> e76c94f3a5b83c4d391e8f73a1e8c7ad4156d26f
            world.gameOver();
            world.removeObject(this);
        }
    }
}

