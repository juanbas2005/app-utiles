package defpackage;

import java.util.List;

/* renamed from: fc5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fc5 {
    public final String a;
    public final String b;
    public final List c;
    public final boolean d;

    public fc5(String str, String str2, List list, boolean z) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
    }

    public static fc5 a(fc5 fc5, String str, String str2, List list, int i) {
        boolean z;
        if ((i & 1) != 0) {
            str = fc5.a;
        }
        if ((i & 2) != 0) {
            str2 = fc5.b;
        }
        if ((i & 4) != 0) {
            list = fc5.c;
        }
        if ((i & 8) != 0) {
            z = fc5.d;
        } else {
            z = true;
        }
        fc5.getClass();
        str.getClass();
        str2.getClass();
        list.getClass();
        return new fc5(str, str2, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc5)) {
            return false;
        }
        fc5 fc5 = (fc5) obj;
        if (this.a.equals(fc5.a) && this.b.equals(fc5.b) && sg3.e(this.c, fc5.c) && this.d == fc5.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + hl6.j(this.c, hl6.h(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder o = f21.o("PamarillasScreenData(name=", this.a, ", address=", this.b, ", results=");
        o.append(this.c);
        o.append(", searched=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
