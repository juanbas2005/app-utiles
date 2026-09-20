package defpackage;

import java.util.List;

/* renamed from: dm6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dm6 {
    public final List a;

    public dm6(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dm6) && sg3.e(this.a, ((dm6) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ServiciosScreenData(services=" + this.a + ")";
    }

    public /* synthetic */ dm6() {
        this(a42.w);
    }
}
