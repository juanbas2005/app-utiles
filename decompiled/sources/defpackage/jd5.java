package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ljd5;", "Lpl4;", "Lkd5;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jd5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class jd5 extends pl4 {
    public final bd5 w;

    public jd5(bd5 bd5) {
        this.w = bd5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jd5) && sg3.e(this.w, ((jd5) obj).w)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, kd5] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = 1.0f;
        ll4.L = this.w;
        return ll4;
    }

    public final void h(ll4 ll4) {
        kd5 kd5 = (kd5) ll4;
        kd5.K = 1.0f;
        kd5.L = this.w;
    }

    public final int hashCode() {
        int i;
        bd5 bd5 = this.w;
        if (bd5 != null) {
            i = bd5.hashCode();
        } else {
            i = 0;
        }
        return Float.hashCode(1.0f) + (i * 961);
    }
}
