package com.company;
import java.util.LinkedList;

public class Main {


    public static void redukuj(LinkedList<String> pracownicy, int n)
    {

        for(int i=n-1; i<pracownicy.size(); i+=(n-1))
        {
            pracownicy.remove(i);
        }

    }



    public static void main(String[] args) {

        LinkedList<String> pracownicy = new LinkedList<String>();
        pracownicy.add("Kowalski");
        pracownicy.add("Nowak");
        pracownicy.add("Kowal");
        pracownicy.add("Tak");
        pracownicy.add("Kot");
        pracownicy.add("Dabrowski");
        pracownicy.add("Grabowski");

        System.out.println("pracownicy: \n" + pracownicy);
        redukuj(pracownicy,2);
        System.out.println("pracownicy po redukcji: \n" + pracownicy);


    }
}
