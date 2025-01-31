package day16;

public class ComparisonString {
    public static void main(String[] args) {
        String a = "Palak";
        String b = "Palak";
        System.out.println(a==b);
        System.out.println(a.equals(b));

        String c = new String("Vaibhav");
        String d = new String("Vaibhav");
        System.out.println(c==d);
        System.out.println(c.equals(d));
    }
}
