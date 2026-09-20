package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: g49  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g49 extends BroadcastReceiver {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ xn6 c;
    public final /* synthetic */ ay4 d;
    public final /* synthetic */ Executor e;

    public g49(AtomicBoolean atomicBoolean, Context context, xn6 xn6, ay4 ay4, Executor executor) {
        this.a = atomicBoolean;
        this.b = context;
        this.c = xn6;
        this.d = ay4;
        this.e = executor;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ho7, com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.lang.Runnable] */
    public final void onReceive(Context context, Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            try {
                this.b.unregisterReceiver(this);
            } catch (IllegalArgumentException e2) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e2);
            }
            xn6 xn6 = this.c;
            ay4 ay4 = this.d;
            Executor executor = this.e;
            ? obj = new Object();
            obj.E = new go7((ho7) obj, (ct) ay4);
            executor.execute(obj);
            xn6.n(obj);
        }
    }
}
