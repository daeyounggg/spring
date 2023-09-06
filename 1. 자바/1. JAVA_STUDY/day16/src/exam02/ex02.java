package exam02;

public class ex02 {
    public static void main(String[] args) {
        int num1 = 100;
        Integer num2 = num1; // Integer num2 = Integer.valueOf(num1);


        Integer num3 = new Integer(300);
        int result = num1 + num3;
        System.out.println(result);
    }
}
