package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: r32  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class r32 implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    public void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    public void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    public void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    public void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    public void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
