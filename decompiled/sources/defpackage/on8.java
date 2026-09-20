package defpackage;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzmk;

/* renamed from: on8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class on8 implements os2 {
    public static final /* synthetic */ on8 A = new on8(3);
    public static final /* synthetic */ on8 x = new on8(0);
    public static final /* synthetic */ on8 y = new on8(1);
    public static final /* synthetic */ on8 z = new on8(2);
    public final /* synthetic */ int w;

    public /* synthetic */ on8(int i) {
        this.w = i;
    }

    public final Object apply(Object obj) {
        switch (this.w) {
            case b85.b:
                Context context = (Context) obj;
                String str = pn8.b;
                if (str == null) {
                    synchronized (pn8.class) {
                        try {
                            str = pn8.b;
                            if (str == null) {
                                str = u49.b(context, "com.google.android.gms.measurement");
                                pn8.b = str;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return str;
            case 1:
                Context context2 = (Context) obj;
                q11 q11 = w89.i;
                return "";
            case 2:
                u59 u59 = (u59) obj;
                s99 z2 = t99.z();
                if (u59 == null) {
                    return (t99) z2.d();
                }
                for (x59 x59 : u59.x()) {
                    u99 z3 = v99.z();
                    String t = x59.t();
                    z3.b();
                    ((v99) z3.x).A(t);
                    int H = x59.H();
                    int i = H - 1;
                    if (H != 0) {
                        if (i == 0) {
                            long u = x59.u();
                            z3.b();
                            ((v99) z3.x).B(u);
                        } else if (i == 1) {
                            boolean v = x59.v();
                            z3.b();
                            ((v99) z3.x).C(v);
                        } else if (i == 2) {
                            double w2 = x59.w();
                            z3.b();
                            ((v99) z3.x).D(w2);
                        } else if (i == 3) {
                            String x2 = x59.x();
                            z3.b();
                            ((v99) z3.x).E(x2);
                        } else if (i == 4) {
                            vk8 y2 = x59.y();
                            z3.b();
                            ((v99) z3.x).F(y2);
                        } else {
                            h.s("No known flag type");
                            return null;
                        }
                        z2.b();
                        ((t99) z2.x).F((v99) z3.d());
                    } else {
                        throw null;
                    }
                }
                String w3 = u59.w();
                z2.b();
                ((t99) z2.x).D(w3);
                String t2 = u59.t();
                z2.b();
                ((t99) z2.x).B(t2);
                long y3 = u59.y();
                z2.b();
                ((t99) z2.x).E(y3);
                if (u59.u()) {
                    vk8 v2 = u59.v();
                    z2.b();
                    ((t99) z2.x).C(v2);
                }
                return (t99) z2.d();
            default:
                zzmk zzmk = (zzmk) obj;
                if (zzmk.w == 29514) {
                    v69 w4 = w69.w();
                    o69 G = p69.G();
                    long currentTimeMillis = System.currentTimeMillis();
                    G.b();
                    ((p69) G.x).I(currentTimeMillis);
                    w4.b();
                    ((w69) w4.x).x((p69) G.d());
                    return (w69) w4.d();
                }
                throw zzmk;
        }
    }
}
