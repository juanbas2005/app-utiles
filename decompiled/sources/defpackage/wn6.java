package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.MissingFieldException;

/* renamed from: wn6  reason: default package */
public abstract class wn6 {
    public static x83 a = null;
    public static final float b = 0.38f;
    public static x83 c;

    public static final void a(Object obj, String str, ml4 ml4, vb5 vb5, vb5 vb52, yt2 yt2) {
        vr2 vr2;
        yt2.f0(1693837359);
        i80 i80 = xb4.C;
        jx5 H = fd1.H(ga4.a, yt2);
        yt2.f0(-1481548872);
        st stVar = new st(obj, d62.a, H);
        qx5 qx5 = k18.b;
        if (vb5 == null && vb52 == null) {
            vr2 = qt.P;
        } else {
            vr2 = new k77(18, (Object) vb5, (Object) vb52);
        }
        st stVar2 = stVar;
        vr2 vr22 = vr2;
        rj1.b(stVar2, str, ml4, vr22, (vr2) null, i80, i51.b, yt2, 0, 0);
        yt2.r(false);
        yt2.r(false);
    }

    public static final void b(Object obj, ml4 ml4, j51 j51, yt2 yt2, int i) {
        yt2.f0(1451072229);
        i80 i80 = xb4.C;
        jx5 H = fd1.H(ga4.a, yt2);
        int i2 = i << 3;
        yt2.f0(2032051394);
        int i3 = (i & 112) | 520 | (i2 & 7168) | (i2 & 57344) | (i2 & 458752) | (i2 & 3670016) | (i2 & 29360128) | (i2 & 234881024) | (i2 & 1879048192);
        st stVar = new st(obj, d62.a, H);
        int i4 = i3 >> 3;
        ml4 ml42 = ml4;
        yt2 yt22 = yt2;
        rj1.b(stVar, (String) null, ml42, qt.P, (vr2) null, i80, j51, yt22, (i3 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | ((((i >> 27) & 14) << 27) & 1879048192), 0);
        yt22.r(false);
        yt22.r(false);
    }

    public static final fu6 c(vw3 vw3) {
        fu6 fu6;
        vw3.getClass();
        du7 n0 = vw3.n0();
        if (n0 instanceof fu6) {
            fu6 = (fu6) n0;
        } else {
            fu6 = null;
        }
        if (fu6 != null) {
            return fu6;
        }
        ta1.l("This is should be simple type: ", vw3);
        return null;
    }

    public static sn6 d(sn6 sn6) {
        ze4 ze4 = sn6.w;
        ze4.b();
        if (ze4.E > 0) {
            return sn6;
        }
        return sn6.x;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0083, code lost:
        if ((r0[r5] & 192) == 128) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e0, code lost:
        if ((r0[r5] & 192) == 128) goto L_0x00b6;
     */
    public static final String e(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte[] bArr2 = bArr;
        int i8 = i;
        int i9 = i2;
        if (i8 < 0 || i9 > bArr2.length || i8 > i9) {
            throw new IndexOutOfBoundsException("size=" + bArr2.length + " beginIndex=" + i8 + " endIndex=" + i9);
        }
        char[] cArr = new char[(i9 - i8)];
        int i10 = 0;
        while (i8 < i9) {
            byte b2 = bArr2[i8];
            if (b2 >= 0) {
                int i11 = i10 + 1;
                cArr[i10] = (char) b2;
                i8++;
                while (i8 < i9) {
                    byte b3 = bArr2[i8];
                    if (b3 < 0) {
                        break;
                    }
                    i8++;
                    cArr[i11] = (char) b3;
                    i11++;
                }
                i10 = i11;
            } else {
                if ((b2 >> 5) == -2) {
                    int i12 = i8 + 1;
                    if (i9 <= i12) {
                        i5 = i10 + 1;
                        cArr[i10] = 65533;
                    } else {
                        byte b4 = bArr2[i12];
                        if ((b4 & 192) == 128) {
                            byte b5 = (b2 << 6) ^ (b4 ^ 3968);
                            if (b5 < 128) {
                                i5 = i10 + 1;
                                cArr[i10] = 65533;
                            } else {
                                cArr[i10] = (char) b5;
                                i5 = i10 + 1;
                            }
                            i6 = 2;
                            i4 = i8 + i6;
                            i10 = i3;
                        } else {
                            i5 = i10 + 1;
                            cArr[i10] = 65533;
                        }
                    }
                } else {
                    if ((b2 >> 4) == -2) {
                        int i13 = i8 + 2;
                        if (i9 <= i13) {
                            i5 = i10 + 1;
                            cArr[i10] = 65533;
                            int i14 = i8 + 1;
                            if (i9 > i14) {
                            }
                        } else {
                            byte b6 = bArr2[i8 + 1];
                            if ((b6 & 192) == 128) {
                                byte b7 = bArr2[i13];
                                if ((b7 & 192) == 128) {
                                    byte b8 = (b2 << 12) ^ ((b7 ^ -123008) ^ (b6 << 6));
                                    if (b8 < 2048) {
                                        i5 = i10 + 1;
                                        cArr[i10] = 65533;
                                    } else if (55296 > b8 || b8 >= 57344) {
                                        cArr[i10] = (char) b8;
                                        i5 = i10 + 1;
                                    } else {
                                        i5 = i10 + 1;
                                        cArr[i10] = 65533;
                                    }
                                } else {
                                    i5 = i10 + 1;
                                    cArr[i10] = 65533;
                                    i6 = 2;
                                    i4 = i8 + i6;
                                    i10 = i3;
                                }
                            } else {
                                i5 = i10 + 1;
                                cArr[i10] = 65533;
                            }
                        }
                    } else if ((b2 >> 3) == -2) {
                        int i15 = i8 + 3;
                        if (i9 <= i15) {
                            i5 = i10 + 1;
                            cArr[i10] = 65533;
                            int i16 = i8 + 1;
                            if (i9 > i16 && (bArr2[i16] & 192) == 128) {
                                int i17 = i8 + 2;
                                if (i9 > i17) {
                                }
                                i6 = 2;
                                i4 = i8 + i6;
                                i10 = i3;
                            }
                        } else {
                            byte b9 = bArr2[i8 + 1];
                            if ((b9 & 192) == 128) {
                                byte b10 = bArr2[i8 + 2];
                                if ((b10 & 192) == 128) {
                                    byte b11 = bArr2[i15];
                                    if ((b11 & 192) == 128) {
                                        byte b12 = (b2 << 18) ^ (((b11 ^ 3678080) ^ (b10 << 6)) ^ (b9 << 12));
                                        if (b12 > 1114111) {
                                            i3 = i10 + 1;
                                            cArr[i10] = 65533;
                                        } else if (55296 <= b12 && b12 < 57344) {
                                            i3 = i10 + 1;
                                            cArr[i10] = 65533;
                                        } else if (b12 < 65536) {
                                            i3 = i10 + 1;
                                            cArr[i10] = 65533;
                                        } else {
                                            if (b12 != 65533) {
                                                cArr[i10] = (char) ((b12 >>> 10) + 55232);
                                                i7 = i10 + 2;
                                                cArr[i10 + 1] = (char) ((b12 & 1023) + 56320);
                                            } else {
                                                cArr[i10] = 65533;
                                                i7 = i10 + 1;
                                            }
                                            i3 = i7;
                                        }
                                        i6 = 4;
                                        i4 = i8 + i6;
                                        i10 = i3;
                                    } else {
                                        i5 = i10 + 1;
                                        cArr[i10] = 65533;
                                    }
                                } else {
                                    i5 = i10 + 1;
                                    cArr[i10] = 65533;
                                    i6 = 2;
                                    i4 = i8 + i6;
                                    i10 = i3;
                                }
                            } else {
                                i5 = i10 + 1;
                                cArr[i10] = 65533;
                            }
                        }
                    } else {
                        i3 = i10 + 1;
                        cArr[i10] = 65533;
                        i4 = i8 + 1;
                        i10 = i3;
                    }
                    i6 = 3;
                    i4 = i8 + i6;
                    i10 = i3;
                }
                i6 = 1;
                i4 = i8 + i6;
                i10 = i3;
            }
        }
        return k57.j0(cArr, 0, i10);
    }

    public static final ArrayList f(ArrayList arrayList, List list, xs2 xs2) {
        vw3 vw3;
        list.getClass();
        arrayList.size();
        list.size();
        ArrayList i1 = dt0.i1(arrayList, list);
        ArrayList arrayList2 = new ArrayList(et0.e0(i1, 10));
        Iterator it = i1.iterator();
        while (it.hasNext()) {
            yb5 yb5 = (yb5) it.next();
            vw3 vw32 = (vw3) yb5.w;
            h28 h28 = (h28) yb5.x;
            int i = h28.B;
            rm annotations = h28.getAnnotations();
            uq4 name = h28.getName();
            name.getClass();
            boolean g1 = h28.g1();
            boolean z = h28.D;
            boolean z2 = h28.E;
            if (h28.F != null) {
                int i2 = ts1.a;
                sl4 c2 = rs1.c(xs2);
                c2.getClass();
                vw3 = c2.g().f(vw32);
            } else {
                vw3 = null;
            }
            vw3 vw33 = vw3;
            sy6 e = h28.e();
            e.getClass();
            arrayList2.add(new h28(xs2, (h28) null, i, annotations, name, vw32, g1, z, z2, vw33, e));
        }
        return arrayList2;
    }

    public static final long g() {
        return Thread.currentThread().getId();
    }

    public static final ph4 h(j24 j24, int i, long j, bb5 bb5, long j2, h80 h80, ey3 ey3, int i2, yo4 yo4) {
        ArrayList arrayList;
        yo4 yo42 = yo4;
        Object b2 = bb5.b(i);
        List list = (List) yo42.b(i);
        if (list != null) {
            arrayList = list;
        } else {
            List a2 = j24.a(i);
            int size = a2.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.add(((gh4) a2.get(i3)).y(j));
            }
            yo42.i(i, arrayList2);
            arrayList = arrayList2;
        }
        return new ph4(i, i2, arrayList, j2, b2, h80, ey3);
    }

    public static final Constructor i(zq3 zq3) {
        Member member;
        dj0 n;
        zq3.getClass();
        p16 a2 = g18.a(zq3);
        if (a2 == null || (n = a2.n()) == null) {
            member = null;
        } else {
            member = n.b();
        }
        if (member instanceof Constructor) {
            return (Constructor) member;
        }
        return null;
    }

    public static final Field j(yr3 yr3) {
        yr3.getClass();
        u16 c2 = g18.c(yr3);
        if (c2 != null) {
            return c2.t();
        }
        return null;
    }

    public static final Method k(zq3 zq3) {
        Member member;
        dj0 n;
        zq3.getClass();
        p16 a2 = g18.a(zq3);
        if (a2 == null || (n = a2.n()) == null) {
            member = null;
        } else {
            member = n.b();
        }
        if (member instanceof Method) {
            return (Method) member;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [ji4] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static final o14 l(ql4 ql4) {
        o14 o14;
        ql4 ql42;
        vq0 u;
        ql4.getClass();
        int i = ts1.a;
        Iterator it = ql4.g0().L().e().iterator();
        while (true) {
            o14 = null;
            if (!it.hasNext()) {
                ql42 = null;
                break;
            }
            vw3 vw3 = (vw3) it.next();
            if (!fv3.y(vw3)) {
                u = vw3.L().u();
                if (rs1.l(u, iq0.w) || rs1.l(u, iq0.y)) {
                    u.getClass();
                    ql42 = (ql4) u;
                }
            }
        }
        u.getClass();
        ql42 = (ql4) u;
        if (ql42 == null) {
            return null;
        }
        ? L = ql42.L();
        if (L instanceof o14) {
            o14 = L;
        }
        if (o14 == null) {
            return l(ql42);
        }
        return o14;
    }

    public static final int m(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else if (i3 >= 0) {
            h.q("Step is zero.");
            return 0;
        } else if (i > i2) {
            int i7 = -i3;
            int i8 = i % i7;
            if (i8 < 0) {
                i8 += i7;
            }
            int i9 = i2 % i7;
            if (i9 < 0) {
                i9 += i7;
            }
            int i10 = (i8 - i9) % i7;
            if (i10 < 0) {
                i10 += i7;
            }
            return i10 + i2;
        }
        return i2;
    }

    public static LinkedHashSet n(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(tf4.F(set.size()));
        boolean z = false;
        for (Object next : set) {
            boolean z2 = true;
            if (!z && sg3.e(next, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    public static LinkedHashSet o(Set set, Iterable iterable) {
        Integer num;
        int i;
        set.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            num = Integer.valueOf(((Collection) iterable).size());
        } else {
            num = null;
        }
        if (num != null) {
            i = set.size() + num.intValue();
        } else {
            i = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(tf4.F(i));
        linkedHashSet.addAll(set);
        it0.h0(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static LinkedHashSet p(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(tf4.F(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static gb7 q(ua6 ua6, String str) {
        Throwable th;
        Map map;
        Throwable th2;
        Throwable th3;
        sn6 sn6;
        boolean z;
        boolean z2;
        String str2;
        ua6 ua62 = ua6;
        String str3 = str;
        ua62.getClass();
        ab6 k0 = ua62.k0("PRAGMA table_info(`" + str3 + "`)");
        try {
            long j = 0;
            if (!k0.i0()) {
                map = b42.w;
                dh4.f(k0, (Throwable) null);
            } else {
                int g = u55.g(k0, "name");
                int g2 = u55.g(k0, "type");
                int g3 = u55.g(k0, "notnull");
                int g4 = u55.g(k0, "pk");
                int g5 = u55.g(k0, "dflt_value");
                ze4 ze4 = new ze4();
                do {
                    String R = k0.R(g);
                    String R2 = k0.R(g2);
                    if (k0.getLong(g3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i = (int) k0.getLong(g4);
                    if (k0.isNull(g5)) {
                        str2 = null;
                    } else {
                        str2 = k0.R(g5);
                    }
                    ze4.put(R, new db7(R, R2, z2, i, str2, 2));
                } while (k0.i0());
                map = ze4.b();
                dh4.f(k0, (Throwable) null);
            }
            ab6 k02 = ua62.k0("PRAGMA foreign_key_list(`" + str3 + "`)");
            try {
                int g6 = u55.g(k02, "id");
                int g7 = u55.g(k02, "seq");
                int g8 = u55.g(k02, "table");
                int g9 = u55.g(k02, "on_delete");
                int g10 = u55.g(k02, "on_update");
                List r = r(k02);
                k02.reset();
                sn6 sn62 = new sn6();
                while (k02.i0()) {
                    if (k02.getLong(g7) == j) {
                        int i2 = (int) k02.getLong(g6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i3 = g6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object next : r) {
                            int i4 = g7;
                            List list = r;
                            if (((jm2) next).w == i2) {
                                arrayList3.add(next);
                            }
                            g7 = i4;
                            r = list;
                        }
                        int i5 = g7;
                        List list2 = r;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            jm2 jm2 = (jm2) it.next();
                            arrayList.add(jm2.y);
                            arrayList2.add(jm2.z);
                        }
                        sn62.add(new eb7(k02.R(g8), k02.R(g9), k02.R(g10), arrayList, arrayList2));
                        g6 = i3;
                        g7 = i5;
                        r = list2;
                        j = 0;
                    }
                }
                sn6 d = d(sn62);
                dh4.f(k02, (Throwable) null);
                ab6 k03 = ua62.k0("PRAGMA index_list(`" + str3 + "`)");
                try {
                    int g11 = u55.g(k03, "name");
                    int g12 = u55.g(k03, "origin");
                    int g13 = u55.g(k03, "unique");
                    if (g11 != -1 && g12 != -1 && g13 != -1) {
                        sn6 sn63 = new sn6();
                        while (true) {
                            if (!k03.i0()) {
                                sn6 d2 = d(sn63);
                                dh4.f(k03, (Throwable) null);
                                sn6 = d2;
                                break;
                            } else if ("c".equals(k03.R(g12))) {
                                String R3 = k03.R(g11);
                                if (k03.getLong(g13) == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                fb7 s = s(ua62, R3, z);
                                if (s == null) {
                                    dh4.f(k03, (Throwable) null);
                                    sn6 = null;
                                    break;
                                }
                                sn63.add(s);
                            }
                        }
                    } else {
                        dh4.f(k03, (Throwable) null);
                        sn6 = null;
                    }
                    return new gb7(str3, map, d, sn6);
                } catch (Throwable th4) {
                    dh4.f(k03, th3);
                    throw th4;
                }
            } catch (Throwable th5) {
                dh4.f(k02, th2);
                throw th5;
            }
        } catch (Throwable th6) {
            dh4.f(k0, th);
            throw th6;
        }
    }

    public static final List r(ab6 ab6) {
        int g = u55.g(ab6, "id");
        int g2 = u55.g(ab6, "seq");
        int g3 = u55.g(ab6, "from");
        int g4 = u55.g(ab6, "to");
        n74 m = sg3.m();
        while (ab6.i0()) {
            m.add(new jm2((int) ab6.getLong(g), (int) ab6.getLong(g2), ab6.R(g3), ab6.R(g4)));
        }
        return dt0.T0(sg3.i(m));
    }

    public static final fb7 s(ua6 ua6, String str, boolean z) {
        String str2;
        ab6 k0 = ua6.k0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int g = u55.g(k0, "seqno");
            int g2 = u55.g(k0, "cid");
            int g3 = u55.g(k0, "name");
            int g4 = u55.g(k0, "desc");
            if (!(g == -1 || g2 == -1 || g3 == -1)) {
                if (g4 != -1) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    while (k0.i0()) {
                        if (((int) k0.getLong(g2)) >= 0) {
                            int i = (int) k0.getLong(g);
                            String R = k0.R(g3);
                            if (k0.getLong(g4) > 0) {
                                str2 = "DESC";
                            } else {
                                str2 = "ASC";
                            }
                            linkedHashMap.put(Integer.valueOf(i), R);
                            linkedHashMap2.put(Integer.valueOf(i), str2);
                        }
                    }
                    List<Map.Entry> U0 = dt0.U0(linkedHashMap.entrySet(), new a91(24));
                    ArrayList arrayList = new ArrayList(et0.e0(U0, 10));
                    for (Map.Entry value : U0) {
                        arrayList.add((String) value.getValue());
                    }
                    List b1 = dt0.b1(arrayList);
                    List<Map.Entry> U02 = dt0.U0(linkedHashMap2.entrySet(), new a91(25));
                    ArrayList arrayList2 = new ArrayList(et0.e0(U02, 10));
                    for (Map.Entry value2 : U02) {
                        arrayList2.add((String) value2.getValue());
                    }
                    fb7 fb7 = new fb7(str, z, b1, dt0.b1(arrayList2));
                    dh4.f(k0, (Throwable) null);
                    return fb7;
                }
            }
            dh4.f(k0, (Throwable) null);
            return null;
        } catch (Throwable th) {
            dh4.f(k0, th);
            throw th;
        }
    }

    public static final fu6 t(fu6 fu6, List list, ro7 ro7) {
        fu6.getClass();
        list.getClass();
        ro7.getClass();
        if (list.isEmpty() && ro7 == fu6.J()) {
            return fu6;
        }
        if (list.isEmpty()) {
            return fu6.v0(ro7);
        }
        if (fu6 instanceof v62) {
            v62 v62 = (v62) fu6;
            wo7 wo7 = v62.x;
            t62 t62 = v62.y;
            x62 x62 = v62.z;
            boolean z = v62.B;
            String[] strArr = v62.C;
            return new v62(wo7, t62, x62, list, z, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        return kl8.I(ro7, fu6.L(), list, fu6.Q());
    }

    public static vw3 u(vw3 vw3, List list, rm rmVar, int i) {
        if ((i & 2) != 0) {
            rmVar = vw3.getAnnotations();
        }
        vw3.getClass();
        if ((list.isEmpty() || list == vw3.G()) && rmVar == vw3.getAnnotations()) {
            return vw3;
        }
        ro7 J = vw3.J();
        if ((rmVar instanceof yd2) && ((yd2) rmVar).isEmpty()) {
            rmVar = me6.x;
        }
        ro7 r = b85.r(J, rmVar);
        du7 n0 = vw3.n0();
        if (n0 instanceof zg2) {
            zg2 zg2 = (zg2) n0;
            return kl8.n(t(zg2.x, list, r), t(zg2.y, list, r));
        } else if (n0 instanceof fu6) {
            return t((fu6) n0, list, r);
        } else {
            h.c();
            return null;
        }
    }

    public static /* synthetic */ fu6 v(fu6 fu6, List list, ro7 ro7, int i) {
        if ((i & 1) != 0) {
            list = fu6.G();
        }
        if ((i & 2) != 0) {
            ro7 = fu6.J();
        }
        return t(fu6, list, ro7);
    }

    public static Set w(Object obj) {
        Set singleton = Collections.singleton(obj);
        singleton.getClass();
        return singleton;
    }

    public static final void x(int i, int i2, ll6 ll6) {
        String str;
        ll6.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(ll6.f(i4));
            }
            i3 >>>= 1;
        }
        String a2 = ll6.a();
        a2.getClass();
        if (arrayList.size() == 1) {
            str = pb4.n(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", a2, "', but it was missing");
        } else {
            str = "Fields " + arrayList + " are required for type with serial name '" + a2 + "', but they were missing";
        }
        throw new MissingFieldException(str, (MissingFieldException) null, arrayList, a2);
    }

    public static String y(qz8 qz8) {
        StringBuilder sb = new StringBuilder(qz8.k());
        for (int i = 0; i < qz8.k(); i++) {
            byte d = qz8.d(i);
            if (d == 34) {
                sb.append("\\\"");
            } else if (d == 39) {
                sb.append("\\'");
            } else if (d != 92) {
                switch (d) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case ry4.PERF_SESSIONS_FIELD_NUMBER:
                        sb.append("\\r");
                        break;
                    default:
                        if (d >= 32 && d <= 126) {
                            sb.append((char) d);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((d >>> 6) & 3) + 48));
                            sb.append((char) (((d >>> 3) & 7) + 48));
                            sb.append((char) ((d & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
