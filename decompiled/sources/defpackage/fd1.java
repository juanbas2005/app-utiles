package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.HandwritingGesture;
import android.widget.EdgeEffect;
import com.google.zxing.NotFoundException;
import cu.lestebang.utiletecsa.App;
import cu.lestebang.utiletecsa.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;
import java.util.WeakHashMap;

/* renamed from: fd1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class fd1 {
    public static final fw0 a = new fw0(1569683028, new vw0(19), false);
    public static final fw0 b = new fw0(1792043713, new vw0(20), false);
    public static final Object c;
    public static final Object[][] d;
    public static final Object[][] e;
    public static final Object[][] f;
    public static final Object[][] g;
    public static final tv6 h = new tv6(2);
    public static final ov6 i = new ov6(1);
    public static final kj6 j = new kj6(25);
    public static x83 k;
    public static x83 l;
    public static final /* synthetic */ int m = 0;
    public static am6 n;

    static {
        Object obj = new Object();
        c = obj;
        Object[] objArr = {"01", 14};
        Object[] objArr2 = {"90", obj, 30};
        Object[] objArr3 = {"95", obj, 30};
        Object[] objArr4 = {"94", obj, 30};
        Object[] objArr5 = {"00", 18};
        Object[] objArr6 = {"37", obj, 8};
        Object[] objArr7 = objArr4;
        d = new Object[][]{objArr5, objArr, new Object[]{"02", 14}, new Object[]{"10", obj, 20}, new Object[]{"11", 6}, new Object[]{"12", 6}, new Object[]{"13", 6}, new Object[]{"15", 6}, new Object[]{"17", 6}, new Object[]{"20", 2}, new Object[]{"21", obj, 20}, new Object[]{"22", obj, 29}, new Object[]{"30", obj, 8}, objArr6, objArr2, new Object[]{"91", obj, 30}, new Object[]{"92", obj, 30}, new Object[]{"93", obj, 30}, objArr7, objArr3, new Object[]{"96", obj, 30}, new Object[]{"97", obj, 30}, new Object[]{"98", obj, 30}, new Object[]{"99", obj, 30}};
        Object[] objArr8 = {"241", obj, 30};
        Object[] objArr9 = {"422", 3};
        Object[] objArr10 = {"424", 3};
        Object[] objArr11 = {"240", obj, 30};
        e = new Object[][]{objArr11, objArr8, new Object[]{"242", obj, 6}, new Object[]{"250", obj, 30}, new Object[]{"251", obj, 30}, new Object[]{"253", obj, 17}, new Object[]{"254", obj, 20}, new Object[]{"400", obj, 30}, new Object[]{"401", obj, 30}, new Object[]{"402", 17}, new Object[]{"403", obj, 30}, new Object[]{"410", 13}, new Object[]{"411", 13}, new Object[]{"412", 13}, new Object[]{"413", 13}, new Object[]{"414", 13}, new Object[]{"420", obj, 20}, new Object[]{"421", obj, 15}, objArr9, new Object[]{"423", obj, 15}, objArr10, new Object[]{"425", 3}, new Object[]{"426", 3}};
        f = new Object[][]{new Object[]{"310", 6}, new Object[]{"311", 6}, new Object[]{"312", 6}, new Object[]{"313", 6}, new Object[]{"314", 6}, new Object[]{"315", 6}, new Object[]{"316", 6}, new Object[]{"320", 6}, new Object[]{"321", 6}, new Object[]{"322", 6}, new Object[]{"323", 6}, new Object[]{"324", 6}, new Object[]{"325", 6}, new Object[]{"326", 6}, new Object[]{"327", 6}, new Object[]{"328", 6}, new Object[]{"329", 6}, new Object[]{"330", 6}, new Object[]{"331", 6}, new Object[]{"332", 6}, new Object[]{"333", 6}, new Object[]{"334", 6}, new Object[]{"335", 6}, new Object[]{"336", 6}, new Object[]{"340", 6}, new Object[]{"341", 6}, new Object[]{"342", 6}, new Object[]{"343", 6}, new Object[]{"344", 6}, new Object[]{"345", 6}, new Object[]{"346", 6}, new Object[]{"347", 6}, new Object[]{"348", 6}, new Object[]{"349", 6}, new Object[]{"350", 6}, new Object[]{"351", 6}, new Object[]{"352", 6}, new Object[]{"353", 6}, new Object[]{"354", 6}, new Object[]{"355", 6}, new Object[]{"356", 6}, new Object[]{"357", 6}, new Object[]{"360", 6}, new Object[]{"361", 6}, new Object[]{"362", 6}, new Object[]{"363", 6}, new Object[]{"364", 6}, new Object[]{"365", 6}, new Object[]{"366", 6}, new Object[]{"367", 6}, new Object[]{"368", 6}, new Object[]{"369", 6}, new Object[]{"390", obj, 15}, new Object[]{"391", obj, 18}, new Object[]{"392", obj, 15}, new Object[]{"393", obj, 18}, new Object[]{"703", obj, 30}};
        g = new Object[][]{new Object[]{"7001", 13}, new Object[]{"7002", obj, 30}, new Object[]{"7003", 10}, new Object[]{"8001", 14}, new Object[]{"8002", obj, 20}, new Object[]{"8003", obj, 30}, new Object[]{"8004", obj, 30}, new Object[]{"8005", 6}, new Object[]{"8006", 18}, new Object[]{"8007", obj, 30}, new Object[]{"8008", obj, 12}, new Object[]{"8018", 18}, new Object[]{"8020", obj, 25}, new Object[]{"8100", 6}, new Object[]{"8101", 10}, new Object[]{"8102", 2}, new Object[]{"8110", obj, 70}, new Object[]{"8200", obj, 70}};
    }

    public static au6 A(ql4 ql4) {
        if (ql4 != null) {
            au6 q1 = au6.q1(ql4, n27.a, 4, ql4.e());
            List list = Collections.EMPTY_LIST;
            return q1.k1((qz3) null, (qz3) null, list, list, list, ts1.e(ql4).h(ql4.g0()), fl4.x, vs1.e);
        }
        a(22);
        throw null;
    }

    public static qz3 B(pi0 pi0, vw3 vw3, rm rmVar) {
        if (vw3 == null) {
            return null;
        }
        return new qz3(pi0, new t92(pi0, vw3), rmVar);
    }

    public static fr5 C(cr5 cr5, rm rmVar, boolean z, sy6 sy6) {
        if (rmVar == null) {
            a(18);
            throw null;
        } else if (sy6 != null) {
            return new fr5(cr5, rmVar, cr5.o(), cr5.f(), z, false, false, 1, (fr5) null, sy6);
        } else {
            a(19);
            throw null;
        }
    }

    public static jr5 D(cr5 cr5, rm rmVar, rm rmVar2, boolean z, us1 us1, sy6 sy6) {
        if (rmVar == null) {
            a(8);
            throw null;
        } else if (rmVar2 == null) {
            a(9);
            throw null;
        } else if (us1 == null) {
            a(10);
            throw null;
        } else if (sy6 != null) {
            jr5 jr5 = new jr5(cr5, rmVar, cr5.o(), us1, z, false, false, 1, (jr5) null, sy6);
            jr5.I = jr5.h1(jr5, cr5.b(), rmVar2);
            return jr5;
        } else {
            a(11);
            throw null;
        }
    }

    public static final as3 E(as3 as3, as3 as32) {
        as3 as33 = (as3) cl6.U(cl6.S(jo3.G, as3));
        List I = as33.I();
        if (I.isEmpty()) {
            return as33;
        }
        hz2 hz2 = hz2.J;
        xo7 F = hz2.F((c2) as33);
        int U = hz2.U(F);
        ArrayList arrayList = new ArrayList(U);
        for (int i2 = 0; i2 < U; i2++) {
            arrayList.add((cs3) hz2.b0(F, i2));
        }
        if (arrayList.size() == I.size()) {
            ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cs3 cs3 = (cs3) it.next();
                as3 as34 = (as3) dt0.y0(cs3.getUpperBounds());
                if (as34 != null) {
                    as3 E = E(as34, as32);
                    gs3 gs3 = gs3.c;
                    arrayList2.add(x91.C(E));
                } else {
                    rf2.l("Error inside type '", as32, "'. Parameter '", cs3, "' has no upper bounds. There must always be at least the default 'Any?' upper bound");
                    return null;
                }
            }
            vq3 J = as33.J();
            if (J != null) {
                c2 c0 = bb0.c0(J, arrayList2, as33.v(), 4);
                int size = arrayList.size();
                ArrayList arrayList3 = new ArrayList(size);
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList3.add(gs3.c);
                }
                return w95.d(c0, bb0.c0(J, arrayList3, as33.v(), 4), true);
            }
            rf2.l("Error inside type '", as32, "'. The current type '", as33, "' is not denotable");
            return null;
        }
        StringBuilder sb = new StringBuilder("Error inside type '");
        sb.append(as32);
        sb.append("'. '");
        sb.append(as33);
        int size2 = arrayList.size();
        int size3 = I.size();
        sb.append("' params (");
        sb.append(size2);
        sb.append(") vs args (");
        sb.append(size3);
        sb.append(") mismatch.");
        throw new IllegalStateException(sb.toString().toString());
    }

    public static int F(HandwritingGesture handwritingGesture, ay5 ay5) {
        String r = handwritingGesture.getFallbackText();
        if (r == null) {
            return 3;
        }
        ay5.y(new ou0(r, 1));
        return 5;
    }

    public static String G(int i2) {
        return pb4.i(i2, "activity with result code: ", " indicating not RESULT_OK");
    }

    public static final jx5 H(hu5 hu5, yt2 yt2) {
        App app;
        jx5 jx5;
        jx5 jx52 = (jx5) yt2.k(hu5);
        if (jx52 != null) {
            return jx52;
        }
        Context context = (Context) yt2.k(ye.b);
        jx5 jx53 = me6.z;
        if (jx53 != null) {
            return jx53;
        }
        synchronized (me6.y) {
            try {
                jx5 jx54 = me6.z;
                if (jx54 != null) {
                    return jx54;
                }
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof App) {
                    app = (App) applicationContext;
                } else {
                    app = null;
                }
                if (app != null) {
                    cx1 cx1 = app.y;
                    if (cx1 != null) {
                        Object obj = cx1.get();
                        obj.getClass();
                        jx5 = (jx5) obj;
                    } else {
                        sg3.a0("imageLoader");
                        throw null;
                    }
                } else {
                    jx5 = new o9(context).k();
                }
                me6.z = jx5;
                return jx5;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public static float I(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return u12.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final boolean J(fk6 fk6) {
        boolean z;
        Object g2 = fk6.d.w.g(jk6.K);
        Boolean bool = null;
        if (g2 == null) {
            g2 = null;
        }
        ij7 ij7 = (ij7) g2;
        tp4 tp4 = fk6.d.w;
        Object g3 = tp4.g(jk6.z);
        if (g3 == null) {
            g3 = null;
        }
        s86 s86 = (s86) g3;
        if (ij7 != null) {
            z = true;
        } else {
            z = false;
        }
        Object g4 = tp4.g(jk6.J);
        if (g4 != null) {
            bool = g4;
        }
        if (bool == null || (s86 != null && s86.a == 4)) {
            return z;
        }
        return true;
    }

    public static final String K(fk6 fk6, Resources resources) {
        float f2;
        int i2;
        ak6 ak6 = fk6.d;
        ak6 ak62 = fk6.d;
        String g2 = ak6.w.g(jk6.b);
        String str = null;
        if (g2 == null) {
            g2 = null;
        }
        tp4 tp4 = ak62.w;
        Object g3 = tp4.g(jk6.K);
        if (g3 == null) {
            g3 = null;
        }
        ij7 ij7 = (ij7) g3;
        Object g4 = tp4.g(jk6.z);
        if (g4 == null) {
            g4 = null;
        }
        s86 s86 = (s86) g4;
        if (ij7 != null) {
            int ordinal = ij7.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        h.c();
                        return null;
                    } else if (g2 == null) {
                        g2 = resources.getString(R.string.indeterminate);
                    }
                } else if (s86 != null && s86.a == 2 && g2 == null) {
                    g2 = resources.getString(R.string.state_off);
                }
            } else if (s86 != null && s86.a == 2 && g2 == null) {
                g2 = resources.getString(R.string.state_on);
            }
        }
        Object g5 = tp4.g(jk6.J);
        if (g5 == null) {
            g5 = null;
        }
        Boolean bool = (Boolean) g5;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((s86 == null || s86.a != 4) && g2 == null) {
                if (booleanValue) {
                    g2 = resources.getString(R.string.selected);
                } else {
                    g2 = resources.getString(R.string.not_selected);
                }
            }
        }
        Object g6 = tp4.g(jk6.c);
        if (g6 == null) {
            g6 = null;
        }
        mq5 mq5 = (mq5) g6;
        if (mq5 != null) {
            if (mq5 != mq5.c) {
                if (g2 == null) {
                    float f3 = mq5.b.a;
                    if (f3 - 0.0f == 0.0f) {
                        f2 = 0.0f;
                    } else {
                        f2 = (mq5.a - 0.0f) / (f3 - 0.0f);
                    }
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    if (f2 == 0.0f) {
                        i2 = 0;
                    } else if (f2 == 1.0f) {
                        i2 = 100;
                    } else {
                        i2 = z65.p(Math.round(f2 * 100.0f), 1, 99);
                    }
                    g2 = resources.getString(R.string.template_percent, new Object[]{Integer.valueOf(i2)});
                }
            } else if (g2 == null) {
                g2 = resources.getString(R.string.in_progress);
            }
        }
        nk6 nk6 = jk6.G;
        if (tp4.c(nk6)) {
            tp4 tp42 = new fk6(fk6.a, true, fk6.c, ak62).k().w;
            Object g7 = tp42.g(jk6.a);
            if (g7 == null) {
                g7 = null;
            }
            Collection collection = (Collection) g7;
            if (collection == null || collection.isEmpty()) {
                Object g8 = tp42.g(jk6.C);
                if (g8 == null) {
                    g8 = null;
                }
                Collection collection2 = (Collection) g8;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g9 = tp42.g(nk6);
                    if (g9 == null) {
                        g9 = null;
                    }
                    CharSequence charSequence = (CharSequence) g9;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            g2 = str;
        }
        return (String) g2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: vl} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final vl L(fk6 fk6) {
        Object g2 = fk6.d.w.g(jk6.G);
        vl vlVar = null;
        if (g2 == null) {
            g2 = null;
        }
        vl vlVar2 = (vl) g2;
        Object g3 = fk6.d.w.g(jk6.C);
        if (g3 == null) {
            g3 = null;
        }
        List list = (List) g3;
        if (list != null) {
            vlVar = dt0.y0(list);
        }
        if (vlVar2 == null) {
            return vlVar;
        }
        return vlVar2;
    }

    public static it4 M(z58 z58) {
        f9 f9Var = jt4.a;
        gb1 gb1 = gb1.b;
        f9Var.getClass();
        gb1.getClass();
        no7 no7 = new no7(z58, f9Var, gb1);
        gq3 b2 = b26.a.b(it4.class);
        String l2 = b2.l();
        if (l2 != null) {
            return (it4) no7.b(b2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(l2));
        }
        h.q("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static f90 N(bq2 bq2, boolean z) {
        a68 a68;
        if (z) {
            a68 = bq2.l();
        } else {
            a68 = null;
        }
        if (a68 == null) {
            a68 = bq2.S;
        }
        if (a68 != null) {
            z58 g2 = a68.g();
            w58 l2 = o85.l(a68);
            ib1 k2 = o85.k(a68);
            g2.getClass();
            l2.getClass();
            k2.getClass();
            no7 no7 = new no7(g2, l2, k2);
            gq3 b2 = b26.a.b(f90.class);
            String l3 = b2.l();
            if (l3 != null) {
                return (f90) no7.b(b2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(l3));
            }
            h.q("Local and anonymous classes can not be ViewModels");
            return null;
        }
        h.s("view model not found");
        return null;
    }

    public static am6 O() {
        am6 am6;
        am6 am62 = n;
        if (am62 != null) {
            return am62;
        }
        Class<Class> cls = Class.class;
        try {
            am6 = new am6(cls.getMethod("isSealed", (Class[]) null), cls.getMethod("getPermittedSubclasses", (Class[]) null), cls.getMethod("isRecord", (Class[]) null), cls.getMethod("getRecordComponents", (Class[]) null), 15);
        } catch (NoSuchMethodException unused) {
            am6 = new am6((Object) null, (Object) null, (Object) null, (Object) null, 15);
        }
        n = am6;
        return am6;
    }

    public static boolean P(String str) {
        if ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public static final boolean Q(KeyEvent keyEvent) {
        long x = rd3.x(keyEvent);
        int i2 = os3.O;
        if (os3.a(x, os3.h) || os3.a(x, os3.r) || os3.a(x, os3.E)) {
            return true;
        }
        return false;
    }

    public static final ml4 R(ml4 ml4, og ogVar, u44 u44, ze7 ze7) {
        return ml4.d(new n44(ogVar, u44, ze7));
    }

    public static Boolean S(Class cls) {
        cls.getClass();
        Method method = (Method) O().x;
        if (method == null) {
            return null;
        }
        Object invoke = method.invoke(cls, (Object[]) null);
        invoke.getClass();
        return (Boolean) invoke;
    }

    public static rh4 T(pj pjVar, s96 s96) {
        List list;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list2 = s96.a;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            dc2 dc2 = (dc2) list2.get(i2);
            List list3 = dc2.a;
            int size2 = list3.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if ((dc2 instanceof ac2) && i3 == list3.size() / 2) {
                    arrayList2.add(new yb5(dc2, Integer.valueOf(arrayList.size())));
                }
                arrayList.add(list3.get(i3));
            }
        }
        Float valueOf = Float.valueOf(0.0f);
        int e0 = et0.e0(arrayList, 9);
        if (e0 == 0) {
            list = sg3.D(valueOf);
        } else {
            ArrayList arrayList3 = new ArrayList(e0 + 1);
            arrayList3.add(valueOf);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                float floatValue = valueOf.floatValue();
                float c2 = pjVar.c((qc1) it.next());
                if (c2 >= 0.0f) {
                    valueOf = Float.valueOf(floatValue + c2);
                    arrayList3.add(valueOf);
                } else {
                    h.q("Measured cubic is expected to be greater or equal to zero");
                    return null;
                }
            }
            list = arrayList3;
        }
        float floatValue2 = ((Number) dt0.G0(list)).floatValue();
        vo4 vo4 = new vo4(list.size());
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            vo4.a(((Number) list.get(i4)).floatValue() / floatValue2);
        }
        n74 m2 = sg3.m();
        int size4 = arrayList2.size();
        for (int i5 = 0; i5 < size4; i5++) {
            int intValue = ((Number) ((yb5) arrayList2.get(i5)).x).intValue();
            m2.add(new tq5((vo4.b(intValue + 1) + vo4.b(intValue)) / 2.0f, (dc2) ((yb5) arrayList2.get(i5)).w));
        }
        return new rh4(pjVar, sg3.i(m2), arrayList, vo4);
    }

    public static float U(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return u12.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public static String V(String str) {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() >= 2) {
            String substring = str.substring(0, 2);
            int i2 = 0;
            while (true) {
                Object obj = c;
                if (i2 < 24) {
                    Object[] objArr = d[i2];
                    if (objArr[0].equals(substring)) {
                        Object obj2 = objArr[1];
                        if (obj2 == obj) {
                            return Y(2, ((Integer) objArr[2]).intValue(), str);
                        }
                        return X(2, ((Integer) obj2).intValue(), str);
                    }
                    i2++;
                } else if (str.length() >= 3) {
                    String substring2 = str.substring(0, 3);
                    for (int i3 = 0; i3 < 23; i3++) {
                        Object[] objArr2 = e[i3];
                        if (objArr2[0].equals(substring2)) {
                            Object obj3 = objArr2[1];
                            if (obj3 == obj) {
                                return Y(3, ((Integer) objArr2[2]).intValue(), str);
                            }
                            return X(3, ((Integer) obj3).intValue(), str);
                        }
                    }
                    for (int i4 = 0; i4 < 57; i4++) {
                        Object[] objArr3 = f[i4];
                        if (objArr3[0].equals(substring2)) {
                            Object obj4 = objArr3[1];
                            if (obj4 == obj) {
                                return Y(4, ((Integer) objArr3[2]).intValue(), str);
                            }
                            return X(4, ((Integer) obj4).intValue(), str);
                        }
                    }
                    if (str.length() >= 4) {
                        String substring3 = str.substring(0, 4);
                        for (int i5 = 0; i5 < 18; i5++) {
                            Object[] objArr4 = g[i5];
                            if (objArr4[0].equals(substring3)) {
                                Object obj5 = objArr4[1];
                                if (obj5 == obj) {
                                    return Y(4, ((Integer) objArr4[2]).intValue(), str);
                                }
                                return X(4, ((Integer) obj5).intValue(), str);
                            }
                        }
                        throw NotFoundException.y;
                    }
                    throw NotFoundException.y;
                } else {
                    throw NotFoundException.y;
                }
            }
        } else {
            throw NotFoundException.y;
        }
    }

    public static void W(long j2, vl vlVar, boolean z, ay5 ay5) {
        int i2;
        if (z) {
            int i3 = lg7.c;
            int i4 = (int) (j2 >> 32);
            int i5 = (int) (j2 & 4294967295L);
            int i6 = 10;
            if (i4 > 0) {
                i2 = Character.codePointBefore(vlVar, i4);
            } else {
                i2 = 10;
            }
            if (i5 < vlVar.x.length()) {
                i6 = Character.codePointAt(vlVar, i5);
            }
            if (ie1.R(i2) && (ie1.Q(i6) || ie1.O(i6))) {
                do {
                    i4 -= Character.charCount(i2);
                    if (i4 == 0) {
                        break;
                    }
                    i2 = Character.codePointBefore(vlVar, i4);
                } while (ie1.R(i2));
                j2 = i95.a(i4, i5);
            } else if (ie1.R(i6) && (ie1.Q(i2) || ie1.O(i2))) {
                do {
                    i5 += Character.charCount(i6);
                    if (i5 == vlVar.x.length()) {
                        break;
                    }
                    i6 = Character.codePointAt(vlVar, i5);
                } while (ie1.R(i6));
                j2 = i95.a(i4, i5);
            }
        }
        int i7 = (int) (4294967295L & j2);
        ay5.y(new ly2(new h22[]{new vn6(i7, i7), new np1(lg7.d(j2), 0)}));
    }

    public static String X(int i2, int i3, String str) {
        if (str.length() >= i2) {
            String substring = str.substring(0, i2);
            int i4 = i3 + i2;
            if (str.length() >= i4) {
                String substring2 = str.substring(i2, i4);
                String str2 = "(" + substring + ')' + substring2;
                String V = V(str.substring(i4));
                if (V == null) {
                    return str2;
                }
                return str2.concat(V);
            }
            throw NotFoundException.y;
        }
        throw NotFoundException.y;
    }

    public static String Y(int i2, int i3, String str) {
        String substring = str.substring(0, i2);
        int min = Math.min(str.length(), i3 + i2);
        String substring2 = str.substring(i2, min);
        String str2 = "(" + substring + ')' + substring2;
        String V = V(str.substring(min));
        if (V == null) {
            return str2;
        }
        return str2.concat(V);
    }

    public static List Z(List list) {
        if (list instanceof q93) {
            return ((q93) list).x();
        }
        if (list instanceof a94) {
            return ((a94) list).w;
        }
        if (list instanceof RandomAccess) {
            return new a94(list);
        }
        return new a94(list);
    }

    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        Throwable th;
        if (i2 == 12 || i2 == 23 || i2 == 25) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i2 == 12 || i2 == 23 || i2 == 25) {
            i3 = 2;
        } else {
            i3 = 3;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 6:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
            default:
                objArr[0] = "propertyDescriptor";
                break;
        }
        if (i2 == 12) {
            objArr[1] = "createSetter";
        } else if (i2 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i2 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i2) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case h75.g /*15*/:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        if (i2 == 12 || i2 == 23 || i2 == 25) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public static final String a0(byte b2) {
        if (b2 == 1) {
            return "quotation mark '\"'";
        }
        if (b2 == 2) {
            return "string escape sequence '\\'";
        }
        if (b2 == 4) {
            return "comma ','";
        }
        if (b2 == 5) {
            return "colon ':'";
        }
        if (b2 == 6) {
            return "start of the object '{'";
        }
        if (b2 == 7) {
            return "end of the object '}'";
        }
        if (b2 == 8) {
            return "start of the array '['";
        }
        if (b2 == 9) {
            return "end of the array ']'";
        }
        if (b2 == 10) {
            return "end of the input";
        }
        if (b2 == Byte.MAX_VALUE) {
            return "invalid token";
        }
        return "valid token";
    }

    public static final void b(cw1 cw1, ml4 ml4, vr2 vr2, jb jbVar, String str, vr2 vr22, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        boolean z;
        vr2 vr23;
        i80 i80;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        String str2 = str;
        yt2 yt22 = yt2;
        int i9 = i2;
        yt22.g0(1501828832);
        if ((i9 & 6) == 0) {
            if ((i9 & 8) == 0) {
                z2 = yt22.g(cw1);
            } else {
                z2 = yt22.i(cw1);
            }
            if (z2) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i9;
        } else {
            i3 = i9;
        }
        if ((i9 & 48) == 0) {
            if (yt22.g(ml4)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        vr2 vr24 = vr2;
        if ((i9 & 384) == 0) {
            if (yt22.i(vr24)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i10 = i3 | 3072;
        if ((i9 & 24576) == 0) {
            if (yt22.g(str2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i10 |= i5;
        }
        int i11 = i10 | 196608;
        fw0 fw02 = fw0;
        if ((1572864 & i9) == 0) {
            if (yt22.i(fw02)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i11 |= i4;
        }
        if ((599187 & i11) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i11 & 1, z)) {
            i80 i802 = xb4.y;
            Object Q = yt22.Q();
            if (Q == ay0.a) {
                Q = ce.H;
                yt22.o0(Q);
            }
            vr2 vr25 = (vr2) Q;
            mm7 d1 = rc9.d1(cw1, str2, yt22, (i11 & 14) | ((i11 >> 9) & 112), 0);
            int i12 = i11 & 8176;
            int i13 = i11 >> 3;
            c(d1, ml4, vr24, i802, vr25, fw02, yt22, i12 | (57344 & i13) | (i13 & 458752));
            i80 = i802;
            vr23 = vr25;
        } else {
            yt2.Y();
            i80 = jbVar;
            vr23 = vr22;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new wj(cw1, ml4, vr2, i80, str2, vr23, fw0, i2);
        }
    }

    public static final ml4 b0(aa8 aa8) {
        return new jq1(aa8);
    }

    public static final void c(mm7 mm7, ml4 ml4, vr2 vr2, jb jbVar, vr2 vr22, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        yt2 yt22 = yt2;
        int i10 = i2;
        yt22.g0(511725103);
        if ((i10 & 6) == 0) {
            if (yt22.g(mm7)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i10;
        } else {
            i3 = i10;
        }
        if ((i10 & 48) == 0) {
            if (yt22.g(ml4)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i10 & 384) == 0) {
            if (yt22.i(vr2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i10 & 3072) == 0) {
            if (yt22.g(jbVar)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i10 & 24576) == 0) {
            if (yt22.i(vr22)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((i10 & 196608) == 0) {
            if (yt22.i(fw0)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i3 & 1, z)) {
            Object Q = yt22.Q();
            if (Q == ay0.a) {
                Q = ce.I;
                yt22.o0(Q);
            }
            int i11 = 196608 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | ((i3 << 3) & 3670016);
            d(mm7, ml4, vr2, jbVar, vr22, (vr2) Q, fw0, yt22, i11);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new xj(mm7, ml4, vr2, jbVar, vr22, fw0, i10);
        }
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0183, code lost:
        if (r1.equals(r20.H0()) != false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0185, code lost:
        r4 = r6.listIterator();
        r21 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x018b, code lost:
        r22 = (defpackage.d03) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0193, code lost:
        if (r22.hasNext() == false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0195, code lost:
        r23 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01a7, code lost:
        if (defpackage.sg3.e(r10.y(r22.next()), r10.y(r1)) == false) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01a9, code lost:
        r2 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01ad, code lost:
        r21 = r21 + 1;
        r3 = r27;
        r2 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01b4, code lost:
        r23 = r2;
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01b8, code lost:
        if (r2 != -1) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01ba, code lost:
        r6.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01c6, code lost:
        if (defpackage.sg3.e(r6.get(r2), r1) != false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01c8, code lost:
        r6.set(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01cc, code lost:
        r23 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01da, code lost:
        if (defpackage.sg3.e(r20.H0(), r23.getValue()) != false) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01dc, code lost:
        r1 = r6.listIterator();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01e1, code lost:
        r3 = (defpackage.d03) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01e8, code lost:
        if (r3.hasNext() == false) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01fe, code lost:
        if (defpackage.sg3.e(r10.y(r3.next()), r10.y(r23.getValue())) == false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0200, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0203, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0206, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0208, code lost:
        if (r3 != -1) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x020a, code lost:
        r6.add(r23.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x021e, code lost:
        if (defpackage.sg3.e(r6.get(r3), r23.getValue()) == false) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0228, code lost:
        if (r3 == (r6.size() - 1)) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x022a, code lost:
        r6.remove(r3);
        r6.add(r23.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0234, code lost:
        r1 = r14.getValue();
        r2 = r12.g(r1);
        r3 = r12.Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0240, code lost:
        if (r2 != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0242, code lost:
        if (r3 != r15) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0244, code lost:
        if (r1 == null) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0246, code lost:
        r3 = new defpackage.hf5(r5, r23.getValue(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0251, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0252, code lost:
        r12.o0(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0255, code lost:
        r3 = (defpackage.hf5) r3;
        r4 = r19 & 458752;
        r18 = r12.g(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0263, code lost:
        if (r4 != 131072) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0265, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0267, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0268, code lost:
        r2 = r18 | r2;
        r4 = r12.Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x026e, code lost:
        if (r2 != false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0270, code lost:
        if (r4 != r15) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0273, code lost:
        r2 = r4;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0276, code lost:
        if (r3 == null) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x027c, code lost:
        if (r11.y(r3) != null) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x027e, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0280, code lost:
        defpackage.ku4.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0283, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0284, code lost:
        r12.o0((java.lang.Object) null);
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0288, code lost:
        if (r2 != null) goto L_0x0475;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0292, code lost:
        if (r0.b(r23.getValue()) == false) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x029c, code lost:
        if (r0.b(r20.H0()) == false) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x029e, code lost:
        if (r1 == null) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02a4, code lost:
        if (r0.b(r1) != false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02a7, code lost:
        r12.e0(-298958042);
        r12.r(false);
        r9 = r0;
        r21 = r4;
        r7 = r5;
        r0 = r6;
        r6 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02b9, code lost:
        r12.e0(-302678073);
        r0.a();
        r1 = r6.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02c7, code lost:
        if (r2 >= r1) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02c9, code lost:
        r16 = r1;
        r1 = r6.get(r2);
        r21 = r4;
        r9 = r0;
        r4 = r27;
        r18 = r2;
        r2 = new defpackage.bk(r1, r25, r3, r4, r5, r6, r7);
        r7 = r5;
        r0 = r6;
        r6 = r4;
        r9.m(r1, defpackage.su0.J(427839334, r2, r12));
        r2 = r18 + 1;
        r6 = r0;
        r0 = r9;
        r1 = r16;
        r4 = r21;
        r9 = r28;
        r7 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02fb, code lost:
        r9 = r0;
        r21 = r4;
        r7 = r5;
        r0 = r6;
        r6 = r27;
        r12.r(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0306, code lost:
        r1 = (r12.g(r25.f()) | r12.g(r7)) | r12.g(r14.getValue());
        r2 = r12.Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0320, code lost:
        if (r1 != false) goto L_0x0324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0322, code lost:
        if (r2 != r15) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0324, code lost:
        r2 = (defpackage.k51) r6.y(r7);
        r12.o0(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x032e, code lost:
        r2 = (defpackage.k51) r2;
        r1 = r7.a;
        r3 = r12.g(r7);
        r4 = r12.Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x033a, code lost:
        if (r3 != false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x033c, code lost:
        if (r4 != r15) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x033e, code lost:
        r4 = defpackage.u55.p(java.lang.Boolean.FALSE);
        r12.o0(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0347, code lost:
        r4 = (defpackage.aq4) r4;
        r14 = defpackage.u55.v(r2.d, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x035f, code lost:
        if (defpackage.sg3.e(r1.a.H0(), r1.d.getValue()) == false) goto L_0x0367;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0361, code lost:
        r4.setValue(java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x036b, code lost:
        if (r14.getValue() == null) goto L_0x0372;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x036d, code lost:
        r4.setValue(java.lang.Boolean.TRUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0372, code lost:
        r1 = ((java.lang.Boolean) r4.getValue()).booleanValue();
        r16 = defpackage.jl4.w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x037e, code lost:
        if (r1 == false) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0380, code lost:
        r12.e0(1353077497);
        r24 = r12;
        r12 = r0;
        r3 = r24;
        r4 = defpackage.rc9.D(r7.a, defpackage.we.C, (java.lang.String) null, r3, 0, 2);
        r0 = r3.g(r4);
        r1 = r3.Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03a1, code lost:
        if (r0 != false) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03a3, code lost:
        if (r1 != r15) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03a5, code lost:
        r0 = (defpackage.bv6) r14.getValue();
        r1 = defpackage.we.g(r16);
        r3.o0(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03b2, code lost:
        r16 = (defpackage.ml4) r1;
        r3.r(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03bd, code lost:
        r3 = r12;
        r12 = r0;
        r3.e0(1353343539);
        r3.r(false);
        r4 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03cc, code lost:
        r0 = r8.d(r16.d(new defpackage.ik(r4, r14, r7)));
        r1 = r3.Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03dd, code lost:
        if (r1 != r15) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03df, code lost:
        r1 = new defpackage.ek(r7);
        r3.o0(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03e7, code lost:
        r1 = (defpackage.ek) r1;
        r2 = java.lang.Long.hashCode(r3.T);
        r4 = r3.m();
        r0 = defpackage.gw8.E(r3, r0);
        defpackage.ux0.d.getClass();
        r5 = defpackage.tx0.b;
        r3.i0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0403, code lost:
        if (r3.S == false) goto L_0x0409;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0405, code lost:
        r3.l(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0409, code lost:
        r3.r0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x040c, code lost:
        defpackage.g75.Q(defpackage.tx0.f, r3, r1);
        defpackage.g75.Q(defpackage.tx0.e, r3, r4);
        defpackage.g75.C(r3, java.lang.Integer.valueOf(r2), defpackage.tx0.g);
        defpackage.g75.O(r3, defpackage.tx0.h);
        defpackage.g75.Q(defpackage.tx0.d, r3, r0);
        r3.e0(758586195);
        r0 = r12.size();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0434, code lost:
        if (r1 >= r0) goto L_0x046c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0436, code lost:
        r2 = r12.get(r1);
        r3.c0(1420119555, r10.y(r2));
        r2 = (defpackage.gs2) r9.g(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x044a, code lost:
        if (r2 != null) goto L_0x0457;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x044c, code lost:
        r3.e0(1074069702);
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0453, code lost:
        r3.r(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0457, code lost:
        r4 = false;
        r3.e0(1420120731);
        r2.H(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0466, code lost:
        r3.r(r4);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x046c, code lost:
        r3.r(false);
        r3.r(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0475, code lost:
        defpackage.ku4.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0478, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00cd, code lost:
        if (r14 == r15) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00cf, code lost:
        r14 = new defpackage.yx6();
        r14.addAll(defpackage.qs.p1(new java.lang.Object[]{r1.a.H0()}));
        r12.o0(r14);
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00e8, code lost:
        r6 = (defpackage.yx6) r14;
        r14 = r1.e;
        r2 = r1.d;
        r19 = r0;
        r20 = r1.a;
        r0 = r14.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00fa, code lost:
        if (r4 != 4) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00fc, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00fe, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00ff, code lost:
        r0 = r12.g(r0) | r1;
        r1 = r12.Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0108, code lost:
        if (r0 != false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x010a, code lost:
        if (r1 != r15) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x010c, code lost:
        r0 = defpackage.bg6.a;
        r1 = new defpackage.tp4();
        r12.o0(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0116, code lost:
        r0 = (defpackage.tp4) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0121, code lost:
        if (r6.contains(r20.H0()) != false) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0123, code lost:
        r6.clear();
        r6.add(r20.H0());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0139, code lost:
        if (defpackage.sg3.e(r20.H0(), r2.getValue()) == false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x013f, code lost:
        if (r14.getValue() != null) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0146, code lost:
        if (r6.size() != 1) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0155, code lost:
        if (defpackage.sg3.e(r6.get(0), r20.H0()) != false) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0157, code lost:
        r6.clear();
        r6.add(r20.H0());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0164, code lost:
        if (r0.e != 1) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x016e, code lost:
        if (r0.c(r20.H0()) == false) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0170, code lost:
        r0.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0173, code lost:
        r5.b = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0175, code lost:
        r1 = r14.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0179, code lost:
        if (r1 == null) goto L_0x01cc;
     */
    public static final void d(defpackage.mm7 r25, defpackage.ml4 r26, defpackage.vr2 r27, defpackage.jb r28, defpackage.vr2 r29, defpackage.vr2 r30, defpackage.fw0 r31, defpackage.yt2 r32, int r33) {
        /*
            r1 = r25
            r8 = r26
            r3 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r32
            r13 = r33
            r0 = 1935038908(0x735659bc, float:1.6982598E31)
            r12.g0(r0)
            r0 = r13 & 6
            r2 = 4
            if (r0 != 0) goto L_0x0026
            boolean r0 = r12.g(r1)
            if (r0 == 0) goto L_0x0023
            r0 = r2
            goto L_0x0024
        L_0x0023:
            r0 = 2
        L_0x0024:
            r0 = r0 | r13
            goto L_0x0027
        L_0x0026:
            r0 = r13
        L_0x0027:
            r4 = r13 & 48
            if (r4 != 0) goto L_0x0037
            boolean r4 = r12.g(r8)
            if (r4 == 0) goto L_0x0034
            r4 = 32
            goto L_0x0036
        L_0x0034:
            r4 = 16
        L_0x0036:
            r0 = r0 | r4
        L_0x0037:
            r4 = r13 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0047
            boolean r4 = r12.i(r3)
            if (r4 == 0) goto L_0x0044
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0046
        L_0x0044:
            r4 = 128(0x80, float:1.8E-43)
        L_0x0046:
            r0 = r0 | r4
        L_0x0047:
            r4 = r13 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0057
            boolean r4 = r12.g(r9)
            if (r4 == 0) goto L_0x0054
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0056
        L_0x0054:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0056:
            r0 = r0 | r4
        L_0x0057:
            r4 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0067
            boolean r4 = r12.i(r10)
            if (r4 == 0) goto L_0x0064
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0066
        L_0x0064:
            r4 = 8192(0x2000, float:1.148E-41)
        L_0x0066:
            r0 = r0 | r4
        L_0x0067:
            r4 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 & r13
            if (r4 != 0) goto L_0x0078
            boolean r4 = r12.i(r11)
            if (r4 == 0) goto L_0x0075
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0077
        L_0x0075:
            r4 = 65536(0x10000, float:9.1835E-41)
        L_0x0077:
            r0 = r0 | r4
        L_0x0078:
            r4 = 1572864(0x180000, float:2.204052E-39)
            r4 = r4 & r13
            r7 = r31
            if (r4 != 0) goto L_0x008b
            boolean r4 = r12.i(r7)
            if (r4 == 0) goto L_0x0088
            r4 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x008a
        L_0x0088:
            r4 = 524288(0x80000, float:7.34684E-40)
        L_0x008a:
            r0 = r0 | r4
        L_0x008b:
            r4 = 599187(0x92493, float:8.3964E-40)
            r4 = r4 & r0
            r6 = 599186(0x92492, float:8.39638E-40)
            if (r4 == r6) goto L_0x0096
            r4 = 1
            goto L_0x0097
        L_0x0096:
            r4 = 0
        L_0x0097:
            r6 = r0 & 1
            boolean r4 = r12.V(r6, r4)
            if (r4 == 0) goto L_0x0479
            t37 r4 = defpackage.xy0.n
            java.lang.Object r4 = r12.k(r4)
            ey3 r4 = (defpackage.ey3) r4
            r4 = r0 & 14
            if (r4 != r2) goto L_0x00ad
            r6 = 1
            goto L_0x00ae
        L_0x00ad:
            r6 = 0
        L_0x00ae:
            java.lang.Object r5 = r12.Q()
            d63 r15 = defpackage.ay0.a
            if (r6 != 0) goto L_0x00b8
            if (r5 != r15) goto L_0x00c0
        L_0x00b8:
            mk r5 = new mk
            r5.<init>(r1, r9)
            r12.o0(r5)
        L_0x00c0:
            mk r5 = (defpackage.mk) r5
            if (r4 != r2) goto L_0x00c6
            r6 = 1
            goto L_0x00c7
        L_0x00c6:
            r6 = 0
        L_0x00c7:
            java.lang.Object r14 = r12.Q()
            if (r6 != 0) goto L_0x00cf
            if (r14 != r15) goto L_0x00e8
        L_0x00cf:
            in8 r6 = r1.a
            java.lang.Object r6 = r6.H0()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            yx6 r14 = new yx6
            r14.<init>()
            java.util.List r6 = defpackage.qs.p1(r6)
            r14.addAll(r6)
            r12.o0(r14)
        L_0x00e8:
            r6 = r14
            yx6 r6 = (defpackage.yx6) r6
            ed5 r14 = r1.e
            ed5 r2 = r1.d
            r19 = r0
            in8 r0 = r1.a
            r20 = r0
            java.lang.Object r0 = r14.getValue()
            r1 = 4
            if (r4 != r1) goto L_0x00fe
            r1 = 1
            goto L_0x00ff
        L_0x00fe:
            r1 = 0
        L_0x00ff:
            boolean r0 = r12.g(r0)
            r0 = r0 | r1
            java.lang.Object r1 = r12.Q()
            if (r0 != 0) goto L_0x010c
            if (r1 != r15) goto L_0x0116
        L_0x010c:
            long[] r0 = defpackage.bg6.a
            tp4 r1 = new tp4
            r1.<init>()
            r12.o0(r1)
        L_0x0116:
            r0 = r1
            tp4 r0 = (defpackage.tp4) r0
            java.lang.Object r1 = r20.H0()
            boolean r1 = r6.contains(r1)
            if (r1 != 0) goto L_0x012d
            r6.clear()
            java.lang.Object r1 = r20.H0()
            r6.add(r1)
        L_0x012d:
            java.lang.Object r1 = r20.H0()
            java.lang.Object r4 = r2.getValue()
            boolean r1 = defpackage.sg3.e(r1, r4)
            if (r1 == 0) goto L_0x0175
            java.lang.Object r1 = r14.getValue()
            if (r1 != 0) goto L_0x0175
            int r1 = r6.size()
            r4 = 1
            if (r1 != r4) goto L_0x0157
            r1 = 0
            java.lang.Object r4 = r6.get(r1)
            java.lang.Object r1 = r20.H0()
            boolean r1 = defpackage.sg3.e(r4, r1)
            if (r1 != 0) goto L_0x0161
        L_0x0157:
            r6.clear()
            java.lang.Object r1 = r20.H0()
            r6.add(r1)
        L_0x0161:
            int r1 = r0.e
            r4 = 1
            if (r1 != r4) goto L_0x0170
            java.lang.Object r1 = r20.H0()
            boolean r1 = r0.c(r1)
            if (r1 == 0) goto L_0x0173
        L_0x0170:
            r0.a()
        L_0x0173:
            r5.b = r9
        L_0x0175:
            java.lang.Object r1 = r14.getValue()
            if (r1 == 0) goto L_0x01cc
            java.lang.Object r4 = r20.H0()
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x01cc
            java.util.ListIterator r4 = r6.listIterator()
            r21 = 0
        L_0x018b:
            r22 = r4
            d03 r22 = (defpackage.d03) r22
            boolean r23 = r22.hasNext()
            if (r23 == 0) goto L_0x01b4
            r23 = r2
            java.lang.Object r2 = r22.next()
            java.lang.Object r2 = r10.y(r2)
            java.lang.Object r3 = r10.y(r1)
            boolean r2 = defpackage.sg3.e(r2, r3)
            if (r2 == 0) goto L_0x01ad
            r2 = r21
        L_0x01ab:
            r3 = -1
            goto L_0x01b8
        L_0x01ad:
            int r21 = r21 + 1
            r3 = r27
            r2 = r23
            goto L_0x018b
        L_0x01b4:
            r23 = r2
            r2 = -1
            goto L_0x01ab
        L_0x01b8:
            if (r2 != r3) goto L_0x01be
            r6.add(r1)
            goto L_0x01ce
        L_0x01be:
            java.lang.Object r3 = r6.get(r2)
            boolean r3 = defpackage.sg3.e(r3, r1)
            if (r3 != 0) goto L_0x01ce
            r6.set(r2, r1)
            goto L_0x01ce
        L_0x01cc:
            r23 = r2
        L_0x01ce:
            java.lang.Object r1 = r20.H0()
            java.lang.Object r2 = r23.getValue()
            boolean r1 = defpackage.sg3.e(r1, r2)
            if (r1 != 0) goto L_0x0234
            java.util.ListIterator r1 = r6.listIterator()
            r2 = 0
        L_0x01e1:
            r3 = r1
            d03 r3 = (defpackage.d03) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0206
            java.lang.Object r3 = r3.next()
            java.lang.Object r3 = r10.y(r3)
            java.lang.Object r4 = r23.getValue()
            java.lang.Object r4 = r10.y(r4)
            boolean r3 = defpackage.sg3.e(r3, r4)
            if (r3 == 0) goto L_0x0203
            r3 = r2
        L_0x0201:
            r1 = -1
            goto L_0x0208
        L_0x0203:
            int r2 = r2 + 1
            goto L_0x01e1
        L_0x0206:
            r3 = -1
            goto L_0x0201
        L_0x0208:
            if (r3 != r1) goto L_0x0212
            java.lang.Object r1 = r23.getValue()
            r6.add(r1)
            goto L_0x0234
        L_0x0212:
            java.lang.Object r1 = r6.get(r3)
            java.lang.Object r2 = r23.getValue()
            boolean r1 = defpackage.sg3.e(r1, r2)
            if (r1 == 0) goto L_0x022a
            int r1 = r6.size()
            r17 = 1
            int r1 = r1 + -1
            if (r3 == r1) goto L_0x0234
        L_0x022a:
            r6.remove((int) r3)
            java.lang.Object r1 = r23.getValue()
            r6.add(r1)
        L_0x0234:
            java.lang.Object r1 = r14.getValue()
            boolean r2 = r12.g(r1)
            java.lang.Object r3 = r12.Q()
            if (r2 != 0) goto L_0x0244
            if (r3 != r15) goto L_0x0255
        L_0x0244:
            if (r1 == 0) goto L_0x0251
            hf5 r2 = new hf5
            java.lang.Object r3 = r23.getValue()
            r2.<init>(r5, r3, r1)
            r3 = r2
            goto L_0x0252
        L_0x0251:
            r3 = 0
        L_0x0252:
            r12.o0(r3)
        L_0x0255:
            hf5 r3 = (defpackage.hf5) r3
            boolean r2 = r12.g(r3)
            r18 = 458752(0x70000, float:6.42848E-40)
            r4 = r19 & r18
            r18 = r2
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r4 != r2) goto L_0x0267
            r2 = 1
            goto L_0x0268
        L_0x0267:
            r2 = 0
        L_0x0268:
            r2 = r18 | r2
            java.lang.Object r4 = r12.Q()
            if (r2 != 0) goto L_0x0276
            if (r4 != r15) goto L_0x0273
            goto L_0x0276
        L_0x0273:
            r2 = r4
            r4 = 0
            goto L_0x0288
        L_0x0276:
            if (r3 == 0) goto L_0x027e
            java.lang.Object r2 = r11.y(r3)
            if (r2 != 0) goto L_0x0280
        L_0x027e:
            r4 = 0
            goto L_0x0284
        L_0x0280:
            defpackage.ku4.a()
            return
        L_0x0284:
            r12.o0(r4)
            r2 = r4
        L_0x0288:
            if (r2 != 0) goto L_0x0475
            java.lang.Object r2 = r23.getValue()
            boolean r2 = r0.b(r2)
            if (r2 == 0) goto L_0x02b9
            java.lang.Object r2 = r20.H0()
            boolean r2 = r0.b(r2)
            if (r2 == 0) goto L_0x02b9
            if (r1 == 0) goto L_0x02a7
            boolean r1 = r0.b(r1)
            if (r1 != 0) goto L_0x02a7
            goto L_0x02b9
        L_0x02a7:
            r1 = -298958042(0xffffffffee2e4326, float:-1.3482892E28)
            r12.e0(r1)
            r1 = 0
            r12.r(r1)
            r9 = r0
            r21 = r4
            r7 = r5
            r0 = r6
            r6 = r27
            goto L_0x0306
        L_0x02b9:
            r1 = -302678073(0xffffffffedf57fc7, float:-9.4972876E27)
            r12.e0(r1)
            r0.a()
            int r1 = r6.size()
            r2 = 0
        L_0x02c7:
            if (r2 >= r1) goto L_0x02fb
            r16 = r1
            java.lang.Object r1 = r6.get(r2)
            r18 = r0
            bk r0 = new bk
            r21 = r4
            r9 = r18
            r4 = r27
            r18 = r2
            r2 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r2 = r0
            r7 = r5
            r0 = r6
            r6 = r4
            r4 = 427839334(0x19804f66, float:1.3266959E-23)
            fw0 r2 = defpackage.su0.J(r4, r2, r12)
            r9.m(r1, r2)
            int r2 = r18 + 1
            r6 = r0
            r0 = r9
            r1 = r16
            r4 = r21
            r9 = r28
            r7 = r31
            goto L_0x02c7
        L_0x02fb:
            r9 = r0
            r21 = r4
            r7 = r5
            r0 = r6
            r1 = 0
            r6 = r27
            r12.r(r1)
        L_0x0306:
            gm7 r1 = r25.f()
            java.lang.Object r2 = r14.getValue()
            boolean r3 = r12.g(r7)
            boolean r1 = r12.g(r1)
            r1 = r1 | r3
            boolean r2 = r12.g(r2)
            r1 = r1 | r2
            java.lang.Object r2 = r12.Q()
            if (r1 != 0) goto L_0x0324
            if (r2 != r15) goto L_0x032e
        L_0x0324:
            java.lang.Object r1 = r6.y(r7)
            r2 = r1
            k51 r2 = (defpackage.k51) r2
            r12.o0(r2)
        L_0x032e:
            k51 r2 = (defpackage.k51) r2
            mm7 r1 = r7.a
            boolean r3 = r12.g(r7)
            java.lang.Object r4 = r12.Q()
            if (r3 != 0) goto L_0x033e
            if (r4 != r15) goto L_0x0347
        L_0x033e:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            ed5 r4 = defpackage.u55.p(r3)
            r12.o0(r4)
        L_0x0347:
            aq4 r4 = (defpackage.aq4) r4
            bv6 r2 = r2.d
            aq4 r14 = defpackage.u55.v(r2, r12)
            in8 r2 = r1.a
            java.lang.Object r2 = r2.H0()
            ed5 r1 = r1.d
            java.lang.Object r1 = r1.getValue()
            boolean r1 = defpackage.sg3.e(r2, r1)
            if (r1 == 0) goto L_0x0367
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r4.setValue(r1)
            goto L_0x0372
        L_0x0367:
            java.lang.Object r1 = r14.getValue()
            if (r1 == 0) goto L_0x0372
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r4.setValue(r1)
        L_0x0372:
            java.lang.Object r1 = r4.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            jl4 r16 = defpackage.jl4.w
            if (r1 == 0) goto L_0x03bd
            r1 = 1353077497(0x50a652f9, float:2.2323644E10)
            r12.e0(r1)
            r1 = r0
            mm7 r0 = r7.a
            r2 = r1
            lo7 r1 = defpackage.we.C
            r4 = 0
            r5 = 2
            r3 = r2
            r2 = 0
            r24 = r12
            r12 = r3
            r3 = r24
            bm7 r4 = defpackage.rc9.D(r0, r1, r2, r3, r4, r5)
            boolean r0 = r3.g(r4)
            java.lang.Object r1 = r3.Q()
            if (r0 != 0) goto L_0x03a5
            if (r1 != r15) goto L_0x03b2
        L_0x03a5:
            java.lang.Object r0 = r14.getValue()
            bv6 r0 = (defpackage.bv6) r0
            ml4 r1 = defpackage.we.g(r16)
            r3.o0(r1)
        L_0x03b2:
            r16 = r1
            ml4 r16 = (defpackage.ml4) r16
            r1 = 0
            r3.r(r1)
        L_0x03ba:
            r0 = r16
            goto L_0x03cc
        L_0x03bd:
            r3 = r12
            r1 = 0
            r12 = r0
            r0 = 1353343539(0x50aa6233, float:2.2868498E10)
            r3.e0(r0)
            r3.r(r1)
            r4 = r21
            goto L_0x03ba
        L_0x03cc:
            ik r1 = new ik
            r1.<init>(r4, r14, r7)
            ml4 r0 = r0.d(r1)
            ml4 r0 = r8.d(r0)
            java.lang.Object r1 = r3.Q()
            if (r1 != r15) goto L_0x03e7
            ek r1 = new ek
            r1.<init>(r7)
            r3.o0(r1)
        L_0x03e7:
            ek r1 = (defpackage.ek) r1
            long r4 = r3.T
            int r2 = java.lang.Long.hashCode(r4)
            vf5 r4 = r3.m()
            ml4 r0 = defpackage.gw8.E(r3, r0)
            tx0 r5 = defpackage.ux0.d
            r5.getClass()
            vy0 r5 = defpackage.tx0.b
            r3.i0()
            boolean r7 = r3.S
            if (r7 == 0) goto L_0x0409
            r3.l(r5)
            goto L_0x040c
        L_0x0409:
            r3.r0()
        L_0x040c:
            ck r5 = defpackage.tx0.f
            defpackage.g75.Q(r5, r3, r1)
            ck r1 = defpackage.tx0.e
            defpackage.g75.Q(r1, r3, r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            ck r2 = defpackage.tx0.g
            defpackage.g75.C(r3, r1, r2)
            ce r1 = defpackage.tx0.h
            defpackage.g75.O(r3, r1)
            ck r1 = defpackage.tx0.d
            defpackage.g75.Q(r1, r3, r0)
            r0 = 758586195(0x2d371b53, float:1.0408413E-11)
            r3.e0(r0)
            int r0 = r12.size()
            r1 = 0
        L_0x0434:
            if (r1 >= r0) goto L_0x046c
            java.lang.Object r2 = r12.get(r1)
            r4 = 1420119555(0x54a54e03, float:5.6798274E12)
            java.lang.Object r5 = r10.y(r2)
            r3.c0(r4, r5)
            java.lang.Object r2 = r9.g(r2)
            gs2 r2 = (defpackage.gs2) r2
            if (r2 != 0) goto L_0x0457
            r2 = 1074069702(0x400500c6, float:2.0781722)
            r3.e0(r2)
            r4 = 0
        L_0x0453:
            r3.r(r4)
            goto L_0x0466
        L_0x0457:
            r4 = 0
            r5 = 1420120731(0x54a5529b, float:5.680444E12)
            r3.e0(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r2.H(r3, r5)
            goto L_0x0453
        L_0x0466:
            r3.r(r4)
            int r1 = r1 + 1
            goto L_0x0434
        L_0x046c:
            r4 = 0
            r3.r(r4)
            r4 = 1
            r3.r(r4)
            goto L_0x047e
        L_0x0475:
            defpackage.ku4.a()
            return
        L_0x0479:
            r6 = r3
            r3 = r12
            r3.Y()
        L_0x047e:
            yx5 r9 = r3.v()
            if (r9 == 0) goto L_0x0496
            wj r0 = new wj
            r1 = r25
            r4 = r28
            r7 = r31
            r3 = r6
            r2 = r8
            r5 = r10
            r6 = r11
            r8 = r13
            r0.<init>((defpackage.mm7) r1, (defpackage.ml4) r2, (defpackage.vr2) r3, (defpackage.jb) r4, (defpackage.vr2) r5, (defpackage.vr2) r6, (defpackage.fw0) r7, (int) r8)
            r9.d = r0
        L_0x0496:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd1.d(mm7, ml4, vr2, jb, vr2, vr2, fw0, yt2, int):void");
    }

    public static final void e(y31 y31, yt2 yt2, int i2) {
        int i3;
        boolean z;
        yb5 yb5;
        y31 y312 = y31;
        yt2 yt22 = yt2;
        yt22.g0(-464014036);
        if (yt22.g(y312)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i2 | i3;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i4 & 1, z)) {
            sd2 sd2 = yu6.a;
            au0 a2 = zt0.a(wr.c, xb4.K, yt22, 0);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E = gw8.E(yt22, sd2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, a2);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m2);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E);
            ml4 M = x91.M(sd2, 0.0f, 8.0f, 1);
            ea6 a3 = ca6.a(wr.a, xb4.I, yt22, 48);
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m3 = yt22.m();
            ml4 E2 = gw8.E(yt22, M);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, a3);
            g75.Q(ckVar2, yt22, m3);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E2);
            int ordinal = y312.c.ordinal();
            if (ordinal == 0) {
                yb5 = new yb5(b96.x(), new jt0(x08.d()));
            } else if (ordinal == 1) {
                yb5 = new yb5(mp7.V(), new jt0(x08.c()));
            } else if (ordinal == 2) {
                x83 p = t75.p();
                int i5 = x08.b;
                yb5 = new yb5(p, new jt0(x08.f(uq3.d(4279974492L), uq3.d(4288329942L))));
            } else {
                h.c();
                return;
            }
            long j2 = ((jt0) yb5.x).a;
            jl4 jl4 = jl4.w;
            yt2 yt23 = yt2;
            d83.a((x83) yb5.w, (String) null, yu6.l(jl4, 20.0f), j2, yt23, 432, 0);
            k75.a(yt23, yu6.p(jl4, 12.0f));
            yt2 yt24 = yt2;
            yf7.b(y312.a, new lz3(1.0f, true), x08.a(), ya5.k(14), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, 24576, 0, 262120);
            yf7.b(y312.b, (ml4) null, x08.e(), ya5.k(13), am2.A, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, 1597440, 0, 262058);
            yt22 = yt24;
            yt22.r(true);
            kl8.c((ml4) null, 0.0f, x08.f(uq3.d(4292666861L), uq3.d(4281090902L)), yt22, 0, 3);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new yg(i2, 4, y312);
        }
    }

    public static final void f(ru4 ru4, is2 is2, e41 e41, yt2 yt2, int i2) {
        int i3;
        boolean z;
        e41 e412;
        e41 e413;
        Character ch;
        String str;
        ru4 ru42 = ru4;
        yt2 yt22 = yt2;
        is2.getClass();
        yt22.g0(805052115);
        if (yt22.i(ru42)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i2 | i3 | 128;
        if ((i4 & 131) != 130) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i4 & 1, z)) {
            yt22.a0();
            if ((i2 & 1) == 0 || yt22.C()) {
                a68 a2 = va4.a(yt22);
                if (a2 != null) {
                    e413 = (e41) n85.p(b26.a.b(e41.class), a2, b96.O(o85.l(a2), yt22), o85.k(a2), yt22);
                } else {
                    h.s("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            } else {
                yt22.Y();
                e413 = e41;
            }
            yt22.s();
            aq4 n2 = hj8.n(e413.i, yt22);
            String str2 = e413.e;
            String str3 = e413.f;
            str2.getClass();
            if (str2.length() == 0) {
                ch = null;
            } else {
                ch = Character.valueOf(str2.charAt(0));
            }
            if (ch != null) {
                String valueOf = String.valueOf(ch.charValue());
                valueOf.getClass();
                str = valueOf.toUpperCase(Locale.ROOT);
                str.getClass();
            } else {
                str = "?";
            }
            String str4 = str;
            aa5.c((ml4) null, su0.J(1841032847, new c41(ru42, 0), yt22), (gs2) null, (gs2) null, su0.J(-413614612, new yg(3, e413), yt22), 0, x08.b(), 0, (aa8) null, su0.J(-1512326620, new d41(e413, n2, str4, str2, str3, 0), yt22), yt22, 805330992, 429);
            e412 = e413;
        } else {
            yt2.Y();
            e412 = e41;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new y30(i2, 10, ru42, is2, e412);
        }
    }

    public static final void g(boolean z, vr2 vr2, ml4 ml4, fw0 fw0, yt2 yt2, int i2) {
        int i3;
        boolean z2;
        jl4 jl4;
        vr2 vr22;
        boolean z3;
        int i4;
        Object obj;
        int i5;
        o98 o98;
        o92 o92;
        aq4 aq4;
        boolean z4;
        boolean z5 = z;
        yt2 yt22 = yt2;
        yt22.g0(1597265892);
        if (yt22.h(z5)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3 | 384;
        if ((i6 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i6 & 1, z2)) {
            View view = (View) yt22.k(ye.f);
            boolean g2 = yt22.g((Configuration) yt22.k(ye.a)) | yt22.g(view);
            Object Q = yt22.Q();
            Object obj2 = ay0.a;
            if (g2 || Q == obj2) {
                Q = new o98(view);
                yt22.o0(Q);
            }
            o98 o982 = (o98) Q;
            tp1 tp1 = (tp1) yt22.k(xy0.h);
            float f2 = fj4.a;
            int r0 = tp1.r0(48.0f);
            Object Q2 = yt22.Q();
            if (Q2 == obj2) {
                Q2 = u55.p((Object) null);
                yt22.o0(Q2);
            }
            aq4 aq42 = (aq4) Q2;
            Object Q3 = yt22.Q();
            if (Q3 == obj2) {
                Q3 = new bd5(0);
                yt22.o0(Q3);
            }
            bd5 bd5 = (bd5) Q3;
            Object Q4 = yt22.Q();
            if (Q4 == obj2) {
                Q4 = new bd5(0);
                yt22.o0(Q4);
            }
            bd5 bd52 = (bd5) Q4;
            Object Q5 = yt22.Q();
            if (Q5 == obj2) {
                Q5 = new ok2();
                yt22.o0(Q5);
            }
            ok2 ok2 = (ok2) Q5;
            gy6 gy6 = (gy6) yt22.k(xy0.r);
            String i7 = h75.i(R.string.m3c_dropdown_menu_expanded, yt22);
            String i8 = h75.i(R.string.m3c_dropdown_menu_collapsed, yt22);
            String i9 = h75.i(R.string.m3c_dropdown_menu_toggle, yt22);
            Object Q6 = yt22.Q();
            if (Q6 == obj2) {
                Q6 = u55.p(new Object());
                yt22.o0(Q6);
            }
            aq4 aq43 = (aq4) Q6;
            Object Q7 = yt22.Q();
            if (Q7 == obj2) {
                Q7 = u55.p(Boolean.FALSE);
                yt22.o0(Q7);
            }
            aq4 aq44 = (aq4) Q7;
            int i10 = i6 & 14;
            if (i10 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean g3 = z3 | yt22.g(o982) | yt22.g(tp1);
            Object Q8 = yt22.Q();
            if (g3 || Q8 == obj2) {
                i4 = i10;
                aq4 aq45 = aq44;
                i5 = r0;
                obj = obj2;
                String str = i9;
                String str2 = i7;
                aq4 aq46 = aq43;
                o98 = o982;
                boolean z6 = z5;
                ok2 ok22 = ok2;
                o92 = new o92(ok22, z6, aq45, str2, i8, str, gy6, aq46, vr2, bd5, bd52);
                ok2 = ok22;
                z5 = z6;
                yt22.o0(o92);
            } else {
                i4 = i10;
                o98 = o982;
                obj = obj2;
                o92 = Q8;
                i5 = r0;
            }
            o92 o922 = o92;
            boolean i11 = yt22.i(o98) | yt22.e(i5);
            Object Q9 = yt22.Q();
            if (i11 || Q9 == obj) {
                Q9 = new wg1((Object) o98, i5, (Object) aq42, (aq4) bd5, (o37) bd52, 1);
                aq4 = aq42;
                yt22.o0(Q9);
            } else {
                aq4 = aq42;
            }
            jl4 jl42 = jl4.w;
            ml4 I = h49.I(jl42, (vr2) Q9);
            lh4 d2 = mb0.d(xb4.y, false);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E = gw8.E(yt22, I);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, d2);
            g75.Q(tx0.e, yt22, m2);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            fw0.u(o922, yt22, 48);
            boolean z7 = true;
            yt22.r(true);
            if (z5) {
                yt22.e0(209857027);
                boolean i12 = yt22.i(o98) | yt22.e(i5);
                Object Q10 = yt22.Q();
                if (i12 || Q10 == obj) {
                    Q10 = new l92(o98, i5, aq4, bd52);
                    yt22.o0(Q10);
                }
                z4 = false;
                ie1.g((sr2) Q10, yt22, 0);
                yt22.r(false);
            } else {
                z4 = false;
                yt22.e0(210190494);
                yt22.r(false);
            }
            int i13 = i4;
            if (i13 != 4) {
                z7 = z4;
            }
            Object Q11 = yt22.Q();
            if (z7 || Q11 == obj) {
                Q11 = new j11(3, ok2, z5);
                yt22.o0(Q11);
            }
            t49.l((sr2) Q11, yt22);
            Object Q12 = yt22.Q();
            if (Q12 == obj) {
                vr22 = vr2;
                Q12 = new zg1(2, vr22);
                yt22.o0(Q12);
            } else {
                vr22 = vr2;
            }
            ag8.a(z5, (sr2) Q12, yt22, i13);
            jl4 = jl42;
        } else {
            vr22 = vr2;
            fw0 fw02 = fw0;
            yt22.Y();
            jl4 = ml4;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ai0(z5, (ds2) vr22, (Object) jl4, (ds2) fw0, i2, 1);
        }
    }

    public static final void h(sr2 sr2, sr2 sr22, sr2 sr23, ml4 ml4, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        jl4 jl4;
        yt2 yt22 = yt2;
        yt22.g0(-885457286);
        if (yt22.i(sr2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        sr2 sr24 = sr22;
        if (yt22.i(sr24)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (yt22.i(sr23)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5 | 3072;
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i8 & 1, z)) {
            au0 a2 = zt0.a(new ur(12.0f, true, new h(2)), xb4.L, yt22, 54);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            jl4 jl42 = jl4.w;
            ml4 E = gw8.E(yt22, jl42);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(tx0.f, yt22, a2);
            g75.Q(tx0.e, yt22, m2);
            g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
            g75.O(yt22, tx0.h);
            g75.Q(tx0.d, yt22, E);
            long d2 = uq3.d(4284181447L);
            long j2 = jt0.c;
            o96 o96 = q96.a;
            long j3 = d2;
            jl4 jl43 = jl42;
            ag8.c(sr23, yu6.l(jl42, 52.0f), o96, j3, j2, (sh2) null, gl0.i, yt22, ((i8 >> 6) & 14) | 12610608, 96);
            yt22 = yt2;
            ag8.c(sr24, yu6.l(jl43, 52.0f), o96, uq3.d(4282219166L), j2, (sh2) null, gl0.j, yt22, ((i8 >> 3) & 14) | 12610608, 96);
            ag8.c(sr2, yu6.l(jl43, 52.0f), o96, uq3.d(4279391610L), j2, (sh2) null, gl0.k, yt22, (i8 & 14) | 12610608, 96);
            yt22.r(true);
            jl4 = jl43;
        } else {
            yt22.Y();
            jl4 = ml4;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new q60((Object) sr2, (Object) sr22, sr23, jl4, i2, 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0265, code lost:
        if (r12.h(false) == false) goto L_0x0269;
     */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x031f  */
    public static final void i(ml4 ml4, n04 n04, rx2 rx2, la5 la5, eh2 eh2, boolean z, xf xfVar, vr vrVar, tr trVar, vr2 vr2, yt2 yt2, int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        n04 n042;
        boolean z3;
        boolean z4;
        boolean z5;
        z53 z53;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean g2;
        Object Q;
        boolean z13;
        d63 d63;
        ur3 ur3;
        n04 n043;
        ml4 ml42;
        boolean z14;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z15;
        int i15;
        int i16;
        int i17;
        ml4 ml43 = ml4;
        n04 n044 = n04;
        rx2 rx22 = rx2;
        la5 la52 = la5;
        boolean z16 = z;
        vr vrVar2 = vrVar;
        tr trVar2 = trVar;
        yt2 yt22 = yt2;
        int i18 = i2;
        yt22.g0(708740370);
        if ((i18 & 6) == 0) {
            if (yt22.g(ml43)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i4 = i17 | i18;
        } else {
            i4 = i18;
        }
        if ((i18 & 48) == 0) {
            if (yt22.g(n044)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i4 |= i16;
        }
        if ((i18 & 384) == 0) {
            if ((i18 & 512) == 0) {
                z15 = yt22.g(rx22);
            } else {
                z15 = yt22.i(rx22);
            }
            if (z15) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i4 |= i15;
        }
        if ((i18 & 3072) == 0) {
            if (yt22.g(la52)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i4 |= i14;
        }
        if ((i18 & 24576) == 0) {
            if (yt22.h(false)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i4 |= i13;
        }
        if ((i18 & 196608) == 0) {
            if (yt22.h(true)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i4 |= i12;
        }
        eh2 eh22 = eh2;
        if ((i18 & 1572864) == 0) {
            if (yt22.g(eh22)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        }
        if ((i18 & 12582912) == 0) {
            if (yt22.h(z16)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i4 |= i10;
        }
        xf xfVar2 = xfVar;
        if ((i18 & 100663296) == 0) {
            if (yt22.g(xfVar2)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i4 |= i9;
        }
        if ((i18 & 805306368) == 0) {
            if (yt22.g(vrVar2)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i4 |= i8;
        }
        if ((i3 & 6) == 0) {
            if (yt22.g(trVar2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i3 | i7;
        } else {
            i5 = i3;
        }
        vr2 vr22 = vr2;
        if ((i3 & 48) == 0) {
            if (yt22.i(vr22)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i5 |= i6;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 19) == 18) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (yt22.V(i4 & 1, z2)) {
            yt22.a0();
            if ((i18 & 1) != 0 && !yt22.C()) {
                yt22.Y();
            }
            yt22.s();
            int i19 = i4 >> 3;
            int i20 = i19 & 14;
            int i21 = i20 | (i5 & 112);
            aq4 v = u55.v(vr2, yt2);
            int i22 = i4;
            if ((((i21 & 14) ^ 6) <= 4 || !yt22.g(n044)) && (i21 & 6) != 4) {
                z3 = false;
            } else {
                z3 = true;
            }
            Object Q2 = yt22.Q();
            d63 d632 = ay0.a;
            if (z3 || Q2 == d632) {
                pe2 pe2 = pe2.L;
                Q2 = new xz3(0, 0, a37.class, u55.j(new qm3(1, (Object) u55.j(new vo2(v, 16), pe2), (Object) n044), pe2), "value", "getValue()Ljava/lang/Object;");
                yt22.o0(Q2);
            }
            ur3 ur32 = (ur3) Q2;
            int i23 = i20 | ((i22 >> 9) & 112);
            if ((((i23 & 14) ^ 6) <= 4 || !yt22.g(n044)) && (i23 & 6) != 4) {
                z4 = false;
            } else {
                z4 = true;
            }
            int i24 = i23;
            if ((((i23 & 112) ^ 48) <= 32 || !yt22.h(false)) && (i24 & 48) != 32) {
                z5 = false;
            } else {
                z5 = true;
            }
            boolean z17 = z5 | z4;
            Object Q3 = yt22.Q();
            if (z17 || Q3 == d632) {
                Q3 = new z34(n044);
                yt22.o0(Q3);
            }
            z34 z34 = (z34) Q3;
            Object Q4 = yt22.Q();
            if (Q4 == d632) {
                Q4 = t49.D(yt22);
                yt22.o0(Q4);
            }
            o81 o81 = (o81) Q4;
            bx2 bx2 = (bx2) yt22.k(xy0.g);
            ur3 ur33 = ur32;
            if (!((Boolean) yt22.k(xy0.y)).booleanValue()) {
                z53 = z37.a;
            } else {
                z53 = null;
            }
            z53 z532 = z53;
            int i25 = (i22 & 524272) | ((i5 << 18) & 3670016) | ((i22 >> 6) & 29360128);
            o81 o812 = o81;
            if ((((i25 & 112) ^ 48) <= 32 || !yt22.g(n044)) && (i25 & 48) != 32) {
                z6 = false;
            } else {
                z6 = true;
            }
            if ((((i25 & 896) ^ 384) <= 256 || !yt22.g(rx22)) && (i25 & 384) != 256) {
                z7 = false;
            } else {
                z7 = true;
            }
            boolean z18 = z7 | z6;
            if ((((i25 & 7168) ^ 3072) <= 2048 || !yt22.g(la52)) && (i25 & 3072) != 2048) {
                z8 = false;
            } else {
                z8 = true;
            }
            boolean z19 = z18 | z8;
            if (((57344 & i25) ^ 24576) > 16384) {
            }
            if ((i25 & 24576) != 16384) {
                z9 = false;
                boolean z20 = z19 | z9;
                if ((((458752 & i25) ^ 196608) <= 131072 || !yt22.h(true)) && (i25 & 196608) != 131072) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean z21 = z20 | z10;
                if ((((i25 & 3670016) ^ 1572864) <= 1048576 || !yt22.g(trVar2)) && (i25 & 1572864) != 1048576) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean z22 = z21 | z11;
                if ((((i25 & 29360128) ^ 12582912) <= 8388608 || !yt22.g(vrVar2)) && (i25 & 12582912) != 8388608) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                g2 = z22 | z12 | yt22.g(bx2);
                Q = yt22.Q();
                if (!g2 || Q == d632) {
                    d63 = d632;
                    ur3 ur34 = ur33;
                    z13 = true;
                    n043 = n04;
                    b04 b04 = new b04(n043, la52, ur34, rx22, vrVar2, trVar2, o812, bx2, z532);
                    ur3 = ur34;
                    yt22.o0(b04);
                    Q = b04;
                } else {
                    n043 = n04;
                    d63 = d632;
                    ur3 = ur33;
                    z13 = true;
                }
                i24 i242 = (i24) Q;
                z75 z75 = z75.w;
                if (!z16) {
                    yt22.e0(27281635);
                    if (((i20 ^ 6) <= 4 || !yt22.g(n043)) && (i19 & 6) != 4) {
                        z14 = false;
                    } else {
                        z14 = z13;
                    }
                    Object Q5 = yt22.Q();
                    if (z14 || Q5 == d63) {
                        Q5 = new sz3(n043);
                        yt22.o0(Q5);
                    }
                    ml42 = bb0.t0((sz3) Q5, n043.n, z75);
                    yt22.r(false);
                } else {
                    yt22.e0(27577840);
                    yt22.r(false);
                    ml42 = jl4.w;
                }
                xf xfVar3 = xfVar;
                boolean z23 = z16;
                n042 = n043;
                ur3 ur35 = ur3;
                b96.b(ur35, rc9.R0(gl0.Y(ed1.t(ml43.d(n043.k).d(n043.l), ur3, z34, z75, z16).d(ml42), n043.m), n043, z75, xfVar3, z23, eh2, n043.f, (ta5) null), n042.o, i242, yt22, 0);
            }
            z9 = true;
            boolean z202 = z19 | z9;
            if ((((458752 & i25) ^ 196608) <= 131072 || !yt22.h(true)) && (i25 & 196608) != 131072) {
            }
            boolean z212 = z202 | z10;
            if ((((i25 & 3670016) ^ 1572864) <= 1048576 || !yt22.g(trVar2)) && (i25 & 1572864) != 1048576) {
            }
            boolean z222 = z212 | z11;
            if ((((i25 & 29360128) ^ 12582912) <= 8388608 || !yt22.g(vrVar2)) && (i25 & 12582912) != 8388608) {
            }
            g2 = z222 | z12 | yt22.g(bx2);
            Q = yt22.Q();
            if (!g2) {
            }
            d63 = d632;
            ur3 ur342 = ur33;
            z13 = true;
            n043 = n04;
            b04 b042 = new b04(n043, la52, ur342, rx22, vrVar2, trVar2, o812, bx2, z532);
            ur3 = ur342;
            yt22.o0(b042);
            Q = b042;
            i24 i2422 = (i24) Q;
            z75 z752 = z75.w;
            if (!z16) {
            }
            xf xfVar32 = xfVar;
            boolean z232 = z16;
            n042 = n043;
            ur3 ur352 = ur3;
            b96.b(ur352, rc9.R0(gl0.Y(ed1.t(ml43.d(n043.k).d(n043.l), ur3, z34, z752, z16).d(ml42), n043.m), n043, z752, xfVar32, z232, eh2, n043.f, (ta5) null), n042.o, i2422, yt22, 0);
        } else {
            n042 = n044;
            yt2.Y();
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new tz3(ml43, n042, rx2, la5, eh2, z, xfVar, vrVar, trVar, vr2, i2, i3);
        }
    }

    public static final void j(bc5 bc5, vr2 vr2, yt2 yt2, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5 = i2;
        yt2.g0(-1134949106);
        if (yt2.i(bc5)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i5;
        if (yt2.i(vr2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if ((i7 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i7 & 1, z)) {
            we.b(yu6.a, q96.a(20.0f), rc9.w(z08.f(), yt2, 24576), rc9.x(62, 0.0f), su0.J(638429916, new gc5(0, (Object) bc5, (Object) vr2), yt2), yt2, 196614, 16);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new dx4(bc5, vr2, i2, 2);
        }
    }

    public static final void k(ru4 ru4, is2 is2, ic5 ic5, yt2 yt2, int i2) {
        int i3;
        int i4;
        boolean z;
        is2.getClass();
        yt2.g0(-1698239072);
        if (yt2.i(ru4)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (yt2.g(is2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4 | 128;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i6 & 1, z)) {
            yt2.a0();
            if ((i2 & 1) == 0 || yt2.C()) {
                a68 a2 = va4.a(yt2);
                if (a2 != null) {
                    ic5 = (ic5) n85.p(b26.a.b(ic5.class), a2, b96.O(o85.l(a2), yt2), o85.k(a2), yt2);
                } else {
                    h.s("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            } else {
                yt2.Y();
            }
            int i7 = i6 & -897;
            yt2.s();
            sg3.c((is7) hj8.n(ic5.d, yt2).getValue(), is2, su0.J(14089724, new d13(ru4, ic5, (Context) yt2.k(ye.b), 4), yt2), yt2, (i7 & 112) | 392);
        } else {
            yt2.Y();
        }
        ic5 ic52 = ic5;
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ou4(i2, 3, ru4, is2, ic52);
        }
    }

    public static final void l(fc5 fc5, ru4 ru4, vr2 vr2, vr2 vr22, sr2 sr2, vr2 vr23, yt2 yt2, int i2) {
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4;
        int i9;
        fc5 fc52 = fc5;
        vr2 vr24 = vr23;
        yt2 yt22 = yt2;
        int i10 = i2;
        yt22.g0(-1227254406);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                z4 = yt22.g(fc52);
            } else {
                z4 = yt22.i(fc52);
            }
            if (z4) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i10;
        } else {
            i3 = i10;
        }
        if ((i10 & 48) == 0) {
            if (yt22.i(ru4)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        } else {
            ru4 ru42 = ru4;
        }
        if ((i10 & 384) == 0) {
            if (yt22.i(vr2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        } else {
            vr2 vr25 = vr2;
        }
        if ((i10 & 3072) == 0) {
            if (yt22.i(vr22)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        } else {
            vr2 vr26 = vr22;
        }
        if ((i10 & 24576) == 0) {
            if (yt22.i(sr2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        } else {
            sr2 sr22 = sr2;
        }
        if ((196608 & i10) == 0) {
            if (yt22.i(vr24)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        int i11 = i3;
        if ((i11 & 74899) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i11 & 1, z)) {
            sd2 sd2 = yu6.c;
            ml4 h2 = b96.h(sd2, z08.c(), gr8.h);
            WeakHashMap weakHashMap = ib8.w;
            ml4 T = x91.T(h2, new e64(n63.h(yt22).l, h75.h));
            au0 a2 = zt0.a(wr.c, xb4.K, yt22, 0);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E = gw8.E(yt22, T);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, a2);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m2);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E);
            sd2 sd22 = yu6.a;
            ml4 L = x91.L(sd22, 4.0f, 4.0f);
            sd2 sd23 = sd2;
            ea6 a3 = ca6.a(wr.a, xb4.I, yt22, 48);
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m3 = yt22.m();
            ml4 E2 = gw8.E(yt22, L);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, a3);
            g75.Q(ckVar2, yt22, m3);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E2);
            yt2 yt23 = yt2;
            hj8.e(ru4, (ml4) null, false, (a83) null, (pq6) null, b96.a, yt23, ((i11 >> 3) & 14) | 1572864, 62);
            yt2 yt24 = yt2;
            yf7.b(l55.u(R.string.pamarillas_screen_title, yt23), (ml4) null, z08.k(), ya5.k(20), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, 1597440, 0, 262058);
            yt2 yt25 = yt24;
            yt25.r(true);
            fc52 = fc5;
            we.b(x91.M(sd22, 16.0f, 0.0f, 2), q96.a(20.0f), rc9.w(z08.f(), yt25, 24576), rc9.x(62, 0.0f), su0.J(115935378, new uo2((Object) fc52, (Object) vr2, (Object) vr22, (Object) sr2, 2), yt25), yt25, 196614, 16);
            if (!fc52.d || !fc52.c.isEmpty()) {
                yt25.e0(-300012346);
                pa5 pa5 = new pa5(16.0f, 12.0f, 16.0f, 12.0f);
                if ((i11 & 14) == 4 || ((i11 & 8) != 0 && yt25.i(fc52))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i11 & 458752) == 131072) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z5 = z3 | z2;
                Object Q = yt25.Q();
                if (z5 || Q == ay0.a) {
                    Q = new w34(16, fc52, vr24);
                    yt25.o0(Q);
                }
                yt2 yt26 = yt2;
                x91.a(sd23, (s34) null, pa5, (vr) null, (ib) null, (eh2) null, false, (xf) null, (vr2) Q, yt26, 390, 506);
                yt22 = yt26;
                yt22.r(false);
            } else {
                yt25.e0(-300339179);
                yt2 yt27 = yt25;
                yf7.b(l55.u(R.string.pamarillas_no_results, yt25), x91.K(new f23(xb4.L), 24.0f), z08.e(), ya5.k(14), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt27, 24576, 0, 262120);
                yt22 = yt27;
                yt22.r(false);
            }
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new dw0((Object) fc52, (Object) ru4, (Object) vr2, (ds2) vr22, (Object) sr2, (ds2) vr24, i2, 6);
        }
    }

    public static final void m(int i2, vr2 vr2, yt2 yt2, String str, String str2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6 = i2;
        vr2 vr22 = vr2;
        yt2 yt22 = yt2;
        String str3 = str2;
        yt22.g0(1118638498);
        if (yt2.g(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i3 | i6;
        if (yt22.i(vr22)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (yt22.g(str3)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if ((i9 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i9 & 1, z)) {
            o96 a2 = q96.a(13.0f);
            long g2 = z08.g();
            int i10 = i9;
            yt2 yt23 = yt22;
            yd7 t = pe2.t(0, 0, z08.g(), g2, 0, z08.a(), z08.h(), 0, 0, yt23, 2147477455);
            sd2 sd2 = yu6.a;
            sd2 sd22 = sd2;
            o96 o96 = a2;
            yt2 yt24 = yt2;
            String str4 = str;
            z85.b(str4, vr22, sd22, false, false, (tg7) null, (gs2) null, su0.J(978466505, new q20(str2, 12), yt23), (gs2) null, (gs2) null, (gs2) null, false, (m78) null, (bt3) null, (zs3) null, true, 0, 0, o96, t, yt24, (i10 & 14) | 12583296 | (i10 & 112), 12582912, 0, 1965944);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new s20(str, vr22, str2, i6);
        }
    }

    public static final void n(g41 g41, yt2 yt2, int i2) {
        int i3;
        boolean z;
        yb5 yb5;
        g41 g412 = g41;
        yt2 yt22 = yt2;
        yt22.g0(-1631819596);
        if (yt22.g(g412)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i2 | i3;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i4 & 1, z)) {
            sd2 sd2 = yu6.a;
            g80 g80 = xb4.K;
            sr srVar = wr.c;
            au0 a2 = zt0.a(srVar, g80, yt22, 0);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            ml4 E = gw8.E(yt22, sd2);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, a2);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m2);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt22, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E);
            ml4 M = x91.M(sd2, 0.0f, 8.0f, 1);
            ea6 a3 = ca6.a(wr.a, xb4.H, yt22, 48);
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m3 = yt22.m();
            ml4 E2 = gw8.E(yt22, M);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, a3);
            g75.Q(ckVar2, yt22, m3);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
            g75.Q(ckVar4, yt22, E2);
            ew6 ew6 = g412.b;
            String str = g412.c;
            int ordinal = ew6.ordinal();
            if (ordinal == 0) {
                yb5 = new yb5(rd3.u(), new jt0(x08.d()));
            } else if (ordinal == 1) {
                yb5 = new yb5(ar7.z(), new jt0(x08.c()));
            } else {
                h.c();
                return;
            }
            long j2 = ((jt0) yb5.x).a;
            jl4 jl4 = jl4.w;
            long j3 = j2;
            ck ckVar5 = ckVar4;
            String str2 = str;
            ck ckVar6 = ckVar3;
            ce ceVar2 = ceVar;
            yt2 yt23 = yt2;
            d83.a((x83) yb5.w, (String) null, yu6.l(jl4, 20.0f), j3, yt23, 432, 0);
            yt2 yt24 = yt23;
            k75.a(yt24, yu6.p(jl4, 12.0f));
            lz3 lz3 = new lz3(1.0f, true);
            au0 a4 = zt0.a(srVar, g80, yt24, 0);
            int hashCode3 = Long.hashCode(yt24.T);
            vf5 m4 = yt24.m();
            ml4 E3 = gw8.E(yt24, lz3);
            yt24.i0();
            if (yt24.S) {
                yt24.l(vy0);
            } else {
                yt24.r0();
            }
            g75.Q(ckVar, yt24, a4);
            g75.Q(ckVar2, yt24, m4);
            f21.s(hashCode3, yt24, ckVar6, yt24, ceVar2);
            g75.Q(ckVar5, yt24, E3);
            String str3 = str2;
            yt2 yt25 = yt2;
            yf7.b(g41.a, (ml4) null, x08.a(), ya5.k(12), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt25, 24576, 0, 262122);
            yt22 = yt25;
            if (!d57.I0(str3)) {
                yt22.e0(-352460755);
                yt2 yt26 = yt2;
                yf7.b(str3, (ml4) null, x08.e(), ya5.k(14), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, ya5.k(18), 0, false, 0, 0, (tg7) null, yt26, 24576, 48, 260074);
                yt22 = yt26;
                yt22.r(false);
            } else {
                yt22.e0(-352229154);
                yt22.r(false);
            }
            yt22.r(true);
            yt22.r(true);
            kl8.c((ml4) null, 0.0f, x08.f(uq3.d(4292666861L), uq3.d(4281090902L)), yt22, 0, 3);
            yt22.r(true);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new yg(i2, 5, g41);
        }
    }

    public static final boolean o(fk6 fk6) {
        ak6 k2 = fk6.k();
        return !k2.w.c(jk6.j);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final boolean p(fk6 fk6, Resources resources) {
        boolean z;
        Object g2 = fk6.d.w.g(jk6.a);
        String str = null;
        if (g2 == null) {
            g2 = null;
        }
        List list = (List) g2;
        if (list != null) {
            str = dt0.y0(list);
        }
        if (str == null && L(fk6) == null && K(fk6, resources) == null && !J(fk6)) {
            z = false;
        } else {
            z = true;
        }
        if (we.z(fk6) || (!fk6.d.y && (!fk6.q() || !z))) {
            return false;
        }
        return true;
    }

    public static final String q(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        return d57.j1(sb.toString());
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[EDGE_INSN: B:30:0x0079->B:25:0x0079 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object r(g97 g97, lk5 lk5, q50 q50) {
        em2 em2;
        Object obj;
        int i2;
        int size;
        int i3;
        p81 p81;
        if (q50 instanceof em2) {
            em2 em22 = (em2) q50;
            int i4 = em22.C;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                em22.C = i4 - Integer.MIN_VALUE;
                em2 = em22;
                obj = em2.B;
                i2 = em2.C;
                if (i2 != 0) {
                    o85.q(obj);
                    List list = g97.B.O.a;
                    int size2 = list.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size2) {
                            break;
                        } else if (((qk5) list.get(i5)).d) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                } else if (i2 == 1) {
                    lk5 lk52 = em2.A;
                    g97 g972 = em2.z;
                    o85.q(obj);
                    g97 g973 = g972;
                    lk5 = lk52;
                    g97 = g973;
                    List list2 = ((kk5) obj).a;
                    size = list2.size();
                    i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        if (((qk5) list2.get(i3)).d) {
                            break;
                        }
                        i3++;
                        break;
                        break;
                    }
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                em2.z = g97;
                em2.A = lk5;
                em2.C = 1;
                obj = g97.c(lk5, em2);
                p81 = p81.w;
                if (obj == p81) {
                    return p81;
                }
                List list22 = ((kk5) obj).a;
                size = list22.size();
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                    }
                    break;
                    i3++;
                }
                return vs7.a;
            }
        }
        em2 = new h61(q50);
        obj = em2.B;
        i2 = em2.C;
        if (i2 != 0) {
        }
        em2.z = g97;
        em2.A = lk5;
        em2.C = 1;
        obj = g97.c(lk5, em2);
        p81 = p81.w;
        if (obj == p81) {
        }
        List list222 = ((kk5) obj).a;
        size = list222.size();
        i3 = 0;
        while (true) {
            if (i3 >= size) {
            }
            break;
            i3++;
        }
        return vs7.a;
    }

    public static final Object s(uk5 uk5, gs2 gs2, f61 f61) {
        Object V0 = ((h97) uk5).V0(new fm2(f61.r(), gs2, (f61) null, 0), f61);
        if (V0 == p81.w) {
            return V0;
        }
        return vs7.a;
    }

    public static final byte t(char c2) {
        if (c2 < '~') {
            return bo0.b[c2];
        }
        return 0;
    }

    public static ji4 u(String str, List list) {
        ii4 ii4;
        vv6 vv6 = new vv6();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ii4 = ii4.b;
            if (!hasNext) {
                break;
            }
            ji4 ji4 = (ji4) it.next();
            if (ji4 != ii4) {
                if (ji4 instanceof vm0) {
                    ji4[] ji4Arr = ((vm0) ji4).c;
                    ji4Arr.getClass();
                    List asList = Arrays.asList(ji4Arr);
                    asList.getClass();
                    vv6.addAll(asList);
                } else {
                    vv6.add(ji4);
                }
            }
        }
        int i2 = vv6.w;
        if (i2 == 0) {
            return ii4;
        }
        if (i2 != 1) {
            return new vm0(str, (ji4[]) vv6.toArray(new ji4[0]));
        }
        return (ji4) vv6.get(0);
    }

    public static qz3 v(pi0 pi0, vw3 vw3, uq4 uq4, rm rmVar, int i2) {
        if (pi0 == null) {
            a(32);
            throw null;
        } else if (rmVar == null) {
            a(33);
            throw null;
        } else if (vw3 == null) {
            return null;
        } else {
            v51 v51 = new v51(pi0, vw3, uq4);
            k26 k26 = xq4.a;
            return new qz3(pi0, v51, rmVar, uq4.e(xq4.b + '_' + i2));
        }
    }

    public static fr5 w(cr5 cr5, rm rmVar) {
        return C(cr5, rmVar, true, cr5.e());
    }

    public static jr5 x(cr5 cr5, rm rmVar) {
        qm qmVar = me6.x;
        sy6 e2 = cr5.e();
        if (e2 != null) {
            return D(cr5, rmVar, qmVar, true, cr5.f(), e2);
        }
        a(6);
        throw null;
    }

    public static er5 y(ql4 ql4) {
        if (ql4 != null) {
            sl4 c2 = rs1.c(ql4);
            c2.getClass();
            kr0 kr0 = (kr0) c2.Z(y37.a);
            ql4 y = r16.y(c2, j27.A);
            if (y == null) {
                return null;
            }
            qm qmVar = me6.x;
            us1 us1 = vs1.e;
            uq4 uq4 = n27.b;
            sy6 e2 = ql4.e();
            us1 us12 = us1;
            fl4 fl4 = fl4.x;
            er5 g1 = er5.g1(ql4, fl4, us12, false, uq4, 4, e2);
            fr5 fr5 = new fr5(g1, qmVar, fl4, us12, false, false, false, 4, (fr5) null, ql4.e());
            g1.j1(fr5, (jr5) null, (lc2) null, (lc2) null);
            ro7.x.getClass();
            ro7 ro7 = ro7.y;
            wo7 n2 = y.n();
            List singletonList = Collections.singletonList(new p27((vw3) ql4.g0()));
            ro7.getClass();
            n2.getClass();
            singletonList.getClass();
            fu6 I = kl8.I(ro7, n2, singletonList, false);
            List list = Collections.EMPTY_LIST;
            g1.m1(I, list, (qz3) null, (qz3) null, list);
            fr5.i1(g1.k());
            return g1;
        }
        a(26);
        throw null;
    }

    public static au6 z(ql4 ql4) {
        if (ql4 != null) {
            qm qmVar = me6.x;
            au6 q1 = au6.q1(ql4, n27.c, 4, ql4.e());
            h28 h28 = new h28(q1, (h28) null, 0, qmVar, uq4.e("value"), ts1.e(ql4).v(), false, false, false, (vw3) null, ql4.e());
            List list = Collections.EMPTY_LIST;
            return q1.k1((qz3) null, (qz3) null, list, list, Collections.singletonList(h28), ql4.g0(), fl4.x, vs1.e);
        }
        a(24);
        throw null;
    }
}
