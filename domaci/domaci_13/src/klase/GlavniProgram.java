package klase;

//import com.sun.xml.internal.ws.api.pipe.helper.AbstractFilterTubeImpl;

import java.util.Scanner;

public class GlavniProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Automobil a1 = new Automobil( "Audi", "A3", 12345, 5);
        a1.setVlasnik("Pera Peric");
        System.out.println(a1.getMarka());
        System.out.println(a1.getModel());
        System.out.println(a1.getSerBr());
        System.out.println(a1.getVlasnik());

        Automobil a2 = new Automobil("Alfa", "GT", 6789, 6);
        a2.setVlasnik("Mika Mikic");
        System.out.println(a2.getMarka());
        System.out.println(a2.getModel());
        System.out.println(a2.getSerBr());
        System.out.println(a2.getVlasnik());

        System.out.println(a2.getStepenPrenosa());
        a2.setStepenPrenosa(-10);
        System.out.println(a2.getStepenPrenosa());
        a2.setStepenPrenosa(-4);
        System.out.println(a2.getStepenPrenosa());

    }


}