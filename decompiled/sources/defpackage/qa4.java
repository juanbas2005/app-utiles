package defpackage;

import java.time.DateTimeException;
import java.time.format.DateTimeParseException;
import kotlinx.datetime.LocalTime;

/* renamed from: qa4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qa4 {
    public static LocalTime a(long j) {
        try {
            return new LocalTime(java.time.LocalTime.ofNanoOfDay(j));
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static LocalTime b(qa4 qa4, String str) {
        z97 z97 = ta4.a;
        sa4 sa4 = (sa4) z97.getValue();
        qa4.getClass();
        str.getClass();
        sa4.getClass();
        if (sa4 != ((sa4) z97.getValue())) {
            return (LocalTime) sa4.c(str);
        }
        try {
            return new LocalTime(java.time.LocalTime.parse(str));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final zr3 serializer() {
        return ua4.a;
    }
}
