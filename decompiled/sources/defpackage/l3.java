package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: l3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l3 implements wo7 {
    public final /* synthetic */ ut1 w;

    public l3(ut1 ut1) {
        this.w = ut1;
    }

    public final Collection e() {
        Collection e = this.w.h1().L().e();
        e.getClass();
        return e;
    }

    public final fv3 g() {
        return ts1.e(this.w);
    }

    public final List getParameters() {
        List list = this.w.L;
        if (list != null) {
            return list;
        }
        sg3.a0("typeConstructorParameters");
        throw null;
    }

    public final String toString() {
        return "[typealias " + this.w.getName().b() + ']';
    }

    public final vq0 u() {
        return this.w;
    }

    public final boolean y() {
        return true;
    }
}
