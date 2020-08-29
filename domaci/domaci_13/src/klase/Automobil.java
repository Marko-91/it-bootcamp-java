package klase;
/*
1. Dopuniti zadatak Automobil sa predavanja tako sto se automobil kreira sa stepenom prenosa. Stepen prenosa moze da se smanji i poveca.

 */
public class Automobil {


    /* Napisati klasu Automobil. Automobil ima
        marku (polje tipa String) koje moze da se dohvati, ali ne i postavi
        model (polje tipa String) koje moze da se dohvati ali ne i postavi
        serijski broj (polje tipa int) koje moze da se dohvati ali ne i postavi
        Automobil moze da ima vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku

        Napisati glavni program koji kreira dva automobila.
        U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.
*/



    // polja, zelimo da uvek budu private
    private String marka;
    private String model;
    private int serBr;
    private String vlasnik;
    private int stepenPrenosa;


    // konstruktor, spec metoda  -> sluzi pri kreiranju objekata
    public Automobil(String marka, String model, int serBr, int stepenPrenosa){
        this.marka = marka;
        this.model = model;
        this.serBr = serBr;
        this.stepenPrenosa = stepenPrenosa;
    }

    // getter -> metoda za dohvatanje vrednosti polja
    public String getMarka(){
        return marka;
    }

    public String getModel (){
        return model;
    }

    public int getSerBr(){
        return serBr;
    }

    public String getVlasnik(){
        return vlasnik;
    }

    public int getStepenPrenosa() {
        return this.stepenPrenosa;
    }

    // setter -> metoda za postavljanje vrednosti polja
    public void setVlasnik(String vlasnik){
        this.vlasnik = vlasnik;
    }

    public void setStepenPrenosa(int stepenPrenosa) {
        if (this.stepenPrenosa + stepenPrenosa < 0 || this.stepenPrenosa + stepenPrenosa > 8) {
            System.out.println("Nemoguce je ici u minus kad menjamo brzine, kao sto je nemoguce ici preko 8 brzina za auto.");
            return;
        }
        this.stepenPrenosa += stepenPrenosa;
    }





}