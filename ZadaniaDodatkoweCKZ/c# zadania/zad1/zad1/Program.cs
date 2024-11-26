internal class Program
{
    private static void Main(string[] args)
    {
        int a = 10;
        int b = 5;

        for (int i = 1; i <= b; i++)
        {
            if (i == 1 || i == b )
            {
                for (int j = 1; j <= a; j++)
                {
                    Console.Write('*');
                }

            }
            else
            {
                Console.Write('*');
                for (int j = 1; j < a - 1; j++)
                {
                    Console.Write(" ");
                }
                Console.Write('*');
            }

            if (i==b/2+1)
            {
                Console.Write(" b");
            }
            Console.WriteLine();
        }
        Console.WriteLine("    a");
    }
}

