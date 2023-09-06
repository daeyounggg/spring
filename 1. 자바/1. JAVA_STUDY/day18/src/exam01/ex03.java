package exam01;

import java.time.LocalDate;

public class ex03 {
    public static void main(String[] args) {
        //LocalDate localDate = new LocalDate();
        LocalDate date1 = LocalDate.of(2022,6,7);
        LocalDate date2 = LocalDate.now();
        System.out.println("date1 = "+date1);
        System.out.println("date2 = "+date2);
    }
}
