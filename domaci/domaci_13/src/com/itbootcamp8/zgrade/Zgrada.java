package com.itbootcamp8.zgrade;

import java.util.Arrays;
import java.util.Scanner;

public class Zgrada {
    private String adresa;
    private int spratnost, brStanova, brStanara;
    private String[] stanari;
    public Scanner scan;

    public Zgrada(String adresa, int spratnost, int brStanova, int brStanara) {
        this.adresa = adresa;
        this.spratnost = spratnost;
        this.brStanova = brStanova;
        this.brStanara = brStanara;
        scan = new Scanner(System.in);
    }

    // Getters

    public String getAdresa() {
        return this.adresa;
    }

    public int getSpratnost() {
        return this.spratnost;
    }

    public int getBrStanova() {
        return this.brStanova;
    }

    public String getStanari() {
        return Arrays.toString(stanari);
    }

    public int getBrStanara() {
        return this.brStanara;
    }

    // Setters

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setSpratnost(int spratnost) {
        if (this.getSpratnost() + spratnost < 2) {
            System.out.println("Spratnost ne moze biti manja od 2 za zgradu");
            return;
        }

        this.spratnost += spratnost;
    }

    public void setBrStanova(int brStanova) {
        if (this.getBrStanova() + brStanova < 1) {
            System.out.println("Br stanova minimum je 1.");
            return;
        }

        this.brStanova += brStanova;
    }

    public void setStanari() {
        if (brStanara < 1)  {
            System.out.println("Broj stanara ne moze biti manji od 1.");
            return;
        }

        this.stanari = new String[this.getBrStanara()];
        for (int i = 0; i < brStanara; i++) {
            System.out.println("Unesi prezime stanara");
            stanari[i] = scan.nextLine();
        }

    }
}
