package day21;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 30;
        factors(n);
    }
    static void factors(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i*i<=n;i++){
            if(n%i==0){
                int rem = n/i;
                arr.add(rem);
                if(rem == i){
                    System.out.print(i);
                }
                else System.out.print(i+" ");
            }
        }
        for (int i=arr.size()-1; i>=0; i--){
            System.out.print(arr.get(i)+" ");
        }
    }
}
