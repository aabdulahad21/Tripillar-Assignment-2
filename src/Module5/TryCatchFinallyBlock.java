package Module5;
// Program 2

public class TryCatchFinallyBlock {
    public static void main(String[] args) {
        int a, b, c = 0;
        a = 20;
        b = 2;
        String name = "Ahad";
        try {
            c = a / b;
            name.charAt(9);
        } catch (ArithmeticException e) {
            System.out.println("there is an Arithmetic error");
        } catch (StringIndexOutOfBoundsException s) {
            System.out.println("Invalid input");
        } finally {
            System.out.println("code execution successfull");
        }
        System.out.println("the value of c is:" + c);
    }
}

