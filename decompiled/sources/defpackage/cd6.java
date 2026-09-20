package defpackage;

import java.util.ArrayList;

/* renamed from: cd6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cd6 implements wb6 {
    public final ArrayList a;
    public float b;
    public float c;
    public dd6 d = null;
    public boolean e = false;
    public boolean f = true;
    public int g = -1;
    public boolean h;

    public cd6(kd6 kd6, xs0 xs0) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (xs0 != null) {
            xs0.w(this);
            if (this.h) {
                this.d.b((dd6) arrayList.get(this.g));
                arrayList.set(this.g, this.d);
                this.h = false;
            }
            dd6 dd6 = this.d;
            if (dd6 != null) {
                arrayList.add(dd6);
            }
        }
    }

    public final void a(float f2, float f3, float f4, float f5) {
        this.d.a(f2, f3);
        this.a.add(this.d);
        this.d = new dd6(f4, f5, f4 - f2, f5 - f3);
        this.h = false;
    }

    public final void b(float f2, float f3) {
        boolean z = this.h;
        ArrayList arrayList = this.a;
        if (z) {
            this.d.b((dd6) arrayList.get(this.g));
            arrayList.set(this.g, this.d);
            this.h = false;
        }
        dd6 dd6 = this.d;
        if (dd6 != null) {
            arrayList.add(dd6);
        }
        this.b = f2;
        this.c = f3;
        this.d = new dd6(f2, f3, 0.0f, 0.0f);
        this.g = arrayList.size();
    }

    public final void c(float f2, float f3, float f4, float f5, float f6, float f7) {
        if (this.f || this.e) {
            this.d.a(f2, f3);
            this.a.add(this.d);
            this.e = false;
        }
        this.d = new dd6(f6, f7, f6 - f4, f7 - f5);
        this.h = false;
    }

    public final void close() {
        this.a.add(this.d);
        e(this.b, this.c);
        this.h = true;
    }

    public final void d(float f2, float f3, float f4, boolean z, boolean z2, float f5, float f6) {
        this.e = true;
        this.f = false;
        dd6 dd6 = this.d;
        kd6.p(dd6.a, dd6.b, f2, f3, f4, z, z2, f5, f6, this);
        this.f = true;
        this.h = false;
    }

    public final void e(float f2, float f3) {
        this.d.a(f2, f3);
        this.a.add(this.d);
        dd6 dd6 = this.d;
        this.d = new dd6(f2, f3, f2 - dd6.a, f3 - dd6.b);
        this.h = false;
    }
}
