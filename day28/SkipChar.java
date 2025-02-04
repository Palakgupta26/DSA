package day28;

public class SkipChar {
    public static void main(String[] args) {
        skip("", "baccadaksa");
    }

    static void skip(String news, String old) {
        if (old.isEmpty()) {
            System.out.println(news);
            return;
        }
        char ch = old.charAt(0);
        if (ch == 'a') {
            skip(news, old.substring(1));
        } else {
            skip(news + ch, old.substring(1));
        }
    }
}
