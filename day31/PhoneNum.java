package day31;

public class PhoneNum {
    public static void main(String[] args) {
        num("","23");
    }
    static void num(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        int digit  = up.charAt(0) - '0';
        for(int i=(digit-2)*3; i<((digit-2)*3) + 3; i++){
            char ch  =(char)('a'+i);
            num(p+ch,up.substring(1));
        }
    }
}
