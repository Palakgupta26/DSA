package day3;

public class change {
    public static void main(String[] args) {
        int a =9;
        //System.out.println(a);
        changed(a);
        int [] arr ={1,2,3};
        changed(arr);
        System.out.println(changes(arr));
    }
    static void changed(int n){
        System.out.println(n=8);
    }
    static void changed(int[] arr){
        arr[0]=7;
        System.out.println(arr[0]);
    }
    static int changes(int[] arr){
        arr[0]=7;
        return arr[0];
    }

}
