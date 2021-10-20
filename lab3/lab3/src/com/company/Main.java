package com.company;
import sun.security.util.Length;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int min = -999;
        int max = 999;


        System.out.println("podaj ilosc liczb do wypisania: ");
        int n = in.nextInt();
        if (n <1  || n > 100)
            System.out.println("error");
        else{

            System.out.println(" ");

            int[] tab = new int[n];

            for(int i=0; i<n; i++) {                //tworzenie randomowych liczb

                int ran = r.nextInt(max-min)+min;
                tab[i] = ran;                          //wstawianie do tablicy

            }

            for(int i=0; i<n; i++) {

                System.out.println(tab[i]);

            }


            System.out.println(" ");

            // ilosc nieparzystych oraz parzystych
            int nieparzyste=0;
            int parzyste=0;

            for(int i=0; i<n; i++) {

                if(tab[i]%2==0) parzyste +=1;
                if(tab[i]%2!=0) nieparzyste +=1;

            }
            System.out.println("ilosc nieparzystych: " + nieparzyste);
            System.out.println("ilosc parzystych: " + parzyste);


            System.out.println(" ");


            // ilosc dodatnich, ujemnych, zerowych
            int ujemne=0;
            int dodatnie=0;
            int zerowe=0;


            for(int i=0; i<n; i++) {

                if(tab[i]>0) dodatnie +=1;
                if(tab[i]<0) ujemne +=1;
                if(tab[i]==0) zerowe +=1;


            }
            System.out.println("ilosc dodatnich: " + dodatnie);
            System.out.println("ilosc ujemnych: " + ujemne);
            System.out.println("ilosc zerowych: " + zerowe);


            System.out.println(" ");


            // najwiekszy plus ile razy wystepuje
            int najwiekszy=tab[0];
            int najwiekszy_licznik=0;

            for(int i=0; i<n; i++) {

                if(tab[i]>najwiekszy) najwiekszy=tab[i];

            }
            for(int i=0; i<n; i++) {

                if(tab[i]==najwiekszy) najwiekszy_licznik += 1;

            }
            System.out.println("najwieksza liczba: " + najwiekszy);
            System.out.println("ilosc wystapien: " + najwiekszy_licznik);


            System.out.println(" ");


            //suma ujemnych i suma dodatnich
            int suma_ujemnych = 0;
            int suma_dodatnich = 0;


            for(int i=0; i<n; i++) {

                if(tab[i]<0) suma_ujemnych += tab[i];
                if(tab[i]>0) suma_dodatnich += tab[i];

            }
            System.out.println("suma ujemnych: " + suma_ujemnych);
            System.out.println("suma dodatnich: " + suma_dodatnich);


            System.out.println(" ");



            //dlugosc najdluzszego dodatniego
            int dlugosc=0;
            int licz_dod=0;


            for(int i=0; i<n; i++) {
                if(tab[i]>0) licz_dod +=1;
            }


            int[] tab_dlugosci = new int[licz_dod];


            for(int i=0; i<n; i++) {

                if(tab[i]>0){
                    String liczbastring = String.valueOf(tab[i]);
                    dlugosc = liczbastring.length();

                    for(int j=0; j<licz_dod; j++){
                        tab_dlugosci[j] = dlugosc;
                    }

                }

            }

            int max_dlugosc=tab_dlugosci[0];

            for(int i=0; i<licz_dod; i++){
                if(tab_dlugosci[i] > max_dlugosc) max_dlugosc = tab_dlugosci[i];
            }

            System.out.println("dlugosc najdluzszej liczby: " + max_dlugosc);




            // 1 lub -1

            for(int i=0; i<n; i++){

                if(tab[i] > 0) tab[i]=1;
                if(tab[i] < 0) tab[i]=-1;

            }
            for(int i=0; i<n; i++){

                System.out.println(tab[i]);

            }


            // lewy i prawy

            System.out.println("podaj lewy (1 <= lewy < n)  : ");
            int lewy = in.nextInt();
            if(lewy <1 || lewy >n) System.out.println("error");
            else {


                System.out.println("podaj prawy (1 <= prawy < n)  : ");
                int prawy = in.nextInt();
                if (prawy < 1 || prawy > n) System.out.println("error");
                else {


                    int rozmiar = (prawy - lewy)+1;
                    System.out.println(rozmiar);
                    int[] fragment = new int[rozmiar];


                    for(int i=lewy; i<=prawy; i++){

                        for(int j=0; j<rozmiar; j++){
                            fragment[j]=tab[i];
                        }
                    }

                    System.out.println(" ");
                    for(int i=0; i<rozmiar; i++){
                        System.out.println(fragment[i]);
                    }



                }
            }















        }



    }
}
