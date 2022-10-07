/**
 *This class takes a given date and tells the user if it is a leap year
 * @author Isaac Shoebottom (3429069)
 */
public class LeapYearCheck {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        long year;
        do {
            System.out.print("Please enter a year: ");
            year = scanner.nextLong();
            if (year < 1582) {
                System.out.println("Invalid Year, you cannot enter a year prior to 1582");
            }
        }
        while (year < 1582);

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("This is a leap year");
        }
        else {
            System.out.println("This is not a leap year.");
        }
    }
}
