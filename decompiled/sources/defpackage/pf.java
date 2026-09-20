package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: pf  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pf implements lh4 {
    public static final pf b = new pf(0);
    public static final pf c = new pf(1);
    public static final pf d = new pf(2);
    public static final pf e = new pf(3);
    public static final pf f = new pf(4);
    public static final pf g = new pf(5);
    public static final pf h = new pf(6);
    public static final vd2 i = new vd2(20);
    public static final pf j = new pf(7);
    public static final pf k = new pf(8);
    public static final pf l = new pf(9);
    public static final pf m = new pf(10);
    public final /* synthetic */ int a;

    public /* synthetic */ pf(int i2) {
        this.a = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0149  */
    public final mh4 b(oh4 oh4, List list, long j2) {
        int i2;
        int i3;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        eh5 eh5;
        Object obj;
        eh5 eh52;
        Object obj2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        boolean z4;
        int r0;
        int max;
        int i9;
        int i10;
        int X;
        oh4 oh42 = oh4;
        List list2 = list;
        long j3 = j2;
        int i11 = this.a;
        b42 b42 = b42.w;
        switch (i11) {
            case b85.b:
                long j4 = j3;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size = list2.size();
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < size; i14++) {
                    eh5 y = ((gh4) list2.get(i14)).y(j4);
                    i12 = Math.max(i12, y.w);
                    i13 = Math.max(i13, y.x);
                    arrayList2.add(y);
                }
                if (list2.isEmpty()) {
                    i12 = k31.j(j4);
                    i13 = k31.i(j4);
                }
                return oh42.d0(i12, i13, b42, new of(0, arrayList2));
            case 1:
                long j5 = j3;
                int size2 = list2.size();
                if (size2 == 0) {
                    return oh42.d0(0, 0, b42, ce.G);
                }
                if (size2 != 1) {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    int size3 = list2.size();
                    int i15 = 0;
                    int i16 = 0;
                    for (int i17 = 0; i17 < size3; i17++) {
                        eh5 y2 = ((gh4) list2.get(i17)).y(j5);
                        i15 = Math.max(i15, y2.w);
                        i16 = Math.max(i16, y2.x);
                        arrayList3.add(y2);
                    }
                    return oh42.d0(i15, i16, b42, new of(1, arrayList3));
                }
                eh5 y3 = ((gh4) list2.get(0)).y(j5);
                return oh42.d0(y3.w, y3.x, b42, new wd(y3, 1));
            case 2:
                long j6 = j3;
                ArrayList arrayList4 = new ArrayList(list2.size());
                int size4 = list2.size();
                for (int i18 = 0; i18 < size4; i18++) {
                    arrayList4.add(((gh4) list2.get(i18)).y(j6));
                }
                return oh42.d0(k31.h(j6), k31.g(j6), b42, new xl(0, arrayList4));
            case 3:
                long j7 = j3;
                return oh42.d0(k31.j(j7), k31.i(j7), b42, new vd2(20));
            case 4:
                long j8 = j3;
                int size5 = list2.size();
                for (int i19 = 0; i19 < size5; i19++) {
                    gh4 gh4 = (gh4) list2.get(i19);
                    if (sg3.e(rc9.P(gh4), "badge")) {
                        eh5 y4 = gh4.y(k31.a(j8, 0, 0, 0, 0, 11));
                        int size6 = list2.size();
                        for (int i20 = 0; i20 < size6; i20++) {
                            gh4 gh42 = (gh4) list2.get(i20);
                            if (sg3.e(rc9.P(gh42), "anchor")) {
                                eh5 y5 = gh42.y(j8);
                                h23 h23 = nb.a;
                                int X2 = y5.X(h23);
                                h23 h232 = nb.b;
                                return oh42.d0(y5.w, y5.x, sf4.V(new yb5(h23, Integer.valueOf(X2)), new yb5(h232, Integer.valueOf(y5.X(h232)))), new m0(8, y4, y5));
                            }
                        }
                        throw b81.z("Collection contains no element matching the predicate.");
                    }
                }
                throw b81.z("Collection contains no element matching the predicate.");
            case 5:
                long j9 = j3;
                return oh42.d0(k31.j(j9), k31.i(j9), b42, new vd2(20));
            case 6:
                long j10 = j3;
                return oh42.d0(k31.h(j10), k31.g(j10), b42, i);
            case 7:
                long j11 = j3;
                return oh42.d0(k31.j(j11), k31.i(j11), b42, new vd2(20));
            case 8:
                long j12 = j3;
                ArrayList arrayList5 = new ArrayList(list2.size());
                int size7 = list2.size();
                int i21 = 0;
                int i22 = 0;
                for (int i23 = 0; i23 < size7; i23++) {
                    eh5 y6 = ((gh4) list2.get(i23)).y(j12);
                    i21 = Math.max(i21, y6.w);
                    i22 = Math.max(i22, y6.x);
                    arrayList5.add(y6);
                }
                return oh42.d0(i21, i22, b42, new xl(3, arrayList5));
            case 9:
                long j13 = j3;
                if (k31.f(j13)) {
                    i2 = k31.h(j13);
                } else {
                    i2 = 0;
                }
                if (k31.e(j13)) {
                    i3 = k31.g(j13);
                } else {
                    i3 = 0;
                }
                return oh42.d0(i2, i3, b42, new vd2(20));
            case 10:
                long j14 = j3;
                return oh42.d0(k31.j(j14), k31.i(j14), b42, new vd2(20));
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                long j15 = j3;
                int h2 = k31.h(j15);
                int i24 = k31.i(j15);
                int size8 = list2.size();
                if (size8 < 1) {
                    return oh42.d0(h2, i24, b42, new vd2(20));
                }
                if (!k31.d(j15)) {
                    arrayList = new ArrayList(list2.size());
                    int size9 = list2.size();
                    for (int i25 = 0; i25 < size9; i25++) {
                        gh4 gh43 = (gh4) list2.get(i25);
                        if (i24 < 0) {
                            ac3.a("height must be >= 0");
                        }
                        arrayList.add(gh43.y(m31.e(j15, m31.h(0, Integer.MAX_VALUE, i24, i24))));
                    }
                } else {
                    int i26 = h2 / size8;
                    int size10 = list2.size();
                    int i27 = i24;
                    for (int i28 = 0; i28 < size10; i28++) {
                        int c2 = ((gh4) list2.get(i28)).c(i26);
                        if (i27 < c2) {
                            int g2 = k31.g(j15);
                            if (c2 > g2) {
                                c2 = g2;
                            }
                            i27 = c2;
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(list2.size());
                    int size11 = list2.size();
                    for (int i29 = 0; i29 < size11; i29++) {
                        gh4 gh44 = (gh4) list2.get(i29);
                        if (i26 >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i27 >= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z || !z2) {
                            ac3.a("width and height must be >= 0");
                        }
                        arrayList6.add(gh44.y(m31.e(j15, m31.h(i26, i26, i27, i27))));
                    }
                    arrayList = arrayList6;
                    i24 = i27;
                }
                return oh42.d0(h2, i24, b42, new xl(1, arrayList));
            default:
                int min = Math.min(k31.h(j3), oh42.r0(600.0f));
                int size12 = list2.size();
                int i30 = 0;
                while (true) {
                    eh5 = null;
                    if (i30 < size12) {
                        obj = list2.get(i30);
                        if (!sg3.e(rc9.P((gh4) obj), "action")) {
                            i30++;
                        }
                    } else {
                        obj = null;
                    }
                }
                gh4 gh45 = (gh4) obj;
                if (gh45 != null) {
                    eh52 = gh45.y(j3);
                } else {
                    eh52 = null;
                }
                int size13 = list2.size();
                int i31 = 0;
                while (true) {
                    if (i31 < size13) {
                        obj2 = list2.get(i31);
                        if (!sg3.e(rc9.P((gh4) obj2), "dismissAction")) {
                            i31++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                gh4 gh46 = (gh4) obj2;
                if (gh46 != null) {
                    eh5 = gh46.y(j3);
                }
                eh5 eh53 = eh5;
                if (eh52 != null) {
                    i4 = eh52.w;
                } else {
                    i4 = 0;
                }
                if (eh52 != null) {
                    i5 = eh52.x;
                } else {
                    i5 = 0;
                }
                if (eh53 != null) {
                    i6 = eh53.w;
                } else {
                    i6 = 0;
                }
                if (eh53 != null) {
                    i7 = eh53.x;
                } else {
                    i7 = 0;
                }
                if (i6 == 0) {
                    i8 = oh42.r0(8.0f);
                } else {
                    i8 = 0;
                }
                int i32 = ((min - i4) - i6) - i8;
                int j16 = k31.j(j3);
                if (i32 < j16) {
                    i32 = j16;
                }
                int size14 = list2.size();
                int i33 = 0;
                while (i33 < size14) {
                    gh4 gh47 = (gh4) list2.get(i33);
                    int i34 = i5;
                    if (sg3.e(rc9.P(gh47), "text")) {
                        int i35 = i7;
                        int i36 = i34;
                        eh5 y7 = gh47.y(k31.a(j2, 0, i32, 0, 0, 9));
                        h23 h233 = nb.a;
                        int X3 = y7.X(h233);
                        int X4 = y7.X(nb.b);
                        if (X3 == Integer.MIN_VALUE || X4 == Integer.MIN_VALUE) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (X3 == X4 || !z3) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int i37 = min - i6;
                        int i38 = i37 - i4;
                        if (z4) {
                            max = Math.max(oh42.r0(ie1.e0), Math.max(i36, i35));
                            r0 = (max - y7.x) / 2;
                            if (!(eh52 == null || (X = eh52.X(h233)) == Integer.MIN_VALUE)) {
                                i9 = (X3 + r0) - X;
                                int i39 = i9;
                                int i40 = r0;
                                if (eh53 != null) {
                                    i10 = (max - eh53.x) / 2;
                                } else {
                                    i10 = 0;
                                }
                                return oh42.d0(min, max, b42, new uw6(y7, i40, eh52, i38, i39, eh53, i37, i10));
                            }
                        } else {
                            r0 = oh42.r0(30.0f) - X3;
                            max = Math.max(oh42.r0(ie1.f0), y7.x + r0);
                            if (eh52 != null) {
                                i9 = (max - eh52.x) / 2;
                                int i392 = i9;
                                int i402 = r0;
                                if (eh53 != null) {
                                }
                                return oh42.d0(min, max, b42, new uw6(y7, i402, eh52, i38, i392, eh53, i37, i10));
                            }
                        }
                        i9 = 0;
                        int i3922 = i9;
                        int i4022 = r0;
                        if (eh53 != null) {
                        }
                        return oh42.d0(min, max, b42, new uw6(y7, i4022, eh52, i38, i3922, eh53, i37, i10));
                    }
                    eh5 eh54 = eh52;
                    eh5 eh55 = eh53;
                    i33++;
                    long j17 = j2;
                    i5 = i34;
                }
                throw b81.z("Collection contains no element matching the predicate.");
        }
    }
}
