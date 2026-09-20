package defpackage;

import java.time.format.DateTimeParseException;
import kotlinx.datetime.YearMonth;

/* renamed from: lf8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lf8 {
    public static YearMonth a(lf8 lf8, String str) {
        z97 z97 = rf8.b;
        d1 d1Var = (d1) z97.getValue();
        lf8.getClass();
        str.getClass();
        d1Var.getClass();
        if (d1Var != ((d1) z97.getValue())) {
            return (YearMonth) d1Var.c(str);
        }
        try {
            String obj = str.toString();
            obj.getClass();
            return new YearMonth(java.time.YearMonth.parse(fb5.s(3, obj)));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final zr3 serializer() {
        return uf8.a;
    }
}
