/**
 * Inverted Stairs
 * @author Isaac Shoebottom (3429069)
 */

public class PatternInverted {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int a = 9; a > i; a--) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}