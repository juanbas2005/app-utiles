package defpackage;

/* renamed from: we7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class we7 implements wd7 {
    public final /* synthetic */ ze7 a;
    public final /* synthetic */ boolean b;

    public we7(ze7 ze7, boolean z) {
        this.a = ze7;
        this.b = z;
    }

    public final void b() {
        ze7 ze7 = this.a;
        ze7.r.setValue((Object) null);
        ze7.s.setValue((Object) null);
        ze7.t(true);
    }

    public final void c() {
        ze7 ze7 = this.a;
        ze7.r.setValue((Object) null);
        ze7.s.setValue((Object) null);
        ze7.t(true);
    }

    public final void d() {
        cy2 cy2;
        cg7 d;
        boolean z = this.b;
        if (z) {
            cy2 = cy2.x;
        } else {
            cy2 = cy2.y;
        }
        ze7 ze7 = this.a;
        ze7.r.setValue(cy2);
        long a2 = vj6.a(ze7.l(z));
        u44 u44 = ze7.d;
        if (u44 != null && (d = u44.d()) != null) {
            long e = d.e(a2);
            ze7.o = e;
            ze7.s.setValue(new l35(e));
            ze7.q = 0;
            ze7.t = -1;
            u44 u442 = ze7.d;
            if (u442 != null) {
                u442.q.setValue(Boolean.TRUE);
            }
            ze7.t(false);
        }
    }

    public final void e(long j) {
        ze7 ze7 = this.a;
        long e = l35.e(ze7.q, j);
        ze7.q = e;
        ze7.s.setValue(new l35(l35.e(ze7.o, e)));
        hf7 n = ze7.n();
        l35 i = ze7.i();
        i.getClass();
        ze7.c(ze7, n, i.a, false, this.b, d63.N, true, new ny2(9));
        ze7.t(false);
    }

    public final void onCancel() {
    }

    public final void a(long j, lj6 lj6) {
    }
}
