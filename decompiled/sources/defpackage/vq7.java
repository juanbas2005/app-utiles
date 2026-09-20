package defpackage;

/* renamed from: vq7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vq7 {
    public final ea7 a;
    public final am2 b;
    public final int c;
    public final int d;
    public final Object e;

    public vq7(ea7 ea7, am2 am2, int i, int i2, Object obj) {
        this.a = ea7;
        this.b = am2;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq7)) {
            return false;
        }
        vq7 vq7 = (vq7) obj;
        if (sg3.e(this.a, vq7.a) && sg3.e(this.b, vq7.b) && this.c == vq7.c && this.d == vq7.d && sg3.e(this.e, vq7.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        ea7 ea7 = this.a;
        if (ea7 == null) {
            i = 0;
        } else {
            i = ea7.hashCode();
        }
        int e2 = f21.e(this.d, f21.e(this.c, ((i * 31) + this.b.w) * 31, 31), 31);
        Object obj = this.e;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return e2 + i2;
    }

    public final String toString() {
        String str;
        String str2 = "Invalid";
        int i = this.c;
        if (i == 0) {
            str = "Normal";
        } else if (i == 1) {
            str = "Italic";
        } else {
            str = str2;
        }
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        f21.v(sb, str, ", fontSynthesis=", str2, ", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
