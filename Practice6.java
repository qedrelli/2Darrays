import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[2][3];


        System.out.println("Enter 6 integers:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }


        System.out.println("Result:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
