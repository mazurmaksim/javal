package timespwithoffset;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.time.*;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.*;
import static timespwithoffset.TimeStampWithOffsetOfLocalServer.convertLocalStringToUtcButForceLocalStorage;

class TimeStampWithOffsetOfLocalServerTest {
    private TimeZone originalTimeZone;

    @Before
    public void setUp() {
        originalTimeZone = TimeZone.getDefault();
    }

    @After
    public void tearDown() {
        TimeZone.setDefault(originalTimeZone);
    }

    @Test
    public void testConvertLocalStringToUtcButForceLocalStorage_KievSummerTime() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Tokyo"));

//        zoneIds = {
//                "Europe/Kiev",
//                "Europe/Berlin",
//                "Europe/London",
//                "Asia/Tokyo",
//                "America/New_York"
//        };
//

        String input = "2026-04-05T00:00:00.0000000";

        Timestamp result = convertLocalStringToUtcButForceLocalStorage(input);

        LocalDateTime localDateTime = LocalDateTime.parse(input);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        Instant utcInstant = zonedDateTime.toInstant(); // 2026-04-04T21:00:00Z
        ZoneOffset offset = zonedDateTime.getOffset();  // +03:00
        Instant expectedAdjusted = utcInstant.minusSeconds(offset.getTotalSeconds());

        assertEquals(expectedAdjusted, result.toInstant());
    }

    @Test
    public void testConvertLocalStringToUtcButForceLocalStorage_KievWinterTime() {
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/Kiev"));

        String input = "2026-01-10T00:00:00.0000000";

        Timestamp result = convertLocalStringToUtcButForceLocalStorage(input);

        LocalDateTime localDateTime = LocalDateTime.parse(input);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault()); // Europe/Kiev
        Instant utcInstant = zonedDateTime.toInstant(); // 2026-01-09T22:00:00Z
        ZoneOffset offset = zonedDateTime.getOffset();  // +02:00
        Instant expectedAdjusted = utcInstant.minusSeconds(offset.getTotalSeconds());

        assertEquals(expectedAdjusted, result.toInstant());
    }
}
