package defpackage;

import android.content.Context;
import cu.lestebang.utiletecsa.feature.home.navigation.Dialer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lku1;", "Lr58;", "home"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* renamed from: ku1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ku1 extends r58 {
    public final rg5 b;
    public final Context c;
    public final String d;
    public final String e;
    public final d37 f;
    public final xw5 g;
    public int h;

    public ku1(ye6 ye6, rg5 rg5, vp6 vp6, Context context) {
        ye6.getClass();
        rg5.getClass();
        vp6.getClass();
        this.b = rg5;
        this.c = context;
        Dialer dialer = (Dialer) o85.w(ye6, b26.a.b(Dialer.class));
        this.d = dialer.getPrefix();
        this.e = dialer.getTitle();
        d37 a = e37.a("");
        this.f = a;
        this.g = gr8.t(a);
        ar7.H(u58.a(this), (e81) null, (r81) null, new ju1(vp6, this, (f61) null, 0), 3);
    }
}
