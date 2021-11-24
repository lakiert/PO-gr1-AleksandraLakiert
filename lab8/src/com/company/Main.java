// https://drive.google.com/file/d/1rYu863cK4ODiOzt787mZoXPaDut2--I2/view

package com.company;
import pl.imiajd.lakiert.Punkt;
import pl.imiajd.lakiert.NazwanyPunkt;

public class Main {

    public static void main(String[] args) {

        System.out.println("hello");
        Punkt pkt = new Punkt(5,8);
        pkt.show();

        System.out.println(pkt.x());
        System.out.println(pkt.y());

        NazwanyPunkt pkt2 = new NazwanyPunkt(15,18, "punkt_v2");
        pkt2.show();


    }
}
