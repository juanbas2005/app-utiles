package defpackage;

import kotlinx.datetime.DateTimeUnit;
import kotlinx.serialization.MissingFieldException;

/* renamed from: gj1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gj1 implements zr3 {
    public static final gj1 a = new Object();
    public static final nz3 b = rg3.y(i44.w, new nf1(5));

    public final Object deserialize(ok1 ok1) {
        ll6 descriptor = getDescriptor();
        gy0 c = ok1.c(descriptor);
        boolean z = false;
        int i = 0;
        while (true) {
            gj1 gj1 = a;
            int h = c.h(gj1.getDescriptor());
            if (h == -1) {
                c.b(descriptor);
                if (z) {
                    return new DateTimeUnit.DayBased(i);
                }
                throw new MissingFieldException("days", getDescriptor().a());
            } else if (h == 0) {
                i = c.s(gj1.getDescriptor(), 0);
                z = true;
            } else {
                ag8.I(h);
                throw null;
            }
        }
    }

    public final ll6 getDescriptor() {
        return (ll6) b.getValue();
    }

    public final void serialize(j42 j42, Object obj) {
        DateTimeUnit.DayBased dayBased = (DateTimeUnit.DayBased) obj;
        dayBased.getClass();
        ll6 descriptor = getDescriptor();
        hy0 c = j42.c(descriptor);
        c.w(0, dayBased.getDays(), a.getDescriptor());
        c.b(descriptor);
    }
}
