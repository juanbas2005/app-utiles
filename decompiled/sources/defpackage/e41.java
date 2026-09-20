package defpackage;

import android.content.Context;
import cu.lestebang.utiletecsa.feature.registro.navigation.ContactDetail;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le41;", "Lr58;", "registro"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* renamed from: e41  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e41 extends r58 {
    public final Context b;
    public final rg5 c;
    public final nz7 d;
    public final String e;
    public final String f;
    public final boolean g;
    public final d37 h;
    public final xw5 i;
    public int j;

    public e41(ye6 ye6, Context context, h81 h81, rg5 rg5, nz7 nz7, vp6 vp6) {
        ye6.getClass();
        rg5.getClass();
        nz7.getClass();
        vp6.getClass();
        this.b = context;
        this.c = rg5;
        this.d = nz7;
        ContactDetail contactDetail = (ContactDetail) o85.w(ye6, b26.a.b(ContactDetail.class));
        this.e = contactDetail.getName();
        this.f = contactDetail.getPhone();
        this.g = sg3.e(contactDetail.getTab(), "sms");
        a42 a42 = a42.w;
        d37 a = e37.a(new b41(a42, a42, false));
        this.h = a;
        this.i = gr8.t(a);
        ar7.H(u58.a(this), (e81) null, (r81) null, new n0(vp6, this, (f61) null, 21), 3);
        ar7.H(u58.a(this), h81, (r81) null, new f70(this, (f61) null, 2), 2);
    }
}
