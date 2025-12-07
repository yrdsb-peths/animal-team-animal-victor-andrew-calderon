import greenfoot.*;

public class MyWorld extends World {
    
    public int score = 0;
    Label scoreLabel;
  
    int level = 1;
    
    public MyWorld() {
        super(600, 400, 1, false);
        
        
        // Create Label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
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
        score++;
        scoreLabel.setValue(score);
        }
    
    public void createApple() {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}

