package exam01;

import java.time.Instant;

public class ex03 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        long timestamp = instant.toEpochMilli();
        System.out.println(timestamp);

        long timestamp2 = System.currentTimeMillis();
        System.out.println(timestamp2);
    }
}
