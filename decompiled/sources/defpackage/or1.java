package defpackage;

/* renamed from: or1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class or1 extends kr1 implements fr3 {
    public static final /* synthetic */ yr3[] E = {new gr5(or1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0)};
    public final y16 C = p25.u((ri0) null, new nr1(this, 0));
    public final nz3 D = rg3.y(i44.w, new nr1(this, 1));

    public final ds1 Q() {
        yr3 yr3 = E[0];
        Object b = this.C.b();
        b.getClass();
        return new ds1(ts1.e((jr5) b).x(), x10.B, false);
    }

    public final ri0 R() {
        yr3 yr3 = E[0];
        Object b = this.C.b();
        b.getClass();
        return (jr5) b;
    }

    public final ar5 S() {
        yr3 yr3 = E[0];
        Object b = this.C.b();
        b.getClass();
        return (jr5) b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof or1) || !sg3.e(T(), ((or1) obj).T())) {
            return false;
        }
        return true;
    }

    public final String getName() {
        return hl6.o(new StringBuilder("<set-"), T().D, '>');
    }

    public final int hashCode() {
        return T().hashCode();
    }

    public final dj0 n() {
        return (dj0) this.D.getValue();
    }

    public final String toString() {
        return "setter of " + T();
    }

    public final p16 x(yq3 yq3, fq3 fq3) {
        yq3.getClass();
        fq3.getClass();
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }
}
