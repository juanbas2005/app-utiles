package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* renamed from: or8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class or8 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final ur8 g;

    public or8(y19 y19, String str, String str2, String str3, long j, long j2, long j3, Bundle bundle) {
        ur8 ur8;
        z65.h(str2);
        z65.h(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (j3 != 0 && j3 > j) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.E.b("Event created with reverse previous/current timestamps. appId", pz8.k1(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            ur8 = new ur8(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    pz8 pz82 = y19.B;
                    y19.g(pz82);
                    pz82.B.a("Param name can't be null");
                    it.remove();
                } else {
                    d99 d99 = y19.E;
                    y19.e(d99);
                    Object l1 = d99.l1(next, bundle2.get(next));
                    if (l1 == null) {
                        pz8 pz83 = y19.B;
                        y19.g(pz83);
                        pz83.E.b("Param value can't be null", y19.F.b(next));
                        it.remove();
                    } else {
                        d99 d992 = y19.E;
                        y19.e(d992);
                        d992.t1(bundle2, next, l1);
                    }
                }
            }
            ur8 = new ur8(bundle2);
        }
        this.g = ur8;
    }

    public final or8 a(y19 y19, long j) {
        return new or8(y19, this.c, this.a, this.b, this.d, this.e, j, this.g);
    }

    public final String toString() {
        String ur8 = this.g.toString();
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + ur8.length() + 1);
        f21.v(sb, "Event{appId='", str, "', name='", str2);
        return f21.m(sb, "', params=", ur8, "}");
    }

    public or8(y19 y19, String str, String str2, String str3, long j, long j2, long j3, ur8 ur8) {
        z65.h(str2);
        z65.h(str3);
        z65.k(ur8);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (j3 != 0 && j3 > j) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.E.c(pz8.k1(str2), pz8.k1(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.g = ur8;
    }
}
