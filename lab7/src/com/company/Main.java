package com.company;

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


public class Main {


    public static void main(String[] args) {

        RachunekBankowy saver1 = new RachunekBankowy(2000);
        RachunekBankowy saver2 = new RachunekBankowy(3000);

        System.out.println("saver1: " + saver1.getSaldo());
        System.out.println("saver2: " + saver2.getSaldo());

        System.out.println(" ");
        System.out.println("roczna stopa procentowa:");
        saver1.setRocznaStopaProcentowa(0.04);
        saver2.setRocznaStopaProcentowa(0.04);
        System.out.println(saver1.obliczMiesieczneOdsetki(saver1.getSaldo()));
        System.out.println(saver2.obliczMiesieczneOdsetki(saver2.getSaldo()));
        System.out.println("saver1: " + saver1.getSaldo());
        System.out.println("saver2: " + saver2.getSaldo());

        System.out.println(" ");
        System.out.println("roczna stopa procentowa:");
        saver1.setRocznaStopaProcentowa(0.05);
        saver2.setRocznaStopaProcentowa(0.05);
        System.out.println(saver1.obliczMiesieczneOdsetki(saver1.getSaldo()));
        System.out.println(saver2.obliczMiesieczneOdsetki(saver2.getSaldo()));
        System.out.println("saver1: " + saver1.getSaldo());
        System.out.println("saver2: " + saver2.getSaldo());



    }
}
