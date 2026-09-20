package defpackage;

/* renamed from: o77  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o77 {
    public final ub4 a;
    public final vr2 b;

    public o77(ub4 ub4, vr2 vr2) {
        ub4.getClass();
        vr2.getClass();
        this.a = ub4;
        this.b = vr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o77)) {
            return false;
        }
        o77 o77 = (o77) obj;
        if (this.a == o77.a && sg3.e(this.b, o77.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SupabaseLoggingConfig(defaultLogLevel=" + this.a + ", defaultLoggingFactory=" + this.b + ')';
    }
}
