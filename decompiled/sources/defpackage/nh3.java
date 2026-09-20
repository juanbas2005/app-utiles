package defpackage;

import java.util.UUID;

/* renamed from: nh3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nh3 {
    public final String a;
    public final String b;
    public final double c;
    public final hv2 d;

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ nh3() {
        this(r2, "", 0.0d, new hv2(25, (Object) Boolean.FALSE));
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
    }

    public static nh3 a(nh3 nh3, String str, String str2, double d2, hv2 hv2, int i) {
        if ((i & 1) != 0) {
            str = nh3.a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = nh3.b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            d2 = nh3.c;
        }
        double d3 = d2;
        if ((i & 8) != 0) {
            hv2 = nh3.d;
        }
        hv2 hv22 = hv2;
        nh3.getClass();
        str3.getClass();
        str4.getClass();
        hv22.getClass();
        return new nh3(str3, str4, d3, hv22);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh3)) {
            return false;
        }
        nh3 nh3 = (nh3) obj;
        if (sg3.e(this.a, nh3.a) && sg3.e(this.b, nh3.b) && Double.compare(this.c, nh3.c) == 0 && sg3.e(this.d, nh3.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int h = hl6.h(this.a.hashCode() * 31, 31, this.b);
        return this.d.hashCode() + ((Double.hashCode(this.c) + h) * 31);
    }

    public final String toString() {
        StringBuilder o = f21.o("ItemScreenData(jetpackId=", this.a, ", jetpackName=", this.b, ", jetpackPrice=");
        o.append(this.c);
        o.append(", navigateBack=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }

    public nh3(String str, String str2, double d2, hv2 hv2) {
        this.a = str;
        this.b = str2;
        this.c = d2;
        this.d = hv2;
    }
}
