package day21;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.printf("%.5f",(root(40, 5)));
    }
    static double root(int num, int d){
        int start =0;
        int end = num;
        double ans =0.0;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (mid*mid == num){
                return mid;
            }
            if (mid*mid > num){
                end =mid-1;
            }
            else {
                start = mid+1;
            }
        }
        ans = end;
        double incr = 0.1;
        for(int i=0; i<d; i++){
            while (ans*ans <= num){
                ans = ans+incr;
            }
            ans = ans - incr;
            incr = incr/10;
        }
        return ans;
    }
}
