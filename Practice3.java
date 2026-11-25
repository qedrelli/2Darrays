public class Practice3 {
    public static void main(String[] args) {
        int [][] a = {
                {1, 2, 4},
                {6, 7, 9},
                {67, 76, 7}
        };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
            System.out.println(sum);
        }

    }
}
