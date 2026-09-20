package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;

/* renamed from: ou5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ou5 implements Runnable {
    public final /* synthetic */ Context w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ xb7 y;

    public /* synthetic */ ou5(Context context, boolean z, xb7 xb7) {
        this.w = context;
        this.x = z;
        this.y = xb7;
    }

    public final void run() {
        boolean z;
        Context context = this.w;
        xb7 xb7 = this.y;
        try {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            SharedPreferences.Editor edit = c35.h(context).edit();
            edit.putBoolean("proxy_notification_initialized", true);
            edit.apply();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (this.x) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate((String) null);
            }
            xb7.d((Object) null);
        } finally {
            xb7.d((Object) null);
        }
    }
}
