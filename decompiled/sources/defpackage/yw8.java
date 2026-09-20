package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: yw8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yw8 {
    public static volatile yw8 h;
    public final ExecutorService a;
    public final AppMeasurementSdk b = new AppMeasurementSdk(this);
    public final ArrayList c = new ArrayList();
    public int d;
    public boolean e;
    public volatile cu8 f;
    public volatile long g;

    public yw8(Context context, Bundle bundle) {
        vn1 vn1 = new vn1(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), vn1);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        try {
            if (b35.F(context, jb5.J(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, yw8.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.e = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        c(new tv8(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new zb2(1, this));
        }
    }

    public static yw8 e(Context context, Bundle bundle) {
        Bundle bundle2;
        z65.k(context);
        if (h == null) {
            synchronized (yw8.class) {
                try {
                    if (h == null) {
                        if (bundle == null) {
                            bundle2 = new Bundle();
                        } else {
                            bundle2 = new Bundle(bundle);
                        }
                        h = new yw8(context, bundle2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public final Map a(String str, String str2, boolean z) {
        xt8 xt8 = new xt8();
        c(new aw8(this, str, str2, z, xt8));
        Bundle b2 = xt8.b(5000);
        if (b2 == null || b2.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(b2.size());
        for (String next : b2.keySet()) {
            Object obj = b2.get(next);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    public final int b(String str) {
        xt8 xt8 = new xt8();
        c(new tv8(this, str, xt8));
        Integer num = (Integer) xt8.e(xt8.b(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void c(tw8 tw8) {
        this.a.execute(tw8);
    }

    public final void d(Exception exc, boolean z, boolean z2) {
        this.e |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            c(new kv8(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final List f(String str, String str2) {
        xt8 xt8 = new xt8();
        c(new ov8(this, str, str2, xt8));
        List list = (List) xt8.e(xt8.b(5000), List.class);
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return list;
    }

    public final long g() {
        xt8 xt8 = new xt8();
        c(new zv8(this, xt8, 2));
        Long l = (Long) xt8.e(xt8.b(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = this.d + 1;
        this.d = i;
        return nextLong + ((long) i);
    }
}
