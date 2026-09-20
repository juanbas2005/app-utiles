package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* renamed from: aj3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class aj3 extends vi3 implements qs2, kt2, s16 {
    public final nz3 A;
    public final nz3 B;
    public final nz3 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aj3(yq3 yq3, Member member, Object obj, fq3 fq3) {
        super(yq3, member, obj, fq3);
        yq3.getClass();
        fq3.getClass();
        zi3 zi3 = new zi3(this, 0);
        i44 i44 = i44.w;
        this.A = rg3.y(i44, zi3);
        this.B = rg3.y(i44, new zi3(this, 1));
        this.C = rg3.y(i44, new zi3(this, 2));
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

    public final Object H(Object obj, Object obj2) {
        return O(obj, obj2);
    }

    public final Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return O(obj, obj2, obj3, obj4, obj5);
    }

    public abstract Type[] P();

    public abstract TypeVariable[] Q();

    public abstract Class[] R();

    public abstract boolean S();

    public final List a() {
        return (List) this.A.getValue();
    }

    public final Object b() {
        return O(new Object[0]);
    }

    public final boolean equals(Object obj) {
        s16 b = g18.b(obj);
        if (b != null && sg3.e(this.x, b.B()) && sg3.e(getName(), b.getName()) && sg3.e(h(), b.h()) && sg3.e(this.z, b.G())) {
            return true;
        }
        return false;
    }

    public final int g() {
        dj0 n = n();
        n.getClass();
        return n.a().size();
    }

    public final List getParameters() {
        return (List) this.B.getValue();
    }

    public final List getTypeParameters() {
        return (List) this.C.getValue();
    }

    public final int hashCode() {
        int hashCode = getName().hashCode();
        return h().hashCode() + ((hashCode + (this.x.hashCode() * 31)) * 31);
    }

    public final boolean j() {
        return false;
    }

    public final boolean m() {
        return Modifier.isNative(this.y.getModifiers());
    }

    public final boolean q() {
        if (this instanceof yi3) {
            return false;
        }
        Member member = this.y;
        if (Modifier.isStatic(member.getModifiers())) {
            return false;
        }
        rf2.j("Only Java constructors and static functions are supported for now: ", member);
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

    public final Object y(Object obj) {
        return O(obj);
    }
}
