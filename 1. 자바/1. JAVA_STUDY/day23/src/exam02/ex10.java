package exam02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ex10 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple","Mango","Orange"));

        fruits.forEach(s-> System.out.println(s));
    }
}
