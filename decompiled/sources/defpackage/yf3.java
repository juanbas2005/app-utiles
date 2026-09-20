package defpackage;

import android.content.Context;

/* renamed from: yf3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yf3 extends kw2 {
    public static final qc3 l = new qc3("IdentityCredentials.API", (h49) new wf3(0), new td0(20));
    public static final qc3 m = new qc3("ClientNotification.API", (h49) new wf3(3), new td0(20));
    public static final qc3 n = new qc3("ClientTelemetry.API", (h49) new wf3(4), new td0(20));
    public static final qc3 o = new qc3("OssLicensesService.API", (h49) new wf3(8), new td0(20));
    public static final qc3 p = new qc3("CloudMessaging.API", (h49) new wf3(9), new td0(20));
    public static int q = 1;

    public yb9 c(dc7 dc7) {
        za0 b = i93.b();
        b.e = new cc2[]{h03.B0};
        b.c = false;
        b.d = new rg4(16, (Object) dc7);
        return b(2, b.a());
    }

    public synchronized int d() {
        int i;
        try {
            i = q;
            if (i == 1) {
                Context context = this.a;
                lw2 lw2 = lw2.e;
                int b = lw2.b(context, 12451000);
                if (b == 0) {
                    i = 4;
                    q = 4;
                } else if (lw2.a(context, (String) null, b) != null || f12.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    q = 2;
                } else {
                    i = 3;
                    q = 3;
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return i;
    }
}
