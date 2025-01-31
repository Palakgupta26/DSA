package day25;

import java.util.ArrayList;

public class SumOfThree {
    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(12));
    }

    static boolean checkPowersOfThree(int n) {
        helper(n);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + (int) Math.pow(3, list.get(i));
        }
        return (sum == n);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void helper(int n) {
        if (n == 2 || n <= 0) {
            return;
        }
        int a = 0;
        while (Math.pow(3, a) <= n) {
            a++;
        }
        int b = n - (int) Math.pow(3, a-1);
        int i = list.size()-1;
        if(list.isEmpty()){
            list.add(a - 1);
        }
        else if(list.get(i)!= a-1){
            list.add(a - 1);
        }
        helper(b);
    }
}
