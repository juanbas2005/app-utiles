package defpackage;

/* renamed from: dk5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dk5 {
    public final yj5 a;
    public final qj5 b;

    public dk5() {
        this((yj5) null, new qj5());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk5)) {
            return false;
        }
        dk5 dk5 = (dk5) obj;
        if (sg3.e(this.b, dk5.b) && sg3.e(this.a, dk5.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        yj5 yj5 = this.a;
        if (yj5 != null) {
            i = yj5.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        qj5 qj5 = this.b;
        if (qj5 != null) {
            i2 = qj5.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ")";
    }

    public dk5(yj5 yj5, qj5 qj5) {
        this.a = yj5;
        this.b = qj5;
    }
}
