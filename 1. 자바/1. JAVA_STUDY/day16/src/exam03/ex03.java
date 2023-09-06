package exam03;

import java.util.HashSet;
import java.util.Random;

public class ex03 {
    public static void main(String[] args) {
        HashSet<Integer> lottos = new HashSet<Integer>();

        while(lottos.size()<6){
            int num = (int)(Math.random()*45+1);
            lottos.add(num);

        }
        System.out.println(lottos);
    }

}
