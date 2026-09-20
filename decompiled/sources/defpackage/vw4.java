package defpackage;

import java.util.List;

/* renamed from: vw4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vw4 implements lh4 {
    public final /* synthetic */ sr2 a;
    public final /* synthetic */ gs2 b;
    public final /* synthetic */ boolean c;

    public vw4(sr2 sr2, gs2 gs2, boolean z) {
        this.a = sr2;
        this.b = gs2;
        this.c = z;
    }

    public final mh4 b(oh4 oh4, List list, long j) {
        float f;
        float f2;
        boolean z;
        boolean z2;
        Object obj;
        eh5 eh5;
        eh5 eh52;
        float f3;
        int i;
        boolean z3;
        boolean z4;
        oh4 oh42 = oh4;
        List list2 = list;
        float floatValue = ((Number) this.a.b()).floatValue();
        if (floatValue < 0.0f) {
            f = 0.0f;
        } else {
            f = floatValue;
        }
        long j2 = j;
        long a2 = k31.a(j2, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i2 = 0;
        while (true) {
            String str = "Collection contains no element matching the predicate.";
            if (i2 < size) {
                gh4 gh4 = (gh4) list2.get(i2);
                if (sg3.e(rc9.P(gh4), "icon")) {
                    eh5 y = gh4.y(a2);
                    int r0 = oh42.r0(ww4.d * 2.0f) + y.w;
                    int C = dh4.C(((float) r0) * f);
                    gs2 gs2 = this.b;
                    if (gs2 == null) {
                        f2 = ww4.f;
                    } else {
                        f2 = ww4.e;
                    }
                    int r02 = oh42.r0(f2 * 2.0f) + y.x;
                    int size2 = list2.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        int i4 = size2;
                        gh4 gh42 = (gh4) list2.get(i3);
                        float f4 = f;
                        String str2 = str;
                        if (sg3.e(rc9.P(gh42), "indicatorRipple")) {
                            if (r0 >= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (r02 >= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z || !z2) {
                                ac3.a("width and height must be >= 0");
                            }
                            eh5 y2 = gh42.y(m31.h(r0, r0, r02, r02));
                            int size3 = list2.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size3) {
                                    obj = null;
                                    break;
                                }
                                obj = list2.get(i5);
                                int i6 = size3;
                                if (sg3.e(rc9.P((gh4) obj), "indicator")) {
                                    break;
                                }
                                i5++;
                                size3 = i6;
                            }
                            gh4 gh43 = (gh4) obj;
                            if (gh43 != null) {
                                if (C >= 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (r02 >= 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (!z3 || !z4) {
                                    ac3.a("width and height must be >= 0");
                                }
                                eh5 = gh43.y(m31.h(C, C, r02, r02));
                            } else {
                                eh5 = null;
                            }
                            if (gs2 != null) {
                                int size4 = list2.size();
                                int i7 = 0;
                                while (i7 < size4) {
                                    gh4 gh44 = (gh4) list2.get(i7);
                                    if (sg3.e(rc9.P(gh44), "label")) {
                                        eh52 = gh44.y(a2);
                                    } else {
                                        i7++;
                                    }
                                }
                                throw b81.z(str2);
                            }
                            eh52 = null;
                            b42 b42 = b42.w;
                            if (gs2 == null) {
                                int i8 = y.w;
                                int i9 = y2.w;
                                if (eh5 != null) {
                                    i = eh5.w;
                                } else {
                                    i = 0;
                                }
                                int g = m31.g(j2, Math.max(i8, Math.max(i9, i)));
                                int f5 = m31.f(j2, oh42.r0(ww4.b));
                                return oh42.d0(g, f5, b42, new ev4(eh5, y, (g - y.w) / 2, (f5 - y.x) / 2, y2, (g - y2.w) / 2, (f5 - y2.x) / 2, g, f5, 2));
                            }
                            eh5 eh53 = y2;
                            eh52.getClass();
                            float f6 = ww4.e;
                            float e0 = oh42.e0(f6) + ((float) y.x);
                            float f7 = ww4.c;
                            float e02 = oh42.e0(f7) + e0 + ((float) eh52.x);
                            float i10 = (((float) k31.i(j2)) - e02) / 2.0f;
                            float e03 = oh42.e0(f6);
                            if (i10 < e03) {
                                i10 = e03;
                            }
                            float f8 = (i10 * 2.0f) + e02;
                            float f9 = i10;
                            int i11 = 0;
                            boolean z5 = this.c;
                            if (z5) {
                                f3 = f9;
                            } else {
                                f3 = (f8 - ((float) y.x)) / 2.0f;
                            }
                            float f10 = (1.0f - f4) * (f3 - f9);
                            float e04 = oh42.e0(f7) + oh42.e0(f6) + f9 + ((float) y.x);
                            int i12 = y.w;
                            int i13 = eh52.w;
                            if (eh5 != null) {
                                i11 = eh5.w;
                            }
                            int g2 = m31.g(j2, Math.max(i12, Math.max(i13, i11)));
                            return oh42.d0(g2, dh4.C(f8), b42, new sw4(eh5, z5, f4, eh52, (g2 - eh52.w) / 2, e04, f10, y, (g2 - y.w) / 2, f9, eh53, (g2 - eh53.w) / 2, f9 - oh42.e0(f6), g2));
                        }
                        i3++;
                        f = f4;
                        size2 = i4;
                        str = str2;
                    }
                    throw b81.z(str);
                }
                float f11 = f;
                i2++;
            } else {
                throw b81.z(str);
            }
        }
    }
}
