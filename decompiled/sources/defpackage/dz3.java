package defpackage;

import java.util.Map;

/* renamed from: dz3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dz3 implements mh4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mh4 b;
    public final /* synthetic */ iz3 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ mh4 e;

    public /* synthetic */ dz3(mh4 mh4, iz3 iz3, int i, mh4 mh42, int i2) {
        this.a = i2;
        this.c = iz3;
        this.d = i;
        this.e = mh42;
        this.b = mh4;
    }

    public final Map a() {
        switch (this.a) {
            case b85.b:
                return this.b.a();
            default:
                return this.b.a();
        }
    }

    public final void b() {
        int i = this.a;
        mh4 mh4 = this.e;
        int i2 = this.d;
        iz3 iz3 = this.c;
        switch (i) {
            case b85.b:
                iz3.A = i2;
                mh4.b();
                eq4 eq4 = iz3.I;
                tp4 tp4 = iz3.H;
                long[] jArr = tp4.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj = tp4.b[i6];
                                    n67 n67 = (n67) tp4.c[i6];
                                    int i7 = eq4.i(obj);
                                    if (i7 < 0 || i7 >= iz3.A) {
                                        if (i7 >= 0) {
                                            Object[] objArr = eq4.w;
                                            Object obj2 = objArr[i7];
                                            objArr[i7] = m67.b;
                                        }
                                        if (iz3.F.b(obj)) {
                                            n67.b();
                                        }
                                        tp4.l(i6);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i4 != 8) {
                            }
                        }
                        if (i3 != length) {
                            i3++;
                        }
                    }
                }
                iz3.g(iz3.z);
                return;
            default:
                iz3.z = i2;
                mh4.b();
                if (iz3.w.D == null) {
                    iz3.g(iz3.z);
                    return;
                }
                return;
        }
    }

    public final int c() {
        switch (this.a) {
            case b85.b:
                return this.b.c();
            default:
                return this.b.c();
        }
    }

    public final vr2 d() {
        switch (this.a) {
            case b85.b:
                return this.b.d();
            default:
                return this.b.d();
        }
    }

    public final int e() {
        switch (this.a) {
            case b85.b:
                return this.b.e();
            default:
                return this.b.e();
        }
    }

    public final gs2 f() {
        switch (this.a) {
            case b85.b:
                return this.b.f();
            default:
                return this.b.f();
        }
    }

    public final vr2 g() {
        switch (this.a) {
            case b85.b:
                return this.b.g();
            default:
                return this.b.g();
        }
    }
}
