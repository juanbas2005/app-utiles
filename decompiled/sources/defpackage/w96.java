package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: w96  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w96 extends gl0 {
    public final zr3 E;
    public final LinkedHashMap F;
    public final z53 G = wl6.a;
    public final LinkedHashMap H = new LinkedHashMap();
    public int I = -1;

    public w96(zr3 zr3, LinkedHashMap linkedHashMap) {
        this.E = zr3;
        this.F = linkedHashMap;
    }

    public final void P(ll6 ll6, int i) {
        ll6.getClass();
        this.I = i;
    }

    public final void Q(Object obj) {
        obj.getClass();
        j0(obj);
    }

    public final z53 a() {
        return this.G;
    }

    public final void e() {
        j0((Object) null);
    }

    public final void g(zr3 zr3, Object obj) {
        zr3.getClass();
        j0(obj);
    }

    public final void j0(Object obj) {
        List list;
        String f = this.E.getDescriptor().f(this.I);
        bv4 bv4 = (bv4) this.F.get(f);
        if (bv4 != null) {
            if (bv4 instanceof ct0) {
                list = ((ct0) bv4).h(obj);
            } else {
                list = sg3.D(bv4.f(obj));
            }
            this.H.put(f, list);
            return;
        }
        ku4.g(f21.h("Cannot find NavType for argument ", f, ". Please provide NavType through typeMap."));
    }

    public final j42 m(ll6 ll6) {
        ll6.getClass();
        if (b35.v(ll6)) {
            this.I = 0;
        }
        return this;
    }
}
