package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lm35;", "Lpl4;", "Lw35;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: m35  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class m35 extends pl4 {
    public final boolean equals(Object obj) {
        m35 m35;
        if (this == obj) {
            return true;
        }
        if (obj instanceof m35) {
            m35 = (m35) obj;
        } else {
            m35 = null;
        }
        if (m35 != null && lx1.b(0.0f, 0.0f) && lx1.b(36.0f, 36.0f)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [ll4, w35] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = 36.0f;
        ll4.L = true;
        return ll4;
    }

    public final void h(ll4 ll4) {
        w35 w35 = (w35) ll4;
        w35.getClass();
        if (!lx1.b(0.0f, 0.0f) || !lx1.b(w35.K, 36.0f) || !w35.L) {
            rc9.O0(w35).Y(false);
        }
        w35.K = 36.0f;
        w35.L = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + f21.d(36.0f, Float.hashCode(0.0f) * 31, 31);
    }

    public final String toString() {
        return pb4.m("OffsetModifierElement(x=", lx1.c(0.0f), ", y=", lx1.c(36.0f), ", rtlAware=true)");
    }
}
