package day21;

public class HCF {
    public static void main(String[] args) {
        int a =9;
        int b =18;
        System.out.println(hcf_gcd(a,b));
    }
    static int hcf_gcd(int a, int b){
        if (a==0){
            return b;
        }
        return hcf_gcd(b%a, a);
    }
}
