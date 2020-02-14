import javax.swing.JOptionPane;

public class Bird
{
    GameArena gameArena;
    Ball bird;
    
    Bird(Ball bird, GameArena gameArena)
    {
        this.gameArena = gameArena;
        this.bird = bird;
        //bird = new Ball(1500/3, 750/2, 50, "YELLOW");

        gameArena.addBall(bird);

        while(true)
        {
            if(gameArena.spacePressed())
            {
                move();
            }
        }
            
    }

    void move()
    {
        while(inBounds())
        {
            if(inBounds())
            {
                if(gameArena.spacePressed())
                {
                    bird.setYPosition(bird.getYPosition() - 50);
                }
                for(int i = 0; i < 10; i++)
                {
                    //gameArena.pause();
                    bird.setYPosition(bird.getYPosition() + 25/10);
                } 
                gameArena.pause();     
            }
            else
            {
                //JOptionPane.showMessageDialogue("You lose!");
            }
        }
    }

    boolean inBounds()
    {
        if((int)bird.getYPosition() < gameArena.getArenaHeight() && (int)bird.getYPosition() > 0)
        {
                return true;
        }
        else
        {
            return false;
        }
    }
}