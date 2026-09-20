package defpackage;

/* renamed from: an6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class an6 {
    public final qd3 a;
    public final qd3 b;
    public final qd3 c;

    public an6(qd3 qd3, qd3 qd32, qd3 qd33) {
        qd3.getClass();
        this.a = qd3;
        this.b = qd32;
        this.c = qd33;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an6)) {
            return false;
        }
        an6 an6 = (an6) obj;
        if (sg3.e(this.a, an6.a) && sg3.e(this.b, an6.b) && sg3.e(this.c, an6.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        int i2 = 0;
        qd3 qd3 = this.b;
        if (qd3 == null) {
            i = 0;
        } else {
            i = qd3.hashCode();
        }
        int i3 = (hashCode + i) * 31;
        qd3 qd32 = this.c;
        if (qd32 != null) {
            i2 = qd32.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "SessionRefreshInformation(autoRefreshStartedAt=" + this.a + ", lastRefreshedAt=" + this.b + ", refreshingAt=" + this.c + ')';
    }
}
