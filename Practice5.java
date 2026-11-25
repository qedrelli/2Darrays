public class Practice5 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {5, 8, 46},
                {90, 43, 21},
                {65, 34, 7}
        };
        int max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        int min = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
