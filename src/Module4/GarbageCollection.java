package Module4;
// Program 7

public class GarbageCollection {
    public static void main(String[] args) {
        String s=new String("Hello");
        String s1=new String("Ahad");
        s=s1;
        System.gc();
        System.out.println(s);
    }
}
