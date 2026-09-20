package defpackage;

import io.github.jan.supabase.auth.providers.a;
import io.github.jan.supabase.auth.providers.builtin.Email$Config;
import io.github.jan.supabase.auth.providers.builtin.IDToken$Config;

/* renamed from: a7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a7 implements vr2 {
    public final /* synthetic */ int w;
    public final String x;
    public final String y;

    public /* synthetic */ a7(String str, String str2, int i) {
        this.w = i;
        this.x = str;
        this.y = str2;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        String str = this.y;
        String str2 = this.x;
        switch (i) {
            case b85.b /*0*/:
                Email$Config email$Config = (Email$Config) obj;
                email$Config.getClass();
                email$Config.setEmail(str2);
                email$Config.setPassword(str);
                return vs7;
            case 1:
                IDToken$Config iDToken$Config = (IDToken$Config) obj;
                iDToken$Config.getClass();
                iDToken$Config.setIdToken(str2);
                iDToken$Config.setProvider(a.a);
                iDToken$Config.setNonce(str);
                return vs7;
            case 2:
                tt6 tt6 = (tt6) obj;
                tt6.getClass();
                zj3 zj3 = zm5.b;
                tt6.a(str2, zj3);
                zj3 zj32 = zm5.a;
                tt6.a(str, zj3, zj3, zj32, zj32);
                tt6.c(str2, zj32);
                return vs7;
            case 3:
                tt6 tt62 = (tt6) obj;
                tt62.getClass();
                zj3 zj33 = zm5.b;
                tt62.a(str2, zj33);
                tt62.a(str, zj33, zj33, zj33);
                tt62.c(str2, zj33);
                return vs7;
            case 4:
                tt6 tt63 = (tt6) obj;
                tt63.getClass();
                zj3 zj34 = zm5.b;
                tt63.a(str2, zj34);
                zj3 zj35 = zm5.c;
                zj3 zj36 = zm5.a;
                tt63.a(str, zj34, zj34, zj35, zj36);
                tt63.c(str2, zj36);
                return vs7;
            case 5:
                tt6 tt64 = (tt6) obj;
                tt64.getClass();
                zj3 zj37 = zm5.b;
                tt64.a(str2, zj37);
                zj3 zj38 = zm5.c;
                tt64.a(str2, zj38);
                zj3 zj39 = zm5.a;
                tt64.a(str, zj37, zj38, zj38, zj39);
                tt64.c(str2, zj39);
                return vs7;
            case 6:
                tt6 tt65 = (tt6) obj;
                tt65.getClass();
                zj3 zj310 = zm5.c;
                tt65.a(str2, zj310);
                tt65.c(str, zm5.b, zj310);
                return vs7;
            default:
                tt6 tt66 = (tt6) obj;
                tt66.getClass();
                tt66.a(str2, zm5.a);
                tt66.c(str, zm5.b, zm5.c);
                return vs7;
        }
    }
}
