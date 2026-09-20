package defpackage;

import android.app.Activity;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.util.Log;
import android.view.View;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.work.impl.foreground.SystemForegroundService;
import defpackage.fp5;

/* renamed from: dn  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class dn {
    public static ContentCaptureSession a(View view) {
        return view.getContentCaptureSession();
    }

    public static String b(Context context) {
        return context.getOpPackageName();
    }

    public static int c(AccessibilityManager accessibilityManager, int i, int i2) {
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }

    public static AutofillId d(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    public static ViewStructure e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    public static void f(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static void g(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    public static void h(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    public static void i(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static Insets j(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void k(Resources.Theme theme) {
        theme.rebase();
    }

    public static final void l(Activity activity, fp5.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }

    public static void m(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void n(Notification.Builder builder) {
        builder.setBubbleMetadata((Notification.BubbleMetadata) null);
    }

    public static void o(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void p(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    public static void q(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            bc4 k = bc4.k();
            String str = SystemForegroundService.A;
            if (k.x <= 5) {
                Log.w(str, "Unable to start foreground service", e);
            }
        } catch (SecurityException e2) {
            bc4 k2 = bc4.k();
            String str2 = SystemForegroundService.A;
            if (k2.x <= 5) {
                Log.w(str2, "Unable to start foreground service", e2);
            }
        }
    }
}
