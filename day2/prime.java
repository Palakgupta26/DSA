package day2;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isPrime(a));
    }
    static boolean isPrime(int a){
        if (a<=1){
            return false;
        }
        int c=2;
        while (c*c <=a){
            if (a % c ==0){
                return false;
            }
            c++;
        }
        if (c * c > a) return true;
        return false;
    }
}
