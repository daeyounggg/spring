package exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ex03 {
    public static void main(String[] args){
        Class cls1 = Student.class;

        Field[] fields = cls1.getFields();
        for(Field field : fields){
            System.out.println(fields);

        }

        Method[] methods = cls1.getMethods();
        for(Method method : methods){
            System.out.println(method);
        }


        Constructor[] constructors = cls1.getConstructors();
        for(Constructor constructor : constructors){
            System.out.println(constructor);
        }
    }
}
