package com.itboocamp8.pozorista;

public class Reditelj extends Zaposleni {
    String nadimak;

    public Reditelj(String ime, Pozoriste pozoriste) {
        super(ime, pozoriste);
    }

    @Override
    public String getNazivUloge() {
        return null;
    }

    @Override
    public void setNazivUloge(String nazivUloge) {}

    public String getNadimak() {
        return nadimak;
    }

    public void setNadimak(String nadimak) {
        this.nadimak = nadimak;
    }

    public String toString() {
        return String.format("%s_%s[%s]", nadimak, this.getIme(), this.getPozoriste());
    }
}
