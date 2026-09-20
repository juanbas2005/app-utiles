package defpackage;

/* renamed from: vv  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vv {
    public final vr2 a;
    public final gs2 b;

    public vv(vr2 vr2, gs2 gs2) {
        this.a = vr2;
        this.b = gs2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv)) {
            return false;
        }
        vv vvVar = (vv) obj;
        if (this.a.equals(vvVar.a) && sg3.e(this.b, vvVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        gs2 gs2 = this.b;
        if (gs2 == null) {
            i = 0;
        } else {
            i = gs2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Context(resolveUrl=" + this.a + ", parseErrorResponse=" + this.b + ')';
    }
}
