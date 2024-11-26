using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace zad4
{
    //Zaprojektuj aplikację okienkową służącą do zapisywania danych do pliku tekstowego.
    //    a) Elementy GUI
    //    a.Okno główne aplikacji ma tytuł „GroupBox".
    //    b.W oknie głównym powinny znajdować się następujące elementy:
    //    • pole wprowadzania tekstu z etykietą „First Name", „Last Name", wybór kalendarza z datą DOB.
    //    • pole wprowadzania tekstu z etykietą Phone Number, Email Address,
    //    • przycisk Save jest na całej szerokości obramowania GroupBox, przycisk ten który zapisuje całą zawartość do pliku tekstowego dane.txt.
    //        c.Wzajemne ułożenie elementów w oknie głównym oraz ich rozmiary są dowolne, ale należy zadbać o czytelność GUI.

    //Uwagi dodatkowe
    //    Należy sprawdzić czy wprowadzona wartość nie jest liczbą.
    //    Akceptowalne są tylko litery w polach First Name, Last Name.
    //    Użyj dla pola Personal Information oraz Contact Information obramowania w postaci GroupBox
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            String imie = Imie.Text;
            String nazwisko = Nazwisko.Text;
            String dataUr = DataUr.Text;

            String numerTel = NumerTel.Text;
            String email = Email.Text;

            if (isNum(imie) || isNum(nazwisko))
            {
                MessageBox.Show("First Name and Last Name\ncannot be numbers", "Warning!");
            }
            else
            {
                System.IO.StreamWriter file = new System.IO.StreamWriter("C:\\Users\\Ryzen\\source\\repos\\WPF zadania\\zad4\\zad4\\zapis.txt");

                file.WriteLine(imie);
                file.WriteLine(nazwisko);
                file.WriteLine(dataUr);
                file.WriteLine(numerTel);
                file.WriteLine(email);

                file.Close();

                Environment.Exit(0);
            }
        }

        private bool isNum(String a)
        {
            try
            {
                foreach(char c in a)
                {
                    Convert.ToInt32(c);
                } 
            }
            catch
            {
                return false;
            }
            return true;
        }
    }
}