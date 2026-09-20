package defpackage;

import java.util.List;

/* renamed from: b41  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b41 {
    public final List a;
    public final List b;
    public final boolean c;

    public b41(List list, List list2, boolean z) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
        this.c = z;
    }

    public static b41 a(b41 b41, List list, List list2, int i) {
        if ((i & 1) != 0) {
            list = b41.a;
        }
        if ((i & 2) != 0) {
            list2 = b41.b;
        }
        b41.getClass();
        list.getClass();
        list2.getClass();
        return new b41(list, list2, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b41)) {
            return false;
        }
        b41 b41 = (b41) obj;
        if (sg3.e(this.a, b41.a) && sg3.e(this.b, b41.b) && this.c == b41.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + hl6.j(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ContactDetailData(calls=" + this.a + ", messages=" + this.b + ", loaded=" + this.c + ")";
    }
}
