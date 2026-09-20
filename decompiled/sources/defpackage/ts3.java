package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lts3;", "Lpl4;", "Lvs3;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ts3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class ts3 extends pl4 {
    public final vr2 w;
    public final vr2 x;

    public ts3(vr2 vr2, vr2 vr22) {
        this.w = vr2;
        this.x = vr22;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.ts3) r5;
     */
    public final boolean equals(Object obj) {
        ts3 ts3;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ts3) && this.w == ts3.w && this.x == ts3.x) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, vs3] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        ll4.L = this.x;
        return ll4;
    }

    public final void h(ll4 ll4) {
        vs3 vs3 = (vs3) ll4;
        vs3.K = this.w;
        vs3.L = this.x;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        vr2 vr2 = this.w;
        if (vr2 != null) {
            i = vr2.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        vr2 vr22 = this.x;
        if (vr22 != null) {
            i2 = vr22.hashCode();
        }
        return i3 + i2;
    }
}
