package defpackage;

import android.app.BroadcastOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: ha6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ha6 {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final zt6 a = new zt6(0);
    public final Context b;
    public final o21 c;
    public final ScheduledThreadPoolExecutor d;
    public final Messenger e;
    public Messenger f;
    public gv8 g;

    public ha6(Context context) {
        this.b = context;
        this.c = new o21(context);
        this.e = new Messenger(new cd9(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ar4("fcm-rpc-timeout-executor"));
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public final void a(String str, Bundle bundle) {
        zt6 zt6 = this.a;
        synchronized (zt6) {
            try {
                xb7 xb7 = (xb7) zt6.remove(str);
                if (xb7 == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
                    sb.append("Missing callback for ");
                    sb.append(str);
                    Log.w("Rpc", sb.toString());
                    return;
                }
                xb7.b(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final yb9 b(Bundle bundle) {
        String num;
        synchronized (ha6.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        xb7 xb7 = new xb7();
        zt6 zt6 = this.a;
        synchronized (zt6) {
            zt6.put(num, xb7);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.q() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.b;
        synchronized (ha6.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, x99.a);
                }
                intent.putExtra("app", i);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        intent.putExtra("kid", f21.m(new StringBuilder(String.valueOf(num).length() + 5), "|ID|", num, "|"));
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.e);
        if (!(this.f == null && this.g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.g.w.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            xb7.a.c(gv1.y, new cf4(this, num, this.d.schedule(new bj8(0, xb7), 30, TimeUnit.SECONDS), 28));
            return xb7.a;
        }
        int q = this.c.q();
        Context context2 = this.b;
        if (q != 2) {
            context2.startService(intent);
        } else if (Build.VERSION.SDK_INT < 34) {
            context2.sendBroadcast(intent);
        } else {
            context2.sendBroadcast(intent, (String) null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
        xb7.a.c(gv1.y, new cf4(this, num, this.d.schedule(new bj8(0, xb7), 30, TimeUnit.SECONDS), 28));
        return xb7.a;
    }
}
