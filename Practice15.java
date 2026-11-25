public class Practice15 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] b = {
                {7, 8, 9},
                {10, 11, 12}
        };

        int[][] c = new int[2][3];


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }


        System.out.println("Matrix A:");
        printMatrix(a);
        System.out.println("Matrix B:");
        printMatrix(b);
        System.out.println("Matrix C = A + B:");
        printMatrix(c);
    }

    static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
