package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: kd0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kd0 implements bq0 {
    public final kb4 a;
    public final sl4 b;

    public kd0(kb4 kb4, tl4 tl4) {
        tl4.getClass();
        this.a = kb4;
        this.b = tl4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        r7 = r7.a;
     */
    public final ql4 a(gq0 gq0) {
        up2 up2;
        it2 a2;
        gq0.getClass();
        if (!gq0.c && !gq0.g()) {
            String str = gq0.b.a.a;
            if (d57.x0(str, "Function", false) && (a2 = jt2.b.a(up2, str)) != null) {
                ht2 ht2 = a2.a;
                int i = a2.b;
                ArrayList arrayList = new ArrayList();
                for (Object next : (List) p25.q(this.b.k0(up2).A, v34.D[0])) {
                    if (next instanceof rd0) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                if (dt0.y0(arrayList2) == null) {
                    return new ss2(this.a, (rd0) dt0.w0(arrayList), ht2, i);
                }
                ku4.a();
            }
        }
        return null;
    }

    public final Collection b(up2 up2) {
        up2.getClass();
        return g42.w;
    }

    public final boolean c(up2 up2, uq4 uq4) {
        up2.getClass();
        uq4.getClass();
        String b2 = uq4.b();
        b2.getClass();
        if ((k57.u0(b2, "Function", false) || k57.u0(b2, "KFunction", false) || k57.u0(b2, "SuspendFunction", false) || k57.u0(b2, "KSuspendFunction", false)) && jt2.b.a(up2, b2) != null) {
            return true;
        }
        return false;
    }
}
