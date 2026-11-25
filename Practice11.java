public class Practice11 {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, -3, 8},
                {-1, 0, 12},
                {-7, 4, -2}
        };


        System.out.println("Before:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        int replacements = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    matrix[i][j] = 0;
                    replacements++;
                }
            }
        }


        System.out.println("After:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Replacements: " + replacements);
    }
}