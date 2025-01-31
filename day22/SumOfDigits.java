package day22;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(1342));
        System.out.println(product(100));
    }
    static int sum(int n){
        if (n==0){
            return 0;
        }
        int a =n%10;
        n = n/10;
        return a+sum(n);
    }
    static int product(int n){
        if (n==0){
            return 1;
        }
        int a =n%10;
        n = n/10;
        return a*product(n);
    }
}
