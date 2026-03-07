package Module4;
// Program 6

public class StaticProgram {
    static String college="Sapthagiri";
    int usn;
    String name;

    public StaticProgram(int usn, String name) {
        this.usn = usn;
        this.name = name;
    }
}
class StaticMethod{
    public static int add(int a,int b){
        return a+b;
    }
}
class StudentDetails extends StaticProgram{
    int attendance;
    public StudentDetails(int usn, String name,int attendance) {
        super(usn, name);
        this.attendance=attendance;
    }
    void display(){
        System.out.println(name+" "+usn+" "+attendance+" "+StaticProgram.college);
    }

    public static void main(String[] args) {
        StudentDetails s=new StudentDetails(1,"Ahad",90);
        s.display();
        //Static method Example : we can use without creating object
        System.out.println(StaticMethod.add(5,4));
    }
}
