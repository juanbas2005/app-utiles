package defpackage;

/* renamed from: xy0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class xy0 {
    public static final t37 a = new hu5(xe.J);
    public static final t37 b = new hu5(xe.K);
    public static final t37 c = new hu5(xe.M);
    public static final t37 d = new hu5(xe.L);
    public static final t37 e = new hu5(xe.O);
    public static final t37 f = new hu5(xe.N);
    public static final t37 g = new hu5(xe.U);
    public static final t37 h = new hu5(xe.Q);
    public static final t37 i = new hu5(xe.R);
    public static final t37 j = new hu5(xe.T);
    public static final t37 k = new hu5(xe.S);
    public static final t37 l = new hu5(xe.V);
    public static final t37 m = new hu5(xe.W);
    public static final t37 n = new hu5(xe.X);
    public static final t37 o = new hu5(xe.Z);
    public static final yy0 p = new yy0((vr2) ce.Q);
    public static final t37 q = new hu5(vy0.z);
    public static final t37 r = new hu5(xe.b0);
    public static final t37 s = new hu5(vy0.A);
    public static final t37 t = new hu5(vy0.B);
    public static final t37 u = new hu5(vy0.C);
    public static final t37 v = new hu5(vy0.D);
    public static final t37 w = new hu5(vy0.y);
    public static final t37 x = new hu5(xe.Y);
    public static final yy0 y = new yy0((sr2) xe.a0);
    public static final t37 z = new hu5(xe.P);

    public static final void a(p95 p95, hj hjVar, gs2 gs2, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        ju5 ju5;
        int i6;
        boolean z5;
        boolean z6;
        boolean z7;
        p95 p952 = p95;
        hj hjVar2 = hjVar;
        gs2 gs22 = gs2;
        yt2 yt22 = yt2;
        int i7 = i2;
        yt22.g0(1925803616);
        if (yt22.g(p952)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i3 | i7;
        if (yt22.g(hjVar2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (yt22.i(gs22)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i10 = i9 | i5;
        if ((i10 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i10 & 1, z2)) {
            je jeVar = (je) p952;
            ju5 a2 = a.a(jeVar.getAccessibilityManager());
            ju5 a3 = b.a(jeVar.getAutofill());
            ju5 a4 = d.a(jeVar.getAutofillManager());
            ju5 a5 = c.a(jeVar.getAutofillTree());
            ju5 a6 = e.a(jeVar.getClipboardManager());
            ju5 a7 = f.a(jeVar.getClipboard());
            ju5 a8 = h.a(jeVar.getDensity());
            ju5 a9 = i.a(jeVar.getFocusOwner());
            ju5 a10 = j.a(jeVar.getFontLoader());
            a10.g = false;
            ju5 a11 = k.a(jeVar.getFontFamilyResolver());
            a11.g = false;
            ju5 a12 = l.a(jeVar.getHapticFeedBack());
            int i11 = i10 & 14;
            if (i11 != 4) {
                z3 = false;
            } else {
                z3 = true;
            }
            Object Q = yt22.Q();
            int i12 = i10;
            d63 d63 = ay0.a;
            if (z3 || Q == d63) {
                Q = new de(jeVar, 3);
                yt22.o0(Q);
            }
            ju5 c2 = m.c((vr2) Q);
            ju5 a13 = n.a(jeVar.getLayoutDirection());
            if (i11 != 4) {
                z4 = false;
            } else {
                z4 = true;
            }
            Object Q2 = yt22.Q();
            if (z4 || Q2 == d63) {
                ju5 = a13;
                i6 = 4;
                Q2 = new de(jeVar, 4);
                yt22.o0(Q2);
            } else {
                ju5 = a13;
                i6 = 4;
            }
            ju5 ju52 = a10;
            ju5 c3 = q.c((vr2) Q2);
            if (i11 != i6) {
                z5 = false;
            } else {
                z5 = true;
            }
            Object Q3 = yt22.Q();
            if (z5 || Q3 == d63) {
                Q3 = new de(jeVar, 5);
                yt22.o0(Q3);
            }
            ju5 c4 = r.c((vr2) Q3);
            if (i11 != 4) {
                z6 = false;
            } else {
                z6 = true;
            }
            ju5 ju53 = c4;
            Object Q4 = yt22.Q();
            if (z6 || Q4 == d63) {
                Q4 = new de(jeVar, 6);
                yt22.o0(Q4);
            }
            ju5 c5 = s.c((vr2) Q4);
            ju5 a14 = t.a(hjVar2);
            ju5 ju54 = c5;
            ju5 a15 = u.a(jeVar.getViewConfiguration());
            ju5 a16 = v.a(jeVar.getWindowInfo());
            if (i11 != 4) {
                z7 = false;
            } else {
                z7 = true;
            }
            Object Q5 = yt22.Q();
            if (z7 || Q5 == d63) {
                Q5 = new de(jeVar, 7);
                yt22.o0(Q5);
            }
            ju5 ju55 = ju52;
            ju5 ju56 = c3;
            t49.d(new ju5[]{a2, a3, a4, a5, a6, a7, a8, a9, ju55, a11, a12, c2, ju5, ju56, ju53, ju54, a14, a15, a16, x.c((vr2) Q5), g.a(jeVar.getGraphicsContext()), na4.a.a(jeVar.getRetainedValuesStore()), o.a(jeVar.getLocaleList())}, gs22, yt22, ((i12 >> 3) & 112) | 8);
        } else {
            yt22.Y();
        }
        yx5 v2 = yt22.v();
        if (v2 != null) {
            v2.d = new wy0(p952, hjVar2, gs22, i7);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
