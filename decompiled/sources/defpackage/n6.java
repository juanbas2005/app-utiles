package defpackage;

import io.github.jan.supabase.auth.providers.builtin.Email$Config;

/* renamed from: n6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n6 implements vr2 {
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    public n6(String str, String str2, String str3, String str4) {
        this.w = str;
        this.x = str2;
        this.y = str3;
        this.z = str4;
    }

    public final Object y(Object obj) {
        Email$Config email$Config = (Email$Config) obj;
        email$Config.getClass();
        email$Config.setEmail(this.w);
        email$Config.setPassword(this.x);
        vm3 vm3 = new vm3();
        b96.M(vm3, "full_name", this.y);
        StringBuilder sb = new StringBuilder(8);
        for (int i = 0; i < 8; i++) {
            sb.append("ABCDEFGHJKLMNPQRSTUVWXYZ23456789".charAt(wv5.a.f().nextInt(32)));
        }
        b96.M(vm3, "invitation_code", sb.toString());
        String str = this.z;
        if (str != null) {
            if (d57.I0(str)) {
                str = null;
            }
            if (str != null) {
                b96.M(vm3, "registered_with_code", d57.k1(str).toString());
            }
        }
        email$Config.setData(vm3.a());
        return vs7.a;
    }
}
