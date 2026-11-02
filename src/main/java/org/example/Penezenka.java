package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Penezenka {
    private double zustatek=0;
    private ArrayList <Transakce> historie = new ArrayList <>();


    public void pridejpenize(int castka, String popis, String kategorie){
        Transakce transakce = new Transakce(castka,kategorie,popis);
        historie.add(transakce);
        zustatek=zustatek + castka;
    }
    public void vypis() {
        for (int i = 0; i < historie.size(); i++) {
            Transakce trans = historie.get(i);
            System.out.printf(trans.getCastka() + " " + trans.getPopis());
        }
    }
    public void zadavani(Scanner scanner, boolean je_utrata){
            if(je_utrata)
                System.out.printf("Platba");
            else
                System.out.printf("příjem penez");

            System.out.println("zadej částku");
            int c=scanner.nextInt();
            scanner.nextLine();

            System.out.printf("popiš mi to");
            String p=scanner.nextLine();
            scanner.nextLine();

            System.out.println("popiš tu kategorii");
            String k=scanner.nextLine();

            pridejpenize(c,p,k);


    }

    public double getZustatek() {
        return zustatek;
    }
}








