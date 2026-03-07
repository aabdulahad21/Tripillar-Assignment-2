package Module4;
// Program 10

public class StaticBlock {
    static{
        System.out.println("It is executed earlier than Main method");
        System.out.println("Waiting for execution of main method....");
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Addition value is: "+(a+b));
    }
}

