package day4;

import java.time.chrono.IsoEra;
import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        String name ="Palak";
        Scanner sc = new Scanner(System.in);
        char c = 'k';
        Boolean result = search(name, c);
        System.out.println(result);
        System.out.println(searchRange(name, c, 1, 3));
    }
    static Boolean search(String name, char c){
        if (name.isEmpty()){
            return false;
        }
        for(int i=0; i<name.length();i++){
            if ((name.charAt(i))==(c)){
                return true;
            }
        }
        return false;
    }
    static boolean searchRange(String name, char c, int start, int end){
        if (name.isEmpty()){
            return false;
        }
        for(int i=start; i<=end;i++){
            if ((name.charAt(i))==(c)){
                return true;
            }
        }
        return false;
    }
}
