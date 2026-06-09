package Day08;

public class RansomNote {
    public static void main(String[] args){

        String ransomNote = "aa";
        String magazine   = "aab";

        for(char c : ransomNote.toCharArray()){
            if(magazine.indexOf(c) == -1){
                System.out.println("false");
                return;
            }
            magazine = magazine.replaceFirst(String.valueOf(c), "");
        }
        System.out.println("true");
    }
}