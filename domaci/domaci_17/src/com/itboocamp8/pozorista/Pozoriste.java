package com.itboocamp8.pozorista;

public class Pozoriste {
    int id;
    String naziv;

    public Pozoriste(int id, String naziv) {
        this.id = id;
        this.naziv = naziv;
    }

    public int getId() {
        return id;
    }

    public String getNaziv() {
        return naziv;
    }

    @Override
    public String toString() {
        return String.format("%s[%s]", naziv, id);
    }
}
