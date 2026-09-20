package defpackage;

import java.util.HashSet;
import java.util.UUID;

/* renamed from: ld8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ld8 {
    public final UUID a;
    public final kd8 b;
    public final HashSet c;
    public final ce1 d;
    public final ce1 e;
    public final int f;
    public final int g;
    public final j31 h;
    public final long i;
    public final jd8 j;
    public final long k;
    public final int l;

    public ld8(UUID uuid, kd8 kd8, HashSet hashSet, ce1 ce1, ce1 ce12, int i2, int i3, j31 j31, long j2, jd8 jd8, long j3, int i4) {
        ce1.getClass();
        ce12.getClass();
        this.a = uuid;
        this.b = kd8;
        this.c = hashSet;
        this.d = ce1;
        this.e = ce12;
        this.f = i2;
        this.g = i3;
        this.h = j31;
        this.i = j2;
        this.j = jd8;
        this.k = j3;
        this.l = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ld8.class.equals(obj.getClass())) {
            return false;
        }
        ld8 ld8 = (ld8) obj;
        if (this.f == ld8.f && this.g == ld8.g && this.a.equals(ld8.a) && this.b == ld8.b && sg3.e(this.d, ld8.d) && this.h.equals(ld8.h) && this.i == ld8.i && sg3.e(this.j, ld8.j) && this.k == ld8.k && this.l == ld8.l && this.c.equals(ld8.c)) {
            return sg3.e(this.e, ld8.e);
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.b.hashCode();
        int hashCode2 = this.d.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = this.e.hashCode();
        int b2 = pb4.b((this.h.hashCode() + ((((((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g) * 31)) * 31, 31, this.i);
        jd8 jd8 = this.j;
        if (jd8 != null) {
            i2 = jd8.hashCode();
        } else {
            i2 = 0;
        }
        return Integer.hashCode(this.l) + pb4.b((b2 + i2) * 31, 31, this.k);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.d + ", tags=" + this.c + ", progress=" + this.e + ", runAttemptCount=" + this.f + ", generation=" + this.g + ", constraints=" + this.h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}
