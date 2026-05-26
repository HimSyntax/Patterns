import java.util.*;
public class CharacterPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {

            // spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // characters
            for(int j=1; j<=i; j++) {
                System.out.print((char)(64+j));
            }

            // reverse characters
            for(int j=i-1; j>=1; j--) {
                System.out.print((char)(64+j));
            }

            System.out.println();
        }
    }
}