package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: xq1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xq1 extends vq1 implements qs2, kt2, s16 {
    public static final /* synthetic */ yr3[] H = {new gr5(xq1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0)};
    public final yq3 C;
    public final String D;
    public final Object E;
    public final y16 F;
    public final nz3 G;

    public xq1(yq3 yq3, String str, String str2, xs2 xs2, Object obj, fq3 fq3) {
        super(fq3);
        this.C = yq3;
        this.D = str2;
        this.E = obj;
        this.F = p25.u(xs2, new p3(this, false, str, 4));
        wq1 wq1 = new wq1(this, 0);
        i44 i44 = i44.w;
        this.G = rg3.y(i44, wq1);
        rg3.y(i44, new wq1(this, 1));
    }

    public final yq3 B() {
        return this.C;
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
        return this.E;
    }

    public final Object H(Object obj, Object obj2) {
        return O(obj, obj2);
    }

    public final Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return O(obj, obj2, obj3, obj4, obj5);
    }

    public final ds1 Q() {
        vw3 k = R().k();
        k.getClass();
        return new ds1(k, new wq1(this, 2), false);
    }

    public final sj0 S(Constructor constructor, xs2 xs2, boolean z) {
        wp0 wp0;
        if (!z) {
            if (xs2 instanceof wp0) {
                wp0 = (wp0) xs2;
            } else {
                wp0 = null;
            }
            if (wp0 != null && !vs1.e(wp0.f())) {
                ql4 r1 = wp0.r1();
                r1.getClass();
                if (!dc3.b(r1) && !rs1.o(wp0.r1())) {
                    List<h28> S = wp0.S();
                    S.getClass();
                    if (!S.isEmpty()) {
                        for (h28 b : S) {
                            vw3 b2 = b.b();
                            b2.getClass();
                            if (mp7.k0(b2)) {
                                if (r16.Z(this)) {
                                    return new ej0(constructor, r16.F(this), 0);
                                }
                                return new fj0(constructor, 0);
                            }
                        }
                    }
                }
            }
        }
        if (r16.Z(this)) {
            return new ej0(constructor, r16.F(this), 1);
        }
        return new fj0(constructor, 1);
    }

    public final jj0 T(Method method, boolean z) {
        Object obj;
        boolean z2 = false;
        if (!r16.Z(this)) {
            return new rj0(method, false, 6, 2);
        }
        qz3 W = R().W();
        if (W != null) {
            vw3 b = W.b();
            int i = dc3.a;
            vq0 u = b.L().u();
            if (u != null) {
                z2 = dc3.a(u);
            }
            if (z2) {
                Class[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                Class cls = (Class) qs.X0(parameterTypes);
                if (cls != null && cls.isInterface()) {
                    obj = this.E;
                    return new qj0(method, z, obj);
                }
            }
        }
        obj = r16.F(this);
        return new qj0(method, z, obj);
    }

    /* renamed from: U */
    public final xs2 R() {
        yr3 yr3 = H[0];
        Object b = this.F.b();
        b.getClass();
        return (xs2) b;
    }

    public final Object b() {
        return O(new Object[0]);
    }

    public final boolean equals(Object obj) {
        s16 b = g18.b(obj);
        if (b != null && sg3.e(this.C, b.B()) && getName().equals(b.getName()) && sg3.e(this.D, b.h()) && sg3.e(this.E, b.G())) {
            return true;
        }
        return false;
    }

    public final int g() {
        dj0 n = n();
        n.getClass();
        return n.a().size();
    }

    public final String getName() {
        String b = ((wj1) R()).getName().b();
        b.getClass();
        return b;
    }

    public final String h() {
        return this.D;
    }

    public final int hashCode() {
        int hashCode = getName().hashCode();
        return this.D.hashCode() + ((hashCode + (this.C.hashCode() * 31)) * 31);
    }

    public final boolean i() {
        return R().i();
    }

    public final boolean j() {
        if (this.w.i || R().j()) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (this.w.f || R().m()) {
            return true;
        }
        return false;
    }

    public final dj0 n() {
        return (dj0) this.G.getValue();
    }

    public final boolean q() {
        if (this.w.g || R().q()) {
            return true;
        }
        return false;
    }

    public final GenericDeclaration s() {
        return pd8.p(this.C, this.D);
    }

    public final String toString() {
        return d63.r(this);
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        return O(obj, obj2, obj3);
    }

    public final boolean w() {
        if (this.w.h || R().w()) {
            return true;
        }
        return false;
    }

    public final p16 x(yq3 yq3, fq3 fq3) {
        yq3.getClass();
        fq3.getClass();
        return new xq1(yq3, R(), fq3);
    }

    public final Object y(Object obj) {
        return O(obj);
    }

    public /* synthetic */ xq1(yq3 yq3, xs2 xs2) {
        this(yq3, xs2, fq3.j);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public xq1(yq3 yq3, xs2 xs2, fq3 fq3) {
        this(yq3, r3, ta6.c(xs2).m(), xs2, si0.w, fq3);
        yq3.getClass();
        xs2.getClass();
        fq3.getClass();
        String b = ((wj1) xs2).getName().b();
        b.getClass();
    }
}
