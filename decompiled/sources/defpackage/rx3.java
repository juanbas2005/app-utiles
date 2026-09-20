package defpackage;

import android.os.Build;

/* renamed from: rx3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class rx3 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ tx3 x;

    public /* synthetic */ rx3(tx3 tx3, int i) {
        this.w = i;
        this.x = tx3;
    }

    public final Object y(Object obj) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        tx3 tx3 = this.x;
        switch (i) {
            case b85.b:
                xm1 xm1 = (xm1) obj;
                xm1.getClass();
                dz2 dz2 = xm1.a;
                dz2.getClass();
                String str = tx3.b;
                if (!d57.I0(str)) {
                    dz2.p0("apikey", str);
                }
                dz2.p0("X-Client-Info", "supabase-kt/3.6.0");
                if (tx3.c != null) {
                    dz2.p0("X-Supabase-Client-Platform", "Android");
                    String str2 = Build.VERSION.RELEASE;
                    if (str2 != null) {
                        dz2.p0("X-Supabase-Client-Platform-Version", str2);
                    }
                }
                xm1.b.e(443);
                return vs7;
            default:
                y63 y63 = (y63) obj;
                y63.getClass();
                y63.b(Long.valueOf(u02.e(tx3.d)));
                return vs7;
        }
    }
}
