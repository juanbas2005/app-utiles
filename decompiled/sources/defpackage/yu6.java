package defpackage;

/* renamed from: yu6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class yu6 {
    public static final sd2 a;
    public static final sd2 b;
    public static final sd2 c;
    public static final te8 d;
    public static final te8 e;
    public static final te8 f;
    public static final te8 g;
    public static final te8 h;
    public static final te8 i;

    static {
        jv1 jv1 = jv1.x;
        a = new sd2(jv1);
        jv1 jv12 = jv1.w;
        b = new sd2(jv12);
        jv1 jv13 = jv1.y;
        c = new sd2(jv13);
        g80 g80 = xb4.L;
        d = new te8(jv1, new ph6(20, g80), g80);
        g80 g802 = xb4.K;
        e = new te8(jv1, new ph6(20, g802), g802);
        h80 h80 = xb4.I;
        f = new te8(jv12, new ph6(21, h80), h80);
        h80 h802 = xb4.H;
        g = new te8(jv12, new ph6(21, h802), h802);
        i80 i80 = xb4.C;
        h = new te8(jv13, new ph6(22, i80), i80);
        i80 i802 = xb4.y;
        i = new te8(jv13, new ph6(22, i802), i802);
    }

    public static final ml4 a(ml4 ml4, float f2, float f3) {
        return ml4.d(new au7(f2, f3));
    }

    public static /* synthetic */ ml4 b(ml4 ml4, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(ml4, f2, f3);
    }

    public static ml4 c(ml4 ml4) {
        return ml4.d(a);
    }

    public static final ml4 d(ml4 ml4, float f2) {
        return ml4.d(new xu6(0.0f, f2, 0.0f, f2, true, 5));
    }

    public static final ml4 e(ml4 ml4, float f2, float f3) {
        return ml4.d(new xu6(0.0f, f2, 0.0f, f3, true, 5));
    }

    public static /* synthetic */ ml4 f(ml4 ml4, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return e(ml4, f2, f3);
    }

    public static final ml4 g(ml4 ml4, float f2) {
        return ml4.d(new xu6(0.0f, f2, 0.0f, f2, false, 5));
    }

    public static final ml4 h(ml4 ml4, float f2) {
        return ml4.d(new xu6(f2, f2, f2, f2, false));
    }

    public static final ml4 i(ml4 ml4, float f2, float f3) {
        return ml4.d(new xu6(f2, f3, f2, f3, false));
    }

    public static ml4 j(ml4 ml4, float f2, float f3, float f4, float f5, int i2) {
        float f6;
        float f7;
        float f8;
        if ((i2 & 2) != 0) {
            f6 = Float.NaN;
        } else {
            f6 = f3;
        }
        if ((i2 & 4) != 0) {
            f7 = Float.NaN;
        } else {
            f7 = f4;
        }
        if ((i2 & 8) != 0) {
            f8 = Float.NaN;
        } else {
            f8 = f5;
        }
        return ml4.d(new xu6(f2, f6, f7, f8, false));
    }

    public static final ml4 k(float f2) {
        return new xu6(f2, 0.0f, f2, 0.0f, false, 10);
    }

    public static final ml4 l(ml4 ml4, float f2) {
        return ml4.d(new xu6(f2, f2, f2, f2, true));
    }

    public static final ml4 m(ml4 ml4, float f2, float f3) {
        return ml4.d(new xu6(f2, f3, f2, f3, true));
    }

    public static final ml4 n(ml4 ml4, float f2, float f3, float f4, float f5) {
        return ml4.d(new xu6(f2, f3, f4, f5, true));
    }

    public static /* synthetic */ ml4 o(ml4 ml4, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        if ((i2 & 8) != 0) {
            f5 = Float.NaN;
        }
        return n(ml4, f2, f3, f4, f5);
    }

    public static final ml4 p(ml4 ml4, float f2) {
        return ml4.d(new xu6(f2, 0.0f, f2, 0.0f, true, 10));
    }

    public static ml4 q(ml4 ml4, float f2, float f3, int i2) {
        float f4;
        float f5;
        if ((i2 & 1) != 0) {
            f4 = Float.NaN;
        } else {
            f4 = f2;
        }
        if ((i2 & 2) != 0) {
            f5 = Float.NaN;
        } else {
            f5 = f3;
        }
        return ml4.d(new xu6(f4, 0.0f, f5, 0.0f, true, 10));
    }

    public static ml4 r(ml4 ml4) {
        te8 te8;
        h80 h80 = xb4.I;
        if (sg3.e(h80, h80)) {
            te8 = f;
        } else if (sg3.e(h80, xb4.H)) {
            te8 = g;
        } else {
            te8 = new te8(jv1.w, new ph6(21, h80), h80);
        }
        return ml4.d(te8);
    }

    public static ml4 s(ml4 ml4, i80 i80, int i2) {
        te8 te8;
        i80 i802 = xb4.C;
        if ((i2 & 1) != 0) {
            i80 = i802;
        }
        if (i80.equals(i802)) {
            te8 = h;
        } else if (i80.equals(xb4.y)) {
            te8 = i;
        } else {
            te8 = new te8(jv1.y, new ph6(22, i80), i80);
        }
        return ml4.d(te8);
    }

    public static ml4 t(ml4 ml4) {
        te8 te8;
        g80 g80 = xb4.L;
        if (sg3.e(g80, g80)) {
            te8 = d;
        } else if (sg3.e(g80, xb4.K)) {
            te8 = e;
        } else {
            te8 = new te8(jv1.x, new ph6(20, g80), g80);
        }
        return ml4.d(te8);
    }
}
