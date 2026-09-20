package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Lik;", "S", "Lpl4;", "Llk;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ik  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class ik<S> extends pl4 {
    public final bm7 w;
    public final aq4 x;
    public final mk y;

    public ik(bm7 bm7, aq4 aq4, mk mkVar) {
        this.w = bm7;
        this.x = aq4;
        this.y = mkVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ik)) {
            return false;
        }
        ik ikVar = (ik) obj;
        if (!sg3.e(ikVar.w, this.w) || !ikVar.x.equals(this.x)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, ng3, lk] */
    public final ll4 g() {
        ? ng3 = new ng3(1);
        ng3.L = this.w;
        ng3.M = this.x;
        ng3.N = this.y;
        ng3.O = -9223372034707292160L;
        return ng3;
    }

    public final void h(ll4 ll4) {
        lk lkVar = (lk) ll4;
        lkVar.L = this.w;
        lkVar.M = this.x;
        lkVar.N = this.y;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.y.hashCode() * 31;
        bm7 bm7 = this.w;
        if (bm7 != null) {
            i = bm7.hashCode();
        } else {
            i = 0;
        }
        return this.x.hashCode() + ((hashCode + i) * 31);
    }
}
