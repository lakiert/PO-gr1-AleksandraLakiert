package com.company;
import java.util.ArrayList;

public class Main {




    // zad1

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b)
    {

        ArrayList<Integer> nowy = new ArrayList<Integer>();

        nowy.addAll(a);
        nowy.addAll(b);

        return nowy;

    }



    // zad2

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {

        int dlugosc = a.size()+b.size();
        ArrayList<Integer> nowy = new ArrayList<Integer>(dlugosc);


        int i = 0;
        while((a.size() > i) && (b.size() > i))
        {
            nowy.add(a.get(i));
            nowy.add(b.get(i));
            i++;
        }
        if(a.size()>i)
        {

            while(a.size() > i)
            {
                nowy.add(a.get(i));
                i++;
            }

        }
        else if(b.size()>i)
        {

            while(b.size() > i)
            {
                nowy.add(b.get(i));
                i++;
            }

        }
        else
        {
            return nowy;
        }


        return nowy;

    }



    public static void main(String[] args) {


        // zad1

//    ArrayList<Integer> a = new ArrayList<Integer>();
//    ArrayList<Integer> b = new ArrayList<Integer>();
//
//    a.add(1);
//    a.add(4);
//    a.add(9);
//    a.add(16);
//
//    b.add(9);
//    b.add(7);
//    b.add(4);
//    b.add(9);
//    b.add(11);
//
//    System.out.println(a);
//    System.out.println(b);
//    System.out.println(append(a,b));





        

        // zad2

//    ArrayList<Integer> a = new ArrayList<Integer>();
//    ArrayList<Integer> b = new ArrayList<Integer>();
//
//    a.add(1);
//    a.add(1);
//    a.add(1);
//    a.add(1);
//
//
//    b.add(0);
//    b.add(0);
//    b.add(0);
//    b.add(0);
//    b.add(0);
//    b.add(0);
//    b.add(0);
//
//    System.out.println(a);
//    System.out.println(b);
//    System.out.println(merge(a,b));




    }
}
