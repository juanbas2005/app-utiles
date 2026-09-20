package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: ev8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ev8 extends cx8 {
    public final js x = new zt6(0);
    public final js y = new zt6(0);
    public long z;

    /* JADX WARNING: type inference failed for: r2v1, types: [js, zt6] */
    /* JADX WARNING: type inference failed for: r2v2, types: [js, zt6] */
    public ev8(y19 y19) {
        super(y19);
    }

    public final void d1(long j, String str) {
        y19 y19 = (y19) this.w;
        if (str == null || str.length() == 0) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.B.a("Ad unit id must be a non-empty string");
            return;
        }
        r19 r19 = y19.C;
        y19.g(r19);
        r19.l1(new pi8(this, str, j, 0));
    }

    public final void e1(long j, String str) {
        y19 y19 = (y19) this.w;
        if (str == null || str.length() == 0) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.B.a("Ad unit id must be a non-empty string");
            return;
        }
        r19 r19 = y19.C;
        y19.g(r19);
        r19.l1(new pi8(this, str, j, 1));
    }

    public final void f1(long j) {
        l59 l59 = ((y19) this.w).H;
        y19.f(l59);
        f59 g1 = l59.g1(false);
        js jsVar = this.x;
        Iterator it = ((fs) jsVar.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            h1(str, j - ((Long) jsVar.get(str)).longValue(), g1);
        }
        if (!jsVar.isEmpty()) {
            g1(j - this.z, g1);
        }
        i1(j);
    }

    public final void g1(long j, f59 f59) {
        y19 y19 = (y19) this.w;
        if (f59 == null) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.J.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.J.b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            d99.Y1(f59, bundle, true);
            v49 v49 = y19.I;
            y19.f(v49);
            v49.j1("am", "_xa", bundle);
        }
    }

    public final void h1(String str, long j, f59 f59) {
        y19 y19 = (y19) this.w;
        if (f59 == null) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.J.a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            pz8 pz82 = y19.B;
            y19.g(pz82);
            pz82.J.b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            d99.Y1(f59, bundle, true);
            v49 v49 = y19.I;
            y19.f(v49);
            v49.j1("am", "_xu", bundle);
        }
    }

    public final void i1(long j) {
        js jsVar = this.x;
        Iterator it = ((fs) jsVar.keySet()).iterator();
        while (it.hasNext()) {
            jsVar.put((String) it.next(), Long.valueOf(j));
        }
        if (!jsVar.isEmpty()) {
            this.z = j;
        }
    }
}
