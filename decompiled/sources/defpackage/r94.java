package defpackage;

import java.time.DateTimeException;
import java.time.format.DateTimeParseException;
import kotlinx.datetime.LocalDate;

/* renamed from: r94  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r94 {
    public static LocalDate a(long j) {
        try {
            java.time.LocalDate ofEpochDay = java.time.LocalDate.ofEpochDay(j);
            ofEpochDay.getClass();
            return new LocalDate(ofEpochDay);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static LocalDate b(r94 r94, String str) {
        int i = s94.a;
        z97 z97 = v94.a;
        d1 d1Var = (d1) z97.getValue();
        r94.getClass();
        str.getClass();
        d1Var.getClass();
        if (d1Var != ((d1) z97.getValue())) {
            return (LocalDate) d1Var.c(str);
        }
        try {
            String obj = str.toString();
            obj.getClass();
            return new LocalDate(java.time.LocalDate.parse(fb5.s(6, obj)));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final zr3 serializer() {
        return y94.a;
    }
}
