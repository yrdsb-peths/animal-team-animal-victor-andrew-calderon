import greenfoot.*;

public class MyWorld extends World {
    
    public int score = 0;
  
    int level = 1;
    
    public MyWorld() {
        super(600, 400, 1, false);
        
        createApple();
    }
    
    public  MyWorld(boolean useBanana){
        super(600, 400, 1, false);
        
        createBanana();
    }
    
    public void createBanana()
    {
        Banana banana = new Banana();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(banana, x, y);
    }
        
    
    
    public void gameOver() {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void increaseScore() {
    
        }
    
    public void createApple() {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}

