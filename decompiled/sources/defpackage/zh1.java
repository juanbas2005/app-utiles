package defpackage;

/* renamed from: zh1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class zh1 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ hi1 x;

    public /* synthetic */ zh1(hi1 hi1, int i) {
        this.w = i;
        this.x = hi1;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        hi1 hi1 = this.x;
        switch (i) {
            case b85.b:
                vh0 vh0 = hi1.c;
                int i2 = ((cw1) obj).a;
                Long b = hi1.b();
                if (b != null) {
                    yh0 f = vh0.f(vh0.f(b.longValue()).e);
                    if (hi1.a.f(f.a)) {
                        hi1.e.setValue(f);
                    }
                }
                hi1.g.setValue(new cw1(i2));
                return vs7;
            case 1:
                Long l = (Long) obj;
                ed5 ed5 = hi1.f;
                th0 th0 = null;
                if (l != null) {
                    th0 b2 = hi1.c.b(l.longValue());
                    if (hi1.a.f(b2.w)) {
                        th0 = b2;
                    }
                    ed5.setValue(th0);
                } else {
                    ed5.setValue((Object) null);
                }
                return vs7;
            default:
                yh0 f2 = hi1.c.f(((Long) obj).longValue());
                if (hi1.a.f(f2.a)) {
                    hi1.e.setValue(f2);
                }
                return vs7;
        }
    }
}
