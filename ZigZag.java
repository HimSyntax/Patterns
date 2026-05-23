package Java.Patterns;
public class ZigZag {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= n; j++) {

                if ((i == 1 && j % 4 == 2) ||
                    (i == 2 && j % 2 == 1) ||
                    (i == 3 && j % 4 == 0)) {
                    
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}