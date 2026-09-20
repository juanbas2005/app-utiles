package defpackage;

/* renamed from: rt3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rt3 extends xt3 {
    public final char a;

    public rt3(char c) {
        this.a = c;
    }

    public final Object a() {
        return Character.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rt3) && this.a == ((rt3) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Character.hashCode(this.a);
    }
}
