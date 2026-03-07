package Module4;
// Program 1

abstract class AbstractClassShape  {
    abstract void display();
}
class Circle extends AbstractClassShape {
    @Override
    void display(){
        System.out.println("Tripillar Coding Assignment");
    }
    public static void main(String[] args) {
        AbstractClassShape  c=new Circle();
        c.display();
    }
}
