package day28;

public class SkipChar {
    public static void main(String[] args) {
        skip("", "baccadaksa");
        System.out.println(skipChar("palak"));
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

    static String skipChar(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch=='a'){
            return skipChar(str.substring(1));
        }
        else{
            return ch+skipChar(str.substring(1));
        }
    }
}
