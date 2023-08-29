package exam01;

public class ex06 {
    public static void main(String[] args) {
        Account acc = new Account();
        ThreadEx06 th1 = new ThreadEx06(acc);
        ThreadEx06 th2 = new ThreadEx06(acc);
        th1.start();
        th2.start();
    }
}
class ThreadEx06 extends Thread {
    private Account acc;
    public ThreadEx06(Account acc){
        this.acc = acc;
    }
    public void run(){
        while(acc.getBalance() > 0){
           int money = (int)(Math.random() * 3 + 1) *100;
           acc.withdraw(money);
            System.out.println("잔액 : "+ acc.getBalance());
            }
        }
    }