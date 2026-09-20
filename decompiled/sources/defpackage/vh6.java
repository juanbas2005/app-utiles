package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvh6;", "Lpl4;", "Lch6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vh6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vh6 extends pl4 {
    public final gh6 w;
    public final boolean x;

    public vh6(gh6 gh6, boolean z) {
        this.w = gh6;
        this.x = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vh6)) {
            return false;
        }
        vh6 vh6 = (vh6) obj;
        if (!sg3.e(this.w, vh6.w) || this.x != vh6.x) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ch6, ll4] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        ll4.L = this.x;
        return ll4;
    }

    public final void h(ll4 ll4) {
        ch6 ch6 = (ch6) ll4;
        ch6.K = this.w;
        ch6.L = this.x;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.x) + hl6.i(this.w.hashCode() * 31, 31, false);
    }
}
