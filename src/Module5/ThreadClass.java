package Module5;
// Program 6

public class ThreadClass extends Thread{
    String college;
    int usn;
    int time;
    String access;
    public ThreadClass(String college, int usn, int time, String access) {
        this.college = college;
        this.usn = usn;
        this.time = time;
        this.access=access;
    }
    public void run(){
        System.out.println(college+" "+usn+" "+time+" "+access);
    }
}
class collegeentry {
    public static void main(String[] args) {
        ThreadClass s1=new ThreadClass("Sapthagiri",20,8,"Allow");
        ThreadClass s2=new ThreadClass("Sapthagiri",20,9,"Allow");
        ThreadClass s3=new ThreadClass("Sapthagiri",20,11,"Access denied");
        s1.start();
        s2.start();
        s3.start();
    }
}

