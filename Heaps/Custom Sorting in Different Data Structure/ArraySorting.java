import java.util.Arrays;
import java.util.Comparator;

public class ArraySorting {
    public static void main(String[] args) {
        int[]brr={4,2,8,1,0};
        //can be sorted in the ascending order
        Arrays.sort(brr);
        //can be sorted in the ascending order for the range of indices
        Arrays.sort(brr,0,3);
        int [][]arr={{2,6},{8,1},{7,0},{6,3}};
        //used to sort the 2D array based on the indices
        Arrays.sort(arr, Comparator.comparingInt(a->a[1]));
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        //for the array descending sorting is not possible it is only possible in case of the Wrapper class array
        Integer[] arr2 = { 30, 20, 40, 10 };
        Arrays.sort(arr2, Comparator.reverseOrder());
    }
}
