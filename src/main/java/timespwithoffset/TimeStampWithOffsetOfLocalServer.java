package timespwithoffset;

import java.sql.Timestamp;
import java.time.*;
import java.time.temporal.TemporalAmount;

public class TimeStampWithOffsetOfLocalServer {

    public static Timestamp convertLocalStringToUtcButForceLocalStorage(String dateTimeString) {
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeString);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        Instant utcInstant = zonedDateTime.toInstant();
        ZoneOffset offset = zonedDateTime.getOffset(); // e.g. +03:00
        Instant adjustedInstant = utcInstant.minusSeconds(offset.getTotalSeconds());

        Timestamp ts = Timestamp.from(adjustedInstant);

        System.out.println(
                "input=" + dateTimeString +
                        ", utcInstant=" + utcInstant +
                        ", offset=" + offset +
                        ", adjusted=" + adjustedInstant +
                        ", finalTs=" + ts
        );

        return ts;
    }
}

