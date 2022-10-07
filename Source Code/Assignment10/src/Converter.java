/**
 * Class containing the methods for conversion
 * @author Isaac Shoebottom (3429069)
 */

public class Converter {

    /**
     * Convert hexadecimal to base 10
     * @param hex String containing the hex digits
     * @return returns the decimal value
     */
    static long hex2Decimal(String hex) {
        String hexChars = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        long decimal = 0;
        int intermediaryValue;
        char index;
        for (int i = hex.length(), p = 0; i != 0; i--, p++) {
            index = hex.charAt(i-1);
            intermediaryValue = hexChars.indexOf(index);
            if (intermediaryValue == -1)
                return -1;
            decimal = decimal + intermediaryValue*(int)(Math.pow(16, p));
        }
        return decimal;
    }

    /**
     * Converts the english text to the encoded text
     * @param english String containing standard english
     * @return Returns encoded text
     */
    static String english2Encrypted(String english) {
        english = english.toUpperCase();
        if (english.length() > 1) {
            english = swapFirstAndLastLettersInString(english);
        }

        for (int i = 0; i < english.length(); i++) {
            char index = english.charAt(i);
            switch (index) {
                case 'E':
                    english = replaceInString(english, i, "A");
                    break;
                case 'A':
                    english = replaceInString(english, i, "E");
                    break;
                case 'O':
                    english = replaceInString(english, i, "I");
                    break;
                case 'I':
                    english = replaceInString(english, i, "O");
                    break;
                case 'U':
                    english = replaceInString(english, i, "Y");
                    break;
                case 'Y':
                    english = replaceInString(english, i, "U");
                    break;
            }
        }
        return english;
    }

    /**
     * Replace a letter in a string
     * @param str String to be modified
     * @param index The character's index to be replaced
     * @param replace The string that will be replacing the character
     * @return The string with the string replaced
     */
    private static String replaceInString(String str, int index, String replace){
        return str.substring(0, index) + replace + str.substring(index+1);
    }

    /**
     * Swaps the first and letters in every word in a string
     * @param str The string to be swapped
     * @return The string with letters swapped
     */
    private static String swapFirstAndLastLettersInString(String str) {
        StringBuilder output = new StringBuilder();
        String[] splitStr = str.trim().split("\\s+");

        for(int i = 0; i < splitStr.length; i++) {
            if (splitStr[i].length() != 1) {
                splitStr[i] = swapFirstAndLastLetterFromWord(splitStr[i]);
            }

            output.append(" ").append(splitStr[i]);
            if (i == 0) {
                output = new StringBuilder(splitStr[i]);
            }

        }

        return output.toString();
    }

    /**
     * Method to swap the first and last letters in a word
     * @param str The string to be swapped
     * @return The swapped string
     */
    private static String swapFirstAndLastLetterFromWord(String str) {
        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }
}