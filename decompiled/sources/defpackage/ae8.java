package defpackage;

import java.util.List;

/* renamed from: ae8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ae8 {
    public final String a;
    public final kd8 b;
    public final ce1 c;
    public final long d;
    public final long e;
    public final long f;
    public final j31 g;
    public final int h;
    public final d40 i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final List q;

    public ae8(String str, kd8 kd8, ce1 ce1, long j2, long j3, long j4, j31 j31, int i2, d40 d40, long j5, long j6, int i3, int i4, long j7, int i5, List list, List list2) {
        str.getClass();
        ce1.getClass();
        this.a = str;
        this.b = kd8;
        this.c = ce1;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j31;
        this.h = i2;
        this.i = d40;
        this.j = j5;
        this.k = j6;
        this.l = i3;
        this.m = i4;
        this.n = j7;
        this.o = i5;
        this.p = list;
        this.q = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae8)) {
            return false;
        }
        ae8 ae8 = (ae8) obj;
        if (sg3.e(this.a, ae8.a) && this.b == ae8.b && sg3.e(this.c, ae8.c) && this.d == ae8.d && this.e == ae8.e && this.f == ae8.f && this.g.equals(ae8.g) && this.h == ae8.h && this.i == ae8.i && this.j == ae8.j && this.k == ae8.k && this.l == ae8.l && this.m == ae8.m && this.n == ae8.n && this.o == ae8.o && this.p.equals(ae8.p) && this.q.equals(ae8.q)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int b2 = pb4.b(pb4.b(pb4.b((this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
        return this.q.hashCode() + hl6.j(this.p, f21.e(this.o, pb4.b(f21.e(this.m, f21.e(this.l, pb4.b(pb4.b((this.i.hashCode() + f21.e(this.h, (this.g.hashCode() + b2) * 31, 31)) * 31, 31, this.j), 31, this.k), 31), 31), 31, this.n), 31), 31);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", initialDelay=" + this.d + ", intervalDuration=" + this.e + ", flexDuration=" + this.f + ", constraints=" + this.g + ", runAttemptCount=" + this.h + ", backoffPolicy=" + this.i + ", backoffDelayDuration=" + this.j + ", lastEnqueueTime=" + this.k + ", periodCount=" + this.l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.n + ", stopReason=" + this.o + ", tags=" + this.p + ", progress=" + this.q + ')';
    }
}
