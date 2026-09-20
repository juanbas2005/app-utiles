package defpackage;

import android.os.Build;

/* renamed from: qy  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qy implements q25 {
    public static final qy a = new Object();
    public static final kc2 b = kc2.a("appId");
    public static final kc2 c = kc2.a("deviceModel");
    public static final kc2 d = kc2.a("sessionSdkVersion");
    public static final kc2 e = kc2.a("osVersion");
    public static final kc2 f = kc2.a("logEnvironment");
    public static final kc2 g = kc2.a("androidAppInfo");

    public final void a(Object obj, Object obj2) {
        hr hrVar = (hr) obj;
        r25 r25 = (r25) obj2;
        r25.a(b, hrVar.a);
        r25.a(c, Build.MODEL);
        r25.a(d, "3.0.6");
        r25.a(e, Build.VERSION.RELEASE);
        r25.a(f, qb4.x);
        r25.a(g, hrVar.b);
    }
}
