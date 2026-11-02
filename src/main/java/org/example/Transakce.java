package org.example;

public class Transakce {
    private double castka;
    private String kategorie;
    private String popis;

    public Transakce(double castka, String kategorie, String popis) {
        this.castka = castka;
        this.kategorie = kategorie;
        this.popis = popis;
    }

    public double getCastka() {
        return castka;
    }

    public String getKategorie() {
        return kategorie;
    }

    public String getPopis() {
        return popis;
    }

    @Override
    public String toString() {
        return "Transakce{" +
                "castka=" + castka +
                ", kategorie='" + kategorie + '\'' +
                ", popis='" + popis + '\'' +
                '}';
    }
}
