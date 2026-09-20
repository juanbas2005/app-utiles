package defpackage;

import java.time.format.DateTimeFormatter;
import kotlinx.datetime.UtcOffset;

/* renamed from: m08  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m08 implements zr3 {
    public static final m08 a = new Object();
    public static final po5 b = b85.b("kotlinx.datetime.UtcOffset");

    public final Object deserialize(ok1 ok1) {
        b08 b08 = UtcOffset.Companion;
        String t = ok1.t();
        z97 z97 = g08.a;
        e08 e08 = (e08) z97.getValue();
        b08.getClass();
        t.getClass();
        e08.getClass();
        if (e08 == ((e08) z97.getValue())) {
            DateTimeFormatter s = pc7.s(j08.a.getValue());
            s.getClass();
            return j08.b(t, s);
        } else if (e08 == ((e08) g08.b.getValue())) {
            DateTimeFormatter s2 = pc7.s(j08.b.getValue());
            s2.getClass();
            return j08.b(t, s2);
        } else if (e08 != ((e08) g08.c.getValue())) {
            return (UtcOffset) e08.c(t);
        } else {
            DateTimeFormatter s3 = pc7.s(j08.c.getValue());
            s3.getClass();
            return j08.b(t, s3);
        }
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        UtcOffset utcOffset = (UtcOffset) obj;
        utcOffset.getClass();
        j42.D(utcOffset.toString());
    }
}
