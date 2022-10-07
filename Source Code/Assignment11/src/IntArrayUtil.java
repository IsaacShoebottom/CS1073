/**
 * Array utils for ints
 * @author Isaac Shoebottom (3429069)
 */

public class IntArrayUtil {

    /**
     * Appends an array to another array
     * @param arrA First array in append
     * @param arrB Second array in append
     * @return Appended array
     */
    public static int[] append (int[] arrA, int[] arrB) {
        int appendedLength = arrA.length + arrB.length;
        int[] appended = new int[appendedLength];
        for(int i = 0; i < arrA.length; i++) {
            appended[i] = arrA[i];
        }
        for(int i = 0; i < arrB.length; i++) {
            appended[i + arrA.length] = arrB[i];
        }
        return appended;
    }

    /**
     * Reverse the order of elements in a string
     * @param arr The array to be reversed
     * @return The reversed array
     */
    public static int[] reverse (int[] arr) {
        int[] reversed = new int[arr.length];
        for(int i =0; i<arr.length; i++ ) {
           reversed[i] = arr[i];
        }

        for(int i = 0; i < arr.length/2; i++) {
            int temp = reversed[i];
            reversed[i] = arr[(arr.length-1) - i];
            reversed[(arr.length-1) - i] = temp;
        }

        return reversed;
    }

    /**
     * Subtracts every odd index from a string from every even index
     * @param arr The array to perform math on
     * @return The alternating sum of the array
     */
    public static int alternatingSum (int[] arr) {

        int positives = 0;
        int negatives = 0;
        boolean isPos = true;
        for (int j : arr)
            if (isPos) {
                positives += j;
                isPos = false;
            } else {
                negatives += j;
                isPos = true;
            }

        return positives-negatives;
    }
}
