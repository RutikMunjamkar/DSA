import java.util.Arrays;
import java.util.Collections;
public class SortingArray {
    public static void main(String[] args) {
        int[]arr={1,5,2,3,9,6,7};
        Arrays.sort(arr);
        //for the array descending sorting is not possible it is only possible in case of the Wrapper class array
        Integer[] arr2 = { 30, 20, 40, 10 };
        Arrays.sort(arr2,Collections.reverseOrder());
    }
}
