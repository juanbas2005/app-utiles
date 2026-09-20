package defpackage;

/* renamed from: mu0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mu0 implements ml4 {
    public final ml4 w;
    public final ml4 x;

    public mu0(ml4 ml4, ml4 ml42) {
        this.w = ml4;
        this.x = ml42;
    }

    public final Object a(gs2 gs2, Object obj) {
        return this.x.a(gs2, this.w.a(gs2, obj));
    }

    public final boolean b(vr2 vr2) {
        if (!this.w.b(vr2) || !this.x.b(vr2)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mu0)) {
            return false;
        }
        mu0 mu0 = (mu0) obj;
        if (!this.w.equals(mu0.w) || !sg3.e(this.x, mu0.x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.x.hashCode() * 31) + this.w.hashCode();
    }

    public final String toString() {
        Object a = a(ck.A, "");
        return "[" + a + "]";
    }
}
