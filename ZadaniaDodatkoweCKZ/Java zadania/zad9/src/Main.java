import java.util.Random;

//napisz progarm wypisujący wyniki rzutu monetą 50 razy
public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();
        int orzel = 0, reszka = 0;
        for (int i = 0; i < 50; i++) {
            if(rnd.nextBoolean()){
                reszka++;
            }else{
                orzel++;
            }
        }
        System.out.println("liczba reszek= "+ reszka +", Liczba orzełków: "+orzel);
    }
}