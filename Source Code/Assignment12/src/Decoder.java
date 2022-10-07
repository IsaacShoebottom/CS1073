import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Decodes encrypted text in a specific format
 * @author Isaac Shoebottom (3429069)
 */

public class Decoder {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanFile = new Scanner(new File(args[0]));
        int cycleCount = 0;

        scanFile.useDelimiter("\\A");
        String in = scanFile.next();

        String[] codes = in.split("\\r?\\n");

        for (String i: codes) {

            if (i.length() > 1) {
                int columns = Integer.parseInt(codes[cycleCount * 2]);
                int rows = codes[cycleCount * 2 + 1].length() / columns;

                char[][] decode = new char[rows][columns];

                char[] chars = i.toCharArray();

                int charCounter = 0;
                for (int k = 0; k < columns; k++) {

                    if (k % 2 != 0) {
                        for (int j = 0; j < rows; j++) {
                            decode[j][k] = chars[charCounter];
                            charCounter++;
                        }
                    }
                    else {
                        for (int j = rows - 1; j > -1; j--) {
                            decode[j][k] = chars[charCounter];
                            charCounter++;
                        }
                    }
                }
                charCounter = 0;
                char[] decodedChar = new char[i.length()];
                for (int j = 0; j < rows; j++) {

                    if (j % 2 == 0) {
                        for (int k = 0; k < columns; k++) {
                            decodedChar[charCounter] = decode[j][k];
                            charCounter++;
                        }
                    }
                    else {
                        for (int k = columns - 1; k > -1; k--) {
                            decodedChar[charCounter] = decode[j][k];
                            charCounter++;
                        }
                    }
                }
                cycleCount++;
                String output = String.valueOf(decodedChar);
                System.out.println(output);
            }
            else if (i.equals("0")) {
                break;
            }
        }
    }
}
