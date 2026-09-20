package defpackage;

import java.util.Map;

/* renamed from: ai3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ai3 implements wl5 {
    public static final /* synthetic */ yr3[] e = {new gr5(ai3.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)};
    public final up2 a;
    public final sy6 b;
    public final ib4 c;
    public final o06 d;

    /* JADX WARNING: type inference failed for: r4v1, types: [ib4, hb4] */
    public ai3(am6 am6, n06 n06, up2 up2) {
        sy6 sy6;
        o06 o06;
        am6.getClass();
        pj3 pj3 = (pj3) am6.x;
        up2.getClass();
        this.a = up2;
        if (n06 != null) {
            pj3.j.getClass();
            sy6 = td0.F(n06);
        } else {
            sy6 = sy6.j;
        }
        this.b = sy6;
        kb4 kb4 = pj3.a;
        p3 p3Var = new p3(am6, false, this, 12);
        kb4.getClass();
        this.c = new hb4(kb4, p3Var);
        if (n06 != null) {
            o06 = (o06) dt0.x0(n06.b());
        } else {
            o06 = null;
        }
        this.d = o06;
    }

    public final vw3 b() {
        Object q = p25.q(this.c, e[0]);
        q.getClass();
        return (fu6) q;
    }

    public final sy6 e() {
        return this.b;
    }

    public final up2 f() {
        return this.a;
    }

    public Map g() {
        return b42.w;
    }
}
