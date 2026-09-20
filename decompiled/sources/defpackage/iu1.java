package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: iu1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class iu1 implements gs2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ ds2 E;
    public final /* synthetic */ int w;
    public final /* synthetic */ ds2 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ iu1(aa8 aa8, gs2 gs2, gs2 gs22, gs2 gs23, int i, gs2 gs24, uf6 uf6, fw0 fw0) {
        this.w = 2;
        this.z = aa8;
        this.A = gs2;
        this.B = gs22;
        this.C = gs23;
        this.y = i;
        this.x = gs24;
        this.D = uf6;
        this.E = fw0;
    }

    public final Object H(Object obj, Object obj2) {
        ArrayList arrayList;
        Object obj3;
        int i;
        Object obj4;
        int i2;
        int i3;
        Object obj5;
        int i4;
        dv5 dv5;
        Object obj6;
        Integer num;
        Integer num2;
        int i5;
        float f;
        float f2;
        int i6;
        int i7;
        int i8;
        Object obj7;
        Object obj8;
        int i9;
        int r0;
        int i10 = this.w;
        vs7 vs7 = vs7.a;
        int i11 = this.y;
        Object obj9 = this.D;
        ds2 ds2 = this.E;
        Object obj10 = this.z;
        Object obj11 = this.C;
        ds2 ds22 = this.x;
        Object obj12 = this.B;
        Object obj13 = this.A;
        switch (i10) {
            case b85.b:
                ((Integer) obj2).getClass();
                mp7.o((String) obj10, (String) obj13, (String) obj12, (ru4) obj11, (vr2) ds22, (sr2) obj9, (sr2) ds2, (yt2) obj, b85.v(i11 | 1));
                return vs7;
            case 1:
                ((Integer) obj2).getClass();
                bw4 bw4 = (bw4) obj13;
                rj1.i((ig6) obj10, bw4, (ml4) obj12, (jb) obj11, (vr2) ds22, (vr2) obj9, (gs2) ds2, (yt2) obj, b85.v(i11 | 1));
                return vs7;
            case 2:
                aa8 aa8 = (aa8) obj10;
                gs2 gs2 = (gs2) obj12;
                gs2 gs22 = (gs2) obj11;
                gs2 gs23 = (gs2) ds22;
                uf6 uf6 = (uf6) obj9;
                fw0 fw0 = (fw0) ds2;
                q67 q67 = (q67) obj;
                k31 k31 = (k31) obj2;
                int h = k31.h(k31.a);
                int g = k31.g(k31.a);
                long a = k31.a(k31.a, 0, 0, 0, 0, 10);
                int d = aa8.d(q67, q67.getLayoutDirection());
                int b = aa8.b(q67, q67.getLayoutDirection());
                int c = aa8.c(q67);
                List x2 = q67.x((gs2) obj13, vf6.w);
                ArrayList arrayList2 = new ArrayList(x2.size());
                int size = x2.size();
                int i12 = b;
                int i13 = 0;
                while (i13 < size) {
                    arrayList2.add(((gh4) x2.get(i13)).y(a));
                    i13++;
                    x2 = x2;
                }
                if (arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                    obj3 = null;
                } else {
                    obj3 = arrayList2.get(0);
                    int i14 = ((eh5) obj3).x;
                    int size2 = arrayList2.size() - 1;
                    int i15 = i14;
                    if (1 <= size2) {
                        int i16 = i15;
                        Object obj14 = obj3;
                        int i17 = 1;
                        while (true) {
                            Object obj15 = arrayList2.get(i17);
                            arrayList = arrayList2;
                            int i18 = ((eh5) obj15).x;
                            if (i16 < i18) {
                                i16 = i18;
                                obj14 = obj15;
                            }
                            if (i17 != size2) {
                                i17++;
                                arrayList2 = arrayList;
                            } else {
                                obj3 = obj14;
                            }
                        }
                    } else {
                        arrayList = arrayList2;
                    }
                }
                eh5 eh5 = (eh5) obj3;
                if (eh5 != null) {
                    i = eh5.x;
                } else {
                    i = 0;
                }
                List x3 = q67.x(gs2, vf6.y);
                ArrayList arrayList3 = new ArrayList(x3.size());
                int size3 = x3.size();
                int i19 = 0;
                while (i19 < size3) {
                    arrayList3.add(((gh4) x3.get(i19)).y(m31.i((-d) - i12, -c, a)));
                    i19++;
                    size3 = size3;
                    x3 = x3;
                    uf6 = uf6;
                    fw0 = fw0;
                }
                uf6 uf62 = uf6;
                fw0 fw02 = fw0;
                if (arrayList3.isEmpty()) {
                    obj4 = null;
                } else {
                    obj4 = arrayList3.get(0);
                    int i20 = ((eh5) obj4).x;
                    int size4 = arrayList3.size() - 1;
                    if (1 <= size4) {
                        int i21 = 1;
                        while (true) {
                            Object obj16 = arrayList3.get(i21);
                            Object obj17 = obj4;
                            int i22 = ((eh5) obj16).x;
                            if (i20 < i22) {
                                i20 = i22;
                                obj4 = obj16;
                            } else {
                                obj4 = obj17;
                            }
                            if (i21 != size4) {
                                i21++;
                            }
                        }
                    }
                }
                eh5 eh52 = (eh5) obj4;
                if (eh52 != null) {
                    i2 = eh52.x;
                } else {
                    i2 = 0;
                }
                if (arrayList3.isEmpty()) {
                    i3 = i2;
                    obj5 = null;
                } else {
                    obj5 = arrayList3.get(0);
                    int i23 = ((eh5) obj5).w;
                    int size5 = arrayList3.size() - 1;
                    if (1 <= size5) {
                        int i24 = 1;
                        while (true) {
                            Object obj18 = arrayList3.get(i24);
                            i3 = i2;
                            int i25 = ((eh5) obj18).w;
                            if (i23 < i25) {
                                i23 = i25;
                                obj5 = obj18;
                            }
                            if (i24 != size5) {
                                i24++;
                                i2 = i3;
                            }
                        }
                    } else {
                        i3 = i2;
                    }
                }
                eh5 eh53 = (eh5) obj5;
                if (eh53 != null) {
                    i4 = eh53.w;
                } else {
                    i4 = 0;
                }
                List x4 = q67.x(gs22, vf6.z);
                ArrayList arrayList4 = new ArrayList(x4.size());
                int size6 = x4.size();
                int i26 = 0;
                while (i26 < size6) {
                    int i27 = d;
                    List list = x4;
                    eh5 y2 = ((gh4) x4.get(i26)).y(m31.i((-d) - i12, -c, a));
                    if (y2.x == 0 || y2.w == 0) {
                        y2 = null;
                    }
                    if (y2 != null) {
                        arrayList4.add(y2);
                    }
                    i26++;
                    d = i27;
                    x4 = list;
                }
                int i28 = d;
                if (!arrayList4.isEmpty()) {
                    if (arrayList4.isEmpty()) {
                        obj7 = null;
                    } else {
                        obj7 = arrayList4.get(0);
                        int i29 = ((eh5) obj7).w;
                        int size7 = arrayList4.size() - 1;
                        if (1 <= size7) {
                            int i30 = 1;
                            while (true) {
                                Object obj19 = arrayList4.get(i30);
                                int i31 = ((eh5) obj19).w;
                                if (i29 < i31) {
                                    i29 = i31;
                                    obj7 = obj19;
                                }
                                if (i30 != size7) {
                                    i30++;
                                }
                            }
                        }
                    }
                    obj7.getClass();
                    int i32 = ((eh5) obj7).w;
                    if (arrayList4.isEmpty()) {
                        obj8 = null;
                    } else {
                        obj8 = arrayList4.get(0);
                        int i33 = ((eh5) obj8).x;
                        int size8 = arrayList4.size() - 1;
                        if (1 <= size8) {
                            int i34 = 1;
                            while (true) {
                                Object obj20 = arrayList4.get(i34);
                                int i35 = ((eh5) obj20).x;
                                if (i33 < i35) {
                                    i33 = i35;
                                    obj8 = obj20;
                                }
                                if (i34 != size8) {
                                    i34++;
                                }
                            }
                        }
                    }
                    obj8.getClass();
                    int i36 = ((eh5) obj8).x;
                    ey3 ey3 = ey3.w;
                    if (i11 == 0) {
                        if (q67.getLayoutDirection() == ey3) {
                            r0 = q67.r0(16.0f);
                        } else {
                            i9 = ((h - q67.r0(16.0f)) - i32) - i12;
                            dv5 = new dv5(i9, i36, 4);
                        }
                    } else if (i11 != 2 && i11 != 3) {
                        i9 = (((h - i32) + i28) - i12) / 2;
                        dv5 = new dv5(i9, i36, 4);
                    } else if (q67.getLayoutDirection() == ey3) {
                        i9 = ((h - q67.r0(16.0f)) - i32) - i12;
                        dv5 = new dv5(i9, i36, 4);
                    } else {
                        r0 = q67.r0(16.0f);
                    }
                    i9 = r0 + i28;
                    dv5 = new dv5(i9, i36, 4);
                } else {
                    dv5 = null;
                }
                List x5 = q67.x(gs23, vf6.A);
                ArrayList arrayList5 = new ArrayList(x5.size());
                int size9 = x5.size();
                for (int i37 = 0; i37 < size9; i37++) {
                    arrayList5.add(((gh4) x5.get(i37)).y(a));
                }
                if (arrayList5.isEmpty()) {
                    obj6 = null;
                } else {
                    obj6 = arrayList5.get(0);
                    int i38 = ((eh5) obj6).x;
                    int size10 = arrayList5.size() - 1;
                    if (1 <= size10) {
                        int i39 = 1;
                        while (true) {
                            Object obj21 = arrayList5.get(i39);
                            int i40 = ((eh5) obj21).x;
                            if (i38 < i40) {
                                i38 = i40;
                                obj6 = obj21;
                            }
                            if (i39 != size10) {
                                i39++;
                            }
                        }
                    }
                }
                eh5 eh54 = (eh5) obj6;
                if (eh54 != null) {
                    num = Integer.valueOf(eh54.x);
                } else {
                    num = null;
                }
                if (dv5 != null) {
                    int i41 = dv5.c;
                    if (num == null || i11 == 3) {
                        i7 = q67.r0(16.0f) + i41;
                        i8 = aa8.c(q67);
                    } else {
                        i7 = num.intValue() + i41;
                        i8 = q67.r0(16.0f);
                    }
                    num2 = Integer.valueOf(i8 + i7);
                } else {
                    num2 = null;
                }
                if (i3 != 0) {
                    if (num2 != null) {
                        i6 = num2.intValue();
                    } else if (num != null) {
                        i6 = num.intValue();
                    } else {
                        i6 = aa8.c(q67);
                    }
                    i5 = i3 + i6;
                } else {
                    i5 = 0;
                }
                id3 id3 = new id3(aa8, q67);
                if (arrayList.isEmpty()) {
                    f = id3.d();
                } else {
                    f = q67.P(i);
                }
                if (num != null) {
                    f2 = q67.P(num.intValue());
                } else {
                    f2 = id3.a();
                }
                pa5 pa5 = new pa5(x91.l(id3, q67.getLayoutDirection()), f, x91.k(id3, q67.getLayoutDirection()), f2);
                uf6 uf63 = uf62;
                uf63.a.setValue(pa5);
                List x6 = q67.x(new fw0(-278021671, new dx4(12, fw02, uf63), true), vf6.x);
                ArrayList arrayList6 = new ArrayList(x6.size());
                int size11 = x6.size();
                for (int i42 = 0; i42 < size11; i42++) {
                    arrayList6.add(((gh4) x6.get(i42)).y(a));
                }
                q67 q672 = q67;
                return q672.d0(h, g, b42.w, new tf6(arrayList, arrayList6, arrayList3, dv5, arrayList5, h, i4, aa8, q672, g, i5, arrayList4, num2, num));
            default:
                ((Integer) obj2).intValue();
                dw6.g((List) obj13, (List) obj12, (vr2) ds22, (vr2) obj11, (String) obj10, (vr2) ds2, (sr2) obj9, (yt2) obj, b85.v(i11 | 1));
                return vs7;
        }
    }

    public /* synthetic */ iu1(Object obj, Object obj2, Object obj3, Object obj4, vr2 vr2, ds2 ds2, ds2 ds22, int i, int i2) {
        this.w = i2;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
        this.C = obj4;
        this.x = vr2;
        this.D = ds2;
        this.E = ds22;
        this.y = i;
    }

    public /* synthetic */ iu1(List list, List list2, vr2 vr2, vr2 vr22, String str, vr2 vr23, sr2 sr2, int i) {
        this.w = 3;
        this.A = list;
        this.B = list2;
        this.x = vr2;
        this.C = vr22;
        this.z = str;
        this.E = vr23;
        this.D = sr2;
        this.y = i;
    }
}
