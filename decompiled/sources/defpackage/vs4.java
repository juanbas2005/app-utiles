package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvs4;", "Lr58;", "nauta"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* renamed from: vs4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vs4 extends r58 {
    public final ur4 b;
    public final kr4 c;
    public final Context d;
    public final h81 e;
    public final d37 f;
    public final xw5 g;

    public vs4(ur4 ur4, kr4 kr4, Context context, h81 h81) {
        ur4.getClass();
        kr4.getClass();
        this.b = ur4;
        this.c = kr4;
        this.d = context;
        this.e = h81;
        d37 a = e37.a(new is7(6, new hs4(false, (String) null, (String) null, (List) null, (Long) null, 63)));
        this.f = a;
        this.g = kl8.N(a, new is7(6, new hs4(false, (String) null, (String) null, (List) null, (Long) null, 63)), u58.a(this));
        gs4 gs4 = (gs4) ur4;
        di2 h = gs4.h();
        dy7 dy7 = (dy7) gs4.a;
        di2 L = gr8.L(new c6(dy7.a.b(), 20), dy7.b);
        di2 g2 = gs4.g();
        o40 o40 = new o40(6, t49.E(gs4.b.a.a, false, new String[]{"nauta_accounts"}, new tm3(22)), gs4);
        di2 u = gr8.u(new c6(nd8.c(kr4.a).d("cu.lestebang.utiletecsa.sync.worker.nautalogout"), 11), -1);
        di2[] di2Arr = {h, L, g2, o40, u};
        gr8.Q(new qi2(new o40(4, di2Arr, new ts4((f61) null)), new tc1(this, (f61) null, 11), 2), u58.a(this));
    }

    public static String e(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i & 255);
        sb.append(".");
        sb.append((i >> 8) & 255);
        sb.append(".");
        sb.append((i >> 16) & 255);
        return hl6.p(sb, ".", (i >> 24) & 255);
    }

    public final void f() {
        ar7.H(u58.a(this), this.e, (r81) null, new f70(this, (f61) null, 8), 2);
    }

    public final void g(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        d37 d37 = this.f;
        if (!((is7) d37.getValue()).b) {
            ar7.H(u58.a(this), (e81) null, (r81) null, new jd1(d37, (f61) null, z, this, str, str2, z2), 3);
        }
    }
}
