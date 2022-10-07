/**
 * This class has two methods, one for returning a constructed string from the hieroglyph and one that drives the console input and output
 * @author Isaac Shoebottom (3429069)
 */
public class Main {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int inputNumber;
        do {
            System.out.print("Please enter a number between 1 and 9 999 999: ");
            inputNumber = scan.nextInt();
            if (inputNumber < 1 | inputNumber > 9_999_999) {
                System.out.println("Invalid input. You must enter a number between 1 and 9 999 999");
            }
        } while (inputNumber < 1 | inputNumber > 9_999_999);

        System.out.println(inputNumber + " in Egyptian hieroglyphs is:");
        System.out.print(printHieroglyphics(inputNumber/1_000_000, 'w')); inputNumber %= 1_000_000;
        System.out.print(printHieroglyphics(inputNumber/100_000, '&')); inputNumber %= 100_000;
        System.out.print(printHieroglyphics(inputNumber/10_000, ')')); inputNumber %= 10_000;
        System.out.print(printHieroglyphics(inputNumber/1_000, '*')); inputNumber %= 1_000;
        System.out.print(printHieroglyphics(inputNumber/100, '@')); inputNumber %= 100;
        System.out.print(printHieroglyphics(inputNumber/10, 'n')); inputNumber %= 10;
        System.out.print(printHieroglyphics(inputNumber, '|'));
    }

    private static String printHieroglyphics(int number, char hieroglyph) {
        if (number == 0 ) { return ""; }
        byte counter = 0;
        StringBuilder phrase = new StringBuilder(String.valueOf(hieroglyph));
        if (number == 4 | number == 7 | number == 8) {
            for (int i = number; i > 1; i--) {
                counter++;
                if (counter % 4 == 0) { phrase.append("\n"); }
                phrase.append(hieroglyph);
            }
        } else {
            for (int i = number; i > 1; i--) {
                counter++;
                if (counter % 3 == 0) { phrase.append("\n"); }
                phrase.append(hieroglyph);
            }
        }
        return (phrase.toString() + "\n");
    }
}