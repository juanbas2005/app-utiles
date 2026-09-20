package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: i14  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i14 extends p14 {
    public final i16 n;
    public final c14 o;
    public final hb4 p;
    public final m70 q;

    public i14(am6 am6, i16 i16, c14 c14) {
        super(am6, (a14) null);
        this.n = i16;
        this.o = c14;
        kb4 kb4 = ((pj3) am6.x).a;
        p3 p3Var = new p3(am6, false, this, 20);
        kb4.getClass();
        this.p = new hb4(kb4, p3Var);
        this.q = kb4.c(new e3(17, (Object) this, (Object) am6));
    }

    public final Collection a(is1 is1, vr2 vr2) {
        is1.getClass();
        if (!is1.a(is1.l | is1.e)) {
            return a42.w;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : (Iterable) this.d.b()) {
            vj1 vj1 = (vj1) next;
            if (vj1 instanceof ql4) {
                uq4 name = ((ql4) vj1).getName();
                name.getClass();
                if (((Boolean) vr2.y(name)).booleanValue()) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public final vq0 e(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        oz4.getClass();
        return v(uq4, (x06) null);
    }

    public final Collection f(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        return a42.w;
    }

    public final Set h(is1 is1, vr2 vr2) {
        is1.getClass();
        if (!is1.a(is1.e)) {
            return g42.w;
        }
        Set<String> set = (Set) this.p.b();
        if (set != null) {
            HashSet hashSet = new HashSet();
            for (String e : set) {
                hashSet.add(uq4.e(e));
            }
            return hashSet;
        }
        this.n.getClass();
        return new LinkedHashSet();
    }

    public final Set i(is1 is1, jo3 jo3) {
        is1.getClass();
        return g42.w;
    }

    public final ck1 k() {
        return bk1.a;
    }

    public final void m(LinkedHashSet linkedHashSet, uq4 uq4) {
        uq4.getClass();
    }

    public final Set o(is1 is1) {
        is1.getClass();
        return g42.w;
    }

    public final vj1 q() {
        return this.o;
    }

    public final ql4 v(uq4 uq4, x06 x06) {
        uq4 uq42 = oz6.a;
        uq4.getClass();
        String b = uq4.b();
        b.getClass();
        if (b.length() <= 0 || uq4.x) {
            return null;
        }
        Set set = (Set) this.p.b();
        if (x06 == null && set != null && !set.contains(uq4.b())) {
            return null;
        }
        return (ql4) this.q.y(new e14(uq4, x06));
    }
}
