public class Background
{
    private  GameArena arena;

    public static void main (String [] args)
    {
        Background b = new Background();
        b.init();
    }


    public void init()
    {
        int max = 750;
        int min = 100;

        arena = new GameArena(1500, 750);

        Rectangle grass = new Rectangle(0, 650, 1500, 100, "GREEN");

        Rectangle[] pipes = new Rectangle[8];

        pipes[0] = new Rectangle(1000, 250, 100, 650, "CYAN"); 
        pipes[1] = new Rectangle(1500, 550, 100, 650, "RED"); 
        pipes[2] = new Rectangle(2000, 150, 100, 650, "MAGENTA"); 
        pipes[3] = new Rectangle(2500, 400, 100, 650, "WHITE"); 

        pipes[4] = new Rectangle(1000, -500, 100, 650, "CYAN"); 
        pipes[5] = new Rectangle(1500, -200, 100, 650, "RED"); 
        pipes[6] = new Rectangle(2000, -600, 100, 650, "MAGENTA"); 
        pipes[7] = new Rectangle(2500, -350, 100, 650, "WHITE"); 

        arena.addRectangle(grass);

        for (int i = 0; i < 4; i++)
        {
            arena.addRectangle(pipes[i]);
            arena.addRectangle(pipes[i+4]);
        }
  
        while(true)
        {
            for(int i = 0; i < 4; i++)
            {
                pipes[i].setXPosition​(pipes[i].getXPosition() - 5);
                pipes[i+4].setXPosition​(pipes[i].getXPosition() - 5);
                

                if (pipes[i].getXPosition() < 0)
                {
                    pipes[i].setXPosition​(2000);
                    pipes[i].setYPosition​(Math.random() * (max - min + 1) + min);
                    pipes[i+4].setXPosition​(2000);
                    pipes[i+4].setYPosition​(pipes[i].getYPosition() -750);
                }

            }
            arena.pause();    
        }
    }
}