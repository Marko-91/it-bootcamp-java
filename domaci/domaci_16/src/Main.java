public class Main {
    public static void main(String[] args) {
        Ocena[] ocene;
        Ocena o1 = new Ocena(49, "Istorija", "Februar");
        Ocena o2 = new Ocena(49, "Istorija", "Februar");
        Ocena o3 = new Ocena(49, "Istorija", "Februar");
        Ocena o4 = new Ocena(100, "Istorija", "Februar");

        ocene = new Ocena[4];
        ocene[0] = o1;
        ocene[1] = o2;
        ocene[2] = o3;
        ocene[3] = o4;

        System.out.println(Ocena.prosek(ocene));
    }
}
