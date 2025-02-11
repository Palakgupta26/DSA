package day34;

public class AllPath {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        allPath("",maze, maze.length-1, maze[0].length-1);
    }
    static void allPath(String p, boolean[][]maze, int r, int c){
        if(r==0 && c==0){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        if(r>0){
           allPath(p+"d", maze,r-1,c);
        }
        if(c>0){
            allPath(p+"r",maze,r,c-1);
        }
        if(r<maze.length-1){
            allPath(p+"l",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allPath(p+"u",maze,r,c+1);
        }
        maze[r][c] = true;
    }

}
