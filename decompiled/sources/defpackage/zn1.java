package defpackage;

import android.content.Context;
import android.os.Build;

/* renamed from: zn1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class zn1 {
    public static final tl5 a = new tl5(true, 30);

    public static final void a(md7 md7, yc7 yc7, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        yt2 yt22;
        Context context;
        yt2.g0(1904307118);
        if (yt2.g(md7)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (yt2.i(yc7)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        boolean z2 = true;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i5 & 1, z)) {
            if (Build.VERSION.SDK_INT >= 28) {
                yt2.e0(-1009482584);
                context = (Context) yt2.k(ye.b);
                yt2.r(false);
            } else {
                yt2.e0(-1009433480);
                yt2.r(false);
                context = null;
            }
            boolean i6 = yt2.i(yc7);
            if ((i5 & 14) != 4) {
                z2 = false;
            }
            boolean i7 = i6 | z2 | yt2.i(context);
            Object Q = yt2.Q();
            if (i7 || Q == ay0.a) {
                Q = new g5((Object) yc7, (Object) context, (Object) md7, 12);
                yt2.o0(Q);
            }
            yt22 = yt2;
            a61.b((ml4) null, (x51) null, (vr2) Q, yt22, 0, 3);
        } else {
            yt22 = yt2;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new p13(md7, yc7, i, 13);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    public static final void b(int i, long j, yt2 yt2, int i2) {
        int i3;
        int i4;
        boolean z;
        yx5 v;
        xn1 xn1;
        boolean z2;
        int i5;
        int i6;
        long j2 = j;
        yt2 yt22 = yt2;
        yt22.g0(-1240244237);
        if ((i2 & 6) == 0) {
            i4 = i;
            if (yt22.e(i4)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i2 | i6;
        } else {
            i4 = i;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (yt22.f(j2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        boolean z3 = true;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i3 & 1, z)) {
            Context context = (Context) yt22.k(ye.b);
            boolean g = yt22.g(context);
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = z2 | g;
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (z4 || Q == d63) {
                Q = Integer.valueOf(context.obtainStyledAttributes(new int[]{i4}).getResourceId(0, -1));
                yt22.o0(Q);
            }
            int intValue = ((Number) Q).intValue();
            if (intValue == -1) {
                v = yt22.v();
                if (v != null) {
                    xn1 = new xn1(i4, i2, 1, j2);
                } else {
                    return;
                }
            } else {
                vb5 x = p25.x(intValue, yt22);
                if ((i3 & 112) != 32) {
                    z3 = false;
                }
                Object Q2 = yt22.Q();
                if (z3 || Q2 == d63) {
                    if (j2 == 16) {
                        Q2 = null;
                    } else {
                        Q2 = new u90(j2, 5);
                    }
                    yt22.o0(Q2);
                }
                mb0.a(ed1.w(yu6.l(jl4.w, z51.e), x, (jb) null, i51.b, 0.0f, (lt0) Q2, 22), yt22, 0);
                v = yt22.v();
                if (v == null) {
                    xn1 = new xn1(i, i2, 0, j2);
                } else {
                    return;
                }
            }
        } else {
            yt22.Y();
            v = yt22.v();
            if (v == null) {
            }
        }
        v.d = xn1;
    }

    public static final void c(md7 md7, zc7 zc7, sr2 sr2, yt2 yt2, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        sr2 sr22 = sr2;
        yt2 yt22 = yt2;
        int i6 = i;
        yt22.g0(-2040393164);
        if ((i6 & 6) == 0) {
            if ((i6 & 8) == 0) {
                z4 = yt22.g(md7);
            } else {
                z4 = yt22.i(md7);
            }
            if (z4) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 48) == 0) {
            if ((i6 & 64) == 0) {
                z3 = yt22.g(zc7);
            } else {
                z3 = yt22.i(zc7);
            }
            if (z3) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 384) == 0) {
            if (yt22.i(sr22)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        boolean z5 = false;
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i2 & 1, z)) {
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && yt22.g(zc7))) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (z2 || Q == d63) {
                Q = new re4(new ns8(12, (Object) new f5(15, zc7, sr22)));
                yt22.o0(Q);
            }
            re4 re4 = (re4) Q;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && yt22.i(md7))) {
                z5 = true;
            }
            Object Q2 = yt22.Q();
            if (z5 || Q2 == d63) {
                Q2 = new zh(11, (Object) md7);
                yt22.o0(Q2);
            }
            vh.a(re4, (sr2) Q2, a, su0.J(1315155414, new p13(12, (Object) zc7, (Object) md7), yt22), yt22, 3456, 0);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new bi(i6, 7, (Object) md7, (Object) zc7, (Object) sr22);
        }
    }

    public static final void d(ml4 ml4, fw0 fw0, yt2 yt2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        yt2.g0(1392105195);
        if ((i & 6) == 0) {
            if (yt2.g(ml4)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (yt2.i(fw0)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            h49.m(ml4, kd7.a, fw0, yt2, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new vi(ml4, fw0, i, 3);
        }
    }
}
