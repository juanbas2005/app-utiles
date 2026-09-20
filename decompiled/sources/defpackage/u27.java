package defpackage;

import java.util.List;

/* renamed from: u27  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u27 implements lh4 {
    public final sr2 a;
    public final float b;
    public final float c;

    public u27(sr2 sr2, float f, float f2) {
        this.a = sr2;
        this.b = f;
        this.c = f2;
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
                        return v + gh42.v(i) + kg3.r0(32.0f + this.c);
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
        oh4 oh42 = oh4;
        List list2 = list;
        float floatValue = ((Number) this.a.b()).floatValue();
        int i = 0;
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
                    int size2 = list2.size();
                    int i3 = i;
                    while (i3 < size2) {
                        gh4 gh42 = (gh4) list2.get(i3);
                        if (sg3.e(rc9.P(gh42), "label")) {
                            int i4 = y.w;
                            float f = this.c;
                            char c2 = 2;
                            eh5 y2 = gh42.y(m31.j(-(oh42.r0(f) + i4), i, 2, a2));
                            int r0 = oh42.r0(32.0f + f) + y.w + y2.w;
                            int r02 = oh42.r0(this.b * 2.0f) + Math.max(y.x, y2.x);
                            int C = dh4.C(((float) r0) * floatValue);
                            int size3 = list2.size();
                            int i5 = 0;
                            while (i5 < size3) {
                                char c3 = c2;
                                gh4 gh43 = (gh4) list2.get(i5);
                                int i6 = size3;
                                String str2 = str;
                                if (sg3.e(rc9.P(gh43), "indicatorRipple")) {
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
                                    eh5 y3 = gh43.y(m31.e(a2, m31.h(r0, r0, r02, r02)));
                                    int size4 = list2.size();
                                    int i7 = 0;
                                    while (i7 < size4) {
                                        gh4 gh44 = (gh4) list2.get(i7);
                                        int i8 = size4;
                                        if (sg3.e(rc9.P(gh44), "indicator")) {
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
                                            eh5 y4 = gh44.y(m31.e(a2, m31.h(C, C, r02, r02)));
                                            int g = m31.g(j2, y3.w);
                                            int f2 = m31.f(j2, y3.x);
                                            int i9 = (g - y4.w) / 2;
                                            int i10 = (f2 - y4.x) / 2;
                                            int i11 = (f2 - y.x) / 2;
                                            int i12 = (f2 - y2.x) / 2;
                                            oh4 oh43 = oh4;
                                            int r03 = (g - ((oh43.r0(f) + y.w) + y2.w)) / 2;
                                            return oh43.d0(g, f2, b42.w, new mw4(y4, i9, i10, y2, oh43.r0(f) + r03 + y.w, i12, y, r03, i11, y3, (g - y3.w) / 2, (f2 - y3.x) / 2, 1));
                                        }
                                        oh4 oh44 = oh42;
                                        eh5 eh5 = y;
                                        eh5 eh52 = y2;
                                        eh5 eh53 = y3;
                                        i7++;
                                        list2 = list;
                                        oh42 = oh44;
                                        size4 = i8;
                                    }
                                    throw b81.z(str2);
                                }
                                oh4 oh45 = oh42;
                                eh5 eh54 = y;
                                eh5 eh55 = y2;
                                i5++;
                                size3 = i6;
                                list2 = list;
                                oh42 = oh45;
                                str = str2;
                                c2 = c3;
                            }
                            throw b81.z(str);
                        }
                        eh5 eh56 = y;
                        float f3 = floatValue;
                        String str3 = str;
                        oh4 oh46 = oh42;
                        i3++;
                        list2 = list;
                        str = str3;
                        i = 0;
                    }
                    throw b81.z(str);
                }
                oh4 oh47 = oh42;
                float f4 = floatValue;
                i2++;
                list2 = list;
                i = 0;
            } else {
                throw b81.z(str);
            }
        }
    }

    public final int d(kg3 kg3, List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            gh4 gh4 = (gh4) list.get(i2);
            if (sg3.e(bb0.o0(gh4), "icon")) {
                int c2 = gh4.c(i);
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    gh4 gh42 = (gh4) list.get(i3);
                    if (sg3.e(bb0.o0(gh42), "label")) {
                        return Math.max(c2, gh42.c(i)) + kg3.r0(this.b * 2.0f);
                    }
                }
                throw b81.z("Collection contains no element matching the predicate.");
            }
        }
        throw b81.z("Collection contains no element matching the predicate.");
    }
}
