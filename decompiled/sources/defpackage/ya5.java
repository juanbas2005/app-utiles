package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;

/* renamed from: ya5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ya5 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    public static boolean A(bq8 bq8) {
        if (bq8 == null) {
            return false;
        }
        Double p = bq8.p();
        if (p.isNaN() || p.doubleValue() < 0.0d || !p.equals(Double.valueOf(Math.floor(p.doubleValue())))) {
            return false;
        }
        return true;
    }

    public static as8 B(String str) {
        as8 as8;
        if (str == null || str.isEmpty()) {
            as8 = null;
        } else {
            as8 = (as8) as8.H0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (as8 != null) {
            return as8;
        }
        h.q(b81.y("Unsupported commandId ", str));
        return null;
    }

    public static boolean C(bq8 bq8, bq8 bq82) {
        if (!bq8.getClass().equals(bq82.getClass())) {
            return false;
        }
        if ((bq8 instanceof qq8) || (bq8 instanceof yp8)) {
            return true;
        }
        if (bq8 instanceof wn8) {
            if (Double.isNaN(bq8.p().doubleValue()) || Double.isNaN(bq82.p().doubleValue())) {
                return false;
            }
            return bq8.p().equals(bq82.p());
        } else if (bq8 instanceof mq8) {
            return bq8.g().equals(bq82.g());
        } else {
            if (bq8 instanceof km8) {
                return bq8.f().equals(bq82.f());
            }
            if (bq8 == bq82) {
                return true;
            }
            return false;
        }
    }

    public static int D(double d) {
        int i;
        int i2;
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        return (int) ((long) ((((double) i2) * Math.floor(Math.abs(d))) % 4.294967296E9d));
    }

    public static double E(double d) {
        int i;
        int i2;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || i == 0) {
            return d;
        }
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        return ((double) i2) * Math.floor(Math.abs(d));
    }

    public static Object F(bq8 bq8) {
        if (bq8.p.equals(bq8)) {
            return null;
        }
        if (bq8.o.equals(bq8)) {
            return "";
        }
        if (bq8 instanceof vp8) {
            return G((vp8) bq8);
        }
        if (bq8 instanceof rl8) {
            ArrayList arrayList = new ArrayList();
            rl8 rl8 = (rl8) bq8;
            int i = 0;
            while (i < rl8.y()) {
                if (i < rl8.y()) {
                    int i2 = i + 1;
                    Object F = F(rl8.z(i));
                    if (F != null) {
                        arrayList.add(F);
                    }
                    i = i2;
                } else {
                    kj6.i(hl6.p(new StringBuilder(String.valueOf(i).length() + 21), "Out of bounds index: ", i));
                    return null;
                }
            }
            return arrayList;
        } else if (!bq8.p().isNaN()) {
            return bq8.p();
        } else {
            return bq8.g();
        }
    }

    public static HashMap G(vp8 vp8) {
        HashMap hashMap = new HashMap();
        Iterator it = new ArrayList(vp8.w.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object F = F(vp8.l(str));
            if (F != null) {
                hashMap.put(str, F);
            }
        }
        return hashMap;
    }

    public static void H(no7 no7) {
        int D = D(no7.p("runtime.counter").p().doubleValue() + 1.0d);
        if (D <= 1000000) {
            no7.m("runtime.counter", new wn8(Double.valueOf((double) D)));
        } else {
            h.s("Instructions allowed exceeded");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: sm1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: kw5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: pa5} */
    /* JADX WARNING: type inference failed for: r13v3, types: [java.lang.Object, gb5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    public static final void a(int i, int i2, xf xfVar, h80 h80, fw0 fw0, yt2 yt2, xb4 xb4, ml4 ml4, tx4 tx4, la5 la5, ob5 ob5, ax6 ax6, gx6 gx6, boolean z) {
        int i3;
        ml4 ml42;
        int i4;
        boolean z2;
        xf xfVar2;
        gx6 gx62;
        tx4 tx42;
        boolean z3;
        ax6 ax62;
        h80 h802;
        xb4 xb42;
        la5 la52;
        ml4 ml43;
        yx5 v;
        boolean z4;
        gx6 gx63;
        ax6 ax63;
        la5 la53;
        ml4 ml44;
        xb4 xb43;
        h80 h803;
        xf xfVar3;
        int i5;
        ml4 ml45;
        boolean z5;
        int i6;
        yt2 yt22 = yt2;
        ob5 ob52 = ob5;
        yt22.g0(1860873769);
        if (yt22.g(ob52)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i | i3;
        int i8 = i2 & 2;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i & 48) == 0) {
            ml42 = ml4;
            if (yt22.g(ml42)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i7 |= i6;
            i4 = i7 | 911961472;
            boolean z6 = false;
            if ((306783379 & i4) != 306783378) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!yt22.V(i4 & 1, z2)) {
                yt22.a0();
                if ((i & 1) == 0 || yt22.C()) {
                    if (i8 != 0) {
                        ml45 = jl4.w;
                    } else {
                        ml45 = ml42;
                    }
                    la5 pa5 = new pa5(0.0f, 0.0f, 0.0f, 0.0f);
                    xb4 xb44 = xb4.W;
                    h80 h804 = xb4.I;
                    int i9 = (i4 & 14) | 196608;
                    ? obj = new Object();
                    tj1 a2 = j07.a(yt22);
                    Map map = l78.a;
                    x17 M = kl8.M(0.0f, 400.0f, Float.valueOf(1.0f), 1);
                    tp1 tp1 = (tp1) yt22.k(xy0.h);
                    ey3 ey3 = (ey3) yt22.k(xy0.n);
                    if ((((i9 & 14) ^ 6) <= 4 || !yt22.g(ob52)) && (i9 & 6) != 4) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    boolean g = yt22.g(tp1) | z5 | yt22.g(a2) | yt22.g(M) | yt22.g(obj) | yt22.e(ey3.ordinal());
                    Object Q = yt22.Q();
                    Object obj2 = ay0.a;
                    if (g || Q == obj2) {
                        Object ax64 = new ax6(new hv2(ob52, new gc5(15, (Object) ob52, (Object) ey3), (gb5) obj), a2, M);
                        yt22.o0(ax64);
                        Q = ax64;
                    }
                    ax6 ax65 = (ax6) Q;
                    int i10 = i4 & -29360129;
                    int i11 = (i4 & 14) | 432;
                    if ((((i11 & 14) ^ 6) > 4 && yt22.g(ob52)) || (i11 & 6) == 4) {
                        z6 = true;
                    }
                    Object Q2 = yt22.Q();
                    if (z6 || Q2 == obj2) {
                        Q2 = new sm1(ob52);
                        yt22.o0(Q2);
                    }
                    gx6 gx64 = kw5.L;
                    ml44 = ml45;
                    xfVar3 = l95.b(yt22);
                    tx42 = (sm1) Q2;
                    gx63 = gx64;
                    i5 = i10;
                    xb43 = xb44;
                    z4 = true;
                    la53 = pa5;
                    h803 = h804;
                    ax63 = ax65;
                } else {
                    yt22.Y();
                    i5 = i4 & -29360129;
                    xfVar3 = xfVar;
                    xb43 = xb4;
                    tx42 = tx4;
                    la53 = la5;
                    ax63 = ax6;
                    gx63 = gx6;
                    z4 = z;
                    ml44 = ml42;
                    h803 = h80;
                }
                yt22.s();
                mp7.A(((i5 << 3) & 112) | ((i5 >> 3) & 14) | 24576 | 907545984, 1797510, xfVar3, h803, fw0, yt22, xb43, ml44, tx42, la53, ob52, ax63, gx63, z4);
                xfVar2 = xfVar3;
                h802 = h803;
                xb42 = xb43;
                ml43 = ml44;
                la52 = la53;
                ax62 = ax63;
                gx62 = gx63;
                z3 = z4;
            } else {
                yt2.Y();
                xfVar2 = xfVar;
                h802 = h80;
                xb42 = xb4;
                tx42 = tx4;
                ax62 = ax6;
                gx62 = gx6;
                z3 = z;
                ml43 = ml42;
                la52 = la5;
            }
            v = yt2.v();
            if (v == null) {
                v.d = new n24(ob5, ml43, la52, xb42, h802, ax62, z3, tx42, gx62, xfVar2, fw0, i, i2);
                return;
            }
            return;
        }
        ml42 = ml4;
        i4 = i7 | 911961472;
        boolean z62 = false;
        if ((306783379 & i4) != 306783378) {
        }
        if (!yt22.V(i4 & 1, z2)) {
        }
        v = yt2.v();
        if (v == null) {
        }
    }

    public static final void b(int i, sr2 sr2, ml4 ml4, yt2 yt2, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        sr2 sr22 = sr2;
        ml4 ml42 = ml4;
        yt2 yt22 = yt2;
        int i8 = i2;
        sr22.getClass();
        yt22.g0(1221754151);
        if ((i8 & 6) == 0) {
            if (yt22.e(i7)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i8;
        } else {
            i3 = i8;
        }
        if ((i8 & 48) == 0) {
            if (yt22.i(sr22)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i8 & 384) == 0) {
            if (yt22.g(ml42)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        boolean z2 = false;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i3 & 1, z)) {
            Object Q = yt22.Q();
            Object obj = ay0.a;
            if (Q == obj) {
                Q = new ad5(0.0f);
                yt22.o0(Q);
            }
            ad5 ad5 = (ad5) Q;
            a37 b2 = vj.b(ad5.d(), (hl) null, "simSlotRotation", yt22, 3072, 22);
            if ((i3 & 112) == 32) {
                z2 = true;
            }
            Object Q2 = yt22.Q();
            if (z2 || Q2 == obj) {
                Q2 = new qm3(25, (Object) sr22, (Object) ad5);
                yt22.o0(Q2);
            }
            hj8.e((sr2) Q2, ml42, false, (a83) null, (pq6) null, su0.J(1545991749, new ob3(i7, b2), yt22), yt2, ((i3 >> 3) & 112) | 1572864, 60);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new q03(i7, sr22, ml42, i8);
        }
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [r58] */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final void c(ml4 ml4, fq6 fq6, yt2 yt2, int i) {
        boolean z;
        yt2.g0(403126403);
        int i2 = i | 22;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            yt2.a0();
            if ((i & 1) == 0 || yt2.C()) {
                a68 a2 = va4.a(yt2);
                if (a2 != null) {
                    fq6 = n85.p(b26.a.b(fq6.class), a2, b96.O(o85.l(a2), yt2), o85.k(a2), yt2);
                    ml4 = jl4.w;
                } else {
                    h.s("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            } else {
                yt2.Y();
            }
            yt2.s();
            Context context = (Context) yt2.k(ye.b);
            Object Q = yt2.Q();
            Object obj = ay0.a;
            if (Q == obj) {
                Q = Boolean.valueOf(sg3.B(context));
                yt2.o0(Q);
            }
            if (!((Boolean) Q).booleanValue()) {
                yx5 v = yt2.v();
                if (v != null) {
                    v.d = new yt6(ml4, fq6, i, 0);
                    return;
                }
                return;
            }
            aq4 n = hj8.n(fq6.d, yt2);
            int i3 = ((zn6) ((is7) n.getValue()).a).f;
            boolean g = yt2.g(n) | yt2.i(fq6);
            Object Q2 = yt2.Q();
            if (g || Q2 == obj) {
                Q2 = new qm3(24, (Object) fq6, (Object) n);
                yt2.o0(Q2);
            }
            b(i3, (sr2) Q2, ml4, yt2, 384);
        } else {
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new yt6(ml4, fq6, i, 1);
        }
    }

    public static final LinkedHashMap d(ArrayList arrayList) {
        String str = ae5.x;
        ae5 k = tz2.k("/");
        LinkedHashMap linkedHashMap = new LinkedHashMap(tf4.F(1));
        sf4.Y(linkedHashMap, new yb5[]{new yb5(k, new wf8(k, true, (String) null, 0, 0, 0, 0, 0, 0, 0, (Long) null, (Long) null, (Long) null, 65532))});
        for (wf8 wf8 : dt0.U0(arrayList, new zf8(0))) {
            if (((wf8) linkedHashMap.put(wf8.a, wf8)) == null) {
                while (true) {
                    ae5 ae5 = wf8.a;
                    ae5 b2 = ae5.b();
                    if (b2 == null) {
                        break;
                    }
                    wf8 wf82 = (wf8) linkedHashMap.get(b2);
                    if (wf82 != null) {
                        wf82.q.add(ae5);
                        break;
                    }
                    wf8 wf83 = new wf8(b2, true, (String) null, 0, 0, 0, 0, 0, 0, 0, (Long) null, (Long) null, (Long) null, 65532);
                    linkedHashMap.put(b2, wf83);
                    wf83.q.add(ae5);
                    wf8 = wf83;
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [vj1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static final cf4 e(fu6 fu6, wq0 wq0, int i) {
        wq0 wq02 = null;
        if (wq0 == null || z62.f(wq0)) {
            return null;
        }
        int size = wq0.u0().size() + i;
        if (!wq0.p()) {
            if (size != fu6.G().size()) {
                boolean m = rs1.m(wq0);
            }
            return new cf4(wq0, fu6.G().subList(i, fu6.G().size()), (cf4) null);
        }
        List subList = fu6.G().subList(i, size);
        ? r = wq0.r();
        if (r instanceof wq0) {
            wq02 = r;
        }
        return new cf4(wq0, subList, e(fu6, wq02, size));
    }

    public static jq0 f(Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (!cls.isPrimitive()) {
            gq0 a2 = m06.a(cls);
            String str = tj3.a;
            gq0 g = tj3.g(a2.a());
            if (g != null) {
                a2 = g;
            }
            return new jq0(a2, i);
        } else if (cls.equals(Void.TYPE)) {
            up2 i2 = m27.d.i();
            return new jq0(new gq0(i2.b(), i2.a.g()), i);
        } else {
            ro5 c2 = zo3.b(cls.getName()).c();
            c2.getClass();
            if (i > 0) {
                up2 up2 = (up2) c2.z.getValue();
                up2.getClass();
                return new jq0(new gq0(up2.b(), up2.a.g()), i - 1);
            }
            up2 up22 = (up2) c2.y.getValue();
            up22.getClass();
            return new jq0(new gq0(up22.b(), up22.a.g()), i);
        }
    }

    public static final List g(wq0 wq0) {
        List list;
        Object obj;
        wo7 n;
        List u0 = wq0.u0();
        u0.getClass();
        if (!wq0.p() && !(wq0.r() instanceof pi0)) {
            return u0;
        }
        int i = ts1.a;
        v61 v61 = v61.P;
        List V = cl6.V(new xg2(new ae2(new cv2(cl6.P(cl6.S(v61, wq0), 1), (vr2) l06.W), true, l06.X), l06.Y, gl6.D));
        Iterator it = cl6.P(cl6.S(v61, wq0), 1).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof ql4) {
                break;
            }
        }
        ql4 ql4 = (ql4) obj;
        if (!(ql4 == null || (n = ql4.n()) == null)) {
            list = n.getParameters();
        }
        if (list == null) {
            list = a42.w;
        }
        if (!V.isEmpty() || !list.isEmpty()) {
            ArrayList M0 = dt0.M0(V, list);
            ArrayList arrayList = new ArrayList(et0.e0(M0, 10));
            Iterator it2 = M0.iterator();
            while (it2.hasNext()) {
                qp7 qp7 = (qp7) it2.next();
                qp7.getClass();
                arrayList.add(new ol0(qp7, wq0, u0.size()));
            }
            return dt0.M0(u0, arrayList);
        }
        List u02 = wq0.u0();
        u02.getClass();
        return u02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01c0, code lost:
        if (r2.b(r0).equals(r2.b(defpackage.zk5.class)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b7, code lost:
        if (r11 == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fd, code lost:
        if (r12 == false) goto L_0x00f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0180 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0169 A[Catch:{ NoSuchFieldException -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x018b A[Catch:{ NoSuchFieldException -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0190 A[Catch:{ NoSuchFieldException -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0195 A[Catch:{ NoSuchFieldException -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x019d  */
    public static final zr3 h(gq3 gq3, zr3... zr3Arr) {
        Object obj;
        zr3 zr3;
        zr3 zr32;
        Field field;
        Object obj2;
        zr3 zr33;
        int length;
        Class cls;
        int i;
        Object obj3;
        Field field2;
        zr3 zr34;
        zr3[] zr3Arr2 = zr3Arr;
        gq3.getClass();
        Class u = kl8.u(gq3);
        zr3[] zr3Arr3 = (zr3[]) Arrays.copyOf(zr3Arr2, zr3Arr2.length);
        Class<xk5> cls2 = xk5.class;
        Class<Serializable> cls3 = Serializable.class;
        if (u.isEnum() && u.getAnnotation(cls3) == null && u.getAnnotation(cls2) == null) {
            Object[] enumConstants = u.getEnumConstants();
            String canonicalName = u.getCanonicalName();
            canonicalName.getClass();
            enumConstants.getClass();
            return new a62(canonicalName, (Enum[]) enumConstants);
        }
        zr3[] zr3Arr4 = (zr3[]) Arrays.copyOf(zr3Arr3, zr3Arr3.length);
        zk5 zk5 = null;
        try {
            Field declaredField = u.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get((Object) null);
        } catch (Throwable unused) {
            obj = null;
        }
        if (obj == null) {
            zr3 = null;
        } else {
            zr3 = l(obj, (zr3[]) Arrays.copyOf(zr3Arr4, zr3Arr4.length));
        }
        if (zr3 != null) {
            return zr3;
        }
        String canonicalName2 = u.getCanonicalName();
        if (canonicalName2 != null && !k57.u0(canonicalName2, "java.", false) && !k57.u0(canonicalName2, "kotlin.", false)) {
            Field[] declaredFields = u.getDeclaredFields();
            declaredFields.getClass();
            int length2 = declaredFields.length;
            Field field3 = null;
            int i2 = 0;
            boolean z = false;
            while (true) {
                if (i2 < length2) {
                    Field field4 = declaredFields[i2];
                    if (sg3.e(field4.getName(), "INSTANCE") && sg3.e(field4.getType(), u) && Modifier.isStatic(field4.getModifiers())) {
                        if (z) {
                            break;
                        }
                        z = true;
                        field3 = field4;
                    }
                    i2++;
                }
            }
            field3 = null;
            if (field3 != null) {
                Object obj4 = field3.get((Object) null);
                Method[] methods = u.getMethods();
                methods.getClass();
                int length3 = methods.length;
                Method method = null;
                int i3 = 0;
                boolean z2 = false;
                while (true) {
                    if (i3 < length3) {
                        Method method2 = methods[i3];
                        if (sg3.e(method2.getName(), "serializer")) {
                            Class[] parameterTypes = method2.getParameterTypes();
                            parameterTypes.getClass();
                            if (parameterTypes.length == 0 && sg3.e(method2.getReturnType(), zr3.class)) {
                                if (z2) {
                                    break;
                                }
                                z2 = true;
                                method = method2;
                            }
                        }
                        i3++;
                    }
                }
                method = null;
                if (method != null) {
                    Object invoke = method.invoke(obj4, (Object[]) null);
                    if (invoke instanceof zr3) {
                        zr32 = (zr3) invoke;
                        if (zr32 == null) {
                            return zr32;
                        }
                        zr3[] zr3Arr5 = (zr3[]) Arrays.copyOf(zr3Arr3, zr3Arr3.length);
                        Field[] declaredFields2 = u.getDeclaredFields();
                        declaredFields2.getClass();
                        int length4 = declaredFields2.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length4) {
                                field = null;
                                break;
                            }
                            field = declaredFields2[i4];
                            if (Modifier.isStatic(field.getModifiers()) && field.getType().getAnnotation(yq4.class) != null) {
                                break;
                            }
                            i4++;
                        }
                        if (field != null) {
                            try {
                                field.setAccessible(true);
                                obj2 = field.get((Object) null);
                            } catch (Throwable unused2) {
                            }
                            if (obj2 == null || (zr33 = l(obj2, (zr3[]) Arrays.copyOf(zr3Arr5, zr3Arr5.length))) == null) {
                                Class[] declaredClasses = u.getDeclaredClasses();
                                declaredClasses.getClass();
                                length = declaredClasses.length;
                                cls = null;
                                i = 0;
                                boolean z3 = false;
                                while (true) {
                                    if (i >= length) {
                                        Class cls4 = declaredClasses[i];
                                        if (cls4.getSimpleName().equals("$serializer")) {
                                            if (z3) {
                                                break;
                                            }
                                            z3 = true;
                                            cls = cls4;
                                        }
                                        i++;
                                    } else if (!z3) {
                                    }
                                }
                                cls = null;
                                if (cls == null || (field2 = cls.getField("INSTANCE")) == null) {
                                    obj3 = null;
                                } else {
                                    obj3 = field2.get((Object) null);
                                }
                                if (obj3 instanceof zr3) {
                                    zr33 = (zr3) obj3;
                                }
                                zr33 = null;
                            }
                            zr34 = zr33;
                            if (zr34 == null) {
                                return zr34;
                            }
                            if (u.getAnnotation(cls2) == null) {
                                Serializable serializable = (Serializable) u.getAnnotation(cls3);
                                if (serializable != null) {
                                    Class with = serializable.with();
                                    c26 c26 = b26.a;
                                }
                                return zk5;
                            }
                            zk5 = new zk5(b26.a.b(u));
                            return zk5;
                        }
                        obj2 = null;
                        try {
                            Class[] declaredClasses2 = u.getDeclaredClasses();
                            declaredClasses2.getClass();
                            length = declaredClasses2.length;
                            cls = null;
                            i = 0;
                            boolean z32 = false;
                            while (true) {
                                if (i >= length) {
                                }
                                i++;
                            }
                            cls = null;
                            if (cls == null || (field2 = cls.getField("INSTANCE")) == null) {
                            }
                            if (obj3 instanceof zr3) {
                            }
                        } catch (NoSuchFieldException unused3) {
                        }
                        zr33 = null;
                        zr34 = zr33;
                        if (zr34 == null) {
                        }
                    }
                }
            }
        }
        zr32 = null;
        if (zr32 == null) {
        }
    }

    public static final String i(int i) {
        rd3.i(16);
        String num = Integer.toString(i, 16);
        num.getClass();
        return "0x".concat(num);
    }

    public static final long j(double d) {
        return m((float) d, 4294967296L);
    }

    public static final long k(int i) {
        return m((float) i, 4294967296L);
    }

    public static final zr3 l(Object obj, zr3... zr3Arr) {
        Class[] clsArr;
        try {
            if (zr3Arr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = zr3Arr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = zr3.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(zr3Arr, zr3Arr.length));
            if (invoke instanceof zr3) {
                return (zr3) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e;
        }
    }

    public static final long m(float f, long j) {
        long floatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        xg7[] xg7Arr = wg7.b;
        return floatToRawIntBits;
    }

    public static PorterDuff.Mode n(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case h75.g:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void o(qv3 qv3, Annotation annotation) {
        Class u = kl8.u(kl8.p(annotation));
        ov3 f = qv3.f(m06.a(u), new k06(annotation));
        if (f != null) {
            p(f, annotation, u);
        }
    }

    public static void p(ov3 ov3, Annotation annotation, Class cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, (Object[]) null);
                invoke.getClass();
                uq4 e = uq4.e(method.getName());
                Class<?> cls2 = invoke.getClass();
                Class<Class> cls3 = Class.class;
                if (cls2.equals(cls3)) {
                    ov3.l(e, f((Class) invoke));
                } else if (w16.a.contains(cls2)) {
                    ov3.i(e, invoke);
                } else {
                    List list = m06.a;
                    if (Enum.class.isAssignableFrom(cls2)) {
                        if (!cls2.isEnum()) {
                            cls2 = cls2.getEnclosingClass();
                        }
                        cls2.getClass();
                        ov3.o(e, m06.a(cls2), uq4.e(((Enum) invoke).name()));
                    } else {
                        Class<Annotation> cls4 = Annotation.class;
                        if (cls4.isAssignableFrom(cls2)) {
                            Class[] interfaces = cls2.getInterfaces();
                            interfaces.getClass();
                            Class cls5 = (Class) qs.j1(interfaces);
                            cls5.getClass();
                            ov3 p = ov3.p(m06.a(cls5), e);
                            if (p != null) {
                                p(p, (Annotation) invoke, cls5);
                            }
                        } else if (cls2.isArray()) {
                            pv3 m = ov3.m(e);
                            if (m != null) {
                                Class<?> componentType = cls2.getComponentType();
                                if (componentType.isEnum()) {
                                    gq0 a2 = m06.a(componentType);
                                    for (Object obj : (Object[]) invoke) {
                                        obj.getClass();
                                        m.d(a2, uq4.e(((Enum) obj).name()));
                                    }
                                } else if (componentType.equals(cls3)) {
                                    for (Object obj2 : (Object[]) invoke) {
                                        obj2.getClass();
                                        m.g(f((Class) obj2));
                                    }
                                } else if (cls4.isAssignableFrom(componentType)) {
                                    for (Object obj3 : (Object[]) invoke) {
                                        ov3 a3 = m.a(m06.a(componentType));
                                        if (a3 != null) {
                                            obj3.getClass();
                                            p(a3, (Annotation) obj3, componentType);
                                        }
                                    }
                                } else {
                                    for (Object b2 : (Object[]) invoke) {
                                        m.b(b2);
                                    }
                                }
                                m.c();
                            }
                        } else {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls2 + "): " + invoke);
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        ov3.c();
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, g06] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, g06] */
    /* JADX WARNING: type inference failed for: r7v7, types: [java.lang.Object, g06] */
    /* JADX WARNING: type inference failed for: r8v1, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object, d06] */
    public static final wf8 q(zw5 zw5) {
        long j;
        zw5 zw52 = zw5;
        int k = zw52.k();
        if (k == 33639248) {
            zw52.skip(4);
            short o = zw52.o();
            short s = o & 65535;
            if ((o & 1) == 0) {
                short o2 = zw52.o() & 65535;
                short o3 = zw52.o() & 65535;
                short o4 = zw52.o() & 65535;
                long k2 = ((long) zw52.k()) & 4294967295L;
                ? obj = new Object();
                obj.w = ((long) zw52.k()) & 4294967295L;
                ? obj2 = new Object();
                obj2.w = ((long) zw52.k()) & 4294967295L;
                short o5 = zw52.o() & 65535;
                short o6 = zw52.o() & 65535;
                zw52.skip(8);
                ? obj3 = new Object();
                obj3.w = ((long) zw52.k()) & 4294967295L;
                String u = zw52.u((long) (zw52.o() & 65535));
                if (!d57.y0(u, 0)) {
                    if (obj2.w == 4294967295L) {
                        j = 8;
                    } else {
                        j = 0;
                    }
                    if (obj.w == 4294967295L) {
                        j += 8;
                    }
                    if (obj3.w == 4294967295L) {
                        j += 8;
                    }
                    long j2 = j;
                    ? obj4 = new Object();
                    ? obj5 = new Object();
                    ? obj6 = new Object();
                    ? obj7 = new Object();
                    r(zw52, o5, new fh1(obj7, j2, obj2, zw52, obj, obj3, obj4, obj5, obj6));
                    if (j2 <= 0 || obj7.w) {
                        String u2 = zw52.u((long) o6);
                        String str = ae5.x;
                        return new wf8(tz2.k("/").d(u), k57.m0(u, "/", false), u2, k2, obj.w, obj2.w, o2, obj3.w, o4, o3, (Long) obj4.w, (Long) obj5.w, (Long) obj6.w, 57344);
                    }
                    rf2.i("bad zip: zip64 extra required but absent");
                    return null;
                }
                rf2.i("bad zip: filename contains 0x00");
                return null;
            }
            rf2.i("unsupported zip: general purpose bit flag=".concat(i(s)));
            return null;
        }
        throw new IOException("bad zip: expected " + i(33639248) + " but was " + i(k));
    }

    public static final void r(zw5 zw5, int i, gs2 gs2) {
        sc0 sc0 = zw5.x;
        long j = (long) i;
        while (j != 0) {
            if (j >= 4) {
                short o = zw5.o() & 65535;
                long o2 = ((long) zw5.o()) & 65535;
                long j2 = j - 4;
                if (j2 >= o2) {
                    zw5.p(o2);
                    long j3 = sc0.x;
                    gs2.H(Integer.valueOf(o), Long.valueOf(o2));
                    long j4 = (sc0.x + o2) - j3;
                    int i2 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
                    if (i2 >= 0) {
                        if (i2 > 0) {
                            sc0.skip(j4);
                        }
                        j = j2 - o2;
                    } else {
                        rf2.i(hl6.k(o, "unsupported zip: too many bytes processed for "));
                        return;
                    }
                } else {
                    rf2.i("bad zip: truncated value in extra field");
                    return;
                }
            } else {
                rf2.i("bad zip: truncated header in extra field");
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, h06] */
    public static final wf8 s(zw5 zw5, wf8 wf8) {
        zw5 zw52 = zw5;
        wf8 wf82 = wf8;
        int k = zw52.k();
        if (k == 67324752) {
            zw52.skip(2);
            short o = zw52.o();
            short s = o & 65535;
            if ((o & 1) == 0) {
                zw52.skip(18);
                short o2 = zw52.o() & 65535;
                zw52.skip(((long) zw52.o()) & 65535);
                if (wf82 == null) {
                    zw52.skip((long) o2);
                    return null;
                }
                ? obj = new Object();
                ? obj2 = new Object();
                ? obj3 = new Object();
                r(zw52, o2, new yf8(zw52, (h06) obj, (h06) obj2, (h06) obj3));
                ae5 ae5 = wf82.a;
                boolean z = wf82.b;
                String str = wf82.c;
                long j = wf82.d;
                long j2 = wf82.e;
                long j3 = wf82.f;
                int i = wf82.g;
                long j4 = wf82.h;
                int i2 = wf82.i;
                int i3 = wf82.j;
                return new wf8(ae5, z, str, j, j2, j3, i, j4, i2, i3, wf82.k, wf82.l, wf82.m, (Integer) obj.w, (Integer) obj2.w, (Integer) obj3.w);
            }
            rf2.i("unsupported zip: general purpose bit flag=".concat(i(s)));
            return null;
        }
        String i4 = i(67324752);
        String i5 = i(k);
        throw new IOException("bad zip: expected " + i4 + " but was " + i5);
    }

    public static final long t(String str, long j, long j2, long j3) {
        String str2;
        int i = pa7.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long w0 = k57.w0(str2);
        if (w0 != null) {
            long longValue = w0.longValue();
            if (j2 <= longValue && longValue <= j3) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        kj6.l("System property '", str, "' has unrecognized value '", str2);
        return 0;
    }

    public static int u(int i, int i2, String str) {
        int i3;
        if ((i2 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = 2097150;
        }
        return (int) t(str, (long) i, 1, (long) i3);
    }

    public static long v(long j, long j2) {
        if (d18.a()) {
            return za5.k(j2);
        }
        if (d18.b()) {
            return j2;
        }
        return j;
    }

    public static final long w(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) * intBitsToFloat);
        return (((long) Float.floatToRawIntBits(intBitsToFloat2)) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static void x(String str, int i, List list) {
        if (list.size() != i) {
            zz8.a(str, i, " operation requires ", list.size());
        }
    }

    public static void y(String str, int i, List list) {
        if (list.size() < i) {
            zz8.a(str, i, " operation requires at least ", list.size());
        }
    }

    public static void z(String str, int i, ArrayList arrayList) {
        if (arrayList.size() > i) {
            zz8.a(str, i, " operation requires at most ", arrayList.size());
        }
    }
}
