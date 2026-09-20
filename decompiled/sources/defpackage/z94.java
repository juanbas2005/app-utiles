package defpackage;

import java.time.format.DateTimeParseException;
import kotlinx.datetime.LocalDateTime;

/* renamed from: z94  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z94 {
    public static LocalDateTime a(z94 z94, String str) {
        ca4 ca4 = aa4.a;
        z94.getClass();
        str.getClass();
        ca4.getClass();
        try {
            String obj = str.toString();
            obj.getClass();
            return new LocalDateTime(java.time.LocalDateTime.parse(fb5.s(12, obj)));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final zr3 serializer() {
        return ea4.a;
    }
}
