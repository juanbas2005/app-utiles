package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class WorkManagerInitializer implements sb3 {
    public static final String a = bc4.p("WrkMgrInitializer");

    public final List a() {
        return Collections.EMPTY_LIST;
    }

    public final Object b(Context context) {
        bc4.k().e(a, "Initializing WorkManager with default configuration.");
        f01 f01 = new f01(new me6(23));
        context.getClass();
        synchronized (nd8.m) {
            try {
                nd8 nd8 = nd8.k;
                if (nd8 != null) {
                    if (nd8.l != null) {
                        throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                    }
                }
                if (nd8 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (nd8.l == null) {
                        nd8.l = pd8.o(applicationContext, f01);
                    }
                    nd8.k = nd8.l;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return nd8.c(context);
    }
}
