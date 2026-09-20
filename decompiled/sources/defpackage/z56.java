package defpackage;

/* renamed from: z56  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z56 {
    public kd6 a;
    public gu5 b;
    public int c = -1;
    public String d;
    public jy2 e;
    public zy2 f = new zy2();
    public d66 g = d66.w;
    public dy6 h;
    public a66 i;
    public a66 j;
    public a66 k;
    public long l;
    public long m;
    public u72 n;
    public dl7 o = dl7.l;

    public static void b(String str, a66 a66) {
        if (a66 == null) {
            return;
        }
        if (a66.E != null) {
            h.j(str.concat(".networkResponse != null"));
        } else if (a66.F != null) {
            h.j(str.concat(".cacheResponse != null"));
        } else if (a66.G != null) {
            h.j(str.concat(".priorResponse != null"));
        }
    }

    public final a66 a() {
        int i2 = this.c;
        if (i2 >= 0) {
            kd6 kd6 = this.a;
            if (kd6 != null) {
                gu5 gu5 = this.b;
                if (gu5 != null) {
                    String str = this.d;
                    if (str != null) {
                        kd6 kd62 = kd6;
                        kd6 kd63 = kd62;
                        return new a66(kd63, gu5, str, i2, this.e, this.f.a(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
                    }
                    h.s("message == null");
                    return null;
                }
                h.s("protocol == null");
                return null;
            }
            h.s("request == null");
            return null;
        }
        ku4.q(this.c, "code < 0: ");
        return null;
    }
}
