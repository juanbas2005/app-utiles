package defpackage;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Shader;
import android.text.TextPaint;

/* renamed from: zi  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zi extends TextPaint {
    public kb9 a;
    public rd7 b;
    public int c;
    public lq6 d;
    public jt0 e;
    public kc0 f;
    public oq1 g;
    public wu6 h;
    public iz1 i;

    public final kb9 a() {
        kb9 kb9 = this.a;
        if (kb9 != null) {
            return kb9;
        }
        kb9 kb92 = new kb9((Paint) this);
        this.a = kb92;
        return kb92;
    }

    public final void b(int i2) {
        if (i2 != this.c) {
            a().j(i2);
            this.c = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r1 == false) goto L_0x0038;
     */
    public final void c(kc0 kc0, long j, float f2) {
        Shader shader;
        boolean z;
        if (kc0 == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader((Shader) null);
        } else if (kc0 instanceof ky6) {
            d(o55.l(f2, ((ky6) kc0).a));
        } else if (kc0 instanceof iq6) {
            if (sg3.e(this.f, kc0)) {
                wu6 wu6 = this.h;
                if (wu6 == null) {
                    z = false;
                } else {
                    z = wu6.a(wu6.a, j);
                }
            }
            if (j != 9205357640488583168L) {
                this.f = kc0;
                this.h = new wu6(j);
                this.g = u55.i(new yi(0, j, kc0));
            }
            kb9 a2 = a();
            oq1 oq1 = this.g;
            if (oq1 != null) {
                shader = (Shader) oq1.getValue();
            } else {
                shader = null;
            }
            a2.n(shader);
            this.e = null;
            ar7.V(this, f2);
        } else {
            h.c();
        }
    }

    public final void d(long j) {
        boolean z;
        jt0 jt0 = this.e;
        if (jt0 == null) {
            z = false;
        } else {
            z = jt0.c(jt0.a, j);
        }
        if (!z && j != 16) {
            this.e = new jt0(j);
            setColor(uq3.M(j));
            this.g = null;
            this.f = null;
            this.h = null;
            setShader((Shader) null);
        }
    }

    public final void e(iz1 iz1) {
        if (iz1 != null && !sg3.e(this.i, iz1)) {
            this.i = iz1;
            if (iz1.equals(rd2.a)) {
                setStyle(Paint.Style.FILL);
            } else if (iz1 instanceof l57) {
                a().r(1);
                l57 l57 = (l57) iz1;
                a().q(l57.a);
                kb9 a2 = a();
                ((Paint) a2.y).setStrokeMiter(l57.b);
                a().p(l57.d);
                a().o(l57.c);
                ((Paint) a().y).setPathEffect((PathEffect) null);
            } else {
                h.c();
            }
        }
    }

    public final void f(lq6 lq6) {
        if (lq6 != null && !sg3.e(this.d, lq6)) {
            this.d = lq6;
            if (lq6.equals(lq6.d)) {
                clearShadowLayer();
                return;
            }
            lq6 lq62 = this.d;
            float f2 = lq62.c;
            if (f2 == 0.0f) {
                f2 = Float.MIN_VALUE;
            }
            setShadowLayer(f2, Float.intBitsToFloat((int) (lq62.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), uq3.M(this.d.a));
        }
    }

    public final void g(rd7 rd7) {
        boolean z;
        if (rd7 != null && !sg3.e(this.b, rd7)) {
            this.b = rd7;
            int i2 = rd7.a;
            boolean z2 = false;
            if ((i2 | 1) == i2) {
                z = true;
            } else {
                z = false;
            }
            setUnderlineText(z);
            int i3 = this.b.a;
            if ((i3 | 2) == i3) {
                z2 = true;
            }
            setStrikeThruText(z2);
        }
    }
}
