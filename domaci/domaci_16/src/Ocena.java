public class Ocena {
    private int poeni;
    private String predmet, rok;

    public Ocena(int poeni, String predmet, String rok) {
        this.poeni = poeni;
        this.predmet = predmet;
        this.rok = rok;
    }

    public int getPoeni() {
        return this.poeni;
    }

    public static int oceni(int poeni) {
        if (poeni <= 50) return 5;
         else if (poeni >= 51 && poeni < 61) return 6;
         else if (poeni >= 61 && poeni < 71) return 7;
         else if (poeni >= 71 && poeni < 81) return 8;
         else if (poeni >= 81 && poeni < 91) return 9;

        return 10;
    }

    public static float prosek(Ocena[] ocene) {
        int l = ocene.length;
        float sum = 0;
        for (Ocena ocena : ocene) {
            sum += oceni(ocena.getPoeni());
        }

        return Math.round(sum / l);
    }
}
