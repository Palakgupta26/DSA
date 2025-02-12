package day29;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        System.out.println(subSet(arr));
    }
    static ArrayList<ArrayList<Integer>> subSet(int[] arr){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i =0; i<arr.length;i++){
            int n = outer.size();
            for(int j=0;j<n;j++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
