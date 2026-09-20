package defpackage;

/* renamed from: zx3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zx3 {
    public static final zx3 a;

    /* JADX WARNING: type inference failed for: r0v0, types: [zx3, java.lang.Object] */
    static {
        ? obj = new Object();
        if (lx1.a(0.0f, 0.0f) < 0 || lx1.a(0.0f, 0.0f) < 0 || lx1.a(0.0f, 0.0f) < 0 || lx1.a(0.0f, 0.0f) < 0) {
            xb3.a("Layer outsets must be non-negative");
        }
        a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zx3) && lx1.b(0.0f, 0.0f) && lx1.b(0.0f, 0.0f) && lx1.b(0.0f, 0.0f) && lx1.b(0.0f, 0.0f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + f21.d(0.0f, f21.d(0.0f, Float.hashCode(0.0f) * 31, 31), 31);
    }

    public final String toString() {
        String c = lx1.c(0.0f);
        String c2 = lx1.c(0.0f);
        return pb4.n(f21.o("LayerOutsets(left=", c, ", top=", c2, ", right="), lx1.c(0.0f), ", bottom=", lx1.c(0.0f), ")");
    }
}
