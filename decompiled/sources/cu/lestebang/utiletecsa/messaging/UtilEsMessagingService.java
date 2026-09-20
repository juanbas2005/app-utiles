package cu.lestebang.utiletecsa.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessagingService;
import cu.lestebang.utiletecsa.R;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/messaging/UtilEsMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class UtilEsMessagingService extends FirebaseMessagingService implements nu2 {
    public volatile yl6 D;
    public final Object E = new Object();
    public boolean F = false;
    public s77 G;
    public final ig0 H;

    public UtilEsMessagingService() {
        w77 d = b85.d();
        dn1 dn1 = aw1.a;
        this.H = gl0.E(rc9.D0(d, cm1.y));
    }

    public final Object a() {
        if (this.D == null) {
            synchronized (this.E) {
                try {
                    if (this.D == null) {
                        this.D = new yl6(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.D.a();
    }

    public final void d(d46 d46) {
        String str;
        String str2;
        PendingIntent pendingIntent;
        Bundle bundle = d46.w;
        if (d46.y == null && br4.L(bundle)) {
            d46.y = new yt1(new br4(bundle));
        }
        yt1 yt1 = d46.y;
        if ((yt1 == null || (str = yt1.w) == null) && (str = (String) d46.f().get("title")) == null) {
            str = getString(R.string.app_name);
            str.getClass();
        }
        String str3 = str;
        if (d46.y == null && br4.L(bundle)) {
            d46.y = new yt1(new br4(bundle));
        }
        yt1 yt12 = d46.y;
        if ((yt12 != null && (str2 = yt12.x) != null) || (str2 = (String) d46.f().get("body")) != null) {
            String str4 = str2;
            sg3.p(this, "FcmNotificationChannel", R.string.fcm_channel_name, R.string.fcm_channel_description, 3);
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            if (launchIntentForPackage != null) {
                pendingIntent = PendingIntent.getActivity(this, 0, launchIntentForPackage, 201326592);
            } else {
                pendingIntent = null;
            }
            sg3.W(this, (int) (System.currentTimeMillis() % 2147483647L), sg3.o(this, "FcmNotificationChannel", str3, str4, getApplicationInfo().icon, pendingIntent));
        }
    }

    public final void e(String str) {
        str.getClass();
        hr2 hr2 = yh7.a;
        "New FCM token: ".concat(str);
        hr2.getClass();
        hr2.m(new Object[0]);
        ar7.H(this.H, (e81) null, (r81) null, new zw7(this, str, (f61) null, 7), 3);
    }

    public final void onCreate() {
        if (!this.F) {
            this.F = true;
            this.G = (s77) ((sd1) ((c18) a())).a.W.get();
        }
        super.onCreate();
    }

    public final void onDestroy() {
        super.onDestroy();
        gl0.J(this.H, (CancellationException) null);
    }
}
