package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* access modifiers changed from: private */
    public static /* synthetic */ z3 lambda$getComponents$0(tv0 tv0) {
        return new z3((Context) tv0.a(Context.class), tv0.h(ac.class));
    }

    public List<gv0> getComponents() {
        fv0 b = gv0.b(z3.class);
        b.a = LIBRARY_NAME;
        b.a(zp1.c(Context.class));
        b.a(zp1.a(ac.class));
        b.g = new h(1);
        return Arrays.asList(new gv0[]{b.b(), gw8.q(LIBRARY_NAME, "21.1.1")});
    }
}
