package defpackage;

import java.util.ArrayList;

/* renamed from: m65  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m65 extends vg2 {
    public static final m65 d = new vg2(1, 0, 2);

    public final void d(tt2 tt2, kr krVar, jv6 jv6, u36 u36, f75 f75) {
        int[] iArr;
        int i;
        jv6 jv62 = jv6;
        int e = tt2.e(0);
        if (jv62.n != 0) {
            ey0.a("Cannot move a group while inserting");
        }
        if (e < 0) {
            ey0.a("Parameter offset is out of bounds");
        }
        if (e != 0) {
            int i2 = jv62.t;
            int i3 = jv62.v;
            int i4 = jv62.u;
            int i5 = i2;
            while (true) {
                iArr = jv62.b;
                if (e <= 0) {
                    break;
                }
                i5 += iArr[(jv62.r(i5) * 5) + 3];
                if (i5 > i4) {
                    ey0.a("Parameter offset is out of bounds");
                }
                e--;
            }
            int i6 = iArr[(jv62.r(i5) * 5) + 3];
            int g = jv62.g(jv62.b, jv62.r(jv62.t));
            int g2 = jv62.g(jv62.b, jv62.r(i5));
            int i7 = i5 + i6;
            int g3 = jv62.g(jv62.b, jv62.r(i7));
            int i8 = g3 - g2;
            jv62.x(i8, Math.max(jv62.t - 1, 0));
            jv62.w(i6);
            int[] iArr2 = jv62.b;
            int r = jv62.r(i7) * 5;
            qs.J0(jv62.r(i2) * 5, r, (i6 * 5) + r, iArr2, iArr2);
            if (i8 > 0) {
                Object[] objArr = jv62.c;
                int h = jv62.h(g2 + i8);
                System.arraycopy(objArr, h, objArr, g, jv62.h(g3 + i8) - h);
            }
            int i9 = g2 + i8;
            int i10 = i9 - g;
            int i11 = jv62.k;
            int i12 = jv62.l;
            int length = jv62.c.length;
            int i13 = jv62.m;
            int i14 = i2 + i6;
            int i15 = i2;
            while (i15 < i14) {
                int r2 = jv62.r(i15);
                int i16 = i10;
                int g4 = jv62.g(iArr2, r2) - i16;
                int i17 = r2;
                if (i13 < r2) {
                    i = 0;
                } else {
                    i = i11;
                }
                int[] iArr3 = iArr2;
                iArr3[(i17 * 5) + 4] = jv6.i(jv6.i(g4, i, i12, length), jv62.k, jv62.l, jv62.c.length);
                i15++;
                i10 = i16;
                iArr2 = iArr3;
                i11 = i11;
            }
            int i18 = i7 + i6;
            int p = jv62.p();
            int a = iv6.a(jv62.d, i7, p);
            ArrayList arrayList = new ArrayList();
            if (a >= 0) {
                while (a < jv62.d.size() && (r12 = jv62.c(r11)) >= i7 && r12 < i18) {
                    arrayList.add((r11 = (st2) jv62.d.get(a)));
                    st2 st2 = (st2) jv62.d.remove(a);
                }
            }
            int i19 = i2 - i7;
            int size = arrayList.size();
            for (int i20 = 0; i20 < size; i20++) {
                st2 st22 = (st2) arrayList.get(i20);
                int c = jv62.c(st22) + i19;
                if (c >= jv62.g) {
                    st22.a = -(p - c);
                } else {
                    st22.a = c;
                }
                jv62.d.add(iv6.a(jv62.d, c, p), st22);
            }
            if (jv62.K(i7, i6)) {
                ey0.a("Unexpectedly removed anchors");
            }
            jv62.m(i3, jv62.u, i2);
            if (i8 > 0) {
                jv62.L(i9, i8, i7 - 1);
            }
        }
    }
}
