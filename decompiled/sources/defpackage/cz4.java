package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: cz4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cz4 implements jl0 {
    public final nz3 A;
    public final xp7 w;
    public sr2 x;
    public final cz4 y;
    public final qp7 z;

    public cz4(xp7 xp7, sr2 sr2, cz4 cz4, qp7 qp7) {
        xp7.getClass();
        this.w = xp7;
        this.x = sr2;
        this.y = cz4;
        this.z = qp7;
        this.A = rg3.y(i44.w, new xo3(9, this));
    }

    public final xp7 C() {
        return this.w;
    }

    public final Collection e() {
        List list = (List) this.A.getValue();
        if (list == null) {
            return a42.w;
        }
        return list;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!cz4.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        cz4 cz4 = (cz4) obj;
        cz4 cz42 = this.y;
        if (cz42 != null) {
            this = cz42;
        }
        cz4 cz43 = cz4.y;
        if (cz43 != null) {
            obj = cz43;
        }
        if (this == obj) {
            return true;
        }
        return false;
    }

    public final fv3 g() {
        vw3 b = this.w.b();
        b.getClass();
        return jb5.k(b);
    }

    public final List getParameters() {
        return a42.w;
    }

    public final int hashCode() {
        cz4 cz4 = this.y;
        if (cz4 != null) {
            return cz4.hashCode();
        }
        return super.hashCode();
    }

    public final String toString() {
        return "CapturedType(" + this.w + ')';
    }

    public final vq0 u() {
        return null;
    }

    public final boolean y() {
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cz4(xp7 xp7, bt1 bt1, qp7 qp7, int i) {
        this(xp7, (sr2) (i & 2) != 0 ? null : bt1, (cz4) null, (i & 8) != 0 ? null : qp7);
    }
}
