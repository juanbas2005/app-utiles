package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* access modifiers changed from: private */
    public static b46 lambda$getComponents$0(av5 av5, tv0 tv0) {
        ke2 ke2;
        Context context = (Context) tv0.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) tv0.s(av5);
        oe2 oe2 = (oe2) tv0.a(oe2.class);
        we2 we2 = (we2) tv0.a(we2.class);
        z3 z3Var = (z3) tv0.a(z3.class);
        synchronized (z3Var) {
            try {
                if (!z3Var.a.containsKey("frc")) {
                    z3Var.a.put("frc", new ke2(z3Var.b));
                }
                ke2 = (ke2) z3Var.a.get("frc");
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return new b46(context, scheduledExecutorService, oe2, we2, ke2, tv0.h(ac.class));
    }

    public List<gv0> getComponents() {
        av5 av5 = new av5(x90.class, ScheduledExecutorService.class);
        fv0 fv0 = new fv0(b46.class, new Class[]{of2.class});
        fv0.a = LIBRARY_NAME;
        fv0.a(zp1.c(Context.class));
        fv0.a(new zp1(av5, 1, 0));
        fv0.a(zp1.c(oe2.class));
        fv0.a(zp1.c(we2.class));
        fv0.a(zp1.c(z3.class));
        fv0.a(zp1.a(ac.class));
        fv0.g = new ul1(av5, 3);
        fv0.c(2);
        return Arrays.asList(new gv0[]{fv0.b(), gw8.q(LIBRARY_NAME, "23.1.0")});
    }
}
