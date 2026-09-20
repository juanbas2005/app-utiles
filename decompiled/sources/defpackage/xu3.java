package defpackage;

/* renamed from: xu3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xu3 {
    public static final xu3 c = new xu3((zu3) null, (uu3) null);
    public final zu3 a;
    public final uu3 b;

    public xu3(zu3 zu3, uu3 uu3) {
        this.a = zu3;
        this.b = uu3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu3)) {
            return false;
        }
        xu3 xu3 = (xu3) obj;
        if (this.a == xu3.a && sg3.e(this.b, xu3.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        zu3 zu3 = this.a;
        if (zu3 == null) {
            i = 0;
        } else {
            i = zu3.hashCode();
        }
        int i3 = i * 31;
        uu3 uu3 = this.b;
        if (uu3 != null) {
            i2 = uu3.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "KmTypeProjection(variance=" + this.a + ", type=" + this.b + ')';
    }
}
