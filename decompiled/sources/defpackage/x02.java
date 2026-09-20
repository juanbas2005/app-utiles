package defpackage;

/* renamed from: x02  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x02 implements zr3 {
    public static final x02 a = new Object();
    public static final po5 b = new po5("kotlin.time.Duration", no5.t);

    public final Object deserialize(ok1 ok1) {
        xb4 xb4 = u02.x;
        String t = ok1.t();
        t.getClass();
        try {
            long b0 = gl0.b0(t);
            if (!u02.d(b0, u02.A)) {
                return new u02(b0);
            }
            throw new IllegalStateException("invariant failed");
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(f21.h("Invalid ISO duration string format: '", t, "'."), e);
        }
    }

    public final ll6 getDescriptor() {
        return b;
    }

    public final void serialize(j42 j42, Object obj) {
        long j;
        int i;
        int i2;
        boolean z;
        boolean z2;
        long j2 = ((u02) obj).w;
        xb4 xb4 = u02.x;
        StringBuilder sb = new StringBuilder();
        int i3 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i3 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        if (i3 < 0) {
            j = u02.l(j2);
        } else {
            j = j2;
        }
        long j3 = u02.j(j, y02.HOURS);
        boolean z3 = false;
        if (u02.g(j)) {
            i = 0;
        } else {
            i = (int) (u02.j(j, y02.MINUTES) % 60);
        }
        if (u02.g(j)) {
            i2 = 0;
        } else {
            i2 = (int) (u02.j(j, y02.SECONDS) % 60);
        }
        int f = u02.f(j);
        if (u02.g(j2)) {
            j3 = 9999999999999L;
        }
        if (j3 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == 0 && f == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i != 0 || (z2 && z)) {
            z3 = true;
        }
        if (z) {
            sb.append(j3);
            sb.append('H');
        }
        if (z3) {
            sb.append(i);
            sb.append('M');
        }
        if (z2 || (!z && !z3)) {
            u02.b(sb, i2, f, 9, "S", true);
        }
        j42.D(sb.toString());
    }
}
