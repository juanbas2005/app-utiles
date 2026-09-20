package defpackage;

import java.util.List;

/* renamed from: tv4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class tv4 {
    public yv4 a;
    public List b;
    public List c;
    public ew4 d = cw4.a;
    public boolean e;
    public boolean f;
    public rv4 g;

    public tv4(yv4 yv4, boolean z, int i) {
        yv4.getClass();
        this.a = yv4;
        a42 a42 = a42.w;
        this.b = a42;
        this.c = a42;
        this.e = z;
        this.f = false;
    }

    public final boolean a() {
        rv4 rv4 = this.g;
        if (rv4 == null || rv4.c) {
            return this.e;
        }
        return false;
    }

    public final boolean b() {
        rv4 rv4 = this.g;
        if (rv4 == null || rv4.c) {
            return this.f;
        }
        return false;
    }

    public abstract void d();

    public void f(qv4 qv4) {
        qv4.getClass();
    }

    public final void h() {
        rv4 rv4 = this.g;
        if (rv4 != null && rv4.f.h(this)) {
            aw4 aw4 = rv4.d;
            aw4.getClass();
            if (equals(aw4.f)) {
                int i = aw4.g;
                cw4 cw4 = cw4.a;
                if (i == -1) {
                    this.d = cw4;
                    c();
                } else if (i == 1) {
                    this.d = cw4;
                    g();
                }
                aw4.f = null;
                aw4.g = 0;
                aw4.h = null;
            }
            aw4.d.remove(this);
            aw4.e.remove(this);
            this.g = null;
            aw4.b();
        }
    }

    public final void i(boolean z) {
        aw4 aw4;
        if (this.e != z) {
            this.e = z;
            rv4 rv4 = this.g;
            if (rv4 != null && (aw4 = rv4.d) != null) {
                aw4.b();
            }
        }
    }

    public void c() {
    }

    public void g() {
    }

    public void e(qv4 qv4) {
    }
}
