package day24;

import java.util.ArrayList;

public class FindAllindex {
    public static void main(String[] args) {
        int[] arr={12,5,3,6,4,6,6,9};
        int target = 6;
        findAllIndex(arr,target,0);
        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        System.out.println(findAllIdx(arr,target,0,list2));
        System.out.println(findAllIdx2(arr,target,0));
    }

    static ArrayList<Integer> findAllIdx2(int[] arr, int target, int i){
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        if(i==arr.length-1){
            return list3;
        }
        if (arr[i]== target){
            list3.add(i);
        }
        ArrayList<Integer> list4= findAllIdx2(arr,target,i+1);
        list3.addAll(list4);
        return list3;
    }

    static ArrayList<Integer> findAllIdx(int[] arr, int target, int i, ArrayList<Integer> list2){
        if(i==arr.length-1){
            return list2;
        }
        if (arr[i]== target){
            list2.add(i);
        }
        return findAllIdx(arr,target,i+1,list2);
    }

    static ArrayList<Integer> list = new ArrayList<Integer>();

    static void findAllIndex(int[] arr, int target, int i){
        if(i==arr.length-1){
            return;
        }
        if(arr[i]==target){
            list.add(i);
        }
        findAllIndex(arr,target,i+1);
    }

}
