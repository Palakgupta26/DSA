package day29;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        subSequence("","abc");
        System.out.println(subSeq2("","abc",str));
        System.out.println(subSeq3("","abc"));
    }

    static ArrayList<String> subSeq3(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> list2=subSeq3(p+ch,up.substring(1));
        ArrayList<String> list3=subSeq3(p,up.substring(1));
        list2.addAll(list3);
        return list2;
    }

    static ArrayList<String> str = new ArrayList<>();
    static ArrayList<String> subSeq2(String p, String up, ArrayList<String> str){
        if(up.isEmpty()){
            str.add(p);
            return str;
        }
        char ch = up.charAt(0);

        subSeq2(p+ch,up.substring(1),str);
        subSeq2(p,up.substring(1),str);
        return str;
    }
    static void subSequence(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);

        subSequence(p+ch,up.substring(1));
        subSequence(p,up.substring(1));
    }
}
