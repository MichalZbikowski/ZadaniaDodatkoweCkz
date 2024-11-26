public class TelefonKomorkowy extends Telefon{
    private String operator;
    private String nrTel;
    private int lacznyCzas;
    private static double cenaZaZnak = 0.02;

    //Nie za bardzo rozumiem dlaczego osobno implementować metode zadzwon dla klas pochodnych,
    //skoro dzieczą one tę metodę po klasie telefon


    TelefonKomorkowy(String numer, String operator) {
        nrTel = numer;
        this.operator = operator;
    }

    void zadzwon (String nr) {
        System.out.println("Dzwonie za pomoca tel komorkowego do:" + nr);
        System.out.println("Rozmowa w toku...");
        int czasRozmowy = (int) (Math.random()*3600);
        lacznyCzas = lacznyCzas + czasRozmowy;
        System.out.println("Rozmowa zakonczona.");
        System.out.print("Czas rozmowy:"+ czasRozmowy/60 + "min," + czasRozmowy%60 + "sek.");
    }

    public void wyslijSMS(String wiadomosc, String nrTel){
        System.out.println("wysłano wiadomosc:" + wiadomosc+", do numeru: "+nrTel);
        System.out.println("koszt sms: " + (wiadomosc.length()*cenaZaZnak)+"zł");
    }


}
