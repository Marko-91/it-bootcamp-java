package com.itboocamp8.pozorista;

public abstract class Zaposleni {
    String ime;
    Pozoriste pozoriste;

    public Zaposleni(String ime, Pozoriste pozoriste) {
        this.ime = ime;
        this.pozoriste = pozoriste;
    }

    public String getIme() {
        return ime;
    }

    public abstract String getNazivUloge();
    public abstract void setNazivUloge(String nazivUloge);
    public abstract String getNadimak();
    public abstract void setNadimak(String nadimak);

    public Pozoriste getPozoriste() {
        return pozoriste;
    }
}
