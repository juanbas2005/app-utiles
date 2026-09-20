package defpackage;

import kotlinx.datetime.DateTimeUnit;
import kotlinx.serialization.MissingFieldException;

/* renamed from: di7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class di7 implements zr3 {
    public static final di7 a = new Object();
    public static final nz3 b = rg3.y(i44.w, new pp5(29));

    public final Object deserialize(ok1 ok1) {
        ll6 descriptor = getDescriptor();
        gy0 c = ok1.c(descriptor);
        long j = 0;
        boolean z = false;
        while (true) {
            di7 di7 = a;
            int h = c.h(di7.getDescriptor());
            if (h == -1) {
                c.b(descriptor);
                if (z) {
                    return new DateTimeUnit.TimeBased(j);
                }
                throw new MissingFieldException("nanoseconds", getDescriptor().a());
            } else if (h == 0) {
                j = c.D(di7.getDescriptor(), 0);
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
        DateTimeUnit.TimeBased timeBased = (DateTimeUnit.TimeBased) obj;
        timeBased.getClass();
        ll6 descriptor = getDescriptor();
        hy0 c = j42.c(descriptor);
        c.j(a.getDescriptor(), 0, timeBased.getNanoseconds());
        c.b(descriptor);
    }
}
