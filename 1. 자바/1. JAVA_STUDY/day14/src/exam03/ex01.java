package exam03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ex01 {
    public static void main(String[] args){
        FileInputStream fis = null;
        try {
             fis = new FileInputStream("a.txt"); // FileNotFoundException

            // 예외가 없을때만 자원 해제
            fis.close(); // 자원 해제 - IOException
            System.out.println("자원해제1");
            // }catch (FileNotFoundException e){
        }catch (IOException e) {
            e.printStackTrace();
        }finally { // 예외가 발생하던 안하던 항상 수행
            if(fis != null){
                try{
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            System.out.println("자원 해제");
        }
        // fis.close() - 예외가 발생하던 안하던 항상 수행되는 부분
        }
}
