package defpackage;

/* renamed from: zv4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class zv4 {
    public rv4 a;
    public boolean b;

    public final void a() {
        rv4 rv4 = this.a;
        if (rv4 != null) {
            if (!this.b) {
                rv4.e(this, (qv4) null);
            }
            rv4.d();
            if (rv4.c) {
                aw4 aw4 = rv4.d;
                c9 c9Var = rv4.a;
                aw4.getClass();
                if (equals(aw4.h) && -1 == aw4.g) {
                    tv4 tv4 = aw4.f;
                    if (tv4 == null) {
                        tv4 = aw4.c(-1);
                    }
                    aw4.f = null;
                    aw4.g = 0;
                    aw4.h = null;
                    cw4 cw4 = cw4.a;
                    if (tv4 != null) {
                        tv4.d = cw4;
                        tv4.d();
                    } else if (c9Var != null) {
                        ((v45) c9Var.x).a.run();
                    }
                    d37 d37 = aw4.a;
                    d37.getClass();
                    d37.l((Object) null, cw4);
                }
            }
            this.b = false;
            return;
        }
        h.s("This input is not added to any dispatcher.");
    }

    public void c() {
    }

    public void b(boolean z) {
    }
}
