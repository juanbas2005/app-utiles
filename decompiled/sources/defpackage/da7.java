package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import java.lang.ref.WeakReference;

/* renamed from: da7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class da7 implements ComponentCallbacks2 {
    public boolean A = true;
    public final WeakReference w;
    public Context x;
    public ly4 y;
    public boolean z;

    public da7(jx5 jx5) {
        this.w = new WeakReference(jx5);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:12|13|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0031 */
    public final synchronized void a() {
        ly4 ly4;
        try {
            jx5 jx5 = (jx5) this.w.get();
            if (jx5 == null) {
                b();
            } else if (this.y == null) {
                if (jx5.d.b) {
                    Context context = jx5.a;
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                    if (connectivityManager == null || ag8.k(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                        ly4 = new g22(28);
                    } else {
                        ly4 = new cf4(connectivityManager, this);
                        ly4 = new g22(28);
                    }
                } else {
                    ly4 = new g22(28);
                }
                this.y = ly4;
                this.A = ly4.d();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void b() {
        try {
            if (!this.z) {
                this.z = true;
                Context context = this.x;
                if (context != null) {
                    context.unregisterComponentCallbacks(this);
                }
                ly4 ly4 = this.y;
                if (ly4 != null) {
                    ly4.shutdown();
                }
                this.w.clear();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((jx5) this.w.get()) == null) {
            b();
        }
    }

    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    public final synchronized void onTrimMemory(int i) {
        jx5 jx5 = (jx5) this.w.get();
        if (jx5 != null) {
            nx5 nx5 = (nx5) jx5.c.getValue();
            if (nx5 != null) {
                nx5.a.j(i);
                qa qaVar = nx5.b;
                synchronized (qaVar) {
                    if (i >= 10 && i != 20) {
                        qaVar.c();
                    }
                }
            }
        } else {
            b();
        }
    }
}
