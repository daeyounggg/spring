package exam01;

public class ex01{
    public static void main(String[] args){
        //Calculator cal = new Calculator();
        //int result = cal.add(10,20);

        SimpleCalculator cal = new SimpleCalculator();

        int result = cal.add(10,20);
        System.out.println(result);

        int result2 = cal.minus(10,20);
        System.out.println(result2);


    }
}
