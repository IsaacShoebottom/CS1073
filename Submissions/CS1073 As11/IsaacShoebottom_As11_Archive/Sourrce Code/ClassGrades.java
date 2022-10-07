import java.util.Scanner;

/**
 * Simple test stats
 * @author Isaac Shoebottom (3429069)
 */

public class ClassGrades {
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
            }
            else {
                if (testScore >= 85) {
                    numberOfA++;
                }
                else if (testScore >= 70) {
                    numberOfB++;
                }
                else if (testScore >= 55) {
                    numberOfC++;
                }
                else if (testScore >= 45) {
                    numberOfD++;
                }
                else if (testScore >= 0) {
                    numberOfF++;
                }
            }
        } while (testScore >= 0);

        System.out.println("Number of A's: " + numberOfA);
        System.out.println("Number of B's: " + numberOfB);
        System.out.println("Number of C's: " + numberOfC);
        System.out.println("Number of D's: " + numberOfD);
        System.out.println("Number of F's: " + numberOfF);

    }
}
