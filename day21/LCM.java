package day21;

public class LCM{
    public static void main(String[] args) {
        int a = 10;
        int b = 9;
        System.out.println(lcm(a,b));
    }
    static int lcm(int a, int b){
        int ans = (a*b) / hcf(a,b);
        return ans;
    }
    static int hcf(int a, int b){
        if (a==0){
            return b;
        }
        return hcf(b%a,a);
    }
}
