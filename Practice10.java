public class Practice10 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        System.out.println("Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        int sum = 0;
        System.out.print("Main diagonal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrix[i][i] + " ");
            sum += matrix[i][i];
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
