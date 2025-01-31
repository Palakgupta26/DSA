package day25;

public class PatternUsingRecursion {
    public static void main(String[] args) {
        print(4,0);
        print2(4,0);
    }
    static void print2(int r, int c){
        if(r==0){
            return;
        }
        if (r>c){
            print2(r,c+1);
            System.out.print("*"+" ");
        }
        else {
            print2(r-1,0);
            System.out.println();
        }
    }

    static void print(int r, int c){
        if (r == 0){
            return;
        }
        if (r>c){
            System.out.print("*"+" ");
            print(r,c+1);
        }
        else{
            System.out.println();
            print(r - 1, 0);
        }
    }
}
