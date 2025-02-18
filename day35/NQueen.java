package day35;

public class NQueen {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0,0));
    }
    static int queens(boolean[][] board, int r, int c){
        if(r==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        for(int i=0; i<board.length; i++){
            if(isSafe(board,r,i)){
                board[r][i]=true;
                count = count + queens(board,r+1,i);
                board[r][i]=false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] board, int r, int c) {
        for(int i=r;i>=0; i--){
            if(board[i][c]==true){
                return false;
            }
        }
        int maxLeft = Math.min(r,c);
        for(int i =1; i<=maxLeft; i++){
            if(board[r-i][c-i]==true){
                return false;
            }
        }
        int maxRight = Math.min(r,board.length-c-1);
        for(int i =1; i<=maxRight; i++){
            if(board[r-i][c+i]==true){
                return false;
            }
        }
        return true;
    }

    static void display(boolean[][] board){
        for(int i=0 ; i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]==true){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
