package defpackage;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: c19  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class c19 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j19 b;
    public final /* synthetic */ String c;

    public /* synthetic */ c19(j19 j19, String str, int i) {
        this.a = i;
        this.b = j19;
        this.c = str;
    }

    public final Object call() {
        int i = this.a;
        String str = this.c;
        j19 j19 = this.b;
        switch (i) {
            case b85.b:
                return new v39(new c19(j19, str, 1));
            case 1:
                uq8 uq8 = j19.x.y;
                v89.R(uq8);
                c09 g2 = uq8.g2(str);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", "android");
                hashMap.put("package_name", str);
                ((y19) j19.w).z.i1();
                hashMap.put("gmp_version", 161000L);
                if (g2 != null) {
                    String O = g2.O();
                    if (O != null) {
                        hashMap.put("app_version", O);
                    }
                    hashMap.put("app_version_int", Long.valueOf(g2.Q()));
                    hashMap.put("dynamite_version", Long.valueOf(g2.b()));
                }
                return hashMap;
            default:
                k68 k68 = new k68(j19, false, str, 15);
                j69 j69 = new j69("internal.remoteConfig", 0);
                j69.x.put("getValue", new v39(j69, k68));
                return j69;
        }
    }
}
