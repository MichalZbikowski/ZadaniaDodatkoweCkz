// NAZWA PROJEKRU TO ZAD2, NATOMIAST PROJEKT ZAWIERA 6 ZADAŃ DOTYCZĄCYCH KLASY CAR

//1. Utwórz klasę Car zawierającą 3 publiczne (niestatyczne) pola typu String:
//        a make (marka)
//        b. plate (rejestracja)
//        c color (kolor)
//
//2. Dodaj w klasie publiczny 3-argumentowy konstruktor, który zainicjalizuje nowo tworzony obiekt wartościami przekazanymi jako argumenty wywołania konstruktora.
//        3. W metodzie main() utwórz obiekt klasy Car, a następnie wypisz na konsoli zawartość jego pól.
//
//Zadanie 2
//        1. Dodaj w klasie Car publiczną metodę info(), która będzie zwracać tekstową reprezentację obiektu w formacie: „Make: Fiat Plate: PO12345 Color: Blue"
//        2. Zmień pola w klasie na prywatne. Sprawdź czy program nadal się kompiluje.
//        3. Zmień sposób wyświetlania zawartości obiektu w metodzie main(), wykorzystując metodę info() obiektu Car.
//
// Zadanie 3
//        1 Zdefiniuj enumerację Color (w odrębnym pliku, ale w tym samym pakiecie). Pierwszą wartością enumeracji powinno być Unknown, kolejne np. White, Black, Green, itd. (wymień ok. 5 barw).
//        2. Wykorzystaj enumerację Color jako typ pola color w klasie Car. Zmodyfikuj konstruktor i ewentualnie (może to nie być konieczne) metodę info().
//        3. Zmodyfikuj w metodzie main() operację tworzenia obiektu. jako kolor tworzonego samochodu podaj jedną z wartości przewidzianych w enumeracji.
//
//Zadanie 4
//        1.Zdefiniuj w klasie Car właściwości (gettery/setery) dla wszystkich trzech cech samochodu. Możesz zdefiniować
//        te metody ręcznie lub wykorzystać do tego celu kreator w środowisku IDE.
//        2. Spraw aby właściwość marki samochodu była tylko do odczytu. Przetestuj możliwość modyfikacji poszczególnych właściwości obiektu klasy Car po jego utworzeniu.
//
//Zadanie 5
//        1.Dodaj w klasie Car publiczny 2-argumentowy konstruktor, który jako argumenty otrzymuje markę i rejestrację,
//        a kolor ustawia na nieznany (Unknown). Nowy konstruktor powinien wywoływać istniejący konstruktor za pomocą
//        mechanizmu constructor chaining". 2. W metodzie main() utwórz kolejny obiekt klasy Car nowym konstruktorem, a następnie wypisz na konsoli informacje o nim.
//
// Zadanie 6
//        Zaimplementuj w klasie Car mechanizm licznika istniejących instancji samochodów.
//        Mechanizm powinien obejmować:
//        a. Publiczne statyczne pole w klasie z wartością licznika (np. counter)
//        b. Zwiększanie licznika przy tworzeniu obiektu każdym z konstruktorów
//        c. Zmniejszanie licznika w metodzie finalize()

//        Uwaga: Metoda finalize() w rzeczywistych aplikacjach nie powinna być używana i jest obecnie zdeprecjonowana. Jej planowanym zastosowaniem było zwalnianie zasobów przetrzymywanych przez obiekty niszczone przez Garbage Collector. Jest to zła praktyka, prowadząca do niepotrzebnego blokowania zasobów, ze względu na nieprzewidywalny moment
//        działania Garbage Collectora 2. W metodzie main() po tworzeniu każdego z obiektów wypisz na konsoli aktualny stan licznika.
//
//        3. Na końcu metody main() ustaw na null wszystkie zmienne referencyjne do istniejących instancji samochodów.
//        4. Wypisz aktualny stan licznika po każdym przypisaniu nuli do referencji aby sprawdzić Garbage Collector na bieżąco sprząta niedostępne już obiekty.

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Throwable {
        System.out.println(Car.licznik);
        Car car1 = new Car("Fiat", "SPS2140", Color.Nardo_Grey);
        System.out.println(car1.info());
        System.out.println("Liczba samochodów: "+Car.licznik);

        Car car2 = new Car("BMW", "SWD9214");
        System.out.println(car2.info());
        System.out.println("Liczba samochodów: "+Car.licznik);

        car1.finalize();
        System.gc();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Liczba samochodów: "+Car.licznik);
        car2.finalize();
        System.out.println("Liczba samochodów: "+Car.licznik);
    }
}

