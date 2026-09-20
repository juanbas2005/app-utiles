package defpackage;

/* renamed from: cn5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cn5 extends yv4 {
    public final Object a;
    public final long b;

    public cn5(long j, Object obj) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn5)) {
            return false;
        }
        cn5 cn5 = (cn5) obj;
        if (this.a.equals(cn5.a) && this.b == cn5.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.a + ", compositeKey=" + this.b + ')';
    }
}
