package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lg51;", "Lpl4;", "Lh51;", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: g51  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g51 extends pl4 {
    public final vb5 w;
    public final jb x;
    public final j51 y;
    public final float z;

    public g51(vb5 vb5, jb jbVar, j51 j51, float f) {
        this.w = vb5;
        this.x = jbVar;
        this.y = j51;
        this.z = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g51)) {
            return false;
        }
        g51 g51 = (g51) obj;
        if (sg3.e(this.w, g51.w) && sg3.e(this.x, g51.x) && sg3.e(this.y, g51.y) && Float.compare(this.z, g51.z) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, h51] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        ll4.L = this.x;
        ll4.M = this.y;
        ll4.N = this.z;
        return ll4;
    }

    public final void h(ll4 ll4) {
        h51 h51 = (h51) ll4;
        long i = h51.K.i();
        vb5 vb5 = this.w;
        boolean a = wu6.a(i, vb5.i());
        h51.K = vb5;
        h51.L = this.x;
        h51.M = this.y;
        h51.N = this.z;
        if (!a) {
            su0.B(h51);
        }
        rc9.e0(h51);
    }

    public final int hashCode() {
        int hashCode = this.x.hashCode();
        int hashCode2 = this.y.hashCode();
        return f21.d(this.z, (hashCode2 + ((hashCode + (this.w.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.w + ", alignment=" + this.x + ", contentScale=" + this.y + ", alpha=" + this.z + ", colorFilter=null)";
    }
}
