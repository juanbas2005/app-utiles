package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lwb5;", "Lpl4;", "Lxb5;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wb5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class wb5 extends pl4 {
    public final lt0 A;
    public final vb5 w;
    public final jb x;
    public final j51 y;
    public final float z;

    public wb5(vb5 vb5, jb jbVar, j51 j51, float f, lt0 lt0) {
        this.w = vb5;
        this.x = jbVar;
        this.y = j51;
        this.z = f;
        this.A = lt0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb5)) {
            return false;
        }
        wb5 wb5 = (wb5) obj;
        if (sg3.e(this.w, wb5.w) && sg3.e(this.x, wb5.x) && sg3.e(this.y, wb5.y) && Float.compare(this.z, wb5.z) == 0 && sg3.e(this.A, wb5.A)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, xb5] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        ll4.L = true;
        ll4.M = this.x;
        ll4.N = this.y;
        ll4.O = this.z;
        ll4.P = this.A;
        return ll4;
    }

    public final void h(ll4 ll4) {
        boolean z2;
        xb5 xb5 = (xb5) ll4;
        boolean z3 = xb5.L;
        vb5 vb5 = this.w;
        if (!z3 || !wu6.a(xb5.K.i(), vb5.i())) {
            z2 = true;
        } else {
            z2 = false;
        }
        xb5.K = vb5;
        xb5.L = true;
        xb5.M = this.x;
        xb5.N = this.y;
        xb5.O = this.z;
        xb5.P = this.A;
        if (z2) {
            su0.B(xb5);
        }
        rc9.e0(xb5);
    }

    public final int hashCode() {
        int i;
        int i2 = hl6.i(this.w.hashCode() * 31, 31, true);
        int hashCode = this.y.hashCode();
        int d = f21.d(this.z, (hashCode + ((this.x.hashCode() + i2) * 31)) * 31, 31);
        lt0 lt0 = this.A;
        if (lt0 == null) {
            i = 0;
        } else {
            i = lt0.hashCode();
        }
        return d + i;
    }

    public final String toString() {
        return "PainterElement(painter=" + this.w + ", sizeToIntrinsics=true, alignment=" + this.x + ", contentScale=" + this.y + ", alpha=" + this.z + ", colorFilter=" + this.A + ")";
    }
}
