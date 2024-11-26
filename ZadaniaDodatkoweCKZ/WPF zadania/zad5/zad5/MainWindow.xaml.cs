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

namespace zad5
{
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private async void Button_Click(object sender, RoutedEventArgs e)
        {
            //Utworz procentowy pasek postępu ProgressBar

            ProgressBar.Value = 0;
            for (int i = 1; i <= 100; i++)
            {
                ProgressBar.Value = i;
                ProcentTextBlock.Text = i.ToString() + "%";
                await Task.Delay(200);
            }
        }
    }
}