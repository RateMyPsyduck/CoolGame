import javax.swing.JOptionPane;

public class Bird
{
    GameArena gameArena;
    Ball bird;
    
    public Bird(Ball bird, GameArena gameArena)
    {
        this.gameArena = gameArena;
        this.bird = bird;
        //bird = new Ball(1500/3, 750/2, 50, "YELLOW");

        gameArena.addBall(bird);
        boolean hasSpacePressed=false;
        while (!hasSpacePressed){
            gameArena.pause();
            hasSpacePressed=gameArena.spacePressed();
        }

        //ball.setYPosition(750/2);
        while(true)
        {
            
                move();
            gameArena.pause();
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
                    bird.setYPosition(bird.getYPosition() - 20);
                }
                for(int i = 0; i < 10; i++)
                {
                    //gameArena.pause();
                    bird.setYPosition(bird.getYPosition() + 10/10);
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