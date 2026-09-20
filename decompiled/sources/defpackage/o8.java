package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: o8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o8 implements Application.ActivityLifecycleCallbacks {
    public boolean A = false;
    public boolean B = false;
    public Object w;
    public Activity x;
    public final int y;
    public boolean z = false;

    public o8(Activity activity) {
        this.x = activity;
        this.y = activity.hashCode();
    }

    public final void onActivityDestroyed(Activity activity) {
        if (this.x == activity) {
            this.x = null;
            this.A = true;
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (this.A && !this.B && !this.z) {
            Object obj = this.w;
            try {
                Object obj2 = p8.c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.y) {
                    p8.g.postAtFrontOfQueue(new nt2(4, p8.b.get(activity), obj2));
                    this.B = true;
                    this.w = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
        if (this.x == activity) {
            this.z = true;
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
