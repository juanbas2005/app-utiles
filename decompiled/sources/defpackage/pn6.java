package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: pn6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pn6 implements Application.ActivityLifecycleCallbacks {
    public final es6 w;

    public pn6(es6 es6) {
        es6.getClass();
        this.w = es6;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        this.w.b();
    }

    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        this.w.c();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
