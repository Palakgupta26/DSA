package day2;

import java.util.Scanner;

public class isArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(Armstrong(a));
//        for (int i=1; i<1000; i++){
//            if (Armstrong(i)){
//                System.out.print(i+" ");
//            }
//        }
    }
    static boolean Armstrong(int n) {
        int num = n;
        double sum = 0;
        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            count++;
        }
        //System.out.println(count);
        int[] arr = new int[count];
        int b = num;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = b % 10;
            b = b / 10;
            sum = sum + Math.pow(arr[i], count);
        }
        if (sum == num) {
            return true;
        } else return false;
    }
}
