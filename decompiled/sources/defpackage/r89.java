package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: r89  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r89 implements ServiceConnection {
    public final SparseArray A;
    public final /* synthetic */ kb9 B;
    public int w = 0;
    public final Messenger x;
    public k68 y;
    public final ArrayDeque z;

    public r89(kb9 kb9) {
        this.B = kb9;
        Handler handler = new Handler(Looper.getMainLooper(), new yx(3, this));
        Looper.getMainLooper();
        this.x = new Messenger(handler);
        this.z = new ArrayDeque();
        this.A = new SparseArray();
    }

    public final synchronized boolean a(ba9 ba9) {
        int i = this.w;
        if (i == 0) {
            this.z.add(ba9);
            if (this.w == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.w = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    q11 b = q11.b();
                    kb9 kb9 = this.B;
                    if (!b.a((Context) kb9.y, intent, this, 1)) {
                        b("Unable to bind to service");
                    } else {
                        ((ScheduledExecutorService) kb9.z).schedule(new u29(this, 0), 30, TimeUnit.SECONDS);
                    }
                } catch (SecurityException e) {
                    c("Unable to bind to service", e);
                }
            } else {
                throw new IllegalStateException();
            }
        } else if (i == 1) {
            this.z.add(ba9);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.z.add(ba9);
            ((ScheduledExecutorService) this.B.z).execute(new u29(this, 1));
            return true;
        }
        return true;
    }

    public final synchronized void b(String str) {
        c(str, (SecurityException) null);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [com.google.android.gms.cloudmessaging.zzt, java.lang.Exception] */
    public final synchronized void c(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.w;
            if (i == 0) {
                throw new IllegalStateException();
            } else if (i == 1 || i == 2) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.w = 4;
                q11.b().c((Context) this.B.y, this);
                ? exc = new Exception(str, securityException);
                ArrayDeque arrayDeque = this.z;
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    ((ba9) it.next()).c(exc);
                }
                arrayDeque.clear();
                int i2 = 0;
                while (true) {
                    SparseArray sparseArray = this.A;
                    if (i2 < sparseArray.size()) {
                        ((ba9) sparseArray.valueAt(i2)).c(exc);
                        i2++;
                    } else {
                        sparseArray.clear();
                        return;
                    }
                }
            } else if (i == 3) {
                this.w = 4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        return;
     */
    public final synchronized void d() {
        try {
            if (this.w == 2 && this.z.isEmpty() && this.A.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.w = 3;
                q11.b().c((Context) this.B.y, this);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.B.z).execute(new nt2(27, (Object) this, (Object) iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.B.z).execute(new u29(this, 2));
    }
}
