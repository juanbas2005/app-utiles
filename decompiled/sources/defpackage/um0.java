package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: um0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class um0 extends h98 {
    public final ArrayList k;
    public int l;

    public um0(g31 g31, int i) {
        super(g31);
        g31 g312;
        Object obj;
        int i2;
        Object obj2;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        g31 g313 = this.b;
        g31 m = g313.m(i);
        while (true) {
            g31 g314 = g313;
            g313 = m;
            g312 = g314;
            if (g313 == null) {
                break;
            }
            m = g313.m(this.f);
        }
        this.b = g312;
        int i3 = this.f;
        if (i3 == 0) {
            obj = g312.d;
        } else if (i3 == 1) {
            obj = g312.e;
        } else {
            obj = null;
        }
        arrayList.add(obj);
        g31 l2 = g312.l(this.f);
        while (l2 != null) {
            int i4 = this.f;
            if (i4 == 0) {
                obj2 = l2.d;
            } else if (i4 == 1) {
                obj2 = l2.e;
            } else {
                obj2 = null;
            }
            arrayList.add(obj2);
            l2 = l2.l(this.f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h98 h98 = (h98) it.next();
            int i5 = this.f;
            if (i5 == 0) {
                h98.b.b = this;
            } else if (i5 == 1) {
                h98.b.c = this;
            }
        }
        if (this.f == 0 && ((h31) this.b.S).u0 && arrayList.size() > 1) {
            this.b = ((h98) b81.k(1, arrayList)).b;
        }
        int i6 = this.f;
        g31 g315 = this.b;
        if (i6 == 0) {
            i2 = g315.h0;
        } else {
            i2 = g315.i0;
        }
        this.l = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00dd  */
    public final void a(aq1 aq1) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        boolean z3;
        float f3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z5;
        boolean z6;
        int i23;
        eq1 eq1 = this.h;
        if (eq1.j) {
            eq1 eq12 = this.i;
            if (eq12.j) {
                g31 g31 = this.b.S;
                if (g31 instanceof h31) {
                    z = ((h31) g31).u0;
                } else {
                    z = false;
                }
                int i24 = eq12.g - eq1.g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i25 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i25 < size) {
                        if (((h98) arrayList.get(i25)).b.f0 != 8) {
                            break;
                        }
                        i25++;
                    } else {
                        i25 = -1;
                        break;
                    }
                }
                int i26 = size - 1;
                int i27 = i26;
                while (true) {
                    if (i27 >= 0) {
                        if (((h98) arrayList.get(i27)).b.f0 != 8) {
                            i = i27;
                            break;
                        }
                        i27--;
                    } else {
                        break;
                    }
                }
                int i28 = 0;
                while (true) {
                    if (i28 >= 2) {
                        z2 = z;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i29 = 0;
                    i5 = 0;
                    i20 = 0;
                    i21 = 0;
                    while (i29 < size) {
                        h98 h98 = (h98) arrayList.get(i29);
                        g31 g312 = h98.b;
                        boolean z7 = z;
                        if (g312.f0 == i2) {
                            i22 = i28;
                        } else {
                            i21++;
                            if (i29 > 0 && i29 >= i25) {
                                i5 += h98.h.f;
                            }
                            dv1 dv1 = h98.e;
                            int i30 = dv1.g;
                            i22 = i28;
                            if (h98.d != 3) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                int i31 = this.f;
                                if (i31 == 0 && !g312.d.e.j) {
                                    return;
                                }
                                if (i31 != 1 || g312.e.e.j) {
                                    z6 = z5;
                                } else {
                                    return;
                                }
                            } else {
                                z6 = z5;
                                if (h98.a == 1 && i22 == 0) {
                                    i23 = dv1.m;
                                    i20++;
                                } else if (dv1.j) {
                                    i23 = i30;
                                }
                                z6 = true;
                                if (z6) {
                                    i20++;
                                    float f4 = g312.j0[this.f];
                                    if (f4 >= 0.0f) {
                                        f += f4;
                                    }
                                } else {
                                    i5 += i23;
                                }
                                if (i29 < i26 && i29 < i) {
                                    i5 += -h98.i.f;
                                }
                            }
                            i23 = i30;
                            if (z6) {
                            }
                            i5 += -h98.i.f;
                        }
                        i29++;
                        z = z7;
                        i28 = i22;
                        i2 = 8;
                    }
                    z2 = z;
                    int i32 = i28;
                    if (i5 < i24 || i20 == 0) {
                        i3 = i20;
                        i4 = i21;
                    } else {
                        i28 = i32 + 1;
                        z = z2;
                        i2 = 8;
                    }
                }
                i3 = i20;
                i4 = i21;
                int i33 = eq1.g;
                if (z2) {
                    i33 = eq12.g;
                }
                float f5 = 0.5f;
                if (i5 > i24) {
                    if (z2) {
                        i33 += (int) ((((float) (i5 - i24)) / 2.0f) + 0.5f);
                    } else {
                        i33 -= (int) ((((float) (i5 - i24)) / 2.0f) + 0.5f);
                    }
                }
                if (i6 > 0) {
                    float f6 = (float) (i24 - i5);
                    int i34 = (int) ((f6 / ((float) i6)) + 0.5f);
                    int i35 = 0;
                    int i36 = 0;
                    while (i35 < size) {
                        float f7 = f5;
                        h98 h982 = (h98) arrayList.get(i35);
                        int i37 = i33;
                        g31 g313 = h982.b;
                        int i38 = i6;
                        dv1 dv12 = h982.e;
                        float f8 = f6;
                        int i39 = i34;
                        if (g313.f0 != 8 && h982.d == 3 && !dv12.j) {
                            if (f > 0.0f) {
                                i16 = (int) (((g313.j0[this.f] * f8) / f) + f7);
                            } else {
                                i16 = i39;
                            }
                            if (this.f == 0) {
                                i17 = g313.u;
                                i18 = g313.t;
                            } else {
                                i17 = g313.x;
                                i18 = g313.w;
                            }
                            i15 = i35;
                            if (h982.a == 1) {
                                i19 = Math.min(i16, dv12.m);
                            } else {
                                i19 = i16;
                            }
                            int max = Math.max(i18, i19);
                            if (i17 > 0) {
                                max = Math.min(i17, max);
                            }
                            if (max != i16) {
                                i36++;
                                i16 = max;
                            }
                            dv12.d(i16);
                        } else {
                            i15 = i35;
                        }
                        i35 = i15 + 1;
                        i33 = i37;
                        f5 = f7;
                        i6 = i38;
                        f6 = f8;
                        i34 = i39;
                    }
                    i7 = i33;
                    f2 = f5;
                    int i40 = i6;
                    if (i36 > 0) {
                        i6 = i40 - i36;
                        i5 = 0;
                        for (int i41 = 0; i41 < size; i41++) {
                            h98 h983 = (h98) arrayList.get(i41);
                            if (h983.b.f0 != 8) {
                                if (i41 > 0 && i41 >= i25) {
                                    i5 += h983.h.f;
                                }
                                i5 += h983.e.g;
                                if (i41 < i26 && i41 < i) {
                                    i5 += -h983.i.f;
                                }
                            }
                        }
                    } else {
                        i6 = i40;
                    }
                    i8 = 2;
                    if (this.l == 2 && i36 == 0) {
                        z3 = false;
                        this.l = 0;
                    } else {
                        z3 = false;
                    }
                } else {
                    i7 = i33;
                    f2 = 0.5f;
                    int i42 = i6;
                    z3 = false;
                    i8 = 2;
                }
                if (i5 > i24) {
                    this.l = i8;
                }
                if (i4 > 0 && i6 == 0 && i25 == i) {
                    this.l = i8;
                }
                int i43 = this.l;
                if (i43 == 1) {
                    if (i4 > 1) {
                        z4 = (i24 - i5) / (i4 - 1);
                    } else if (i4 == 1) {
                        z4 = (i24 - i5) / 2;
                    } else {
                        z4 = z3;
                    }
                    if (i6 > 0) {
                        z4 = z3;
                    }
                    int i44 = i7;
                    for (int i45 = z3; i45 < size; i45++) {
                        if (z2) {
                            i14 = size - (i45 + 1);
                        } else {
                            i14 = i45;
                        }
                        h98 h984 = (h98) arrayList.get(i14);
                        g31 g314 = h984.b;
                        eq1 eq13 = h984.i;
                        eq1 eq14 = h984.h;
                        if (g314.f0 == 8) {
                            eq14.d(i44);
                            eq13.d(i44);
                        } else {
                            if (i45 > 0) {
                                if (z2) {
                                    i44 -= z4;
                                } else {
                                    i44 += (int) z4;
                                }
                            }
                            if (i45 > 0 && i45 >= i25) {
                                if (z2) {
                                    i44 -= eq14.f;
                                } else {
                                    i44 += eq14.f;
                                }
                            }
                            if (z2) {
                                eq13.d(i44);
                            } else {
                                eq14.d(i44);
                            }
                            dv1 dv13 = h984.e;
                            int i46 = dv13.g;
                            if (h984.d == 3 && h984.a == 1) {
                                i46 = dv13.m;
                            }
                            if (z2) {
                                i44 -= i46;
                            } else {
                                i44 += i46;
                            }
                            if (z2) {
                                eq14.d(i44);
                            } else {
                                eq13.d(i44);
                            }
                            h984.g = true;
                            if (i45 < i26 && i45 < i) {
                                if (z2) {
                                    i44 -= -eq13.f;
                                } else {
                                    i44 += -eq13.f;
                                }
                            }
                        }
                    }
                } else if (i43 == 0) {
                    int i47 = (i24 - i5) / (i4 + 1);
                    if (i6 > 0) {
                        i47 = z3;
                    }
                    int i48 = i7;
                    for (int i49 = z3; i49 < size; i49++) {
                        if (z2) {
                            i12 = size - (i49 + 1);
                        } else {
                            i12 = i49;
                        }
                        h98 h985 = (h98) arrayList.get(i12);
                        g31 g315 = h985.b;
                        eq1 eq15 = h985.i;
                        eq1 eq16 = h985.h;
                        if (g315.f0 == 8) {
                            eq16.d(i48);
                            eq15.d(i48);
                        } else {
                            if (z2) {
                                i13 = i48 - i47;
                            } else {
                                i13 = i48 + i47;
                            }
                            if (i49 > 0 && i49 >= i25) {
                                if (z2) {
                                    i13 -= eq16.f;
                                } else {
                                    i13 += eq16.f;
                                }
                            }
                            if (z2) {
                                eq15.d(i13);
                            } else {
                                eq16.d(i13);
                            }
                            dv1 dv14 = h985.e;
                            int i50 = dv14.g;
                            if (h985.d == 3 && h985.a == 1) {
                                i50 = Math.min(i50, dv14.m);
                            }
                            if (z2) {
                                i48 = i13 - i50;
                            } else {
                                i48 = i13 + i50;
                            }
                            if (z2) {
                                eq16.d(i48);
                            } else {
                                eq15.d(i48);
                            }
                            if (i49 < i26 && i49 < i) {
                                if (z2) {
                                    i48 -= -eq15.f;
                                } else {
                                    i48 += -eq15.f;
                                }
                            }
                        }
                    }
                } else if (i43 == 2) {
                    int i51 = this.f;
                    g31 g316 = this.b;
                    if (i51 == 0) {
                        f3 = g316.c0;
                    } else {
                        f3 = g316.d0;
                    }
                    if (z2) {
                        f3 = 1.0f - f3;
                    }
                    int i52 = (int) ((((float) (i24 - i5)) * f3) + f2);
                    if (i52 < 0 || i6 > 0) {
                        i52 = z3;
                    }
                    if (z2) {
                        i9 = i7 - i52;
                    } else {
                        i9 = i7 + i52;
                    }
                    for (int i53 = z3; i53 < size; i53++) {
                        if (z2) {
                            i10 = size - (i53 + 1);
                        } else {
                            i10 = i53;
                        }
                        h98 h986 = (h98) arrayList.get(i10);
                        g31 g317 = h986.b;
                        eq1 eq17 = h986.i;
                        eq1 eq18 = h986.h;
                        if (g317.f0 == 8) {
                            eq18.d(i9);
                            eq17.d(i9);
                        } else {
                            if (i53 > 0 && i53 >= i25) {
                                if (z2) {
                                    i9 -= eq18.f;
                                } else {
                                    i9 += eq18.f;
                                }
                            }
                            if (z2) {
                                eq17.d(i9);
                            } else {
                                eq18.d(i9);
                            }
                            dv1 dv15 = h986.e;
                            int i54 = dv15.g;
                            if (h986.d == 3) {
                                if (h986.a == 1) {
                                    i54 = dv15.m;
                                }
                            }
                            if (z2) {
                                i11 = i9 - i54;
                            } else {
                                i11 = i9 + i54;
                            }
                            if (z2) {
                                eq18.d(i9);
                            } else {
                                eq17.d(i9);
                            }
                            if (i53 < i26 && i53 < i) {
                                if (z2) {
                                    i9 -= -eq17.f;
                                } else {
                                    i9 += -eq17.f;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((h98) it.next()).d();
        }
        int size = arrayList.size();
        if (size >= 1) {
            g31 g31 = ((h98) arrayList.get(0)).b;
            g31 g312 = ((h98) arrayList.get(size - 1)).b;
            int i = this.f;
            eq1 eq1 = this.i;
            eq1 eq12 = this.h;
            if (i == 0) {
                h21 h21 = g31.H;
                h21 h212 = g312.J;
                eq1 i2 = h98.i(h21, 0);
                int e = h21.e();
                g31 m = m();
                if (m != null) {
                    e = m.H.e();
                }
                if (i2 != null) {
                    h98.b(eq12, i2, e);
                }
                eq1 i3 = h98.i(h212, 0);
                int e2 = h212.e();
                g31 n = n();
                if (n != null) {
                    e2 = n.J.e();
                }
                if (i3 != null) {
                    h98.b(eq1, i3, -e2);
                }
            } else {
                h21 h213 = g31.I;
                h21 h214 = g312.K;
                eq1 i4 = h98.i(h213, 1);
                int e3 = h213.e();
                g31 m2 = m();
                if (m2 != null) {
                    e3 = m2.I.e();
                }
                if (i4 != null) {
                    h98.b(eq12, i4, e3);
                }
                eq1 i5 = h98.i(h214, 1);
                int e4 = h214.e();
                g31 n2 = n();
                if (n2 != null) {
                    e4 = n2.K.e();
                }
                if (i5 != null) {
                    h98.b(eq1, i5, -e4);
                }
            }
            eq12.a = this;
            eq1.a = this;
        }
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i < arrayList.size()) {
                ((h98) arrayList.get(i)).e();
                i++;
            } else {
                return;
            }
        }
    }

    public final void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((h98) it.next()).f();
        }
    }

    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            h98 h98 = (h98) arrayList.get(i);
            j = ((long) h98.i.f) + h98.j() + j + ((long) h98.h.f);
        }
        return j;
    }

    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((h98) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final g31 m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            g31 g31 = ((h98) arrayList.get(i)).b;
            if (g31.f0 != 8) {
                return g31;
            }
            i++;
        }
    }

    public final g31 n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g31 g31 = ((h98) arrayList.get(size)).b;
            if (g31.f0 != 8) {
                return g31;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append((h98) it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
