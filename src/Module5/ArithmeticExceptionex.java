package Module5;
// Program 1

public class ArithmeticExceptionex {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=0;
        try{
            k=i/j;
        }catch (ArithmeticException e){
            System.out.println("There is Arithmetic Logical Error");
        }
        System.out.println("The value of k is: "+k);
    }
}

