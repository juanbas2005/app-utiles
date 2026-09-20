package defpackage;

import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.DisplayCutout;
import android.widget.EdgeEffect;
import androidx.work.impl.background.systemjob.SystemJobService;

/* renamed from: hn  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class hn {
    public static EdgeEffect a(Context context) {
        try {
            return new EdgeEffect(context, (AttributeSet) null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static Path b(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static float c(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static int d(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.A;
        switch (stopReason) {
            case b85.b:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
            case h75.g:
                return stopReason;
            default:
                return -512;
        }
    }

    public static float e(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static void f(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }
}
