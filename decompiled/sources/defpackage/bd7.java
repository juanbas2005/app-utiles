package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lbd7;", "Lpl4;", "Ldd7;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bd7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class bd7 extends pl4 {
    public final te7 w;

    public bd7(te7 te7) {
        this.w = te7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bd7) && this.w == ((bd7) obj).w) {
            return true;
        }
        return false;
    }

    public final ll4 g() {
        return new dd7(this.w);
    }

    public final void h(ll4 ll4) {
        ((dd7) ll4).M = this.w;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }
}
