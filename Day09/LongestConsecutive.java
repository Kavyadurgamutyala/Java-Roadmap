package Day09;
import java.util.*;

public class LongestConsecutive {
    public static void main(String[] args){

        int[] nums = {100, 4, 200, 1, 3, 2};

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
            set.add(num);

        int maxLength = 0;

        for(int num : set){
            if(!set.contains(num - 1)){
                int currentNum = num;
                int length = 1;

                while(set.contains(currentNum + 1)){
                    currentNum++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        System.out.println("Longest Consecutive = " + maxLength);
    }
}