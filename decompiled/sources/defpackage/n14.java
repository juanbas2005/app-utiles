package defpackage;

import java.util.Collection;
import java.util.Set;

/* renamed from: n14  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n14 extends uq3 {
    public final /* synthetic */ ql4 p;
    public final /* synthetic */ Set q;
    public final /* synthetic */ vr2 r;

    public n14(ql4 ql4, Set set, vr2 vr2) {
        this.p = ql4;
        this.q = set;
        this.r = vr2;
    }

    public final /* bridge */ /* synthetic */ Object K() {
        return vs7.a;
    }

    public final boolean j(Object obj) {
        ql4 ql4 = (ql4) obj;
        ql4.getClass();
        if (ql4 == this.p) {
            return true;
        }
        ji4 L = ql4.L();
        L.getClass();
        if (!(L instanceof p14)) {
            return true;
        }
        this.q.addAll((Collection) this.r.y(L));
        return false;
    }
}
