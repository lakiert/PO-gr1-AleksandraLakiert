package pl.edu.uwm.wmii.alakiert.laboratorium00;

//import sun.security.util.Length;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc){

        Random r = new Random();
        if (n<1 || n>100){
            System.out.println("error");
        }

        else {

            System.out.println(" ");


            for (int i = 0; i < n; i++) {                //tworzenie randomowych liczb

                int ran = r.nextInt(maxWartosc - minWartosc) + minWartosc;
                tab[i] = ran;                          //wstawianie do tablicy

            }

            for (int i = 0; i < n; i++) {

                System.out.println(tab[i]);

            }
        }
    }  // generuj



    public static int ileNieparzystych(int tab[]){

        int nieparzyste=0;

        for(int i=0; i<tab.length; i++) {

            if(tab[i]%2!=0) nieparzyste +=1;

        }
        System.out.println(" ");
        return nieparzyste;

    }  // ileNieparzystych



//    public static int ileParzystych(int tab){
//
//        int parzyste=0;
//
//        for(int i=0; i<n; i++) {
//
//            if(tab[i]%2==0) parzyste +=1;
//
//        }
//        return parzyste;
//        System.out.println(" ");
//
//    }  // ileParzystych



    public static void main(String[] args) {

        System.out.println("podaj ilosc liczb: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int tab[] = new int[n];
        int minWartosc=-999;
        int maxWartosc=999;


        generuj(tab,n,minWartosc,maxWartosc);
        System.out.println("ilosc nieparzystych: " + ileNieparzystych(tab));




    }  //method main
}   //class main
