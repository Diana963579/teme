public class MatrixSum {
        public static int sumaDiagonale(int[][] matrix) {
            int n = matrix.length;
            int suma = 0;

            for (int i = 0; i < n; i++) {
                suma += matrix[i][i]; // Diagonala principală
                suma += matrix[i][n - i - 1]; // Diagonala secundară
            }

            // Dacă matricea are dimensiune impară, scade dublura elementului din centrul matricei
            if (n % 2 != 0) {
                suma -= matrix[n / 2][n / 2];
            }

            return suma;
        }

        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
            System.out.println("Suma diagonalelor: " + sumaDiagonale(matrix)); // Output: 25
        }
    }
