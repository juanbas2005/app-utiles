package defpackage;

/* renamed from: zt3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zt3 extends xt3 {
    public final short a;

    public zt3(short s) {
        this.a = s;
    }

    public final Object a() {
        return Short.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zt3) && this.a == ((zt3) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }
}
