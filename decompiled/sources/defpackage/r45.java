package defpackage;

/* renamed from: r45  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r45 extends yv4 {
    public final g30 a;
    public final t54 b;

    public r45(g30 g30, t54 t54) {
        g30.getClass();
        this.a = g30;
        this.b = t54;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r45)) {
            return false;
        }
        r45 r45 = (r45) obj;
        if (sg3.e(this.a, r45.a) && sg3.e(this.b, r45.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        t54 t54 = this.b;
        if (t54 == null) {
            i = 0;
        } else {
            i = t54.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.a + ", owner=" + this.b + ')';
    }
}
