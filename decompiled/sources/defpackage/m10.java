package defpackage;

import java.util.HashMap;

/* renamed from: m10  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m10 {
    public final es0 a;
    public final HashMap b;

    public m10(es0 es0, HashMap hashMap) {
        this.a = es0;
        this.b = hashMap;
    }

    public final long a(to5 to5, long j, int i) {
        long j2;
        long b2 = j - this.a.b();
        n10 n10 = (n10) this.b.get(to5);
        long j3 = n10.a;
        int i2 = i - 1;
        if (j3 > 1) {
            j2 = j3;
        } else {
            j2 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, (double) i2) * ((double) j3) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) (j2 * ((long) i2))))), b2), n10.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m10)) {
            return false;
        }
        m10 m10 = (m10) obj;
        if (!this.a.equals(m10.a) || !this.b.equals(m10.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
