package cu.lestebang.utiletecsa.feature.settings.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.WindowManager;
import cu.lestebang.utiletecsa.R;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00058\nX\u0002²\u0006\f\u0010\b\u001a\u00020\u00058\nX\u0002"}, d2 = {"Lcu/lestebang/utiletecsa/feature/settings/service/SpeedOverlayService;", "Landroid/app/Service;", "<init>", "()V", "i95", "", "download", "upload", "total", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class SpeedOverlayService extends Service implements nu2 {
    public static final d37 K = e37.a(Boolean.FALSE);
    public WindowManager A;
    public vx0 B;
    public ci0 C;
    public vx0 D;
    public ci0 E;
    public int F;
    public final d37 G;
    public final d37 H;
    public final d37 I;
    public final d37 J;
    public volatile yl6 w;
    public final Object x = new Object();
    public boolean y = false;
    public final ig0 z;

    public SpeedOverlayService() {
        w77 d = b85.d();
        dn1 dn1 = aw1.a;
        this.z = gl0.E(rc9.D0(d, pe4.a.B));
        this.F = 2038;
        this.G = e37.a(0L);
        this.H = e37.a(0L);
        this.I = e37.a(0L);
        this.J = e37.a(Boolean.FALSE);
    }

    public final Object a() {
        if (this.w == null) {
            synchronized (this.x) {
                try {
                    if (this.w == null) {
                        this.w = new yl6(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.w.a();
    }

    public final void b() {
        if (!this.y) {
            this.y = true;
            ((xz6) a()).getClass();
        }
        super.onCreate();
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        int i;
        b();
        sg3.p(this, "SpeedOverlayChannel", R.string.speed_overlay_channel_name, R.string.speed_overlay_channel_description, 2);
        Notification n = sg3.n(this, "SpeedOverlayChannel", R.string.speed_overlay_notification_title, R.string.speed_overlay_notification_content, getApplicationInfo().icon, (PendingIntent) null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            startForeground(202608, n, 1073741824);
        } else {
            startForeground(202608, n);
        }
        tz6 tz6 = new tz6(this, (f61) null);
        ig0 ig0 = this.z;
        ar7.H(ig0, (e81) null, (r81) null, tz6, 3);
        Object systemService = getSystemService("window");
        systemService.getClass();
        WindowManager windowManager = (WindowManager) systemService;
        this.A = windowManager;
        if (i2 >= 26) {
            i = 2038;
        } else {
            i = 2002;
        }
        int i3 = i;
        this.F = i3;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, i3, 40, -3);
        layoutParams.gravity = 8388659;
        layoutParams.x = 24;
        layoutParams.y = 200;
        ci0 ci0 = new ci0(1);
        ci0.y.G((Bundle) null);
        j54 j54 = j54.ON_CREATE;
        w54 w54 = ci0.x;
        w54.f1(j54);
        w54.f1(j54.ON_START);
        w54.f1(j54.ON_RESUME);
        this.C = ci0;
        vx0 vx0 = new vx0(this);
        vx0.setTag(R.id.view_tree_lifecycle_owner, ci0);
        vx0.setTag(R.id.view_tree_saved_state_registry_owner, ci0);
        vx0.setContent(new fw0(-1174000757, new sz6(this, layoutParams, windowManager), true));
        this.B = vx0;
        windowManager.addView(vx0, layoutParams);
        ar7.H(ig0, (e81) null, (r81) null, new gw6(this, (f61) null, 2), 3);
        Boolean bool = Boolean.TRUE;
        d37 d37 = K;
        d37.getClass();
        d37.l((Object) null, bool);
    }

    public final void onDestroy() {
        Boolean bool = Boolean.FALSE;
        d37 d37 = K;
        d37.getClass();
        d37.l((Object) null, bool);
        vx0 vx0 = this.B;
        if (vx0 != null) {
            try {
                WindowManager windowManager = this.A;
                if (windowManager != null) {
                    windowManager.removeView(vx0);
                }
            } catch (Throwable unused) {
            }
        }
        this.B = null;
        ci0 ci0 = this.C;
        if (ci0 != null) {
            w54 w54 = ci0.x;
            w54.f1(j54.ON_PAUSE);
            w54.f1(j54.ON_STOP);
            w54.f1(j54.ON_DESTROY);
        }
        this.C = null;
        vx0 vx02 = this.D;
        if (vx02 != null) {
            try {
                WindowManager windowManager2 = this.A;
                if (windowManager2 != null) {
                    windowManager2.removeView(vx02);
                }
            } catch (Throwable unused2) {
            }
            this.D = null;
            ci0 ci02 = this.E;
            if (ci02 != null) {
                w54 w542 = ci02.x;
                w542.f1(j54.ON_PAUSE);
                w542.f1(j54.ON_STOP);
                w542.f1(j54.ON_DESTROY);
            }
            this.E = null;
        }
        gl0.J(this.z, (CancellationException) null);
        super.onDestroy();
    }
}
