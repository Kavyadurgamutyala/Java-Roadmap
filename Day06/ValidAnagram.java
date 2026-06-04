package Day06;
import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args){

        String s = "anagram";
        String t = "nagaram";

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        if(Arrays.equals(sArr, tArr))
            System.out.println("true - anagram");
        else
            System.out.println("false - not anagram");
    }
}