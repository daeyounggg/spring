package exam01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ex02 {
    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.now();
        LocalDateTime date2 = date1.plusSeconds(1000000000);
        Duration du = Duration.between(date1,date2);

        long seconds = du.getSeconds();

        LocalDateTime date3 = LocalDateTime.of(0,1,1,0,0,0).plusSeconds(seconds);
        System.out.println(date3);
    }
}
