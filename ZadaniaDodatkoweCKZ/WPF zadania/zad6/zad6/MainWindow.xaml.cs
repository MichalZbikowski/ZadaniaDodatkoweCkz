using Microsoft.Win32;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace zad6
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    /// Zaprojektuj następujące okno "Powitanie"
    /// a) tytuł okna "Powitanie"
    /// b) dowolne wymiary
    /// c) własna kolorystyka
    /// d) wpisujemy imie i po nacisniecu przycisku "Przywitaj" dostajemy komunikat
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }
        public void Powitaj(object sender, RoutedEventArgs e)
        {
            string imie = input.Text;
            MessageBoxImage icon = MessageBoxImage.Information;
            MessageBox.Show( "Witaj, " + imie, "Przywitanie", MessageBoxButton.OK, MessageBoxImage.Information);
        }
    }
}