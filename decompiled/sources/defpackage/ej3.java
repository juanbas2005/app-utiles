package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: ej3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ej3 extends aj3 {
    public final nz3 D;
    public final nz3 E;
    public final nz3 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ej3(yq3 yq3, Method method, Object obj, fq3 fq3) {
        super(yq3, method, obj, fq3);
        yq3.getClass();
        fq3.getClass();
        dj3 dj3 = new dj3(this, 0);
        i44 i44 = i44.w;
        this.D = rg3.y(i44, dj3);
        this.E = rg3.y(i44, new dj3(this, 1));
        this.F = rg3.y(i44, new dj3(this, 2));
    }

    public final Type[] P() {
        Type[] genericParameterTypes = T().getGenericParameterTypes();
        genericParameterTypes.getClass();
        return genericParameterTypes;
    }

    public final TypeVariable[] Q() {
        Object value = this.D.getValue();
        value.getClass();
        return (TypeVariable[]) value;
    }

    public final Class[] R() {
        Class[] parameterTypes = T().getParameterTypes();
        parameterTypes.getClass();
        return parameterTypes;
    }

    public final boolean S() {
        return T().isVarArgs();
    }

    public final Method T() {
        Member member = this.y;
        member.getClass();
        return (Method) member;
    }

    public final String getName() {
        String name = this.y.getName();
        name.getClass();
        return name;
    }

    public final String h() {
        return f55.l(T());
    }

    public final as3 k() {
        return (as3) this.E.getValue();
    }

    public final dj0 n() {
        return (dj0) this.F.getValue();
    }

    public final p16 x(yq3 yq3, fq3 fq3) {
        yq3.getClass();
        fq3.getClass();
        return new ej3(yq3, T(), si0.w, fq3);
    }
}
