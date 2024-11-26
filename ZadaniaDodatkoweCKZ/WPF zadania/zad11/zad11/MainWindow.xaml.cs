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

namespace zad11
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
     // Napisz program według wzoru (screena) (program od zamiany km na mile)

    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }
        private void click(object sender, RoutedEventArgs e)
        {
            Double kilometry = Convert.ToDouble(kilometryTextBox.Text);
            output.Text = "Po konwersji na mile: "+(kilometry * 0.6214).ToString();
        }
        private void end(object sender, RoutedEventArgs e)
        {
            System.Environment.Exit(0);
        }

    }
}