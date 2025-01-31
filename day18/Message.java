package day18;

public class Message {
    public static void main(String[] args) {
        message1();
    }
    static void message1(){
        message2();
        System.out.println("1");
    }
    static void message2(){
        System.out.println("2");
        message3();
        System.out.println(4);
    }
    static void message3(){
        System.out.println("3");
    }
}
