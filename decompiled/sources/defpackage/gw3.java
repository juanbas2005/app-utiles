package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: gw3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class gw3 extends sv3 implements zq3, rr3 {
    /* JADX WARNING: Illegal instructions before constructor call */
    public gw3() {
        super(r0);
        fq3 fq3 = fq3.j;
        fq3.getClass();
    }

    public final yq3 B() {
        return Q().x;
    }

    public final Object G() {
        return Q().z;
    }

    public abstract tu3 P();

    public abstract qw3 Q();

    public final ls3 f() {
        k78 k78;
        ls3 O;
        tu3 P = P();
        if (P == null || (k78 = (k78) su.s.I(su.a[44], P)) == null || (O = pd8.O(k78)) == null) {
            return Q().f();
        }
        return O;
    }

    public final List getAnnotations() {
        Method method;
        Annotation[] annotations;
        boolean v = jb5.v(Q());
        List list = a42.w;
        if (v) {
            return list;
        }
        Member b = n().b();
        List list2 = null;
        if (b instanceof Method) {
            method = (Method) b;
        } else {
            method = null;
        }
        if (!(method == null || (annotations = method.getAnnotations()) == null)) {
            list2 = qs.p1(annotations);
        }
        if (list2 != null) {
            list = list2;
        }
        return g18.t(list);
    }

    public final List getTypeParameters() {
        return Q().getTypeParameters();
    }

    public final boolean i() {
        return false;
    }

    public final boolean j() {
        tu3 P = P();
        if (P == null || !su.v.C(su.a[48], P)) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        tu3 P = P();
        if (P == null || !su.u.C(su.a[47], P)) {
            return false;
        }
        return true;
    }

    public final el4 o() {
        el4 el4;
        tu3 P = P();
        if (P == null || (el4 = (el4) su.t.I(su.a[45], P)) == null) {
            return Q().o();
        }
        return el4;
    }

    public final boolean q() {
        return false;
    }

    public final boolean w() {
        return false;
    }

    public final p16 x(yq3 yq3, fq3 fq3) {
        yq3.getClass();
        fq3.getClass();
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }
}
