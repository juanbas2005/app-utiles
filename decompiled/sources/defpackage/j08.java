package defpackage;

import java.time.DateTimeException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import kotlinx.datetime.UtcOffset;

/* renamed from: j08  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class j08 {
    public static final z97 a = new z97(new wi7(19));
    public static final z97 b = new z97(new wi7(20));
    public static final z97 c = new z97(new wi7(18));

    public static final UtcOffset a(Integer num, Integer num2, Integer num3) {
        int i;
        int i2 = 0;
        if (num != null) {
            try {
                int intValue = num.intValue();
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = 0;
                }
                if (num3 != null) {
                    i2 = num3.intValue();
                }
                ZoneOffset ofHoursMinutesSeconds = ZoneOffset.ofHoursMinutesSeconds(intValue, i, i2);
                ofHoursMinutesSeconds.getClass();
                return new UtcOffset(ofHoursMinutesSeconds);
            } catch (DateTimeException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (num2 != null) {
            int intValue2 = num2.intValue() / 60;
            int intValue3 = num2.intValue() % 60;
            if (num3 != null) {
                i2 = num3.intValue();
            }
            ZoneOffset ofHoursMinutesSeconds2 = ZoneOffset.ofHoursMinutesSeconds(intValue2, intValue3, i2);
            ofHoursMinutesSeconds2.getClass();
            return new UtcOffset(ofHoursMinutesSeconds2);
        } else {
            if (num3 != null) {
                i2 = num3.intValue();
            }
            ZoneOffset ofTotalSeconds = ZoneOffset.ofTotalSeconds(i2);
            ofTotalSeconds.getClass();
            return new UtcOffset(ofTotalSeconds);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.time.temporal.TemporalQuery, java.lang.Object] */
    public static final UtcOffset b(String str, DateTimeFormatter dateTimeFormatter) {
        try {
            return new UtcOffset((ZoneOffset) dateTimeFormatter.parse(str, new Object()));
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
