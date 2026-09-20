package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* renamed from: nn0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nn0 implements fi2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public nn0(h06 h06, fi2 fi2, String[] strArr, int[] iArr) {
        this.w = 5;
        this.x = h06;
        this.A = fi2;
        this.y = strArr;
        this.z = iArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    public Object a(df3 df3, f61 f61) {
        bq4 bq4;
        int i;
        Iterator it;
        df3 df32;
        ji8 ji8 = (ji8) this.A;
        ji8 ji82 = (ji8) this.z;
        ji8 ji83 = (ji8) this.x;
        cq4 cq4 = (cq4) this.y;
        if (f61 instanceof bq4) {
            bq4 = (bq4) f61;
            int i2 = bq4.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bq4.E = i2 - Integer.MIN_VALUE;
                Object obj = bq4.C;
                i = bq4.E;
                vs7 vs7 = vs7.a;
                boolean z2 = true;
                if (i != 0) {
                    o85.q(obj);
                    if (df3 instanceof eo5) {
                        ji83.n(df3);
                        cq4.c(true);
                        return vs7;
                    } else if (df3 instanceof fo5) {
                        ji83.B(((fo5) df3).a);
                        if (ji83.x == null) {
                            z2 = false;
                        }
                        cq4.c(z2);
                        return vs7;
                    } else if (df3 instanceof do5) {
                        ji83.B(((do5) df3).a);
                        if (ji83.x == null) {
                            z2 = false;
                        }
                        cq4.c(z2);
                        return vs7;
                    } else if (df3 instanceof r23) {
                        ji82.n(df3);
                        cq4.b(true);
                        return vs7;
                    } else if (df3 instanceof s23) {
                        ji82.B(((s23) df3).a);
                        if (ji82.x == null) {
                            z2 = false;
                        }
                        cq4.b(z2);
                        return vs7;
                    } else if (df3 instanceof dk2) {
                        ji8.n(df3);
                        cq4.a(true);
                        return vs7;
                    } else if (df3 instanceof ek2) {
                        ji8.B(((ek2) df3).a);
                        if (ji8.x == null) {
                            z2 = false;
                        }
                        cq4.a(z2);
                        return vs7;
                    } else {
                        df3 df33 = df3;
                        it = cq4.b.x.iterator();
                        df32 = df33;
                    }
                } else if (i == 1) {
                    it = bq4.B;
                    cq4 cq42 = bq4.A;
                    df3 df34 = bq4.z;
                    o85.q(obj);
                    cq4 = cq42;
                    df32 = df34;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                while (it.hasNext()) {
                    bq4.z = df32;
                    bq4.A = cq4;
                    bq4.B = it;
                    bq4.E = 1;
                    ((b67) ((Map.Entry) it.next()).getKey()).getClass();
                    p81 p81 = p81.w;
                    if (vs7 == p81) {
                        return p81;
                    }
                }
                return vs7;
            }
        }
        bq4 = new bq4(this, f61);
        Object obj2 = bq4.C;
        i = bq4.E;
        vs7 vs72 = vs7.a;
        boolean z22 = true;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return vs72;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r1.k(r13, r3) == r4) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        if (r1.k(r13, r3) == r4) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    public Object b(int[] iArr, f61 f61) {
        wn7 wn7;
        int i;
        String[] strArr = (String[]) this.y;
        fi2 fi2 = (fi2) this.A;
        h06 h06 = (h06) this.x;
        if (f61 instanceof wn7) {
            wn7 = (wn7) f61;
            int i2 = wn7.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wn7.C = i2 - Integer.MIN_VALUE;
                Object obj = wn7.A;
                i = wn7.C;
                if (i != 0) {
                    o85.q(obj);
                    Object obj2 = h06.w;
                    p81 p81 = p81.w;
                    if (obj2 == null) {
                        Set r1 = qs.r1(strArr);
                        wn7.z = iArr;
                        wn7.C = 1;
                    } else {
                        int[] iArr2 = (int[]) this.z;
                        ArrayList arrayList = new ArrayList();
                        int length = strArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            String str = strArr[i3];
                            int i5 = i4 + 1;
                            Object obj3 = h06.w;
                            if (obj3 != null) {
                                int i6 = iArr2[i4];
                                if (((int[]) obj3)[i6] != iArr[i6]) {
                                    arrayList.add(str);
                                }
                                i3++;
                                i4 = i5;
                            } else {
                                h.s("Required value was null.");
                                return null;
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Set g1 = dt0.g1(arrayList);
                            wn7.z = iArr;
                            wn7.C = 2;
                        }
                    }
                    return p81;
                } else if (i == 1 || i == 2) {
                    iArr = wn7.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h06.w = iArr;
                return vs7.a;
            }
        }
        wn7 = new wn7(this, f61);
        Object obj4 = wn7.A;
        i = wn7.C;
        if (i != 0) {
        }
        h06.w = iArr;
        return vs7.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0123  */
    public final Object k(Object obj, f61 f61) {
        mn0 mn0;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2 = this.w;
        boolean z5 = true;
        vs7 vs7 = vs7.a;
        Object obj2 = this.A;
        Object obj3 = this.x;
        Object obj4 = this.y;
        Object obj5 = this.z;
        switch (i2) {
            case b85.b:
                h06 h06 = (h06) obj3;
                if (f61 instanceof mn0) {
                    mn0 = (mn0) f61;
                    int i3 = mn0.C;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        mn0.C = i3 - Integer.MIN_VALUE;
                        Object obj6 = mn0.A;
                        i = mn0.C;
                        if (i != 0) {
                            o85.q(obj6);
                            el3 el3 = (el3) h06.w;
                            if (el3 != null) {
                                el3.o(new CancellationException("Child of the scoped flow was cancelled"));
                                mn0.z = obj;
                                mn0.C = 1;
                                Object j0 = el3.j0(mn0);
                                p81 p81 = p81.w;
                                if (j0 == p81) {
                                    return p81;
                                }
                            }
                        } else if (i == 1) {
                            obj = mn0.z;
                            o85.q(obj6);
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h06.w = ar7.H((o81) obj4, (e81) null, r81.z, new ln0((on0) obj5, (fi2) obj2, obj, (f61) null), 1);
                        return vs7;
                    }
                }
                mn0 = new mn0(this, f61);
                Object obj62 = mn0.A;
                i = mn0.C;
                if (i != 0) {
                }
                h06.w = ar7.H((o81) obj4, (e81) null, r81.z, new ln0((on0) obj5, (fi2) obj2, obj, (f61) null), 1);
                return vs7;
            case 1:
                ze7 ze7 = (ze7) obj5;
                u44 u44 = (u44) obj3;
                if (!((Boolean) obj).booleanValue() || !u44.b()) {
                    pv8.C(u44);
                } else {
                    pv8.N((rf7) obj4, u44, ze7.n(), (c93) obj2, ze7.b);
                }
                return vs7;
            case 2:
                ((Number) obj).intValue();
                s34 s34 = (s34) obj3;
                ((vr2) obj4).y(new Long(((vh0) obj5).e(((re3) obj2).w + (s34.h() / 12), (s34.h() % 12) + 1).e));
                return vs7;
            case 3:
                df3 df3 = (df3) obj;
                f06 f06 = (f06) obj5;
                f06 f062 = (f06) obj4;
                f06 f063 = (f06) obj3;
                if (df3 instanceof eo5) {
                    f063.w++;
                } else if (df3 instanceof fo5) {
                    f063.w--;
                } else if (df3 instanceof do5) {
                    f063.w--;
                } else if (df3 instanceof r23) {
                    f062.w++;
                } else if (df3 instanceof s23) {
                    f062.w--;
                } else if (df3 instanceof dk2) {
                    f06.w++;
                } else if (df3 instanceof ek2) {
                    f06.w--;
                }
                boolean z6 = false;
                if (f063.w > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (f062.w > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (f06.w > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                il1 il1 = (il1) obj2;
                if (il1.L != z2) {
                    il1.L = z2;
                    z6 = true;
                }
                if (il1.M != z3) {
                    il1.M = z3;
                    z6 = true;
                }
                if (il1.N != z4) {
                    il1.N = z4;
                } else {
                    z5 = z6;
                }
                if (z5) {
                    rc9.e0(il1);
                }
                return vs7;
            case 4:
                return a((df3) obj, f61);
            default:
                return b((int[]) obj, f61);
        }
    }

    public /* synthetic */ nn0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
    }
}
