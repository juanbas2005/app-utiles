package defpackage;

/* renamed from: ms3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ms3 {
    public final dc4 a;

    public ms3(ub4 ub4) {
        ub4.getClass();
        this.a = new dc4(new q37(c(ub4), qs.p1(new yb4[]{new ac4(kw5.z)})));
    }

    public static hq6 c(ub4 ub4) {
        int ordinal = ub4.ordinal();
        if (ordinal == 0) {
            return hq6.x;
        }
        if (ordinal == 1) {
            return hq6.y;
        }
        if (ordinal == 2) {
            return hq6.z;
        }
        if (ordinal == 3) {
            return hq6.A;
        }
        if (ordinal == 4) {
            return hq6.B;
        }
        h.c();
        return null;
    }

    public final boolean a(ub4 ub4) {
        if (this.a.a.a.compareTo(c(ub4)) <= 0) {
            return true;
        }
        return false;
    }

    public final void b(ub4 ub4, String str, Throwable th, String str2) {
        ub4.getClass();
        str.getClass();
        hq6 c = c(ub4);
        dc4 dc4 = this.a;
        dc4.getClass();
        for (yb4 yb4 : dc4.a.b) {
            yb4.getClass();
            yb4.a(c, str2, str, th);
        }
    }
}
