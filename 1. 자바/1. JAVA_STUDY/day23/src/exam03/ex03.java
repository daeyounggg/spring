package exam03;

import java.util.ArrayList;
import java.util.Arrays;

public class ex03 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Mango", "Orange"));
        //fruits.forEach(s -> System.out.println(s));
        fruits.forEach(System.out::println);
    }
}
