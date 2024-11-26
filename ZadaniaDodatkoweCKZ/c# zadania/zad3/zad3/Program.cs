namespace zad3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            float x = 0;
            while (x < 1)
            {
                Console.WriteLine("Podaj liczbe dodatnia");
                x = float.Parse(Console.ReadLine());
            }
        }
    }
}