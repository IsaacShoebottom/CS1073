import java.util.Arrays;

public class IntArrayUtilDriver {
    public static void main(String[] args) {
        int[] array1 = {1, 4 ,9, 16};
        int[] array2 = {9, 7, 4, 9 ,11};

        int[] array3 = IntArrayUtil.append(array1, array2);


        System.out.println("These are the original strings");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));

        System.out.println("These are the modified strings");
        System.out.println(Arrays.toString(IntArrayUtil.append(array1, array2)));
        System.out.println(Arrays.toString(IntArrayUtil.reverse(array3)));
        System.out.println(IntArrayUtil.alternatingSum(array3));
    }
}
