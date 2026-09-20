package defpackage;

/* renamed from: km0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class km0 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public km0(String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km0)) {
            return false;
        }
        km0 km0 = (km0) obj;
        if (this.a.equals(km0.a) && this.b == km0.b && this.c == km0.c && this.d == km0.d && this.e == km0.e && this.f == km0.f && this.g == km0.g && this.h == km0.h && this.i == km0.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + f21.e(this.h, f21.e(this.g, f21.e(this.f, f21.e(this.e, f21.e(this.d, f21.e(this.c, f21.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CellDetails(type=");
        sb.append(this.a);
        sb.append(", cellId=");
        sb.append(this.b);
        sb.append(", areaCode=");
        sb.append(this.c);
        sb.append(", physicalCellId=");
        sb.append(this.d);
        sb.append(", channel=");
        sb.append(this.e);
        sb.append(", signalDbm=");
        sb.append(this.f);
        sb.append(", signalLevel=");
        sb.append(this.g);
        sb.append(", rsrq=");
        sb.append(this.h);
        sb.append(", bandwidthKhz=");
        return hl6.n(sb, this.i, ")");
    }
}
