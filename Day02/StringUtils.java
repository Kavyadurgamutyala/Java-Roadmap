package Day02;
public class StringUtils {

    static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    static boolean isPalindrome(String str){
        return str.equals(reverse(str));
    }

    static int countVowels(String str){
        int count = 0;
        for(char c : str.toCharArray()){
            if("aeiouAEIOU".indexOf(c) != -1)
                count++;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println("reverse:     " + reverse("hello"));
        System.out.println("palindrome:  " + isPalindrome("racecar"));
        System.out.println("vowels:      " + countVowels("hello world"));
    }
}