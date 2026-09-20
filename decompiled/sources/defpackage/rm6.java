package defpackage;

/* renamed from: rm6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rm6 {
    public final ym6 a;
    public final hr b;

    public rm6(ym6 ym6, hr hrVar) {
        this.a = ym6;
        this.b = hrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm6)) {
            return false;
        }
        rm6 rm6 = (rm6) obj;
        if (this.a.equals(rm6.a) && this.b.equals(rm6.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        return this.b.hashCode() + ((hashCode + (r72.x.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + r72.x + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
