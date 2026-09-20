package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lod7;", "Lpl4;", "Lqd7;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: od7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class od7 extends pl4 {
    public final kg5 w;
    public final ne1 x;
    public final ue7 y;
    public final o71 z;

    public od7(kg5 kg5, ne1 ne1, ue7 ue7, o71 o71) {
        this.w = kg5;
        this.x = ne1;
        this.y = ue7;
        this.z = o71;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = (defpackage.od7) r3;
     */
    public final boolean equals(Object obj) {
        od7 od7;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof od7) && this.w == od7.w && this.x == od7.x && this.y == od7.y && this.z == od7.z) {
            return true;
        }
        return false;
    }

    public final ll4 g() {
        return new qd7(this.w, this.x, this.y, this.z);
    }

    public final void h(ll4 ll4) {
        qj7 qj7;
        qd7 qd7 = (qd7) ll4;
        qd7.M.x = null;
        kg5 kg5 = this.w;
        qd7.M = kg5;
        kg5.x = qd7;
        if (qd7.J) {
            qj7 = qj7.y;
        } else {
            qj7 = qj7.x;
        }
        kg5.y = qj7;
        qd7.N = this.x;
        qd7.O = this.y;
        qd7.P = this.z;
    }

    public final int hashCode() {
        int hashCode = this.x.hashCode();
        int hashCode2 = this.y.hashCode();
        return this.z.hashCode() + ((hashCode2 + ((hashCode + (this.w.hashCode() * 31)) * 31)) * 31);
    }
}
