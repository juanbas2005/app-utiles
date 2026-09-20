package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: tk0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tk0 implements hz1 {
    public final sk0 w;
    public final wr0 x = new wr0(this);
    public kb9 y;
    public kb9 z;

    /* JADX WARNING: type inference failed for: r0v0, types: [sk0, java.lang.Object] */
    public tk0() {
        wp1 wp1 = tf4.b;
        ? obj = new Object();
        obj.a = wp1;
        obj.b = ey3.w;
        obj.c = u32.a;
        obj.d = 0;
        this.w = obj;
    }

    public static kb9 a(tk0 tk0, long j, iz1 iz1, float f, int i) {
        kb9 d = tk0.d(iz1);
        if (f != 1.0f) {
            j = jt0.b(jt0.d(j) * f, j);
        }
        if (!jt0.c(d.d(), j)) {
            d.k(j);
        }
        if (((Shader) d.z) != null) {
            d.n((Shader) null);
        }
        if (!sg3.e((lt0) d.A, (Object) null)) {
            d.l((lt0) null);
        }
        if (d.x != i) {
            d.j(i);
        }
        if (((Paint) d.y).isFilterBitmap()) {
            return d;
        }
        d.m(1);
        return d;
    }

    public final void C(long j, long j2, long j3, float f, int i) {
        qk0 qk0 = this.w.c;
        kb9 kb9 = this.z;
        if (kb9 == null) {
            kb9 = dh4.b();
            kb9.r(1);
            this.z = kb9;
        }
        Paint paint = (Paint) kb9.y;
        if (!jt0.c(kb9.d(), j)) {
            kb9.k(j);
        }
        if (((Shader) kb9.z) != null) {
            kb9.n((Shader) null);
        }
        if (!sg3.e((lt0) kb9.A, (Object) null)) {
            kb9.l((lt0) null);
        }
        if (kb9.x != 3) {
            kb9.j(3);
        }
        if (paint.getStrokeWidth() != f) {
            kb9.q(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (kb9.f() != i) {
            kb9.o(i);
        }
        if (kb9.g() != 0) {
            kb9.p(0);
        }
        if (!paint.isFilterBitmap()) {
            kb9.m(1);
        }
        qk0.e(j2, j3, kb9);
    }

    public final void E0(long j, long j2, long j3, float f, int i) {
        qk0 qk0 = this.w.c;
        int i2 = (int) (j2 >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i2);
        int i3 = (int) (j2 & 4294967295L);
        qk0 qk02 = qk0;
        float f2 = intBitsToFloat;
        qk02.a(f2, Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), a(this, j, rd2.a, f, i));
    }

    public final void H0(kc0 kc0, long j, long j2, float f, iz1 iz1, lt0 lt0, int i) {
        qk0 qk0 = this.w.c;
        int i2 = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i2);
        int i3 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i3);
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2);
        float intBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3);
        kb9 c = c(kc0, iz1, f, lt0, i, 1);
        qk0.a(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, c);
    }

    public final void I0(l97 l97, float f, long j, long j2, float f2, l57 l57) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.w.c.l(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), 135.0f, f, c(l97, l57, f2, (lt0) null, 3, 1));
    }

    public final void K(long j, float f, long j2, iz1 iz1) {
        this.w.c.r(f, j2, a(this, j, iz1, 1.0f, 3));
    }

    public final float Y() {
        return this.w.a.Y();
    }

    public final float b() {
        return this.w.a.b();
    }

    public final kb9 c(kc0 kc0, iz1 iz1, float f, lt0 lt0, int i, int i2) {
        kb9 d = d(iz1);
        Paint paint = (Paint) d.y;
        if (kc0 != null) {
            kc0.a(f, e(), d);
        } else {
            if (((Shader) d.z) != null) {
                d.n((Shader) null);
            }
            long d2 = d.d();
            long j = jt0.b;
            if (!jt0.c(d2, j)) {
                d.k(j);
            }
            if (((float) paint.getAlpha()) / 255.0f != f) {
                d.i(f);
            }
        }
        if (!sg3.e((lt0) d.A, lt0)) {
            d.l(lt0);
        }
        if (d.x != i) {
            d.j(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return d;
        }
        d.m(i2);
        return d;
    }

    public final void c0(long j, long j2, long j3, long j4, iz1 iz1) {
        qk0 qk0 = this.w.c;
        int i = (int) (j2 >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i2);
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i);
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2);
        float intBitsToFloat5 = Float.intBitsToFloat((int) (j4 >> 32));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (j4 & 4294967295L));
        kb9 a = a(this, j, iz1, 1.0f, 3);
        float f = intBitsToFloat2;
        float f2 = intBitsToFloat3;
        qk0.s(intBitsToFloat, f, f2, intBitsToFloat4, intBitsToFloat5, intBitsToFloat6, a);
    }

    public final kb9 d(iz1 iz1) {
        if (sg3.e(iz1, rd2.a)) {
            kb9 kb9 = this.y;
            if (kb9 != null) {
                return kb9;
            }
            kb9 b = dh4.b();
            b.r(0);
            this.y = b;
            return b;
        } else if (iz1 instanceof l57) {
            kb9 kb92 = this.z;
            if (kb92 == null) {
                kb92 = dh4.b();
                kb92.r(1);
                this.z = kb92;
            }
            Paint paint = (Paint) kb92.y;
            float strokeWidth = paint.getStrokeWidth();
            l57 l57 = (l57) iz1;
            float f = l57.a;
            if (strokeWidth != f) {
                kb92.q(f);
            }
            int f2 = kb92.f();
            int i = l57.c;
            if (f2 != i) {
                kb92.o(i);
            }
            float strokeMiter = paint.getStrokeMiter();
            float f3 = l57.b;
            if (strokeMiter != f3) {
                paint.setStrokeMiter(f3);
            }
            int g = kb92.g();
            int i2 = l57.d;
            if (g == i2) {
                return kb92;
            }
            kb92.p(i2);
            return kb92;
        } else {
            h.c();
            return null;
        }
    }

    public final ey3 getLayoutDirection() {
        return this.w.b;
    }

    public final void i(long j, float f, float f2, long j2, long j3, l57 l57) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.w.c.l(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, a(this, j, l57, 1.0f, 3));
    }

    public final wr0 j0() {
        return this.x;
    }

    public final void s(eh ehVar, kc0 kc0, float f, iz1 iz1, lt0 lt0, int i) {
        this.w.c.f(ehVar, c(kc0, iz1, f, lt0, i, 1));
    }

    public final void t0(hg hgVar, long j, long j2, long j3, float f, lt0 lt0, int i) {
        this.w.c.c(hgVar, j, j2, j3, c((kc0) null, rd2.a, f, lt0, 3, i));
    }

    public final void w0(eh ehVar, long j, iz1 iz1) {
        this.w.c.f(ehVar, a(this, j, iz1, 1.0f, 3));
    }

    public final void z0(kc0 kc0, long j, long j2, long j3, float f, iz1 iz1, lt0 lt0, int i) {
        qk0 qk0 = this.w.c;
        int i2 = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i2);
        int i3 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i3);
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2);
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3);
        float intBitsToFloat5 = Float.intBitsToFloat((int) (j3 >> 32));
        qk0 qk02 = qk0;
        float f2 = intBitsToFloat;
        float f3 = intBitsToFloat2;
        float f4 = intBitsToFloat3;
        float f5 = intBitsToFloat4;
        float f6 = intBitsToFloat5;
        float intBitsToFloat6 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        qk02.s(f2, f3, f4, f5, f6, intBitsToFloat6, c(kc0, iz1, f, lt0, i, 1));
    }
}
