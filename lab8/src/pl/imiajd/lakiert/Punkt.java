package pl.imiajd.lakiert;

public class Punkt {


    private int x, y;

    Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void show() {
        System.out.println("< " + x + " , " + y + " >");
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }


}
