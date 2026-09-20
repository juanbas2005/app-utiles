package defpackage;

import java.util.List;

/* renamed from: hj3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class hj3 extends q16 implements zq3, rr3 {
    public hj3() {
        super(fq3.j);
    }

    public final yq3 B() {
        return P().x;
    }

    public final Object G() {
        return P().z;
    }

    public final boolean M() {
        return P().M();
    }

    public abstract kj3 P();

    public final ls3 f() {
        return P().f();
    }

    public final List getAnnotations() {
        return a42.w;
    }

    public final List getTypeParameters() {
        return a42.w;
    }

    public final boolean i() {
        return false;
    }

    public final boolean j() {
        return false;
    }

    public final boolean m() {
        return false;
    }

    public final el4 o() {
        P().getClass();
        return el4.x;
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
