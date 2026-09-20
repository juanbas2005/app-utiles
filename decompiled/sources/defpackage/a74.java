package defpackage;

/* renamed from: a74  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a74 extends b74 {
    public final String a;
    public final gg7 b;

    public a74(String str, gg7 gg7) {
        this.a = str;
        this.b = gg7;
    }

    public final gg7 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a74)) {
            return false;
        }
        a74 a74 = (a74) obj;
        if (sg3.e(this.a, a74.a) && sg3.e(this.b, a74.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        gg7 gg7 = this.b;
        if (gg7 != null) {
            i = gg7.hashCode();
        } else {
            i = 0;
        }
        return (hashCode + i) * 31;
    }

    public final String toString() {
        return f21.h("LinkAnnotation.Url(url=", this.a, ")");
    }
}
