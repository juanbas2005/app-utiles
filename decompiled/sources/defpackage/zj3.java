package defpackage;

/* renamed from: zj3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zj3 {
    public static final zj3 f = new zj3((s15) null, false);
    public final s15 a;
    public final po4 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public zj3(s15 s15, po4 po4, boolean z, boolean z2, boolean z3) {
        this.a = s15;
        this.b = po4;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj3)) {
            return false;
        }
        zj3 zj3 = (zj3) obj;
        if (this.a == zj3.a && this.b == zj3.b && this.c == zj3.c && this.d == zj3.d && this.e == zj3.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        s15 s15 = this.a;
        if (s15 == null) {
            i = 0;
        } else {
            i = s15.hashCode();
        }
        int i3 = i * 31;
        po4 po4 = this.b;
        if (po4 != null) {
            i2 = po4.hashCode();
        }
        return Boolean.hashCode(this.e) + hl6.i(hl6.i((i3 + i2) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "JavaTypeQualifiers(nullability=" + this.a + ", mutability=" + this.b + ", definitelyNotNull=" + this.c + ", isNullabilityQualifierForWarning=" + this.d + ", isMutabilityQualifierForWarning=" + this.e + ')';
    }

    public /* synthetic */ zj3(s15 s15, boolean z) {
        this(s15, (po4) null, z, false, false);
    }
}
