package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: w97  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w97 implements Runnable {
    public final /* synthetic */ int w = 0;
    public final long x;
    public final Object y;
    public final Object z;

    public w97(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ar4("firebase-iid-executor"));
        this.z = firebaseMessaging;
        this.x = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.y = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.z).b.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public boolean b() {
        try {
            if (((FirebaseMessaging) this.z).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            } else {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
        } catch (IOException e) {
            String message = e.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    public final void run() {
        switch (this.w) {
            case b85.b:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.y;
                am6 H = am6.H();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.z;
                if (H.K(firebaseMessaging.b)) {
                    wakeLock.acquire();
                }
                try {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.k = true;
                    }
                    if (!firebaseMessaging.i.f()) {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.k = false;
                        }
                        if (!am6.H().K(firebaseMessaging.b)) {
                            return;
                        }
                        wakeLock.release();
                        return;
                    } else if (!am6.H().J(firebaseMessaging.b) || a()) {
                        if (b()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.k = false;
                            }
                        } else {
                            firebaseMessaging.g(this.x);
                        }
                        if (!am6.H().K(firebaseMessaging.b)) {
                            return;
                        }
                        wakeLock.release();
                        return;
                    } else {
                        v97 v97 = new v97();
                        v97.c = this;
                        v97.a();
                        if (!am6.H().K(firebaseMessaging.b)) {
                            return;
                        }
                        wakeLock.release();
                        return;
                    }
                } catch (IOException e) {
                    try {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.k = false;
                            if (!am6.H().K(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        if (am6.H().K(firebaseMessaging.b)) {
                            wakeLock.release();
                        }
                        throw th;
                    }
                }
                break;
            case 1:
                l59 l59 = (l59) this.z;
                l59.l1((f59) this.y, false, this.x);
                l59.A = null;
                r69 j = ((y19) l59.w).j();
                j.b1();
                j.d1();
                j.q1(new c49(j, (f59) null));
                return;
            default:
                ((m89) this.y).run();
                long j2 = this.x;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                jm4 jm4 = (jm4) this.z;
                jm4.getClass();
                ho7 ho7 = new ho7(Executors.callable(this, (Object) null));
                hm4 hm4 = new hm4(ho7, jm4.x.schedule(ho7, j2, timeUnit));
                hm4.a(new m89(2, (Object) hm4), fv1.w);
                return;
        }
    }

    public w97(o99 o99, m89 m89, jm4 jm4, long j) {
        this.y = m89;
        this.z = jm4;
        this.x = j;
    }

    public w97(l59 l59, f59 f59, long j) {
        this.y = f59;
        this.x = j;
        Objects.requireNonNull(l59);
        this.z = l59;
    }
}
