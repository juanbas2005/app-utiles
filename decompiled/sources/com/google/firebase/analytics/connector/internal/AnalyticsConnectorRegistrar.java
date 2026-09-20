package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* access modifiers changed from: private */
    public static ac lambda$getComponents$0(tv0 tv0) {
        oe2 oe2 = (oe2) tv0.a(oe2.class);
        Context context = (Context) tv0.a(Context.class);
        w67 w67 = (w67) tv0.a(w67.class);
        z65.k(oe2);
        z65.k(context);
        z65.k(w67);
        z65.k(context.getApplicationContext());
        if (bc.c == null) {
            synchronized (bc.class) {
                try {
                    if (bc.c == null) {
                        Bundle bundle = new Bundle(1);
                        oe2.a();
                        if ("[DEFAULT]".equals(oe2.b)) {
                            ((b72) w67).a(gv1.z, z53.x);
                            bundle.putBoolean("dataCollectionDefaultEnabled", oe2.h());
                        }
                        bc.c = new bc(yw8.e(context, bundle).b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bc.c;
    }

    public List<gv0> getComponents() {
        fv0 b = gv0.b(ac.class);
        b.a(zp1.c(oe2.class));
        b.a(zp1.c(Context.class));
        b.a(zp1.c(w67.class));
        b.g = jv2.y;
        b.c(2);
        return Arrays.asList(new gv0[]{b.b(), gw8.q("fire-analytics", "23.2.0")});
    }
}
