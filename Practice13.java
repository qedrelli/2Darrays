public class Practice13{
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {2, 1, 0, 3}
        };


        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int maxSum = 0;
        int maxRow = 0;

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of row " + i + ": " + rowSum);

            if (i == 0 || rowSum > maxSum) {
                maxSum = rowSum;
                maxRow = i;
            }
        }

        System.out.println("Row with the largest sum: " + maxRow + " (sum = " + maxSum + ")");
    }
}