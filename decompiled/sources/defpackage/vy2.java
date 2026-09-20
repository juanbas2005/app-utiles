package defpackage;

/* renamed from: vy2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vy2 {
    public static final dg0 d = td0.u(":");
    public static final dg0 e = td0.u(":status");
    public static final dg0 f = td0.u(":method");
    public static final dg0 g = td0.u(":path");
    public static final dg0 h = td0.u(":scheme");
    public static final dg0 i = td0.u(":authority");
    public final dg0 a;
    public final dg0 b;
    public final int c;

    static {
        dg0 dg0 = dg0.z;
    }

    public vy2(dg0 dg0, dg0 dg02) {
        dg0.getClass();
        dg02.getClass();
        this.a = dg0;
        this.b = dg02;
        this.c = dg02.d() + dg0.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy2)) {
            return false;
        }
        vy2 vy2 = (vy2) obj;
        if (sg3.e(this.a, vy2.a) && sg3.e(this.b, vy2.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.r() + ": " + this.b.r();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public vy2(String str, String str2) {
        this(td0.u(str), td0.u(str2));
        dg0 dg0 = dg0.z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public vy2(dg0 dg0, String str) {
        this(dg0, td0.u(str));
        dg0.getClass();
        str.getClass();
        dg0 dg02 = dg0.z;
    }
}
