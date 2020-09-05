package com.itboocamp8.pozorista;

public class Glumac extends Zaposleni {
    String nazivUloge;

    public Glumac(String ime, Pozoriste pozoriste) {
        super(ime, pozoriste);
    }

    public String getNazivUloge() {
        return this.nazivUloge;
    }

    public void setNazivUloge(String nazivUloge) {
        this.nazivUloge = nazivUloge;
    }

    @Override
    public String getNadimak() {
        return null;
    }

    @Override
    public void setNadimak(String nadimak) {}

    @Override
    public String toString() {
        return String.format("%s_%s[%s]", nazivUloge, this.getIme(), this.getPozoriste());
    }
}
