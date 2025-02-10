package day33;

public class Maze {
    public static void main(String[] args) {
        System.out.println(countPath(2,2));
    }
    static int countPath(int row, int col){
        if(row==0 || col==0){
            return 1;
        }
        int count = 0;
        count= count + countPath(row-1,col);
        count= count + countPath(row,col-1);
        return count;
    }
}
