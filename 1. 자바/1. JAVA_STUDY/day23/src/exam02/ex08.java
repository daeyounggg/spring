package exam02;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class ex08 {
    public static void main(String[] args) {

        //BinaryOperator<Integer> cal = (a,b) -> a+b;
        //언박싱, 오토박싱, 언박싱 -> 성능저하

        //int result = cal.apply(10,20);
        IntBinaryOperator cal = (a, b) -> a+b;
        int result = cal.applyAsInt(10,20);
        System.out.println(result);
    }
}
