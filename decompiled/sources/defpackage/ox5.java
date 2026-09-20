package defpackage;

/* renamed from: ox5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ox5 extends d66 {
    public final String x;
    public final long y;
    public final zw5 z;

    public ox5(String str, long j, zw5 zw5) {
        this.x = str;
        this.y = j;
        this.z = zw5;
    }

    public final long a() {
        return this.y;
    }

    public final yh4 k() {
        String str = this.x;
        if (str != null) {
            k26 k26 = yh4.e;
            try {
                return ie1.G(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public final ed0 l() {
        return this.z;
    }
}
