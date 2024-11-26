namespace zad7
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Podaj pierwszą liczbe: ");
            float a = float.Parse(Console.ReadLine());

            Console.Write("Podaj drugą liczbe: ");
            float b = float.Parse(Console.ReadLine());

            Console.WriteLine("suma = " + (a + b));
            Console.WriteLine("roznica = " + (a - b));
            Console.WriteLine("iloraz = " + (float)(a / b));
            Console.WriteLine("iloczyn = " + a * b);
            Console.WriteLine("pierwiastek z sumy = " + Math.Sqrt(a + b));
        }
    }
}