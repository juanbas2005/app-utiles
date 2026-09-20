package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.autofill.AutofillManager;
import coil.request.NullRequestDataException;
import com.google.firebase.FirebaseException;
import cu.lestebang.utiletecsa.MainActivity;
import cu.lestebang.utiletecsa.R;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: kg5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class kg5 implements fv5, m57, lf6, e77 {
    public final /* synthetic */ int w;
    public Object x;
    public Object y;

    public kg5(int i) {
        this.w = i;
        switch (i) {
            case 24:
                this.x = new ConcurrentHashMap();
                this.y = new AtomicInteger(0);
                return;
            case 26:
                this.x = new jv2(11);
                this.y = new kd4(16);
                return;
            case 29:
                this.x = new zt6(0);
                this.y = new vc4((Object) null);
                return;
            default:
                this.x = new Object();
                yo4 yo4 = ne3.a;
                this.y = new yo4();
                return;
        }
    }

    public static final void e(kg5 kg5) {
        synchronized (kg5.x) {
            yo4 yo4 = (yo4) kg5.y;
            long[] jArr = yo4.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                int i5 = yo4.b[i4];
                                q57 q57 = (q57) yo4.c[i4];
                                if (q57.c != r57.A && !q57.b.e()) {
                                    yo4.h(i4);
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
    }

    public static ro7 l(List list) {
        if (list.isEmpty()) {
            return ro7.y;
        }
        return new ro7(list);
    }

    public static s62 n(s83 s83, Throwable th) {
        if (th instanceof NullRequestDataException) {
            s83.getClass();
            bn1 bn1 = s83.A;
            bn1.getClass();
            bn1 bn12 = g.a;
            bn1.getClass();
        } else {
            s83.A.getClass();
            bn1 bn13 = g.a;
        }
        return new s62((Drawable) null, s83, th);
    }

    public boolean A(View view) {
        e50 e50 = (e50) this.y;
        q48 q48 = (q48) this.x;
        int h = q48.h();
        int k = q48.k();
        int b = q48.b(view);
        int r = q48.r(view);
        e50.c = h;
        e50.d = k;
        e50.e = b;
        e50.f = r;
        e50.b = 24579;
        return e50.a();
    }

    public void B(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            w().notifyViewVisibilityChanged(view, i, z);
        }
    }

    public void C(int i, int i2) {
        int[] iArr = (int[]) this.x;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            m(i3);
            int[] iArr2 = (int[]) this.x;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill((int[]) this.x, i, i3, -1);
            ArrayList arrayList = (ArrayList) this.y;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    e27 e27 = (e27) ((ArrayList) this.y).get(size);
                    int i4 = e27.w;
                    if (i4 >= i) {
                        e27.w = i4 + i2;
                    }
                }
            }
        }
    }

    public void D(int i, int i2) {
        int[] iArr = (int[]) this.x;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            m(i3);
            int[] iArr2 = (int[]) this.x;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = (int[]) this.x;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            ArrayList arrayList = (ArrayList) this.y;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    e27 e27 = (e27) ((ArrayList) this.y).get(size);
                    int i4 = e27.w;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            ((ArrayList) this.y).remove(size);
                        } else {
                            e27.w = i4 - i2;
                        }
                    }
                }
            }
        }
    }

    public v75 E(s83 s83, uu6 uu6) {
        wf6 wf6;
        boolean z;
        s83 s832 = s83;
        uu6 uu62 = uu6;
        List list = s832.g;
        Bitmap.Config config = s832.d;
        if ((!list.isEmpty() && !qs.F0(config, i.a)) || (kl8.A(config) && ((kl8.A(config) && !s832.l) || !((oy2) this.y).i(uu62)))) {
            config = Bitmap.Config.ARGB_8888;
        }
        mp7 mp7 = uu62.a;
        cv1 cv1 = cv1.L;
        if (mp7.equals(cv1) || uu62.b.equals(cv1)) {
            wf6 = wf6.x;
        } else {
            wf6 = s832.x;
        }
        wf6 wf62 = wf6;
        if (!s832.m || !s832.g.isEmpty() || config == Bitmap.Config.ALPHA_8) {
            z = false;
        } else {
            z = true;
        }
        return new v75(s832.a, config, (ColorSpace) null, uu62, wf62, g.a(s832), z, s832.n, (String) null, s832.i, s832.j, s832.y, s832.o, s832.p, s832.q);
    }

    public void F() {
        ((hf6) this.x).a();
    }

    public void G(Bundle bundle) {
        hf6 hf6 = (hf6) this.x;
        if6 if6 = hf6.a;
        if (!hf6.e) {
            hf6.a();
        }
        if (if6.k().G0().compareTo(k54.z) >= 0) {
            ku4.k("performRestore cannot be called when owner is ", if6.k().G0());
        } else if (!hf6.g) {
            Bundle bundle2 = null;
            if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                if (bundle3 != null) {
                    bundle2 = bundle3;
                } else {
                    i95.x("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    throw null;
                }
            }
            hf6.f = bundle2;
            hf6.g = true;
        } else {
            h.s("SavedStateRegistry was already restored.");
        }
    }

    public void H(Bundle bundle) {
        hf6 hf6 = (hf6) this.x;
        Bundle j = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
        Bundle bundle2 = hf6.f;
        if (bundle2 != null) {
            j.putAll(bundle2);
        }
        synchronized (hf6.c) {
            for (Map.Entry entry : hf6.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle a = ((gf6) entry.getValue()).a();
                str.getClass();
                j.putBundle(str, a);
            }
        }
        if (!j.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", j);
        }
    }

    public dv5 I(lz5 lz5, int i) {
        m58 m58;
        dv5 dv5;
        zt6 zt6 = (zt6) this.x;
        int e = zt6.e(lz5);
        if (e >= 0 && (m58 = (m58) zt6.j(e)) != null) {
            int i2 = m58.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                m58.a = i3;
                if (i == 4) {
                    dv5 = m58.b;
                } else if (i == 8) {
                    dv5 = m58.c;
                } else {
                    h.q("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    zt6.h(e);
                    m58.a = 0;
                    m58.b = null;
                    m58.c = null;
                    m58.d.c(m58);
                }
                return dv5;
            }
        }
        return null;
    }

    public void J(y57 y57) {
        int i;
        yo4 yo4 = (yo4) this.y;
        int[] iArr = yo4.b;
        Object[] objArr = yo4.c;
        long[] jArr = yo4.a;
        int i2 = 2;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            int i8 = iArr[i7];
                            q57 q57 = (q57) objArr[i7];
                            r57 r57 = q57.c;
                            kg5 kg5 = q57.e;
                            int ordinal = r57.ordinal();
                            if (ordinal != 0) {
                                i = i4;
                                if (ordinal == i2) {
                                    q57.c = r57.A;
                                    o81 J0 = y57.J0();
                                    h27 h27 = q57.d;
                                    if (h27 != null) {
                                        h27.o((CancellationException) null);
                                    }
                                    q57.d = ar7.H(J0, (e81) null, (r81) null, new k05(kg5, q57, (f61) null, 23), 3);
                                } else if (ordinal == 3) {
                                    o81 J02 = y57.J0();
                                    h27 h272 = q57.d;
                                    if (h272 != null) {
                                        h272.o((CancellationException) null);
                                    }
                                    q57.d = ar7.H(J02, (e81) null, (r81) null, new k05(kg5, q57, (f61) null, 23), 3);
                                }
                            } else {
                                i = i4;
                                q57.c = r57.B;
                            }
                        } else {
                            i = i4;
                        }
                        j >>= i;
                        i6++;
                        i4 = i;
                        i2 = 2;
                    }
                    if (i5 != i4) {
                        return;
                    }
                }
                if (i3 != length) {
                    i3++;
                    i2 = 2;
                } else {
                    return;
                }
            }
        }
    }

    public void K(String str, gf6 gf6) {
        gf6.getClass();
        hf6 hf6 = (hf6) this.x;
        synchronized (hf6.c) {
            if (!hf6.d.containsKey(str)) {
                hf6.d.put(str, gf6);
            } else {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }
    }

    public v27 L(id8 id8) {
        v27 c;
        id8.getClass();
        synchronized (this.y) {
            c = ((tb3) this.x).c(id8);
        }
        return c;
    }

    public void M(lz5 lz5) {
        m58 m58 = (m58) ((zt6) this.x).get(lz5);
        if (m58 != null) {
            m58.a &= -2;
        }
    }

    public void N(lz5 lz5) {
        vc4 vc4 = (vc4) this.y;
        int g = vc4.g() - 1;
        while (true) {
            if (g < 0) {
                break;
            } else if (lz5 == vc4.h(g)) {
                Object[] objArr = vc4.y;
                Object obj = objArr[g];
                Object obj2 = rd3.j;
                if (obj != obj2) {
                    objArr[g] = obj2;
                    vc4.w = true;
                }
            } else {
                g--;
            }
        }
        m58 m58 = (m58) ((zt6) this.x).remove(lz5);
        if (m58 != null) {
            m58.a = 0;
            m58.b = null;
            m58.c = null;
            m58.d.c(m58);
        }
    }

    public void O() {
        Class<t44> cls = t44.class;
        if (((hf6) this.x).h) {
            wn wnVar = (wn) this.y;
            if (wnVar == null) {
                wnVar = new wn(this);
            }
            this.y = wnVar;
            try {
                cls.getDeclaredConstructor((Class[]) null);
                wn wnVar2 = (wn) this.y;
                if (wnVar2 != null) {
                    ((LinkedHashSet) wnVar2.b).add(cls.getName());
                }
            } catch (NoSuchMethodException e) {
                String simpleName = cls.getSimpleName();
                throw new IllegalArgumentException("Class " + simpleName + " must have default constructor in order to be automatically recreated", e);
            }
        } else {
            h.s("Can not perform this action after onSaveInstanceState");
        }
    }

    public void P(td4 td4) {
        this.y = td4;
        View findViewById = ((MainActivity) this.x).findViewById(16908290);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new f07(this, findViewById, 0));
    }

    public sn6 Q(dq7 dq7, List list, wj3 wj3) {
        du7 du7;
        boolean z;
        boolean z2;
        boolean z3;
        dq7 dq72 = dq7;
        wj3 wj32 = wj3;
        bq7 bq7 = dq72.a;
        sn6 sn6 = new sn6();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            vw3 vw3 = (vw3) it.next();
            vq0 u = vw3.L().u();
            if (u instanceof ql4) {
                Set set = wj32.e;
                du7 n0 = vw3.n0();
                if (n0 instanceof zg2) {
                    zg2 zg2 = (zg2) n0;
                    fu6 fu6 = zg2.x;
                    if (!fu6.L().getParameters().isEmpty() && fu6.L().u() != null) {
                        List<qp7> parameters = fu6.L().getParameters();
                        parameters.getClass();
                        ArrayList arrayList = new ArrayList(et0.e0(parameters, 10));
                        for (qp7 qp7 : parameters) {
                            xp7 xp7 = (xp7) dt0.z0(qp7.getIndex(), vw3.G());
                            if (set == null || !set.contains(qp7)) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (xp7 != null && !z3) {
                                vw3 b = xp7.b();
                                b.getClass();
                                if (bq7.d(b) != null) {
                                    arrayList.add(xp7);
                                }
                            }
                            xp7 = new p27(qp7);
                            arrayList.add(xp7);
                        }
                        fu6 = wn6.v(fu6, arrayList, (ro7) null, 2);
                    }
                    fu6 fu62 = zg2.y;
                    if (!fu62.L().getParameters().isEmpty() && fu62.L().u() != null) {
                        List<qp7> parameters2 = fu62.L().getParameters();
                        parameters2.getClass();
                        ArrayList arrayList2 = new ArrayList(et0.e0(parameters2, 10));
                        for (qp7 qp72 : parameters2) {
                            xp7 xp72 = (xp7) dt0.z0(qp72.getIndex(), vw3.G());
                            if (set == null || !set.contains(qp72)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (xp72 != null && !z2) {
                                vw3 b2 = xp72.b();
                                b2.getClass();
                                if (bq7.d(b2) != null) {
                                    arrayList2.add(xp72);
                                }
                            }
                            xp72 = new p27(qp72);
                            arrayList2.add(xp72);
                        }
                        fu62 = wn6.v(fu62, arrayList2, (ro7) null, 2);
                    }
                    du7 = kl8.n(fu6, fu62);
                } else if (n0 instanceof fu6) {
                    fu6 fu63 = (fu6) n0;
                    if (fu63.L().getParameters().isEmpty() || fu63.L().u() == null) {
                        du7 = fu63;
                    } else {
                        List<qp7> parameters3 = fu63.L().getParameters();
                        parameters3.getClass();
                        ArrayList arrayList3 = new ArrayList(et0.e0(parameters3, 10));
                        for (qp7 qp73 : parameters3) {
                            xp7 xp73 = (xp7) dt0.z0(qp73.getIndex(), vw3.G());
                            if (set == null || !set.contains(qp73)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (xp73 != null && !z) {
                                vw3 b3 = xp73.b();
                                b3.getClass();
                                if (bq7.d(b3) != null) {
                                    arrayList3.add(xp73);
                                }
                            }
                            xp73 = new p27(qp73);
                            arrayList3.add(xp73);
                        }
                        du7 = wn6.v(fu63, arrayList3, (ro7) null, 2);
                    }
                } else {
                    h.c();
                    return null;
                }
                sn6.add(dq72.f(ub5.m(du7, n0), k28.A));
            } else if (u instanceof qp7) {
                Set set2 = wj32.e;
                if (set2 == null || !set2.contains(u)) {
                    List upperBounds = ((qp7) u).getUpperBounds();
                    upperBounds.getClass();
                    sn6.addAll(Q(dq72, upperBounds, wj32));
                } else {
                    sn6.add(t(wj32));
                }
            }
        }
        return wn6.d(sn6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        return r4;
     */
    public float R(int i) {
        synchronized (this.x) {
            q57 q57 = (q57) ((yo4) this.y).b(i);
            float f = 0.0f;
            if (q57 == null) {
                return 0.0f;
            }
            if (q57.c != r57.A) {
                f = ((Number) q57.b.d()).floatValue();
            }
        }
    }

    public v27 S(id8 id8) {
        v27 e;
        synchronized (this.y) {
            e = ((tb3) this.x).e(id8);
        }
        return e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    public v75 T(v75 v75) {
        boolean z;
        boolean z2;
        v75 v752 = v75;
        Bitmap.Config config = v752.b;
        eh0 eh0 = v752.o;
        boolean z3 = true;
        if (!kl8.A(config) || ((oy2) this.y).h()) {
            z = false;
        } else {
            config = Bitmap.Config.ARGB_8888;
            z = true;
        }
        Bitmap.Config config2 = config;
        if (v752.o.w) {
            da7 da7 = (da7) this.x;
            synchronized (da7) {
                da7.a();
                z2 = da7.A;
            }
            if (!z2) {
                eh0 = eh0.DISABLED;
                eh0 eh02 = eh0;
                if (z3) {
                    return v752;
                }
                return new v75(v752.a, config2, v752.c, v752.d, v752.e, v752.f, v752.g, v752.h, v752.i, v752.j, v752.k, v752.l, v752.m, v752.n, eh02);
            }
        }
        z3 = z;
        eh0 eh022 = eh0;
        if (z3) {
        }
    }

    public void a(ev5 ev5, int i) {
        int[] iArr = (int[]) this.y;
        try {
            ev5.read((byte[]) this.x, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            ev5.close();
        }
    }

    public Object b(Object obj) {
        return ((vr2) this.y).y(obj);
    }

    public Object c(ne6 ne6, Object obj) {
        return ((gs2) this.x).H(ne6, obj);
    }

    public void d(mi4 mi4, Bitmap bitmap, Map map) {
        int i;
        int o = kl8.o(bitmap);
        t11 t11 = (t11) this.y;
        synchronized (((jv2) t11.g)) {
            i = t11.b;
        }
        t11 t112 = (t11) this.y;
        if (o <= i) {
            t112.l(mi4, new sx5(bitmap, map, o));
            return;
        }
        t112.m(mi4);
        ((qa) this.x).m(mi4, bitmap, map, o);
    }

    public void f(lz5 lz5, dv5 dv5) {
        zt6 zt6 = (zt6) this.x;
        m58 m58 = (m58) zt6.get(lz5);
        if (m58 == null) {
            m58 = m58.a();
            zt6.put(lz5, m58);
        }
        m58.c = dv5;
        m58.a |= 8;
    }

    public void g() {
        int[] iArr = (int[]) this.x;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.y = null;
    }

    public ni4 h(mi4 mi4) {
        sx5 sx5 = (sx5) ((t11) this.y).h(mi4);
        if (sx5 != null) {
            return new ni4(sx5.a, sx5.b);
        }
        return null;
    }

    public Bundle i(String str) {
        Bundle bundle;
        hf6 hf6 = (hf6) this.x;
        if (hf6.g) {
            Bundle bundle2 = hf6.f;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2.containsKey(str)) {
                bundle = bundle2.getBundle(str);
                if (bundle == null) {
                    i95.x(str);
                    throw null;
                }
            } else {
                bundle = null;
            }
            bundle2.remove(str);
            if (bundle2.isEmpty()) {
                hf6.f = null;
            }
            return bundle;
        }
        h.s("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        return null;
    }

    public void j(int i) {
        int i2;
        t11 t11 = (t11) this.y;
        if (i >= 40) {
            t11.p(-1);
        } else if (10 <= i && i < 20) {
            synchronized (((jv2) t11.g)) {
                i2 = t11.c;
            }
            t11.p(i2 / 2);
        }
    }

    public boolean k(id8 id8) {
        boolean containsKey;
        synchronized (this.y) {
            containsKey = ((tb3) this.x).a.containsKey(id8);
        }
        return containsKey;
    }

    public void m(int i) {
        int[] iArr = (int[]) this.x;
        if (iArr == null) {
            int[] iArr2 = new int[(Math.max(i, 10) + 1)];
            this.x = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.x = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.x;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View o(int i, int i2, int i3, int i4) {
        int i5;
        e50 e50 = (e50) this.y;
        q48 q48 = (q48) this.x;
        int h = q48.h();
        int k = q48.k();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View q = q48.q(i);
            int b = q48.b(q);
            int r = q48.r(q);
            e50.c = h;
            e50.d = k;
            e50.e = b;
            e50.f = r;
            if (i3 != 0) {
                e50.b = i3;
                if (e50.a()) {
                    return q;
                }
            }
            if (i4 != 0) {
                e50.b = i4;
                if (e50.a()) {
                    view = q;
                }
            }
            i += i5;
        }
        return view;
    }

    public void p(String str, String str2, vr2 vr2) {
        LinkedHashMap linkedHashMap = ((be1) this.y).a;
        tt6 tt6 = new tt6(this, str, str2);
        vr2.y(tt6);
        String str3 = (String) this.x;
        ArrayList arrayList = tt6.b;
        ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((yb5) it.next()).w);
        }
        String str4 = (String) tt6.c.w;
        str4.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(dt0.E0(arrayList2, "", (String) null, (String) null, l06.L, 30));
        sb.append(')');
        if (str4.length() > 1) {
            str4 = pb4.h(';', "L", str4);
        }
        sb.append(str4);
        String str5 = str3 + '.' + sb.toString();
        cp7 cp7 = (cp7) tt6.c.x;
        ArrayList arrayList3 = new ArrayList(et0.e0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((cp7) ((yb5) it2.next()).x);
        }
        linkedHashMap.put(str5, new an5(cp7, arrayList3, tt6.a));
    }

    public yb9 q(Object obj) {
        FileWriter fileWriter;
        Void voidR = (Void) obj;
        z00 z00 = (z00) this.y;
        JSONObject jSONObject = (JSONObject) ((ya1) ((wr0) this.x).z).w.submit(new oz0(3, this)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            bo6 j = ((uy5) z00.c).j(jSONObject);
            ji8 ji8 = (ji8) z00.e;
            long j2 = j.c;
            ji8.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", (Throwable) null);
            }
            try {
                jSONObject.put("expires_at", j2);
                fileWriter = new FileWriter((File) ji8.x);
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                } catch (Exception e) {
                    e = e;
                    try {
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        su0.h(fileWriter, "Failed to close settings writer.");
                        z00.f(jSONObject, "Loaded settings: ");
                        String str = ((wp6) z00.b).f;
                        SharedPreferences.Editor edit = ((Context) z00.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str);
                        edit.apply();
                        ((AtomicReference) z00.h).set(j);
                        ((xb7) ((AtomicReference) z00.i).get()).d(j);
                        return b35.l((Object) null);
                    } catch (Throwable th) {
                        th = th;
                        fileWriter2 = fileWriter;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                fileWriter = null;
                Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                su0.h(fileWriter, "Failed to close settings writer.");
                z00.f(jSONObject, "Loaded settings: ");
                String str2 = ((wp6) z00.b).f;
                SharedPreferences.Editor edit2 = ((Context) z00.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                edit2.putString("existing_instance_identifier", str2);
                edit2.apply();
                ((AtomicReference) z00.h).set(j);
                ((xb7) ((AtomicReference) z00.i).get()).d(j);
                return b35.l((Object) null);
            } catch (Throwable th2) {
                th = th2;
                su0.h(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            su0.h(fileWriter, "Failed to close settings writer.");
            z00.f(jSONObject, "Loaded settings: ");
            String str22 = ((wp6) z00.b).f;
            SharedPreferences.Editor edit22 = ((Context) z00.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit22.putString("existing_instance_identifier", str22);
            edit22.apply();
            ((AtomicReference) z00.h).set(j);
            ((xb7) ((AtomicReference) z00.i).get()).d(j);
        }
        return b35.l((Object) null);
    }

    public Object r(String str) {
        yb5[] yb5Arr;
        str.getClass();
        ye6 ye6 = (ye6) this.x;
        Map singletonMap = Collections.singletonMap(str, ye6.a(str));
        singletonMap.getClass();
        if (singletonMap.isEmpty()) {
            yb5Arr = new yb5[0];
        } else {
            ArrayList arrayList = new ArrayList(singletonMap.size());
            for (Map.Entry entry : singletonMap.entrySet()) {
                arrayList.add(new yb5((String) entry.getKey(), entry.getValue()));
            }
            yb5Arr = (yb5[]) arrayList.toArray(new yb5[0]);
        }
        Bundle j = tf4.j((yb5[]) Arrays.copyOf(yb5Arr, yb5Arr.length));
        Object obj = ((LinkedHashMap) this.y).get(str);
        if (obj != null) {
            return ((bv4) obj).a(str, j);
        }
        ku4.u("Failed to find type for ", str, " when decoding ", ye6);
        return null;
    }

    /* JADX WARNING: type inference failed for: r11v2, types: [i10, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053 A[SYNTHETIC, Splitter:B:15:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072 A[Catch:{ JSONException -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a7 A[SYNTHETIC] */
    public l10 s(sz0 sz0) {
        String str;
        JSONArray jSONArray = sz0.g;
        long j = sz0.f;
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", new Object[]{string, jSONArray2}));
                }
                String optString = jSONArray2.optString(0, "");
                sz0 c = ((qz0) this.x).c();
                String str2 = null;
                if (c != null) {
                    try {
                        str = c.b.getString(optString);
                    } catch (JSONException unused) {
                    }
                    if (str == null) {
                        sz0 c2 = ((qz0) this.y).c();
                        if (c2 != null) {
                            try {
                                str2 = c2.b.getString(optString);
                            } catch (JSONException unused2) {
                            }
                        }
                        if (str2 != null) {
                            str = str2;
                        } else {
                            str = "";
                        }
                    }
                    int i2 = t86.a;
                    ? obj = new Object();
                    if (string == null) {
                        obj.a = string;
                        String string2 = jSONObject.getString("variantId");
                        if (string2 != null) {
                            obj.b = string2;
                            if (optString != null) {
                                obj.c = optString;
                                obj.d = str;
                                obj.e = j;
                                obj.f = (byte) (obj.f | 1);
                                hashSet.add(obj.a());
                                i++;
                            } else {
                                throw new NullPointerException("Null parameterKey");
                            }
                        } else {
                            throw new NullPointerException("Null variantId");
                        }
                    } else {
                        throw new NullPointerException("Null rolloutId");
                    }
                }
                str = null;
                if (str == null) {
                }
                int i22 = t86.a;
                ? obj2 = new Object();
                if (string == null) {
                }
            } catch (JSONException e) {
                throw new FirebaseException("Exception parsing rollouts metadata to create RolloutsState.", e);
            }
        }
        return new l10(hashSet);
    }

    public du7 t(wj3 wj3) {
        du7 F;
        fu6 fu6 = wj3.f;
        if (fu6 == null || (F = jb5.F(fu6)) == null) {
            return (v62) ((z97) this.x).getValue();
        }
        return F;
    }

    public String toString() {
        switch (this.w) {
            case 3:
                String str = "[ ";
                if (((ly6) this.x) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder o = b81.o(str);
                        o.append(((ly6) this.x).D[i]);
                        o.append(" ");
                        str = o.toString();
                    }
                }
                return str + "] " + ((ly6) this.x);
            default:
                return super.toString();
        }
    }

    public vw3 u(qp7 qp7, wj3 wj3) {
        qp7.getClass();
        wj3.getClass();
        return (vw3) ((fb4) this.y).y(new wp7(qp7, wj3));
    }

    public int v(String str) {
        int i;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.x;
        concurrentHashMap.getClass();
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(str);
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = ((AtomicInteger) this.y).getAndIncrement();
                    concurrentHashMap.putIfAbsent(str, Integer.valueOf(i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public AutofillManager w() {
        AutofillManager autofillManager = (AutofillManager) this.y;
        if (autofillManager != null) {
            return autofillManager;
        }
        AutofillManager h = pa4.h(((Context) this.x).getSystemService(pa4.j()));
        if (h != null) {
            this.y = h;
            return h;
        }
        h.s("Could not locate AutofillManager from context");
        return null;
    }

    public gf6 x(String str) {
        gf6 gf6;
        hf6 hf6 = (hf6) this.x;
        synchronized (hf6.c) {
            Iterator it = hf6.d.entrySet().iterator();
            do {
                gf6 = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                gf6 gf62 = (gf6) entry.getValue();
                if (sg3.e((String) entry.getKey(), str)) {
                    gf6 = gf62;
                    continue;
                }
            } while (gf6 == null);
        }
        return gf6;
    }

    public long y() {
        long j;
        int i;
        synchronized (this.x) {
            yo4 yo4 = (yo4) this.y;
            int[] iArr = yo4.b;
            Object[] objArr = yo4.c;
            long[] jArr = yo4.a;
            int length = jArr.length - 2;
            j = 0;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((255 & j2) < 128) {
                                int i6 = (i2 << 3) + i5;
                                int i7 = iArr[i6];
                                q57 q57 = (q57) objArr[i6];
                                i = i3;
                                if (q57.c == r57.A || q57.b.e()) {
                                    j |= 1 << i7;
                                }
                            } else {
                                i = i3;
                            }
                            j2 >>= i;
                            i5++;
                            i3 = i;
                        }
                        if (i4 != i3) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return j;
    }

    public void z() {
        int i;
        TypedValue typedValue = new TypedValue();
        MainActivity mainActivity = (MainActivity) this.x;
        Resources.Theme theme = mainActivity.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            rc9.N(mainActivity, typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            mainActivity.setTheme(i);
        }
    }

    public /* synthetic */ kg5(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    public /* synthetic */ kg5(int i, boolean z) {
        this.w = i;
    }

    public /* synthetic */ kg5(Object obj, boolean z, Object obj2, int i) {
        this.w = i;
        this.y = obj;
        this.x = obj2;
    }

    public kg5(String str) {
        this.w = 13;
        try {
            ay4 d = gw8.d();
            this.x = str;
            if (!str.equals("supabase_code_verifier")) {
                String g = d.g("supabase_code_verifier");
                String g2 = d.g(str);
                if (g != null && g2 == null) {
                    d.t(str, g);
                    d.u("supabase_code_verifier");
                }
            }
            this.y = hj8.G(d);
        } catch (Exception unused) {
            h.s("Failed to create default settings for SettingsSessionManager. You might have to provide a custom settings instance or a custom session manager. Learn more at https://github.com/supabase-community/supabase-kt/wiki/Session-Saving");
            throw null;
        }
    }

    public kg5(ts2 ts2) {
        this.w = 25;
        kb4 kb4 = new kb4("Type parameter upper bound erasure results");
        this.x = new z97(new xo3(15, this));
        this.y = kb4.b(new st6(2, this));
    }

    public kg5(jx5 jx5, da7 da7) {
        Object obj;
        this.w = 7;
        this.x = da7;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            boolean z = c.a;
        } else if (!c.a) {
            if (i == 26 || i == 27) {
                obj = new hr2(3);
            } else {
                obj = new k93(true);
            }
            this.y = obj;
        }
        obj = new k93(false);
        this.y = obj;
    }

    public kg5(hf6 hf6) {
        this.w = 11;
        this.x = hf6;
        this.y = new kg5(10, (Object) hf6);
    }

    public kg5(Object obj) {
        this.w = 17;
        this.x = obj;
        this.y = Thread.currentThread();
    }

    public /* synthetic */ kg5(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public kg5(uo5 uo5) {
        this.w = 3;
        this.y = uo5;
    }

    public kg5(ExecutorService executorService) {
        this.w = 6;
        this.y = new zt6(0);
        this.x = executorService;
    }

    public kg5(nu5 nu5) {
        this.w = 0;
        this.y = Collections.synchronizedMap(new HashMap());
        this.x = nu5;
    }

    public kg5(int i, qa qaVar) {
        this.w = 5;
        this.x = qaVar;
        this.y = new t11(i, this);
    }

    public kg5(tb3 tb3) {
        this.w = 22;
        this.x = tb3;
        this.y = new Object();
    }

    public kg5(q48 q48) {
        this.w = 28;
        this.x = q48;
        e50 e50 = new e50();
        e50.b = 0;
        this.y = e50;
    }

    public kg5(ye6 ye6, LinkedHashMap linkedHashMap) {
        this.w = 9;
        ye6.getClass();
        this.x = ye6;
        this.y = linkedHashMap;
    }

    public kg5(MainActivity mainActivity) {
        this.w = 18;
        this.x = mainActivity;
        this.y = new kj6(4);
    }
}
