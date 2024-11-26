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

namespace zad9
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }
        private void click(object sender, RoutedEventArgs e)
        {
            double pojemnoscBaku = Convert.ToDouble(pojemnosc.Text);
            double liczbaKilometrow = Convert.ToDouble(kilometry.Text);
            double kilometryNaLitr = liczbaKilometrow / pojemnoscBaku;
            textBox.Text = kilometryNaLitr.ToString();
        }
    }
}