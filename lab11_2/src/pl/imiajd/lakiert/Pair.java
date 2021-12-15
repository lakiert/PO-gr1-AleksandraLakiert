package pl.imiajd.lakiert;

public class Pair {

    public int x;
    public int y;

    public Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void show()
    {
        System.out.println("(x: " + this.x + ", y: " + this.y + ")");
    }

    public <T> void swap()
    {
        int temp = x;
        x = y;
        y = temp;
    }


}
