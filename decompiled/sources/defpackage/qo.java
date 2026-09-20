package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* renamed from: qo  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class qo {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, wo woVar) {
        Objects.requireNonNull(woVar);
        po poVar = new po(0, woVar);
        v4.q(obj).registerOnBackInvokedCallback(1000000, poVar);
        return poVar;
    }

    public static void c(Object obj, Object obj2) {
        v4.q(obj).unregisterOnBackInvokedCallback(v4.m(obj2));
    }
}
