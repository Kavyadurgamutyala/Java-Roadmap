package Day09;
import java.util.Arrays;

class LongestConsecutiveBrute {
    public static void main(String[] args){
        int arr[] = {2,1,3,5,6,7,9,8,0};

        Arrays.sort(arr);

        int i = 0;
        int cou = 1;
        int maxCou = 1;

        for(int j = 1; j < arr.length; j++){
            if(arr[j] == arr[i] + 1){
                cou++;
                i++;
            } else {
                cou = 1;  // reset
                i = j;    // move i forward
            }
            if(cou > maxCou)
                maxCou = cou;
        }

        System.out.println("Max = " + maxCou);
    }
}