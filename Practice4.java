public class Practice4 {
    public static void main(String[] args) {
        int[][] n = {
                {1, 2, 3},
                {5, 8, 46},
                {90, 43, 21}
        };

        int evenCount = 0;
        int oddCount = 0;


        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (n[i][j] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}