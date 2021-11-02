package com.company;
import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        // zad1

//        System.out.println("podaj ilosc elementow: ");
//        int n = in.nextInt();
//        double suma=0;
//
//        for (int i = 1; i <= n; i++) {
//
//            System.out.println("podaj a" + i + ": ");
//            double a = in.nextDouble();
//            suma += a;
//
//        }
//
//        System.out.println("suma wynosi: " + suma);


        // zad2

//        System.out.println("podaj ilosc elementow: ");
//        int n = in.nextInt();
//        double iloczyn=1;
//
//        for (int i = 1; i <= n; i++) {
//
//            System.out.println("podaj a" + i + ": ");
//            double a = in.nextDouble();
//            iloczyn *= a;
//
//        }
//
//        System.out.println("iloczyn wynosi: " + iloczyn);


        // zad3

//        System.out.println("podaj ilosc elementow: ");
//        int n = in.nextInt();
//        double suma=0;
//
//        for (int i = 1; i <= n; i++) {
//
//            System.out.println("podaj a" + i + ": ");
//            double a = in.nextDouble();
//            if (a<0) a=a*-1;
//            suma += a;
//
//        }
//
//        System.out.println("suma wynosi: " + suma);


        // zad4

//        System.out.println("podaj ilosc elementow: ");
//        int n = in.nextInt();
//        double suma=0;
//
//        for (int i = 1; i <= n; i++) {
//
//            System.out.println("podaj a" + i + ": ");
//            double a = in.nextDouble();
//            if (a<0) a=a*-1;
//            suma += Math.sqrt(a);
//
//        }
//
//        System.out.println("suma wynosi: " + suma);


        // zad5

//        System.out.println("podaj ilosc elementow: ");
//        int n = in.nextInt();
//        double iloczyn=1;
//
//        for (int i = 1; i <= n; i++) {
//
//            System.out.println("podaj a" + i + ": ");
//            double a = in.nextDouble();
//            if (a<0) a=a*-1;
//            iloczyn *= a;
//
//        }
//
//        System.out.println("iloczyn wynosi: " + iloczyn);


        // zad6

//        System.out.println("podaj ilosc elementow: ");
//        int n = in.nextInt();
//        double suma=0;
//
//        for (int i = 1; i <= n; i++) {
//
//            System.out.println("podaj a" + i + ": ");
//            double a = in.nextDouble();
//            suma += Math.pow(a,2);
//
//        }
//
//        System.out.println("suma wynosi: " + suma);


        // zad7

//        System.out.println("podaj ilosc elementow: ");
//        int n = in.nextInt();
//        double suma=0;
//        double iloczyn=1;
//
//        for (int i = 1; i <= n; i++) {
//
//            System.out.println("podaj a" + i + ": ");
//            double a = in.nextDouble();
//            suma += a;
//            iloczyn *= a;
//
//        }
//
//        System.out.println("suma wynosi: " + suma);
//        System.out.println("iloczyn wynosi: " + iloczyn);


        // zad8

//        System.out.println("podaj ilosc elementow: ");
//        int n = in.nextInt();
//        double suma=0;
//
//        for (int i = 1; i <= n; i++) {
//
//            System.out.println("podaj a" + i + ": ");
//            double a = in.nextDouble();
//
//            if(i%2!=0) suma += a;
//            if(i%2==0) suma -= a;
//
//
//        }
//
//
//        System.out.println("suma wynosi: " + suma);


        // zad9

//        System.out.println("podaj ilosc elementow: ");
//        int n = in.nextInt();
//        double suma=0;
//        double an=0;
//        double silnia =1;
//
//        for (int i = 1; i <= n; i++) {
//
//            System.out.println("podaj a" + i + ": ");
//            double a = in.nextDouble();
//
//            for(int j=i; j>=i; j--)
//            {
//                silnia *= i;
//                System.out.println(silnia);
//
//                if(j%2!=0) suma -= (a/silnia);
//                if(j%2==0) suma += (a/silnia);
//            }
//
//
//        }
//
//
//        System.out.println("suma wynosi: " + suma);


        // zestaw 2 -------------------------------------------

        // zad a)

//        int licznik =0;
//        System.out.println("podaj ilosc liczb do wczytania: ");
//        int n = in.nextInt();
//        for(int i=1; i<=n; i++)
//        {
//            System.out.println("podaj liczbe "+ i+ ": ");
//            double a = in.nextDouble();
//            if(a%2!=0) licznik++;
//
//        }
//
//        System.out.println("ilosc liczb nieparzystych:"+licznik);


        // zad b)

