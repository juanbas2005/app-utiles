package defpackage;

/* renamed from: f52  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f52 extends wx3 implements vr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int x = 1;
    public final /* synthetic */ tr6 y;
    public final /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f52(tr6 tr6, am7 am7, am7 am72, am7 am73) {
        super(1);
        this.y = tr6;
        this.z = am7;
        this.A = am72;
        this.B = am73;
    }

    public final Object y(Object obj) {
        float f;
        float f2;
        float f3;
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.x;
        Object obj2 = this.A;
        Object obj3 = this.z;
        tr6 tr6 = this.y;
        boolean z2 = true;
        Object obj4 = this.B;
        switch (i) {
            case b85.b:
                l76 l76 = (l76) obj;
                a37 a37 = (a37) obj3;
                float f4 = 1.0f;
                if (a37 != null) {
                    f = ((Number) a37.getValue()).floatValue();
                } else {
                    f = 1.0f;
                }
                wz0 wz0 = tr6.c;
                if (!tr6.b() || !((Boolean) ((ed5) wz0.a).getValue()).booleanValue()) {
                    f2 = 1.0f;
                } else {
                    f2 = ((ad5) wz0.b).d();
                }
                float f5 = f * f2;
                if (tr6.b()) {
                    tr6.f = f5;
                }
                l76.c(f5);
                a37 a372 = (a37) obj2;
                if (a372 != null) {
                    f3 = ((Number) a372.getValue()).floatValue();
                } else {
                    f3 = 1.0f;
                }
                if (!tr6.b() || !((Boolean) ((ed5) wz0.c).getValue()).booleanValue()) {
                    z2 = false;
                }
                if (z2) {
                    f4 = ((ad5) wz0.d).d();
                }
                float f6 = f3 * f4;
                if (tr6.b()) {
                    tr6.g = f6;
                    if (z2) {
                        if (tr6.j == null) {
                            tr6.j = new z38(false);
                        }
                        z38 z38 = tr6.j;
                        if (z38 != null) {
                            long j5 = tr6.d;
                            long a = wl4.a();
                            if ((1 | (j5 - 1)) == Long.MAX_VALUE) {
                                j2 = u02.l(r16.V(j5));
                            } else {
                                j2 = r16.e0(a, j5);
                            }
                            z38.a(f6, u02.e(j2));
                        }
                    }
                }
                l76.l(f6);
                l76.m(f6);
                a37 a373 = (a37) obj4;
                if (a373 != null) {
                    j = ((ql7) a373.getValue()).a;
                } else {
                    j = ql7.b;
                }
                if (tr6.b() && ((Boolean) ((ed5) wz0.e).getValue()).booleanValue()) {
                    j = ((ql7) ((ed5) wz0.f).getValue()).a;
                }
                if (tr6.b()) {
                    tr6.h = j;
                }
                l76.w(j);
                return vs7.a;
            default:
                x82 x82 = (x82) obj4;
                int ordinal = ((a52) obj).ordinal();
                ql7 ql7 = null;
                if (ordinal == 0) {
                    xf6 xf6 = ((n52) obj2).a.d;
                    if (xf6 != null) {
                        ql7 = new ql7(xf6.b);
                    } else {
                        xf6 xf62 = x82.a.d;
                        if (xf62 != null) {
                            ql7 = new ql7(xf62.b);
                        }
                    }
                } else if (ordinal == 1) {
                    ql7 = (ql7) obj3;
                } else if (ordinal == 2) {
                    xf6 xf63 = x82.a.d;
                    if (xf63 != null) {
                        j4 = xf63.b;
                    } else {
                        j4 = tr6.h;
                    }
                    ql7 = new ql7(j4);
                } else {
                    h.c();
                    return null;
                }
                if (ql7 != null) {
                    j3 = ql7.a;
                } else {
                    j3 = ql7.b;
                }
                return new ql7(j3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f52(ql7 ql7, n52 n52, x82 x82, tr6 tr6) {
        super(1);
        this.z = ql7;
        this.A = n52;
        this.B = x82;
        this.y = tr6;
    }
}
