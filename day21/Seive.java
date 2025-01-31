package day21;

public class Seive {
    public static void main(String[] args) {
        int num = 41;
        boolean[] arr = new boolean[num+1];
        isPrime(arr,num);
    }
    static void isPrime(boolean[] arr, int n){
        for (int i=2; i*i<=n; i++){
            if (arr[i] == false){
                for(int j = 2*i; j< arr.length; j=j+i){
                        arr[j] = true;
                }
            }
        }
        for (int i = 2; i<arr.length; i++){
            if(arr[i]==false){
                System.out.print(i+" ");
            }
        }
    }
}
