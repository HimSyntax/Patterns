import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 0; i < n; i++) {

            // Print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int number = 1;

            // Print numbers in each row
            for (int j = 0; j <= i; j++) {

                System.out.print(number + " ");

                // Formula to generate next number
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }

        sc.close();
    }
}