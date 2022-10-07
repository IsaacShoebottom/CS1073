/**
 * This class drives the program, it controls the console input/output and passes arguments given to the classes
 * @author Isaac Shoebottom (3429069)
 */

public class Main {

    public static void main(String[] args) {
        byte userChoice;
        double biggestCorralArea = 0;
        String biggestCorralType = "not applicable";
        java.util.Scanner scan = new java.util.Scanner(System.in);

        do {
            System.out.print(
                "What would you like to do?\n" +
                "1 - Get info for rectangular enclosure\n" +
                "2 - Get info for polygon enclosure\n" +
                "3 - Quit\n" +
                "Enter your choice: ");
            userChoice = scan.nextByte();

            if (userChoice == 1) {
                System.out.print("Width in meters: ");
                double tempWidth = scan.nextDouble();
                System.out.print("Length in meters: ");
                double tempLength = scan.nextDouble();
                RectangularCorral corral = new RectangularCorral(tempWidth, tempLength);
                System.out.print("The area is: "); System.out.printf("%.3f", corral.getArea()); System.out.print(" square meters\n");
                System.out.print("The cost is: "); System.out.printf("%.2f", corral.getTotalFenceCost()); System.out.print("$\n");

                if (biggestCorralArea < corral.getArea()) {
                    biggestCorralArea = corral.getArea();
                    biggestCorralType = "rectangle";
                }
            }

            if (userChoice == 2) {
                System.out.print("Length of sides: ");
                double tempLength = scan.nextDouble();
                System.out.print("Number of sides: ");
                long tempSides = scan.nextLong();
                PolygonalCorral corral = new PolygonalCorral(tempLength, tempSides);
                System.out.print("The area is: "); System.out.printf("%.3f", corral.getArea()); System.out.print(" square meters\n");
                System.out.print("The cost is: "); System.out.printf("%.2f", corral.getTotalFenceCost()); System.out.print("$\n");

                if (biggestCorralArea < corral.getArea()) {
                    biggestCorralArea = corral.getArea();
                    biggestCorralType = "polygon";
                }
            }
        } while (userChoice != 3);

        System.out.println("The corral with the largest area is a " + biggestCorralType);
        System.out.print("It's area is : "); System.out.printf("%.3f", biggestCorralArea); System.out.print(" square meters");
    }
}