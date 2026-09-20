package defpackage;

/* renamed from: gf7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gf7 extends ll4 implements ry0, my3 {
    public final tg7 K;
    public wq7 L;
    public ef7 M;

    public gf7(tg7 tg7) {
        this.K = tg7;
    }

    public final boolean K0() {
        return false;
    }

    public final void N0() {
        tg7 k = aa5.k(this.K, rc9.O0(this).U);
        dl2 dl2 = (dl2) h49.w(this, xy0.k);
        V0(k, dl2);
        ey3 ey3 = rc9.O0(this).U;
        tp1 tp1 = rc9.O0(this).T;
        wq7 wq7 = this.L;
        if (wq7 != null) {
            this.M = new ef7(ey3, tp1, dl2, k, wq7.w);
            return;
        }
        throw f21.p("Font resolution state is not set.");
    }

    public final void O0() {
        this.L = null;
        this.M = null;
    }

    public final void R() {
        ef7 ef7 = this.M;
        if (ef7 != null) {
            ef7.a(ef7, rc9.O0(this).U, (tp1) null, (tg7) null, 30);
        }
        su0.B(this);
    }

    public final void V0(tg7 tg7, dl2 dl2) {
        int i;
        int i2;
        yy6 yy6 = tg7.a;
        ea7 ea7 = yy6.f;
        am2 am2 = yy6.c;
        if (am2 == null) {
            am2 = am2.y;
        }
        yl2 yl2 = yy6.d;
        if (yl2 != null) {
            i = yl2.a;
        } else {
            i = 0;
        }
        zl2 zl2 = yy6.e;
        if (zl2 != null) {
            i2 = zl2.a;
        } else {
            i2 = 65535;
        }
        this.L = ((el2) dl2).b(ea7, am2, i, i2);
        su0.B(this);
    }

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        ef7 ef7 = this.M;
        if (ef7 != null) {
            ed5 ed5 = ef7.f;
            wq7 wq7 = this.L;
            if (wq7 != null) {
                Object obj = wq7.w;
                if (!sg3.e(obj, ef7.e)) {
                    ef7.e = obj;
                    ed5.setValue(Boolean.TRUE);
                }
                if (((Boolean) ed5.getValue()).booleanValue()) {
                    ef7.g = zd7.a(ef7.d, ef7.b, ef7.c);
                    ed5.setValue(Boolean.FALSE);
                }
                long j2 = ef7.g;
                eh5 y = gh4.y(m31.e(j, m31.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
                return oh4.d0(y.w, y.x, b42.w, new ws(y, 14));
            }
            throw f21.p("Font resolution state is not set.");
        }
        throw f21.p("Min size state is not set.");
    }

    public final void d() {
        ef7 ef7 = this.M;
        if (ef7 != null) {
            ef7.a(ef7, (ey3) null, rc9.O0(this).T, (tg7) null, 29);
        }
        su0.B(this);
    }
}
