package defpackage;

/* renamed from: w37  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w37 implements c28 {
    public final Object a;

    public w37(Object obj) {
        this.a = obj;
    }

    public final Object a(vf5 vf5) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof w37) && sg3.e(this.a, ((w37) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ")";
    }
}
