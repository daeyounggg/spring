package eaxm01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ex02 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("1이름");
        names.add("2이름");
        names.add("3이름");
        names.add("4이름");
        names.add("5이름");

        Iterator<String> iter = names.iterator();
        while(iter.hasNext()){
            String name = iter.next();
            System.out.println(name);
        }
        System.out.println("--------------------------------");

        iter = names.iterator();
        while(iter.hasNext()){
            String name = iter.next();
            System.out.println(name);
        }
/*
        for(int i = 0; i< names.size(); i++){
            names.remove(i);
        }

        for(int i = names.size()-1; i>=0 ;i--){
            names.remove(i);
        }


        for(String name : names){
            System.out.println(name);
        }*/
    }
}
