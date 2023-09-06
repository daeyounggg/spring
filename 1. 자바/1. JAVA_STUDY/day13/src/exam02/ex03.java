package exam02;

public class ex03 {
    public static void main (String[] args){
         try {
             String str = null;
             str = str.toUpperCase(); // throw new NullPointerException(...);


         }catch(NullPointerException e){ // NullPointerException e = new NullPointerExceptoin(...)
                //String message = e.getMessage();
                //System.out.println(message);
                e.printStackTrace();
         }
        System.out.println("매우 중요한 코드");
    }
}
