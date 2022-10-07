/**
 * @author Isaac Shoebottom (3429069)
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean gotPaid;
        boolean boughtGroceries;
        boolean leftoversAtHome;
        boolean enoughLeftoversForMeal;
        String scannerIn;

        System.out.println("Did you get paid this week?");
        scannerIn = scanner.nextLine();
        scannerIn = scannerIn.toLowerCase();
        scannerIn = (scannerIn.equals("yes")) ? "true" : (scannerIn.equals("no")) ? "false" : "not yes or no";
        gotPaid = Boolean.parseBoolean(scannerIn);

        if (gotPaid) {

            System.out.println("Did you buy groceries this week?");
            scannerIn = scanner.nextLine();
            scannerIn = scannerIn.toLowerCase();
            scannerIn = (scannerIn.equals("yes")) ? "true" : (scannerIn.equals("no")) ? "no" : "not yes or no";
            boughtGroceries = Boolean.parseBoolean(scannerIn);

            if (!boughtGroceries) {

                System.out.println("Do you have leftovers at home?");
                scannerIn = scanner.nextLine();
                scannerIn = scannerIn.toLowerCase();
                scannerIn = (scannerIn.equals("yes")) ? "true" : (scannerIn.equals("no")) ? "no" : "not yes or no";
                leftoversAtHome = Boolean.parseBoolean(scannerIn);

                if (leftoversAtHome) {

                    System.out.println("Are there enough leftovers for a meal?");
                    scannerIn = scanner.nextLine();
                    scannerIn = scannerIn.toLowerCase();
                    scannerIn = (scannerIn.equals("yes")) ? "true" : (scannerIn.equals("no")) ? "no" : "not yes or no";
                    enoughLeftoversForMeal = Boolean.parseBoolean(scannerIn);

                    if (!enoughLeftoversForMeal) {
                        System.out.println("You should eat at a restaurant.");
                    }
                    else {
                        System.out.println("You should eat at home.");
                    }
                }
                else {
                    System.out.println("You should eat at a restaurant.");
                }
            }
            else {
                System.out.println("You should eat at home.");
            }
        }
        else {
            System.out.println("You should eat at home.");
        }
    }
}
