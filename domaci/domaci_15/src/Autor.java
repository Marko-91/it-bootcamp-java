public class Autor {
    private final String ime, prezime;
    private final int god;

    public Autor(String ime, String prezime, int god) {
        this.ime = ime;
        this.prezime = prezime;
        this.god = god;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGod() {
        return god;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }
}
