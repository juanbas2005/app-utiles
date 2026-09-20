package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: pr3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pr3 extends yq3 {
    public static final /* synthetic */ int z = 0;
    public final Class x;
    public final nz3 y = rg3.y(i44.w, new mr3(this, 0));

    public pr3(Class cls) {
        cls.getClass();
        this.x = cls;
    }

    public final Collection P() {
        return a42.w;
    }

    public final Collection Q() {
        return a42.w;
    }

    public final Collection R(uq4 uq4) {
        y16 y16 = ((or3) this.y.getValue()).e;
        yr3 yr3 = or3.g[1];
        Object b = y16.b();
        b.getClass();
        return ((ji4) b).b(uq4, oz4.x);
    }

    public final cr5 S(int i) {
        rt1 rt1;
        y16 y16 = ((or3) this.y.getValue()).e;
        yr3 yr3 = or3.g[1];
        Object b = y16.b();
        b.getClass();
        ji4 ji4 = (ji4) b;
        if (ji4 instanceof rt1) {
            rt1 = (rt1) ji4;
        } else {
            rt1 = null;
        }
        if (rt1 != null) {
            z00 z00 = rt1.b;
            ns5 ns5 = rt1.h;
            yu2 yu2 = qp3.l;
            yu2.getClass();
            qs5 qs5 = (qs5) jb5.o(ns5, yu2, i);
            if (qs5 != null) {
                ht5 ht5 = ns5.C;
                ht5.getClass();
                return (cr5) g18.g(this.x, new fa4(this), qs5, (vq4) z00.b, new wv1(ht5), (n80) z00.f, c0.B);
            }
        }
        return null;
    }

    public final su3 T(int i) {
        ru3 ru3 = (ru3) dt0.S0((List) ((or3) this.y.getValue()).c.getValue());
        if (ru3 == null) {
            return null;
        }
        ou3 ou3 = vo3.b;
        ou3.getClass();
        ArrayList arrayList = ((vo3) rj1.I(ru3.d, ou3)).a;
        if (arrayList != null) {
            return (su3) dt0.z0(i, arrayList);
        }
        return null;
    }

    public final Class U() {
        Class cls = (Class) ((or3) this.y.getValue()).f.getValue();
        if (cls == null) {
            return this.x;
        }
        return cls;
    }

    public final Collection V(uq4 uq4) {
        y16 y16 = ((or3) this.y.getValue()).e;
        yr3 yr3 = or3.g[1];
        Object b = y16.b();
        b.getClass();
        return ((ji4) b).f(uq4, oz4.x);
    }

    public final ArrayList Y() {
        ArrayList arrayList = new ArrayList();
        for (ru3 ru3 : (List) ((or3) this.y.getValue()).c.getValue()) {
            it0.h0(arrayList, ru3.a);
        }
        return arrayList;
    }

    public final Class b() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pr3)) {
            return false;
        }
        if (sg3.e(this.x, ((pr3) obj).x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final String toString() {
        return "file class " + m06.a(this.x).a();
    }
}
