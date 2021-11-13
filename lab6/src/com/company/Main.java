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




    // zad3

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b)
    {

        int dlugosc = a.size()+b.size();
        ArrayList<Integer> nowy = new ArrayList<Integer>(dlugosc);

        for(int i=0; i<a.size(); i++)
        {
            for(int j=i+1; j<a.size(); j++)
            {
                int small = a.get(i);
                if (a.get(j) < small)
                {
                    a.set(i,a.get(j));
                    a.set(j,small);
                }
            }
        }
        System.out.println(a);
        for(int i=0; i<b.size(); i++)
        {
            for(int j=i+1; j<b.size(); j++)
            {
                int small = b.get(i);
                if (b.get(j) < small)
                {
                    b.set(i,b.get(j));
                    b.set(j,small);
                }
            }
        }
        System.out.println(b);



        int i = 0;
        while((a.size() > i) && (b.size() > i))
        {

            if(a.get(i)<b.get(i))
            {
                nowy.add(a.get(i));
                nowy.add(b.get(i));
            }
            else
            {
                nowy.add(b.get(i));
                nowy.add(a.get(i));
            }

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



        // zad3

        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();

        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);

        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        System.out.println(a);
        System.out.println(b);
        System.out.println(" ");
        System.out.println(mergeSorted(a,b));


    }
}
