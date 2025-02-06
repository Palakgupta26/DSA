package day29;

public class ASCII {
    public static void main(String[] args) {
//        char ch ='a';
//        System.out.println(ch+0);
//        String str ="abs";
//        System.out.println(str.substring(0,0));
        int[] arr ={4,5,6,7,0,2,1,3};
        System.out.println(restoreString("codeleet",arr));
    }
    static String restoreString(String s, int[] indices) {
        String original = s;
        for(int i=0; i<indices.length; i++){
            s.replace(s.charAt(i), original.charAt(indices[i]));
        }
        return s;
    }
}
