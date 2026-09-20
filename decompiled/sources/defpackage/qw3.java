package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: qw3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class qw3 extends sv3 implements u16 {
    public final su3 A;
    public final nz3 B;
    public final nz3 C;
    public final nz3 D;
    public final nz3 E;
    public final nz3 F;
    public final yq3 x;
    public final String y;
    public final Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qw3(yq3 yq3, String str, Object obj, su3 su3, fq3 fq3) {
        super(fq3);
        yq3.getClass();
        str.getClass();
        su3.getClass();
        fq3.getClass();
        this.x = yq3;
        this.y = str;
        this.z = obj;
        this.A = su3;
        fw3 fw3 = new fw3(this, 0);
        i44 i44 = i44.w;
        this.B = rg3.y(i44, fw3);
        this.C = rg3.y(i44, new fw3(this, 1));
        this.D = rg3.y(i44, new fw3(this, 2));
        this.E = rg3.y(i44, new fw3(this, 3));
        this.F = rg3.y(i44, new fw3(this, 4));
    }

    public final yq3 B() {
        return this.x;
    }

    public final Object G() {
        return this.z;
    }

    public final Member P() {
        yr3[] yr3Arr = su.a;
        su3 su3 = this.A;
        su3.getClass();
        if (!su.r.C(su.a[41], su3)) {
            return null;
        }
        to3 to3 = tf4.z(su3).f;
        if (to3 == null) {
            return t();
        }
        return this.x.N(to3.C, to3.D);
    }

    public abstract hw3 Q();

    public final List a() {
        return (List) this.B.getValue();
    }

    public final boolean equals(Object obj) {
        u16 c = g18.c(obj);
        if (c != null && sg3.e(this.x, c.B()) && sg3.e(this.A.b, c.getName()) && sg3.e(this.y, c.h()) && sg3.e(this.z, c.G())) {
            return true;
        }
        return false;
    }

    public final ls3 f() {
        return pd8.O(su.b(this.A));
    }

    public final List getAnnotations() {
        Annotation[] annotations;
        boolean v = jb5.v(this);
        su3 su3 = this.A;
        yq3 yq3 = this.x;
        if (v || yq3.b().isAnnotation()) {
            ArrayList arrayList = su3.m;
            ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(pd8.H((lt3) it.next(), m06.d(yq3.b())));
            }
            return arrayList2;
        } else if (yq3 instanceof pr3) {
            su3.getClass();
            to3 to3 = tf4.z(su3).e;
            if (to3 == null) {
                return a42.w;
            }
            Method N = yq3.N(to3.C, to3.D);
            if (N != null && (annotations = N.getAnnotations()) != null) {
                return g18.t(qs.p1(annotations));
            }
            rf2.x("No synthetic method found: ", this);
            return null;
        } else {
            StringBuilder sb = new StringBuilder("Annotations are only supported for top-level properties for now: ");
            sb.append(yq3);
            rf2.n(sb, su3.b, this.y);
            return null;
        }
    }

    public final String getName() {
        return this.A.b;
    }

    public final List getParameters() {
        return (List) this.C.getValue();
    }

    public final List getTypeParameters() {
        return ((vp7) this.E.getValue()).a;
    }

    public final String h() {
        return this.y;
    }

    public final int hashCode() {
        return this.y.hashCode() + hl6.h(this.x.hashCode() * 31, 31, this.A.b);
    }

    public final boolean i() {
        return false;
    }

    public final as3 k() {
        return (as3) this.D.getValue();
    }

    public final dj0 n() {
        return Q().n();
    }

    public final el4 o() {
        yr3[] yr3Arr = su.a;
        su3 su3 = this.A;
        su3.getClass();
        return (el4) su.p.I(su.a[34], su3);
    }

    public final GenericDeclaration s() {
        return pd8.p(this.x, this.y);
    }

    public final Field t() {
        return (Field) this.F.getValue();
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
        d63.l(this.A.b, sb);
        sb.append(": ");
        sb.append(d63.v(k(), false));
        return sb.toString();
    }
}
