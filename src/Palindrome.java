import java.util.Arrays;

class Palindrome {
    public static boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        char[] charResult = result.toCharArray();
        int i =0;
        int j = result.length()-1;
        while(i <j){
            if(charResult[i] != charResult[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("0p"));
    }
}