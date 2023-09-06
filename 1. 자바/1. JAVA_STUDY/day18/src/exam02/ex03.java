package exam02;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ex03 {
    public static void main(String[] args) {
        String[] timeZones = {"Asia/Seoul", "Asia/Manila","Asia/Jakarta","America/New_York" };
        for(String timeZone : timeZones){
            ZoneId zId = ZoneId.of(timeZone);
            ZonedDateTime zoneDateTime = ZonedDateTime.now().withZoneSameInstant(zId);

            System.out.println(zoneDateTime);
        }
    }
}
