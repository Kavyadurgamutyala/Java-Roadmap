package Day04;

public class MatrixTranspose {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = 3;
        int[][] transpose = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Original:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}