package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* renamed from: v67  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v67 extends ki4 {
    public final sl4 b;
    public final up2 c;

    public v67(sl4 sl4, up2 up2) {
        sl4.getClass();
        up2.getClass();
        this.b = sl4;
        this.c = up2;
    }

    public final Collection a(is1 is1, vr2 vr2) {
        is1.getClass();
        if (is1.a(is1.h)) {
            up2 up2 = this.c;
            if (!up2.a.c() || !is1.a.contains(fs1.a)) {
                sl4 sl4 = this.b;
                Collection<up2> x = sl4.x(up2, vr2);
                ArrayList arrayList = new ArrayList(x.size());
                for (up2 up22 : x) {
                    uq4 g = up22.a.g();
                    if (((Boolean) vr2.y(g)).booleanValue()) {
                        v34 v34 = null;
                        if (!g.x) {
                            v34 k0 = sl4.k0(up2.a(g));
                            if (!((Boolean) p25.q(k0.B, v34.D[1])).booleanValue()) {
                                v34 = k0;
                            }
                        }
                        if (v34 != null) {
                            arrayList.add(v34);
                        }
                    }
                }
                return arrayList;
            }
        }
        return a42.w;
    }

    public final Set d() {
        return g42.w;
    }

    public final String toString() {
        return "subpackages of " + this.c + " from " + this.b;
    }
}
