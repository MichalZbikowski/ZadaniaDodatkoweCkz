public class Main {

    //napisz klase Macierz i zaimplementuj na jej rzecz przeciażenie operatorów tak aby  realizował:
    // -dodawnanie macierzy,
    // -odejmowanie macierzy,
    // -mnozenie przez skalar
    public static void main(String[] args) {
        double[][] dataA = {
                {1, 2, 3},
                {1, 2, 3},
                {4, 5, 6}
        };

        double[][] dataB = {
                {7, 8, 9},
                {7, 122, 9},
                {10, 11, 12}
        };

        Macierz macierz1 = new Macierz(dataA);
        Macierz macierz2 = new Macierz(dataB);

        System.out.println("Macierz 1:");
        System.out.println(macierz1);

        System.out.println("Macierz 2:");
        System.out.println(macierz2);

        Macierz suma = macierz1.add(macierz2);
        System.out.println("macierz1 + macierz2:");
        System.out.println(suma);

        Macierz roznica = macierz1.subtract(macierz2);
        System.out.println("macierz1 - macierz2:");
        System.out.println(roznica);

        Macierz skalar = macierz1.multiplyByScalar(2);
        System.out.println("macierz1 x 2:");
        System.out.println(skalar);


    }
}