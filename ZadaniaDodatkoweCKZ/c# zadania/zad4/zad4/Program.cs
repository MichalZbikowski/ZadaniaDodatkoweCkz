namespace zad4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Random rnd = new Random();
            int los = rnd.Next(1, 100);
            int proby = 0;
            bool trafiono = false;
            int strzal;
            while (!trafiono)
            {
            
                proby++;
                Console.Write("Zgadnij liczbe: ");
                strzal = int.Parse(Console.ReadLine());
                if (los >strzal)
                {
                    Console.Write("Szukana liczba jest wieksza: ");
                }
                if (los < strzal)
                {
                    Console.Write("Szukana liczba jest mniejsza: ");
                }
                if (strzal == los)
                {
                    Console.WriteLine("Gratulacje! udało ci sie w "+proby+" próbach");
                    trafiono = true;
                }
            }
        }
    }
}