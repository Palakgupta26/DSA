package day28;

public class SkipWord {
    public static void main(String[] args) {
        System.out.println(skip("iampal palak gupta"));
    }
    static String skip(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("palak")){
            return skip(str.substring(5));
        }
        else{
            return str.charAt(0)+ skip(str.substring(1));
        }
    }
}
