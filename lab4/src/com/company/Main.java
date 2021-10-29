package pl.edu.uwm.wmii.alakiert.laboratorium00;
import java.lang.StringBuffer;
import java.util.Arrays;
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


        // d)

    public static String repeat(String str,int n){

        StringBuffer result = new StringBuffer();
        String result2;
        for(int i=0; i<n; i++)
        {
            result.append(str);
        }

        result2 = result.toString();
        return result2;
    }



    // e)

    public static int[] where(String str,String subStr){


        char[] str_ = str.toCharArray();
        char[] substr_ = subStr.toCharArray();
        int[] tab = new int[str_.length];
        int licznik =0;
        int number =0;


        for(int i=0; i<str_.length; i++)
        {
            if(str_[i] == substr_[0])
            {
                for(int j=0; j<substr_.length; j++)
                {

                    if(str_[j+i] == substr_[j]) licznik += 1;

                }
                if(licznik == substr_.length) tab[number] = i;
                number += 1;
                licznik = 0;
            }
        }

        int[] tab2 = new int[number];
        for(int i=0; i<number; i++)
        {
            tab2[i] = tab[i];
        }

        return tab2;
    }



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // zad 1

        // a)

//        System.out.println(countChar("Aleksandra", 'a'));
//        System.out.println(countChar("ooooo", 'o'));
//        System.out.println(" ");



        // b)

//        System.out.println(countSubStr("tak tak tak","tak" ));
//        System.out.println(countSubStr("helloblablablahellobla", "bla"));
//        System.out.println(" ");



        // c)

//        System.out.println("podaj slowo: ");
//        String zadanie_c = in.nextLine();
//        System.out.println(middle(zadanie_c));



        // d)

//        System.out.println("podaj slowo: ");
//        String zadanie_d = in.nextLine();
//        System.out.println("podaj ilosc powtorzen: ");
//        int zadanie_d_2 = in.nextInt();
//        System.out.println(repeat(zadanie_d,zadanie_d_2));



        // e)

        int[] zad_e = where("oooblaoooblaooobla","bla");
        System.out.println("substring wystepuje na tych indexach: ");
        for(int i=0; i<zad_e.length; i++)
        {
            System.out.println(zad_e[i]);
        }






    }
}
