package com.company;
import java.lang.StringBuffer;
import java.util.Scanner;


public class Main {

    // zad 1

    // a)
    public static int countChar(String str,char c){

        int len = str.length();
        int licznik = 0;

        for(int i=0; i<len; i++)
        {
            if (str.charAt(i) == c) licznik +=1;
        }
        return licznik;

    }



    // b)
    public static int countSubStr(String str,String SubStr){

        int len = str.length();
        int licznik = 0;

        licznik = str.split(SubStr, -1).length-1;
        return licznik;

    }


    // c)
    public static String middle(String str){


        StringBuffer wynik = new StringBuffer();
        StringBuffer sb = new StringBuffer();
        char c;
        String end;

        if(str.length()%2==0)
        {
            int polowa = ((str.length() / 2)-1);
            c = str.charAt(polowa);
            wynik = sb.append(c);
            c = str.charAt(polowa+1);
            wynik = sb.append(c);

            end = wynik.toString();

        }
        else
        {

            int polowa = ((str.length()-1) / 2);
            c = str.charAt(polowa);
            wynik = sb.append(c);
            end = wynik.toString();

        }

        return end;
    }



    public static void main(String[] args) {



        // zad 1

        // a)
        System.out.println(countChar("Aleksandra", 'a'));
        System.out.println(countChar("ooooo", 'o'));

        System.out.println(" ");

        // b)
        System.out.println(countSubStr("tak tak tak","tak" ));
        System.out.println(countSubStr("helloblablablahellobla", "bla"));

        System.out.println(" ");

        // c)
        Scanner in = new Scanner(System.in);
        System.out.println("podaj slowo: ");
        String zadanie_c = in.nextLine();
        System.out.println(middle(zadanie_c));


    }
}
