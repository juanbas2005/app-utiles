package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;
    public final av5 a;
    public final av5 b;
    public final av5 c;

    static {
        Map map = zf2.b;
        nn6 nn6 = nn6.w;
        if (map.containsKey(nn6)) {
            Log.d("FirebaseSessions", "Dependency " + nn6 + " already added.");
            return;
        }
        map.put(nn6, new xf2(new CountDownLatch(1)));
        Log.d("FirebaseSessions", "Dependency to " + nn6 + " added.");
    }

    public CrashlyticsRegistrar() {
        Class<ExecutorService> cls = ExecutorService.class;
        this.a = new av5(t30.class, cls);
        this.b = new av5(x90.class, cls);
        this.c = new av5(d64.class, cls);
    }

    public final List getComponents() {
        fv0 b2 = gv0.b(pe2.class);
        b2.a = "fire-cls";
        b2.a(zp1.c(oe2.class));
        b2.a(zp1.c(we2.class));
        b2.a(new zp1(this.a, 1, 0));
        b2.a(new zp1(this.b, 1, 0));
        b2.a(new zp1(this.c, 1, 0));
        b2.a(new zp1(0, 2, q91.class));
        b2.a(new zp1(0, 2, ac.class));
        b2.a(new zp1(0, 2, of2.class));
        b2.g = new c9(4, this);
        b2.c(2);
        return Arrays.asList(new gv0[]{b2.b(), gw8.q("fire-cls", "20.0.6")});
    }
}
