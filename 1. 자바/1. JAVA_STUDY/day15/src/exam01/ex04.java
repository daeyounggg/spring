package exam01;

public class ex04 {
    public static void main(String[] args){
        try {
            Class cls = Class.forName("exam01.Student");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
