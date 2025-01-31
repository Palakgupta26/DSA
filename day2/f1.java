package day2;

import java.util.Scanner;

public class f1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c = sum(a,b);
        System.out.print(c);
        }
    public static int sum(int a, int b){
        int sum;
        sum = a+b;
        return sum;
    }
}
