package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Transakce koupi = new Transakce(123, "jidlo", "hranolky");

        System.out.printf(koupi.toString());

        Penezenka penezenka = new Penezenka();
        penezenka.pridejpenize(100, "kino", "zábava");
        penezenka.pridejpenize(150, "popcorn", "jídlo");

        penezenka.vypis();
        while (true) {
            System.out.println("zůstatek je" + penezenka.getZustatek());
            System.out.println("-----------");
            System.out.println("1-příjem peněz");
            System.out.println("2-příjem peněz");
            System.out.println("3-výpis všeho");
            System.out.println("0-ukončení");
            String text = scan.nextLine();
            int hodn = Integer.valueOf(text);
            if (hodn == 0)
                break;
            if (hodn == 3)
                penezenka.zadavani(scan, false);
            if (hodn == 1)
                penezenka.zadavani(scan, true);


        }
    }
}