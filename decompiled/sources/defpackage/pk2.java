package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lpk2;", "Lpl4;", "Lrk2;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pk2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class pk2 extends pl4 {
    public final ok2 w;

    public pk2(ok2 ok2) {
        this.w = ok2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof pk2) && sg3.e(this.w, ((pk2) obj).w)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, rk2] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        return ll4;
    }

    public final void h(ll4 ll4) {
        rk2 rk2 = (rk2) ll4;
        rk2.K.a.k(rk2);
        ok2 ok2 = this.w;
        rk2.K = ok2;
        ok2.a.b(rk2);
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.w + ")";
    }
}
