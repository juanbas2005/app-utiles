package defpackage;

/* renamed from: wv  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wv {
    public final vr2 a;
    public final Integer b;

    public wv(vr2 vr2, Integer num) {
        this.a = vr2;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv)) {
            return false;
        }
        wv wvVar = (wv) obj;
        if (sg3.e(this.a, wvVar.a) && sg3.e(this.b, wvVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        vr2 vr2 = this.a;
        if (vr2 == null) {
            i = 0;
        } else {
            i = vr2.hashCode();
        }
        int i3 = i * 31;
        Integer num = this.b;
        if (num != null) {
            i2 = num.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "Request(defaultRequest=" + this.a + ", urlLengthLimit=" + this.b + ')';
    }
}
