package defpackage;

import java.util.List;

/* renamed from: ok  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ok implements lh4 {
    public final int a;
    public final sr2 b;
    public final sr2 c;
    public final la5 d;
    public final float e;

    public ok(int i, sr2 sr2, sr2 sr22, la5 la5, float f) {
        this.a = i;
        this.b = sr2;
        this.c = sr22;
        this.d = la5;
        this.e = f;
    }

    public final int a(kg3 kg3, List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            gh4 gh4 = (gh4) list.get(i2);
            if (sg3.e(bb0.o0(gh4), "icon")) {
                int v = gh4.v(i);
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    gh4 gh42 = (gh4) list.get(i3);
                    if (sg3.e(bb0.o0(gh42), "label")) {
                        int v2 = gh42.v(i);
                        ey3 layoutDirection = kg3.getLayoutDirection();
                        la5 la5 = this.d;
                        int r0 = kg3.r0(x91.k(la5, kg3.getLayoutDirection()) + x91.l(la5, layoutDirection));
                        int i4 = this.a;
                        float f = this.e;
                        if (i4 == 0) {
                            return Math.max(v2, kg3.r0(f * 2.0f) + r0 + v);
                        }
                        return v + v2 + kg3.r0(8.0f + f) + r0;
                    }
                }
                throw b81.z("Collection contains no element matching the predicate.");
            }
        }
        throw b81.z("Collection contains no element matching the predicate.");
    }

    public final mh4 b(oh4 oh4, List list, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        float f;
        Number valueOf;
        int i;
        oh4 oh42 = oh4;
        List list2 = list;
        float floatValue = ((Number) this.c.b()).floatValue();
        sr2 sr2 = this.b;
        float floatValue2 = ((Number) sr2.b()).floatValue();
        long a2 = k31.a(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i2 = 0;
        while (i2 < size) {
            gh4 gh4 = (gh4) list2.get(i2);
            if (sg3.e(rc9.P(gh4), "icon")) {
                eh5 y = gh4.y(a2);
                int size2 = list2.size();
                int i3 = 0;
                while (i3 < size2) {
                    gh4 gh42 = (gh4) list2.get(i3);
                    if (sg3.e(rc9.P(gh42), "label")) {
                        eh5 y2 = gh42.y(a2);
                        la5 la5 = this.d;
                        if (la5 instanceof a12) {
                            ((a12) la5).c = z65.o(floatValue2, 0.0f, 1.0f);
                        }
                        float k = x91.k(la5, oh42.getLayoutDirection()) + x91.l(la5, oh42.getLayoutDirection());
                        float d2 = la5.d();
                        int i4 = y.w;
                        int i5 = y.x;
                        float f2 = floatValue;
                        int r0 = oh42.r0(8.0f) + y2.w + i4;
                        sr2 sr22 = sr2;
                        String str = "Collection contains no element matching the predicate.";
                        int max = Math.max(y.x, y2.x);
                        int r02 = oh42.r0(k) + we.F(floatValue2, i4, r0);
                        int C = dh4.C(((float) r02) * f2);
                        int r03 = oh42.r0(la5.a() + d2) + we.F(floatValue2, i5, max);
                        int size3 = list2.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            gh4 gh43 = (gh4) list2.get(i6);
                            int i7 = size3;
                            if (sg3.e(rc9.P(gh43), "indicatorRipple")) {
                                if (r02 >= 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (r03 >= 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z || !z2) {
                                    ac3.a("width and height must be >= 0");
                                }
                                int i8 = i4;
                                String str2 = "width and height must be >= 0";
                                eh5 y3 = gh43.y(m31.e(a2, m31.h(r02, r02, r03, r03)));
                                int size4 = list2.size();
                                int i9 = 0;
                                while (i9 < size4) {
                                    gh4 gh44 = (gh4) list2.get(i9);
                                    if (sg3.e(rc9.P(gh44), "indicator")) {
                                        if (C >= 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (r03 >= 0) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (!z3 || !z4) {
                                            ac3.a(str2);
                                        }
                                        eh5 y4 = gh44.y(m31.e(a2, m31.h(C, C, r03, r03)));
                                        float floatValue3 = ((Number) sr22.b()).floatValue();
                                        if (this.a == 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        int i10 = y2.w;
                                        float f3 = this.e;
                                        float f4 = f3 * 2.0f;
                                        int g = m31.g(a2, Math.max(i10, oh42.r0(x91.l(la5, oh42.getLayoutDirection()) + x91.k(la5, oh42.getLayoutDirection())) + oh42.r0(f4) + i8));
                                        float g2 = (((float) (m31.g(a2, oh42.r0(f3) + y3.w) - g)) * floatValue3) + ((float) g);
                                        int F = we.F(floatValue3, m31.f(a2, dh4.C(oh42.e0(4.0f) + ((float) y3.x) + ((float) y2.x))), m31.f(a2, y3.x));
                                        int F2 = we.F(floatValue3, oh42.r0(f3), dh4.C(((((float) oh42.r0(f3)) + g2) - ((float) y3.w)) / 2.0f));
                                        int r04 = oh42.r0(f3);
                                        int r05 = oh42.r0(x91.l(la5, oh42.getLayoutDirection())) + oh42.r0(f3);
                                        int r06 = oh42.r0(la5.d());
                                        int F3 = we.F(floatValue3, 0, ((F - y.x) / 2) - r06) + r06;
                                        int r07 = ((oh42.r0((x91.k(la5, oh42.getLayoutDirection()) + x91.l(la5, oh42.getLayoutDirection())) + f4) + y.w) - y2.w) / 2;
                                        int r08 = oh42.r0(la5.a() + 4.0f) + F3 + y.x;
                                        if (!z5 || floatValue3 <= 0.0f) {
                                            f = ((float) oh42.r0(f3)) * (1.0f - floatValue3);
                                        } else {
                                            f = 0.0f;
                                        }
                                        float r09 = ((float) (oh42.r0(8.0f) + (r05 + y.w))) - f;
                                        int i11 = (F - y2.x) / 2;
                                        int i12 = (floatValue3 > 0.5f ? 1 : (floatValue3 == 0.5f ? 0 : -1));
                                        if (i12 < 0) {
                                            valueOf = Integer.valueOf(r07);
                                        } else {
                                            valueOf = Float.valueOf(r09 * floatValue3);
                                        }
                                        Number number = valueOf;
                                        if (i12 < 0) {
                                            i = r08;
                                        } else {
                                            i = i11;
                                        }
                                        return oh42.d0(dh4.C(g2), F, b42.w, new lw4(y4, r04, y, r05, F3, y2, number, i, y3, F2, floatValue3));
                                    }
                                    eh5 eh5 = y;
                                    eh5 eh52 = y2;
                                    eh5 eh53 = y3;
                                    i9++;
                                    list2 = list;
                                }
                                throw b81.z(str);
                            }
                            eh5 eh54 = y;
                            eh5 eh55 = y2;
                            int i13 = i4;
                            i6++;
                            size3 = i7;
                            list2 = list;
                        }
                        throw b81.z(str);
                    }
                    float f5 = floatValue;
                    sr2 sr23 = sr2;
                    eh5 eh56 = y;
                    Object obj = "Collection contains no element matching the predicate.";
                    i3++;
                    list2 = list;
                }
                throw b81.z("Collection contains no element matching the predicate.");
            }
            float f6 = floatValue;
            sr2 sr24 = sr2;
            i2++;
            list2 = list;
        }
        throw b81.z("Collection contains no element matching the predicate.");
    }
}
