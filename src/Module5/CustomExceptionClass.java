package Module5;
// Program 4

public class CustomExceptionClass {
    public static void main(String[] args) {
        int a,b,c=0;
        a=5;
        b=0;
        String s="Ahad";
        try{
            c=a/b;
            s.charAt(9);
        }catch (Exception e){
            System.out.println("there is some invalid input");
        }
        System.out.println("the value of c is "+c);
    }
}

