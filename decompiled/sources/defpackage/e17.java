package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: e17  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e17 {
    public final List a;
    public final r11 b;
    public final String c;
    public final String d;
    public final boolean e;
    public final hv2 f;

    public /* synthetic */ e17() {
        this(a42.w, (r11) null, "", "", false, new hv2(25, (Object) null));
    }

    public static e17 a(e17 e17, List list, r11 r11, String str, String str2, boolean z, hv2 hv2, int i) {
        if ((i & 1) != 0) {
            list = e17.a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            r11 = e17.b;
        }
        r11 r112 = r11;
        if ((i & 4) != 0) {
            str = e17.c;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = e17.d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            z = e17.e;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            hv2 = e17.f;
        }
        hv2 hv22 = hv2;
        e17.getClass();
        list2.getClass();
        str3.getClass();
        str4.getClass();
        hv22.getClass();
        return new e17(list2, r112, str3, str4, z2, hv22);
    }

    public final List b() {
        r11 r11 = this.b;
        List list = this.a;
        if (r11 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (((o11) next).c == r11) {
                    arrayList.add(next);
                }
            }
            list = arrayList;
        }
        String str = this.c;
        if (d57.I0(str)) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : list) {
            o11 o11 = (o11) next2;
            if (d57.x0(o11.e, str, true) || d57.x0(o11.f, str, true) || d57.x0(o11.b, str, true)) {
                arrayList2.add(next2);
            }
        }
        return arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e17)) {
            return false;
        }
        e17 e17 = (e17) obj;
        if (sg3.e(this.a, e17.a) && this.b == e17.b && sg3.e(this.c, e17.c) && sg3.e(this.d, e17.d) && this.e == e17.e && sg3.e(this.f, e17.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        r11 r11 = this.b;
        if (r11 == null) {
            i = 0;
        } else {
            i = r11.hashCode();
        }
        return this.f.hashCode() + hl6.i(hl6.h(hl6.h((hashCode + i) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpotsScreenData(spots=");
        sb.append(this.a);
        sb.append(", filter=");
        sb.append(this.b);
        sb.append(", query=");
        f21.v(sb, this.c, ", nick=", this.d, ", isAdmin=");
        sb.append(this.e);
        sb.append(", published=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public e17(List list, r11 r11, String str, String str2, boolean z, hv2 hv2) {
        this.a = list;
        this.b = r11;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = hv2;
    }
}
