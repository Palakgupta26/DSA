package day26;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInPlace(int[] arr, int s, int e){
        if(e-s==1){
            return;
        }
        int m = s+(e-s)/2;
        mergeSortInPlace(arr,s,m);
        mergeSortInPlace(arr,m,e);
        mergeInPlace(arr,s,m,e);
    }
    static void mergeInPlace(int[] arr, int s, int m, int e){
        int[] newArr = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;

        while (i<m && j<e){
            if(arr[i]<arr[j]){
                newArr[k]= arr[i];
                i++;
            }
            else{
                newArr[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            newArr[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            newArr[k]=arr[j];
            j++;
            k++;
        }
        for(int l =0; l<newArr.length;l++){
            arr[s+l]= newArr[l];
        }
    }
}
