public class Sandglass {
    public static void main(String[] args) {
        int n = 5;

        // Upper part
        for (int i = n; i >= 1; i -= 2) {
            int spaces = (n - i) / 2;

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower part
        for (int i = 3; i <= n; i += 2) {
            int spaces = (n - i) / 2;

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}