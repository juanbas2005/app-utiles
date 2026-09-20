package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: yi3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yi3 extends aj3 {
    public final nz3 D;
    public final nz3 E;
    public final nz3 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yi3(yq3 yq3, Constructor constructor, Object obj) {
        super(yq3, constructor, obj, fq3.j);
        yq3.getClass();
        wi3 wi3 = new wi3(this, 0);
        i44 i44 = i44.w;
        this.D = rg3.y(i44, wi3);
        this.E = rg3.y(i44, new xi3(yq3, 0));
        this.F = rg3.y(i44, new wi3(this, 1));
    }

    public final Type[] P() {
        Type[] genericParameterTypes = T().getGenericParameterTypes();
        genericParameterTypes.getClass();
        return genericParameterTypes;
    }

    public final TypeVariable[] Q() {
        return (TypeVariable[]) this.D.getValue();
    }

    public final Class[] R() {
        Class[] parameterTypes = T().getParameterTypes();
        parameterTypes.getClass();
        return parameterTypes;
    }

    public final boolean S() {
        return T().isVarArgs();
    }

    public final Constructor T() {
        Member member = this.y;
        member.getClass();
        return (Constructor) member;
    }

    public final String getName() {
        return "<init>";
    }

    public final String h() {
        return f55.j(T());
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
        if (fq3.equals(fq3.j)) {
            return new yi3(yq3, T(), si0.w);
        }
        rf2.j("Constructors cannot have fake overrides: ", this);
        return null;
    }
}
