package day22;

public class ReverseNum {
    public static void main(String[] args) {
        reverse1(1234);
        //System.out.println(rev);
        System.out.println(reverse2(1234));
    }
    static int rev = 0;
    static void reverse1(int n){
        if (n==0) {
            return;
        }
        int a = n%10;
        n=n/10;
        rev = rev*10 +a;
        reverse1(n);
    }

    static int reverse2(int n){
        int digits = (int)Math.log10(n);
        return helper(n, digits);
    }
    static int helper(int n, int digits){
        if (n==0){
            return 0;
        }
        int a = n%10;
        n=n/10;
        return a*(int)Math.pow(10,digits) + helper(n,digits-1);
    }
}
