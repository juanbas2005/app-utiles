package defpackage;

/* renamed from: pt3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pt3 extends xt3 {
    public final boolean a;

    public pt3(boolean z) {
        this.a = z;
    }

    public final Object a() {
        return Boolean.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof pt3) && this.a == ((pt3) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
