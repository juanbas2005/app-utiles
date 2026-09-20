package defpackage;

/* renamed from: px4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class px4 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;

    public px4(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px4)) {
            return false;
        }
        px4 px4 = (px4) obj;
        if (this.a.equals(px4.a) && this.b.equals(px4.b) && this.c.equals(px4.c) && this.d == px4.d && this.e.equals(px4.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + f21.e(this.d, hl6.h(hl6.h(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder o = f21.o("NearbyCellRow(type=", this.a, ", cellId=", this.b, ", areaCode=");
        o.append(this.c);
        o.append(", signalLevel=");
        o.append(this.d);
        o.append(", signalDbm=");
        return f21.l(o, this.e, ")");
    }
}
