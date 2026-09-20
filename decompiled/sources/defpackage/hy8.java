package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: hy8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class hy8 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Parcelable y;
    public final /* synthetic */ Object z;

    public hy8(r69 r69, z99 z99, boolean z2, xn8 xn8) {
        this.w = 3;
        this.y = z99;
        this.x = z2;
        this.z = xn8;
        Objects.requireNonNull(r69);
        this.A = r69;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.util.concurrent.ExecutorService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: z89} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: zr8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: xn8} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.concurrent.Executor] */
    /* JADX WARNING: type inference failed for: r2v9, types: [a3] */
    /* JADX WARNING: type inference failed for: r2v12, types: [a3] */
    /* JADX WARNING: type inference failed for: r2v15, types: [a3] */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void run() {
        Intent intent;
        int i;
        xn8 xn8 = 0;
        switch (this.w) {
            case b85.b:
                Intent intent2 = (Intent) this.y;
                Context context = (Context) this.z;
                boolean z2 = this.x;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.A;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    if (parcelableExtra instanceof Intent) {
                        intent = (Intent) parcelableExtra;
                    } else {
                        intent = null;
                    }
                    if (intent != null) {
                        i = FirebaseInstanceIdReceiver.a(intent);
                    } else {
                        int i2 = 500;
                        if (intent2.getExtras() != null) {
                            ns0 ns0 = new ns0(intent2);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                SoftReference softReference = FirebaseInstanceIdReceiver.b;
                                if (softReference != null) {
                                    xn8 = (Executor) softReference.get();
                                }
                                if (xn8 == 0) {
                                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ar4("pscm-ack-executor"));
                                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                                    ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                    FirebaseInstanceIdReceiver.b = new SoftReference(unconfigurableExecutorService);
                                    xn8 = unconfigurableExecutorService;
                                }
                            }
                            xn8.execute(new z46(context, ns0, false, countDownLatch, 3));
                            try {
                                i2 = ((Integer) b35.b(new qc3(context, 2).J(intent2))).intValue();
                            } catch (InterruptedException | ExecutionException e) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e);
                            }
                            try {
                                if (!countDownLatch.await(1000, TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e2) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e2.toString()));
                            }
                        }
                        i = i2;
                    }
                    if (z2 && pendingResult != null) {
                        pendingResult.setResultCode(i);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th;
                }
            case 1:
                r69 r69 = (r69) this.A;
                iy8 iy8 = r69.z;
                if (iy8 == null) {
                    pz8 pz8 = ((y19) r69.w).B;
                    y19.g(pz8);
                    pz8.B.a("Discarding data. Failed to set user property");
                    return;
                }
                z99 z99 = (z99) this.y;
                if (!this.x) {
                    xn8 = (z89) this.z;
                }
                r69.u1(iy8, xn8, z99);
                r69.p1();
                return;
            case 2:
                r69 r692 = (r69) this.A;
                iy8 iy82 = r692.z;
                if (iy82 == null) {
                    pz8 pz82 = ((y19) r692.w).B;
                    y19.g(pz82);
                    pz82.B.a("Discarding data. Failed to send event to service");
                    return;
                }
                z99 z992 = (z99) this.y;
                if (!this.x) {
                    xn8 = (zr8) this.z;
                }
                r692.u1(iy82, xn8, z992);
                r692.p1();
                return;
            default:
                r69 r693 = (r69) this.A;
                iy8 iy83 = r693.z;
                if (iy83 == null) {
                    pz8 pz83 = ((y19) r693.w).B;
                    y19.g(pz83);
                    pz83.B.a("Discarding data. Failed to send conditional user property to service");
                    return;
                }
                z99 z993 = (z99) this.y;
                if (!this.x) {
                    xn8 = (xn8) this.z;
                }
                r693.u1(iy83, xn8, z993);
                r693.p1();
                return;
        }
    }

    public /* synthetic */ hy8(r69 r69, z99 z99, boolean z2, a3 a3Var, int i) {
        this.w = i;
        this.y = z99;
        this.x = z2;
        this.z = a3Var;
        this.A = r69;
    }

    public /* synthetic */ hy8(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z2, BroadcastReceiver.PendingResult pendingResult) {
        this.w = 0;
        this.y = intent;
        this.z = context;
        this.x = z2;
        this.A = pendingResult;
    }
}
