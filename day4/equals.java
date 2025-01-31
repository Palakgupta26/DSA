package day4;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a= sc.next();
        String b= sc.next();
        System.out.println(a.equals(b));
        System.out.println(a.contains(b));
    }
}
