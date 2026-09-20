package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(av5 av5, tv0 tv0) {
        oe2 oe2 = (oe2) tv0.a(oe2.class);
        if (tv0.a(xe2.class) == null) {
            return new FirebaseMessaging(oe2, tv0.h(ho1.class), tv0.h(jz2.class), (we2) tv0.a(we2.class), tv0.r(av5), (w67) tv0.a(w67.class));
        }
        ku4.a();
        return null;
    }

    public List<gv0> getComponents() {
        av5 av5 = new av5(an7.class, cn7.class);
        fv0 b = gv0.b(FirebaseMessaging.class);
        b.a = LIBRARY_NAME;
        b.a(zp1.c(oe2.class));
        b.a(new zp1(0, 0, xe2.class));
        b.a(zp1.a(ho1.class));
        b.a(zp1.a(jz2.class));
        b.a(zp1.c(we2.class));
        b.a(new zp1(av5, 0, 1));
        b.a(zp1.c(w67.class));
        b.g = new ul1(av5, 1);
        b.c(1);
        return Arrays.asList(new gv0[]{b.b(), gw8.q(LIBRARY_NAME, "25.1.0")});
    }
}
