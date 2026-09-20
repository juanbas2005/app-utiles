package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: v30  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v30 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final v30 A = new v30();
    public final AtomicBoolean w = new AtomicBoolean();
    public final AtomicBoolean x = new AtomicBoolean();
    public final ArrayList y = new ArrayList();
    public boolean z = false;

    public static void b(Application application) {
        v30 v30 = A;
        synchronized (v30) {
            try {
                if (!v30.z) {
                    application.registerActivityLifecycleCallbacks(v30);
                    application.registerComponentCallbacks(v30);
                    v30.z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(u30 u30) {
        synchronized (A) {
            this.y.add(u30);
        }
    }

    public final void c(boolean z2) {
        synchronized (A) {
            try {
                Iterator it = this.y.iterator();
                while (it.hasNext()) {
                    ((u30) it.next()).a(z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.w.compareAndSet(true, false);
        this.x.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.w.compareAndSet(true, false);
        this.x.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.w.compareAndSet(false, true)) {
            this.x.set(true);
            c(true);
        }
    }

    public final void onLowMemory() {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
