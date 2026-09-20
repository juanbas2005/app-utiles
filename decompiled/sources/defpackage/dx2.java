package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldx2;", "Lpl4;", "Lbu6;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dx2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class dx2 extends pl4 {
    public final float A;
    public final long B;
    public final pq6 C;
    public final boolean D;
    public final long E;
    public final long F;
    public final zx3 G;
    public final float w;
    public final float x;
    public final float y;
    public final float z;

    public dx2(float f, float f2, float f3, float f4, float f5, long j, pq6 pq6, boolean z2, long j2, long j3, zx3 zx3) {
        this.w = f;
        this.x = f2;
        this.y = f3;
        this.z = f4;
        this.A = f5;
        this.B = j;
        this.C = pq6;
        this.D = z2;
        this.E = j2;
        this.F = j3;
        this.G = zx3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx2)) {
            return false;
        }
        dx2 dx2 = (dx2) obj;
        if (Float.compare(this.w, dx2.w) == 0 && Float.compare(this.x, dx2.x) == 0 && Float.compare(this.y, dx2.y) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.z, dx2.z) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.A, dx2.A) == 0 && Float.compare(8.0f, 8.0f) == 0 && ql7.a(this.B, dx2.B) && sg3.e(this.C, dx2.C) && this.D == dx2.D && jt0.c(this.E, dx2.E) && jt0.c(this.F, dx2.F) && sg3.e(this.G, dx2.G)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [bu6, ll4, java.lang.Object] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        ll4.L = this.x;
        ll4.M = this.y;
        ll4.N = this.z;
        ll4.O = this.A;
        ll4.P = 8.0f;
        ll4.Q = this.B;
        ll4.R = this.C;
        ll4.S = this.D;
        ll4.T = this.E;
        ll4.U = this.F;
        ll4.V = 3;
        ll4.W = this.G;
        ll4.X = new pb(22, ll4);
        return ll4;
    }

    public final void h(ll4 ll4) {
        bu6 bu6 = (bu6) ll4;
        bu6.K = this.w;
        bu6.L = this.x;
        bu6.M = this.y;
        bu6.N = this.z;
        bu6.O = this.A;
        bu6.P = 8.0f;
        bu6.Q = this.B;
        bu6.R = this.C;
        bu6.S = this.D;
        bu6.T = this.E;
        bu6.U = this.F;
        bu6.V = 3;
        bu6.W = this.G;
        su0.Q(bu6, bu6.X);
    }

    public final int hashCode() {
        int d = f21.d(8.0f, f21.d(this.A, f21.d(0.0f, f21.d(0.0f, f21.d(this.z, f21.d(0.0f, f21.d(0.0f, f21.d(this.y, f21.d(this.x, Float.hashCode(this.w) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = ql7.c;
        int i2 = hl6.i((this.C.hashCode() + pb4.b(d, 31, this.B)) * 31, 961, this.D);
        int i3 = jt0.h;
        return this.G.hashCode() + f21.e(3, f21.e(0, pb4.b(pb4.b(i2, 31, this.E), 31, this.F), 31), 961);
    }

    public final String toString() {
        String b = ql7.b(this.B);
        String i = jt0.i(this.E);
        String i2 = jt0.i(this.F);
        String L = rj1.L(3);
        StringBuilder n = f21.n("GraphicsLayerElement(scaleX=", this.w, ", scaleY=", this.x, ", alpha=");
        n.append(this.y);
        n.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        n.append(this.z);
        n.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        n.append(this.A);
        n.append(", cameraDistance=8.0, transformOrigin=");
        n.append(b);
        n.append(", shape=");
        n.append(this.C);
        n.append(", clip=");
        n.append(this.D);
        n.append(", renderEffect=null, ambientShadowColor=");
        f21.v(n, i, ", spotShadowColor=", i2, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        n.append(L);
        n.append(", colorFilter=null, outsets=");
        n.append(this.G);
        n.append(")");
        return n.toString();
    }
}
