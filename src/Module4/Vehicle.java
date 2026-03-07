package Module4;
// Program 2

public interface Vehicle {
    void start();
}
class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Need key to start");
    }

    public static void main(String[] args) {
        Car c=new Car();
        c.start();

    }
}

