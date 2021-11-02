package pl.edu.uwm.wmii.alakiert.laboratorium00;
import java.lang.StringBuffer;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.io.FileReader;
import java.math.BigInteger;
import java.math.BigDecimal;


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




    // f)

    public static String change(String str){

        StringBuffer newstr = new StringBuffer();
        newstr.append(str);
        for(int i=0; i<str.length(); i++)
        {
            if(Character.isLowerCase(str.charAt(i))) newstr.setCharAt(i,Character.toUpperCase(str.charAt(i)));

            else if(Character.isUpperCase(str.charAt(i))) newstr.setCharAt(i,Character.toLowerCase(str.charAt(i)));

        }

        String wynik = newstr.toString();



        return wynik;

    }


// ---------------------------------------------------------


    // zad 2

    public static int ile(String plik, char znak) throws Exception{

        int licznik =0;
        try
        {

            FileReader fr = new FileReader(plik);
            StringBuilder tresc = new StringBuilder();
            int i;
            while((i=fr.read())!=-1)
            {
                tresc.append((char)i);
                if((char)i == znak) licznik ++;
            }

            fr.close();
            System.out.println(tresc);

        }
        catch (FileNotFoundException ex)
        {
            System.out.println("file not found");
        }

    return licznik;


    }



    // zad 3

    public static int ile_v2(String plik, String wyraz) throws Exception{

        int licznik =0;
        try
        {

            FileReader fr = new FileReader(plik);
            StringBuilder tresc = new StringBuilder();
            int i;
            while((i=fr.read())!=-1)
            {
                tresc.append((char)i);
            }

            fr.close();
            System.out.println(tresc);
            String[] lista = tresc.toString().split(" ");

            for(int j=0; j<lista.length; j++)
            {
                if(lista[j].equals(wyraz)) licznik++;
            }


        }
        catch (FileNotFoundException ex)
        {
            System.out.println("file not found");
        }

        return licznik;


    }



// ---------------------------------------------------------



    // zad 4

    public static BigInteger szachownica(int n){

        BigInteger a = new BigInteger("2");
        BigInteger suma = new BigInteger("0");
        BigInteger result = new BigInteger("0");

        for(int i=0; i<(n*n); i++)
        {
            result = a.pow(i);
            suma = suma.add(result);

        }

        return suma;

    }



    public static void main(String[] args)  throws Exception  {

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

//        int[] zad_e = where("oooblaoooblaooobla","bla");
//        System.out.println("substring wystepuje na tych indexach: ");
//        for(int i=0; i<zad_e.length; i++)
//        {
//            System.out.println(zad_e[i]);
//        }



        // f)

//        System.out.println(change("Hello World"));
//        System.out.println(change("AAAaaa.!!!"));




// ---------------------------------------------------------



        // zad 2

//        int ilosc = ile("dokument.txt", 'a');
//        System.out.println("znak pojaiwa sie " + ilosc + " razy");



        // zad 3

//        int ilosc = ile_v2("dokument2.txt", "tak");
//        System.out.println("wyraz pojaiwa sie " + ilosc + " razy");





// ---------------------------------------------------------


        // zad 4

//        System.out.println(szachownica(3));
//        System.out.println(szachownica(2));
//        System.out.println(szachownica(5));




    }
}
