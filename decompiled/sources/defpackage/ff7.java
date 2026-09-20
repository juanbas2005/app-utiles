package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lff7;", "Lpl4;", "Lgf7;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ff7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class ff7 extends pl4 {
    public final tg7 w;

    public ff7(tg7 tg7) {
        this.w = tg7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff7)) {
            return false;
        }
        return sg3.e(this.w, ((ff7) obj).w);
    }

    public final ll4 g() {
        return new gf7(this.w);
    }

    public final void h(ll4 ll4) {
        gf7 gf7 = (gf7) ll4;
        gf7.getClass();
        tg7 k = aa5.k(this.w, rc9.O0(gf7).U);
        gf7.V0(k, (dl2) h49.w(gf7, xy0.k));
        ef7 ef7 = gf7.M;
        if (ef7 != null) {
            ef7.a(ef7, (ey3) null, (tp1) null, k, 23);
            su0.B(gf7);
            return;
        }
        throw f21.p("Min size state is not set.");
    }

    public final int hashCode() {
        return this.w.hashCode();
    }
}
