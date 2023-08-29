package exam03;

import java.lang.annotation.Annotation;
import java.util.Arrays;

@MyAnno(value = {"값3","값4"}, min = 10, max = 100)
public class ex02 {
    public static void main(String[] args){
        Class cls = ex02.class;

        MyAnno anno = (MyAnno)cls.getAnnotation(MyAnno.class);
        String[] values = anno.value();
        System.out.println(Arrays.toString(values));
        int min = anno.min();
        int max = anno.max();

        System.out.printf("min = %d%n",min);
        System.out.printf("max = %d%n",max);
        //String value = anno.value();
       // System.out.println(value);
    }
}
