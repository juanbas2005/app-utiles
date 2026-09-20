package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: ge2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ge2 {
    public static final fe2 f = new Object();
    public boolean a = true;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARNING: type inference failed for: r20v0, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r20v9 */
    /* JADX WARNING: type inference failed for: r20v14 */
    /* JADX WARNING: type inference failed for: r20v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x037f A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public ge2(l69 l69, dv5 dv5) {
        Map map;
        ig igVar;
        at7 o;
        m93 m93;
        n36 n36;
        char c2;
        long j;
        ? r20;
        long j2;
        String str;
        Object obj;
        Object obj2;
        boolean z;
        boolean z2;
        Object obj3;
        l69 l692 = l69;
        int i = 1;
        e69 e69 = l692.a;
        c69 c69 = l692.b;
        if (e69.a.isEmpty()) {
            boolean equals = c69.A().equals(c69);
        }
        this.b = c69.t();
        this.c = c69.u();
        c69.getClass();
        c69.getClass();
        Object obj4 = null;
        if (c69.x() == 0) {
            map = null;
        } else {
            map = c69.y();
        }
        if (map != null) {
            Set keySet = map.keySet();
            if (!(keySet instanceof s93) || (keySet instanceof SortedSet) || ((s93) keySet).n()) {
                Object[] array = keySet.toArray();
                s93.s(array.length, array);
            }
        } else {
            Object[] objArr = o36.E;
        }
        int x = c69.x();
        e69 e692 = l692.a;
        char c3 = 3;
        if (x > 0) {
            Collection<x59> values = c69.y().values();
            if (values == null) {
                n36 = n36.D;
            } else {
                ig igVar2 = new ig(4);
                for (x59 x59 : values) {
                    int H = x59.H();
                    int i2 = H - 1;
                    if (H == 0) {
                        throw null;
                    } else if (i2 == 0) {
                        igVar2.k(x59.t(), Long.valueOf(x59.u()));
                    } else if (i2 == 1) {
                        igVar2.k(x59.t(), Boolean.valueOf(x59.v()));
                    } else if (i2 == 2) {
                        igVar2.k(x59.t(), Double.valueOf(x59.w()));
                    } else if (i2 == 3) {
                        igVar2.k(x59.t(), x59.x());
                    } else if (i2 == 4) {
                        igVar2.k(x59.t(), x59.y().v());
                    } else {
                        h.s("Could not serialize Flag for override: ".concat(String.valueOf(x59.t())));
                        throw null;
                    }
                }
                n36 = igVar2.c(false);
            }
            if (!n36.isEmpty()) {
                HashMap hashMap = new HashMap(n36);
                v93 v93 = e692.a;
                u93 u93 = new u93();
                at7 o2 = v93.iterator();
                while (true) {
                    m93 m932 = (m93) o2;
                    if (m932.hasNext()) {
                        d69 d69 = (d69) m932.next();
                        String str2 = d69.x;
                        long j3 = d69.w;
                        Object remove = hashMap.remove(str2 == null ? Long.toString(j3) : str2);
                        if (remove == null) {
                            u93.a(d69);
                        } else if (remove instanceof String) {
                            u93.a(new d69(d69.w, d69.x, 4, 0, remove));
                        } else if (remove instanceof byte[]) {
                            u93.a(new d69(d69.w, d69.x, 5, 0, remove));
                        } else if (remove instanceof Boolean) {
                            u93.a(new d69(d69.w, d69.x, ((Boolean) remove).booleanValue(), 0, (Object) null));
                        } else if (remove instanceof Long) {
                            u93.a(new d69(d69.w, d69.x, 2, ((Long) remove).longValue(), (Object) null));
                        } else if (remove instanceof Double) {
                            u93.a(new d69(d69.w, d69.x, 3, Double.doubleToRawLongBits(((Double) remove).doubleValue()), (Object) null));
                        } else {
                            String str3 = d69.x;
                            str3 = str3 == null ? Long.toString(j3) : str3;
                            String obj5 = remove.toString();
                            throw new IllegalStateException(pb4.n(new StringBuilder(String.valueOf(str3).length() + 46 + obj5.length()), "Cannot serialize override for existing flag ", str3, ": ", obj5));
                        }
                    } else {
                        for (String str4 : hashMap.keySet()) {
                            Object obj6 = hashMap.get(str4);
                            int length = str4.length();
                            if (length <= 19) {
                                if (length == 0) {
                                    obj3 = obj4;
                                    c2 = c3;
                                } else {
                                    Object obj7 = obj4;
                                    c2 = c3;
                                    long charAt = (long) (str4.charAt(0) - 48);
                                    obj = obj7;
                                    if (charAt >= 1) {
                                        obj3 = obj7;
                                        if (charAt <= 9) {
                                            int i3 = i;
                                            while (true) {
                                                if (i3 >= length) {
                                                    j2 = 0;
                                                    obj2 = obj7;
                                                    if (charAt >= 0) {
                                                        obj2 = obj7;
                                                        if (charAt <= 2305843009213693951L) {
                                                            j = charAt;
                                                            r20 = obj7;
                                                        }
                                                    }
                                                } else {
                                                    int charAt2 = str4.charAt(i3) - 48;
                                                    if (charAt2 < 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    j2 = 0;
                                                    if (charAt2 > 9) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    if (z || z2) {
                                                        obj2 = obj7;
                                                        break;
                                                    } else {
                                                        charAt = (charAt * 10) + ((long) charAt2);
                                                        i3++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j2 = 0;
                                    obj2 = obj;
                                }
                                j2 = 0;
                                j = 0;
                                r20 = obj3;
                                if (j != j2) {
                                    str = str4;
                                } else {
                                    str = r20;
                                }
                                if (!(obj6 instanceof String)) {
                                    u93.a(new d69(j, str, 4, 0, obj6));
                                } else {
                                    Object obj8 = obj6;
                                    if (obj8 instanceof byte[]) {
                                        u93.a(new d69(j, str, 5, 0, obj8));
                                    } else if (obj8 instanceof Boolean) {
                                        u93.a(new d69(j, str, ((Boolean) obj8).booleanValue(), 0, (Object) null));
                                    } else if (obj8 instanceof Long) {
                                        u93.a(new d69(j, str, 2, ((Long) obj8).longValue(), (Object) null));
                                    } else if (obj8 instanceof Double) {
                                        u93.a(new d69(j, str, 3, Double.doubleToRawLongBits(((Double) obj8).doubleValue()), (Object) null));
                                    } else {
                                        String valueOf = String.valueOf(obj8);
                                        h.s(pb4.n(new StringBuilder(str4.length() + 28 + valueOf.length()), "Cannot serialize override ", str4, ": ", valueOf));
                                        throw r20;
                                    }
                                }
                                c3 = c2;
                                obj4 = r20;
                                i = 1;
                            } else {
                                obj = obj4;
                                c2 = c3;
                                j2 = 0;
                                obj2 = obj;
                            }
                            j = j2;
                            r20 = obj2;
                            if (j != j2) {
                            }
                            if (!(obj6 instanceof String)) {
                            }
                            c3 = c2;
                            obj4 = r20;
                            i = 1;
                        }
                        char c4 = c3;
                        e692 = new e69(u93.e());
                    }
                }
                int size = ((p36) e692.a).C.size() + 3;
                ie1.z(size, "expectedSize");
                igVar = new ig(size);
                o = e692.a.iterator();
                while (true) {
                    m93 = (m93) o;
                    if (!m93.hasNext()) {
                        d69 d692 = (d69) m93.next();
                        String str5 = d692.x;
                        if (str5 == null) {
                            str5 = Long.toString(d692.w);
                        }
                        igVar.k(str5, d692.a());
                    } else {
                        igVar.k("__phenotype_server_token", c69.v());
                        igVar.k("__phenotype_snapshot_token", c69.t());
                        igVar.k("__phenotype_configuration_version", Long.valueOf(c69.w()));
                        this.d = igVar.c(false);
                        this.e = dv5;
                        return;
                    }
                }
            }
        }
        int size2 = ((p36) e692.a).C.size() + 3;
        ie1.z(size2, "expectedSize");
        igVar = new ig(size2);
        o = e692.a.iterator();
        while (true) {
            m93 = (m93) o;
            if (!m93.hasNext()) {
            }
            igVar.k(str5, d692.a());
        }
    }

    public static float a(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    public static boolean b(int[] iArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < 5) {
                int i3 = iArr[i];
                if (i3 == 0) {
                    break;
                }
                i2 += i3;
                i++;
            } else if (i2 >= 7) {
                float f2 = ((float) i2) / 7.0f;
                float f3 = f2 / 2.0f;
                if (Math.abs(f2 - ((float) iArr[0])) >= f3 || Math.abs(f2 - ((float) iArr[1])) >= f3 || Math.abs((f2 * 3.0f) - ((float) iArr[2])) >= 3.0f * f3 || Math.abs(f2 - ((float) iArr[3])) >= f3 || Math.abs(f2 - ((float) iArr[4])) >= f3) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static double f(de2 de2, de2 de22) {
        double d2 = (double) (de2.a - de22.a);
        double d3 = (double) (de2.b - de22.b);
        return (d3 * d3) + (d2 * d2);
    }

    /* JADX WARNING: type inference failed for: r17v4, types: [boolean] */
    /* JADX WARNING: type inference failed for: r17v5 */
    /* JADX WARNING: type inference failed for: r17v7 */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f9  */
    public boolean c(int i, int i2, int[] iArr) {
        char c2;
        float f2;
        ? r17;
        char c3;
        int i3;
        int i4;
        int i5;
        int[] iArr2 = iArr;
        ArrayList arrayList = (ArrayList) this.c;
        boolean z = false;
        char c4 = 3;
        char c5 = 4;
        int i6 = iArr2[0] + iArr2[1] + iArr2[2] + iArr2[3] + iArr2[4];
        int a2 = (int) a(iArr2, i2);
        int i7 = iArr2[2];
        k90 k90 = (k90) this.b;
        int i8 = k90.x;
        int i9 = k90.w;
        int[] iArr3 = (int[]) this.d;
        Arrays.fill(iArr3, 0);
        int i10 = i;
        while (i10 >= 0 && k90.b(a2, i10)) {
            iArr3[2] = iArr3[2] + 1;
            i10--;
        }
        float f3 = Float.NaN;
        if (i10 < 0) {
            c2 = 3;
        } else {
            while (true) {
                if (i10 >= 0 && !k90.b(a2, i10)) {
                    c2 = c4;
                    int i11 = iArr3[1];
                    if (i11 > i7) {
                        break;
                    }
                    iArr3[1] = i11 + 1;
                    i10--;
                    c4 = c2;
                } else {
                    c2 = c4;
                }
            }
            if (i10 >= 0 && iArr3[1] <= i7) {
                while (i10 >= 0 && k90.b(a2, i10)) {
                    int i12 = iArr3[0];
                    if (i12 > i7) {
                        break;
                    }
                    iArr3[0] = i12 + 1;
                    i10--;
                }
                if (iArr3[0] <= i7) {
                    int i13 = i + 1;
                    while (i13 < i8 && k90.b(a2, i13)) {
                        iArr3[2] = iArr3[2] + 1;
                        i13++;
                    }
                    if (i13 != i8) {
                        while (i13 < i8 && !k90.b(a2, i13)) {
                            int i14 = iArr3[c2];
                            if (i14 >= i7) {
                                break;
                            }
                            iArr3[c2] = i14 + 1;
                            i13++;
                        }
                        if (i13 != i8 && iArr3[c2] < i7) {
                            while (i13 < i8 && k90.b(a2, i13)) {
                                int i15 = iArr3[4];
                                if (i15 >= i7) {
                                    break;
                                }
                                iArr3[4] = i15 + 1;
                                i13++;
                            }
                            int i16 = iArr3[4];
                            if (i16 < i7 && Math.abs(((((iArr3[0] + iArr3[1]) + iArr3[2]) + iArr3[c2]) + i16) - i6) * 5 < i6 * 2 && b(iArr3)) {
                                f2 = a(iArr3, i13);
                                if (!Float.isNaN(f2)) {
                                    int i17 = (int) f2;
                                    int i18 = iArr2[2];
                                    Arrays.fill(iArr3, 0);
                                    int i19 = a2;
                                    while (i19 >= 0 && k90.b(i19, i17)) {
                                        iArr3[2] = iArr3[2] + 1;
                                        i19--;
                                    }
                                    if (i19 >= 0) {
                                        while (i19 >= 0 && !k90.b(i19, i17)) {
                                            int i20 = iArr3[1];
                                            if (i20 > i18) {
                                                break;
                                            }
                                            iArr3[1] = i20 + 1;
                                            i19--;
                                        }
                                        if (i19 >= 0 && iArr3[1] <= i18) {
                                            while (i19 >= 0 && k90.b(i19, i17)) {
                                                int i21 = iArr3[0];
                                                if (i21 > i18) {
                                                    break;
                                                }
                                                iArr3[0] = i21 + 1;
                                                i19--;
                                            }
                                            if (iArr3[0] <= i18) {
                                                int i22 = a2 + 1;
                                                while (i22 < i9 && k90.b(i22, i17)) {
                                                    iArr3[2] = iArr3[2] + 1;
                                                    i22++;
                                                }
                                                if (i22 != i9) {
                                                    while (i22 < i9 && !k90.b(i22, i17)) {
                                                        int i23 = iArr3[c2];
                                                        if (i23 >= i18) {
                                                            break;
                                                        }
                                                        iArr3[c2] = i23 + 1;
                                                        i22++;
                                                    }
                                                    if (i22 != i9 && iArr3[c2] < i18) {
                                                        while (i22 < i9 && k90.b(i22, i17)) {
                                                            int i24 = iArr3[4];
                                                            if (i24 >= i18) {
                                                                break;
                                                            }
                                                            iArr3[4] = i24 + 1;
                                                            i22++;
                                                        }
                                                        int i25 = iArr3[4];
                                                        if (i25 < i18 && Math.abs(((((iArr3[0] + iArr3[1]) + iArr3[2]) + iArr3[c2]) + i25) - i6) * 5 < i6 && b(iArr3)) {
                                                            f3 = a(iArr3, i22);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    float f4 = f3;
                                    if (!Float.isNaN(f4)) {
                                        int i26 = (int) f4;
                                        Arrays.fill(iArr3, 0);
                                        int i27 = 0;
                                        while (true) {
                                            if (i17 >= i27 && i26 >= i27) {
                                                boolean z2 = z;
                                                if (!k90.b(i26 - i27, i17 - i27)) {
                                                    r17 = z2;
                                                    break;
                                                }
                                                iArr3[2] = iArr3[2] + 1;
                                                i27++;
                                                z = z2;
                                            } else {
                                                r17 = z;
                                            }
                                        }
                                        r17 = z;
                                        if (iArr3[2] == 0) {
                                            return r17;
                                        }
                                        while (i17 >= i27 && i26 >= i27 && !k90.b(i26 - i27, i17 - i27)) {
                                            iArr3[1] = iArr3[1] + 1;
                                            i27++;
                                        }
                                        if (iArr3[1] == 0) {
                                            return r17;
                                        }
                                        while (i17 >= i27 && i26 >= i27 && k90.b(i26 - i27, i17 - i27)) {
                                            iArr3[r17] = iArr3[r17] + 1;
                                            i27++;
                                        }
                                        if (iArr3[r17] == 0) {
                                            return r17;
                                        }
                                        int i28 = k90.x;
                                        int i29 = 1;
                                        while (true) {
                                            int i30 = i17 + i29;
                                            c3 = c5;
                                            if (i30 < i28 && (i5 = i26 + i29) < i9 && k90.b(i5, i30)) {
                                                iArr3[2] = iArr3[2] + 1;
                                                i29++;
                                                c5 = c3;
                                            }
                                        }
                                        while (true) {
                                            int i31 = i17 + i29;
                                            if (i31 < i28 && (i4 = i26 + i29) < i9 && !k90.b(i4, i31)) {
                                                iArr3[c2] = iArr3[c2] + 1;
                                                i29++;
                                            }
                                        }
                                        if (iArr3[c2] == 0) {
                                            return r17;
                                        }
                                        while (true) {
                                            int i32 = i17 + i29;
                                            if (i32 < i28 && (i3 = i26 + i29) < i9 && k90.b(i3, i32)) {
                                                iArr3[c3] = iArr3[c3] + 1;
                                                i29++;
                                            }
                                        }
                                        if (iArr3[c3] == 0) {
                                            return r17;
                                        }
                                        int i33 = r17;
                                        int i34 = i33;
                                        while (i33 < 5) {
                                            int i35 = iArr3[i33];
                                            if (i35 == 0) {
                                                return r17;
                                            }
                                            i34 += i35;
                                            i33++;
                                        }
                                        if (i34 < 7) {
                                            return r17;
                                        }
                                        float f5 = ((float) i34) / 7.0f;
                                        float f6 = f5 / 1.333f;
                                        if (Math.abs(f5 - ((float) iArr3[r17])) >= f6 || Math.abs(f5 - ((float) iArr3[1])) >= f6 || Math.abs((f5 * 3.0f) - ((float) iArr3[2])) >= 3.0f * f6 || Math.abs(f5 - ((float) iArr3[c2])) >= f6 || Math.abs(f5 - ((float) iArr3[c3])) >= f6) {
                                            return r17;
                                        }
                                        float f7 = ((float) i6) / 7.0f;
                                        for (int i36 = r17; i36 < arrayList.size(); i36++) {
                                            de2 de2 = (de2) arrayList.get(i36);
                                            float f8 = de2.c;
                                            float f9 = de2.a;
                                            float f10 = de2.b;
                                            if (Math.abs(f2 - f10) <= f7 && Math.abs(f4 - f9) <= f7) {
                                                float abs = Math.abs(f7 - f8);
                                                if (abs <= 1.0f || abs <= f8) {
                                                    int i37 = de2.d;
                                                    int i38 = i37 + 1;
                                                    float f11 = (float) i37;
                                                    float f12 = (f9 * f11) + f4;
                                                    float f13 = (float) i38;
                                                    arrayList.set(i36, new de2(f12 / f13, ((f10 * f11) + f2) / f13, ((f11 * de2.c) + f7) / f13, i38));
                                                    return true;
                                                }
                                            }
                                        }
                                        de2 de22 = new de2(f4, f2, f7, 1);
                                        arrayList.add(de22);
                                        s66 s66 = (s66) this.e;
                                        if (s66 != null) {
                                            s66.a(de22);
                                        }
                                        return true;
                                    }
                                }
                                return false;
                            }
                        }
                    }
                }
            }
        }
        f2 = Float.NaN;
        if (!Float.isNaN(f2)) {
        }
        return false;
    }

    public boolean d() {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        Iterator it = arrayList.iterator();
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        while (it.hasNext()) {
            de2 de2 = (de2) it.next();
            if (de2.d >= 2) {
                i++;
                f3 += de2.c;
            }
        }
        if (i >= 3) {
            float f4 = f3 / ((float) size);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                f2 += Math.abs(((de2) it2.next()).c - f4);
            }
            if (f2 <= f3 * 0.05f) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        r7 = false;
     */
    public int e(kg5 kg5, je jeVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        c03 c03 = (c03) this.c;
        f03 f03 = (f03) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            hv2 p = ((rg4) this.d).p(kg5, jeVar);
            vc4 vc4 = (vc4) p.y;
            int g = vc4.g();
            int i3 = 0;
            while (true) {
                if (i3 >= g) {
                    z2 = true;
                    break;
                }
                qk5 qk5 = (qk5) vc4.h(i3);
                if (qk5.d) {
                    break;
                } else if (qk5.h) {
                    break;
                } else {
                    i3++;
                }
            }
            int g2 = vc4.g();
            for (int i4 = 0; i4 < g2; i4++) {
                qk5 qk52 = (qk5) vc4.h(i4);
                if (z2 || ub5.b(qk52)) {
                    ((uy3) this.b).A(qk52.c, (f03) this.e, qk52.i, true);
                    if (!f03.w.h()) {
                        c03.a(qk52.a, f03, ub5.b(qk52));
                        f03.clear();
                    }
                }
            }
            boolean b2 = c03.b(p, z);
            int g3 = vc4.g();
            int i5 = 0;
            while (true) {
                if (i5 >= g3) {
                    i = 0;
                    break;
                }
                qk5 qk53 = (qk5) vc4.h(i5);
                if (!l35.b(ub5.q(qk53, true), 0) && qk53.c()) {
                    i = 1;
                    break;
                }
                i5++;
            }
            int g4 = vc4.g();
            int i6 = 0;
            while (true) {
                if (i6 >= g4) {
                    i2 = 0;
                    break;
                } else if (((qk5) vc4.h(i6)).c()) {
                    i2 = 1;
                    break;
                } else {
                    i6++;
                }
            }
            boolean z3 = b2 | (i << 1) | (i2 << 2);
            this.a = false;
            return z3 ? 1 : 0;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }

    public ge2(t99 t99, dv5 dv5) {
        t99.A().equals(t99);
        this.b = t99.t();
        this.c = t99.u();
        int i = s93.y;
        Object[] objArr = o36.E;
        int y = t99.y() + 3;
        ie1.z(y, "expectedSize");
        ig igVar = new ig(y);
        for (v99 v99 : t99.x()) {
            int G = v99.G();
            int i2 = G - 1;
            if (G == 0) {
                throw null;
            } else if (i2 == 0) {
                igVar.k(v99.t(), Long.valueOf(v99.u()));
            } else if (i2 == 1) {
                igVar.k(v99.t(), Boolean.valueOf(v99.v()));
            } else if (i2 == 2) {
                igVar.k(v99.t(), Double.valueOf(v99.w()));
            } else if (i2 == 3) {
                igVar.k(v99.t(), v99.x());
            } else if (i2 == 4) {
                igVar.k(v99.t(), v99.y().v());
            }
        }
        igVar.k("__phenotype_server_token", t99.v());
        igVar.k("__phenotype_snapshot_token", t99.t());
        igVar.k("__phenotype_configuration_version", Long.valueOf(t99.w()));
        this.d = igVar.c(false);
        this.e = dv5;
    }
}
