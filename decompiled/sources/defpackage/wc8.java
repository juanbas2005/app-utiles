package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lwc8;", "Lpl4;", "Lrs6;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wc8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wc8 extends pl4 {
    public final kb w;

    public wc8(kb kbVar) {
        this.w = kbVar;
    }

    public final boolean equals(Object obj) {
        wc8 wc8;
        if (this == obj) {
            return true;
        }
        if (obj instanceof wc8) {
            wc8 = (wc8) obj;
        } else {
            wc8 = null;
        }
        if (wc8 == null) {
            return false;
        }
        return sg3.e(this.w, wc8.w);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rs6, ll4] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        return ll4;
    }

    public final void h(ll4 ll4) {
        ((rs6) ll4).K = this.w;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }
}
