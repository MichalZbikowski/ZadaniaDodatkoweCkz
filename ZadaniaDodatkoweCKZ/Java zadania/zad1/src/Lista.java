
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

    public class Lista {
        Scanner scan = new Scanner(System.in);
        private int pojemnosc; //maksymalna ilosc elementow w tablicy
        private int[] liczby;

        private int rozmiar=0; //ilosc elementow w tablicy


        public Lista(int pojemnosc){
        this.pojemnosc=pojemnosc;
        liczby=new int[pojemnosc];
        }
    int i = 0;
    public void dodajElement(){
        if (rozmiar<=pojemnosc){
            System.out.print("Dodaj element: ");
            int element = scan.nextInt();
            liczby[i] = element;
            i++;
            rozmiar++;
        }else {
            System.out.println("Lista jest juz pelna");
        }
    }
    public int znajdz(int x){
        for(int i=0; i<pojemnosc;i++){
            if(x==liczby[i]){
                return i;
            }
        }
        return -1;
    }
    public void pisz(){
        System.out.println("rozmiar: "+rozmiar+" pojemnosc: "+pojemnosc);
        System.out.println("elementy: ");
        System.out.print("[");
        for (int i = 0; i<pojemnosc;i++){
            if(i!= pojemnosc-1){
                System.out.print(liczby[i]+",");
            }else{
                System.out.print(liczby[i]);
            }
        }
        System.out.print("]\n");
    }

    public void usunPierwszy(int x){
        int y=znajdz(x);
        if(y!=-1){
            for (int i=y; i< pojemnosc;i++){
                if (liczby[y]==liczby[i]){
                    int tymczas=liczby[y];
                    liczby[y]=0;
                    if (liczby[znajdz(x)]==liczby[i]){
                        rozmiar--;
                        i= pojemnosc;
                    }else{
                        liczby[y]=tymczas;
                    }
                }
            }
        }
    }

    public void usunPowtorzenia(){
        for (int i=0;i< pojemnosc;i++){
            usunPierwszy(liczby[i]);
        }
    }

    public void zapiszDoPliku(){
        String zapis="";
        for (int i=0;i< pojemnosc;i++){
            zapis+=liczby[i];
        }
        try (FileWriter fileWriter = new FileWriter(liczby[0]+".txt")) {
            fileWriter.write(zapis);
            System.out.println("zapisano dane.");
        } catch (IOException e) {
            System.out.println("błąd.");
            e.printStackTrace();
        }
    }
}
