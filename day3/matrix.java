package day3;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //list.add(0);
        for (int i=0; i<7 ;i++){
            list.add(sc.nextInt());
        }
        for (int i=0; i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
