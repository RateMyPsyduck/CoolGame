public class Driver
{
    public static void main(String args[])
    {
        GameArena gameArena = new GameArena(1500,750);
        Ball bird = new Ball(1500/3, 750/2, 50, "YELLOW");
        Bird control = new Bird(bird, gameArena);
    }
}