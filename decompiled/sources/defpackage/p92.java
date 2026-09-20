package defpackage;

import java.util.List;

/* renamed from: p92  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p92 implements sl5 {
    public final ed5 A = u55.p(new ql7(ql7.b));
    public final gc B = pj4.a;
    public final gc C = pj4.b;
    public final l98 D = pj4.c;
    public final l98 E = pj4.d;
    public final hc F = pj4.e;
    public final hc G = pj4.f;
    public final m98 H = pj4.g;
    public final m98 I = pj4.h;
    public final int w;
    public final aq4 x;
    public final int y;
    public final uz1 z;

    public p92(int i, tp1 tp1, aq4 aq4) {
        float f = fj4.a;
        int r0 = tp1.r0(48.0f);
        uz1 uz1 = new uz1(1);
        this.w = i;
        this.x = aq4;
        this.y = r0;
        this.z = uz1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x012b  */
    public final long y(se3 se3, long j, ey3 ey3, long j2) {
        l98 l98;
        char c;
        long j3;
        int i;
        m98 m98;
        int i2;
        float f;
        int a;
        se3 se32 = se3;
        long j4 = j2;
        aq4 aq4 = this.x;
        if (aq4 != null) {
            aq4.getValue();
        }
        char c2 = ' ';
        long j5 = 4294967295L;
        long j6 = (((long) ((int) (j >> 32))) << 32) | (((long) (((int) (j & 4294967295L)) + this.w)) & 4294967295L);
        long a2 = se32.a();
        int i3 = se32.c;
        int i4 = (int) (j6 >> 32);
        if (((int) (a2 >> 32)) < i4 / 2) {
            l98 = this.D;
        } else {
            l98 = this.E;
        }
        List E2 = sg3.E(this.B, this.C, l98);
        int size = E2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                c = c2;
                j3 = j5;
                i = 0;
                break;
            }
            c = c2;
            j3 = j5;
            int i6 = size;
            int i7 = i5;
            int i8 = (int) (j4 >> c);
            List list = E2;
            i = ((nj4) E2.get(i5)).a(se32, j6, i8, ey3);
            if (i7 == list.size() - 1 || (i >= 0 && i8 + i <= i4)) {
                break;
            }
            i5 = i7 + 1;
            E2 = list;
            size = i6;
            c2 = c;
            j5 = j3;
        }
        int i9 = (int) (j6 & j3);
        if (((int) (se32.a() & j3)) < i9 / 2) {
            m98 = this.H;
        } else {
            m98 = this.I;
        }
        List E3 = sg3.E(this.F, this.G, m98);
        int size2 = E3.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                i2 = 0;
                break;
            }
            int i11 = (int) (j4 & j3);
            a = ((oj4) E3.get(i10)).a(se32, j6, i11);
            if (i10 == E3.size() - 1) {
                int i12 = this.y;
                a = z65.p(a, i12, (i9 - i12) - i11);
            }
            if (i10 == E3.size() - 1 || (a >= 0 && i11 + a <= i9)) {
                i2 = a;
            } else {
                i10++;
            }
        }
        i2 = a;
        long j7 = (((long) i) << c) | (((long) i2) & j3);
        se3 d = tf4.d(j7, j4);
        float f2 = fj4.a;
        int i13 = d.a;
        int i14 = d.d;
        int i15 = d.c;
        int i16 = d.b;
        int i17 = se32.b;
        int i18 = se32.d;
        int i19 = se32.a;
        float f3 = 1.0f;
        if (i13 < i3) {
            if (i15 <= i19) {
                f = 1.0f;
            } else if (d.d() != 0) {
                f = ((float) (((Math.min(i3, i15) + Math.max(i19, i13)) / 2) - i13)) / ((float) d.d());
            }
            if (i16 < i18) {
                if (i14 > i17) {
                    if (d.b() != 0) {
                        f3 = ((float) (((Math.min(i18, i14) + Math.max(i17, i16)) / 2) - i16)) / ((float) d.b());
                    }
                }
                this.A.setValue(new ql7(o55.a(f, f3)));
                this.z.getClass();
                return j7;
            }
            f3 = 0.0f;
            this.A.setValue(new ql7(o55.a(f, f3)));
            this.z.getClass();
            return j7;
        }
        f = 0.0f;
        if (i16 < i18) {
        }
        f3 = 0.0f;
        this.A.setValue(new ql7(o55.a(f, f3)));
        this.z.getClass();
        return j7;
    }
}
