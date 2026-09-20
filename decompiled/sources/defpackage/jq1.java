package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ljq1;", "Lpl4;", "Lkq1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jq1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class jq1 extends pl4 {
    public final aa8 w;

    public jq1(aa8 aa8) {
        this.w = aa8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq1)) {
            return false;
        }
        if (sg3.e(this.w, ((jq1) obj).w)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [dd3, ll4, kq1] */
    public final ll4 g() {
        kj6 kj6 = fd1.j;
        ? dd3 = new dd3();
        dd3.M = this.w;
        dd3.N = kj6;
        dd3.O = gl0.u;
        return dd3;
    }

    public final void h(ll4 ll4) {
        kq1 kq1 = (kq1) ll4;
        kj6 kj6 = fd1.j;
        aa8 aa8 = kq1.M;
        aa8 aa82 = this.w;
        if (!sg3.e(aa8, aa82) || kj6 != kq1.N) {
            kq1.M = aa82;
            kq1.N = kj6;
            kq1.O = new y72(aa82, kq1.K);
            su0.B(kq1);
        }
    }

    public final int hashCode() {
        return fd1.j.hashCode() + (this.w.hashCode() * 31);
    }
}
