package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* renamed from: ft4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ft4 {
    public final or2 a = new or2(11);
    public final d37 b;
    public final d37 c;
    public boolean d;
    public final xw5 e;
    public final xw5 f;
    public final nx4 g;
    public final /* synthetic */ iu4 h;

    public ft4(iu4 iu4, nx4 nx4) {
        nx4.getClass();
        this.h = iu4;
        d37 a2 = e37.a(a42.w);
        this.b = a2;
        d37 a3 = e37.a(g42.w);
        this.c = a3;
        this.e = gr8.t(a2);
        this.f = gr8.t(a3);
        this.g = nx4;
    }

    public final void a(zs4 zs4) {
        zs4.getClass();
        synchronized (this.a) {
            d37 d37 = this.b;
            d37.l((Object) null, dt0.N0((Collection) d37.getValue(), zs4));
        }
    }

    public final zs4 b(qt4 qt4, Bundle bundle) {
        ht4 ht4 = this.h.b;
        ht4.getClass();
        return n63.g(ht4.a.c, qt4, bundle, ht4.h(), ht4.o);
    }

    public final void c(zs4 zs4) {
        it4 it4;
        zs4.getClass();
        ht4 ht4 = this.h.b;
        d37 d37 = ht4.h;
        String str = zs4.B;
        LinkedHashMap linkedHashMap = ht4.w;
        boolean e2 = sg3.e(linkedHashMap.get(zs4), Boolean.TRUE);
        d37 d372 = this.c;
        d372.l((Object) null, wn6.n((Set) d372.getValue(), zs4));
        linkedHashMap.remove(zs4);
        as asVar = ht4.f;
        if (!asVar.contains(zs4)) {
            ht4.r(zs4);
            if (zs4.D.j.E.compareTo(k54.y) >= 0) {
                zs4.a(k54.w);
            }
            if (!asVar.isEmpty()) {
                Iterator it = asVar.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (sg3.e(((zs4) it.next()).B, str)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!e2 && (it4 = ht4.o) != null) {
                str.getClass();
                z58 z58 = (z58) it4.b.remove(str);
                if (z58 != null) {
                    z58.a();
                }
            }
            ht4.s();
            ArrayList p = ht4.p();
            d37.getClass();
            d37.l((Object) null, p);
        } else if (!this.d) {
            ht4.s();
            d37 d373 = ht4.g;
            ArrayList arrayList = new ArrayList(asVar);
            d373.getClass();
            d373.l((Object) null, arrayList);
            ArrayList p2 = ht4.p();
            d37.getClass();
            d37.l((Object) null, p2);
        }
    }

    public final void d(zs4 zs4, boolean z) {
        zs4.getClass();
        ht4 ht4 = this.h.b;
        qm3 qm3 = new qm3(this, zs4, z);
        ht4.getClass();
        nx4 b2 = ht4.s.b(zs4.x.w);
        ht4.w.put(zs4, Boolean.valueOf(z));
        if (b2.equals(this.g)) {
            dj4 dj4 = ht4.v;
            if (dj4 != null) {
                dj4.y(zs4);
                qm3.b();
                return;
            }
            as asVar = ht4.f;
            int indexOf = asVar.indexOf(zs4);
            if (indexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + zs4 + " as it was not found on the current back stack");
                return;
            }
            int i = indexOf + 1;
            if (i != asVar.y) {
                ht4.m(((zs4) asVar.get(i)).x.x.a, true, false);
            }
            ht4.n(zs4, false, new as());
            qm3.b();
            ht4.b.b();
            ht4.b();
            return;
        }
        Object obj = ht4.t.get(b2);
        obj.getClass();
        ((ft4) obj).d(zs4, z);
    }

    public final void e(zs4 zs4, boolean z) {
        Object obj;
        zs4.getClass();
        d37 d37 = this.c;
        Iterable iterable = (Iterable) d37.getValue();
        boolean z2 = iterable instanceof Collection;
        xw5 xw5 = this.e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((zs4) it.next()) == zs4) {
                    Iterable<zs4> iterable2 = (Iterable) xw5.w.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        for (zs4 zs42 : iterable2) {
                            if (zs42 == zs4) {
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        d37.l((Object) null, wn6.p((Set) d37.getValue(), zs4));
        d37 d372 = xw5.w;
        d37 d373 = xw5.w;
        List list = (List) d372.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            zs4 zs43 = (zs4) obj;
            if (!sg3.e(zs43, zs4) && ((List) d373.getValue()).lastIndexOf(zs43) < ((List) d373.getValue()).lastIndexOf(zs4)) {
                break;
            }
        }
        zs4 zs44 = (zs4) obj;
        if (zs44 != null) {
            d37.l((Object) null, wn6.p((Set) d37.getValue(), zs44));
        }
        d(zs4, z);
    }

    public final void f(zs4 zs4) {
        zs4.getClass();
        ht4 ht4 = this.h.b;
        ht4.getClass();
        nx4 b2 = ht4.s.b(zs4.x.w);
        if (b2.equals(this.g)) {
            vr2 vr2 = ht4.u;
            if (vr2 != null) {
                vr2.y(zs4);
                a(zs4);
                return;
            }
            Log.i("NavController", "Ignoring add of destination " + zs4.x + " outside of the call to navigate(). ");
            return;
        }
        Object obj = ht4.t.get(b2);
        if (obj != null) {
            ((ft4) obj).f(zs4);
        } else {
            ku4.g(f21.l(new StringBuilder("NavigatorBackStack for "), zs4.x.w, " should already be created"));
        }
    }
}
