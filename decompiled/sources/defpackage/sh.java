package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: sh  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sh implements lh4 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ sh(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final mh4 b(oh4 oh4, List list, long j) {
        float f;
        boolean z;
        boolean z2;
        Object obj;
        eh5 eh5;
        String str;
        eh5 eh52;
        float f2;
        int h;
        int h2;
        boolean z3;
        boolean z4;
        long j2;
        eh5 eh53;
        eh5 eh54;
        int i;
        int i2;
        float f3;
        int i3;
        Integer num;
        Integer num2;
        ArrayList arrayList;
        int i4;
        int i5;
        yb5 yb5;
        oh4 oh42 = oh4;
        List list2 = list;
        int i6 = this.a;
        b42 b42 = b42.w;
        Object obj2 = this.b;
        Object obj3 = this.c;
        int i7 = 0;
        switch (i6) {
            case b85.b:
                ((pl5) obj2).setParentLayoutDirection((ey3) obj3);
                return oh42.d0(0, 0, b42, ce.E);
            case 1:
                long j3 = j;
                oh4 oh43 = oh42;
                gs2 gs2 = (gs2) obj3;
                float floatValue = ((Number) ((sr2) obj2).b()).floatValue();
                if (floatValue < 0.0f) {
                    f = 0.0f;
                } else {
                    f = floatValue;
                }
                long j4 = j;
                long a2 = k31.a(j4, 0, 0, 0, 0, 10);
                int size = list2.size();
                int i8 = 0;
                while (i8 < size) {
                    gh4 gh4 = (gh4) list2.get(i8);
                    if (sg3.e(rc9.P(gh4), "icon")) {
                        eh5 y = gh4.y(a2);
                        int r0 = oh43.r0(hv4.d * 2.0f) + y.w;
                        int C = dh4.C(((float) r0) * f);
                        int r02 = oh43.r0(hv4.e * 2.0f) + y.x;
                        int size2 = list2.size();
                        int i9 = i7;
                        while (i9 < size2) {
                            gh4 gh42 = (gh4) list2.get(i9);
                            gs2 gs22 = gs2;
                            int i10 = i9;
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
                                int i11 = 0;
                                while (true) {
                                    if (i11 < size3) {
                                        obj = list2.get(i11);
                                        int i12 = size3;
                                        if (!sg3.e(rc9.P((gh4) obj), "indicator")) {
                                            i11++;
                                            size3 = i12;
                                        }
                                    } else {
                                        obj = null;
                                    }
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
                                    str = "Collection contains no element matching the predicate.";
                                    eh5 = gh43.y(m31.h(C, C, r02, r02));
                                } else {
                                    str = "Collection contains no element matching the predicate.";
                                    eh5 = null;
                                }
                                if (gs22 != null) {
                                    int size4 = list2.size();
                                    int i13 = 0;
                                    while (i13 < size4) {
                                        gh4 gh44 = (gh4) list2.get(i13);
                                        if (sg3.e(rc9.P(gh44), "label")) {
                                            eh52 = gh44.y(a2);
                                        } else {
                                            i13++;
                                        }
                                    }
                                    throw b81.z(str);
                                }
                                eh52 = null;
                                if (gs22 == null) {
                                    if (k31.h(j4) == Integer.MAX_VALUE) {
                                        h2 = (oh43.r0(hv4.g) * 2) + y.w;
                                    } else {
                                        h2 = k31.h(j4);
                                    }
                                    int i14 = h2;
                                    int f4 = m31.f(j4, oh43.r0(hv4.a));
                                    return oh43.d0(i14, f4, b42, new ev4(eh5, y, (i14 - y.w) / 2, (f4 - y.x) / 2, y2, (i14 - y2.w) / 2, (f4 - y2.x) / 2, i14, f4, 0));
                                }
                                eh5 eh55 = y;
                                eh5 eh56 = y2;
                                eh5 eh57 = eh5;
                                eh52.getClass();
                                float f5 = hv4.e;
                                float e0 = oh43.e0(f5) + ((float) eh55.x);
                                float f6 = hv4.c;
                                float e02 = oh43.e0(f6) + e0 + ((float) eh52.x);
                                float i15 = (((float) k31.i(j4)) - e02) / 2.0f;
                                float e03 = oh43.e0(f5);
                                if (i15 < e03) {
                                    f2 = e03;
                                } else {
                                    f2 = i15;
                                }
                                float f7 = (f2 * 2.0f) + e02;
                                float f8 = (1.0f - f) * (f2 - f2);
                                float e04 = oh43.e0(f6) + oh43.e0(f5) + f2 + ((float) eh55.x);
                                if (k31.h(j4) == Integer.MAX_VALUE) {
                                    h = (oh43.r0(hv4.g) * 2) + eh55.w;
                                } else {
                                    h = k31.h(j4);
                                }
                                int i16 = h;
                                return oh43.d0(i16, dh4.C(f7), b42, new dv4(eh57, f, eh52, (i16 - eh52.w) / 2, e04, f8, eh55, (i16 - eh55.w) / 2, f2, eh56, (i16 - eh56.w) / 2, f2 - oh43.e0(f5), i16));
                            }
                            eh5 eh58 = y;
                            Object obj4 = "Collection contains no element matching the predicate.";
                            i9 = i10 + 1;
                            gs2 = gs22;
                        }
                        throw b81.z("Collection contains no element matching the predicate.");
                    }
                    gs2 gs23 = gs2;
                    Object obj5 = "Collection contains no element matching the predicate.";
                    i8++;
                    i7 = 0;
                }
                throw b81.z("Collection contains no element matching the predicate.");
            case 2:
                if (((gs2) obj2) != null) {
                    int size5 = list2.size();
                    int i17 = 0;
                    while (i17 < size5) {
                        gh4 gh45 = (gh4) list2.get(i17);
                        if (sg3.e(rc9.P(gh45), "text")) {
                            long j5 = j;
                            j2 = j5;
                            eh53 = gh45.y(k31.a(j5, 0, 0, 0, 0, 11));
                        } else {
                            long j6 = j;
                            i17++;
                        }
                    }
                    throw b81.z("Collection contains no element matching the predicate.");
                }
                j2 = j;
                eh53 = null;
                if (((gs2) obj3) != null) {
                    int size6 = list2.size();
                    int i18 = 0;
                    while (i18 < size6) {
                        gh4 gh46 = (gh4) list2.get(i18);
                        if (sg3.e(rc9.P(gh46), "icon")) {
                            eh54 = gh46.y(j2);
                        } else {
                            i18++;
                        }
                    }
                    throw b81.z("Collection contains no element matching the predicate.");
                }
                eh54 = null;
                if (eh53 != null) {
                    i = eh53.w;
                } else {
                    i = 0;
                }
                if (eh54 != null) {
                    i2 = eh54.w;
                } else {
                    i2 = 0;
                }
                int max = Math.max(i, i2);
                if (eh53 == null || eh54 == null) {
                    f3 = va7.a;
                } else {
                    f3 = va7.b;
                }
                int r03 = oh42.r0(f3);
                if (eh54 != null) {
                    i3 = eh54.x;
                } else {
                    i3 = 0;
                }
                if (eh53 != null) {
                    i7 = eh53.x;
                }
                int max2 = Math.max(r03, oh42.l0(va7.f) + i3 + i7);
                if (eh53 != null) {
                    num = Integer.valueOf(eh53.X(nb.a));
                } else {
                    num = null;
                }
                if (eh53 != null) {
                    num2 = Integer.valueOf(eh53.X(nb.b));
                } else {
                    num2 = null;
                }
                return oh42.d0(max, max2, b42, new ua7(eh53, eh54, oh42, max, max2, num, num2));
            default:
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size7 = list2.size();
                for (int i19 = 0; i19 < size7; i19++) {
                    Object obj6 = list2.get(i19);
                    if (!(((gh4) obj6).B() instanceof mg7)) {
                        arrayList2.add(obj6);
                    }
                }
                List list3 = (List) ((sr2) obj3).b();
                if (list3 != null) {
                    ArrayList arrayList3 = new ArrayList(list3.size());
                    int size8 = list3.size();
                    int i20 = 0;
                    while (i20 < size8) {
                        ly5 ly5 = (ly5) list3.get(i20);
                        if (ly5 != null) {
                            float f9 = ly5.b;
                            float f10 = ly5.a;
                            i4 = size8;
                            i5 = i20;
                            yb5 = new yb5(((gh4) arrayList2.get(i20)).y(m31.b(0, (int) ((float) Math.floor((double) (ly5.c - f10))), 0, (int) ((float) Math.floor((double) (ly5.d - f9))), 5)), new oe3((((long) Math.round(f9)) & 4294967295L) | (((long) Math.round(f10)) << 32)));
                        } else {
                            i4 = size8;
                            i5 = i20;
                            yb5 = null;
                        }
                        if (yb5 != null) {
                            arrayList3.add(yb5);
                        }
                        i20 = i5 + 1;
                        size8 = i4;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList4 = new ArrayList(list2.size());
                int size9 = list2.size();
                while (i7 < size9) {
                    Object obj7 = list2.get(i7);
                    if (((gh4) obj7).B() instanceof mg7) {
                        arrayList4.add(obj7);
                    }
                    i7++;
                }
                return oh42.d0(k31.h(j), k31.g(j), b42, new k77(7, (Object) arrayList, (Object) t49.n(arrayList4, (sr2) obj2)));
        }
    }
}
