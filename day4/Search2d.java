package day4;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Search2d {
    public static void main(String[] args) {
        int[][] arr ={
                {1,2,3},
                {4,6,221,90},
                {80,74,2}
        };
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        search(arr, num);
    }
    static void search(int arr[][], int num){
        if(arr.length==0){
            System.out.println("Array empty");
        }
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length;j++){
                if (arr[i][j]==num) {
                    System.out.println(i + "," + j);
                }
            }
        }
    }
}
