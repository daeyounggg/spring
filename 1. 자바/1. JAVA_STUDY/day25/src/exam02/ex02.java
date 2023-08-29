package exam02;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;
public class ex02 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"이이름",'F'));
        students.add(new Student(2,"이이름",'M'));
        students.add(new Student(3,"이이름",'F'));
        students.add(new Student(1,"김이름",'M'));
        students.add(new Student(2,"김이름",'F'));
        students.add(new Student(3,"김이름",'M'));
        students.add(new Student(1,"박이름",'F'));
        students.add(new Student(2,"박이름",'M'));
        students.add(new Student(3,"박이름",'F'));

        Map<String,Student> student2 =  students.stream().collect(toMap(s -> s.getBan() + s.getName(), s -> s));

        for(Map.Entry<String, Student> entry : student2.entrySet()){
            String key = entry.getKey();
            Student value = entry.getValue();
            System.out.printf("key = %s , value = %s%n",key,value,student2);
        }
    }
}
