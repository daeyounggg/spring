package exam01;

import java.util.Arrays;
import java.util.List;

public class ex01 {
    public static void main(String[] args) {
        List<String> fruits1 = Arrays.asList("Apple", "Mango","Orange","Melon");
        String[] fruits2 = {"Apple", "Mango","Orange","Melon"};

        fruits1.stream().map(String::length).forEach(System.out::println);
        Arrays.stream(fruits2).map(String::length).forEach(System.out::println);

    }
}
