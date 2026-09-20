package defpackage;

import java.util.List;

/* renamed from: c95  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c95 implements lh4 {
    public final vr2 a;
    public final boolean b;
    public final me7 c;
    public final ge7 d;
    public final ge7 e;
    public final ge7 f;
    public final la5 g;
    public final float h;

    public c95(vr2 vr2, boolean z, me7 me7, ge7 ge7, ge7 ge72, ge7 ge73, la5 la5, float f2) {
        this.a = vr2;
        this.b = z;
        this.c = me7;
        this.d = ge7;
        this.e = ge72;
        this.f = ge73;
        this.g = la5;
        this.h = f2;
    }

    public static final int j(int i, c95 c95, int i2, int i3, eh5 eh5, eh5 eh52) {
        int i4;
        if (c95.b) {
            i3 = Math.round((((float) (i2 - eh52.x)) / 2.0f) * 1.0f);
        }
        int i5 = i + i3;
        if (eh5 != null) {
            i4 = eh5.x;
        } else {
            i4 = 0;
        }
        return Math.max(i5, i4 / 2);
    }

    public final int a(kg3 kg3, List list, int i) {
        return i(kg3, list, i, new uz1(22));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: gh4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v5, resolved type: gh4} */
    /* JADX WARNING: type inference failed for: r7v8, types: [java.lang.Object, h06] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final mh4 b(oh4 oh4, List list, long j) {
        eh5 eh5;
        Object obj;
        eh5 eh52;
        int i;
        int i2;
        Object obj2;
        int i3;
        eh5 eh53;
        eh5 eh54;
        int i4;
        int i5;
        Object obj3;
        int i6;
        eh5 eh55;
        eh5 eh56;
        int i7;
        int i8;
        Object obj4;
        int i9;
        eh5 eh57;
        eh5 eh58;
        int i10;
        int i11;
        Object obj5;
        eh5 eh59;
        long j2;
        Object obj6;
        int i12;
        int i13;
        gh4 gh4;
        eh5 eh510;
        int i14;
        int i15;
        int i16;
        int i17;
        eh5 eh511;
        int i18;
        int i19;
        h06 h06;
        eh5 eh512;
        eh5 eh513;
        h06 h062;
        eh5 eh514;
        eh5 eh515;
        eh5 eh516;
        eh5 eh517;
        gh4 gh42;
        int i20;
        long j3;
        int i21;
        int i22;
        int i23;
        oh4 oh42;
        c95 c95;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        eh5 eh518;
        int i30;
        int i31;
        int i32;
        h06 h063;
        int i33;
        c95 c952;
        eh5 eh519;
        eh5 eh520;
        int i34;
        eh5 eh521;
        int i35;
        oh4 oh43;
        float f2;
        int i36;
        int i37;
        oh4 oh44 = oh4;
        List list2 = list;
        float b2 = this.d.b();
        la5 la5 = this.g;
        int r0 = oh44.r0(la5.a());
        long a2 = k31.a(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i38 = 0;
        while (true) {
            eh5 = null;
            if (i38 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i38);
            if (sg3.e(rc9.P((gh4) obj), "Leading")) {
                break;
            }
            i38++;
        }
        gh4 gh43 = (gh4) obj;
        if (gh43 != null) {
            eh52 = gh43.y(a2);
        } else {
            eh52 = null;
        }
        if (eh52 != null) {
            i = eh52.w;
        } else {
            i = 0;
        }
        if (eh52 != null) {
            i2 = eh52.x;
        } else {
            i2 = 0;
        }
        int max = Math.max(0, i2);
        int size2 = list2.size();
        int i39 = 0;
        while (true) {
            if (i39 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i39);
            if (sg3.e(rc9.P((gh4) obj2), "Trailing")) {
                break;
            }
            i39++;
        }
        gh4 gh44 = (gh4) obj2;
        if (gh44 != null) {
            eh53 = eh52;
            i3 = i;
            eh54 = gh44.y(m31.j(-i, 0, 2, a2));
        } else {
            eh53 = eh52;
            i3 = i;
            eh54 = null;
        }
        if (eh54 != null) {
            i4 = eh54.w;
        } else {
            i4 = 0;
        }
        int i40 = i3 + i4;
        if (eh54 != null) {
            i5 = eh54.x;
        } else {
            i5 = 0;
        }
        int max2 = Math.max(max, i5);
        int size3 = list2.size();
        int i41 = 0;
        while (true) {
            if (i41 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i41);
            int i42 = size3;
            if (sg3.e(rc9.P((gh4) obj3), "Prefix")) {
                break;
            }
            i41++;
            size3 = i42;
        }
        gh4 gh45 = (gh4) obj3;
        if (gh45 != null) {
            eh55 = eh54;
            i6 = i40;
            eh56 = gh45.y(m31.j(-i40, 0, 2, a2));
        } else {
            eh55 = eh54;
            i6 = i40;
            eh56 = null;
        }
        if (eh56 != null) {
            i7 = eh56.w;
        } else {
            i7 = 0;
        }
        int i43 = i6 + i7;
        if (eh56 != null) {
            i8 = eh56.x;
        } else {
            i8 = 0;
        }
        int max3 = Math.max(max2, i8);
        int size4 = list2.size();
        int i44 = 0;
        while (true) {
            if (i44 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i44);
            int i45 = size4;
            if (sg3.e(rc9.P((gh4) obj4), "Suffix")) {
                break;
            }
            i44++;
            size4 = i45;
        }
        gh4 gh46 = (gh4) obj4;
        if (gh46 != null) {
            eh57 = eh56;
            i9 = i43;
            eh58 = gh46.y(m31.j(-i43, 0, 2, a2));
        } else {
            eh57 = eh56;
            i9 = i43;
            eh58 = null;
        }
        if (eh58 != null) {
            i10 = eh58.w;
        } else {
            i10 = 0;
        }
        int i46 = i9 + i10;
        if (eh58 != null) {
            i11 = eh58.x;
        } else {
            i11 = 0;
        }
        int max4 = Math.max(max3, i11);
        int size5 = list2.size();
        int i47 = 0;
        while (true) {
            if (i47 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list2.get(i47);
            int i48 = size5;
            if (sg3.e(rc9.P((gh4) obj5), "Label")) {
                break;
            }
            i47++;
            size5 = i48;
        }
        gh4 gh47 = (gh4) obj5;
        ? obj7 = new Object();
        int r02 = oh44.r0(la5.c(oh44.getLayoutDirection())) + oh44.r0(la5.b(oh44.getLayoutDirection()));
        int i49 = -r0;
        la5 la52 = la5;
        int i50 = r0;
        long i51 = m31.i(-we.F(b2, i46 + r02, r02), i49, a2);
        if (gh47 != null) {
            eh59 = gh47.y(i51);
        } else {
            eh59 = null;
        }
        obj7.w = eh59;
        if (eh59 != null) {
            j2 = (((long) Float.floatToRawIntBits((float) eh59.x)) & 4294967295L) | (((long) Float.floatToRawIntBits((float) eh59.w)) << 32);
        } else {
            j2 = 0;
        }
        this.a.y(new wu6(j2));
        int size6 = list2.size();
        int i52 = 0;
        while (true) {
            if (i52 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i52);
            if (sg3.e(rc9.P((gh4) obj6), "Supporting")) {
                break;
            }
            i52++;
        }
        gh4 gh48 = (gh4) obj6;
        if (gh48 != null) {
            i12 = gh48.W(k31.j(j));
        } else {
            i12 = 0;
        }
        eh5 eh522 = (eh5) obj7.w;
        if (eh522 != null) {
            i13 = eh522.x;
        } else {
            i13 = 0;
        }
        int max5 = Math.max(i13 / 2, oh44.r0(la52.d()));
        long j4 = j;
        gh4 gh49 = gh48;
        long a3 = k31.a(m31.i(-i46, (i49 - max5) - i12, j4), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i53 = 0;
        while (i53 < size7) {
            gh4 gh410 = gh49;
            gh4 gh411 = (gh4) list2.get(i53);
            int i54 = max5;
            int i55 = size7;
            if (sg3.e(rc9.P(gh411), "TextField")) {
                eh5 y = gh411.y(a3);
                long a4 = k31.a(a3, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i56 = 0;
                while (true) {
                    if (i56 >= size8) {
                        gh4 = null;
                        break;
                    }
                    Object obj8 = list2.get(i56);
                    int i57 = size8;
                    gh4 gh412 = obj8;
                    if (sg3.e(rc9.P(obj8), "Hint")) {
                        gh4 = gh412;
                        break;
                    }
                    i56++;
                    size8 = i57;
                }
                gh4 gh413 = gh4;
                if (gh413 != null) {
                    eh510 = gh413.y(a4);
                } else {
                    eh510 = null;
                }
                int i58 = y.x;
                if (eh510 != null) {
                    i14 = eh510.x;
                } else {
                    i14 = 0;
                }
                int max6 = Math.max(max4, Math.max(i58, i14) + i54 + i50);
                if (eh53 != null) {
                    i15 = eh53.w;
                } else {
                    i15 = 0;
                }
                eh5 eh523 = eh55;
                if (eh55 != null) {
                    i16 = eh523.w;
                } else {
                    i16 = 0;
                }
                int i59 = max6;
                eh5 eh524 = eh57;
                if (eh57 != null) {
                    i17 = eh524.w;
                } else {
                    i17 = 0;
                }
                int i60 = i17;
                if (eh58 != null) {
                    eh5 eh525 = eh523;
                    i18 = eh58.w;
                    eh511 = eh525;
                } else {
                    eh511 = eh523;
                    i18 = 0;
                }
                eh5 eh526 = eh524;
                int i61 = y.w;
                eh5 eh527 = eh511;
                eh5 eh528 = (eh5) obj7.w;
                if (eh528 != null) {
                    h06 h064 = obj7;
                    i19 = eh528.w;
                    h06 = h064;
                } else {
                    h06 = obj7;
                    i19 = 0;
                }
                if (eh510 != null) {
                    eh513 = y;
                    i23 = i15;
                    h062 = h06;
                    j3 = j4;
                    i21 = eh510.w;
                    eh512 = eh510;
                    eh514 = eh58;
                    i22 = i60;
                    eh515 = eh526;
                    gh42 = gh410;
                    c95 = this;
                    eh516 = eh53;
                    i20 = i59;
                    eh517 = eh527;
                    oh42 = oh4;
                } else {
                    h062 = h06;
                    eh513 = y;
                    i23 = i15;
                    j3 = j4;
                    i21 = 0;
                    eh512 = eh510;
                    eh514 = eh58;
                    i22 = i60;
                    eh515 = eh526;
                    gh42 = gh410;
                    c95 = this;
                    oh42 = oh4;
                    eh516 = eh53;
                    i20 = i59;
                    eh517 = eh527;
                }
                int g2 = c95.g(oh42, i23, i16, i22, i18, i61, i19, i21, j3, b2);
                long a5 = k31.a(m31.j(0, -i20, 1, a2), 0, g2, 0, 0, 9);
                int i62 = g2;
                if (gh42 != null) {
                    eh5 = gh42.y(a5);
                }
                eh5 eh529 = eh5;
                if (eh529 != null) {
                    i24 = eh529.x;
                } else {
                    i24 = 0;
                }
                eh5 eh530 = eh516;
                if (eh516 != null) {
                    i25 = eh530.x;
                } else {
                    i25 = 0;
                }
                eh5 eh531 = eh517;
                if (eh517 != null) {
                    i26 = eh531.x;
                } else {
                    i26 = 0;
                }
                eh5 eh532 = eh515;
                if (eh532 != null) {
                    i27 = eh532.x;
                } else {
                    i27 = 0;
                }
                eh5 eh533 = eh514;
                if (eh533 != null) {
                    i28 = eh533.x;
                } else {
                    i28 = 0;
                }
                eh5 eh534 = eh513;
                int i63 = eh534.x;
                h06 h065 = h062;
                eh5 eh535 = (eh5) h065.w;
                if (eh535 != null) {
                    i29 = eh535.x;
                } else {
                    i29 = 0;
                }
                int i64 = i24;
                eh5 eh536 = eh512;
                eh5 eh537 = eh531;
                if (eh536 != null) {
                    eh518 = eh533;
                    i32 = i28;
                    i31 = i63;
                    i30 = eh536.x;
                } else {
                    eh518 = eh533;
                    i32 = i28;
                    i31 = i63;
                    i30 = 0;
                }
                if (eh529 != null) {
                    h063 = h065;
                    i33 = eh529.x;
                    eh519 = eh532;
                    eh520 = eh534;
                    i34 = i29;
                    eh521 = eh530;
                    i35 = 0;
                    oh43 = oh4;
                    f2 = b2;
                    c952 = this;
                } else {
                    h063 = h065;
                    i33 = 0;
                    c952 = this;
                    eh519 = eh532;
                    eh520 = eh534;
                    i34 = i29;
                    eh521 = eh530;
                    i35 = 0;
                    oh43 = oh4;
                    f2 = b2;
                }
                int f3 = c952.f(oh43, i25, i26, i27, i32, i31, i34, i30, i33, j, f2);
                float f4 = f2;
                int i65 = f3 - i64;
                int size9 = list.size();
                int i66 = i35;
                while (i66 < size9) {
                    gh4 gh414 = (gh4) list.get(i66);
                    if (sg3.e(rc9.P(gh414), "Container")) {
                        if (i62 != Integer.MAX_VALUE) {
                            i36 = i62;
                        } else {
                            i36 = i35;
                        }
                        if (i65 != Integer.MAX_VALUE) {
                            i37 = i65;
                        } else {
                            i37 = i35;
                        }
                        int i67 = i62;
                        eh5 eh538 = eh521;
                        eh5 eh539 = eh520;
                        eh5 eh540 = eh529;
                        oh4 oh45 = oh4;
                        a95 a95 = new a95(this, f3, i67, eh538, eh537, eh519, eh518, eh539, h063, eh536, gh414.y(m31.a(i36, i62, i37, i65)), eh540, oh45, f4);
                        return oh45.d0(i67, f3, b42.w, a95);
                    }
                    int i68 = f3;
                    eh5 eh541 = eh529;
                    eh5 eh542 = eh519;
                    oh4 oh46 = oh4;
                    i66++;
                    f3 = i68;
                }
                throw b81.z("Collection contains no element matching the predicate.");
            }
            oh4 oh47 = oh4;
            long j5 = a3;
            eh5 eh543 = eh58;
            Object obj9 = obj7;
            eh5 eh544 = eh57;
            eh5 eh545 = eh53;
            i53++;
            j4 = j;
            gh49 = gh410;
            size7 = i55;
            eh57 = eh544;
            list2 = list2;
            max5 = i54;
        }
        throw b81.z("Collection contains no element matching the predicate.");
    }

    public final int c(kg3 kg3, List list, int i) {
        return i(kg3, list, i, new uz1(21));
    }

    public final int d(kg3 kg3, List list, int i) {
        return h(kg3, list, i, new uz1(24));
    }

    public final int e(kg3 kg3, List list, int i) {
        return h(kg3, list, i, new uz1(23));
    }

    public final int f(kg3 kg3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f2) {
        int y = pd8.y(new int[]{i7, i3, i4, we.F(f2, i6, 0)}, i5);
        la5 la5 = this.g;
        float e0 = kg3.e0(la5.d());
        float E = we.E(e0, Math.max(e0, ((float) i6) / 2.0f), f2);
        return m31.f(j, Math.max(i, Math.max(i2, dh4.C(E + ((float) y) + kg3.e0(la5.a())))) + i8);
    }

    public final int g(kg3 kg3, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f2) {
        int i8 = i3 + i4;
        int max = Math.max(i5 + i8, Math.max(i7 + i8, we.F(f2, i6, 0))) + i + i2;
        la5 la5 = this.g;
        ey3 ey3 = ey3.w;
        return m31.g(j, Math.max(max, dh4.C((((float) i6) + kg3.e0(la5.c(ey3) + la5.b(ey3))) * f2)));
    }

    public final int h(kg3 kg3, List list, int i, gs2 gs2) {
        Object obj;
        int i2;
        int i3;
        Object obj2;
        int i4;
        Object obj3;
        int i5;
        Object obj4;
        int i6;
        Object obj5;
        int i7;
        Object obj6;
        int i8;
        Object obj7;
        int i9;
        List list2 = list;
        int i10 = i;
        c95 c95 = this;
        gs2 gs22 = gs2;
        float b2 = c95.d.b();
        int size = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i11);
            if (sg3.e(bb0.o0((gh4) obj), "Leading")) {
                break;
            }
            i11++;
        }
        gh4 gh4 = (gh4) obj;
        if (gh4 != null) {
            i3 = bb0.y0(i10, gh4.v(Integer.MAX_VALUE));
            i2 = ((Number) gs22.H(gh4, Integer.valueOf(i10))).intValue();
        } else {
            i3 = i10;
            i2 = 0;
        }
        int size2 = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i12);
            if (sg3.e(bb0.o0((gh4) obj2), "Trailing")) {
                break;
            }
            i12++;
        }
        gh4 gh42 = (gh4) obj2;
        if (gh42 != null) {
            i3 = bb0.y0(i3, gh42.v(Integer.MAX_VALUE));
            i4 = ((Number) gs22.H(gh42, Integer.valueOf(i10))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i13);
            if (sg3.e(bb0.o0((gh4) obj3), "Label")) {
                break;
            }
            i13++;
        }
        gh4 gh43 = (gh4) obj3;
        if (gh43 != null) {
            i5 = ((Number) gs22.H(gh43, Integer.valueOf(we.F(b2, i3, i10)))).intValue();
        } else {
            i5 = 0;
        }
        int size4 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i14);
            if (sg3.e(bb0.o0((gh4) obj4), "Prefix")) {
                break;
            }
            i14++;
        }
        gh4 gh44 = (gh4) obj4;
        if (gh44 != null) {
            i6 = ((Number) gs22.H(gh44, Integer.valueOf(i3))).intValue();
            i3 = bb0.y0(i3, gh44.v(Integer.MAX_VALUE));
        } else {
            i6 = 0;
        }
        int size5 = list2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list2.get(i15);
            if (sg3.e(bb0.o0((gh4) obj5), "Suffix")) {
                break;
            }
            i15++;
        }
        gh4 gh45 = (gh4) obj5;
        if (gh45 != null) {
            i7 = ((Number) gs22.H(gh45, Integer.valueOf(i3))).intValue();
            i3 = bb0.y0(i3, gh45.v(Integer.MAX_VALUE));
        } else {
            i7 = 0;
        }
        int size6 = list2.size();
        int i16 = 0;
        while (i16 < size6) {
            Object obj8 = list2.get(i16);
            if (sg3.e(bb0.o0((gh4) obj8), "TextField")) {
                int intValue = ((Number) gs22.H(obj8, Integer.valueOf(i3))).intValue();
                int size7 = list2.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list2.get(i17);
                    if (sg3.e(bb0.o0((gh4) obj6), "Hint")) {
                        break;
                    }
                    i17++;
                    int i18 = i;
                }
                gh4 gh46 = (gh4) obj6;
                if (gh46 != null) {
                    i8 = ((Number) gs22.H(gh46, Integer.valueOf(i3))).intValue();
                } else {
                    i8 = 0;
                }
                int size8 = list2.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i19);
                    if (sg3.e(bb0.o0((gh4) obj7), "Supporting")) {
                        break;
                    }
                    i19++;
                }
                gh4 gh47 = (gh4) obj7;
                if (gh47 != null) {
                    i9 = ((Number) gs22.H(gh47, Integer.valueOf(i))).intValue();
                } else {
                    i9 = 0;
                }
                int i20 = i4;
                int i21 = i9;
                c95 c952 = c95;
                int i22 = i2;
                int i23 = i8;
                return c952.f(kg3, i22, i20, i6, i7, intValue, i5, i23, i21, m31.b(0, 0, 0, 0, 15), b2);
            }
            int i24 = i7;
            int i25 = i6;
            int i26 = i2;
            int i27 = i4;
            int i28 = i5;
            i16++;
            i7 = i24;
            c95 = this;
            i6 = i25;
            int i29 = i;
        }
        throw b81.z("Collection contains no element matching the predicate.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: gh4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: gh4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: gh4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: gh4} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final int i(kg3 kg3, List list, int i, gs2 gs2) {
        gh4 gh4;
        Object obj;
        int i2;
        Object obj2;
        int i3;
        Object obj3;
        int i4;
        Object obj4;
        int i5;
        Object obj5;
        int i6;
        int i7;
        List list2 = list;
        gs2 gs22 = gs2;
        int size = list2.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj6 = list2.get(i8);
            if (sg3.e(bb0.o0((gh4) obj6), "TextField")) {
                int intValue = ((Number) gs22.H(obj6, Integer.valueOf(i))).intValue();
                int size2 = list2.size();
                int i9 = 0;
                while (true) {
                    gh4 = null;
                    if (i9 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = list2.get(i9);
                    if (sg3.e(bb0.o0((gh4) obj), "Label")) {
                        break;
                    }
                    i9++;
                }
                gh4 gh42 = (gh4) obj;
                if (gh42 != null) {
                    i2 = ((Number) gs22.H(gh42, Integer.valueOf(i))).intValue();
                } else {
                    i2 = 0;
                }
                int size3 = list2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size3) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list2.get(i10);
                    if (sg3.e(bb0.o0((gh4) obj2), "Trailing")) {
                        break;
                    }
                    i10++;
                }
                gh4 gh43 = (gh4) obj2;
                if (gh43 != null) {
                    i3 = ((Number) gs22.H(gh43, Integer.valueOf(i))).intValue();
                } else {
                    i3 = 0;
                }
                int size4 = list2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size4) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list2.get(i11);
                    if (sg3.e(bb0.o0((gh4) obj3), "Leading")) {
                        break;
                    }
                    i11++;
                }
                gh4 gh44 = (gh4) obj3;
                if (gh44 != null) {
                    i4 = ((Number) gs22.H(gh44, Integer.valueOf(i))).intValue();
                } else {
                    i4 = 0;
                }
                int size5 = list2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list2.get(i12);
                    if (sg3.e(bb0.o0((gh4) obj4), "Prefix")) {
                        break;
                    }
                    i12++;
                }
                gh4 gh45 = (gh4) obj4;
                if (gh45 != null) {
                    i5 = ((Number) gs22.H(gh45, Integer.valueOf(i))).intValue();
                } else {
                    i5 = 0;
                }
                int size6 = list2.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size6) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list2.get(i13);
                    if (sg3.e(bb0.o0((gh4) obj5), "Suffix")) {
                        break;
                    }
                    i13++;
                }
                gh4 gh46 = (gh4) obj5;
                if (gh46 != null) {
                    i6 = ((Number) gs22.H(gh46, Integer.valueOf(i))).intValue();
                } else {
                    i6 = 0;
                }
                int size7 = list2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size7) {
                        break;
                    }
                    Object obj7 = list2.get(i14);
                    if (sg3.e(bb0.o0(obj7), "Hint")) {
                        gh4 = obj7;
                        break;
                    }
                    i14++;
                }
                gh4 gh47 = gh4;
                if (gh47 != null) {
                    i7 = ((Number) gs22.H(gh47, Integer.valueOf(i))).intValue();
                } else {
                    i7 = 0;
                }
                return g(kg3, i4, i3, i5, i6, intValue, i2, i7, m31.b(0, 0, 0, 0, 15), this.d.b());
            }
        }
        throw b81.z("Collection contains no element matching the predicate.");
    }
}
