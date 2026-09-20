package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lf20;", "Lpl4;", "Le20;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: f20  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f20 extends pl4 {
    public e20 w;
    public xu0 x;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public final ll4 g() {
        return new e20(this);
    }

    public final /* bridge */ /* synthetic */ void h(ll4 ll4) {
        e20 e20 = (e20) ll4;
    }

    public final int hashCode() {
        return 234;
    }

    public final Object i(h61 h61) {
        xu0 xu0 = this.x;
        if (xu0 == null) {
            xu0 = ag8.b();
            this.x = xu0;
            e20 e20 = this.w;
            if (e20 != null && e20.J) {
                e20.K = f55.r(e20, 0, 0, new m0(5, e20, e20.L));
            }
        }
        Object h = xu0.h(h61);
        if (h == p81.w) {
            return h;
        }
        return vs7.a;
    }
}
