public class day36 {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        System.out.println(solver(board,0,0));
    }

    public static boolean solver(int[][] board, int r, int c){
        if(r==board.length ){
            display(board);
            return true;
        }
        if(c==board.length){
            return solver(board,r+1,0);
        }
        if(board[r][c] != 0){
            return solver(board,r,c+1);
        }
            for(int i=1; i<=9;i++){
                if(isSafe(board,r,c,i)){
                    board[r][c] = i;
                    if(solver(board,r,c+1)){
                        return true;
                    }
                }
                board[r][c] = 0;
            }

        return false;
    }

    public static boolean isSafe(int[][] board, int r, int c, int num){
        for(int i =0; i<board.length; i++){
            if(board[i][c]==num){
                return false;
            }
        }

        for(int i =0; i<board.length; i++){
            if(board[r][i]==num){
                return false;
            }
        }

        int sqr = (int)Math.sqrt(board.length);
        int rStart = r - r%sqr;
        int cStart = c - c%sqr;
        for(int i = rStart; i < rStart+sqr;i++){
            for(int j = cStart; j< cStart +sqr; j++){
                if(board[i][j] == num){
                    return false;
                }
            }
        }

        return true;
    }
    public static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

