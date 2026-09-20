package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ba0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ba0 implements ServiceConnection {
    public boolean w = false;
    public final LinkedBlockingQueue x = new LinkedBlockingQueue();

    public final IBinder a() {
        z65.j("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.w) {
            this.w = true;
            IBinder iBinder = (IBinder) this.x.poll(10000, TimeUnit.MILLISECONDS);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        h.s("Cannot call get on this connection more than once");
        return null;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.x.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
