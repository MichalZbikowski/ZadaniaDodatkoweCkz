namespace zad5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Podaj poczatek przedzialu: ");
            int poczatek = int.Parse(Console.ReadLine());
            Console.Write("Podaj koniec przedzialu: ");
            int koniec = int.Parse(Console.ReadLine());
            Console.Write("Podaj dzielną : ");
            float dzielna = float.Parse(Console.ReadLine());
            for (int i = poczatek; i <= koniec; i++)
            {
                if (i % dzielna == 0)
                {
                    Console.WriteLine(i);
                }
            }
        }
    }
}