package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.UUID;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class SystemForegroundService extends Service implements t54 {
    public static final String A = bc4.p("SystemFgService");
    public final cf4 w = new cf4(this);
    public boolean x;
    public fa7 y;
    public NotificationManager z;

    public final void a() {
        this.z = (NotificationManager) getApplicationContext().getSystemService("notification");
        fa7 fa7 = new fa7(getApplicationContext());
        this.y = fa7;
        if (fa7.E != null) {
            bc4.k().h(fa7.F, "A callback already exists.");
        } else {
            fa7.E = this;
        }
    }

    public final void c() {
        cf4 cf4 = this.w;
        cf4.getClass();
        cf4.z(j54.ON_CREATE);
        super.onCreate();
    }

    public final void d() {
        cf4 cf4 = this.w;
        cf4.getClass();
        cf4.z(j54.ON_STOP);
        cf4.z(j54.ON_DESTROY);
        super.onDestroy();
    }

    public final in8 k() {
        return (w54) this.w.x;
    }

    public final IBinder onBind(Intent intent) {
        intent.getClass();
        cf4 cf4 = this.w;
        cf4.getClass();
        cf4.z(j54.ON_START);
        return null;
    }

    public final void onCreate() {
        c();
        a();
    }

    public final void onDestroy() {
        d();
        this.y.e();
    }

    public final void onStart(Intent intent, int i) {
        cf4 cf4 = this.w;
        cf4.getClass();
        cf4.z(j54.ON_START);
        super.onStart(intent, i);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z2 = this.x;
        String str = A;
        if (z2) {
            bc4.k().m(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.y.e();
            a();
            this.x = false;
        }
        if (intent == null) {
            return 3;
        }
        fa7 fa7 = this.y;
        fa7.getClass();
        String str2 = fa7.F;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            bc4 k = bc4.k();
            k.m(str2, "Started foreground service " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            qd8 qd8 = fa7.x;
            qd8.a.execute(new nt2(fa7, false, stringExtra, 15));
            fa7.d(intent);
            return 3;
        } else if ("ACTION_NOTIFY".equals(action)) {
            fa7.d(intent);
            return 3;
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            bc4 k2 = bc4.k();
            k2.m(str2, "Stopping foreground work for " + intent);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            nd8 nd8 = fa7.w;
            UUID fromString = UUID.fromString(stringExtra2);
            nd8.getClass();
            fromString.getClass();
            td0 td0 = nd8.b.m;
            ol6 ol6 = nd8.d.a;
            ol6.getClass();
            g75.E(td0, "CancelWorkById", ol6, new f5(10, nd8, fromString));
            return 3;
        } else if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        } else {
            bc4.k().m(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = fa7.E;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.x = true;
            bc4.k().e(str, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i2);
            return 3;
        }
    }

    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT < 35) {
            this.y.f(i, 2048);
        }
    }

    public final void onTimeout(int i, int i2) {
        this.y.f(i, i2);
    }
}
