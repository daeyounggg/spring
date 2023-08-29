package exam02;

import java.io.*;

public class ex08 {
    public static void main(String[] args) throws IOException {
        System.out.printf("아무거나 입력 :");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while(true){

            //char ch = (char)System.in.read();
           // char ch = (char)isr.read();
            //System.out.print(ch);
        String line = br.readLine();
        System.out.println(line);
        }
    }
}
