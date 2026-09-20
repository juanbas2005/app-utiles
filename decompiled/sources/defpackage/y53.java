package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: y53  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y53 implements h53 {
    public final yr7 a = new yr7();
    public i53 b = i53.b;
    public final dz2 c = new dz2(0);
    public Object d = w32.a;
    public w77 e = b85.d();
    public final iz0 f = new iz0();

    public final dz2 a() {
        return this.c;
    }

    public final void b(fp7 fp7) {
        iz0 iz0 = this.f;
        if (fp7 != null) {
            iz0.e(g56.a, fp7);
            return;
        }
        au auVar = g56.a;
        iz0.getClass();
        auVar.getClass();
        iz0.c().remove(auVar);
    }

    public final void c(y63 y63) {
        ((Map) this.f.a(u43.a, new nf1(28))).put(x63.a, y63);
    }

    public final void d(i53 i53) {
        i53.getClass();
        this.b = i53;
    }

    public final void e(y53 y53) {
        y53.getClass();
        this.b = y53.b;
        this.d = y53.d;
        iz0 iz0 = y53.f;
        b((fp7) iz0.d(g56.a));
        yr7 yr7 = y53.a;
        yr7 yr72 = this.a;
        j45.u(yr72, yr7);
        List list = yr72.h;
        list.getClass();
        yr72.h = list;
        o55.b(this.c, y53.c);
        iz0 iz02 = this.f;
        iz02.getClass();
        iz0.getClass();
        for (au auVar : dt0.b1(iz0.c().keySet())) {
            auVar.getClass();
            iz02.e(auVar, iz0.b(auVar));
        }
    }
}
