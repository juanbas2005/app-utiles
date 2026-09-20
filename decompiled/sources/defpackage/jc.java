package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Ljc;", "T", "Lpl4;", "Lvc;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jc  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
final class jc<T> extends pl4 {
    public final bd w;
    public final boolean x;
    public final Boolean y;

    public jc(bd bdVar, boolean z, Boolean bool) {
        this.w = bdVar;
        this.x = z;
        this.y = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc)) {
            return false;
        }
        jc jcVar = (jc) obj;
        if (sg3.e(this.w, jcVar.w) && this.x == jcVar.x && this.y.equals(jcVar.y)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ll4, ty1, vc] */
    public final ll4 g() {
        ? ty1 = new ty1(rc.a, this.x, (ap4) null, z75.x);
        ty1.f0 = this.w;
        ty1.g0 = this.y;
        return ty1;
    }

    public final void h(ll4 ll4) {
        boolean z;
        boolean z2;
        vc vcVar = (vc) ll4;
        vcVar.getClass();
        bd bdVar = vcVar.f0;
        bd bdVar2 = this.w;
        if (!sg3.e(bdVar, bdVar2)) {
            vcVar.f0 = bdVar2;
            vcVar.s1();
            z = true;
        } else {
            z = false;
        }
        z75 z75 = vcVar.M;
        z75 z752 = z75.x;
        if (z75 != z752) {
            vcVar.M = z752;
            z = true;
        }
        Boolean bool = vcVar.g0;
        Boolean bool2 = this.y;
        if (!sg3.e(bool, bool2)) {
            vcVar.g0 = bool2;
            z2 = true;
        } else {
            z2 = z;
        }
        vcVar.p1(vcVar.N, this.x, (ap4) null, z752, z2);
    }

    public final int hashCode() {
        return (this.y.hashCode() + hl6.i((z75.x.hashCode() + (this.w.hashCode() * 31)) * 31, 31, this.x)) * 923521;
    }
}
