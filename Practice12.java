public class Practice12 {
    public static void main(String[] args) {
        int[][] scores = {
                {80, 90, 70, 100},
                {60, 75, 85, 90},
                {95, 88, 92, 79}
        };


        System.out.println("Scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }

        int max = scores[0][0];
        int total = 0;


        for (int i = 0; i < scores.length; i++) {
            int studentSum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                studentSum += scores[i][j];
                total += scores[i][j];
                if (scores[i][j] > max) {
                    max = scores[i][j];
                }
            }
            double average = (double) studentSum / scores[i].length;
            System.out.println("Average of student " + (i + 1) + ": " + average);
        }

        double overall = (double) total / (scores.length * scores[0].length);

        System.out.println("Class maximum: " + max);
        System.out.println("Overall average: " + overall);
    }
}
