package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lhx0;", "Lnx4;", "Lgx0;", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@mx4("composable")
/* renamed from: hx0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hx0 extends nx4 {
    public final ed5 c = u55.p(Boolean.FALSE);

    public final qt4 a() {
        return new gx0(this, lw0.a);
    }

    public final void d(List list, wu4 wu4) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zs4 zs4 = (zs4) it.next();
            ft4 b = b();
            xw5 xw5 = b.e;
            zs4.getClass();
            d37 d37 = b.c;
            Iterable iterable = (Iterable) d37.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((zs4) it2.next()) == zs4) {
                        Iterable iterable2 = (Iterable) xw5.w.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (((zs4) it3.next()) == zs4) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            zs4 zs42 = (zs4) dt0.H0((List) xw5.w.getValue());
            if (zs42 != null) {
                d37.l((Object) null, wn6.p((Set) d37.getValue(), zs42));
            }
            d37.l((Object) null, wn6.p((Set) d37.getValue(), zs4));
            b.f(zs4);
        }
        this.c.setValue(Boolean.FALSE);
    }

    public final void e(zs4 zs4, boolean z) {
        b().e(zs4, z);
        this.c.setValue(Boolean.TRUE);
    }

    public final void g(zs4 zs4) {
        ft4 b = b();
        zs4.getClass();
        d37 d37 = b.c;
        d37.l((Object) null, wn6.p((Set) d37.getValue(), zs4));
        ht4 ht4 = b.h.b;
        ht4.getClass();
        if (ht4.f.contains(zs4)) {
            zs4.a(k54.z);
        } else {
            h.s("Cannot transition entry that is not in the back stack");
        }
    }
}
