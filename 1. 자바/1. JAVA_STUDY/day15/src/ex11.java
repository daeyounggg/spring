import java.util.Arrays;

public class ex11 {
    public static void main(String[] args){
       int total = add(10,20,30,40,50);
        int total2 = add(10,20);

        System.out.printf("total = %d%n", total);
        System.out.printf("total = %d%n", total2);
    }
    public static int add(int... nums){
      // System.out.println(Arrays.toString(nums));
        int total = 0;
        for (int num: nums){
            total += num;
        }
        System.out.println(Arrays.toString(nums));
       return 0;
    }
}
