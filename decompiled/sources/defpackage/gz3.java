package defpackage;

/* renamed from: gz3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gz3 implements n67 {
    public final zo4 a = new zo4();
    public final /* synthetic */ iz3 b;
    public final /* synthetic */ Object c;

    public gz3(iz3 iz3, Object obj) {
        this.b = iz3;
        this.c = obj;
        int[] iArr = ve3.a;
    }

    public final void a(mr0 mr0) {
        ll4 ll4;
        o00 o00;
        uy3 uy3 = (uy3) this.b.F.g(this.c);
        if (uy3 == null || (o00 = uy3.a0) == null) {
            ll4 = null;
        } else {
            ll4 = (ll4) o00.g;
        }
        if (ll4 != null && ll4.J) {
            h75.v(ll4, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", mr0);
        }
    }

    public final void b() {
        iz3.c(this.b, this.c);
    }

    public final long c(int i) {
        uy3 uy3 = (uy3) this.b.F.g(this.c);
        if (uy3 == null || !uy3.J()) {
            return 0;
        }
        int i2 = ((eq4) ((jp4) uy3.n()).x).y;
        if (i < 0 || i >= i2) {
            yb3.d("Index (" + i + ") is out of bound of [0, " + i2 + ")");
        }
        if (!this.a.c(i)) {
            return 0;
        }
        int i3 = ((uy3) ((jp4) uy3.n()).get(i)).b0.p.w;
        return (((long) ((uy3) ((jp4) uy3.n()).get(i)).b0.p.x) & 4294967295L) | (((long) i3) << 32);
    }

    public final int d() {
        uy3 uy3 = (uy3) this.b.F.g(this.c);
        if (uy3 != null) {
            return ((eq4) ((jp4) uy3.n()).x).y;
        }
        return 0;
    }

    public final void e(long j, int i) {
        iz3 iz3 = this.b;
        uy3 uy3 = (uy3) iz3.F.g(this.c);
        if (uy3 != null && uy3.J()) {
            int i2 = ((eq4) ((jp4) uy3.n()).x).y;
            if (i < 0 || i >= i2) {
                yb3.d("Index (" + i + ") is out of bound of [0, " + i2 + ")");
            }
            if (uy3.K()) {
                yb3.a("Pre-measure called on node that is not placed");
            }
            uy3 uy32 = iz3.w;
            uy32.L = true;
            ((je) xy3.a(uy3)).s((uy3) ((jp4) uy3.n()).get(i), j);
            uy32.L = false;
            this.a.a(i);
        }
    }
}
