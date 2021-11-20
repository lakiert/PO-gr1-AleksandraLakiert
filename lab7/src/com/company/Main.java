package com.company;
import java.util.Arrays;



// zad1   ///////////////////////////////

class RachunekBankowy {


    private static double rocznaStopaProcentowa;
    private double saldo;


    RachunekBankowy(double saldo)
    {
        this.saldo = saldo;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void setRocznaStopaProcentowa(double rocznaStopaProcentowa)
    {
        this.rocznaStopaProcentowa = rocznaStopaProcentowa;
    }

    public double obliczMiesieczneOdsetki(double saldo)
    {
        double odsetki = saldo*rocznaStopaProcentowa/12;
        this.saldo +=odsetki;
        return odsetki;

    }




}





// zad2   ///////////////////////////////


class IntegerSet {

    private boolean[] set;

    IntegerSet() {
        this.set = new boolean[100];
        Arrays.fill(this.set, false);

    }


    public static IntegerSet union(IntegerSet set1, IntegerSet set2){
        IntegerSet set = new IntegerSet();
        for(int i = 0; i<=set1.set.length-1; i++){
            if(set1.set[i]  || set2.set[i]){
                set.set[i] = true;
            }
            if(!set1.set[i] && !set2.set[i]){
                set.set[i] = false;
            }


        }

        return set;
    }

    public static IntegerSet intersection(IntegerSet set1,IntegerSet set2){

        IntegerSet set = new IntegerSet();
        for(int i = 0; i<=set1.set.length-1; i++){
            if(set1.set[i] == set2.set[i]){
                set.set[i] = set1.set[i];
            }
            if(set1.set[i] != set2.set[i])
                set.set[i] = false;



        }

        return set;

    }


    public void insertElement(int n){
        if(n<=100)
            this.set[n-1] = true;

    }

    public void deleteElement(int n){
        if(n <= 100)
            this.set[n-1] = false;
    }

    public String toString(){
        String str = "";

        for(int i = 0; i <= this.set.length-1; i++){
            if(this.set[i])
                str += i+1 + " ";

        }

        return str;
    }

    public  boolean equals(IntegerSet set2) {
        boolean spr = true;

        if (this.set.length == set2.set.length) {
            for (int i = 0; i <= this.set.length-1; i++) {
                if (this.set[i] != set2.set[i])
                    spr = false;

            }

        }
        return spr;

    }

}










public class Main {


    public static void main(String[] args) {




        // zad1    /////////////////////////////////////////


//        RachunekBankowy saver1 = new RachunekBankowy(2000);
//        RachunekBankowy saver2 = new RachunekBankowy(3000);
//
//        System.out.println("saver1: " + saver1.getSaldo());
//        System.out.println("saver2: " + saver2.getSaldo());
//
//        System.out.println(" ");
//        System.out.println("roczna stopa procentowa:");
//        saver1.setRocznaStopaProcentowa(0.04);
//        saver2.setRocznaStopaProcentowa(0.04);
//        System.out.println(saver1.obliczMiesieczneOdsetki(saver1.getSaldo()));
//        System.out.println(saver2.obliczMiesieczneOdsetki(saver2.getSaldo()));
//        System.out.println("saver1: " + saver1.getSaldo());
//        System.out.println("saver2: " + saver2.getSaldo());
//
//        System.out.println(" ");
//        System.out.println("roczna stopa procentowa:");
//        saver1.setRocznaStopaProcentowa(0.05);
//        saver2.setRocznaStopaProcentowa(0.05);
//        System.out.println(saver1.obliczMiesieczneOdsetki(saver1.getSaldo()));
//        System.out.println(saver2.obliczMiesieczneOdsetki(saver2.getSaldo()));
//        System.out.println("saver1: " + saver1.getSaldo());
//        System.out.println("saver2: " + saver2.getSaldo());




        // zad2    /////////////////////////////////////////


//        IntegerSet set1 = new IntegerSet();
//        IntegerSet set2 = new IntegerSet();
//        IntegerSet set3 = new IntegerSet();
//        set1.insertElement(10);
//        set1.insertElement(20);
//        set1.insertElement(30);
//
//        set2.insertElement(10);
//        set2.insertElement(15);
//        set2.insertElement(20);
//
//        set3.insertElement(10);
//        set3.insertElement(20);
//        set3.insertElement(30);
//
//        System.out.println(set1);
//        System.out.println(set2);
//
//        set2.deleteElement(15);
//
//        System.out.println(set2);
//
//        System.out.println(IntegerSet.union(set1, set2));
//
//        System.out.println((IntegerSet.intersection(set1, set2)));
//
//        System.out.println(set1.equals(set3));
//        System.out.println(set1.equals(set2));

    }
}
