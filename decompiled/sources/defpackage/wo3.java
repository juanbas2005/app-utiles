package defpackage;

/* renamed from: wo3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wo3 implements it1 {
    public final co3 w;
    public final co3 x;
    public final v16 y;

    public wo3(v16 v16, ns5 ns5, uo3 uo3, boolean z, ht1 ht1) {
        v16.getClass();
        ns5.getClass();
        uo3.getClass();
        co3 co3 = new co3(co3.c(m06.a(v16.a)));
        hv3 hv3 = v16.b;
        co3 co32 = null;
        String str = hv3.a != gv3.E ? null : hv3.f;
        if (str != null && str.length() > 0) {
            co32 = co3.b(str);
        }
        this.w = co3;
        this.x = co32;
        this.y = v16;
        yu2 yu2 = qp3.k;
        yu2.getClass();
        Integer num = (Integer) jb5.n(ns5, yu2);
        if (num != null) {
            uo3.getString(num.intValue());
        }
    }

    public final String D() {
        return hl6.o(new StringBuilder("Class '"), a().a().a.a, '\'');
    }

    public final gq0 a() {
        up2 up2;
        co3 co3 = this.w;
        String str = co3.a;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            up2 = up2.c;
            if (up2 == null) {
                co3.a(9);
                throw null;
            }
        } else {
            up2 = new up2(str.substring(0, lastIndexOf).replace('/', '.'));
        }
        String str2 = co3.a;
        if (str2 != null) {
            return new gq0(up2, uq4.e(d57.d1('/', str2, str2)));
        }
        co3.a(10);
        throw null;
    }

    public final String toString() {
        return wo3.class.getSimpleName() + ": " + this.w;
    }
}
