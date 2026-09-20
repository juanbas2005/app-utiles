package defpackage;

import android.os.SystemClock;

/* renamed from: hc1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hc1 extends vb5 {
    public vb5 A;
    public final vb5 B;
    public final j51 C;
    public final int D;
    public final boolean E;
    public final bd5 F = new bd5(0);
    public long G = -1;
    public boolean H;
    public final ad5 I = new ad5(1.0f);
    public final ed5 J = u55.p((Object) null);

    public hc1(vb5 vb5, vb5 vb52, j51 j51, int i, boolean z) {
        this.A = vb5;
        this.B = vb52;
        this.C = j51;
        this.D = i;
        this.E = z;
    }

    public final void d(float f) {
        this.I.e(f);
    }

    public final void e(lt0 lt0) {
        this.J.setValue(lt0);
    }

    public final long i() {
        long j;
        boolean z;
        vb5 vb5 = this.A;
        long j2 = 0;
        if (vb5 != null) {
            j = vb5.i();
        } else {
            j = 0;
        }
        vb5 vb52 = this.B;
        if (vb52 != null) {
            j2 = vb52.i();
        }
        boolean z2 = false;
        if (j != 9205357640488583168L) {
            z = true;
        } else {
            z = false;
        }
        if (j2 != 9205357640488583168L) {
            z2 = true;
        }
        if (!z || !z2) {
            return 9205357640488583168L;
        }
        return fb5.a(Math.max(wu6.d(j), wu6.d(j2)), Math.max(wu6.b(j), wu6.b(j2)));
    }

    public final void j(wy3 wy3) {
        float f;
        boolean z;
        boolean z2 = this.H;
        vb5 vb5 = this.B;
        ad5 ad5 = this.I;
        if (z2) {
            k(wy3, vb5, ad5.d());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.G == -1) {
            this.G = uptimeMillis;
        }
        float f2 = ((float) (uptimeMillis - this.G)) / ((float) this.D);
        float d = ad5.d() * z65.o(f2, 0.0f, 1.0f);
        if (this.E) {
            f = ad5.d() - d;
        } else {
            f = ad5.d();
        }
        if (f2 >= 1.0f) {
            z = true;
        } else {
            z = false;
        }
        this.H = z;
        k(wy3, this.A, f);
        k(wy3, vb5, d);
        if (this.H) {
            this.A = null;
            return;
        }
        bd5 bd5 = this.F;
        bd5.e(bd5.d() + 1);
    }

    public final void k(wy3 wy3, vb5 vb5, float f) {
        long j;
        tk0 tk0 = wy3.w;
        if (vb5 != null && f > 0.0f) {
            long e = tk0.e();
            long i = vb5.i();
            if (i != 9205357640488583168L && !wu6.e(i) && e != 9205357640488583168L && !wu6.e(e)) {
                j = ya5.w(i, this.C.c(i, e));
            } else {
                j = e;
            }
            int i2 = (e > 9205357640488583168L ? 1 : (e == 9205357640488583168L ? 0 : -1));
            ed5 ed5 = this.J;
            if (i2 != 0 && !wu6.e(e)) {
                float d = (wu6.d(e) - wu6.d(j)) / 2.0f;
                float b = (wu6.b(e) - wu6.b(j)) / 2.0f;
                ((ji8) tk0.x.x).y(d, b, d, b);
                vb5 vb52 = vb5;
                vb52.g(wy3, j, f, (lt0) ed5.getValue());
                float f2 = -d;
                float f3 = -b;
                ((ji8) tk0.x.x).y(f2, f3, f2, f3);
                return;
            }
            vb5 vb53 = vb5;
            vb53.g(wy3, j, f, (lt0) ed5.getValue());
        }
    }
}
