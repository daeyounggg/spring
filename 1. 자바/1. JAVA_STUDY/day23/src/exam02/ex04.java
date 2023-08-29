package exam02;

public class ex04 {
    public static void main(String[] args) {
       // MyLamda my = s -> System.out.println(s);
       // my.print("abc");
        MyLamda my = () -> System.out.println("ABC");
        my.print();
    }
}
