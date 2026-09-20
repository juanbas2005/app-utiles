package defpackage;

/* renamed from: bu6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bu6 extends ll4 implements my3, dk6 {
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public long Q;
    public pq6 R;
    public boolean S;
    public long T;
    public long U;
    public int V;
    public zx3 W;
    public pb X;

    public final void D0(ok6 ok6) {
        if (this.S) {
            mk6.g(ok6, this.R);
        }
    }

    public final boolean K0() {
        return false;
    }

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        eh5 y = gh4.y(j);
        return oh4.d0(y.w, y.x, b42.w, new lh(9, y, this));
    }

    public final boolean h() {
        return false;
    }

    public final String toString() {
        float f = this.K;
        float f2 = this.L;
        float f3 = this.M;
        float f4 = this.N;
        float f5 = this.O;
        float f6 = this.P;
        String b = ql7.b(this.Q);
        pq6 pq6 = this.R;
        boolean z = this.S;
        String i = jt0.i(this.T);
        String i2 = jt0.i(this.U);
        String L2 = rj1.L(this.V);
        zx3 zx3 = this.W;
        StringBuilder n = f21.n("SimpleGraphicsLayerModifier(scaleX=", f, ", scaleY=", f2, ", alpha = ");
        n.append(f3);
        n.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        n.append(f4);
        n.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        n.append(f5);
        n.append(", cameraDistance=");
        n.append(f6);
        n.append(", transformOrigin=");
        n.append(b);
        n.append(", shape=");
        n.append(pq6);
        n.append(", clip=");
        n.append(z);
        n.append(", renderEffect=null, ambientShadowColor=");
        n.append(i);
        n.append(", spotShadowColor=");
        f21.v(n, i2, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", L2, ", colorFilter=nulloutsets=");
        n.append(zx3);
        n.append(")");
        return n.toString();
    }
}
