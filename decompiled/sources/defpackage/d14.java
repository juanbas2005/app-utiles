package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: d14  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d14 implements ba5 {
    public final am6 a;
    public final fb4 b;

    public d14(pj3 pj3) {
        this.a = new am6(pj3, (up7) d63.R, (nz3) new rb3((d45) null));
        kb4 kb4 = pj3.a;
        kb4.getClass();
        this.b = new fb4(kb4, new ConcurrentHashMap(3, 1.0f, 2), new e18(6), 0);
    }

    public final boolean a(up2 up2) {
        up2.getClass();
        ((pj3) this.a.x).b.getClass();
        return false;
    }

    public final void b(up2 up2, ArrayList arrayList) {
        up2.getClass();
        arrayList.add(c(up2));
    }

    public final c14 c(up2 up2) {
        ((pj3) this.a.x).b.getClass();
        up2.getClass();
        p3 p3Var = new p3(this, false, new i16(up2), 19);
        fb4 fb4 = this.b;
        fb4.getClass();
        Object y = fb4.y(new gb4(up2, p3Var));
        if (y != null) {
            return (c14) y;
        }
        fb4.a(3);
        throw null;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((pj3) this.a.x).o;
    }

    public final Collection x(up2 up2, vr2 vr2) {
        up2.getClass();
        List list = (List) c(up2).G.b();
        if (list == null) {
            return a42.w;
        }
        return list;
    }
}
