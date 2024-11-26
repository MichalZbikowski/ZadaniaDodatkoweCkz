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

namespace zad3
{
    public partial class MainWindow : Window
    {

        //Napisz aplikację z systemem menu według poniższego wzoru. 
        //- Otwórz plik, przegląda dysk w celu otwarcia pliku 
        //- Zapisz plik zapisuje plik menu.txt 
        //- Koniec, zamyka okno menu

        //W Edycji dodaj skróty klawiszowe, dodatkowo sprawdź działanie i wykorzystaj w menu: 
        //    Menuitem, Menultem icon (dodawanie ikon w menu, dodaj przynajmniej jedną ikonę) 
        //    InputGestureText(skróty klawiszowe), SaveFileDialog, OpenFileDialog.
        public MainWindow()
        {
            InitializeComponent();
        }

        private void exit(object sender, RoutedEventArgs e)
        {
            System.Environment.Exit(0);
        }

        private void NewFile(object sender, RoutedEventArgs e)
        {

        }
        private void OpenFile(object sender, RoutedEventArgs e)
        {
            Microsoft.Win32.OpenFileDialog dlg = new Microsoft.Win32.OpenFileDialog();
            dlg.FileName = "document";
            dlg.DefaultExt = ".txt";
            dlg.ShowDialog();
        }
        private void SaveFile(object sender, RoutedEventArgs e)
        {
            Microsoft.Win32.SaveFileDialog dlg = new Microsoft.Win32.SaveFileDialog();

            dlg.FileName = "document";
            dlg.DefaultExt = ".txt";
            dlg.ShowDialog();
        }

    }
}