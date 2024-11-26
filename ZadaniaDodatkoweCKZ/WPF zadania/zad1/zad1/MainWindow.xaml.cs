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


//Nie znam dokładnego polecenia w tym zadaniu, nie umiem znaleźć kartki z zadaniami, natomiast miałem zrobione zadanie

//Napisz program do generowania hasła
//Pola Małe i wielkie litery oraz Cyfry mają być domyślnie zaznaczone
//MessageBoxy z błędami
namespace zad1
{
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void ButtonClick(object sender, RoutedEventArgs e)
        {
            string haslo = "";
            string znaki = "";
            int dlugosc = 0;
            try
            {
                dlugosc = int.Parse(DlugoscTextBox.Text);
                if (dlugosc == 0) {
                    MessageBox.Show("Hasło musi być dłuzsze od zera", "Błąd", MessageBoxButton.OK, MessageBoxImage.Warning);
                    return;
                }
            } catch (Exception) {
                MessageBox.Show("Podaj liczbę", "Błąd", MessageBoxButton.OK, MessageBoxImage.Warning);
                return;
            }
           
            
            


            if (LiteryCheckBox.IsChecked == true)
            {
                znaki += "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            }
            if (CyfryCheckBox.IsChecked == true)
            {
                znaki += "0123456789";
            }
            if (ZnakiCheckBox.IsChecked == true)
            {
                znaki += "!@-^_=#$+%<>?[]{}:;,.&*()~`";
            }

            if (znaki == "")
            {
                MessageBox.Show("Wybierz przynajmniej jedną opcję", "Błąd", MessageBoxButton.OK, MessageBoxImage.Warning);
                return;
            }


            Random random = new Random();

            for (int i = 0; i < dlugosc; i++)
            {
                haslo += znaki[random.Next(znaki.Length)];
            }


            MessageBox.Show("Wygenerowane hasło: " + haslo+".");
        }
    }
}