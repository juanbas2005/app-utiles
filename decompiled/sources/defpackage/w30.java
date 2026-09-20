package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lw30;", "Lpl4;", "Lb40;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: w30  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class w30 extends pl4 {
    public final long w;
    public final kc0 x;
    public final float y;
    public final pq6 z;

    public w30(long j, kc0 kc0, pq6 pq6, int i) {
        j = (i & 1) != 0 ? jt0.g : j;
        kc0 = (i & 2) != 0 ? null : kc0;
        this.w = j;
        this.x = kc0;
        this.y = 1.0f;
        this.z = pq6;
    }

    public final boolean equals(Object obj) {
        w30 w30;
        if (obj instanceof w30) {
            w30 = (w30) obj;
        } else {
            w30 = null;
        }
        if (w30 != null && jt0.c(this.w, w30.w) && sg3.e(this.x, w30.x) && this.y == w30.y && sg3.e(this.z, w30.z)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, b40] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        ll4.L = this.x;
        ll4.M = this.y;
        ll4.N = this.z;
        ll4.O = 9205357640488583168L;
        return ll4;
    }

    public final void h(ll4 ll4) {
        b40 b40 = (b40) ll4;
        b40.K = this.w;
        b40.L = this.x;
        b40.M = this.y;
        pq6 pq6 = b40.N;
        pq6 pq62 = this.z;
        if (!sg3.e(pq6, pq62)) {
            b40.N = pq62;
            g75.D(b40);
        }
        rc9.e0(b40);
    }

    public final int hashCode() {
        int i;
        int i2 = jt0.h;
        int hashCode = Long.hashCode(this.w) * 31;
        kc0 kc0 = this.x;
        if (kc0 != null) {
            i = kc0.hashCode();
        } else {
            i = 0;
        }
        return this.z.hashCode() + f21.d(this.y, (hashCode + i) * 31, 31);
    }
}
