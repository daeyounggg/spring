package exam01;

import javax.swing.*;

public class ex04 {
    public static void main(String[] args) {
        Threadex04 th = new Threadex04();
        th.start();

        String str = JOptionPane.showInputDialog("아무거나 :");
        System.out.println(str);
        System.out.println("작업실행?");
        th.interrupted();
    }
}

class Threadex04 extends Thread {
    public void run(){
        int i = 10;

        while(!isInterrupted()){
            System.out.println(i--);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted - false");
            System.out.println("isInterrupted"+isInterrupted());
            interrupt();
        }if(i <= 0 ) break;

    }

    }
}
