package day16;

public class PrettyPrint {
    public static void main(String[] args) {
        float a = 12.3456789f;
        System.out.printf("Formatted String: %.2f",a);
        System.out.println();
        System.out.printf("My name is %s and I love %s.", "Palak", "cats");


        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println((char)('a'+3));
        System.out.println("a"+1);
        System.out.println((char)('a'+25));
    }
}
