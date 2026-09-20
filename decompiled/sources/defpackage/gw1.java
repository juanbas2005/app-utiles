package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lgw1;", "Lpl4;", "Lhw1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gw1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class gw1 extends pl4 {
    public final wz0 w;

    public gw1(wz0 wz0) {
        this.w = wz0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gw1) && sg3.e(this.w, ((gw1) obj).w)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [hw1, ll4] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        return ll4;
    }

    public final void h(ll4 ll4) {
        hw1 hw1 = (hw1) ll4;
        wz0 wz0 = hw1.K;
        wz0 wz02 = this.w;
        if (!sg3.e(wz0, wz02) && hw1.w.J) {
            wz0 wz03 = hw1.K;
            wz03.h();
            wz03.b = null;
            wz02.getClass();
            hw1.K = wz02;
        }
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.w + ")";
    }
}
