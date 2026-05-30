package Day04;
import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1, 9, 2};

        // min
        int min = arr[0];
        for(int num : arr)
            if(num < min) min = num;
        System.out.println("Min = " + min);

        // max
        int max = arr[0];
        for(int num : arr)
            if(num > max) max = num;
        System.out.println("Max = " + max);

        // sum
        int sum = 0;
        for(int num : arr)
            sum += num;
        System.out.println("Sum = " + sum);

        // average
        double avg = (double) sum / arr.length;
        System.out.println("Avg = " + avg);

        // sort
        Arrays.sort(arr);
        System.out.println("Sorted = " + Arrays.toString(arr));

        // fill
        Arrays.fill(arr, 0);
        System.out.println("Filled = " + Arrays.toString(arr));

        // copyOf
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] copy = Arrays.copyOf(arr2, 3);
        System.out.println("Copy = " + Arrays.toString(copy));
    }
}