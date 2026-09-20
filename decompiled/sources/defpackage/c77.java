package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: c77  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c77 implements ji4 {
    public final ji4 b;
    public final dq7 c;
    public HashMap d;
    public final z97 e = new z97(new xo3(14, this));

    public c77(ji4 ji4, dq7 dq7) {
        ji4.getClass();
        dq7.getClass();
        this.b = ji4;
        new z97(new xo3(13, dq7));
        this.c = new dq7(t49.f0(dq7.a));
    }

    public final Collection a(is1 is1, vr2 vr2) {
        is1.getClass();
        return (Collection) this.e.getValue();
    }

    public final Collection b(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        return i(this.b.b(uq4, oz4));
    }

    public final Set c() {
        return this.b.c();
    }

    public final Set d() {
        return this.b.d();
    }

    public final vq0 e(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        oz4.getClass();
        vq0 e2 = this.b.e(uq4, oz4);
        if (e2 != null) {
            return (vq0) h(e2);
        }
        return null;
    }

    public final Collection f(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        return i(this.b.f(uq4, oz4));
    }

    public final Set g() {
        return this.b.g();
    }

    public final vj1 h(vj1 vj1) {
        dq7 dq7 = this.c;
        if (dq7.a.e()) {
            return vj1;
        }
        if (this.d == null) {
            this.d = new HashMap();
        }
        HashMap hashMap = this.d;
        hashMap.getClass();
        Object obj = hashMap.get(vj1);
        if (obj == null) {
            if (vj1 instanceof y67) {
                obj = ((y67) vj1).h(dq7);
                if (obj != null) {
                    hashMap.put(vj1, obj);
                } else {
                    rf2.v(vj1, " substitution fails", "We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ");
                    return null;
                }
            } else {
                ta1.l("Unknown descriptor in scope: ", vj1);
                return null;
            }
        }
        return (vj1) obj;
    }

    public final Collection i(Collection collection) {
        if (this.c.a.e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        int i = 3;
        if (size >= 3) {
            i = (size / 3) + size + 1;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(i);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(h((vj1) it.next()));
        }
        return linkedHashSet;
    }
}
