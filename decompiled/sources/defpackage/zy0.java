package defpackage;

/* renamed from: zy0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zy0 implements c28 {
    public final vr2 a;

    public zy0(vr2 vr2) {
        this.a = vr2;
    }

    public final Object a(vf5 vf5) {
        return this.a.y(vf5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zy0) && sg3.e(this.a, ((zy0) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ")";
    }
}
