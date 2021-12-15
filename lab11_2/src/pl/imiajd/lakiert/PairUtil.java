package pl.imiajd.lakiert;

public class PairUtil extends Pair {


    public PairUtil(int x, int y)
    {
        super(x,y);
    }

    public <T> Pair PairUtil_swap(Pair para)
    {

        para.swap();
        return para;
    }

}
