package defpackage;

import java.util.List;

/* renamed from: k20  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k20 {
    public final List a;
    public final hv2 b;

    public /* synthetic */ k20() {
        this(a42.w, new hv2(25, (Object) null));
    }

    public static k20 a(k20 k20, List list, hv2 hv2, int i) {
        if ((i & 1) != 0) {
            list = k20.a;
        }
        if ((i & 2) != 0) {
            hv2 = k20.b;
        }
        k20.getClass();
        list.getClass();
        hv2.getClass();
        return new k20(list, hv2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k20)) {
            return false;
        }
        k20 k20 = (k20) obj;
        if (sg3.e(this.a, k20.a) && sg3.e(this.b, k20.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AyudaScreenData(ussdCodes=" + this.a + ", feedbackSent=" + this.b + ")";
    }

    public k20(List list, hv2 hv2) {
        this.a = list;
        this.b = hv2;
    }
}
