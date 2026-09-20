package defpackage;

/* renamed from: a95  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class a95 implements vr2 {
    public final /* synthetic */ eh5 A;
    public final /* synthetic */ eh5 B;
    public final /* synthetic */ eh5 C;
    public final /* synthetic */ eh5 D;
    public final /* synthetic */ h06 E;
    public final /* synthetic */ eh5 F;
    public final /* synthetic */ eh5 G;
    public final /* synthetic */ eh5 H;
    public final /* synthetic */ oh4 I;
    public final /* synthetic */ float J;
    public final /* synthetic */ c95 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ eh5 z;

    public /* synthetic */ a95(c95 c95, int i, int i2, eh5 eh5, eh5 eh52, eh5 eh53, eh5 eh54, eh5 eh55, h06 h06, eh5 eh56, eh5 eh57, eh5 eh58, oh4 oh4, float f) {
        this.w = c95;
        this.x = i;
        this.y = i2;
        this.z = eh5;
        this.A = eh52;
        this.B = eh53;
        this.C = eh54;
        this.D = eh55;
        this.E = h06;
        this.F = eh56;
        this.G = eh57;
        this.H = eh58;
        this.I = oh4;
        this.J = f;
    }

    public final Object y(Object obj) {
        int i;
        float f;
        int i2;
        c95 c95;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        c95 c952;
        int i8;
        int i9;
        int i10;
        int i11;
        eh5 eh5;
        int i12;
        int i13;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        g80 g80;
        dh5 dh5 = (dh5) obj;
        eh5 eh52 = (eh5) this.E.w;
        c95 c953 = this.w;
        ge7 ge7 = c953.e;
        ge7 ge72 = c953.f;
        float b = dh5.b();
        ey3 layoutDirection = this.I.getLayoutDirection();
        float b2 = dh5.b() * c953.h;
        me7 me7 = c953.c;
        la5 la5 = c953.g;
        dh5.g(this.G, 0, 0, 0.0f);
        eh5 eh53 = this.H;
        if (eh53 != null) {
            i = eh53.x;
        } else {
            i = 0;
        }
        int i14 = this.x - i;
        int C2 = dh4.C(la5.d() * b);
        eh5 eh54 = this.z;
        if (eh54 != null) {
            f = b;
            dh5.k(dh5, eh54, 0, Math.round((((float) (i14 - eh54.x)) / 2.0f) * 1.0f));
        } else {
            f = b;
        }
        int i15 = this.y;
        eh5 eh55 = this.A;
        int i16 = i15;
        if (eh52 != null) {
            if (c953.b) {
                i13 = Math.round((((float) (i14 - eh52.x)) / 2.0f) * 1.0f);
            } else {
                i13 = C2;
            }
            c95 = c953;
            float f7 = b2;
            float f8 = this.J;
            int F2 = we.F(f8, i13, -(eh52.x / 2));
            float l = x91.l(la5, layoutDirection) * f;
            float k = x91.k(la5, layoutDirection) * f;
            if (eh54 == null) {
                f2 = l;
            } else {
                f2 = l;
                float f9 = (float) eh54.w;
                float f10 = f2 - f7;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                l = f9 + f10;
            }
            if (eh55 == null) {
                f3 = l;
                f4 = k;
            } else {
                f3 = l;
                float f11 = (float) eh55.w;
                float f12 = k - f7;
                if (f12 < 0.0f) {
                    f12 = 0.0f;
                }
                f4 = f11 + f12;
            }
            ey3 ey3 = ey3.w;
            if (layoutDirection == ey3) {
                f5 = f2;
            } else {
                f5 = k;
            }
            if (layoutDirection == ey3) {
                f6 = f3;
            } else {
                f6 = f4;
            }
            float f13 = k;
            i2 = i14;
            float a = ((float) me7.b.a(eh52.w, i16 - dh4.C(f3 + f4), layoutDirection)) + f6;
            if (me7 instanceof me7) {
                g80 = me7.a;
            } else {
                kj6.o("Unknown position: ", me7);
                g80 = null;
            }
            dh5.g(eh52, dh4.C(we.E(a, ((float) g80.a(eh52.w, i16 - dh4.C(f2 + f13), layoutDirection)) + f5, f8)), F2, 0.0f);
        } else {
            c95 = c953;
            i2 = i14;
        }
        eh5 eh56 = this.B;
        if (eh56 != null) {
            if (eh54 != null) {
                eh5 = eh56;
                i12 = eh54.w;
            } else {
                eh5 = eh56;
                i12 = 0;
            }
            int i17 = C2;
            c95 c954 = c95;
            int i18 = i2;
            int j = c95.j(0, c954, i18, i17, eh52, eh5);
            i3 = 0;
            c95 = c954;
            i2 = i18;
            int i19 = i12;
            eh56 = eh5;
            i4 = i17;
            dh5.l(dh5, eh56, i19, j, new b95(ge72, 0), 4);
        } else {
            i4 = C2;
            i3 = 0;
        }
        if (eh54 != null) {
            i5 = eh54.w;
        } else {
            i5 = 0;
        }
        if (eh56 != null) {
            i6 = eh56.w;
        } else {
            i6 = 0;
        }
        int i20 = i6 + i5;
        int i21 = i4;
        eh5 eh57 = this.D;
        int i22 = i3;
        c95 c955 = c95;
        int i23 = i2;
        dh5.k(dh5, eh57, i20, c95.j(i22, c955, i23, i21, eh52, eh57));
        eh5 eh58 = this.F;
        if (eh58 != null) {
            int j2 = c95.j(i22, c955, i23, i21, eh52, eh58);
            i8 = i22;
            c952 = c955;
            i7 = i23;
            int i24 = i20;
            eh5 eh59 = eh58;
            i9 = i21;
            dh5.l(dh5, eh59, i24, j2, new b95(ge7, 1), 4);
        } else {
            i8 = i22;
            c952 = c955;
            i7 = i23;
            i9 = i21;
        }
        eh5 eh510 = this.C;
        if (eh510 != null) {
            if (eh55 != null) {
                i11 = eh55.w;
            } else {
                i11 = 0;
            }
            int i25 = i9;
            int i26 = i7;
            eh5 eh511 = eh510;
            i10 = i26;
            dh5 dh52 = dh5;
            dh5.l(dh52, eh511, (i16 - i11) - eh510.w, c95.j(i8, c952, i26, i25, eh52, eh511), new b95(ge72, 2), 4);
            dh5 = dh52;
        } else {
            i10 = i7;
        }
        if (eh55 != null) {
            dh5.k(dh5, eh55, i16 - eh55.w, Math.round((((float) (i10 - eh55.x)) / 2.0f) * 1.0f));
        }
        if (eh53 != null) {
            dh5.k(dh5, eh53, 0, i10);
        }
        return vs7.a;
    }
}
