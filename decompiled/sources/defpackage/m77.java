package defpackage;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: m77  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m77 implements j77 {
    public final l77 a;
    public final t77 b;
    public final String c;
    public final boolean d;
    public final h81 e;
    public final cf4 f;
    public final String g;
    public final tx3 h;
    public final be1 i;

    public m77(l77 l77) {
        String str;
        this.a = l77;
        this.b = l77.d;
        this.c = l77.a;
        this.d = l77.c.a;
        this.e = l77.e;
        o77 o77 = l77.b;
        cf4 j = t75.j(this, "Supabase-Core", o77.a, o77.b);
        this.f = j;
        ms3 ms3 = (ms3) j.z;
        String str2 = (String) j.y;
        ub4 ub4 = ub4.x;
        if (ms3.a(ub4)) {
            ms3.b(ub4, str2, (Throwable) null, "SupabaseClient created! Please report any bugs you find.");
        }
        try {
            String str3 = Build.VERSION.RELEASE;
        } catch (Exception e2) {
            cf4 cf4 = this.f;
            ms3 ms32 = (ms3) cf4.z;
            String str4 = (String) cf4.y;
            if (ms32.a(ub4)) {
                ms32.b(ub4, str4, e2, "Failed to get OS information. If this is not intentional, please report this issue.");
            }
        }
        boolean z = this.d;
        String str5 = this.c;
        if (z) {
            str = b81.y("https://", str5);
        } else {
            str = b81.y("http://", str5);
        }
        this.g = str;
        this.h = new tx3(this);
        List<yb5> Z = sf4.Z(this.a.f);
        int F = tf4.F(et0.e0(Z, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(F < 16 ? 16 : F);
        for (yb5 yb5 : Z) {
            linkedHashMap.put((String) yb5.w, ((vr2) yb5.x).y(this));
        }
        this.i = new be1(linkedHashMap, this.f.b(" [PluginManager]"));
        for (qe4 g2 : linkedHashMap.values()) {
            g2.g();
        }
    }
}
