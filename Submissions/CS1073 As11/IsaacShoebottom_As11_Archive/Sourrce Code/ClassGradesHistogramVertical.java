import java.util.Scanner;

/**
 * Vertical histogram for tests
 * @author Isaac Shoebottom (3429069)
 */

public class ClassGradesHistogramVertical {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long testScore;
        long numberOfA = 0;
        long numberOfB = 0;
        long numberOfC = 0;
        long numberOfD = 0;
        long numberOfF = 0;
        do {
            System.out.print("Enter test score: ");
            testScore = scan.nextLong();

            if (testScore > 100) {
                System.out.println("Please enter a test score within the range 0-100");
            } else {
                if (testScore >= 85) {
                    numberOfA++;
                } else if (testScore >= 70) {
                    numberOfB++;
                } else if (testScore >= 55) {
                    numberOfC++;
                } else if (testScore >= 45) {
                    numberOfD++;
                } else if (testScore >= 0) {
                    numberOfF++;
                }
            }
        } while (testScore >= 0);

        for (int i = 30; i > 0; i--) {
            if (i == 30 | i == 20 | i == 10)
                System.out.print(i+ "+");
            System.out.print("\t| ");
            if (numberOfA >= i) {
                System.out.print('*');
            }
            else {
                System.out.print(' ');
            }
            System.out.print(' ');
            if (numberOfB >= i) {
                System.out.print('*');
            }
            else {
                System.out.print(' ');
            }
            System.out.print(' ');
            if (numberOfC >= i) {
                System.out.print('*');
            }
            else {
                System.out.print(' ');
            }
            System.out.print(' ');
            if (numberOfD >= i) {
                System.out.print('*');
            }
            else {
                System.out.print(' ');
            }
            System.out.print(' ');
            if (numberOfF >= i) {
                System.out.print('*');
            }
            else {
                System.out.print(' ');
            }
            System.out.print(' ');
            System.out.println();
        }
        System.out.println("0+\t===========");
        System.out.println("\t  A B C D F");
    }
}
