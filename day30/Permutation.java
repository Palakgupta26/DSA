package day30;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(permutationcount("", "abcd"));
        System.out.println(perm("", "abc"));
    }

    static int permutationcount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            String ans = f + ch + s;
            count = count + permutationcount(ans, up.substring(1));
        }
        return count;
    }

    static ArrayList<String> perm(String p, String up) {
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            String ans = f + ch + s;
            answer.addAll(perm(ans, up.substring(1)));
        }
        return answer;
    }

    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            String ans = f + ch + s;
            permutation(ans, up.substring(1));
        }

    }
}
