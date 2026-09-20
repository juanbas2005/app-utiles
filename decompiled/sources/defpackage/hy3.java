package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lhy3;", "Lpl4;", "Liy3;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hy3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class hy3 extends pl4 {
    public final String w;

    public hy3(String str) {
        this.w = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof hy3) && this.w.equals(((hy3) obj).w)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [iy3, ll4] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        return ll4;
    }

    public final void h(ll4 ll4) {
        ((iy3) ll4).K = this.w;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.w + ")";
    }
}
