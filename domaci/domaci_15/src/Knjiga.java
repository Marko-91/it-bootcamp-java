public class Knjiga {
    private String naziv;
    private Autor autor;
    private int god, brStr;

    public Knjiga(String naziv, Autor autor, int god, int brStr) {
        this.naziv = naziv;
        this.autor = autor;
        this.god = god;
        this.brStr = brStr;
    }

    public String getNaziv() {
        return naziv;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getGod() {
        return god;
    }

    public int getBrStr() {
        return brStr;
    }

    public void setGod(int god) {
        this.god = god;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "naziv='" + naziv + '\'' +
                ", autor=" + autor.toString() +
                ", god=" + god +
                ", brStr=" + brStr +
                '}';
    }
}
