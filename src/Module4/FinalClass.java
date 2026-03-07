package Module4;
// Program 9

/* final class FinalClass {
    void display() {
        System.out.println("Final class Example");
    }
} */
//class Inherit extends FinalClassEx{
//}
// Final class cannot be inherited
final class Animal {
    void display() {
        System.out.println("This is a final class.");
    }
}
public class FinalClass {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.display();
    }
}
