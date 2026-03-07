package Module4;
// Program 8

public class DifferentStrings {
    public static void main(String[] args) {
        String s="Ahad";
        System.out.println("String before Modification :"+s);
        s.concat("Ben 10");
        System.out.println("String After Modification :"+s);
        StringBuilder builder =new StringBuilder("Ahad");
        System.out.println("StringBuilder before Modification :"+builder);
        builder.append(" Ben 10");
        System.out.println("StringBuilder After Modification :"+builder);
        StringBuffer buffer=new StringBuffer("Ahad");
        System.out.println("StringBuffer before Modification :"+buffer);
        buffer.append(" Ben 10");
        System.out.println("StringBuffer After Modification :"+buffer);
    }
}
//String cannot be modified whereas StringBuilder and StringBuffer can be modified

