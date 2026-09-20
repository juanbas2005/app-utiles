package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lzq0;", "Lpl4;", "Lf71;", "Lbk6;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zq0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zq0 extends pl4 implements bk6 {
    public final vr2 w;

    public zq0(vr2 vr2) {
        this.w = vr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zq0) && this.w == ((zq0) obj).w) {
            return true;
        }
        return false;
    }

    public final ak6 f() {
        ak6 ak6 = new ak6();
        ak6.y = false;
        ak6.z = true;
        this.w.y(ak6);
        return ak6;
    }

    public final ll4 g() {
        return new f71(false, true, this.w);
    }

    public final void h(ll4 ll4) {
        ((f71) ll4).M = this.w;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }
}
