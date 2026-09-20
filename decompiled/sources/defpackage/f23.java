package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lf23;", "Lpl4;", "Lg23;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: f23  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f23 extends pl4 {
    public final g80 w;

    public f23(g80 g80) {
        this.w = g80;
    }

    public final boolean equals(Object obj) {
        f23 f23;
        if (this == obj) {
            return true;
        }
        if (obj instanceof f23) {
            f23 = (f23) obj;
        } else {
            f23 = null;
        }
        if (f23 == null) {
            return false;
        }
        return this.w.equals(f23.w);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, g23] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        return ll4;
    }

    public final void h(ll4 ll4) {
        ((g23) ll4).K = this.w;
    }

    public final int hashCode() {
        return Float.hashCode(this.w.a);
    }
}
