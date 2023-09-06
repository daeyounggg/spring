package exam02;



public class ex01 {
    public static void main(String[] args){
       /* Calculator cal = new Calculator();
        int result = cal.add(10,20);
        System.out.println(result);
*/
        //SimpleCalculator cal = new SimpleCalculator();
        ComplexCalculator cal = new ComplexCalculator();
        int result = cal.add(10,20);
        System.out.println(result);

        System.out.println(cal.num);
    }

}
