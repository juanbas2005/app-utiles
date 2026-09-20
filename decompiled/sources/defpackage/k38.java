package defpackage;

/* renamed from: k38  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k38 extends vb5 {
    public final ed5 A = u55.p(new wu6(0));
    public final ed5 B = u55.p(Boolean.FALSE);
    public final m28 C;
    public final ed5 D;
    public float E;
    public lt0 F;

    public k38(sx2 sx2) {
        m28 m28 = new m28(sx2);
        m28.f = new kh(17, this);
        this.C = m28;
        this.D = new ed5(vs7.a, d63.G);
        this.E = 1.0f;
    }

    public final void d(float f) {
        this.E = f;
    }

    public final void e(lt0 lt0) {
        this.F = lt0;
    }

    public final long i() {
        return ((wu6) this.A.getValue()).a;
    }

    public final void j(wy3 wy3) {
        tk0 tk0 = wy3.w;
        lt0 lt0 = this.F;
        m28 m28 = this.C;
        if (lt0 == null) {
            lt0 = (lt0) m28.g.getValue();
        }
        if (!((Boolean) this.B.getValue()).booleanValue() || wy3.getLayoutDirection() != ey3.x) {
            m28.e(wy3, this.E, lt0);
        } else {
            long v0 = tk0.v0();
            wr0 wr0 = tk0.x;
            long L = wr0.L();
            wr0.D().h();
            try {
                ((ji8) wr0.x).E(-1.0f, 1.0f, v0);
                m28.e(wy3, this.E, lt0);
            } finally {
                b81.u(wr0, L);
            }
        }
        this.D.getValue();
    }
}
