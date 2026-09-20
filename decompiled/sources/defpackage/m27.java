package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: m27  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class m27 {
    public static final up2 A = b("Iterator");
    public static final up2 B = b("Iterable");
    public static final up2 C = b("Collection");
    public static final up2 D = b("List");
    public static final up2 E = b("ListIterator");
    public static final up2 F = b("Set");
    public static final up2 G;
    public static final up2 H;
    public static final up2 I = b("MutableIterator");
    public static final up2 J = b("MutableIterable");
    public static final up2 K = b("MutableCollection");
    public static final up2 L = b("MutableList");
    public static final up2 M = b("MutableListIterator");
    public static final up2 N = b("MutableSet");
    public static final up2 O;
    public static final up2 P;
    public static final vp2 Q = e("KClass");
    public static final gq0 R;
    public static final gq0 S;
    public static final gq0 T;
    public static final gq0 U;
    public static final gq0 V;
    public static final up2 W = d("UByteArray");
    public static final up2 X = d("UShortArray");
    public static final up2 Y = d("UIntArray");
    public static final up2 Z = d("ULongArray");
    public static final vp2 a = d("Any").a;
    public static final up2 a0 = c("AtomicIntArray");
    public static final vp2 b = d("Nothing").a;
    public static final up2 b0 = c("AtomicLongArray");
    public static final vp2 c = d("Cloneable").a;
    public static final up2 c0 = c("AtomicArray");
    public static final vp2 d = d("Unit").a;
    public static final HashSet d0;
    public static final vp2 e = d("CharSequence").a;
    public static final HashSet e0;
    public static final vp2 f = d("String").a;
    public static final HashMap f0;
    public static final vp2 g = d("Array").a;
    public static final HashMap g0;
    public static final vp2 h = d("Boolean").a;
    public static final vp2 i = d("Number").a;
    public static final vp2 j = d("Enum").a;
    public static final up2 k = d("Throwable");
    public static final up2 l = d("Comparable");
    public static final up2 m = d("Deprecated");
    public static final up2 n = d("DeprecationLevel");
    public static final up2 o = d("ReplaceWith");
    public static final up2 p = d("ExtensionFunctionType");
    public static final up2 q = d("ContextFunctionTypeParams");
    public static final up2 r;
    public static final up2 s = d("Annotation");
    public static final up2 t;
    public static final up2 u = a("AnnotationTarget");
    public static final up2 v = a("AnnotationRetention");
    public static final up2 w;
    public static final up2 x = a("MustBeDocumented");
    public static final up2 y = d("UnsafeVariance");
    public static final up2 z;

    static {
        int i2;
        int i3;
        int i4;
        d("Suppress");
        d("Char");
        d("Byte");
        d("Short");
        d("Int");
        d("Long");
        d("Float");
        d("Double");
        d("Function");
        up2 up2 = n27.n;
        up2.a(uq4.e("IntRange"));
        up2.a(uq4.e("LongRange"));
        d("DeprecatedSinceKotlin");
        up2 d2 = d("ParameterName");
        r = d2;
        pv8.P(d2);
        up2 a2 = a("Target");
        t = a2;
        pv8.P(a2);
        up2 a3 = a("Retention");
        w = a3;
        pv8.P(a3);
        pv8.P(a("Repeatable"));
        d("PublishedApi");
        n27.o.a(uq4.e("AccessibleLateinitPropertyLiteral"));
        up2 up22 = new up2("kotlin.internal.PlatformDependent");
        z = up22;
        pv8.P(up22);
        d("IntroducedAt");
        up2 b2 = b("Map");
        G = b2;
        H = b2.a(uq4.e("Entry"));
        up2 b3 = b("MutableMap");
        O = b3;
        P = b3.a(uq4.e("MutableEntry"));
        e("KType");
        e("KCallable");
        e("KProperty0");
        e("KProperty1");
        e("KProperty2");
        e("KMutableProperty0");
        e("KMutableProperty1");
        e("KMutableProperty2");
        vp2 e2 = e("KProperty");
        e("KMutableProperty");
        R = pv8.P(e2.i());
        e("KDeclarationContainer");
        e("findAssociatedObject");
        up2 d3 = d("UByte");
        up2 d4 = d("UShort");
        up2 d5 = d("UInt");
        up2 d6 = d("ULong");
        S = pv8.P(d3);
        T = pv8.P(d4);
        U = pv8.P(d5);
        V = pv8.P(d6);
        c("AtomicInt");
        c("AtomicLong");
        c("AtomicBoolean");
        c("AtomicReference");
        int length = ro5.values().length;
        int i5 = 3;
        if (length < 3) {
            i2 = 3;
        } else {
            i2 = (length / 3) + length + 1;
        }
        HashSet hashSet = new HashSet(i2);
        for (ro5 ro5 : ro5.values()) {
            hashSet.add(ro5.w);
        }
        d0 = hashSet;
        int length2 = ro5.values().length;
        if (length2 < 3) {
            i3 = 3;
        } else {
            i3 = (length2 / 3) + length2 + 1;
        }
        HashSet hashSet2 = new HashSet(i3);
        for (ro5 ro52 : ro5.values()) {
            hashSet2.add(ro52.x);
        }
        e0 = hashSet2;
        int length3 = ro5.values().length;
        if (length3 < 3) {
            i4 = 3;
        } else {
            i4 = (length3 / 3) + length3 + 1;
        }
        HashMap hashMap = new HashMap(i4);
        for (ro5 ro53 : ro5.values()) {
            String b4 = ro53.w.b();
            b4.getClass();
            hashMap.put(d(b4).a, ro53);
        }
        f0 = hashMap;
        int length4 = ro5.values().length;
        if (length4 >= 3) {
            i5 = (length4 / 3) + length4 + 1;
        }
        HashMap hashMap2 = new HashMap(i5);
        for (ro5 ro54 : ro5.values()) {
            String b5 = ro54.x.b();
            b5.getClass();
            hashMap2.put(d(b5).a, ro54);
        }
        g0 = hashMap2;
    }

    public static up2 a(String str) {
        return n27.l.a(uq4.e(str));
    }

    public static up2 b(String str) {
        return n27.m.a(uq4.e(str));
    }

    public static up2 c(String str) {
        return n27.p.a(uq4.e(str));
    }

    public static up2 d(String str) {
        return n27.k.a(uq4.e(str));
    }

    public static final vp2 e(String str) {
        return n27.i.a(uq4.e(str)).a;
    }
}
