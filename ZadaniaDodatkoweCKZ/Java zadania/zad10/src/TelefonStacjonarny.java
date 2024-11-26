public class TelefonStacjonarny extends Telefon{
    private String prefix;
    private String nrTel;
    private int lacznyCzas;


    TelefonStacjonarny (String numer, String prefix) {
        nrTel = numer;
        this.prefix = prefix;
    }

    void zadzwon (String nr) {
        System.out.println("Dzwonie za pomoca tel stacjonarnego do:" + nr);
        System.out.println("Rozmowa w toku...");
        int czasRozmowy = (int) (Math.random()*3600);
        lacznyCzas = lacznyCzas + czasRozmowy;
        System.out.println("Rozmowa zakonczona.");
        System.out.print("Czas rozmowy:"+ czasRozmowy/60 + "min," + czasRozmowy%60 + "sek.");
    }



}
