package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* renamed from: in8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class in8 implements xx5, ql, a57, a39 {
    public Object w;

    public in8(int i) {
        switch (i) {
            case 5:
                this.w = new ji8(7);
                return;
            case 7:
                this.w = new Object();
                return;
            case 8:
                this.w = rg3.k();
                return;
            case 9:
                this.w = u55.p(Boolean.FALSE);
                return;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                this.w = new ConcurrentHashMap();
                return;
            default:
                yo4 yo4 = ne3.a;
                this.w = new yo4();
                return;
        }
    }

    public static /* synthetic */ void v0(int i) {
        String str;
        int i2;
        Throwable th;
        if (i == 1 || i == 2) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i == 1 || i == 2) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 1 || i == 2)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 1 || i == 2) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public static /* synthetic */ void w0(int i) {
        String str;
        int i2;
        Throwable th;
        if (i != 1) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 1) {
            th = new IllegalArgumentException(format);
        } else {
            th = new IllegalStateException(format);
        }
        throw th;
    }

    public ts2 A() {
        throw null;
    }

    public abstract void A0(xk6 xk6);

    public abstract void B0();

    public abstract void C0();

    public List D0(String str) {
        Map map = (Map) this.w;
        List list = (List) map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        R0(str);
        map.put(str, arrayList);
        return arrayList;
    }

    public String E0(String str) {
        List v = v(str);
        if (v != null) {
            return (String) dt0.y0(v);
        }
        return null;
    }

    public abstract String F0();

    public pz8 G() {
        throw null;
    }

    public abstract k54 G0();

    public abstract Object H0();

    public List I0(j24 j24, int i, long j) {
        yo4 yo4 = (yo4) this.w;
        List list = (List) yo4.b(i);
        if (list != null) {
            return list;
        }
        List a = j24.a(i);
        int size = a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((gh4) a.get(i2)).y(j));
        }
        yo4.i(i, arrayList);
        return arrayList;
    }

    public void J(String str, String str2) {
        str2.getClass();
        S0(str2);
        List D0 = D0(str);
        D0.clear();
        D0.add(str2);
    }

    public abstract Object J0();

    public boolean K0() {
        int i;
        gz6 gz6 = (gz6) this.w;
        View view = gz6.c.c0;
        if (view != null) {
            i = 4;
            if (!(view.getAlpha() == 0.0f && view.getVisibility() == 0)) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i = 2;
                } else if (visibility != 4) {
                    if (visibility == 8) {
                        i = 3;
                    } else {
                        h.q(hl6.k(visibility, "Unknown visibility "));
                        return false;
                    }
                }
            }
        } else {
            i = 0;
        }
        int i2 = gz6.a;
        if (i == i2) {
            return true;
        }
        if (i == 2 || i2 == 2) {
            return false;
        }
        return true;
    }

    public void L(String str, List list) {
        str.getClass();
        list.getClass();
        List D0 = D0(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S0((String) it.next());
        }
        it0.h0(D0, list);
    }

    public abstract vr2 L0(xk6 xk6);

    public abstract void M0(s54 s54);

    public abstract void N0(en0 en0);

    public abstract void O0(Object obj);

    public abstract void P0(mm7 mm7);

    public xb4 Q() {
        throw null;
    }

    public abstract void Q0();

    public void R0(String str) {
        str.getClass();
    }

    public void S0(String str) {
        str.getClass();
    }

    public abstract Object T0();

    public abstract void U0(Object obj, long j, byte b);

    public Object V0(gd9 gd9, b85 b85) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.w;
        Object obj = concurrentHashMap.get(gd9);
        if (obj != null) {
            return obj;
        }
        Object T0 = T0();
        Object putIfAbsent = concurrentHashMap.putIfAbsent(gd9, T0);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        int w2 = b85.w();
        for (int i = 0; i < w2; i++) {
            if (xc9.f.equals(b85.y(i))) {
                b85.z(i);
            }
        }
        return T0;
    }

    public abstract boolean W0(long j, Object obj);

    public abstract void X0(Object obj, long j, boolean z);

    public abstract float Y0(long j, Object obj);

    public abstract void Z0(Object obj, long j, float f);

    public abstract double a1(long j, Object obj);

    public vw3 b() {
        vw3 vw3 = (vw3) this.w;
        if (vw3 != null) {
            return vw3;
        }
        v0(1);
        throw null;
    }

    public void b1() {
        r19 r19 = ((y19) this.w).C;
        y19.g(r19);
        r19.b1();
    }

    public abstract void c1(Object obj, long j, double d);

    public void clear() {
        ((Map) this.w).clear();
    }

    public boolean contains(String str) {
        str.getClass();
        return ((Map) this.w).containsKey(str);
    }

    public rm getAnnotations() {
        rm rmVar = (rm) this.w;
        if (rmVar != null) {
            return rmVar;
        }
        w0(1);
        throw null;
    }

    public boolean isEmpty() {
        return ((Map) this.w).isEmpty();
    }

    public Set l() {
        Set entrySet = ((Map) this.w).entrySet();
        entrySet.getClass();
        Set unmodifiableSet = Collections.unmodifiableSet(entrySet);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    public r19 n0() {
        throw null;
    }

    public Set names() {
        return ((Map) this.w).keySet();
    }

    public Context o0() {
        throw null;
    }

    public void p0(String str, String str2) {
        str.getClass();
        str2.getClass();
        S0(str2);
        D0(str).add(str2);
    }

    public boolean t() {
        return true;
    }

    public List v(String str) {
        str.getClass();
        return (List) ((Map) this.w).get(str);
    }

    public abstract void x0(s54 s54);

    public void y0(z47 z47) {
        z47.getClass();
        z47.w(new ph6(12, this));
    }

    public abstract void z0(am6 am6);

    public in8(y19 y19) {
        z65.k(y19);
        this.w = y19;
    }

    public in8(rm rmVar) {
        if (rmVar != null) {
            this.w = rmVar;
        } else {
            w0(0);
            throw null;
        }
    }

    public in8(vw3 vw3) {
        if (vw3 != null) {
            this.w = vw3;
        } else {
            v0(0);
            throw null;
        }
    }

    public in8(Unsafe unsafe) {
        this.w = unsafe;
    }

    public in8(gz6 gz6) {
        gz6.getClass();
        this.w = gz6;
    }
}
