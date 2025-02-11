package day34;

import java.util.ArrayList;
import java.util.List;

public class MazeRestricted {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        System.out.println(mazeWithRestriction("",maze, maze.length-1, maze[0].length-1));
    }

    static List<String> mazeWithRestriction(String p, boolean[][]maze, int r, int c){
        if(r==0 && c==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (!maze[r][c]){
            return list;
        }
        if(r>0){
            list.addAll(mazeWithRestriction(p+"d",maze,r-1,c));
        }
        if(c>0){
            list.addAll(mazeWithRestriction(p+"r",maze,r,c-1));
        }
        return list;
    }
}
