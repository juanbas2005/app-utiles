package cu.lestebang.utiletecsa.feature.nauta.service;

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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00048\nX\u0002"}, d2 = {"Lcu/lestebang/utiletecsa/feature/nauta/service/NautaOverlayService;", "Landroid/app/Service;", "<init>", "()V", "", "remaining", "speed", "nauta"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class NautaOverlayService extends Service implements nu2 {
    public static final d37 K = e37.a(Boolean.FALSE);
    public final ig0 A;
    public WindowManager B;
    public vx0 C;
    public ci0 D;
    public vx0 E;
    public ci0 F;
    public int G;
    public final d37 H;
    public final d37 I;
    public final d37 J;
    public volatile yl6 w;
    public final Object x = new Object();
    public boolean y = false;
    public ur4 z;

    public NautaOverlayService() {
        w77 d = b85.d();
        dn1 dn1 = aw1.a;
        this.A = gl0.E(rc9.D0(d, pe4.a.B));
        this.G = 2038;
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
            this.z = (ur4) ((sd1) ((tr4) a())).a.C.get();
        }
        super.onCreate();
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        int i;
        b();
        sg3.p(this, "NautaOverlayChannel", R.string.overlay_channel_name, R.string.overlay_channel_description, 2);
        Notification n = sg3.n(this, "NautaOverlayChannel", R.string.overlay_notification_title, R.string.overlay_notification_content, getApplicationInfo().icon, (PendingIntent) null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            startForeground(202607, n, 1073741824);
        } else {
            startForeground(202607, n);
        }
        or4 or4 = new or4(this, (f61) null, 1);
        ig0 ig0 = this.A;
        ar7.H(ig0, (e81) null, (r81) null, or4, 3);
        ar7.H(ig0, (e81) null, (r81) null, new or4(this, (f61) null, 2), 3);
        ar7.H(ig0, (e81) null, (r81) null, new ju1(this, (f61) null, 24), 3);
        ar7.H(ig0, (e81) null, (r81) null, new o94(this, (f61) null), 3);
        Object systemService = getSystemService("window");
        systemService.getClass();
        WindowManager windowManager = (WindowManager) systemService;
        this.B = windowManager;
        if (i2 >= 26) {
            i = 2038;
        } else {
            i = 2002;
        }
        int i3 = i;
        this.G = i3;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, i3, 40, -3);
        layoutParams.gravity = 8388659;
        layoutParams.x = 24;
        layoutParams.y = 200;
        ci0 ci0 = new ci0(2);
        ci0.y.G((Bundle) null);
        j54 j54 = j54.ON_CREATE;
        w54 w54 = ci0.x;
        w54.f1(j54);
        w54.f1(j54.ON_START);
        w54.f1(j54.ON_RESUME);
        this.D = ci0;
        vx0 vx0 = new vx0(this);
        vx0.setTag(R.id.view_tree_lifecycle_owner, ci0);
        vx0.setTag(R.id.view_tree_saved_state_registry_owner, ci0);
        vx0.setContent(new fw0(-1775686385, new mr4(this, layoutParams, windowManager), true));
        this.C = vx0;
        windowManager.addView(vx0, layoutParams);
        ar7.H(ig0, (e81) null, (r81) null, new or4(this, (f61) null, 0), 3);
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
        vx0 vx0 = this.C;
        if (vx0 != null) {
            try {
                WindowManager windowManager = this.B;
                if (windowManager != null) {
                    windowManager.removeView(vx0);
                }
            } catch (Throwable unused) {
            }
        }
        this.C = null;
        ci0 ci0 = this.D;
        if (ci0 != null) {
            w54 w54 = ci0.x;
            w54.f1(j54.ON_PAUSE);
            w54.f1(j54.ON_STOP);
            w54.f1(j54.ON_DESTROY);
        }
        this.D = null;
        vx0 vx02 = this.E;
        if (vx02 != null) {
            try {
                WindowManager windowManager2 = this.B;
                if (windowManager2 != null) {
                    windowManager2.removeView(vx02);
                }
            } catch (Throwable unused2) {
            }
            this.E = null;
            ci0 ci02 = this.F;
            if (ci02 != null) {
                w54 w542 = ci02.x;
                w542.f1(j54.ON_PAUSE);
                w542.f1(j54.ON_STOP);
                w542.f1(j54.ON_DESTROY);
            }
            this.F = null;
        }
        gl0.J(this.A, (CancellationException) null);
        super.onDestroy();
    }
}
