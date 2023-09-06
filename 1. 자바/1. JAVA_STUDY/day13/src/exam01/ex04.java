package exam01;

public class ex04 {
    public static void main(String[] args){
        A a = new A(){
            public void method(){
                System.out.println("변경된 method()");
            }

        };
        a.method();
    }

}
