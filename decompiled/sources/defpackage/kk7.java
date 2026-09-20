package defpackage;

import java.util.List;

/* renamed from: kk7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kk7 implements lh4 {
    public final boolean a;
    public final sr2 b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public kk7(boolean z, sr2 sr2, float f2, float f3, float f4, float f5) {
        this.a = z;
        this.b = sr2;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
    }

    public final mh4 b(oh4 oh4, List list, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        oh4 oh42 = oh4;
        List list2 = list;
        float floatValue = ((Number) this.b.b()).floatValue();
        long j2 = j;
        long a2 = k31.a(j2, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i = 0;
        while (true) {
            String str = "Collection contains no element matching the predicate.";
            if (i < size) {
                gh4 gh4 = (gh4) list2.get(i);
                if (sg3.e(rc9.P(gh4), "icon")) {
                    float f2 = this.c * 2.0f;
                    float f3 = this.d;
                    float f4 = f3 * 2.0f;
                    eh5 y = gh4.y(m31.i(-oh42.r0(f2), -oh42.r0(f4), a2));
                    int r0 = oh42.r0(f2) + y.w;
                    int r02 = oh42.r0(f4) + y.x;
                    int C = dh4.C(((float) r0) * floatValue);
                    int size2 = list2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        gh4 gh42 = (gh4) list2.get(i2);
                        int i3 = size2;
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
                            eh5 y2 = gh42.y(m31.e(a2, m31.h(r0, r0, r02, r02)));
                            int size3 = list2.size();
                            int i4 = 0;
                            while (i4 < size3) {
                                gh4 gh43 = (gh4) list2.get(i4);
                                int i5 = size3;
                                int i6 = i4;
                                if (sg3.e(rc9.P(gh43), "indicator")) {
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
                                    eh5 y3 = gh43.y(m31.e(a2, m31.h(C, C, r02, r02)));
                                    boolean z5 = this.a;
                                    b42 b42 = b42.w;
                                    if (z5) {
                                        int size4 = list2.size();
                                        int i7 = 0;
                                        while (i7 < size4) {
                                            gh4 gh44 = (gh4) list2.get(i7);
                                            if (sg3.e(rc9.P(gh44), "label")) {
                                                int i8 = y3.x;
                                                float f5 = this.e;
                                                eh5 y4 = gh44.y(m31.j(0, -(oh42.r0(f5) + i8), 1, a2));
                                                int g = m31.g(j2, Math.max(y4.w, y2.w));
                                                float e0 = oh42.e0(f5) + ((float) y2.x) + ((float) y4.x);
                                                float f6 = this.f;
                                                int f7 = m31.f(j2, dh4.C((oh42.e0(f6) * 2.0f) + e0));
                                                int r03 = oh42.r0(f6 + f3);
                                                int i9 = (g - y.w) / 2;
                                                int i10 = (g - y3.w) / 2;
                                                int r04 = r03 - oh42.r0(f3);
                                                return oh42.d0(g, f7, b42, new mw4(y3, i10, r04, y4, (g - y4.w) / 2, oh42.r0(f3 + f5) + r03 + y.x, y, i9, r03, y2, (g - y2.w) / 2, r04, 0));
                                            }
                                            eh5 eh5 = y;
                                            eh5 eh52 = y3;
                                            i7++;
                                            y = eh5;
                                            list2 = list;
                                        }
                                        throw b81.z(str2);
                                    }
                                    eh5 eh53 = y;
                                    eh5 eh54 = y3;
                                    int g2 = m31.g(j2, y2.w);
                                    int f8 = m31.f(j2, y2.x);
                                    return oh42.d0(g2, f8, b42, new ev4(eh54, (g2 - eh54.w) / 2, (f8 - eh54.x) / 2, eh53, (g2 - eh53.w) / 2, (f8 - eh53.x) / 2, y2, (g2 - y2.w) / 2, (f8 - y2.x) / 2));
                                }
                                eh5 eh55 = y2;
                                eh5 eh56 = y;
                                i4 = i6 + 1;
                                size3 = i5;
                                list2 = list;
                            }
                            throw b81.z(str2);
                        }
                        eh5 eh57 = y;
                        i2++;
                        size2 = i3;
                        str = str2;
                        list2 = list;
                    }
                    throw b81.z(str);
                }
                i++;
                list2 = list;
            } else {
                throw b81.z(str);
            }
        }
    }

    public final int d(kg3 kg3, List list, int i) {
        Object obj;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            gh4 gh4 = (gh4) list.get(i3);
            if (sg3.e(bb0.o0(gh4), "icon")) {
                int c2 = gh4.c(i);
                int size2 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i4);
                    if (sg3.e(bb0.o0((gh4) obj), "label")) {
                        break;
                    }
                    i4++;
                }
                gh4 gh42 = (gh4) obj;
                if (gh42 != null) {
                    i2 = gh42.c(i);
                }
                return c2 + i2 + kg3.r0((this.d * 2.0f) + (this.f * 2.0f) + this.e);
            }
        }
        throw b81.z("Collection contains no element matching the predicate.");
    }
}
