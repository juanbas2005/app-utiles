package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: ok7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ok7 implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ScheduledThreadPoolExecutor b;
    public final /* synthetic */ gk4 c;
    public final /* synthetic */ oe2 d;
    public final /* synthetic */ FirebaseMessaging e;
    public final /* synthetic */ we2 f;

    public /* synthetic */ ok7(Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, gk4 gk4, oe2 oe2, FirebaseMessaging firebaseMessaging, we2 we2) {
        this.a = context;
        this.b = scheduledThreadPoolExecutor;
        this.c = gk4;
        this.d = oe2;
        this.e = firebaseMessaging;
        this.f = we2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.Object, nk7] */
    public final Object call() {
        nk7 nk7;
        Context context = this.a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.b;
        gk4 gk4 = this.c;
        oe2 oe2 = this.d;
        FirebaseMessaging firebaseMessaging = this.e;
        we2 we2 = this.f;
        synchronized (nk7.class) {
            try {
                WeakReference weakReference = nk7.b;
                if (weakReference != null) {
                    nk7 = (nk7) weakReference.get();
                } else {
                    nk7 = null;
                }
                if (nk7 == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                    ? obj = new Object();
                    synchronized (obj) {
                        obj.a = o9.s(sharedPreferences, scheduledThreadPoolExecutor);
                    }
                    nk7.b = new WeakReference(obj);
                    nk7 = obj;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return new pk7(gk4, nk7, new cf4(oe2, firebaseMessaging, we2), context, scheduledThreadPoolExecutor);
    }
}
