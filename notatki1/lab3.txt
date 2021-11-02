package pl.edu.uwm.wmii.alakiert.laboratorium00;

//import sun.security.util.Length;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc){

        Random r = new Random();
        System.out.println(" ");

        for (int i = 0; i < n; i++) {                //tworzenie randomowych liczb

            int ran = r.nextInt(maxWartosc - minWartosc) + minWartosc;
            tab[i] = ran;                          //wstawianie do tablicy

        }

        for (int i = 0; i < n; i++) {

            System.out.println(tab[i]);

        }
    }  // generuj



    public static int ileNieparzystych(int tab[]){

        int nieparzyste=0;

        for(int i=0; i<tab.length; i++) {

            if(tab[i]%2!=0) nieparzyste +=1;

        }
        return nieparzyste;

    }  // ileNieparzystych



    public static int ileParzystych(int tab[]){

        int parzyste=0;

        for(int i=0; i<tab.length; i++) {

            if(tab[i]%2==0) parzyste +=1;

        }
        return parzyste;


    }  // ileParzystych



    public static int ileDodatnich(int tab[]){

        int dodatnie=0;

        for(int i=0; i<tab.length; i++) {

            if(tab[i]>0) dodatnie +=1;

        }
        return dodatnie;


    }  // ileDodatnich



    public static int ileUjemnych(int tab[]){

        int ujemne=0;

        for(int i=0; i<tab.length; i++) {

            if(tab[i]<0) ujemne +=1;

        }
        return ujemne;


    }  // ileUjemnych



    public static int ileZerowych(int tab[]){

        int zerowe=0;

        for(int i=0; i<tab.length; i++) {

            if(tab[i]==0) zerowe +=1;

        }
        return zerowe;


    }  // ileZerowych



    public static int ileMaksymalnych(int tab[]){

        int maks=tab[0];
        int ilosc=0;

        for(int i=0; i<tab.length; i++) {
            if(tab[i]>maks) maks=tab[i];
        }
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i] == maks) ilosc+=1;
        }
        return ilosc;


    }  // ileMaksymalnych



    public static int sumaDodatnich(int tab[]){

        int suma_dodatnich = 0;

        for(int i=0; i< tab.length; i++) {

            if(tab[i]>0) suma_dodatnich += tab[i];

        }
        return suma_dodatnich;

    }  // sumaDodatnich


    public static int sumaUjemnych(int tab[]){

        int suma_ujemnych = 0;

        for(int i=0; i< tab.length; i++) {

            if(tab[i]<0) suma_ujemnych += tab[i];

        }
        return suma_ujemnych;

    }  // sumaUjemnych

    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[]){

        int dlugosc = 0;
        int lista[] = new int[100];

        for(int i=0; i<tab.length-1; i++)
        {
            if(tab[i]>0){
                if(tab[i+1]>0) dlugosc++;
            }
        lista[i]=dlugosc;
        }
        int maks = lista[0];
        for(int i=0; i<100; i++)
        {
            if(lista[i]>maks) maks=lista[i];
        }
        return maks+1;
    }  // dlugoscMaksymalnegoCiaguDodatnich



    public static void signum(int tab[]){

        for(int i=0; i<tab.length; i++){

            if(tab[i] > 0) tab[i]=1;
            if(tab[i] < 0) tab[i]=-1;

        }
        for(int i=0; i< tab.length; i++){

            System.out.println(tab[i]);

        }

    }  // signum


    public static void main(String[] args) {

        System.out.println("podaj ilosc liczb: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int tab[] = new int[n];
        int minWartosc=-999;
        int maxWartosc=999;

        if (n>100){
            System.out.println("error: number too big");
            return;
        }

        if (n<1){
            System.out.println("error: number too small");
            return;
        }

        generuj(tab,n,minWartosc,maxWartosc);
        System.out.println(" ");
        System.out.println("ilosc nieparzystych: " + ileNieparzystych(tab));
        System.out.println("ilosc parzystych: " + ileParzystych(tab));
        System.out.println(" ");
        System.out.println("ilosc dodatnich: " + ileDodatnich(tab));
        System.out.println("ilosc ujemnych: " + ileUjemnych(tab));
        System.out.println("ilosc zerowych: " + ileZerowych(tab));
        System.out.println(" ");
        System.out.println("ilosc powtorzen najwiekszej liczby: " + ileMaksymalnych(tab));
        System.out.println(" ");
        System.out.println("suma dodatnich: " + sumaDodatnich(tab));
        System.out.println("suma ujemnych: " + sumaUjemnych(tab));
        System.out.println(" ");
        System.out.println("dlugosc maksymalnego ciagu dodatnich: " + dlugoscMaksymalnegoCiaguDodatnich(tab));
        System.out.println(" ");
        signum(tab);




    }  //method main
}   //class main
