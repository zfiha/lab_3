import java.util.Scanner;

public class FactorionFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the start (s) and end (e): ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;

        for (int i = start; i <= end; i++) {
            int sum = 0, t = i;

            while (t > 0) {
                int d = t % 10;
                int fact = 1;

                for (int j = 1; j <= d; j++) {
                    fact *= j;
                }

                sum += fact;
                t /= 10;
            }

            if (sum == i) {
                count++;
                System.out.println(i + " is a factorion.");
            }
        }

        System.out.println("Total number of factorions: " + count);
    }
}