package defpackage;

import java.util.Map;

/* renamed from: vj  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class vj {
    public static final x17 a = kl8.M(0.0f, 0.0f, (Object) null, 7);

    static {
        Map map = l78.a;
        kl8.M(0.0f, 0.0f, new lx1(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final a37 a(float f, je2 je2, yt2 yt2) {
        return c(new lx1(f), we.x, je2, (Float) null, "DpAnimation", yt2, 0, 8);
    }

    public static final a37 b(float f, hl hlVar, String str, yt2 yt2, int i, int i2) {
        int i3 = i2 & 2;
        x17 x17 = a;
        if (i3 != 0) {
            hlVar = x17;
        }
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (hlVar == x17) {
            yt2.e0(1144115775);
            boolean d = yt2.d(0.01f);
            Object Q = yt2.Q();
            if (d || Q == ay0.a) {
                Q = kl8.M(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                yt2.o0(Q);
            }
            hlVar = (x17) Q;
            yt2.r(false);
        } else {
            yt2.e0(1144225701);
            yt2.r(false);
        }
        return c(Float.valueOf(f), we.v, hlVar, (Float) null, str2, yt2, (i << 3) & 57344, 0);
    }

    public static final a37 c(Object obj, lo7 lo7, hl hlVar, Float f, String str, yt2 yt2, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        Object Q = yt2.Q();
        Object obj2 = ay0.a;
        if (Q == obj2) {
            Q = u55.p((Object) null);
            yt2.o0(Q);
        }
        aq4 aq4 = (aq4) Q;
        Object Q2 = yt2.Q();
        if (Q2 == obj2) {
            Q2 = new uj(obj, lo7, f);
            yt2.o0(Q2);
        }
        uj ujVar = (uj) Q2;
        aq4 v = u55.v((Object) null, yt2);
        if (f != null && (hlVar instanceof x17)) {
            x17 x17 = (x17) hlVar;
            if (!sg3.e(x17.c, f)) {
                hlVar = new x17(x17.a, x17.b, f);
            }
        }
        aq4 v2 = u55.v(hlVar, yt2);
        Object Q3 = yt2.Q();
        if (Q3 == obj2) {
            Q3 = rj1.c(-1, 6, (vc0) null);
            yt2.o0(Q3);
        }
        en0 en0 = (en0) Q3;
        boolean i3 = yt2.i(en0) | yt2.i(obj);
        Object Q4 = yt2.Q();
        if (i3 || Q4 == obj2) {
            Q4 = new f5(3, en0, obj);
            yt2.o0(Q4);
        }
        t49.l((sr2) Q4, yt2);
        boolean i4 = yt2.i(en0) | yt2.i(ujVar) | yt2.g(v2) | yt2.g(v);
        Object Q5 = yt2.Q();
        if (i4 || Q5 == obj2) {
            f7 f7Var = new f7(en0, ujVar, v2, v, (f61) null, 1);
            yt2.o0(f7Var);
            Q5 = f7Var;
        }
        t49.h((gs2) Q5, yt2, en0);
        a37 a37 = (a37) aq4.getValue();
        if (a37 == null) {
            return ujVar.c;
        }
        return a37;
    }
}
