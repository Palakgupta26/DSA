package day35;

public class NKnights {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board = new boolean[n][n];
        System.out.println(knights(board,0,0,n));
    }
    static int knights(boolean[][] board, int r,int c,int left){
        if(left==0){
            display(board);
            System.out.println();
            return 1;
        }
        if(r==board.length-1 && c==board.length){
            return 0;
        }
        if(c==board.length){
            knights(board,r+1,0,left);
            return 1;
        }
        int count=0;
        if(isSafe(board,r, c)) {
            board[r][c] = true;
            count = count + knights(board, r, c + 1, left - 1);
            board[r][c] = false;
        }
        count = count +knights(board,r,c+1,left);
        return count;
    }
    static boolean isSafe(boolean[][] board,int r,int c){
        if(isValid(board,r-2,c-1)){
            if (board[r - 2][c - 1]) {
                return false;
            }
        }
        if(isValid(board,r-2,c+1)){
            if (board[r - 2][c + 1]) {
                return false;
            }
        }
        if(isValid(board,r-1,c-2)){
            if (board[r - 1][c - 2]) {
                return false;
            }
        }
        if(isValid(board,r-1,c+2)){
            if (board[r - 1][c + 2]) {
                return false;
            }
        }
        return true;
    }
    static boolean isValid(boolean[][] board,int r, int c){
        if(r>=0 && r<board.length && c>=0 && c<board.length){
            return true;
        }
        return false;
    }
    static void display(boolean[][] board){
        for(int i=0 ; i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]==true){
                    System.out.print("K ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
