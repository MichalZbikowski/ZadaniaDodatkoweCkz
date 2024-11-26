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

namespace zad12
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    // Napisz program według wzoru (screena) (program do oblicznia sredniej z 3 sprawdzianów)
    public partial class MainWindow : Window
    {
        private void click(object sender, RoutedEventArgs e)
        {
            Double sprawdznian1 = Convert.ToDouble(sprawdzian1TextBox.Text);
            Double sprawdznian2 = Convert.ToDouble(sprawdzian2TextBox.Text);
            Double sprawdznian3 = Convert.ToDouble(sprawdzian3TextBox.Text);
            output.Text = "Średnia " + ((sprawdznian1+ sprawdznian2+ sprawdznian3)/3).ToString();
        }
        private void end(object sender, RoutedEventArgs e)
        {
            System.Environment.Exit(0);
        }
    }
}