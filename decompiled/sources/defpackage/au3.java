package defpackage;

/* renamed from: au3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class au3 extends xt3 {
    public final String a;

    public au3(String str) {
        str.getClass();
        this.a = str;
    }

    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof au3) && sg3.e(this.a, ((au3) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
