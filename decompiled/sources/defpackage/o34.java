package defpackage;

import java.util.List;

/* renamed from: o34  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o34 implements eh6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eh6 b;
    public final /* synthetic */ uh6 c;

    public /* synthetic */ o34(eh6 eh6, uh6 uh6, int i) {
        this.a = i;
        this.c = uh6;
        this.b = eh6;
    }

    public final float a(float f) {
        switch (this.a) {
            case b85.b:
                return this.b.a(f);
            default:
                return this.b.a(f);
        }
    }

    public final int b(int i) {
        Object obj;
        int i2 = this.a;
        uh6 uh6 = this.c;
        switch (i2) {
            case b85.b:
                s34 s34 = (s34) uh6;
                m34 j = s34.j();
                if (j.k.isEmpty()) {
                    return 0;
                }
                int h = s34.h();
                if (i > e() || h > i) {
                    return ((i - s34.h()) * kl8.P(j)) - s34.i();
                }
                List list = j.k;
                int size = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        obj = list.get(i3);
                        if (((n34) obj).a != i) {
                            i3++;
                        }
                    } else {
                        obj = null;
                    }
                }
                n34 n34 = (n34) obj;
                if (n34 != null) {
                    return n34.l;
                }
                return 0;
            default:
                ob5 ob5 = (ob5) uh6;
                return (int) (z65.q(fb5.f(ob5) + ((long) dh4.C((((float) (ob5.p() * (i - ob5.k()))) - (ob5.l() * ((float) ob5.p()))) + 0.0f)), ob5.h, ob5.g) - fb5.f(ob5));
        }
    }

    public final int c() {
        int i = this.a;
        uh6 uh6 = this.c;
        switch (i) {
            case b85.b:
                return ((s34) uh6).h();
            default:
                return ((ob5) uh6).e;
        }
    }

    public final int d() {
        int i = this.a;
        uh6 uh6 = this.c;
        switch (i) {
            case b85.b:
                return ((s34) uh6).i();
            default:
                return ((ob5) uh6).f;
        }
    }

    public final int e() {
        int i = this.a;
        uh6 uh6 = this.c;
        switch (i) {
            case b85.b:
                n34 n34 = (n34) dt0.H0(((s34) uh6).j().k);
                if (n34 != null) {
                    return n34.a;
                }
                return 0;
            default:
                return ((ph4) dt0.G0(((ob5) uh6).m().a)).a;
        }
    }

    public final void f(int i) {
        int i2 = this.a;
        uh6 uh6 = this.c;
        switch (i2) {
            case b85.b:
                ((s34) uh6).m(i);
                return;
            default:
                ob5 ob5 = (ob5) uh6;
                float p = (float) ob5.p();
                float f = 0.0f;
                if (p != 0.0f) {
                    f = 0.0f / p;
                }
                ob5.t(i, f, true);
                return;
        }
    }
}
