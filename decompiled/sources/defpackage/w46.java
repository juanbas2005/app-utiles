package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lw46;", "Landroid/app/Fragment;", "<init>", "()V", "wv2", "a", "u46", "lifecycle-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: w46  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class w46 extends Fragment {
    public static final /* synthetic */ int x = 0;
    public wv2 w;

    /* renamed from: w46$a */
    /* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final v46 Companion = new Object();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            activity.getClass();
            activity.registerActivityLifecycleCallbacks(new a());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            activity.getClass();
        }

        public void onActivityDestroyed(Activity activity) {
            activity.getClass();
        }

        public void onActivityPaused(Activity activity) {
            activity.getClass();
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            activity.getClass();
            int i = w46.x;
            u46.a(activity, j54.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            int i = w46.x;
            u46.a(activity, j54.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            int i = w46.x;
            u46.a(activity, j54.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            activity.getClass();
            int i = w46.x;
            u46.a(activity, j54.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            activity.getClass();
            int i = w46.x;
            u46.a(activity, j54.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            activity.getClass();
            int i = w46.x;
            u46.a(activity, j54.ON_STOP);
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

    public final void a(j54 j54) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            activity.getClass();
            u46.a(activity, j54);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(j54.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        a(j54.ON_DESTROY);
        this.w = null;
    }

    public final void onPause() {
        super.onPause();
        a(j54.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        wv2 wv2 = this.w;
        if (wv2 != null) {
            ((gp5) wv2.x).a();
        }
        a(j54.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        wv2 wv2 = this.w;
        if (wv2 != null) {
            gp5 gp5 = (gp5) wv2.x;
            int i = gp5.w + 1;
            gp5.w = i;
            if (i == 1 && gp5.z) {
                gp5.B.f1(j54.ON_START);
                gp5.z = false;
            }
        }
        a(j54.ON_START);
    }

    public final void onStop() {
        super.onStop();
        a(j54.ON_STOP);
    }
}
