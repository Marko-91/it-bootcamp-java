package com.itboocamp8.pozorista;

import java.util.ArrayList;

public class Predstava {
    String naziv;
    Pozoriste pozoriste;
    ArrayList<Zaposleni> zaposleni;

    public Predstava(String naziv, Pozoriste pozoriste) {
        this.naziv = naziv;
        this.pozoriste = pozoriste;
        this.zaposleni = new ArrayList<>();
    }

    public void dodajZaposlenog(Zaposleni zaposleni) {
        this.zaposleni.add(zaposleni);
    }

    public void izbaciZaposlenog(Zaposleni zaposleni) {
        this.zaposleni.remove(zaposleni);
    }

    public int getBrojZaposlenih() {
        return this.zaposleni.size();
    }

    public void opis() {
        System.out.println(this.pozoriste.getNaziv() + ", " + this.naziv);
        for (Zaposleni z: this.zaposleni) {
            System.out.println(z.toString());
        }
    }
}
