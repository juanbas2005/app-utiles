package defpackage;

/* renamed from: ve7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ve7 implements wd7 {
    public final /* synthetic */ ze7 a;

    public ve7(ze7 ze7) {
        this.a = ze7;
    }

    public final void a(long j, lj6 lj6) {
        cg7 d;
        ze7 ze7 = this.a;
        long a2 = vj6.a(ze7.l(true));
        u44 u44 = ze7.d;
        if (u44 != null && (d = u44.d()) != null) {
            long e = d.e(a2);
            ze7.o = e;
            ze7.s.setValue(new l35(e));
            ze7.q = 0;
            ze7.r.setValue(cy2.w);
            ze7.t(false);
        }
    }

    public final void b() {
        ze7 ze7 = this.a;
        ze7.r.setValue((Object) null);
        ze7.s.setValue((Object) null);
    }

    public final void c() {
        ze7 ze7 = this.a;
        ze7.r.setValue((Object) null);
        ze7.s.setValue((Object) null);
    }

    public final void e(long j) {
        cg7 d;
        my2 my2;
        ze7 ze7 = this.a;
        ze7.q = l35.e(ze7.q, j);
        u44 u44 = ze7.d;
        if (u44 != null && (d = u44.d()) != null) {
            ze7.s.setValue(new l35(l35.e(ze7.o, ze7.q)));
            v35 v35 = ze7.b;
            l35 i = ze7.i();
            i.getClass();
            int h = v35.h(d.b(true, i.a));
            long a2 = i95.a(h, h);
            if (!lg7.b(a2, ze7.n().b)) {
                u44 u442 = ze7.d;
                if ((u442 == null || ((Boolean) u442.q.getValue()).booleanValue()) && (my2 = ze7.k) != null) {
                    ((ij5) my2).a(9);
                }
                ze7.c.y(ze7.e(ze7.n().a, a2));
                ze7.w = new lg7(a2);
            }
        }
    }

    public final void d() {
    }

    public final void onCancel() {
    }
}
