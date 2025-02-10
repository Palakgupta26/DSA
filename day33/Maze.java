package day33;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(path("",2,2));
        System.out.println(pathDiagonal("",2,2));
    }
    static ArrayList<String> pathDiagonal(String p, int r, int c){
        if(r ==0 && c==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(c>0 && r>0){
            list.addAll(pathDiagonal(p+"d",r-1,c-1));
        }
        if(c>0){
            list.addAll(pathDiagonal(p+"R",r,c-1));
        }
        if(r>0){
            list.addAll(pathDiagonal(p+"D",r-1,c));
        }
        return list;
    }
    static ArrayList<String> path(String p, int r, int c){
        if(r ==0 && c==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(c>0){
            list.addAll(path(p+"R",r,c-1));
        }
        if(r>0){
            list.addAll(path(p+"D",r-1,c));
        }
        return list;
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
