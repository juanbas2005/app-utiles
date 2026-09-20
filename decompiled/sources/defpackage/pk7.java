package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: pk7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pk7 {
    public final Context a;
    public final gk4 b;
    public final cf4 c;
    public final js d = new zt6(0);
    public final ScheduledThreadPoolExecutor e;
    public boolean f = false;
    public final nk7 g;

    /* JADX WARNING: type inference failed for: r0v0, types: [js, zt6] */
    public pk7(gk4 gk4, nk7 nk7, cf4 cf4, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = gk4;
        this.g = nk7;
        this.c = cf4;
        this.a = context;
        this.e = scheduledThreadPoolExecutor;
    }

    public final synchronized void a(boolean z) {
        this.f = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r3 = r12.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r8 = r0.b;
        r9 = r0.a;
        r10 = r8.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r10 == 83) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r10 == 85) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        if (r8.equals("U") == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        r5 = (defpackage.ve2) ((defpackage.we2) r3.x);
        r7 = ((defpackage.x00) defpackage.cf4.c(r5.d())).a;
        ((com.google.firebase.messaging.FirebaseMessaging) r3.z).a();
        r3.y(r9, r7, (java.lang.String) defpackage.cf4.c(r5.c()), "unsubscribe");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
        if (android.util.Log.isLoggable("FirebaseMessaging", 3) == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
        android.util.Log.d("FirebaseMessaging", "Unsubscribe from topic: " + r9 + " succeeded.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
        if (r8.equals("S") == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0095, code lost:
        r6 = (defpackage.ve2) ((defpackage.we2) r3.x);
        r7 = ((defpackage.x00) defpackage.cf4.c(r6.d())).a;
        ((com.google.firebase.messaging.FirebaseMessaging) r3.z).a();
        r3.y(r9, r7, (java.lang.String) defpackage.cf4.c(r6.c()), "subscribe");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c3, code lost:
        if (android.util.Log.isLoggable("FirebaseMessaging", 3) == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c5, code lost:
        android.util.Log.d("FirebaseMessaging", "Subscribe to topic: " + r9 + " succeeded.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00de, code lost:
        if (android.util.Log.isLoggable("FirebaseMessaging", 3) == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e0, code lost:
        android.util.Log.d("FirebaseMessaging", "Unknown topic operation" + r0 + ".");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f4, code lost:
        r1 = r12.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f6, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r2 = r1.a;
        r3 = r0.c;
        r4 = (java.util.ArrayDeque) r2.A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ff, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0108, code lost:
        if (((java.util.ArrayDeque) r2.A).remove(r3) == false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010a, code lost:
        ((java.util.concurrent.ScheduledThreadPoolExecutor) r2.B).execute(new defpackage.y0(22, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0118, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0119, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011a, code lost:
        r2 = r12.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011c, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r0 = r0.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0125, code lost:
        if (r12.d.containsKey(r0) != false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0127, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012a, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012c, code lost:
        r1 = (java.util.ArrayDeque) r12.d.get(r0);
        r3 = (defpackage.xb7) r1.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013a, code lost:
        if (r3 == null) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013c, code lost:
        r3.b((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0144, code lost:
        if (r1.isEmpty() == false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0146, code lost:
        r12.d.remove(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014b, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014f, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0160, code lost:
        if ("SERVICE_NOT_AVAILABLE".equals(r12.getMessage()) != false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0173, code lost:
        if (r12.getMessage() == null) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0175, code lost:
        android.util.Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x017b, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x017c, code lost:
        android.util.Log.e("FirebaseMessaging", "Topic operation failed: " + r12.getMessage() + ". Will retry Topic operation.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return false;
     */
    public final boolean b() {
        while (true) {
            synchronized (this) {
                try {
                    mk7 a2 = this.g.a();
                    if (a2 == null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "topic sync succeeded");
                        }
                        return true;
                    }
                } finally {
                    while (true) {
                    }
                }
            }
        }
        while (true) {
        }
    }

    public final void c(long j) {
        this.e.schedule(new rk7(this, this.a, this.b, Math.min(Math.max(30, 2 * j), 28800)), j, TimeUnit.SECONDS);
        a(true);
    }
}
