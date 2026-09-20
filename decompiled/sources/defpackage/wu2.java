package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: wu2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class wu2 extends zu2 {
    public final pc2 w;

    public wu2(vu2 vu2) {
        vu2.x.f();
        vu2.y = false;
        this.w = vu2.x;
    }

    public final boolean i() {
        mv6 mv6 = this.w.a;
        int i = 0;
        while (true) {
            if (i >= mv6.x.size()) {
                for (Map.Entry e : mv6.c()) {
                    if (!pc2.e(e)) {
                    }
                }
                return true;
            } else if (!pc2.e((Map.Entry) mv6.x.get(i))) {
                break;
            } else {
                i++;
            }
        }
        return false;
    }

    public final int j() {
        mv6 mv6 = this.w.a;
        int i = 0;
        for (int i2 = 0; i2 < mv6.x.size(); i2++) {
            Map.Entry entry = (Map.Entry) mv6.x.get(i2);
            i += pc2.d((xu2) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : mv6.c()) {
            i += pc2.d((xu2) entry2.getKey(), entry2.getValue());
        }
        return i;
    }

    public final Object k(yu2 yu2) {
        o(yu2);
        xu2 xu2 = yu2.d;
        Object obj = this.w.a.get(xu2);
        if (obj == null) {
            return yu2.b;
        }
        if (!xu2.y) {
            return yu2.a(obj);
        }
        if (xu2.x.w != uc8.E) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        for (Object a : (List) obj) {
            arrayList.add(yu2.a(a));
        }
        return arrayList;
    }

    public final boolean l(yu2 yu2) {
        o(yu2);
        xu2 xu2 = yu2.d;
        pc2 pc2 = this.w;
        pc2.getClass();
        if (xu2.y) {
            h.q("hasField() can only be called on non-repeated fields.");
            return false;
        } else if (pc2.a.get(xu2) != null) {
            return true;
        } else {
            return false;
        }
    }

    public final void m() {
        this.w.f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    public final boolean n(ts0 ts0, xs0 xs0, y92 y92, int i) {
        boolean z;
        boolean z2;
        Object obj;
        k2 k2Var;
        int i2 = i & 7;
        yu2 yu2 = (yu2) y92.a.get(new w92(i >>> 3, b()));
        if (yu2 != null) {
            xu2 xu2 = yu2.d;
            rc8 rc8 = xu2.x;
            pc2 pc2 = pc2.c;
            if (i2 == rc8.x) {
                z2 = false;
                z = false;
            } else if (xu2.y && rc8.a() && i2 == 2) {
                z = true;
                z2 = false;
            }
            if (!z2) {
                return ts0.r(i, xs0);
            }
            ru2 ru2 = null;
            pc2 pc22 = this.w;
            if (z) {
                int e = ts0.e(ts0.l());
                xu2 xu22 = yu2.d;
                if (xu22.x != rc8.ENUM) {
                    while (ts0.c() > 0) {
                        pc22.a(xu22, pc2.h(ts0, xu22.x));
                    }
                } else if (ts0.c() > 0) {
                    ts0.l();
                    throw null;
                }
                ts0.d(e);
                return true;
            }
            xu2 xu23 = yu2.d;
            rc8 rc82 = xu23.x;
            boolean z3 = xu23.y;
            int ordinal = rc82.w.ordinal();
            if (ordinal != 7) {
                if (ordinal != 8) {
                    obj = pc2.h(ts0, rc82);
                } else {
                    if (!z3 && (k2Var = (k2) pc22.a.get(xu23)) != null) {
                        ru2 = k2Var.e();
                    }
                    if (ru2 == null) {
                        ru2 = yu2.c.d();
                    }
                    if (rc82 == rc8.GROUP) {
                        int i3 = xu23.w;
                        ts0.b();
                        ts0.i++;
                        ru2.d(ts0, y92);
                        ts0.a((i3 << 3) | 4);
                        ts0.i--;
                    } else {
                        int l = ts0.l();
                        ts0.b();
                        int e2 = ts0.e(l);
                        ts0.i++;
                        ru2.d(ts0, y92);
                        ts0.a(0);
                        ts0.i--;
                        ts0.d(e2);
                    }
                    obj = ru2.c();
                }
                if (z3) {
                    pc22.a(xu23, yu2.b(obj));
                    return true;
                }
                pc22.i(xu23, yu2.b(obj));
                return true;
            }
            ts0.l();
            throw null;
        }
        z2 = true;
        z = false;
        if (!z2) {
        }
    }

    public final void o(yu2 yu2) {
        if (yu2.a != b()) {
            h.q("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public wu2() {
        this.w = new pc2();
    }
}
