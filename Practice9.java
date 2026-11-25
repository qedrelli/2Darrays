import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 5, 9}
        };


        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter a number to find: ");
        int target = sc.nextInt();

        boolean found = false;
        int foundRow = -1;
        int foundCol = -1;

        for (int i = 0; i < matrix.length && !found; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    found = true;
                    foundRow = i;
                    foundCol = j;
                    break;
                }
            }
        }

        if (found) {
            System.out.println("Found at row " + foundRow + ", column " + foundCol);
        } else {
            System.out.println("Not found");
        }

        sc.close();
    }
}
