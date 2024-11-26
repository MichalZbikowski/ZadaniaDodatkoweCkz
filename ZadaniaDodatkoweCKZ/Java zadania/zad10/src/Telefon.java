public class Telefon {
    private String nrTel;
    private int lacznyCzas;
    private static double cenaRozmowy = 0.48;

    Telefon (String numer) {
        nrTel = numer;
    }

    Telefon () {
    }

    double obliczKwoteDoZaplaty () {
        return cenaRozmowy*(lacznyCzas/60);
    }

    static void ustawCeneRozmowy (double nowaCena) {
        cenaRozmowy = nowaCena;
    }

    void zadzwon (String nr) {
        System.out.println("Dzwonie do:" + nr);
        System.out.println("Rozmowa w toku...");
        int czasRozmowy = (int) (Math.random()*3600);
        lacznyCzas = lacznyCzas + czasRozmowy;
        System.out.println("Rozmowa zakonczona.");
        System.out.print("Czas rozmowy:"+ czasRozmowy/60 + "min," + czasRozmowy%60 + "sek.");
        }

}


//Zadanie do powyższego kodu:
//Z klasy Telefon wyprowadź dwie klasy pochodne: TelefonKomorkowy i TelefonStacjonarny. Każda z tych klas powinna posiadać
//
//nowe pola (np. operator, prefiks),
//nowe metody (np. wyślijSMS),
//własną implementację metody zadzwon(String) (przesłanianie).
//
//Utwórz tablicę typu Telefon, np:
//Telefon [] tablica Telefonow = new Telefon [3];
//tablica Telefonow [0] = new Telefon ("634295432");
//tablica Telefonow [1] = new TelefonKomorkowy ("504295432", "T-mobile");
//tablica Telefonow [2] = new TelefonStacjonarny ("126493042", "058");
//
//Poszczególne elementy tablicy zawierają referencje zarówno do obiektów klasy Telefon, jak również do obiektów klas pochodnych. Dla każdego elementu tablicy wywołaj metodę zadzwon.
