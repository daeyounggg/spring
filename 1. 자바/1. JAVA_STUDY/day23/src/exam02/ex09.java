package exam02;

import java.util.Arrays;
import java.util.List;

public class ex09 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("APPLE","MANGO","MELON");

        fruits.replaceAll(s->s.toLowerCase());
        System.out.println(fruits);
    }
}
