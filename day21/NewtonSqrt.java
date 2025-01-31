package day21;

public class NewtonSqrt {
    public static void main(String[] args) {
        int num = 40;
        System.out.printf("%.4f",sqrt(num));
    }
    static double sqrt(double n){
        double x = n;
        double root;
        while (true){
            root = (x+(n/x)) /2;
            if (Math.abs(root - x)< 0.5){
                break;
            }
            x=root;
        }
        return root;
    }
}
