package day34;

import java.util.Arrays;

public class PrintPath {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        print("",maze, 0, 0,path,1);
    }
    static void print(String p, boolean[][]maze, int r, int c, int[][] path, int count){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c] = count;
            for (int i=0; i<path.length;i++){
                System.out.println(Arrays.toString(path[i]));
            }
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = count;
        if(r>0){
            print(p+"u", maze,r-1,c, path, count+1);
        }
        if(c>0){
            print(p+"l",maze,r,c-1, path,count+1);
        }
        if(r<maze.length-1){
            print(p+"d",maze,r+1,c, path,count+1);
        }
        if(c<maze[0].length-1){
            print(p+"r",maze,r,c+1, path,count+1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
