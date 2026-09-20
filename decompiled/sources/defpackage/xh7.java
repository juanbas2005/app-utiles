package defpackage;

/* renamed from: xh7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xh7 extends ll4 implements my3 {
    public ef3 K;
    public boolean L;
    public je2 M;
    public boolean N;
    public uj O;
    public uj P;
    public float Q;
    public float R;

    public final boolean K0() {
        return false;
    }

    public final void N0() {
        ar7.H(J0(), (e81) null, (r81) null, new gw6(this, (f61) null, 7), 3);
    }

    public final void P0() {
        this.O = null;
        this.P = null;
        this.R = Float.NaN;
        this.Q = Float.NaN;
    }

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        boolean z;
        float f;
        float f2;
        boolean z2;
        boolean z3;
        Float f3;
        Float f4;
        float f5 = r16.L;
        if (gh4.c(k31.h(j)) == 0 || gh4.v(k31.g(j)) == 0) {
            z = false;
        } else {
            z = true;
        }
        if (this.N) {
            f = r16.E;
        } else if (z || this.L) {
            f = p97.a;
        } else {
            f = p97.b;
        }
        float e0 = oh4.e0(f);
        uj ujVar = this.P;
        if (ujVar != null) {
            f2 = ((Number) ujVar.d()).floatValue();
        } else {
            f2 = e0;
        }
        int i = (int) f2;
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 || !z3) {
            ac3.a("width and height must be >= 0");
        }
        eh5 y = gh4.y(m31.h(i, i, i, i));
        float e02 = oh4.e0((p97.d - oh4.S(e0)) / 2.0f);
        float e03 = oh4.e0((p97.c - p97.a) - p97.e);
        boolean z4 = this.N;
        if (z4 && this.L) {
            e02 = e03 - oh4.e0(f5);
        } else if (z4 && !this.L) {
            e02 = oh4.e0(f5);
        } else if (this.L) {
            e02 = e03;
        }
        uj ujVar2 = this.P;
        if (ujVar2 != null) {
            f3 = (Float) ujVar2.e.getValue();
        } else {
            f3 = null;
        }
        if (f3 == null || f3.floatValue() != e0) {
            ar7.H(J0(), (e81) null, (r81) null, new wh7(this, e0, (f61) null, 0), 3);
        }
        uj ujVar3 = this.O;
        if (ujVar3 != null) {
            f4 = (Float) ujVar3.e.getValue();
        } else {
            f4 = null;
        }
        if (f4 == null || f4.floatValue() != e02) {
            ar7.H(J0(), (e81) null, (r81) null, new wh7(this, e02, (f61) null, 1), 3);
        }
        if (Float.isNaN(this.R) && Float.isNaN(this.Q)) {
            this.R = e0;
            this.Q = e02;
        }
        return oh4.d0(i, i, b42.w, new jf(y, this, e02));
    }
}
