package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.util.List;

/* renamed from: kj3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class kj3 extends vi3 implements ur3, u16 {
    public final nz3 A;
    public final nz3 B;
    public final nz3 C;
    public final nz3 D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kj3(yq3 yq3, Field field, Object obj, fq3 fq3) {
        super(yq3, field, obj, fq3);
        yq3.getClass();
        fq3.getClass();
        gj3 gj3 = new gj3(this, 0);
        i44 i44 = i44.w;
        this.A = rg3.y(i44, gj3);
        this.B = rg3.y(i44, new gj3(this, 1));
        this.C = rg3.y(i44, new gj3(this, 2));
        this.D = rg3.y(i44, new gj3(this, 3));
    }

    /* renamed from: P */
    public final jj3 c() {
        return (jj3) this.D.getValue();
    }

    public final Field Q() {
        Member member = this.y;
        member.getClass();
        return (Field) member;
    }

    public final List a() {
        return (List) this.A.getValue();
    }

    public final Object b() {
        return get();
    }

    public final boolean equals(Object obj) {
        u16 c = g18.c(obj);
        if (c != null && sg3.e(this.x, c.B()) && getName().equals(c.getName()) && h().equals(c.h()) && sg3.e(this.z, c.G())) {
            return true;
        }
        return false;
    }

    public final Object get() {
        return c().O(new Object[0]);
    }

    public final String getName() {
        String name = Q().getName();
        name.getClass();
        return name;
    }

    public final List getParameters() {
        return (List) this.B.getValue();
    }

    public final List getTypeParameters() {
        return a42.w;
    }

    public final String h() {
        return f55.k(Q());
    }

    public final int hashCode() {
        int hashCode = getName().hashCode();
        return h().hashCode() + ((hashCode + (this.x.hashCode() * 31)) * 31);
    }

    public final as3 k() {
        return (as3) this.C.getValue();
    }

    public final dj0 n() {
        return c().n();
    }

    public final el4 o() {
        return el4.x;
    }

    public final GenericDeclaration s() {
        return pd8.p(this.x, h());
    }

    public final Field t() {
        return Q();
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
        d63.l(getName(), sb);
        sb.append(": ");
        sb.append(d63.v(k(), false));
        return sb.toString();
    }

    public p16 x(yq3 yq3, fq3 fq3) {
        yq3.getClass();
        fq3.getClass();
        return new kj3(yq3, Q(), this.z, fq3);
    }
}
