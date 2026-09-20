package defpackage;

/* renamed from: o71  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class o71 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ ze7 x;

    public /* synthetic */ o71(ze7 ze7, int i) {
        this.w = i;
        this.x = ze7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0152 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    public final Object y(Object obj) {
        ly5 ly5;
        u44 u44;
        dy3 c;
        long j;
        boolean z;
        long j2;
        float f;
        dy3 c2;
        float f2;
        dy3 c3;
        float f3;
        dy3 c4;
        dy3 c5;
        int i = this.w;
        ze7 ze7 = this.x;
        switch (i) {
            case b85.b:
                kw1 kw1 = (kw1) obj;
                return new d9(7, ze7);
            case 1:
                l35 l35 = (l35) obj;
                ze7.r();
                return vs7.a;
            default:
                dy3 dy3 = (dy3) obj;
                u44 u442 = ze7.d;
                ly5 ly52 = ly5.e;
                if (u442 != null) {
                    if (u442.p) {
                        u442 = null;
                    }
                    if (u442 != null) {
                        v35 v35 = ze7.b;
                        long j3 = ze7.n().b;
                        int i2 = lg7.c;
                        int p = v35.p((int) (j3 >> 32));
                        int p2 = ze7.b.p((int) (ze7.n().b & 4294967295L));
                        u44 u443 = ze7.d;
                        long j4 = 0;
                        if (u443 == null || (c5 = u443.c()) == null) {
                            j = 0;
                        } else {
                            j = c5.R(ze7.l(true));
                        }
                        u44 u444 = ze7.d;
                        if (!(u444 == null || (c4 = u444.c()) == null)) {
                            j4 = c4.R(ze7.l(false));
                        }
                        u44 u445 = ze7.d;
                        float f4 = 0.0f;
                        if (u445 == null || (c3 = u445.c()) == null) {
                            z = true;
                            j2 = j4;
                            f = 0.0f;
                        } else {
                            cg7 d = u442.d();
                            if (d != null) {
                                f3 = d.a.c(p).b;
                            } else {
                                f3 = 0.0f;
                            }
                            z = true;
                            j2 = j4;
                            f = Float.intBitsToFloat((int) (c3.R((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                        }
                        u44 u446 = ze7.d;
                        if (!(u446 == null || (c2 = u446.c()) == null)) {
                            cg7 d2 = u442.d();
                            if (d2 != null) {
                                f2 = d2.a.c(p2).b;
                            } else {
                                f2 = 0.0f;
                            }
                            f4 = Float.intBitsToFloat((int) (c2.R((((long) Float.floatToRawIntBits(0.0f)) << z) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L)) & 4294967295L));
                        }
                        int i3 = (int) (j >> (z ? 1 : 0));
                        int i4 = (int) (j2 >> z);
                        ly5 = new ly5(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(f, f4), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (u442.a.g.b() * 25.0f) + Math.max(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L))));
                        u44 = ze7.d;
                        if (u44 == null || (c = u44.c()) == null) {
                            return null;
                        }
                        if (!c.n() || !dy3.n()) {
                            return ly52;
                        }
                        return z85.c(dy3.N(t49.I(c).w(ly5.d())), ly5.c());
                    }
                }
                ly5 = ly52;
                u44 = ze7.d;
                if (u44 == null || (c = u44.c()) == null) {
                }
                break;
        }
    }
}
