package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: mq0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mq0 implements gq3, vp0, nv3 {
    public static final Map x;
    public final Class w;

    static {
        List E = sg3.E(sr2.class, vr2.class, gs2.class, hs2.class, is2.class, js2.class, ks2.class, ls2.class, ms2.class, ns2.class, tr2.class, ur2.class, kt2.class, wr2.class, xr2.class, yr2.class, zr2.class, as2.class, bs2.class, cs2.class, es2.class, fs2.class, kt2.class);
        ArrayList arrayList = new ArrayList(et0.e0(E, 10));
        int i = 0;
        for (Object next : E) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new yb5((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                sg3.Z();
                throw null;
            }
        }
        x = sf4.a0(arrayList);
    }

    public mq0(Class cls) {
        cls.getClass();
        this.w = cls;
    }

    public static void g() {
        throw new u81();
    }

    public final String A() {
        String M;
        Class cls = this.w;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return d57.c1(simpleName, enclosingMethod.getName() + '$', simpleName);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return d57.c1(simpleName, enclosingConstructor.getName() + '$', simpleName);
            }
            int F0 = d57.F0(simpleName, '$', 0, 6);
            if (F0 == -1) {
                return simpleName;
            }
            return simpleName.substring(F0 + 1, simpleName.length());
        } else if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (M = gw8.M(componentType.getName())) != null) {
                str = M.concat("Array");
            }
            if (str == null) {
                return "Array";
            }
            return str;
        } else {
            String M2 = gw8.M(cls.getName());
            if (M2 == null) {
                return cls.getSimpleName();
            }
            return M2;
        }
    }

    public final boolean L(Object obj) {
        Class cls = this.w;
        cls.getClass();
        Map map = x;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return mp7.a0(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = kl8.v(b26.a.b(cls));
        }
        return cls.isInstance(obj);
    }

    public final Class b() {
        return this.w;
    }

    public final List e() {
        g();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mq0) || !kl8.v(this).equals(kl8.v((gq3) obj))) {
            return false;
        }
        return true;
    }

    public final List getAnnotations() {
        g();
        throw null;
    }

    public final List getTypeParameters() {
        g();
        throw null;
    }

    public final int hashCode() {
        return kl8.v(this).hashCode();
    }

    public final String l() {
        String o;
        Class cls = this.w;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (o = gw8.o(componentType.getName())) != null) {
                str = o.concat("Array");
            }
            if (str == null) {
                return "kotlin.Array";
            }
            return str;
        }
        String o2 = gw8.o(cls.getName());
        if (o2 == null) {
            return cls.getCanonicalName();
        }
        return o2;
    }

    public final boolean p() {
        g();
        throw null;
    }

    public final Collection r() {
        g();
        throw null;
    }

    public final GenericDeclaration s() {
        return this.w;
    }

    public final String toString() {
        return this.w.toString() + " (Kotlin reflection is not available)";
    }

    public final boolean z() {
        g();
        throw null;
    }
}
