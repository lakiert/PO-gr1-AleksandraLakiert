package com.company;



class RachunekBankowy {

    static double rocznaStopaProcentowa;
    private double saldo;


    public double getSaldo()
    {
        return saldo;
    }


    public RachunekBankowy(double saldo)
    {
        this.saldo = saldo;
    }


// //   public double setSaldo(double saldo)
// //   {
// //       saldo = this.saldo;
// //       return saldo;
// //   }



    public static double obliczMiesieczneOdsetki(double saldo) {

    double odsetki = (saldo * rocznaStopaProcentowa)/12 ;
    saldo += odsetki;  ////////////////////////////////////////////////////
    return odsetki;
    }


    public static double setRocznaStopaProcentowa(double x) {

    rocznaStopaProcentowa = x;
    return rocznaStopaProcentowa;
    }

}


public class Main {


    public static void main(String[] args) {

        RachunekBankowy saver1 = new RachunekBankowy(2000);
        RachunekBankowy saver2 = new RachunekBankowy(3000);


        System.out.println(RachunekBankowy.setRocznaStopaProcentowa(0.04));
        System.out.println(RachunekBankowy.obliczMiesieczneOdsetki(saver1.getSaldo()));
        System.out.println(RachunekBankowy.obliczMiesieczneOdsetki(saver2.getSaldo()));
        System.out.println("saver1: " + saver1.getSaldo());
        System.out.println("saver2: " + saver2.getSaldo());



    }
}
