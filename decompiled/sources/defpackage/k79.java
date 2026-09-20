package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.internal.zzaf;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: k79  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k79 implements ServiceConnection {
    public final h69 A;
    public ComponentName B;
    public final /* synthetic */ g99 C;
    public final HashMap w = new HashMap();
    public int x = 2;
    public boolean y;
    public IBinder z;

    public k79(g99 g99, h69 h69) {
        this.C = g99;
        this.A = h69;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x005d */
    public final m11 a(String str, Executor executor) {
        try {
            Intent a = yn8.a(this.C.b, this.A);
            this.x = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(bt8.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                g99 g99 = this.C;
                q11 q11 = g99.d;
                Context context = g99.b;
                h69 h69 = this.A;
                boolean d = q11.d(context, str, a, this, 4225, executor);
                this.y = d;
                if (d) {
                    g99.c.sendMessageDelayed(g99.c.obtainMessage(1, h69), g99.f);
                    m11 m11 = m11.B;
                    StrictMode.setVmPolicy(vmPolicy);
                    return m11;
                }
                this.x = 2;
                g99.d.c(g99.b, this);
                m11 m112 = new m11(16, (PendingIntent) null, (String) null);
                StrictMode.setVmPolicy(vmPolicy);
                return m112;
            } catch (Throwable th) {
                Throwable th2 = th;
                StrictMode.setVmPolicy(vmPolicy);
                throw th2;
            }
        } catch (zzaf e) {
            return e.w;
        }
    }

    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        g99 g99 = this.C;
        synchronized (g99.a) {
            try {
                g99.c.removeMessages(1, this.A);
                this.z = iBinder;
                this.B = componentName;
                for (ServiceConnection onServiceConnected : this.w.values()) {
                    onServiceConnected.onServiceConnected(componentName, iBinder);
                }
                this.x = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        g99 g99 = this.C;
        synchronized (g99.a) {
            try {
                g99.c.removeMessages(1, this.A);
                this.z = null;
                this.B = componentName;
                for (ServiceConnection onServiceDisconnected : this.w.values()) {
                    onServiceDisconnected.onServiceDisconnected(componentName);
                }
                this.x = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
