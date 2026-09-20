package defpackage;

/* renamed from: y63  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y63 {
    public Long a = 0L;
    public Long b = 0L;
    public Long c = 0L;

    static {
        Class<y63> cls = y63.class;
        b26.a.b(cls);
        try {
            b26.b(cls);
        } catch (Throwable unused) {
        }
        if (d57.I0("TimeoutConfiguration")) {
            h.q("Name can't be blank");
        }
    }

    public y63() {
        b((Long) null);
        this.b = null;
        this.c = null;
    }

    public static void a(Long l) {
        if (l != null && l.longValue() <= 0) {
            h.q("Only positive timeout values are allowed, for infinite timeout use HttpTimeoutConfig.INFINITE_TIMEOUT_MS");
        }
    }

    public final void b(Long l) {
        a(l);
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y63.class != obj.getClass()) {
            return false;
        }
        y63 y63 = (y63) obj;
        if (sg3.e(this.a, y63.a) && sg3.e(this.b, y63.b) && sg3.e(this.c, y63.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        Long l = this.a;
        int i3 = 0;
        if (l != null) {
            i = Long.hashCode(l.longValue());
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Long l2 = this.b;
        if (l2 != null) {
            i2 = Long.hashCode(l2.longValue());
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Long l3 = this.c;
        if (l3 != null) {
            i3 = Long.hashCode(l3.longValue());
        }
        return i5 + i3;
    }
}
