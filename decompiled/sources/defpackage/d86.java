package defpackage;

/* renamed from: d86  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class d86 {
    public static final yy0 a = new yy0((sr2) new pp5(8));
    public static final yy0 b = new yy0((vr2) new b86(0));
    public static final o86 c;
    public static final o86 d;

    static {
        long j = jt0.g;
        c = new o86(true, Float.NaN, j, (pq6) null, true);
        d = new o86(false, Float.NaN, j, (pq6) null, true);
    }

    public static o86 a(boolean z, float f, long j, pq6 pq6, int i) {
        float f2;
        if ((i & 1) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = f;
        }
        if ((i & 4) != 0) {
            j = jt0.g;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            pq6 = null;
        }
        pq6 pq62 = pq6;
        if (!lx1.b(f2, Float.NaN) || !jt0.c(j2, jt0.g) || pq62 != null) {
            return new o86(z2, f2, j2, pq62, true);
        }
        if (z2) {
            return c;
        }
        return d;
    }
}
