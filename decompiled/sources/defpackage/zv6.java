package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: zv6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zv6 {
    public final List a;
    public final List b;
    public final xv6 c;

    public zv6(List list, List list2, xv6 xv6) {
        this.a = list;
        this.b = list2;
        this.c = xv6;
    }

    public static zv6 a(zv6 zv6, ArrayList arrayList, ArrayList arrayList2, xv6 xv6, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = zv6.a;
        }
        List list2 = arrayList2;
        if ((i & 2) != 0) {
            list2 = zv6.b;
        }
        if ((i & 4) != 0) {
            xv6 = zv6.c;
        }
        zv6.getClass();
        list.getClass();
        list2.getClass();
        return new zv6(list, list2, xv6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv6)) {
            return false;
        }
        zv6 zv6 = (zv6) obj;
        if (sg3.e(this.a, zv6.a) && sg3.e(this.b, zv6.b) && sg3.e(this.c, zv6.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int j = hl6.j(this.b, this.a.hashCode() * 31, 31);
        xv6 xv6 = this.c;
        if (xv6 == null) {
            i = 0;
        } else {
            i = xv6.hashCode();
        }
        return j + i;
    }

    public final String toString() {
        return "SmsScreenData(gridCommands=" + this.a + ", wideCommands=" + this.b + ", pendingConfirm=" + this.c + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ zv6() {
        this(r1, r1, (xv6) null);
        a42 a42 = a42.w;
    }
}
