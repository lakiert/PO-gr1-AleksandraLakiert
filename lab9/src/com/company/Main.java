package com.company;
import pl.imiajd.lakiert.*;
import java.util.ArrayList;


public class Main {



    public static void main(String[] args) {

        ArrayList<Instrument> orkiestra = new ArrayList<Instrument>();
        Flet flet = new Flet();
        Fortepian fortepian = new Fortepian();
        Skrzypce skrzypce = new Skrzypce();

        orkiestra.add(flet);
        orkiestra.add(fortepian);
        orkiestra.add(skrzypce);
        orkiestra.add(flet);
        orkiestra.add(flet);


        for(int i=0; i<orkiestra.size(); i++)
        {
          orkiestra.get(i).dzwiek();
        }


    }
}
