//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main (String[] args) {
        Telefon telAla = new Telefon ("783982331");
        Telefon telOla = new Telefon ("608234982");
        telAla.zadzwon ("0124239832");
        telOla.zadzwon ("112");
        double kwota = telAla.obliczKwoteDoZaplaty();
        System.out.println ("Ala ma do zapłaty: " + kwota + " zl.");

        Telefon[] tablicaTelefonow = new Telefon[3];

        tablicaTelefonow[0]=new Telefon("123456789");
        tablicaTelefonow[1]=new TelefonKomorkowy("123456788", "Tmobile");
        tablicaTelefonow[2]=new TelefonStacjonarny("123456787", "058");

        tablicaTelefonow[1].zadzwon("122");
        kwota = tablicaTelefonow[1].obliczKwoteDoZaplaty();
        ((TelefonKomorkowy)tablicaTelefonow[1]).wyslijSMS("help potrzebuje pomocy ratowniku", "112");

        System.out.println ("do zapłaty: " + kwota + " zl.");

        tablicaTelefonow[2].zadzwon("122");
        kwota = tablicaTelefonow[2].obliczKwoteDoZaplaty();

        System.out.println ("do zapłaty: " + kwota + " zl.");

        tablicaTelefonow[0].zadzwon("122");
        kwota = tablicaTelefonow[0].obliczKwoteDoZaplaty();

        System.out.println ("do zapłaty: " + kwota + " zl.");
    }

}