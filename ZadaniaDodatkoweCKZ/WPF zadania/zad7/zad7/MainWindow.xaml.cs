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

namespace zad7
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    
    
    // napisz aplikację, która będzie testem kolorów
    // -tytuł okna "Tester kolorów"
    // -skoszystaj z kontrolki hScrollBar

    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void Slider_ValueChanged(object sender, RoutedPropertyChangedEventArgs<double> e)
        {
            byte red = Convert.ToByte(SliderRed.Value);
            byte green = Convert.ToByte(SliderGreen.Value);
            byte blue = Convert.ToByte(SliderBlue.Value);
            LinearGradientBrush myBrush = new LinearGradientBrush();
            myBrush.GradientStops.Add(new GradientStop(Color.FromRgb(red, green, blue), 1.0));
            aView.Background = myBrush;
        }

    }
}