package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z96  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z96 {
    public final v9 a;
    public final br4 b;
    public final dx5 c;
    public final boolean d;
    public final List e;
    public int f;
    public List g;
    public final ArrayList h = new ArrayList();

    public z96(v9 v9Var, br4 br4, dx5 dx5, boolean z) {
        List list;
        br4.getClass();
        this.a = v9Var;
        this.b = br4;
        this.c = dx5;
        this.d = z;
        a42 a42 = a42.w;
        this.e = a42;
        this.g = a42;
        g73 g73 = v9Var.h;
        dx5.A.getClass();
        g73.getClass();
        URI h2 = g73.h();
        if (h2.getHost() == null) {
            list = fg8.k(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> select = v9Var.g.select(h2);
            if (select == null || select.isEmpty()) {
                list = fg8.k(new Proxy[]{Proxy.NO_PROXY});
            } else {
                list = fg8.j(select);
            }
        }
        this.e = list;
        this.f = 0;
        h72 h72 = dx5.A;
        List list2 = this.e;
        h72.getClass();
        list2.getClass();
    }

    public final boolean a() {
        if (this.f >= this.e.size() && this.h.isEmpty()) {
            return false;
        }
        return true;
    }
}
