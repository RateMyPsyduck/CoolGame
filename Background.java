public class Background
{
    public static void main (String [] args)
    {
        GameArena arena = new GameArena(1500, 750);

        Rectangle grass = new Rectangle(0, 650, 1500, 100, "GREEN");

        Rectangle[] pipes = new Rectangle[4];

        pipes[0] = new Rectangle(1000, 250, 100, 1000, "CYAN"); 
        pipes[1] = new Rectangle(1500, 250, 100, 1000, "RED"); 
        pipes[2] = new Rectangle(2000, 250, 100, 1000, "MAGENTA"); 
        pipes[3] = new Rectangle(2500, 250, 100, 1000, "WHITE"); 

        arena.addRectangle(grass);

        for (int i = 0; i < 4; i++)
        {
            arena.addRectangle(pipes[i]);
        }
  
        while(true)
        {
            for(int i = 0; i < 4; i++)
            {
                pipes[i].setXPosition​(pipes[i].getXPosition() - 5);

                if (pipes[i].getXPosition() < 0)
                {
                    pipes[i].setXPosition​(2000);
                }

            }
            arena.pause();    
        }
    }
}