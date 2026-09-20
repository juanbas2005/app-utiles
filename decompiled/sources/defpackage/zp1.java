package defpackage;

/* renamed from: zp1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zp1 {
    public final av5 a;
    public final int b;
    public final int c;

    public zp1(av5 av5, int i, int i2) {
        h75.d("Null dependency anInterface.", av5);
        this.a = av5;
        this.b = i;
        this.c = i2;
    }

    public static zp1 a(Class cls) {
        return new zp1(0, 1, cls);
    }

    public static zp1 b(av5 av5) {
        return new zp1(av5, 1, 0);
    }

    public static zp1 c(Class cls) {
        return new zp1(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zp1)) {
            return false;
        }
        zp1 zp1 = (zp1) obj;
        if (this.a.equals(zp1.a) && this.b == zp1.b && this.c == zp1.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = "provider";
        } else if (i2 == 2) {
            str2 = "deferred";
        } else {
            throw new AssertionError(hl6.k(i2, "Unsupported injection: "));
        }
        return f21.l(sb, str2, "}");
    }

    public zp1(int i, int i2, Class cls) {
        this(av5.a(cls), i, i2);
    }
}
