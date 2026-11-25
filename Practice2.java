public class Practice2 {
    public static void main(String[] args) {
        int[][]b = {
                {5, 10, 15},
                {20, 25, 30}
        };
        b[0][1] = 99;
        System.out.println(b[1][2]);
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

    }
}
