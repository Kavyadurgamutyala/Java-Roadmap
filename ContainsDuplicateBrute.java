import java.util.*;

public class ContainsDuplicateBrute {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(!set.add(num)){
            //  ↑
            // add() returns false → duplicate!
            // ! flips false to true → enters if block
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}