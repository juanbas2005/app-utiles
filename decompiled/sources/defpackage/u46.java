package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.w46;

/* renamed from: u46  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class u46 {
    public static void a(Activity activity, j54 j54) {
        j54.getClass();
        if (activity instanceof t54) {
            in8 k = ((t54) activity).k();
            if (k instanceof w54) {
                ((w54) k).f1(j54);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            w46.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new w46.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new w46(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