//        int licznik =0;
//        System.out.println("podaj ilosc liczb do wczytania: ");
//        int n = in.nextInt();
//        for(int i=1; i<=n; i++)
//        {
//            System.out.println("podaj liczbe "+ i+ ": ");
//            double a = in.nextDouble();
//            if((a%3==0) && (a%5!=0)) licznik++;
//
//        }
//
//        System.out.println("ilosc liczb podzielnych przez 3 i niepodzielnych przez 5:"+licznik);


        // zad c)

//        int licznik = 0;
//        System.out.println("podaj ilosc liczb do wczytania: ");
//        int n = in.nextInt();
//        for (int i = 1; i <= n; i++) {
//            System.out.println("podaj liczbe " + i + ": ");
//            double a = in.nextDouble();
//            if (Math.sqrt(a) % 2 == 0) licznik++;
//
//        }
//
//        System.out.println("kwadratow liczb parzystych:" + licznik);



        // zad f)

//        int licznik =0;
//        System.out.println("podaj ilosc liczb do wczytania: ");
//        int n = in.nextInt();
//        for(int i=1; i<=n; i++)
//        {
//            System.out.println("podaj liczbe "+ i+ ": ");
//            double a = in.nextDouble();
//            if((i%2!=0)&&(a%2==0)) licznik++;
//
//        }
//
//        System.out.println("ilosc liczb parzystych z nieparzystym numerem:"+licznik);




        // zad g)

//        int licznik =0;
//        System.out.println("podaj ilosc liczb do wczytania: ");
//        int n = in.nextInt();
//        for(int i=1; i<=n; i++)
//        {
//            System.out.println("podaj liczbe "+ i+ ": ");
//            double a = in.nextDouble();
//            if((a%2!=0)&&(a>=0)) licznik++;
//
//        }
//
//        System.out.println("ilosc liczb nieparzystych i nieujemnych:"+licznik);



        // zad h)

//        int licznik =0;
//        System.out.println("podaj ilosc liczb do wczytania: ");
//        int n = in.nextInt();
//        for(int i=1; i<=n; i++)
//        {
//            System.out.println("podaj liczbe "+ i+ ": ");
//            double a = in.nextDouble();
//            if(a<0) a*=-1;
//            if(a < (i*i)) licznik++;
//
//        }
//
//        System.out.println("ilosc liczb spelniajacych warunek:"+licznik);



        // zad2 -----------------------------------

//        int licznik =0;
//        System.out.println("podaj ilosc liczb do wczytania: ");
//        int n = in.nextInt();
//        for(int i=1; i<=n; i++)
//        {
//            System.out.println("podaj liczbe "+ i+ ": ");
//            double a = in.nextDouble();
//            if(a>0) licznik += a;
//
//        }
//
//        System.out.println("podwojona suma liczb dodatnich:"+(licznik*2));


        // zad3 ------------------------------------


//        int dodatnie =0;
//        int ujemne =0;
//        int zera =0;
//        System.out.println("podaj ilosc liczb do wczytania: ");
//        int n = in.nextInt();
//        for(int i=1; i<=n; i++)
//        {
//            System.out.println("podaj liczbe "+ i+ ": ");
//            double a = in.nextDouble();
//            if(a>0) dodatnie++;
//            if(a<0) ujemne++;
//            if(a==0) zera++;
//
//        }
//
//        System.out.println("dodatnie:"+dodatnie);
//        System.out.println("ujemne:"+ujemne);
//        System.out.println("zera:"+zera);



        // zad4 -----------------------------------




//        List<Double> list=new ArrayList<Double>();
//        System.out.println("podaj ilosc liczb do wczytania: ");
//        int n = in.nextInt();
//        for(int i=1; i<=n; i++)
//        {
//            System.out.println("podaj liczbe "+ i+ ": ");
//            double a = in.nextDouble();
//            list.add(a);
//
//        }
//
//        double minn =list.get(0);
//        double maxx =list.get(0);
//
//        for(int i=0; i<n; i++)
//        {
//            if(list.get(i)<minn) minn=list.get(i);
//            if(list.get(i)>maxx) maxx=list.get(i);
//
//        }
//
//        System.out.println("najmniejsza: "+ minn);
//        System.out.println("najwieksza: "+ maxx);



        // zad5 --------------------------------------


//        List<Double> list=new ArrayList<Double>();
//        System.out.println("podaj ilosc liczb do wczytania: ");
//        int n = in.nextInt();
//        int licznik=0;
//        for(int i=0; i<n; i++)
//        {
//            System.out.println("podaj liczbe "+ (i+1)+ ": ");
//            double a = in.nextDouble();
//            list.add(a);
//
//        }
//
//
//        for(int i=0; i<n-1; i++)
//        {
//            if(list.get(i)>0 && list.get(i+1)>0) licznik++;
//
//        }
//
//        System.out.println("ilosc par>0: "+ licznik);




    }
}
