package defpackage;

import java.util.List;

/* renamed from: qm0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qm0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final km0 e;
    public final List f;
    public final boolean g;

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ qm0(int i) {
        this("", "", Integer.MIN_VALUE, 0, (km0) null, a42.w, r9);
        boolean z;
        if ((i & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm0)) {
            return false;
        }
        qm0 qm0 = (qm0) obj;
        if (sg3.e(this.a, qm0.a) && sg3.e(this.b, qm0.b) && this.c == qm0.c && this.d == qm0.d && sg3.e(this.e, qm0.e) && sg3.e(this.f, qm0.f) && this.g == qm0.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int e2 = f21.e(this.d, f21.e(this.c, hl6.h(this.a.hashCode() * 31, 31, this.b), 31), 31);
        km0 km0 = this.e;
        if (km0 == null) {
            i = 0;
        } else {
            i = km0.hashCode();
        }
        return Boolean.hashCode(this.g) + hl6.j(this.f, (e2 + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder o = f21.o("CellNetworkInfo(operatorName=", this.a, ", networkType=", this.b, ", signalDbm=");
        o.append(this.c);
        o.append(", signalLevel=");
        o.append(this.d);
        o.append(", serving=");
        o.append(this.e);
        o.append(", neighbors=");
        o.append(this.f);
        o.append(", permissionGranted=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }

    public qm0(String str, String str2, int i, int i2, km0 km0, List list, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = km0;
        this.f = list;
        this.g = z;
    }
}
