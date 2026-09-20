package defpackage;

/* renamed from: la0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class la0 {
    public hg a = null;
    public od b = null;
    public tk0 c = null;
    public eh d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la0)) {
            return false;
        }
        la0 la0 = (la0) obj;
        if (sg3.e(this.a, la0.a) && sg3.e(this.b, la0.b) && sg3.e(this.c, la0.c) && sg3.e(this.d, la0.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        hg hgVar = this.a;
        int i4 = 0;
        if (hgVar == null) {
            i = 0;
        } else {
            i = hgVar.hashCode();
        }
        int i5 = i * 31;
        od odVar = this.b;
        if (odVar == null) {
            i2 = 0;
        } else {
            i2 = odVar.hashCode();
        }
        int i6 = (i5 + i2) * 31;
        tk0 tk0 = this.c;
        if (tk0 == null) {
            i3 = 0;
        } else {
            i3 = tk0.hashCode();
        }
        int i7 = (i6 + i3) * 31;
        eh ehVar = this.d;
        if (ehVar != null) {
            i4 = ehVar.hashCode();
        }
        return i7 + i4;
    }

    public final String toString() {
        hg hgVar = this.a;
        od odVar = this.b;
        tk0 tk0 = this.c;
        eh ehVar = this.d;
        return "BorderCache(imageBitmap=" + hgVar + ", canvas=" + odVar + ", canvasDrawScope=" + tk0 + ", borderPath=" + ehVar + ")";
    }
}
