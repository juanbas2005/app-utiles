package defpackage;

import java.util.Iterator;

/* renamed from: u04  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u04 implements rm {
    public final am6 w;
    public final ci3 x;
    public final boolean y;
    public final m70 z;

    public u04(am6 am6, ci3 ci3, boolean z2) {
        am6.getClass();
        ci3.getClass();
        this.w = am6;
        this.x = ci3;
        this.y = z2;
        this.z = ((pj3) am6.x).a.c(new b0(20, this));
    }

    public final /* bridge */ boolean i(up2 up2) {
        return gw8.y(this, up2);
    }

    public final boolean isEmpty() {
        if (this.x.getAnnotations().isEmpty()) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        ci3 ci3 = this.x;
        ts o0 = dt0.o0(ci3.getAnnotations());
        m70 m70 = this.z;
        m70.getClass();
        wl7 wl7 = new wl7(o0, m70);
        uq4 uq4 = bi3.a;
        return new zd2(new ae2(cl6.Q(qs.E0(new al6[]{wl7, new ts(3, bi3.a(m27.m, ci3, this.w))})), false, new nf6(18)));
    }

    public final fm m(up2 up2) {
        fm fmVar;
        up2.getClass();
        ci3 ci3 = this.x;
        n06 a = ci3.a(up2);
        if (a != null && (fmVar = (fm) this.z.y(a)) != null) {
            return fmVar;
        }
        uq4 uq4 = bi3.a;
        return bi3.a(up2, ci3, this.w);
    }
}
