package defpackage;

import java.util.List;

/* renamed from: jh3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jh3 implements no0 {
    public static final jh3 b = new jh3(0);
    public static final jh3 c = new jh3(1);
    public final /* synthetic */ int a;

    public /* synthetic */ jh3(int i) {
        this.a = i;
    }

    public final String a() {
        switch (this.a) {
            case b85.b:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    public final boolean b(lj3 lj3) {
        fu6 fu6;
        switch (this.a) {
            case b85.b:
                h28 h28 = (h28) lj3.S().get(1);
                hr2 hr2 = f26.d;
                h28.getClass();
                int i = ts1.a;
                sl4 c2 = rs1.c(h28);
                c2.getClass();
                hr2.getClass();
                ql4 y = r16.y(c2, m27.R);
                if (y == null) {
                    fu6 = null;
                } else {
                    ro7.x.getClass();
                    ro7 ro7 = ro7.y;
                    List parameters = y.n().getParameters();
                    parameters.getClass();
                    Object Q0 = dt0.Q0(parameters);
                    Q0.getClass();
                    fu6 = kl8.H(ro7, y, sg3.D(new p27((qp7) Q0)));
                }
                if (fu6 == null) {
                    return false;
                }
                vw3 b2 = h28.b();
                b2.getClass();
                return jb5.x(fu6, iq7.g(b2, false));
            default:
                List<h28> S = lj3.S();
                S.getClass();
                if (!S.isEmpty()) {
                    for (h28 h282 : S) {
                        h282.getClass();
                        if (ts1.a(h282) || h282.F != null) {
                            return false;
                        }
                        while (r4.hasNext()) {
                        }
                    }
                }
                return true;
        }
    }

    public final /* bridge */ String c(lj3 lj3) {
        switch (this.a) {
            case b85.b:
                return mp7.Z(this, lj3);
            default:
                return mp7.Z(this, lj3);
        }
    }
}
