package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: oi8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oi8 extends ws8 {
    public final y19 a;
    public final v49 b;

    public oi8(y19 y19) {
        z65.k(y19);
        this.a = y19;
        v49 v49 = y19.I;
        y19.f(v49);
        this.b = v49;
    }

    public final String e() {
        l59 l59 = ((y19) this.b.w).H;
        y19.f(l59);
        f59 f59 = l59.y;
        if (f59 != null) {
            return f59.a;
        }
        return null;
    }

    public final void f(String str, String str2, Bundle bundle) {
        this.b.g1(str, str2, bundle);
    }

    public final long i() {
        d99 d99 = this.a.E;
        y19.e(d99);
        return d99.a2();
    }

    public final String j() {
        l59 l59 = ((y19) this.b.w).H;
        y19.f(l59);
        f59 f59 = l59.y;
        if (f59 != null) {
            return f59.b;
        }
        return null;
    }

    public final void k(Bundle bundle) {
        v49 v49 = this.b;
        ((y19) v49.w).G.getClass();
        v49.p1(bundle, System.currentTimeMillis());
    }

    public final void l(String str) {
        y19 y19 = this.a;
        ev8 ev8 = y19.J;
        y19.d(ev8);
        y19.G.getClass();
        ev8.e1(SystemClock.elapsedRealtime(), str);
    }

    public final void m(String str) {
        y19 y19 = this.a;
        ev8 ev8 = y19.J;
        y19.d(ev8);
        y19.G.getClass();
        ev8.d1(SystemClock.elapsedRealtime(), str);
    }

    public final void n(String str, String str2, Bundle bundle) {
        v49 v49 = this.a.I;
        y19.f(v49);
        v49.q1(str, str2, bundle);
    }

    public final List o(String str, String str2) {
        v49 v49 = this.b;
        y19 y19 = (y19) v49.w;
        r19 r19 = y19.C;
        pz8 pz8 = y19.B;
        y19.g(r19);
        if (r19.i1()) {
            y19.g(pz8);
            pz8.B.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        } else if (ts2.o()) {
            y19.g(pz8);
            pz8.B.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            r19 r192 = y19.C;
            y19.g(r192);
            r192.m1(atomicReference, 5000, "get conditional user properties", new yl0(v49, atomicReference, str, str2));
            List list = (List) atomicReference.get();
            if (list != null) {
                return d99.W1(list);
            }
            y19.g(pz8);
            pz8.B.b("Timed out waiting for get conditional user properties", (Object) null);
            return new ArrayList();
        }
    }

    public final int p(String str) {
        v49 v49 = this.b;
        v49.getClass();
        z65.h(str);
        ((y19) v49.w).getClass();
        return 25;
    }

    public final String q() {
        return (String) this.b.C.get();
    }

    public final String r() {
        return this.b.r1();
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [java.util.Map, zt6] */
    public final Map s(String str, String str2, boolean z) {
        v49 v49 = this.b;
        y19 y19 = (y19) v49.w;
        r19 r19 = y19.C;
        pz8 pz8 = y19.B;
        y19.g(r19);
        if (r19.i1()) {
            y19.g(pz8);
            pz8.B.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        } else if (ts2.o()) {
            y19.g(pz8);
            pz8.B.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        } else {
            AtomicReference atomicReference = new AtomicReference();
            r19 r192 = y19.C;
            y19.g(r192);
            boolean z2 = z;
            w39 w39 = new w39(v49, atomicReference, str, str2, z2);
            AtomicReference atomicReference2 = atomicReference;
            boolean z3 = z2;
            r192.m1(atomicReference2, 5000, "get user properties", w39);
            List<z89> list = (List) atomicReference2.get();
            if (list == null) {
                y19.g(pz8);
                pz8.B.b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z3));
                return Collections.EMPTY_MAP;
            }
            ? zt6 = new zt6(list.size());
            for (z89 z89 : list) {
                Object f = z89.f();
                if (f != null) {
                    zt6.put(z89.x, f);
                }
            }
            return zt6;
        }
    }
}
