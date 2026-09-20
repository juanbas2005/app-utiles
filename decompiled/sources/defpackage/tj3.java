package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: tj3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tj3 {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final gq0 e;
    public static final up2 f;
    public static final gq0 g = j27.u;
    public static final HashMap h = new HashMap();
    public static final HashMap i = new HashMap();
    public static final HashMap j = new HashMap();
    public static final HashMap k = new HashMap();
    public static final HashMap l = new HashMap();
    public static final HashMap m = new HashMap();
    public static final LinkedHashSet n = new LinkedHashSet();
    public static final List o;

    static {
        StringBuilder sb = new StringBuilder();
        dt2 dt2 = dt2.d;
        sb.append(dt2.a);
        sb.append('.');
        sb.append(dt2.b);
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        et2 et2 = et2.d;
        sb2.append(et2.a);
        sb2.append('.');
        sb2.append(et2.b);
        b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        gt2 gt2 = gt2.d;
        sb3.append(gt2.a);
        sb3.append('.');
        sb3.append(gt2.b);
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        ft2 ft2 = ft2.d;
        sb4.append(ft2.a);
        sb4.append('.');
        sb4.append(ft2.b);
        d = sb4.toString();
        gq0 P = pv8.P(new up2("kotlin.jvm.functions.FunctionN"));
        e = P;
        f = P.a();
        e(Class.class);
        gq0 P2 = pv8.P(m27.B);
        up2 up2 = m27.J;
        up2 up22 = P2.a;
        sj3 sj3 = new sj3(e(Iterable.class), P2, new gq0(up22, r16.f0(up2, up22), false));
        gq0 P3 = pv8.P(m27.A);
        up2 up23 = m27.I;
        up2 up24 = P3.a;
        sj3 sj32 = new sj3(e(Iterator.class), P3, new gq0(up24, r16.f0(up23, up24), false));
        gq0 P4 = pv8.P(m27.C);
        up2 up25 = m27.K;
        up2 up26 = P4.a;
        sj3 sj33 = new sj3(e(Collection.class), P4, new gq0(up26, r16.f0(up25, up26), false));
        gq0 P5 = pv8.P(m27.D);
        up2 up27 = m27.L;
        up2 up28 = P5.a;
        sj3 sj34 = new sj3(e(List.class), P5, new gq0(up28, r16.f0(up27, up28), false));
        gq0 P6 = pv8.P(m27.F);
        up2 up29 = m27.N;
        up2 up210 = P6.a;
        sj3 sj35 = new sj3(e(Set.class), P6, new gq0(up210, r16.f0(up29, up210), false));
        gq0 P7 = pv8.P(m27.E);
        up2 up211 = m27.M;
        up2 up212 = P7.a;
        sj3 sj36 = new sj3(e(ListIterator.class), P7, new gq0(up212, r16.f0(up211, up212), false));
        up2 up213 = m27.G;
        gq0 P8 = pv8.P(up213);
        up2 up214 = m27.O;
        up2 up215 = P8.a;
        sj3 sj37 = new sj3(e(Map.class), P8, new gq0(up215, r16.f0(up214, up215), false));
        gq0 d2 = pv8.P(up213).d(m27.H.a.g());
        up2 up216 = m27.P;
        up2 up217 = d2.a;
        List<sj3> E = sg3.E(sj3, sj32, sj33, sj34, sj35, sj36, sj37, new sj3(e(Map.Entry.class), d2, new gq0(up217, r16.f0(up216, up217), false)));
        o = E;
        d(Object.class, m27.a);
        d(String.class, m27.f);
        d(CharSequence.class, m27.e);
        c(Throwable.class, m27.k);
        d(Cloneable.class, m27.c);
        d(Number.class, m27.i);
        c(Comparable.class, m27.l);
        d(Enum.class, m27.j);
        c(Annotation.class, m27.s);
        for (sj3 sj38 : E) {
            gq0 gq0 = sj38.a;
            gq0 gq02 = sj38.b;
            gq0 gq03 = sj38.c;
            a(gq0, gq02);
            b(gq03.a(), gq0);
            l.put(gq03, gq02);
            m.put(gq02, gq03);
            up2 a2 = gq02.a();
            up2 a3 = gq03.a();
            j.put(gq03.a().a, a2);
            k.put(a2.a, a3);
        }
        zo3[] values = zo3.values();
        int length = values.length;
        int i2 = 0;
        while (i2 < length) {
            zo3 zo3 = values[i2];
            up2 up218 = zo3.z;
            if (up218 != null) {
                gq0 gq04 = new gq0(up218.b(), up218.a.g());
                ro5 c2 = zo3.c();
                c2.getClass();
                up2 a4 = n27.k.a(c2.w);
                a(gq04, new gq0(a4.b(), a4.a.g()));
                i2++;
            } else {
                zo3.a(15);
                throw null;
            }
        }
        for (gq0 gq05 : uu0.a) {
            up2 up219 = new up2("kotlin.jvm.internal." + gq05.f().b() + "CompanionObject");
            a(new gq0(up219.b(), up219.a.g()), gq05.d(oz6.b));
        }
        for (int i3 = 0; i3 < 23; i3++) {
            up2 up220 = new up2(hl6.k(i3, "kotlin.jvm.functions.Function"));
            a(new gq0(up220.b(), up220.a.g()), new gq0(n27.k, uq4.e("Function" + i3)));
            b(new up2(hl6.p(new StringBuilder(), b, i3)), g);
        }
        for (int i4 = 0; i4 < 22; i4++) {
            b(new up2(hl6.p(new StringBuilder(), d, i4)), g);
        }
        b(new up2("kotlin.concurrent.atomics.AtomicInt"), e(AtomicInteger.class));
        b(new up2("kotlin.concurrent.atomics.AtomicLong"), e(AtomicLong.class));
        b(new up2("kotlin.concurrent.atomics.AtomicBoolean"), e(AtomicBoolean.class));
        b(new up2("kotlin.concurrent.atomics.AtomicReference"), e(AtomicReference.class));
        b(new up2("kotlin.concurrent.atomics.AtomicIntArray"), e(AtomicIntegerArray.class));
        b(new up2("kotlin.concurrent.atomics.AtomicLongArray"), e(AtomicLongArray.class));
        b(new up2("kotlin.concurrent.atomics.AtomicArray"), e(AtomicReferenceArray.class));
        b(m27.b.i(), e(Void.class));
    }

    public static void a(gq0 gq0, gq0 gq02) {
        h.put(gq0.a().a, gq02);
        b(gq02.a(), gq0);
    }

    public static void b(up2 up2, gq0 gq0) {
        n.add(up2);
        i.put(up2.a, gq0);
    }

    public static void c(Class cls, up2 up2) {
        gq0 e2 = e(cls);
        up2.getClass();
        a(e2, new gq0(up2.b(), up2.a.g()));
    }

    public static void d(Class cls, vp2 vp2) {
        c(cls, vp2.i());
    }

    public static gq0 e(Class cls) {
        if (!cls.isPrimitive()) {
            boolean isArray = cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return e(declaringClass).d(uq4.e(cls.getSimpleName()));
        }
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        up2 up2 = new up2(canonicalName);
        return new gq0(up2.b(), up2.a.g());
    }

    public static boolean f(vp2 vp2, String str, boolean z) {
        int i2;
        String str2 = vp2.a;
        if (k57.u0(str2, str, false)) {
            String substring = str2.substring(str.length());
            if (!d57.a1(substring, '0')) {
                Integer v0 = k57.v0(substring);
                if (z) {
                    i2 = 22;
                } else {
                    i2 = 23;
                }
                if (v0 == null || v0.intValue() < i2) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static gq0 g(up2 up2) {
        up2.getClass();
        return (gq0) h.get(up2.a);
    }

    public static gq0 h(vp2 vp2) {
        vp2.getClass();
        if (f(vp2, a, false) || f(vp2, c, true)) {
            return e;
        }
        if (!f(vp2, b, false) && !f(vp2, d, true)) {
            return (gq0) i.get(vp2);
        }
        return g;
    }

    public static up2 i(vp2 vp2) {
        return (up2) k.get(vp2);
    }
}
