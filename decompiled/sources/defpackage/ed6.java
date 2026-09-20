package defpackage;

import android.graphics.Path;

/* renamed from: ed6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ed6 implements wb6 {
    public final Path a = new Path();
    public float b;
    public float c;

    public ed6(xs0 xs0) {
        if (xs0 != null) {
            xs0.w(this);
        }
    }

    public final void a(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
        this.b = f3;
        this.c = f4;
    }

    public final void b(float f, float f2) {
        this.a.moveTo(f, f2);
        this.b = f;
        this.c = f2;
    }

    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f5;
        float f8 = f6;
        this.a.cubicTo(f, f2, f3, f4, f7, f8);
        this.b = f7;
        this.c = f8;
    }

    public final void close() {
        this.a.close();
    }

    public final void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        float f6 = f4;
        float f7 = f5;
        kd6.p(this.b, this.c, f, f2, f3, z, z2, f6, f7, this);
        this.b = f6;
        this.c = f7;
    }

    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
        this.b = f;
        this.c = f2;
    }
}
