package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* access modifiers changed from: private */
    public static we2 lambda$getComponents$0(tv0 tv0) {
        return new ve2((oe2) tv0.a(oe2.class), tv0.h(iz2.class), (ExecutorService) tv0.s(new av5(t30.class, ExecutorService.class)), new il6((Executor) tv0.s(new av5(x90.class, Executor.class))));
    }

    public List<gv0> getComponents() {
        fv0 b = gv0.b(we2.class);
        b.a = LIBRARY_NAME;
        b.a(zp1.c(oe2.class));
        b.a(zp1.a(iz2.class));
        b.a(new zp1(new av5(t30.class, ExecutorService.class), 1, 0));
        b.a(new zp1(new av5(x90.class, Executor.class), 1, 0));
        b.g = new ta1(26);
        gv0 b2 = b.b();
        hz2 hz2 = new hz2(0);
        fv0 b3 = gv0.b(hz2.class);
        b3.c = 1;
        b3.g = new ev0(0, hz2);
        return Arrays.asList(new gv0[]{b2, b3.b(), gw8.q(LIBRARY_NAME, "19.1.1")});
    }
}
