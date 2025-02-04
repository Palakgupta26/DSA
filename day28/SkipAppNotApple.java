package day28;

public class SkipAppNotApple {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("aplwappleapp"));
    }
    static String skipAppNotApple(String str){
        if(str.isEmpty()){
            return "";
        }
//        if(str.startsWith("palak")){
//            return str.charAt(0)+ skip(str.substring(1));
//        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipAppNotApple(str.substring(3));
        }
        else{
            return str.charAt(0)+ skipAppNotApple(str.substring(1));
        }
    }
}
