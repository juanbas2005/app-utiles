package defpackage;

/* renamed from: rt6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rt6 {
    public final int a;
    public final int b;

    public rt6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt6)) {
            return false;
        }
        rt6 rt6 = (rt6) obj;
        if (this.a == rt6.a && this.b == rt6.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return pb4.k("SignalValues(dbm=", this.a, ", level=", this.b, ")");
    }
}
