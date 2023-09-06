package exam01;

public class ex08 {
    public static void main(String[] args){
        String str = "";
        System.out.println("isEmpty : "+ str.isEmpty());

        String str2 = "    ";
        System.out.println("isBlank : "+ str.isBlank());
        System.out.println("trim().isEmpty() : "+ str.trim().isEmpty());

        String str3 = "         ABC         ";
        System.out.println("trim() : " + str3.trim());
    }
}
