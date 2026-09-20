package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

/* renamed from: yh3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yh3 extends q16 implements qs2, kt2, s16 {
    public final nz3 A;
    public final nz3 B;
    public final nz3 C;
    public final oq3 x;
    public final List y;
    public final nz3 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yh3(oq3 oq3) {
        super(fq3.j);
        oq3.getClass();
        this.x = oq3;
        Object[] declaredMethods = kl8.u(oq3).getDeclaredMethods();
        declaredMethods.getClass();
        a91 a91 = new a91(19);
        if (declaredMethods.length != 0) {
            declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
            if (declaredMethods.length > 1) {
                Arrays.sort(declaredMethods, a91);
            }
        }
        List asList = Arrays.asList(declaredMethods);
        asList.getClass();
        this.y = asList;
        xh3 xh3 = new xh3(this, 0);
        i44 i44 = i44.w;
        this.z = rg3.y(i44, xh3);
        this.A = rg3.y(i44, new xh3(this, 1));
        this.B = rg3.y(i44, new xh3(this, 2));
        this.C = rg3.y(i44, new xh3(this, 3));
        rg3.y(i44, new xh3(this, 4));
    }

    public final yq3 B() {
        return this.x;
    }

    public final Object C(Object obj, Object obj2, Object obj3, Object obj4) {
        return O(obj, obj2, obj3, obj4);
    }

    public final Object D(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, yt2 yt2, Integer num) {
        return O(jl4.w, obj, bool, obj2, obj3, obj4, yt2, num);
    }

    public final Object F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return O(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public final Object G() {
        return null;
    }

    public final Object H(Object obj, Object obj2) {
        return O(obj, obj2);
    }

    public final Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return O(obj, obj2, obj3, obj4, obj5);
    }

    public final boolean M() {
        int modifiers = kl8.u(this.x).getModifiers();
        up2 up2 = g18.a;
        if (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || Modifier.isPrivate(modifiers)) {
            return false;
        }
        return true;
    }

    public final Object b() {
        return O(new Object[0]);
    }

    public final boolean equals(Object obj) {
        s16 b = g18.b(obj);
        if (b != null && sg3.e(this.x, b.B()) && "<init>".equals(b.getName()) && sg3.e(h(), b.h()) && sg3.e((Object) null, b.G())) {
            return true;
        }
        return false;
    }

    public final ls3 f() {
        int modifiers = kl8.u(this.x).getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return ls3.w;
        }
        if (Modifier.isPrivate(modifiers)) {
            return ls3.z;
        }
        return null;
    }

    public final int g() {
        return this.y.size();
    }

    public final List getAnnotations() {
        return a42.w;
    }

    public final String getName() {
        return "<init>";
    }

    public final List getParameters() {
        return (List) this.B.getValue();
    }

    public final List getTypeParameters() {
        return a42.w;
    }

    public final String h() {
        return (String) this.z.getValue();
    }

    public final int hashCode() {
        return h().hashCode() + (((this.x.hashCode() * 31) + 1818100338) * 31);
    }

    public final boolean i() {
        return false;
    }

    public final boolean j() {
        return false;
    }

    public final as3 k() {
        return (as3) this.A.getValue();
    }

    public final boolean m() {
        return false;
    }

    public final dj0 n() {
        return (dj0) this.C.getValue();
    }

    public final el4 o() {
        return el4.x;
    }

    public final boolean q() {
        return false;
    }

    public final GenericDeclaration s() {
        return pd8.p(this.x, h());
    }

    public final String toString() {
        return d63.r(this);
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        return O(obj, obj2, obj3);
    }

    public final boolean w() {
        return false;
    }

    public final p16 x(yq3 yq3, fq3 fq3) {
        yq3.getClass();
        fq3.getClass();
        if (fq3.equals(fq3.j)) {
            return new yh3(this.x);
        }
        rf2.j("Constructors cannot have fake overrides: ", this);
        return null;
    }

    public final Object y(Object obj) {
        return O(obj);
    }
}
