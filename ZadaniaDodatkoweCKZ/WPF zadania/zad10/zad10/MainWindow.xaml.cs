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

namespace zad10
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    // Napisz program według wzoru (screena) (program od obliczania powierzchni prostokątów, a nawet kwadratów)
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }
        private void click(object sender, RoutedEventArgs e)
        {
            Double szerokosc = Convert.ToDouble(szerokoscTextBox.Text);
            Double dlugosc = Convert.ToDouble(dlugoscTextBox.Text);
            output.Text = (szerokosc*dlugosc).ToString();
        }
    }
}