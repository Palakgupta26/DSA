package day22;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalin(123432));
    }


    static boolean isPalin(int n) {
        if (n == rev(n)){
            return true;
        }
        else return false;
    }
    static int rev(int n){
        int digits = (int)Math.log10(n);
        return helper(n,digits);
    }
    static int helper(int n, int digits){
        if(n==0){
            return 0;
        }
        int a = n%10;
        n=n/10;
        return a*(int)Math.pow(10,digits)+helper(n,digits-1);
    }

}
