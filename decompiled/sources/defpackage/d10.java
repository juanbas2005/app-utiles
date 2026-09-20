package defpackage;

/* renamed from: d10  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d10 extends iy4 {
    public final hy4 a;
    public final gy4 b;

    public d10(hy4 hy4, gy4 gy4) {
        this.a = hy4;
        this.b = gy4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iy4) {
            iy4 iy4 = (iy4) obj;
            hy4 hy4 = this.a;
            if (hy4 != null ? hy4.equals(((d10) iy4).a) : ((d10) iy4).a == null) {
                gy4 gy4 = this.b;
                if (gy4 != null ? !gy4.equals(((d10) iy4).b) : ((d10) iy4).b != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        hy4 hy4 = this.a;
        if (hy4 == null) {
            i = 0;
        } else {
            i = hy4.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        gy4 gy4 = this.b;
        if (gy4 != null) {
            i2 = gy4.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
