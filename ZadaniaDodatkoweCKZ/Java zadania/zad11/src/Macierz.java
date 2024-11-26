import java.util.Arrays;

public class Macierz {
    private double[][] data;
    private int rows;
    private int cols;

    // Konstruktor
    public Macierz(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }

    // Konstruktor przyjmujący tablicę 2D
    public Macierz(double[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            if (data[i].length != cols) {
                throw new IllegalArgumentException("Wszystkie wiersze muszą mieć tę samą liczbę kolumn");
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = data[i][j];
            }
        }
    }

    public Macierz add(Macierz other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Macierze muszą mieć ten sam rozmiar!");
        }

        Macierz result = new Macierz(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }


    public Macierz subtract(Macierz other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Macierze muszą mieć ten sam rozmiar!");
        }

        Macierz result = new Macierz(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] - other.data[i][j];
            }
        }
        return result;
    }

    public Macierz multiplyByScalar(double scalar) {
        Macierz result = new Macierz(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] * scalar;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (double[] row : data) {
            builder.append(Arrays.toString(row)).append("\n");
        }
        return builder.toString();
    }

}