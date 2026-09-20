package defpackage;

/* renamed from: jh4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jh4 extends wx3 implements sr2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ kh4 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jh4(kh4 kh4, int i) {
        super(0);
        this.x = i;
        this.y = kh4;
    }

    public final Object b() {
        dh5 dh5;
        int i = this.x;
        vs7 vs7 = vs7.a;
        kh4 kh4 = this.y;
        switch (i) {
            case b85.b:
                yy3 yy3 = kh4.B;
                yy3.i = 0;
                eq4 z = yy3.a.z();
                Object[] objArr = z.w;
                int i2 = z.y;
                for (int i3 = 0; i3 < i2; i3++) {
                    kh4 kh42 = ((uy3) objArr[i3]).b0.p;
                    kh42.D = kh42.E;
                    kh42.E = Integer.MAX_VALUE;
                    kh42.P = false;
                    if (kh42.H == sy3.x) {
                        kh42.H = sy3.y;
                    }
                }
                uy3 uy3 = yy3.a;
                uy3 uy32 = yy3.a;
                eq4 z2 = uy3.z();
                Object[] objArr2 = z2.w;
                int i4 = z2.y;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((uy3) objArr2[i5]).b0.p.T.d = false;
                }
                if (kh4.f().K) {
                    jp4 jp4 = (jp4) uy32.n();
                    int i6 = ((eq4) jp4.x).y;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((xz4) ((uy3) jp4.get(i7)).a0.e).K = true;
                    }
                }
                kh4.f().J0().b();
                if (kh4.f().K) {
                    jp4 jp42 = (jp4) uy32.n();
                    int i8 = ((eq4) jp42.x).y;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((xz4) ((uy3) jp42.get(i9)).a0.e).K = false;
                    }
                }
                eq4 z3 = uy32.z();
                Object[] objArr3 = z3.w;
                int i10 = z3.y;
                for (int i11 = 0; i11 < i10; i11++) {
                    uy3 uy33 = (uy3) objArr3[i11];
                    yy3 yy32 = uy33.b0;
                    if (yy32.p.D != uy33.w()) {
                        uy32.Q();
                        uy32.D();
                        if (uy33.w() == Integer.MAX_VALUE) {
                            if (yy32.c || we.B(uy33)) {
                                jd4 jd4 = yy32.q;
                                jd4.getClass();
                                jd4.p0(false);
                            }
                            yy32.p.s0();
                        }
                    }
                }
                eq4 z4 = uy32.z();
                Object[] objArr4 = z4.w;
                int i12 = z4.y;
                for (int i13 = 0; i13 < i12; i13++) {
                    vy3 vy3 = ((uy3) objArr4[i13]).b0.p.T;
                    vy3.e = vy3.d;
                }
                return vs7;
            case 1:
                kh4.B.a().y(kh4.X);
                return vs7;
            default:
                yy3 yy33 = kh4.B;
                xz4 xz4 = yy33.a().Q;
                if (xz4 == null || (dh5 = xz4.L) == null) {
                    dh5 = ((je) xy3.a(yy33.a)).getPlacementScope();
                }
                vr2 vr2 = kh4.c0;
                if (vr2 == null) {
                    xz4 a = yy33.a();
                    long j = kh4.d0;
                    float f = kh4.e0;
                    dh5.getClass();
                    dh5.a(dh5, a);
                    a.h0(oe3.c(j, a.A), f, (vr2) null);
                } else {
                    xz4 a2 = yy33.a();
                    long j2 = kh4.d0;
                    float f2 = kh4.e0;
                    dh5.getClass();
                    dh5.a(dh5, a2);
                    a2.h0(oe3.c(j2, a2.A), f2, vr2);
                }
                return vs7;
        }
    }
}
