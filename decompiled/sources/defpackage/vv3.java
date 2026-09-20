package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: vv3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vv3 extends sv3 implements qs2, kt2, s16 {
    public final nz3 A;
    public final nz3 B;
    public final nz3 C;
    public final yq3 x;
    public final String y;
    public final Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vv3(yq3 yq3, String str, Object obj, fq3 fq3) {
        super(fq3);
        yq3.getClass();
        str.getClass();
        fq3.getClass();
        this.x = yq3;
        this.y = str;
        this.z = obj;
        uv3 uv3 = new uv3(this, 0);
        i44 i44 = i44.w;
        this.A = rg3.y(i44, uv3);
        this.B = rg3.y(i44, new uv3(this, 1));
        this.C = rg3.y(i44, new uv3(this, 2));
        rg3.y(i44, new uv3(this, 3));
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
        return this.z;
    }

    public final Object H(Object obj, Object obj2) {
        return O(obj, obj2);
    }

    public final Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return O(obj, obj2, obj3, obj4, obj5);
    }

    public final sj0 P(Constructor constructor, boolean z2) {
        List<t16> parameters;
        if (!z2 && (this instanceof tv3)) {
            tv3 tv3 = (tv3) this;
            if (tv3.f() != ls3.z && ((parameters = tv3.getParameters()) == null || !parameters.isEmpty())) {
                for (t16 y2 : parameters) {
                    gq3 v = rj1.v(y2.y());
                    if (v.z()) {
                        if (!v.equals(b26.a.b(o66.class))) {
                            if (r16.Z(this)) {
                                return new ej0(constructor, r16.F(this), 0);
                            }
                            return new fj0(constructor, 0);
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

    public final jj0 Q(Method method, boolean z2) {
        if (!r16.Z(this)) {
            return new rj0(method, false, 6, 2);
        }
        yq3 yq3 = this.x;
        if (yq3 instanceof pr3) {
            return new qj0(method, z2, r16.F(this));
        }
        StringBuilder sb = new StringBuilder("Only top-level functions are supported for now: ");
        sb.append(yq3);
        rf2.n(sb, getName(), this.y);
        return null;
    }

    public abstract List R();

    public abstract uu3 S();

    public abstract to3 T();

    public abstract vp7 U();

    public abstract List V();

    public final List a() {
        return (List) this.A.getValue();
    }

    public final Object b() {
        return O(new Object[0]);
    }

    public final boolean equals(Object obj) {
        s16 b = g18.b(obj);
        if (b != null && sg3.e(this.x, b.B()) && sg3.e(getName(), b.getName()) && sg3.e(this.y, b.h()) && sg3.e(this.z, b.G())) {
            return true;
        }
        return false;
    }

    public final int g() {
        dj0 n = n();
        n.getClass();
        return n.a().size();
    }

    public final List getAnnotations() {
        AnnotatedElement annotatedElement;
        Member b = n().b();
        if (b instanceof AnnotatedElement) {
            annotatedElement = (AnnotatedElement) b;
        } else {
            annotatedElement = null;
        }
        if (annotatedElement == null) {
            return a42.w;
        }
        Annotation[] annotations = annotatedElement.getAnnotations();
        annotations.getClass();
        return g18.t(qs.p1(annotations));
    }

    public final List getParameters() {
        return (List) this.B.getValue();
    }

    public final List getTypeParameters() {
        return U().a;
    }

    public final String h() {
        return this.y;
    }

    public final int hashCode() {
        int hashCode = getName().hashCode();
        return this.y.hashCode() + ((hashCode + (this.x.hashCode() * 31)) * 31);
    }

    public final dj0 n() {
        return (dj0) this.C.getValue();
    }

    public final GenericDeclaration s() {
        return pd8.p(this.x, this.y);
    }

    public final String toString() {
        return d63.r(this);
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        return O(obj, obj2, obj3);
    }

    public final Object y(Object obj) {
        return O(obj);
    }
}
