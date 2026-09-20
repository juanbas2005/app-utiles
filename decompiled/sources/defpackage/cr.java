package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcr;", "Lpl4;", "Lf71;", "Lbk6;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cr  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cr extends pl4 implements bk6 {
    public final boolean w;
    public final vr2 x;

    public cr(vr2 vr2, boolean z) {
        this.w = z;
        this.x = vr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = (defpackage.cr) r3;
     */
    public final boolean equals(Object obj) {
        cr crVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof cr) && this.w == crVar.w && this.x == crVar.x) {
            return true;
        }
        return false;
    }

    public final ak6 f() {
        ak6 ak6 = new ak6();
        ak6.y = this.w;
        this.x.y(ak6);
        return ak6;
    }

    public final ll4 g() {
        return new f71(this.w, false, this.x);
    }

    public final void h(ll4 ll4) {
        f71 f71 = (f71) ll4;
        f71.K = this.w;
        f71.M = this.x;
    }

    public final int hashCode() {
        return this.x.hashCode() + (Boolean.hashCode(this.w) * 31);
    }
}
