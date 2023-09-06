package exam01;

public class ex01 {
    public static void main(String[] args){
        //C c = new C();

        A a = new C();
        B b = new C();
        A ad = new D();

        if (ad instanceof C) {
            C c = (C) ad;
        }

        if(a instanceof C) {
            C c2 = (C) a;
            System.out.printf("numA = %d , numB = %d, numC = %d",c2.numA,c2.numB,c2.numC);
        }
    }

}
