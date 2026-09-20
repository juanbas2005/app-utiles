package defpackage;

import android.os.Build;

/* renamed from: py  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class py implements q25 {
    public static final py a = new Object();
    public static final kc2 b = kc2.a("packageName");
    public static final kc2 c = kc2.a("versionName");
    public static final kc2 d = kc2.a("appBuildVersion");
    public static final kc2 e = kc2.a("deviceManufacturer");
    public static final kc2 f = kc2.a("currentProcessDetails");
    public static final kc2 g = kc2.a("appProcessDetails");

    public final void a(Object obj, Object obj2) {
        jd jdVar = (jd) obj;
        r25 r25 = (r25) obj2;
        r25.a(b, jdVar.a);
        r25.a(c, jdVar.b);
        r25.a(d, jdVar.c);
        r25.a(e, Build.MANUFACTURER);
        r25.a(f, jdVar.d);
        r25.a(g, jdVar.e);
    }
}
