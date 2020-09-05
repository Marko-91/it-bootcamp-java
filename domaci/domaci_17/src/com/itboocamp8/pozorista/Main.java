package com.itboocamp8.pozorista;

public class Main {
    public static void main(String[] args) {
        Pozoriste p1 = new Pozoriste(123, "Bosko Buha");
        Predstava pr1 = new Predstava("Krcko Orascis", p1);
        Zaposleni z1 = new Glumac("Petar Petrovic", p1);
        Zaposleni z2 = new Glumac("Mirko Mirkovic", p1);
        Zaposleni z3 = new Reditelj("Marko Petrovic", p1);

        System.out.println(z2.getNazivUloge());
        pr1.dodajZaposlenog(z1);
        pr1.dodajZaposlenog(z2);
        pr1.dodajZaposlenog(z3);

        z1.setNazivUloge("Sporedni Lik");
        z2.setNazivUloge("Krcko Orascic");
        z3.setNadimak("Kran");

        pr1.opis();
    }
}
