package exam02;

import java.io.*;

public class ex02 {
    public static void main(String[] args) {
        long stime = System.nanoTime();
        try(FileInputStream fis = new FileInputStream("api.zip");
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream("api_copied2.zip");
            BufferedOutputStream bos = new BufferedOutputStream(fos)){

            while(bis.available() > 0){
                bos.write(bis.read());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        long etime = System.nanoTime();
        System.out.printf("%d",etime- stime);
    }

}
