package defpackage;

import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: u29  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class u29 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ r89 x;

    public /* synthetic */ u29(r89 r89, int i) {
        this.w = i;
        this.x = r89;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        android.util.Log.d("MessengerIpcClient", "Sending ".concat(java.lang.String.valueOf(r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r2 = r0.B;
        r4 = r0.x;
        r5 = r1.c;
        r6 = android.os.Message.obtain();
        r6.what = r5;
        r6.arg1 = r3;
        r6.replyTo = r4;
        r3 = new android.os.Bundle();
        r3.putBoolean("oneWay", r1.a());
        r3.putString("pkg", ((android.content.Context) r2.y).getPackageName());
        r3.putBundle("data", r1.d);
        r6.setData(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r1 = r0.y;
        r2 = (android.os.Messenger) r1.x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009c, code lost:
        if (r2 == null) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
        r2.send(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a3, code lost:
        r1 = (defpackage.gv8) r1.y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a7, code lost:
        if (r1 == null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a9, code lost:
        r1.w.send(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b7, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b9, code lost:
        r0.b(r1.getMessage());
     */
    public final void run() {
        switch (this.w) {
            case b85.b:
                r89 r89 = this.x;
                synchronized (r89) {
                    if (r89.w == 1) {
                        r89.b("Timed out while binding");
                    }
                }
                return;
            case 1:
                break;
            default:
                this.x.b("Service disconnected");
                return;
        }
        while (true) {
            r89 r892 = this.x;
            synchronized (r892) {
                try {
                    if (r892.w == 2) {
                        ArrayDeque arrayDeque = r892.z;
                        if (arrayDeque.isEmpty()) {
                            r892.d();
                            return;
                        }
                        ba9 ba9 = (ba9) arrayDeque.poll();
                        SparseArray sparseArray = r892.A;
                        int i = ba9.a;
                        sparseArray.put(i, ba9);
                        ((ScheduledExecutorService) r892.B.z).schedule(new c49(r892, false, ba9, 7), 30, TimeUnit.SECONDS);
                    } else {
                        return;
                    }
                } finally {
                    while (true) {
                    }
                }
            }
        }
    }
}
