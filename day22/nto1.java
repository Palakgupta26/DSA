package day22;
//O(N) space and time
public class nto1 {
    public static void main(String[] args) {
        fun(5);
        //System.out.println(fun2(5));
    }
    static void fun(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }
    static int fun2(int n){
        if (n==1){
            return 1;
        }
        System.out.println(n);
        return fun2(n-1);
    }
}
