package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lts7;", "Lpl4;", "Lus7;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ts7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class ts7 extends pl4 {
    public final aa8 w;

    public ts7(aa8 aa8) {
        this.w = aa8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts7)) {
            return false;
        }
        return ((ts7) obj).w.equals(this.w);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [dd3, ll4, us7] */
    public final ll4 g() {
        ? dd3 = new dd3();
        dd3.M = this.w;
        return dd3;
    }

    public final void h(ll4 ll4) {
        us7 us7 = (us7) ll4;
        aa8 aa8 = us7.M;
        aa8 aa82 = this.w;
        if (!aa82.equals(aa8)) {
            us7.M = aa82;
            us7.W0();
        }
    }

    public final int hashCode() {
        return this.w.hashCode();
    }
}
