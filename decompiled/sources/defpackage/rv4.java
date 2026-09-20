package defpackage;

/* renamed from: rv4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rv4 {
    public final c9 a;
    public boolean b;
    public boolean c = true;
    public final aw4 d = new aw4();
    public final mp4 e = x75.a();
    public final mp4 f = x75.a();
    public final mp4 g = x75.a();

    public rv4(c9 c9Var) {
        this.a = c9Var;
    }

    public static void a(rv4 rv4, tv4 tv4) {
        rv4.getClass();
        tv4.getClass();
        rv4.d();
        if (rv4.f.a(tv4)) {
            aw4 aw4 = rv4.d;
            aw4.getClass();
            if (tv4.g == null) {
                aw4.e.addFirst(tv4);
                tv4.g = rv4;
                aw4.b();
                return;
            }
            ku4.w(tv4, "' is already registered with a dispatcher", "Handler '");
        }
    }

    public final void b(zv4 zv4) {
        d();
        if (this.g.a(zv4)) {
            this.d.a(this, zv4, -1);
        }
    }

    public final void c(o45 o45, int i) {
        d();
        if (i != 1 && i != 0) {
            h.j(hl6.k(i, "Unsupported priority value: "));
        } else if (this.g.a(o45)) {
            this.d.a(this, o45, i);
        }
    }

    public final void d() {
        if (this.b) {
            h.s("This NavigationEventDispatcher has already been disposed and cannot be used.");
        }
    }

    public final void e(zv4 zv4, qv4 qv4) {
        d();
        if (this.c) {
            aw4 aw4 = this.d;
            aw4.getClass();
            if (aw4.g == 0) {
                tv4 c2 = aw4.c(-1);
                aw4.f = c2;
                aw4.g = -1;
                aw4.h = zv4;
                if (qv4 != null) {
                    if (c2 != null) {
                        c2.d = new dw4(qv4, -1);
                        c2.f(qv4);
                    }
                    d37 d37 = aw4.a;
                    dw4 dw4 = new dw4(qv4, -1);
                    d37.getClass();
                    d37.l((Object) null, dw4);
                }
            }
        }
    }
}
