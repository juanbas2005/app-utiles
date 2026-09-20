package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: jw5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jw5 extends zg2 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jw5(fu6 fu6, fu6 fu62) {
        super(fu6, fu62);
        fu6.getClass();
        fu62.getClass();
        xw3.a.b(fu6, fu62);
    }

    public static final ArrayList y0(ms1 ms1, vw3 vw3) {
        List<xp7> G = vw3.G();
        ArrayList arrayList = new ArrayList(et0.e0(G, 10));
        for (xp7 xp7 : G) {
            xp7.getClass();
            StringBuilder sb = new StringBuilder();
            dt0.D0(sg3.D(xp7), sb, ", ", (String) null, (String) null, new ls1(ms1, 0), 60);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public static final String z0(String str, String str2) {
        if (!d57.y0(str, '<')) {
            return str;
        }
        return d57.f1(str, '<') + '<' + str2 + '>' + d57.d1('>', str, str);
    }

    public final ji4 R() {
        ql4 ql4;
        vq0 u = L().u();
        if (u instanceof ql4) {
            ql4 = (ql4) u;
        } else {
            ql4 = null;
        }
        if (ql4 != null) {
            ji4 A = ql4.A(new iw5());
            A.getClass();
            return A;
        }
        ku4.x("Incorrect classifier: ", L().u());
        return null;
    }

    public final vw3 Y(ax3 ax3) {
        ax3.getClass();
        fu6 fu6 = this.x;
        fu6.getClass();
        fu6 fu62 = this.y;
        fu62.getClass();
        return new zg2(fu6, fu62);
    }

    public final du7 o0(boolean z) {
        return new jw5(this.x.o0(z), this.y.o0(z));
    }

    public final du7 p0(ax3 ax3) {
        ax3.getClass();
        fu6 fu6 = this.x;
        fu6.getClass();
        fu6 fu62 = this.y;
        fu62.getClass();
        return new zg2(fu6, fu62);
    }

    public final du7 v0(ro7 ro7) {
        ro7.getClass();
        return new jw5(this.x.v0(ro7), this.y.v0(ro7));
    }

    public final fu6 w0() {
        return this.x;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x009d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
    public final String x0(ms1 ms1, ms1 ms12) {
        String z0;
        fu6 fu6 = this.x;
        String P = ms1.P(fu6);
        fu6 fu62 = this.y;
        String P2 = ms1.P(fu62);
        if (ms12.a.p()) {
            return "raw (" + P + ".." + P2 + ')';
        } else if (fu62.G().isEmpty()) {
            return ms1.x(P, P2, jb5.k(this));
        } else {
            ArrayList y0 = y0(ms1, fu6);
            ArrayList y02 = y0(ms1, fu62);
            String E0 = dt0.E0(y0, ", ", (String) null, (String) null, jo3.Z, 30);
            ArrayList i1 = dt0.i1(y0, y02);
            if (!i1.isEmpty()) {
                Iterator it = i1.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    yb5 yb5 = (yb5) it.next();
                    String str = (String) yb5.x;
                    if (!sg3.e((String) yb5.w, d57.R0(str, "out ")) && !str.equals("*")) {
                        break;
                    }
                }
                z0 = z0(P, E0);
                if (!z0.equals(P2)) {
                    return z0;
                }
                return ms1.x(z0, P2, jb5.k(this));
            }
            P2 = z0(P2, E0);
            z0 = z0(P, E0);
            if (!z0.equals(P2)) {
            }
        }
    }
}
