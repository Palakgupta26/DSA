package day22;

public class CountZero {
    public static void main(String[] args) {
        zeroes(100002309100000L);
        System.out.println(count);
        System.out.println(count(102902800L,0));
        System.out.println(count2(102902800L));
    }

    static int count(long n, int c){
        if(n==0){
            return c;
        }
        long a =n%10;
        n=n/10;
        if(a==0){
            c++;
        }
        return count(n,c);
    }

    static int count2(long n){
        return helper(n,0);
    }
    static int helper(long n, int c){
        if(n==0){
            return c;
        }
        long a = n%10;
        n=n/10;
        if(a==0){
            c++;
        }
        return helper(n,c);
    }


    static int count =0;
    static long zeroes(long n){
        if (n==0){
            return 0;
        }
        long a = n%10;
        n=n/10;
        if(a==0){
            count++;
        }
        return zeroes(n);
    }
}

