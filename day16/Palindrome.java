package day16;

public class Palindrome {
    public static void main(String[] args) {
        String a = "null";
        System.out.println(isPalindrome(a));
    }
    static boolean isPalindrome(String a){
        if (a == null){
            return true;
        }
        a = a.toLowerCase();
        int start = 0;
        int end = a.length() -1;
        while(start<=end){
            char start_char = a.charAt(start);
            char end_char = a.charAt(end);
            if(start_char != end_char){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
