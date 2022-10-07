/**
 * This class returns the amount of change the user would be given provided they give the amount they paid and the price of their items
 * @author Isaac Shoebottom (3429069)
 */

public class MakingChange {
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double totalPrice;
        double amountPaid;
        long changeTotal;

        do {
            do {
                    System.out.print("Please enter the total price: ");
                    totalPrice = scanner.nextDouble();
                    if (totalPrice <= 0) {
                    System.out.println("Invalid input. Please enter a positive number");
                }
            }
            while (totalPrice <= 0);

            do {
                    System.out.print("Please enter the amount paid: ");
                    amountPaid = scanner.nextDouble();
                    if (amountPaid <= 0) {
                    System.out.println("Invalid input. Please enter a positive number");
                }
            }
            while (amountPaid < 0);
            changeTotal = (long)(amountPaid*100) - (long)(totalPrice*100);
            if (changeTotal< 0) {
                System.out.println("Invalid inputs. The amount of change given must be at least zero \n");
            }
        }
        while (changeTotal < 0);


        long twenties = (changeTotal/2000);
        changeTotal -= (twenties * 2000);
        long tens = (changeTotal/1000);
        changeTotal -= (tens * 1000);
        long fives = (changeTotal/500);
        changeTotal -= (fives * 500);
        long toonies = (changeTotal/200);
        changeTotal -= (toonies * 200);
        long loonies = (changeTotal/100);
        changeTotal -= (loonies * 100);
        long quarters = (changeTotal/25);
        changeTotal -= (quarters * 25);
        long dimes = (changeTotal/10);
        changeTotal -= (dimes * 10);
        long nickels = (changeTotal/5);
        changeTotal -= (nickels * 5);
        long pennies = changeTotal;

        System.out.println(
                "\n" +
                "Here is the change that they are due:\n" +
                "20$ bills: " + twenties + "\n" +
                "10$ bills: " + tens + "\n" +
                "5$ bills: " + fives + "\n" +
                "Toonies: " + toonies + "\n" +
                "Loonies: " + loonies + "\n" +
                "Quarters: " + quarters + "\n" +
                "Dimes: " + dimes + "\n" +
                "Nickels: " + nickels + "\n" +
                "Pennies: " + pennies
        );
    }
}
