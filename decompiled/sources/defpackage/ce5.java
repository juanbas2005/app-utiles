package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.List;

/* renamed from: ce5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ce5 extends u18 {
    public kc0 b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public kc0 g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public l57 q;
    public final eh r;
    public eh s;
    public eh t;
    public final nz3 u;

    public ce5() {
        int i2 = e38.a;
        this.d = a42.w;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        eh a = gh.a();
        this.r = a;
        this.s = a;
        this.u = rg3.y(i44.x, vy0.J);
    }

    public final void a(hz1 hz1) {
        l57 l57;
        if (this.n) {
            o55.u(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        kc0 kc0 = this.b;
        if (kc0 != null) {
            hz1.U(hz1, this.s, kc0, this.c, (l57) null, (lt0) null, 56);
        }
        kc0 kc02 = this.g;
        if (kc02 != null) {
            l57 l572 = this.q;
            if (this.o || l572 == null) {
                l57 l573 = new l57(this.f, this.j, this.h, this.i, 16);
                this.q = l573;
                this.o = false;
                l57 = l573;
            } else {
                l57 = l572;
            }
            hz1.U(hz1, this.s, kc02, this.e, l57, (lt0) null, 48);
        }
    }

    public final void e() {
        Path path;
        boolean z;
        int i2 = (this.k > 0.0f ? 1 : (this.k == 0.0f ? 0 : -1));
        eh ehVar = this.r;
        if (i2 == 0 && this.l == 1.0f) {
            this.s = ehVar;
            return;
        }
        if (sg3.e(this.s, ehVar)) {
            this.s = gh.a();
        } else {
            Path.FillType fillType = this.s.a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            if (fillType == fillType2) {
                z = true;
            } else {
                z = false;
            }
            this.s.h();
            Path path2 = this.s.a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path2.setFillType(fillType2);
        }
        nz3 nz3 = this.u;
        PathMeasure pathMeasure = ((fh) nz3.getValue()).a;
        if (ehVar != null) {
            path = ehVar.a;
        } else {
            path = null;
        }
        pathMeasure.setPath(path, false);
        float length = ((fh) nz3.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 > f5) {
            eh ehVar2 = this.t;
            if (ehVar2 == null) {
                ehVar2 = gh.a();
                this.t = ehVar2;
            }
            ehVar2.g();
            ((fh) nz3.getValue()).a(f4, length, ehVar2);
            eh.a(this.s, ehVar2);
            ehVar2.g();
            ((fh) nz3.getValue()).a(0.0f, f5, ehVar2);
            eh.a(this.s, ehVar2);
            return;
        }
        ((fh) nz3.getValue()).a(f4, f5, this.s);
    }

    public final String toString() {
        return this.r.toString();
    }
}
