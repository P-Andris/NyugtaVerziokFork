package nyugtaprojektek;

public class Nyugta3_v2 {
    public static int i = 0;
    public static int hossz = 20 + 1;
    public static boolean mehet = true;

    /* private static void szo(String szo) {
        System.out.print(szo);
    } */

    // Nyugta, cég
    private static void disz(String d, String sz) {
        /* for(i = 0; i < sz.length() + 6; i++) System.out.print(d);
        System.out.printf("\n%11s\n", sz);
        for(i = 0; i < sz.length() + 6; i++) System.out.print(d); */
        for(i = 0; i < hossz; i++) {
            System.out.print(d);
            if(i == hossz - 1 && mehet) {
                System.out.printf("\n%" + (hossz * 0.6) + "s\n", sz);
                i = 0;
                mehet = false;
            }
        }
        System.out.print(d);
    }

    // Egy soros díszítés
    private static void diszsor(String d) {
        for(i = 0; i < hossz; i++) System.out.print(d);
    }

    // Tételek kiíratása
    private static void tetel(String t, int ta, String pn) {
        System.out.printf("%10s: %5d %s\n", t, ta, pn);
    }

    public static void main(String[] args) {
        String csillag = "*", alsoVonal = "_", egyenlo = "=", kotojel = "-", szo;
        final String huf = " Ft", eur = " Euro";

        int tetel1 = 350, tetel2 = 90, tetel3 = 1320, osszesen = tetel1 + tetel2 + tetel3;
        int euroArfolyam = 350;

        szo = "Nyugta 3";
        disz(csillag, szo);

        szo = "Összesen";
        tetel("Tétel1", tetel1, huf);
        tetel("Tétel2", tetel2, huf);
        tetel("Tétel3", tetel3, huf);
        diszsor(egyenlo);
        System.out.printf("%10s: %d %s\n%20d %s", szo, osszesen, huf, osszesen / euroArfolyam, eur);
        diszsor(kotojel);
    }   
}
