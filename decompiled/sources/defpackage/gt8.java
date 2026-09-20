package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: gt8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gt8 {
    public final no7 a;
    public no7 b;
    public final cf4 c = new cf4(27);
    public final kc9 d = new kc9();

    public gt8() {
        no7 no7 = new no7();
        this.a = no7;
        this.b = ((no7) no7.y).k();
        ti8 ti8 = new ti8(this, 1);
        ay4 ay4 = (ay4) no7.A;
        ((HashMap) ay4.x).put("internal.registerCallback", ti8);
        ((HashMap) ay4.x).put("internal.eventLogger", new ti8(this, 0));
    }

    public final boolean a(wi8 wi8) {
        cf4 cf4 = this.c;
        try {
            cf4.x = wi8;
            cf4.y = wi8.clone();
            ((ArrayList) cf4.z).clear();
            ((no7) this.a.z).m("runtime.counter", new wn8(Double.valueOf(0.0d)));
            this.d.a(this.b.k(), cf4);
            if (!((wi8) cf4.y).equals((wi8) cf4.x) || !((ArrayList) cf4.z).isEmpty()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }

    public final void b(v29 v29) {
        ro8 ro8;
        try {
            no7 no7 = this.a;
            this.b = ((no7) no7.y).k();
            if (!(no7.f(this.b, (x29[]) v29.t().toArray(new x29[0])) instanceof cn8)) {
                for (q29 q29 : v29.u().t()) {
                    List u = q29.u();
                    String t = q29.t();
                    Iterator it = u.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            bq8 f = no7.f(this.b, (x29) it.next());
                            if (f instanceof vp8) {
                                no7 no72 = this.b;
                                if (!no72.l(t)) {
                                    ro8 = null;
                                } else {
                                    bq8 p = no72.p(t);
                                    if (p instanceof ro8) {
                                        ro8 = (ro8) p;
                                    } else {
                                        throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(t)));
                                    }
                                }
                                if (ro8 != null) {
                                    ro8.a(this.b, Collections.singletonList(f));
                                } else {
                                    throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(t)));
                                }
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }
}
