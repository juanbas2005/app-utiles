package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* renamed from: fp5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fp5 extends r32 {
    final /* synthetic */ gp5 this$0;

    /* renamed from: fp5$a */
    /* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
    public static final class a extends r32 {
        final /* synthetic */ gp5 this$0;

        public a(gp5 gp5) {
            this.this$0 = gp5;
        }

        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            gp5 gp5 = this.this$0;
            int i = gp5.w + 1;
            gp5.w = i;
            if (i == 1 && gp5.z) {
                gp5.B.f1(j54.ON_START);
                gp5.z = false;
            }
        }
    }

    public fp5(gp5 gp5) {
        this.this$0 = gp5;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = w46.x;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((w46) findFragmentByTag).w = this.this$0.D;
        }
    }

    public void onActivityPaused(Activity activity) {
        activity.getClass();
        gp5 gp5 = this.this$0;
        int i = gp5.x - 1;
        gp5.x = i;
        if (i == 0) {
            Handler handler = gp5.A;
            handler.getClass();
            handler.postDelayed(gp5.C, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        dn.l(activity, new a(this.this$0));
    }

    public void onActivityStopped(Activity activity) {
        activity.getClass();
        gp5 gp5 = this.this$0;
        int i = gp5.w - 1;
        gp5.w = i;
        if (i == 0 && gp5.y) {
            gp5.B.f1(j54.ON_STOP);
            gp5.z = true;
        }
    }
}
