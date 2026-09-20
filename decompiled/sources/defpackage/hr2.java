package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: hr2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hr2 implements oy2, vz4, sj5, hb1, e77, rp8, fs8 {
    public static final /* synthetic */ hr2 A = new hr2(18);
    public static final /* synthetic */ hr2 B = new hr2(19);
    public static final /* synthetic */ hr2 C = new hr2(20);
    public static final /* synthetic */ hr2 D = new hr2(21);
    public static final /* synthetic */ hr2 E = new hr2(22);
    public static final /* synthetic */ hr2 F = new hr2(23);
    public static final /* synthetic */ hr2 G = new hr2(24);
    public static final /* synthetic */ hr2 H = new hr2(25);
    public static final /* synthetic */ hr2 I = new hr2(26);
    public static final /* synthetic */ hr2 J = new hr2(27);
    public static final /* synthetic */ hr2 K = new hr2(28);
    public static final /* synthetic */ hr2 L = new hr2(29);
    public static hr2 x;
    public static final /* synthetic */ hr2 y = new hr2(16);
    public static final /* synthetic */ hr2 z = new hr2(17);
    public final /* synthetic */ int w;

    public hr2(s63 s63) {
        this.w = 10;
    }

    public static void A(Object... objArr) {
        for (hr2 hr2 : yh7.b) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            hr2.getClass();
            A(copyOf);
        }
    }

    public static final void j(hr2 hr2, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            ArrayList arrayList2 = new ArrayList(et0.e0(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new bc8(intValue, ((Number) it2.next()).intValue()));
            }
            it0.h0(arrayList, arrayList2);
        }
        dt0.g1(arrayList);
    }

    public static final void k(StringBuilder sb, List list) {
        pe3 Q = z65.Q(z65.V(0, list.size()), 2);
        int i = Q.w;
        int i2 = Q.x;
        int i3 = Q.y;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                String str = (String) list.get(i);
                String str2 = (String) list.get(i + 1);
                if (i > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i != i2) {
                    i += i3;
                } else {
                    return;
                }
            }
        }
    }

    public static void m(Object... objArr) {
        for (hr2 hr2 : yh7.b) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            hr2.getClass();
            m(copyOf);
        }
    }

    public static void n(Object... objArr) {
        for (hr2 hr2 : yh7.b) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            hr2.getClass();
            n(copyOf);
        }
    }

    public static void o() {
        for (hr2 hr2 : yh7.b) {
            hr2.getClass();
            o();
        }
    }

    public static void p(Object... objArr) {
        for (hr2 hr2 : yh7.b) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            hr2.getClass();
            p(copyOf);
        }
    }

    public static gu5 w(String str) {
        if (str.equals("http/1.0")) {
            return gu5.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return gu5.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return gu5.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return gu5.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return gu5.SPDY_3;
        }
        if (str.equals("quic")) {
            return gu5.QUIC;
        }
        if (k57.u0(str, "h3", false)) {
            return gu5.HTTP_3;
        }
        rf2.i("Unexpected protocol: ".concat(str));
        return null;
    }

    public static void x(Object... objArr) {
        for (hr2 hr2 : yh7.b) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            hr2.getClass();
            x(copyOf);
        }
    }

    public static void z(Object... objArr) {
        for (hr2 hr2 : yh7.b) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            hr2.getClass();
            z(copyOf);
        }
    }

    public /* synthetic */ String Y(String str, String str2) {
        return null;
    }

    public Object a() {
        switch (this.w) {
            case 18:
                bo8 bo8 = (bo8) ao8.x.w.w;
                return new Boolean(((Boolean) bo8.a.get()).booleanValue());
            case 19:
                List list = by8.a;
                do8 do8 = (do8) co8.x.w.w;
                return (String) do8.c.get();
            case 20:
                List list2 = by8.a;
                qn8.x.get();
                return (String) rn8.a.u(44, "measurement.sgtm.service_upload_apps_list", "").get();
            case 21:
                List list3 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(47, 5000, "measurement.sgtm.upload.max_queued_batches").get()).longValue());
            case 22:
                List list4 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(79, 3600000, "measurement.upload.window_interval").get();
            case 23:
                List list5 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(53, 86400000, "measurement.upload.stale_data_deletion_interval").get();
            case 24:
                List list6 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(15, 605000, "measurement.upload.google_signal_max_queue_time").get();
            case 25:
                List list7 = by8.a;
                uo8.x.get();
                return (Long) vo8.a.s(4, -1, "measurement.test.long_flag").get();
            case 26:
                List list8 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(61, 604800000, "measurement.sdk.attribution.cache.ttl").get();
            case 27:
                List list9 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(12, 3600000, "measurement.session.engagement_interval").get();
            case 28:
                List list10 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(55, 90, "measurement.rb.attribution.client.min_time_after_boot_seconds").get()).longValue());
            default:
                List list11 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(66, 65536, "measurement.upload.max_bundle_size").get()).longValue());
        }
    }

    public boolean b(ll4 ll4) {
        return false;
    }

    public int c() {
        return 8;
    }

    public boolean d(ll4 ll4) {
        return we.A(h75.b(rc9.O0(ll4), false));
    }

    public void e(uy3 uy3, long j, f03 f03, int i, boolean z2) {
        o00 o00 = uy3.a0;
        l76 l76 = xz4.m0;
        ((xz4) o00.e).h1(xz4.q0, ((xz4) o00.e).Z0(j), f03, 1, z2);
    }

    public boolean f(f03 f03, uy3 uy3) {
        return false;
    }

    public boolean g(uy3 uy3) {
        ak6 x2 = uy3.x();
        boolean z2 = false;
        if (x2 != null && x2.z) {
            z2 = true;
        }
        return !z2;
    }

    public boolean h() {
        boolean z2;
        synchronized (uc2.a) {
            try {
                int i = uc2.c;
                uc2.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > uc2.d + 30000) {
                    boolean z3 = false;
                    uc2.c = 0;
                    uc2.d = SystemClock.uptimeMillis();
                    String[] list = uc2.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    if (list.length < 800) {
                        z3 = true;
                    }
                    uc2.e = z3;
                }
                z2 = uc2.e;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return z2;
    }

    public boolean i(uu6 uu6) {
        int i;
        mp7 mp7 = uu6.a;
        int i2 = Integer.MAX_VALUE;
        if (mp7 instanceof bv1) {
            i = ((bv1) mp7).L;
        } else {
            i = Integer.MAX_VALUE;
        }
        if (i <= 100) {
            return false;
        }
        mp7 mp72 = uu6.b;
        if (mp72 instanceof bv1) {
            i2 = ((bv1) mp72).L;
        }
        if (i2 > 100) {
            return true;
        }
        return false;
    }

    public void l(rm rmVar, rm rmVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = rmVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((fm) it.next()).f());
        }
        Iterator it2 = rmVar2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((fm) it2.next()).f());
        }
    }

    public yb9 q(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = ha6.h;
        if (bundle == null || !bundle.containsKey("google.messenger")) {
            return b35.l(bundle);
        }
        return b35.l((Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: s15} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Enum} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: java.lang.Enum} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: java.lang.Enum} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: java.lang.Enum} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: xc8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: xc8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: xc8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: s15} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: xc8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: xc8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v4, resolved type: s15} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v4, resolved type: po4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v5, resolved type: po4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v6, resolved type: po4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v5, resolved type: s15} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v6, resolved type: s15} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: xc8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: xc8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: s15} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: s15} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: xc8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: xc8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v7, resolved type: po4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v8, resolved type: po4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v9, resolved type: po4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: s15} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: xc8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: xc8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: s15} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: s15} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: s15} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v24, resolved type: s15} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: xc8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v25, resolved type: s15} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v26, resolved type: s15} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: xc8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: xc8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: xc8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: xc8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: xc8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v54, resolved type: xc8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: xc8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: xc8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: xc8} */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x036a, code lost:
        if (r2.compareTo(r5) <= 0) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x02ba, code lost:
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x02ba, code lost:
        r10 = r10;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x043f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x048e  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x04d2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x04d9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0535  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x0569  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x056d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0215 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x02c4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01f0  */
    public vw3 r(u72 u72, vw3 vw3, List list, cp7 cp7, boolean z2) {
        boolean z3;
        boolean z4;
        am6 am6;
        zj3[] zj3Arr;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z5;
        ql qlVar;
        ql qlVar2;
        po4 po4;
        po4 po42;
        s15 s15;
        boolean z6;
        Iterator it;
        boolean z7;
        boolean z8;
        Iterator it2;
        s15 s152;
        s15 s153;
        boolean z9;
        boolean z10;
        Iterator it3;
        po4 po43;
        po4 po44;
        po4 po45;
        boolean z11;
        po4 po46;
        s15 s154;
        Object obj;
        zw3 zw3;
        s15 s155;
        Object obj2;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Iterable iterable;
        boolean z17;
        qp7 qp7;
        boolean z18;
        Iterator it4;
        boolean hasNext;
        Iterable iterable2;
        x46 x46;
        lm lmVar;
        e3 e3Var;
        Iterator it5;
        xc8 xc8;
        xc8 xc82;
        xc8 xc83;
        xc8 xc84;
        s15 s156;
        boolean z19;
        xc8 xc85;
        zj3 zj3;
        s15 s157;
        po4 po47;
        boolean z20;
        boolean z21;
        boolean z22;
        xc8 d;
        po4 po48;
        boolean z23;
        boolean z24;
        boolean z25;
        e3 e3Var2;
        lm lmVar2;
        xc8 xc86;
        boolean z26;
        xc8 xc87;
        boolean z27;
        po4 po49;
        Iterable iterable3;
        Iterable annotations;
        zg2 p;
        jq7 jq7;
        u72 u722 = u72;
        ql qlVar3 = (ql) u722.c;
        am6 am62 = (am6) u722.d;
        boolean z28 = u722.a;
        vw3.getClass();
        ArrayList j = u72.j(vw3);
        List<zw3> list2 = list;
        ArrayList arrayList3 = new ArrayList(et0.e0(list2, 10));
        for (zw3 j2 : list2) {
            arrayList3.add(u722.j(j2));
        }
        if (z28 && !list2.isEmpty()) {
            Iterator it6 = list2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                zw3 zw32 = (zw3) it6.next();
                zw32.getClass();
                if (!((lz4) ((pj3) am62.x).u).a(vw3, (vw3) zw32)) {
                    z3 = true;
                    break;
                }
            }
        }
        vw3 vw32 = vw3;
        z3 = false;
        int size = j.size();
        zj3[] zj3Arr2 = new zj3[size];
        int i2 = 0;
        while (i2 < size) {
            nz3 y2 = rg3.y(i44.x, new bi4(u722, j, i2, 2));
            zj3 zj32 = zj3.f;
            if (i2 <= 0 || !z3) {
                g3 g3Var = (g3) j.get(i2);
                ki3 ki3 = (ki3) y2.getValue();
                zw3 zw33 = g3Var.a;
                sp7 sp7 = g3Var.c;
                z5 = z28;
                s15 s158 = s15.w;
                arrayList2 = j;
                po4 po410 = po4.x;
                arrayList = arrayList3;
                po4 po411 = po4.w;
                z4 = z3;
                s15 s159 = s15.x;
                zw3 zw34 = zw33;
                s15 s1510 = s15.y;
                i = size;
                s15 s1511 = null;
                if (zw34 == null) {
                    if (sp7 == null) {
                        jq7 = null;
                    } else if (sp7 instanceof qp7) {
                        k28 I2 = ((qp7) sp7).I();
                        I2.getClass();
                        jq7 = fb5.e(I2);
                    } else {
                        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb.append(sp7);
                        sb.append(", ");
                        h.j(hl6.m(b26.a, sp7.getClass(), sb));
                        return null;
                    }
                    if (jq7 == jq7.IN) {
                        qlVar2 = qlVar3;
                        am6 = am62;
                        po4 = po410;
                        po42 = po411;
                        zj3Arr = zj3Arr2;
                        s15 = null;
                        z6 = zj32.d;
                        ArrayList arrayList4 = new ArrayList();
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            g3 g3Var2 = (g3) dt0.z0(i2, (List) it.next());
                            if (g3Var2 == null || (zw3 = g3Var2.a) == null) {
                                obj = s15;
                            } else {
                                s15 g = u72.g(zw3);
                                if (g == null) {
                                    vw3 k = ub5.k((vw3) zw3);
                                    if (k != null) {
                                        s155 = u72.g(k);
                                    } else {
                                        s155 = s15;
                                    }
                                } else {
                                    s155 = g;
                                }
                                Enum f = u72.f(zw3);
                                Enum f2 = u72.f(zw3);
                                if (f2 == null) {
                                    vw3 k2 = ub5.k((vw3) zw3);
                                    if (k2 != null) {
                                        f2 = u72.f(k2);
                                    } else {
                                        f2 = s15;
                                    }
                                }
                                fu6 s = rc9.s(zw3);
                                if (s != null) {
                                    obj2 = rc9.o(s);
                                } else {
                                    obj2 = s15;
                                }
                                if (obj2 != null) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12 || (((vw3) zw3).n0() instanceof v05)) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (s155 != g) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (f2 != f) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                obj = new zj3(s155, f, z13, z14, z15);
                            }
                            if (obj != null) {
                                arrayList4.add(obj);
                            }
                        }
                        if (i2 == 0 || !z5) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        qlVar = qlVar2;
                        if (i2 != 0 || !(qlVar instanceof h28) || ((h28) qlVar).F == null) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        po4 po412 = zj32.b;
                        s15 s1512 = zj32.a;
                        ArrayList arrayList5 = new ArrayList();
                        it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            zj3 zj33 = (zj3) it2.next();
                            ArrayList arrayList6 = arrayList4;
                            if (zj33.d) {
                                s154 = null;
                            } else {
                                s154 = zj33.a;
                            }
                            if (s154 != null) {
                                arrayList5.add(s154);
                            }
                            arrayList4 = arrayList6;
                        }
                        ArrayList arrayList7 = arrayList4;
                        Set g1 = dt0.g1(arrayList5);
                        if (z6) {
                            s152 = null;
                        } else {
                            s152 = s1512;
                        }
                        if (s152 == s158) {
                            s153 = s158;
                        } else {
                            s153 = (s15) z85.w(g1, s1510, s159, s152, z7);
                        }
                        if (s153 == null) {
                            ArrayList arrayList8 = new ArrayList();
                            Iterator it7 = arrayList7.iterator();
                            while (it7.hasNext()) {
                                s15 s1513 = ((zj3) it7.next()).a;
                                if (s1513 != null) {
                                    arrayList8.add(s1513);
                                }
                            }
                            Set g12 = dt0.g1(arrayList8);
                            if (s1512 != s158) {
                                s158 = (s15) z85.w(g12, s1510, s159, s1512, z7);
                            }
                        } else {
                            s158 = s153;
                        }
                        if (s158 == null || z2 || (z8 && s158 == s159)) {
                            s158 = null;
                        }
                        if (s158 == null && s153 == null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (s158 == s1510) {
                            if (z6 != z9 || !zj32.c) {
                                if (!arrayList7.isEmpty()) {
                                    Iterator it8 = arrayList7.iterator();
                                    while (true) {
                                        if (!it8.hasNext()) {
                                            break;
                                        }
                                        zj3 zj34 = (zj3) it8.next();
                                        if (zj34.d == z9 && zj34.c) {
                                            break;
                                        }
                                    }
                                }
                            }
                            z10 = true;
                            ArrayList arrayList9 = new ArrayList();
                            it3 = arrayList7.iterator();
                            while (it3.hasNext()) {
                                zj3 zj35 = (zj3) it3.next();
                                if (zj35.e) {
                                    po46 = null;
                                } else {
                                    po46 = zj35.b;
                                }
                                if (po46 != null) {
                                    arrayList9.add(po46);
                                }
                            }
                            Set g13 = dt0.g1(arrayList9);
                            if (!zj32.e) {
                                po43 = null;
                            } else {
                                po43 = po412;
                            }
                            po4 po413 = po42;
                            po4 po414 = po4;
                            po44 = (po4) z85.w(g13, po414, po413, po43, z7);
                            if (po44 != null) {
                                ArrayList arrayList10 = new ArrayList();
                                Iterator it9 = arrayList7.iterator();
                                while (it9.hasNext()) {
                                    po4 po415 = ((zj3) it9.next()).b;
                                    if (po415 != null) {
                                        arrayList10.add(po415);
                                    }
                                }
                                po45 = (po4) z85.w(dt0.g1(arrayList10), po414, po413, po412, z7);
                            } else {
                                po45 = po44;
                            }
                            if (po45 == null && po44 == null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            zj32 = new zj3(s158, po45, z10, z9, z11);
                        }
                        z10 = false;
                        ArrayList arrayList92 = new ArrayList();
                        it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                        }
                        Set g132 = dt0.g1(arrayList92);
                        if (!zj32.e) {
                        }
                        po4 po4132 = po42;
                        po4 po4142 = po4;
                        po44 = (po4) z85.w(g132, po4142, po4132, po43, z7);
                        if (po44 != null) {
                        }
                        if (po45 == null) {
                        }
                        z11 = false;
                        zj32 = new zj3(s158, po45, z10, z9, z11);
                    }
                }
                if (sp7 == null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                Iterable iterable4 = a42.w;
                if (zw34 != null) {
                    iterable = ((vw3) zw34).getAnnotations();
                } else {
                    iterable = iterable4;
                }
                if (zw34 != null) {
                    fu6 s2 = rc9.s(zw34);
                    if (s2 == null && ((p = rc9.p(zw34)) == null || (s2 = rc9.x0(p)) == null)) {
                        fu6 s3 = rc9.s(zw34);
                        s3.getClass();
                        s2 = s3;
                    }
                    wo7 b1 = rc9.b1(s2);
                    if (b1 != null) {
                        qp7 U = rc9.U(b1);
                        z17 = z16;
                        qp7 = U;
                        Iterable iterable5 = iterable4;
                        zj3Arr = zj3Arr2;
                        if (((jm) u722.e) != jm.TYPE_PARAMETER_BOUNDS) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (z17) {
                            if (!z18) {
                                ((pj3) am62.x).t.getClass();
                            }
                            if (qlVar3 == null || (annotations = qlVar3.getAnnotations()) == null) {
                                iterable3 = iterable5;
                            } else {
                                iterable3 = annotations;
                            }
                            iterable = dt0.K0(iterable3, iterable);
                        }
                        lm lmVar3 = ((pj3) am62.x).q;
                        lmVar3.getClass();
                        it4 = iterable.iterator();
                        xc8 xc88 = null;
                        while (true) {
                            hasNext = it4.hasNext();
                            iterable2 = iterable;
                            x46 = x46.IGNORE;
                            if (hasNext) {
                                qlVar2 = qlVar3;
                                po4 = po410;
                                po42 = po411;
                                break;
                            }
                            Object next = it4.next();
                            next.getClass();
                            po4 = po410;
                            up2 d2 = lm.d(next);
                            if (d2 == null) {
                                qlVar2 = qlVar3;
                                po42 = po411;
                            } else {
                                po42 = po411;
                                if (on3.n.contains(d2)) {
                                    po49 = po42;
                                } else if (on3.o.contains(d2)) {
                                    po49 = po4;
                                } else {
                                    qlVar2 = qlVar3;
                                }
                                qlVar2 = qlVar3;
                                x46 x462 = (x46) ((b0) lmVar3.a.z).y(d2);
                                x462.getClass();
                                if (x462 != x46 && !x462.a()) {
                                    xc87 = new xc8(po49, x462.a());
                                    if (xc88 != null) {
                                        boolean z29 = xc88.b;
                                        if (xc87 != null && !xc87.equals(xc88) && (!(z27 = xc87.b) || z29)) {
                                            if (z27 || !z29) {
                                                xc88 = null;
                                            }
                                        }
                                        po411 = po42;
                                        iterable = iterable2;
                                        po410 = po4;
                                        qlVar3 = qlVar2;
                                    }
                                    xc88 = xc87;
                                    po411 = po42;
                                    iterable = iterable2;
                                    po410 = po4;
                                    qlVar3 = qlVar2;
                                }
                            }
                            xc87 = null;
                            if (xc88 != null) {
                            }
                            xc88 = xc87;
                            po411 = po42;
                            iterable = iterable2;
                            po410 = po4;
                            qlVar3 = qlVar2;
                        }
                        lmVar = ((pj3) am62.x).q;
                        e3Var = new e3(0, (Object) u722, (Object) g3Var);
                        lmVar.getClass();
                        it5 = iterable2.iterator();
                        xc8 = null;
                        while (true) {
                            if (it5.hasNext()) {
                                am6 = am62;
                                s15 = s1511;
                                xc82 = xc8;
                                break;
                            }
                            Object next2 = it5.next();
                            next2.getClass();
                            am6 = am62;
                            xc8 g2 = lmVar.g(next2, ((Boolean) e3Var.y(next2)).booleanValue());
                            if (g2 != null) {
                                lmVar2 = lmVar;
                                e3Var2 = e3Var;
                                s15 = s1511;
                                xc86 = g2;
                            } else {
                                Object i3 = lmVar.i(next2);
                                if (i3 == null) {
                                    e3Var2 = e3Var;
                                } else {
                                    x46 h = lmVar.h(next2);
                                    if (h == null) {
                                        h = ((ln3) lmVar.a.y).a;
                                    }
                                    if (h == x46) {
                                        lmVar2 = lmVar;
                                        e3Var2 = e3Var;
                                        s15 s1514 = s1511;
                                        s15 = s1514;
                                        xc86 = s1514;
                                    } else {
                                        e3Var2 = e3Var;
                                        xc8 g3 = lmVar.g(i3, ((Boolean) e3Var.y(i3)).booleanValue());
                                        if (g3 != null) {
                                            boolean a = h.a();
                                            lmVar2 = lmVar;
                                            s15 = s1511;
                                            xc86 = xc8.a(g3, s15, a, 1);
                                        }
                                    }
                                }
                                lmVar2 = lmVar;
                                s15 = s1511;
                                xc86 = s15;
                            }
                            if (xc8 != null) {
                                boolean z30 = xc8.b;
                                if (xc86 != 0 && !xc86.equals(xc8) && (!(z26 = xc86.b) || z30)) {
                                    if (z26 || !z30) {
                                        xc82 = s15;
                                    }
                                }
                                s1511 = s15;
                                lmVar = lmVar2;
                                am62 = am6;
                                e3Var = e3Var2;
                                xc8 = r10;
                            }
                            xc8 xc89 = xc86;
                            s1511 = s15;
                            lmVar = lmVar2;
                            am62 = am6;
                            e3Var = e3Var2;
                            xc8 = xc89;
                        }
                        xc82 = s15;
                        if (xc82 == 0) {
                            Object obj3 = xc82.a;
                            s15 s1515 = (s15) obj3;
                            if (xc88 != null) {
                                po48 = (po4) xc88.a;
                            } else {
                                po48 = s15;
                            }
                            if (obj3 != s1510 || qp7 == null) {
                                z23 = false;
                            } else {
                                z23 = true;
                            }
                            boolean z31 = xc82.b;
                            if (xc88 == null || !xc88.b) {
                                z25 = z31;
                                z24 = false;
                            } else {
                                z25 = z31;
                                z24 = true;
                            }
                            zj3 = new zj3(s1515, po48, z23, z25, z24);
                        } else {
                            if (qp7 != null) {
                                xc83 = u722.d(qp7);
                            } else {
                                xc83 = s15;
                            }
                            if (xc83 != 0) {
                                xc84 = xc8.a(xc83, s1510, false, 2);
                            } else if (ki3 != null) {
                                xc84 = ki3.a;
                            } else {
                                xc84 = s15;
                            }
                            if (xc83 != 0) {
                                s156 = (s15) xc83.a;
                            } else {
                                s156 = s15;
                            }
                            if (s156 == s1510 || !(qp7 == null || ki3 == null || !ki3.c)) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (sp7 == null || (d = u722.d(sp7)) == null) {
                                xc85 = s15;
                            } else {
                                Object obj4 = d.a;
                                xc85 = d;
                                if (obj4 == s159) {
                                    xc85 = xc8.a(d, s158, false, 2);
                                }
                            }
                            if (xc85 != 0) {
                                Object obj5 = xc85.a;
                                if (xc84 != 0) {
                                    Object obj6 = xc84.a;
                                    boolean z32 = xc84.b;
                                    boolean z33 = xc85.b;
                                    if (!z33 || z32) {
                                        if (z33 || !z32) {
                                            s15 s1516 = (s15) obj5;
                                            Enum enumR = (Enum) obj6;
                                            if (s1516.compareTo(enumR) >= 0) {
                                            }
                                        }
                                    }
                                }
                                xc84 = xc85;
                            }
                            if (xc84 != 0) {
                                s157 = (s15) xc84.a;
                            } else {
                                s157 = s15;
                            }
                            if (xc88 != null) {
                                po47 = (po4) xc88.a;
                            } else {
                                po47 = s15;
                            }
                            if (xc84 != 0) {
                                z21 = true;
                                if (xc84.b) {
                                    z20 = true;
                                    if (xc88 == null || xc88.b != z21) {
                                        z22 = false;
                                    } else {
                                        z22 = true;
                                    }
                                    zj3 = new zj3(s157, po47, z19, z20, z22);
                                }
                            } else {
                                z21 = true;
                            }
                            z20 = false;
                            if (xc88 == null || xc88.b != z21) {
                            }
                            zj3 = new zj3(s157, po47, z19, z20, z22);
                        }
                        zj32 = zj3;
                        z6 = zj32.d;
                        ArrayList arrayList42 = new ArrayList();
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                        }
                        if (i2 == 0) {
                        }
                        z7 = false;
                        qlVar = qlVar2;
                        if (i2 != 0 || !(qlVar instanceof h28) || ((h28) qlVar).F == null) {
                        }
                        po4 po4122 = zj32.b;
                        s15 s15122 = zj32.a;
                        ArrayList arrayList52 = new ArrayList();
                        it2 = arrayList42.iterator();
                        while (it2.hasNext()) {
                        }
                        ArrayList arrayList72 = arrayList42;
                        Set g14 = dt0.g1(arrayList52);
                        if (z6) {
                        }
                        if (s152 == s158) {
                        }
                        if (s153 == null) {
                        }
                        s158 = null;
                        if (s158 == null) {
                        }
                        z9 = false;
                        if (s158 == s1510) {
                        }
                        z10 = false;
                        ArrayList arrayList922 = new ArrayList();
                        it3 = arrayList72.iterator();
                        while (it3.hasNext()) {
                        }
                        Set g1322 = dt0.g1(arrayList922);
                        if (!zj32.e) {
                        }
                        po4 po41322 = po42;
                        po4 po41422 = po4;
                        po44 = (po4) z85.w(g1322, po41422, po41322, po43, z7);
                        if (po44 != null) {
                        }
                        if (po45 == null) {
                        }
                        z11 = false;
                        zj32 = new zj3(s158, po45, z10, z9, z11);
                    }
                }
                z17 = z16;
                qp7 = null;
                Iterable iterable52 = iterable4;
                zj3Arr = zj3Arr2;
                if (((jm) u722.e) != jm.TYPE_PARAMETER_BOUNDS) {
                }
                if (z17) {
                }
                lm lmVar32 = ((pj3) am62.x).q;
                lmVar32.getClass();
                it4 = iterable.iterator();
                xc8 xc882 = null;
                while (true) {
                    hasNext = it4.hasNext();
                    iterable2 = iterable;
                    x46 = x46.IGNORE;
                    if (hasNext) {
                    }
                    po411 = po42;
                    iterable = iterable2;
                    po410 = po4;
                    qlVar3 = qlVar2;
                }
                lmVar = ((pj3) am62.x).q;
                e3Var = new e3(0, (Object) u722, (Object) g3Var);
                lmVar.getClass();
                it5 = iterable2.iterator();
                xc8 = null;
                while (true) {
                    if (it5.hasNext()) {
                    }
                    s1511 = s15;
                    lmVar = lmVar2;
                    am62 = am6;
                    e3Var = e3Var2;
                    xc8 = xc89;
                }
                xc82 = s15;
                if (xc82 == 0) {
                }
                zj32 = zj3;
                z6 = zj32.d;
                ArrayList arrayList422 = new ArrayList();
                it = arrayList.iterator();
                while (it.hasNext()) {
                }
                if (i2 == 0) {
                }
                z7 = false;
                qlVar = qlVar2;
                if (i2 != 0 || !(qlVar instanceof h28) || ((h28) qlVar).F == null) {
                }
                po4 po41222 = zj32.b;
                s15 s151222 = zj32.a;
                ArrayList arrayList522 = new ArrayList();
                it2 = arrayList422.iterator();
                while (it2.hasNext()) {
                }
                ArrayList arrayList722 = arrayList422;
                Set g142 = dt0.g1(arrayList522);
                if (z6) {
                }
                if (s152 == s158) {
                }
                if (s153 == null) {
                }
                s158 = null;
                if (s158 == null) {
                }
                z9 = false;
                if (s158 == s1510) {
                }
                z10 = false;
                ArrayList arrayList9222 = new ArrayList();
                it3 = arrayList722.iterator();
                while (it3.hasNext()) {
                }
                Set g13222 = dt0.g1(arrayList9222);
                if (!zj32.e) {
                }
                po4 po413222 = po42;
                po4 po414222 = po4;
                po44 = (po4) z85.w(g13222, po414222, po413222, po43, z7);
                if (po44 != null) {
                }
                if (po45 == null) {
                }
                z11 = false;
                zj32 = new zj3(s158, po45, z10, z9, z11);
            } else {
                am6 = am62;
                z5 = z28;
                arrayList2 = j;
                arrayList = arrayList3;
                z4 = z3;
                i = size;
                zj3Arr = zj3Arr2;
                qlVar = qlVar3;
            }
            zj3Arr[i2] = zj32;
            i2++;
            vw3 vw33 = vw3;
            z3 = z4;
            qlVar3 = qlVar;
            z28 = z5;
            j = arrayList2;
            arrayList3 = arrayList;
            size = i;
            zj3Arr2 = zj3Arr;
            am62 = am6;
        }
        return (vw3) s63.l(vw3.n0(), new e3(1, (Object) cp7, (Object) zj3Arr2), 0, u722.b).y;
    }

    public vw3 s(ei3 ei3, pi0 pi0, boolean z2, am6 am6, jm jmVar, cp7 cp7, boolean z3, vr2 vr2) {
        u72 u72 = new u72((ql) pi0, z2, am6, jmVar, false);
        vw3 vw3 = (vw3) vr2.y(ei3);
        Collection s = ei3.s();
        s.getClass();
        Iterable<ri0> iterable = s;
        ArrayList arrayList = new ArrayList(et0.e0(iterable, 10));
        for (ri0 ri0 : iterable) {
            ri0.getClass();
            arrayList.add((vw3) vr2.y(ri0));
        }
        return r(u72, vw3, arrayList, cp7, z3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02c9, code lost:
        if (r10 == null) goto L_0x02cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01db  */
    public ArrayList t(am6 am6, Collection collection) {
        int i;
        ei3 ei3;
        rm rmVar;
        fr5 fr5;
        vw3 vw3;
        lj3 lj3;
        an5 an5;
        zc9 zc9;
        boolean z2;
        cr5 cr5;
        jm jmVar;
        cp7 cp7;
        ArrayList arrayList;
        vw3 k;
        yb5 yb5;
        boolean z3;
        cp7 cp72;
        am6 am62;
        List list;
        String str;
        xs2 xs2;
        h28 h28;
        am6 am63;
        fr5 fr52;
        w04 w04;
        List<n06> list2;
        am6 am64 = am6;
        l06 l06 = l06.P;
        am64.getClass();
        Iterable<ri0> iterable = collection;
        int i2 = 10;
        ArrayList arrayList2 = new ArrayList(et0.e0(iterable, 10));
        for (ri0 ri0 : iterable) {
            if (!(ri0 instanceof ei3)) {
                i = i2;
                ei3 = ri0;
            } else {
                if (!(ri0.u() == 2 && ri0.a().s().size() == 1)) {
                    vq0 z4 = rd3.z(ri0);
                    int i3 = 0;
                    if (z4 == null) {
                        rmVar = ((in8) ri0).getAnnotations();
                    } else {
                        if (z4 instanceof w04) {
                            w04 = (w04) z4;
                        } else {
                            w04 = null;
                        }
                        if (w04 != null) {
                            list2 = (List) w04.G.getValue();
                        } else {
                            list2 = null;
                        }
                        if (list2 == null || list2.isEmpty()) {
                            rmVar = ((in8) ri0).getAnnotations();
                        } else {
                            ArrayList arrayList3 = new ArrayList(et0.e0(list2, i2));
                            for (n06 t04 : list2) {
                                arrayList3.add(new t04(t04, am64, true));
                            }
                            ArrayList K0 = dt0.K0(((in8) ri0).getAnnotations(), arrayList3);
                            if (K0.isEmpty()) {
                                rmVar = me6.x;
                            } else {
                                rmVar = new tm(0, K0);
                            }
                        }
                    }
                    am6 o = uq3.o(am64, rmVar);
                    if (!(ri0 instanceof oj3) || (fr52 = ((er5) ri0).S) == null || fr52.A) {
                        fr5 = ri0;
                    } else {
                        fr5 = fr52;
                    }
                    qz3 b0 = ri0.b0();
                    jm jmVar2 = jm.VALUE_PARAMETER;
                    if (b0 != null) {
                        if (fr5 instanceof xs2) {
                            xs2 = (xs2) fr5;
                        } else {
                            xs2 = null;
                        }
                        if (xs2 != null) {
                            h28 = (h28) xs2.z(lj3.b0);
                        } else {
                            h28 = null;
                        }
                        l06 l062 = l06.M;
                        ei3 ei32 = (ei3) ri0;
                        if (h28 != null) {
                            am63 = uq3.o(o, h28.getAnnotations());
                        } else {
                            am63 = o;
                        }
                        vw3 = s(ei32, h28, false, am63, jmVar2, (cp7) null, false, l062);
                    } else {
                        vw3 = null;
                    }
                    if (ri0 instanceof lj3) {
                        lj3 = (lj3) ri0;
                    } else {
                        lj3 = null;
                    }
                    if (lj3 != null) {
                        vj1 r = lj3.r();
                        r.getClass();
                        ql4 ql4 = (ql4) r;
                        String g = dh4.g(lj3, 3);
                        String str2 = tj3.a;
                        gq0 h = tj3.h(ts1.g(ql4).a);
                        if (h != null) {
                            str = co3.c(h);
                        } else {
                            str = ed1.j(ql4, hz2.N);
                        }
                        an5 = (an5) zm5.d.get(str + '.' + g);
                        if (an5 != null) {
                            String str3 = an5.c;
                            if (str3 == null || k57.u0(str3, "2.", false)) {
                                if (str3 != null) {
                                    an5 = an5.d;
                                }
                                if (an5 != null) {
                                    an5.b.size();
                                    ((lj3) ri0).S().size();
                                }
                                zc9 = ((pj3) am64.x).v;
                                zc9.getClass();
                                if (((b0) zc9.z).y(mj3.a) == x46.STRICT) {
                                    ((pj3) o.x).t.getClass();
                                } else if ((ri0 instanceof xs2) && sg3.e(ri0.z(lj3.c0), Boolean.TRUE)) {
                                    z2 = true;
                                    List<h28> S = fr5.S();
                                    S.getClass();
                                    ArrayList arrayList4 = new ArrayList(et0.e0(S, i2));
                                    for (h28 h282 : S) {
                                        if (an5 == null || (list = an5.b) == null) {
                                            cp72 = null;
                                        } else {
                                            cp72 = (cp7) dt0.z0(h282.B, list);
                                        }
                                        st6 st6 = new st6(0, h282);
                                        ei3 ei33 = (ei3) ri0;
                                        if (h282 != null) {
                                            am62 = uq3.o(o, h282.getAnnotations());
                                        } else {
                                            am62 = o;
                                        }
                                        arrayList4.add(s(ei33, h282, false, am62, jmVar2, cp72, z2, st6));
                                    }
                                    if (ri0 instanceof cr5) {
                                        cr5 = (cr5) ri0;
                                    } else {
                                        cr5 = null;
                                    }
                                    if (cr5 == null || !rj1.A(cr5)) {
                                        jmVar = jm.METHOD_RETURN_TYPE;
                                    } else {
                                        jmVar = jm.FIELD;
                                    }
                                    jm jmVar3 = jmVar;
                                    if (an5 != null) {
                                        cp7 = an5.a;
                                    } else {
                                        cp7 = null;
                                    }
                                    ei3 ei34 = (ei3) ri0;
                                    arrayList = arrayList4;
                                    vw3 s = s(ei34, fr5, true, o, jmVar3, cp7, false, l06.N);
                                    k = ri0.k();
                                    k.getClass();
                                    if (!iq7.c(k, l06, (wv6) null)) {
                                        qz3 b02 = ri0.b0();
                                        if (b02 != null) {
                                            z3 = iq7.c(b02.b(), l06, (wv6) null);
                                        } else {
                                            z3 = false;
                                        }
                                        if (!z3) {
                                            List S2 = ri0.S();
                                            S2.getClass();
                                            if (!S2.isEmpty()) {
                                                Iterator it = S2.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        break;
                                                    }
                                                    vw3 b = ((h28) it.next()).b();
                                                    b.getClass();
                                                    if (iq7.c(b, l06, (wv6) null)) {
                                                        break;
                                                    }
                                                }
                                            }
                                            yb5 = null;
                                            if (vw3 == null && s == null) {
                                                if (!arrayList.isEmpty()) {
                                                    Iterator it2 = arrayList.iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            if (((vw3) it2.next()) != null) {
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            if (vw3 == null) {
                                                qz3 b03 = ri0.b0();
                                                if (b03 != null) {
                                                    vw3 = b03.b();
                                                } else {
                                                    vw3 = null;
                                                }
                                            }
                                            i = 10;
                                            ArrayList arrayList5 = new ArrayList(et0.e0(arrayList, 10));
                                            Iterator it3 = arrayList.iterator();
                                            while (it3.hasNext()) {
                                                Object next = it3.next();
                                                int i4 = i3 + 1;
                                                if (i3 >= 0) {
                                                    vw3 vw32 = (vw3) next;
                                                    if (vw32 == null) {
                                                        vw32 = ((h28) ri0.S().get(i3)).b();
                                                        vw32.getClass();
                                                    }
                                                    arrayList5.add(vw32);
                                                    i3 = i4;
                                                } else {
                                                    sg3.Z();
                                                    throw null;
                                                }
                                            }
                                            if (s == null) {
                                                s = ri0.k();
                                                s.getClass();
                                            }
                                            ei3 = ei34.t0(vw3, arrayList5, s, yb5);
                                        }
                                    }
                                    yb5 = new yb5(r16.c, new Object());
                                    if (!arrayList.isEmpty()) {
                                    }
                                }
                                z2 = false;
                                List<h28> S3 = fr5.S();
                                S3.getClass();
                                ArrayList arrayList42 = new ArrayList(et0.e0(S3, i2));
                                while (r11.hasNext()) {
                                }
                                if (ri0 instanceof cr5) {
                                }
                                if (cr5 == null || !rj1.A(cr5)) {
                                }
                                jm jmVar32 = jmVar;
                                if (an5 != null) {
                                }
                                ei3 ei342 = (ei3) ri0;
                                arrayList = arrayList42;
                                vw3 s2 = s(ei342, fr5, true, o, jmVar32, cp7, false, l06.N);
                                k = ri0.k();
                                k.getClass();
                                if (!iq7.c(k, l06, (wv6) null)) {
                                }
                                yb5 = new yb5(r16.c, new Object());
                                if (!arrayList.isEmpty()) {
                                }
                            } else {
                                h.s("Check failed.");
                                return null;
                            }
                        }
                    }
                    an5 = null;
                    if (an5 != null) {
                    }
                    zc9 = ((pj3) am64.x).v;
                    zc9.getClass();
                    if (((b0) zc9.z).y(mj3.a) == x46.STRICT) {
                    }
                    z2 = false;
                    List<h28> S32 = fr5.S();
                    S32.getClass();
                    ArrayList arrayList422 = new ArrayList(et0.e0(S32, i2));
                    while (r11.hasNext()) {
                    }
                    if (ri0 instanceof cr5) {
                    }
                    if (cr5 == null || !rj1.A(cr5)) {
                    }
                    jm jmVar322 = jmVar;
                    if (an5 != null) {
                    }
                    ei3 ei3422 = (ei3) ri0;
                    arrayList = arrayList422;
                    vw3 s22 = s(ei3422, fr5, true, o, jmVar322, cp7, false, l06.N);
                    k = ri0.k();
                    k.getClass();
                    if (!iq7.c(k, l06, (wv6) null)) {
                    }
                    yb5 = new yb5(r16.c, new Object());
                    if (!arrayList.isEmpty()) {
                    }
                }
                i = 10;
                ei3 = ri0;
            }
            arrayList2.add(ei3);
            i2 = i;
        }
        return arrayList2;
    }

    public String toString() {
        switch (this.w) {
            case 9:
                int hashCode = hashCode();
                rd3.i(16);
                String num = Integer.toString(hashCode, 16);
                num.getClass();
                return pb4.m("CreationExtras.Key@", num, "<", b26.a.b(a68.class).A(), ">");
            default:
                return super.toString();
        }
    }

    public fu6 u(no7 no7, ro7 ro7, boolean z2, int i, boolean z3) {
        ro7 ro72;
        no7 no72 = no7;
        ro7 ro73 = ro7;
        boolean z4 = z2;
        ut1 ut1 = (ut1) no72.y;
        xp7 v = v(new p27(ut1.h1(), k28.y), no72, (qp7) null, i);
        vw3 b = v.b();
        b.getClass();
        fu6 c = wn6.c(b);
        if (gr8.N(c)) {
            return c;
        }
        v.a();
        l(c.getAnnotations(), vm.a(ro73));
        if (!gr8.N(c)) {
            if (gr8.N(c)) {
                ro72 = c.J();
            } else {
                ro7 J2 = c.J();
                kg5 kg5 = ro7.x;
                J2.getClass();
                if (!ro73.isEmpty() || !J2.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Collection<Number> values = ((ConcurrentHashMap) kg5.x).values();
                    values.getClass();
                    for (Number intValue : values) {
                        int intValue2 = intValue.intValue();
                        um umVar = (um) ro73.w.get(intValue2);
                        um umVar2 = (um) J2.w.get(intValue2);
                        if (umVar != null) {
                            if (umVar2 != null) {
                                rm rmVar = umVar.a;
                                rm rmVar2 = umVar2.a;
                                rmVar.getClass();
                                rmVar2.getClass();
                                if (rmVar.isEmpty()) {
                                    rmVar = rmVar2;
                                } else if (!rmVar2.isEmpty()) {
                                    rmVar = new tm(new rm[]{rmVar, rmVar2});
                                }
                                umVar = new um(rmVar);
                            }
                            umVar2 = umVar;
                        } else if (umVar2 == null) {
                            umVar2 = null;
                        } else if (umVar != null) {
                            rm rmVar3 = umVar2.a;
                            rm rmVar4 = umVar.a;
                            rmVar3.getClass();
                            rmVar4.getClass();
                            if (rmVar3.isEmpty()) {
                                rmVar3 = rmVar4;
                            } else if (!rmVar4.isEmpty()) {
                                rmVar3 = new tm(new rm[]{rmVar3, rmVar4});
                            }
                            umVar2 = new um(rmVar3);
                        }
                        if (umVar2 != null) {
                            arrayList.add(umVar2);
                        }
                    }
                    ro72 = kg5.l(arrayList);
                } else {
                    ro72 = ro73;
                }
            }
            c = wn6.v(c, (List) null, ro72, 1);
        }
        fu6 i2 = iq7.i(c, z4);
        if (!z3) {
            return i2;
        }
        l3 l3Var = ut1.D;
        l3Var.getClass();
        return o85.y(i2, kl8.J(ii4.b, ro73, l3Var, (List) no72.z, z4));
    }

    public xp7 v(xp7 xp7, no7 no7, qp7 qp7, int i) {
        xp7 xp72;
        k28 k28;
        no7 no72 = no7;
        int i2 = i;
        ut1 ut1 = (ut1) no72.y;
        if (i2 > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + ut1.getName());
        } else if (xp7.c()) {
            qp7.getClass();
            return iq7.j(qp7);
        } else {
            vw3 b = xp7.b();
            b.getClass();
            wo7 L2 = b.L();
            L2.getClass();
            vq0 u = L2.u();
            if (u instanceof qp7) {
                xp72 = (xp7) ((Map) no72.A).get(u);
            } else {
                xp72 = null;
            }
            int i3 = 0;
            k28 k282 = k28.y;
            if (xp72 == null) {
                fu6 c = wn6.c(xp7.b().n0());
                if (!gr8.N(c) && iq7.c(c, l06.a0, (wv6) null)) {
                    wo7 L3 = c.L();
                    vq0 u2 = L3.u();
                    L3.getParameters().size();
                    c.G().size();
                    if (!(u2 instanceof qp7)) {
                        if (u2 instanceof ut1) {
                            ut1 ut12 = (ut1) u2;
                            if (no72.c(ut12)) {
                                String str = ut12.getName().w;
                                str.getClass();
                                return new p27(z62.c(x62.B, str), k282);
                            }
                            List G2 = c.G();
                            int i4 = 0;
                            ArrayList arrayList = new ArrayList(et0.e0(G2, 10));
                            for (Object next : G2) {
                                int i5 = i4 + 1;
                                if (i4 >= 0) {
                                    arrayList.add(v((xp7) next, no72, (qp7) L3.getParameters().get(i4), i2 + 1));
                                    i4 = i5;
                                } else {
                                    sg3.Z();
                                    throw null;
                                }
                            }
                            List<qp7> parameters = ut12.D.getParameters();
                            ArrayList arrayList2 = new ArrayList(et0.e0(parameters, 10));
                            for (qp7 a : parameters) {
                                arrayList2.add(a.a());
                            }
                            return new p27(o85.y(u(new no7(no72, ut12, arrayList, sf4.a0(dt0.i1(arrayList2, arrayList)), 0), c.J(), c.Q(), i2 + 1, false), y(c, no72, i2)), xp7.a());
                        }
                        fu6 y2 = y(c, no72, i2);
                        dq7.d(y2);
                        for (Object next2 : y2.G()) {
                            int i6 = i3 + 1;
                            if (i3 >= 0) {
                                xp7 xp73 = (xp7) next2;
                                if (!xp73.c()) {
                                    vw3 b2 = xp73.b();
                                    b2.getClass();
                                    if (!iq7.c(b2, l06.Z, (wv6) null)) {
                                        xp7 xp74 = (xp7) c.G().get(i3);
                                        qp7 qp72 = (qp7) c.L().getParameters().get(i3);
                                    }
                                }
                                i3 = i6;
                            } else {
                                sg3.Z();
                                throw null;
                            }
                        }
                        return new p27(y2, xp7.a());
                    }
                }
                return xp7;
            } else if (xp72.c()) {
                qp7.getClass();
                return iq7.j(qp7);
            } else {
                du7 n0 = xp72.b().n0();
                k28 a2 = xp72.a();
                a2.getClass();
                k28 a3 = xp7.a();
                a3.getClass();
                if (!(a3 == a2 || a3 == k282 || a2 != k282)) {
                    a2 = a3;
                }
                if (qp7 == null || (k28 = qp7.I()) == null) {
                    k28 = k282;
                }
                if (k28 == a2 || k28 == k282 || a2 != k282) {
                    k282 = a2;
                }
                l(b.getAnnotations(), n0.getAnnotations());
                fu6 i7 = iq7.i(wn6.c(n0), b.Q());
                ro7 J2 = b.J();
                if (!gr8.N(i7)) {
                    if (gr8.N(i7)) {
                        J2 = i7.J();
                    } else {
                        ro7 J3 = i7.J();
                        J2.getClass();
                        kg5 kg5 = ro7.x;
                        J3.getClass();
                        if (!J2.isEmpty() || !J3.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList();
                            Collection<Number> values = ((ConcurrentHashMap) kg5.x).values();
                            values.getClass();
                            for (Number intValue : values) {
                                int intValue2 = intValue.intValue();
                                um umVar = (um) J2.w.get(intValue2);
                                um umVar2 = (um) J3.w.get(intValue2);
                                if (umVar != null) {
                                    if (umVar2 != null) {
                                        rm rmVar = umVar.a;
                                        rm rmVar2 = umVar2.a;
                                        rmVar.getClass();
                                        rmVar2.getClass();
                                        if (rmVar.isEmpty()) {
                                            rmVar = rmVar2;
                                        } else if (!rmVar2.isEmpty()) {
                                            rmVar = new tm(new rm[]{rmVar, rmVar2});
                                        }
                                        umVar = new um(rmVar);
                                    }
                                    umVar2 = umVar;
                                } else if (umVar2 == null) {
                                    umVar2 = null;
                                } else if (umVar != null) {
                                    rm rmVar3 = umVar2.a;
                                    rm rmVar4 = umVar.a;
                                    rmVar3.getClass();
                                    rmVar4.getClass();
                                    if (rmVar3.isEmpty()) {
                                        rmVar3 = rmVar4;
                                    } else if (!rmVar4.isEmpty()) {
                                        rmVar3 = new tm(new rm[]{rmVar3, rmVar4});
                                    }
                                    umVar2 = new um(rmVar3);
                                }
                                if (umVar2 != null) {
                                    arrayList3.add(umVar2);
                                }
                            }
                            J2 = kg5.l(arrayList3);
                        }
                    }
                    i7 = wn6.v(i7, (List) null, J2, 1);
                }
                return new p27(i7, k282);
            }
        }
    }

    public fu6 y(fu6 fu6, no7 no7, int i) {
        wo7 L2 = fu6.L();
        List G2 = fu6.G();
        ArrayList arrayList = new ArrayList(et0.e0(G2, 10));
        int i2 = 0;
        for (Object next : G2) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                xp7 xp7 = (xp7) next;
                xp7 v = v(xp7, no7, (qp7) L2.getParameters().get(i2), i + 1);
                if (!v.c()) {
                    v = new p27(iq7.h(v.b(), xp7.b().Q()), v.a());
                }
                arrayList.add(v);
                i2 = i3;
            } else {
                sg3.Z();
                throw null;
            }
        }
        return wn6.v(fu6, arrayList, (ro7) null, 2);
    }

    public /* synthetic */ hr2(int i) {
        this.w = i;
    }
}
