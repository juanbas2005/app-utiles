package defpackage;

/* renamed from: qx1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qx1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof qx1) && lx1.b(10.0f, 10.0f) && lx1.b(40.0f, 40.0f) && lx1.b(10.0f, 10.0f) && lx1.b(40.0f, 40.0f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + f21.d(40.0f, f21.d(10.0f, f21.d(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    public final String toString() {
        String c = lx1.c(10.0f);
        String c2 = lx1.c(40.0f);
        return pb4.n(f21.o("DpTouchBoundsExpansion(start=", c, ", top=", c2, ", end="), lx1.c(10.0f), ", bottom=", lx1.c(40.0f), ", isLayoutDirectionAware=true)");
    }
}
