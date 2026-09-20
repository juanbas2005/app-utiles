package defpackage;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: u69  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u69 extends g89 {
    public final l09 A;
    public final l09 B;
    public final l09 C;
    public final l09 D;
    public final l09 E;
    public final l09 F;
    public final HashMap z = new HashMap();

    public u69(v89 v89) {
        super(v89);
        q09 q09 = ((y19) this.w).A;
        y19.e(q09);
        this.A = new l09(q09, "last_delete_stale", 0);
        q09 q092 = ((y19) this.w).A;
        y19.e(q092);
        this.B = new l09(q092, "last_delete_stale_batch", 0);
        q09 q093 = ((y19) this.w).A;
        y19.e(q093);
        this.C = new l09(q093, "backoff", 0);
        q09 q094 = ((y19) this.w).A;
        y19.e(q094);
        this.D = new l09(q094, "last_upload", 0);
        q09 q095 = ((y19) this.w).A;
        y19.e(q095);
        this.E = new l09(q095, "last_upload_attempt", 0);
        q09 q096 = ((y19) this.w).A;
        y19.e(q096);
        this.F = new l09(q096, "midnight_offset", 0);
    }

    public final Pair g1(z99 z99, h39 h39) {
        String str = z99.w;
        z65.h(str);
        if (!h39.i(f39.AD_STORAGE) || !z99.J) {
            return new Pair("", Boolean.FALSE);
        }
        return h1(str);
    }

    public final Pair h1(String str) {
        s69 s69;
        ca caVar;
        b1();
        y19 y19 = (y19) this.w;
        xb4 xb4 = y19.G;
        tp8 tp8 = y19.z;
        xb4.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.z;
        s69 s692 = (s69) hashMap.get(str);
        if (s692 != null && elapsedRealtime < s692.c) {
            return new Pair(s692.a, Boolean.valueOf(s692.b));
        }
        long k1 = tp8.k1(str, by8.b) + elapsedRealtime;
        try {
            caVar = da.a(y19.w);
        } catch (PackageManager.NameNotFoundException unused) {
            if (s692 != null) {
                try {
                    if (elapsedRealtime < s692.c + tp8.k1(str, by8.c)) {
                        return new Pair(s692.a, Boolean.valueOf(s692.b));
                    }
                } catch (Exception e) {
                    pz8 pz8 = y19.B;
                    y19.g(pz8);
                    pz8.I.b("Unable to get advertising id", e);
                    s69 = new s69("", false, k1);
                }
            }
            caVar = null;
        }
        if (caVar == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String str2 = caVar.c;
        if (str2 != null) {
            s69 = new s69(str2, caVar.b, k1);
        } else {
            s69 = new s69("", caVar.b, k1);
        }
        hashMap.put(str, s69);
        return new Pair(s69.a, Boolean.valueOf(s69.b));
    }

    public final String i1(z99 z99, h39 h39) {
        String str = z99.w;
        z65.h(str);
        if (!h39.i(f39.AD_STORAGE) || !z99.J) {
            return "";
        }
        b1();
        String str2 = (String) h1(str).first;
        MessageDigest v1 = d99.v1();
        if (v1 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, v1.digest(str2.getBytes()))});
    }

    public final void f1() {
    }
}
