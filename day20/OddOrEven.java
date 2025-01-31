package day20;

public class OddOrEven {
    public static void main(String[] args) {
        int num = 109;
        System.out.println(isEven(num));
    }
    static boolean isEven(int n){
        if ((n & 1) ==1){
            return false;
        }
        return true;
    }
}
