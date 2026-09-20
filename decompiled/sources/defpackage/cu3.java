package defpackage;

/* renamed from: cu3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cu3 extends xt3 {
    public final int a;

    public cu3(int i) {
        this.a = i;
    }

    public final Object a() {
        return new lr7(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof cu3) && this.a == ((cu3) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
