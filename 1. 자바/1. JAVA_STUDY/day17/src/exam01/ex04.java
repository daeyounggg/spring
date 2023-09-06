package exam01;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            //String line = sc.nextLine();
           // System.out.println(line);
            System.out.print("두 수를 입력하세요 / 종료는 q");
            String line = sc.nextLine();
            System.out.println(line);

            if(line.equals("q")){
                System.out.println("종료");
                break;
            }
            String[] data = line.split(" ");
            // System.out.println(data[0]+"," + data[1]);
            int num1 = Integer.parseInt(data[0]);
            int num2 = Integer.parseInt(data[1]);
            System.out.printf("합: %d%n", num1 + num2);
        }
    }
}
