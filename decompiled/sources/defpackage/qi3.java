package defpackage;

import java.util.List;

/* renamed from: qi3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qi3 extends q16 implements tr3 {
    public final /* synthetic */ si3 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qi3(si3 si3) {
        super(fq3.j);
        this.x = si3;
    }

    public final yq3 B() {
        return this.x.x;
    }

    public final Object G() {
        return null;
    }

    public final boolean M() {
        return false;
    }

    public final yr3 N() {
        return this.x;
    }

    public final List a() {
        return a42.w;
    }

    public final Object b() {
        return this.x.y;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qi3)) {
            return false;
        }
        if (this.x.equals(((qi3) obj).x)) {
            return true;
        }
        return false;
    }

    public final ls3 f() {
        return ls3.w;
    }

    public final List getAnnotations() {
        return a42.w;
    }

    public final String getName() {
        return "<get-entries>";
    }

    public final List getParameters() {
        return a42.w;
    }

    public final List getTypeParameters() {
        return a42.w;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final boolean i() {
        return false;
    }

    public final boolean j() {
        return false;
    }

    public final as3 k() {
        return this.x.k();
    }

    public final boolean m() {
        return false;
    }

    public final dj0 n() {
        return this.x.A;
    }

    public final el4 o() {
        return el4.x;
    }

    public final boolean q() {
        return false;
    }

    public final String toString() {
        return "getter of " + this.x;
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
