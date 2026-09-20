package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: si3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class si3 extends q16 implements ur3, u16 {
    public static final Method C;
    public final ri3 A = new ri3(this);
    public final nz3 B;
    public final oq3 x;
    public final u52 y;
    public final nz3 z;

    static {
        Class cls;
        up2 up2 = g18.a;
        Method[] declaredMethods = m06.d(vs7.class).loadClass("kotlin.enums.EnumEntriesKt").getDeclaredMethods();
        declaredMethods.getClass();
        Method method = null;
        boolean z2 = false;
        for (Method method2 : declaredMethods) {
            if (sg3.e(method2.getName(), "enumEntries")) {
                Class[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (parameterTypes.length == 1) {
                    cls = parameterTypes[0];
                } else {
                    cls = null;
                }
                if (cls != null && cls.isArray() && sg3.e(cls.getComponentType(), Enum.class)) {
                    if (!z2) {
                        method = method2;
                        z2 = true;
                    } else {
                        h.q("Array contains more than one matching element.");
                        return;
                    }
                }
            }
        }
        if (z2) {
            method.getClass();
            C = method;
            return;
        }
        kj6.i("Array contains no element matching the predicate.");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public si3(oq3 oq3) {
        super(fq3.j);
        oq3.getClass();
        this.x = oq3;
        Object invoke = C.invoke((Object) null, new Object[]{kl8.u(oq3).getEnumConstants()});
        invoke.getClass();
        this.y = (u52) invoke;
        pi3 pi3 = new pi3(this, 0);
        i44 i44 = i44.w;
        this.z = rg3.y(i44, pi3);
        this.B = rg3.y(i44, new pi3(this, 1));
    }

    public final yq3 B() {
        return this.x;
    }

    public final Object G() {
        return null;
    }

    public final boolean M() {
        return false;
    }

    public final List a() {
        return a42.w;
    }

    public final Object b() {
        return this.y;
    }

    public final tr3 c() {
        return (tr3) this.B.getValue();
    }

    public final boolean equals(Object obj) {
        u16 c = g18.c(obj);
        if (c != null && sg3.e(this.x, c.B()) && "entries".equals(c.getName()) && "getEntries()Lkotlin/enums/EnumEntries;".equals(c.h()) && sg3.e((Object) null, c.G())) {
            return true;
        }
        return false;
    }

    public final ls3 f() {
        return ls3.w;
    }

    public final List getAnnotations() {
        return a42.w;
    }

    public final String getName() {
        return "entries";
    }

    public final List getParameters() {
        return a42.w;
    }

    public final List getTypeParameters() {
        return a42.w;
    }

    public final String h() {
        return "getEntries()Lkotlin/enums/EnumEntries;";
    }

    public final int hashCode() {
        return (((this.x.hashCode() * 31) - 1591573360) * 31) - 2087422618;
    }

    public final boolean i() {
        return false;
    }

    public final as3 k() {
        return (as3) this.z.getValue();
    }

    public final dj0 n() {
        return this.A;
    }

    public final el4 o() {
        return el4.x;
    }

    public final GenericDeclaration s() {
        return pd8.p(this.x, "getEntries()Lkotlin/enums/EnumEntries;");
    }

    public final Field t() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        d63.k(sb, this);
        if (this instanceof kr3) {
            str = "var ";
        } else {
            str = "val ";
        }
        sb.append(str);
        d63.m(sb, this);
        d63.l("entries", sb);
        sb.append(": ");
        sb.append(d63.v(k(), false));
        return sb.toString();
    }

    public final p16 x(yq3 yq3, fq3 fq3) {
        yq3.getClass();
        fq3.getClass();
        return new si3(this.x);
    }
}
