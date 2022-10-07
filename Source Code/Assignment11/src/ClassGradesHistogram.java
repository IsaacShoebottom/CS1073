import java.util.Scanner;

/**
 * Sideways histogram for tests
 * @author Isaac Shoebottom (3429069)
 */

public class ClassGradesHistogram {
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

        System.out.println("Scores");
        System.out.print("A\t\t|");
        while (numberOfA > 0) {
            System.out.print('*');
            numberOfA--;
        }
        System.out.println();
        System.out.print("B\t\t|");
        while (numberOfB > 0) {
            System.out.print('*');
            numberOfB--;
        }
        System.out.println();
        System.out.print("C\t\t|");
        while (numberOfC > 0) {
            System.out.print('*');
            numberOfC--;
        }
        System.out.println();
        System.out.print("D\t\t|");
        while (numberOfD > 0) {
            System.out.print('*');
            numberOfD--;
        }
        System.out.println();
        System.out.print("F\t\t|");
        while (numberOfF > 0) {
            System.out.print('*');
            numberOfF--;
        }
        System.out.println();
        System.out.println("\t\t" + "===============================");
        System.out.println("\t\t" + "+         +         +         +");
        System.out.println("\t\t" + "0         10        20        30");

    }
}
