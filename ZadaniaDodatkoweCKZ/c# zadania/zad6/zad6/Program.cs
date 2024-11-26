namespace zad6
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int potega = 0;
            int podstawa = 3;//podstawa potęgi
            double wynik = 0;
            float k = 3;
            Console.Write("\nPodaj liczbe wieksza od 2: ");
            k = float.Parse(Console.ReadLine());
            while (k <= 2)
            {
                Console.WriteLine("Liczba musi byc wieksza od 2!");
                k = float.Parse(Console.ReadLine());
            }
            while (wynik < k)
            {
                Console.WriteLine(Math.Pow(podstawa, potega));
                potega++;
                wynik = Math.Pow(podstawa, potega);
            }
        }
    }
}