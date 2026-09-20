package defpackage;

/* renamed from: j95  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j95 {
    public final long a;
    public final pa5 b;

    public j95() {
        long d = uq3.d(4284900966L);
        pa5 e = x91.e(3, 0.0f);
        this.a = d;
        this.b = e;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!j95.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        j95 j95 = (j95) obj;
        if (jt0.c(this.a, j95.a) && sg3.e(this.b, j95.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = jt0.h;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        String i = jt0.i(this.a);
        return "OverscrollConfiguration(glowColor=" + i + ", drawPadding=" + this.b + ")";
    }
}
