package eaxm01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ex04 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("1이름");
        names.add("2이름");
        names.add("3이름");
        names.add("4이름");
        names.add("5이름");

        ListIterator<String> iter = names.listIterator();
        while(iter.hasNext()){
            String name = iter.next();
            System.out.println(name);
        }
        System.out.println("--------------------------------");

        while(iter.hasPrevious()){
            String name = iter.previous();
            System.out.println(name);
        }
    }
}
