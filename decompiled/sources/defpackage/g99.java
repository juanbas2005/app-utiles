package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: g99  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g99 {
    public static final Object g = new Object();
    public static g99 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile ph8 c;
    public final q11 d;
    public final long e;
    public final long f;

    /* JADX WARNING: type inference failed for: r3v2, types: [ph8, android.os.Handler] */
    public g99(Context context, Looper looper) {
        yx yxVar = new yx(4, this);
        this.b = context.getApplicationContext();
        ? handler = new Handler(looper, yxVar);
        Looper.getMainLooper();
        this.c = handler;
        this.d = q11.b();
        this.e = 5000;
        this.f = 300000;
    }

    public static g99 a(Context context) {
        synchronized (g) {
            try {
                if (h == null) {
                    h = new g99(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        return r5;
     */
    public final m11 b(h69 h69, cw8 cw8, String str, Executor executor) {
        m11 m11;
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            try {
                k79 k79 = (k79) hashMap.get(h69);
                if (executor == null) {
                    executor = null;
                }
                if (k79 == null) {
                    k79 = new k79(this, h69);
                    k79.w.put(cw8, cw8);
                    m11 = k79.a(str, executor);
                    hashMap.put(h69, k79);
                } else {
                    this.c.removeMessages(0, h69);
                    if (!k79.w.containsKey(cw8)) {
                        k79.w.put(cw8, cw8);
                        int i2 = k79.x;
                        if (i2 == 1) {
                            cw8.onServiceConnected(k79.B, k79.z);
                        } else if (i2 == 2) {
                            m11 = k79.a(str, executor);
                        }
                        m11 = null;
                    } else {
                        String h692 = h69.toString();
                        StringBuilder sb = new StringBuilder(h692.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(h692);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                if (k79.y) {
                    m11 m112 = m11.B;
                    return m112;
                } else if (m11 == null) {
                    m11 = new m11(-1, (PendingIntent) null, (String) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, ServiceConnection serviceConnection, boolean z) {
        h69 h69 = new h69(str, z);
        z65.l("ServiceConnection must not be null", serviceConnection);
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            try {
                k79 k79 = (k79) hashMap.get(h69);
                if (k79 == null) {
                    String h692 = h69.toString();
                    StringBuilder sb = new StringBuilder(h692.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(h692);
                    throw new IllegalStateException(sb.toString());
                } else if (k79.w.containsKey(serviceConnection)) {
                    k79.w.remove(serviceConnection);
                    if (k79.w.isEmpty()) {
                        this.c.sendMessageDelayed(this.c.obtainMessage(0, h69), this.e);
                    }
                } else {
                    String h693 = h69.toString();
                    StringBuilder sb2 = new StringBuilder(h693.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(h693);
                    throw new IllegalStateException(sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
