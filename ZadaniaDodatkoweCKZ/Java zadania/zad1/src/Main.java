//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

//    Napisz klasę Lista, której zadaniem będzie przechowywać
//    listę liczb całkowitych. Klasa ta mieć następujące pola
//    prywatne:

//    int[] liczby; // tablica, w której przechowywane będą liczby
//    int pojemnosc; // maksymalna liczba elementów, możliwych do przechowywania
//    int rozmiar: // liczba przechowywanych elementów (liczb w tablicy, liczby")

//    Klasa Lista powinna mieć również następujące metody:

//    konstruktor z parametrem określającym pojemność, który przydziela pamięć dla tablicy liczby oraz ustala wartości
//    pozostałych pól klasy:

//    ⚫ metodę dodajElement, która przyjmuje dokładnie jeden element - liczbę całkowitą, która dodawana jest do listy, w przypadku, gdy lista jest pełna powinien zostać wyświetlony komunikat o błędzie;
//    metodę znajdź, której jedynym parametrem powinna być szukana liczba, natomiast wynikiem pozycja podanej liczby w liście (licząc od 0) lub -1, gdy liczby nie ma na liście;
//
//    bezparametrową metodę pisz, która wypisuje informacje o liście, w tym jej rozmiar, pojemność oraz listę przechowywanych elementów;
//    metode usun Pierwszy, która usuwa pierwsze wystąpienie podanej jako parametr liczby, jeżeli znajduje się ona na liście, tzn. jeżeli podana liczba występuje więcej niż jeden raz, to usuwane jest jedynie pierwsze jej wystąpienie;
//
//    ⚫ metodę usun Powtorzenia, która usuwa wszystkie powtórzenia elementów na liście, tzn. po jej wykonaniu na liście
//    nie powinno być żadnych powtórzonych liczb;
//
//    • metodę zapiszDoPliku, która zapisuje zawartość listy do pliku obiektowego, którego nazwa podana powinna być jako pierwszy parametr;


    public static void main(String[] args) {
        Lista lista = new Lista(5);
        lista.dodajElement();
        lista.dodajElement();
        lista.dodajElement();
        lista.dodajElement();

        System.out.println(lista.znajdz(2));

        lista.pisz();

        lista.usunPierwszy(2);
        lista.pisz();
        lista.zapiszDoPliku();
    }
}