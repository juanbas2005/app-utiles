package defpackage;

import java.util.List;
import java.util.ListIterator;

/* renamed from: nx4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class nx4 {
    public ft4 a;
    public boolean b;

    public abstract qt4 a();

    public final ft4 b() {
        ft4 ft4 = this.a;
        if (ft4 != null) {
            return ft4;
        }
        h.s("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void d(List list, wu4 wu4) {
        zd2 zd2 = new zd2(new ae2(new wl7(new ts(1, list), new h43(21, this, wu4)), false, new nf6(18)));
        while (zd2.hasNext()) {
            b().f((zs4) zd2.next());
        }
    }

    public void e(zs4 zs4, boolean z) {
        List list = (List) b().e.w.getValue();
        if (list.contains(zs4)) {
            ListIterator listIterator = list.listIterator(list.size());
            zs4 zs42 = null;
            while (f()) {
                zs42 = (zs4) listIterator.previous();
                if (sg3.e(zs42, zs4)) {
                    break;
                }
            }
            if (zs42 != null) {
                b().d(zs42, z);
                return;
            }
            return;
        }
        ku4.u("popBackStack was called with ", zs4, " which does not exist in back stack ", list);
    }

    public boolean f() {
        return true;
    }

    public qt4 c(qt4 qt4) {
        return qt4;
    }
}
