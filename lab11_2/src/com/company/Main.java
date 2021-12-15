package com.company;
import pl.imiajd.lakiert.Pair;
import pl.imiajd.lakiert.PairUtil;

public class Main {

    public static void main(String[] args) {

        Pair para1 = new Pair(5,8);

        System.out.println(para1.x);
        System.out.println(para1.y);


        para1.show();
        para1.swap();
        para1.show();

        PairUtil p2 = new PairUtil(1,2);
        p2.PairUtil_swap(para1);

        para1.show();






    }

}
