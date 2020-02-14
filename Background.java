public class Background
{
    public static void main (String [] args)
    {
        GameArena arena = new GameArena(2000, 1000);

        Ball tinyBall = new Ball(1000, 500, 50, "CYAN");

        arena.addBall(tinyBall);

        //Rectangle bottom = new Rectangle(2000)

        while(true)
        {
            
            while (arena.downPressed())
            {
                tinyBall.setYPosition(tinyBall.getYPosition() + 5);
                arena.pause();

                if (arena.getArenaHeight() == tinyBall.getYPosition())
                {
                    tinyBall.setYPosition(tinyBall.getYPosition() - 5);
                    arena.pause();
                }
            }

            while (arena.leftPressed())
            {
                tinyBall.setXPosition(tinyBall.getXPosition() - 5);
                arena.pause();

                if (tinyBall.getXPosition() == 0)
                {
                    tinyBall.setXPosition(tinyBall.getXPosition() + 5);
                    arena.pause();
                }
            }

            while (arena.rightPressed())
            {
                tinyBall.setXPosition(tinyBall.getXPosition() + 5);
                arena.pause();

                if (tinyBall.getXPosition() == arena.getArenaWidth())
                {
                    tinyBall.setXPosition(tinyBall.getXPosition() - 5);
                    arena.pause();
                }
            }

            while (arena.upPressed())
            {
                tinyBall.setYPosition(tinyBall.getYPosition() - 5);
                arena.pause();

                if (tinyBall.getYPosition() == 0)
                {
                    tinyBall.setYPosition(tinyBall.getYPosition() + 5);
                    arena.pause();
                }
            }


            arena.pause();    
        }
    }
}