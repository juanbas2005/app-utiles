package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ll2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ll2 implements v22 {
    public final Context a;
    public final kl2 b;
    public final xb4 c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public sg3 h;

    public ll2(Context context, kl2 kl2) {
        k75.i("Context cannot be null", context);
        this.a = context.getApplicationContext();
        this.b = kl2;
        this.c = ml2.d;
    }

    /* JADX INFO: finally extract failed */
    public final void a(sg3 sg3) {
        synchronized (this.d) {
            try {
                this.h = sg3;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        synchronized (this.d) {
            try {
                if (this.h != null) {
                    if (this.f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new cz0("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.g = threadPoolExecutor;
                        this.f = threadPoolExecutor;
                    }
                    this.f.execute(new y0(14, this));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks((Runnable) null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final dm2 c() {
        try {
            xb4 xb4 = this.c;
            Context context = this.a;
            kl2 kl2 = this.b;
            xb4.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{kl2}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            cm2 a2 = jl2.a(context, Collections.unmodifiableList(arrayList));
            int i = a2.a;
            if (i == 0) {
                dm2[] dm2Arr = (dm2[]) a2.b.get(0);
                if (dm2Arr != null && dm2Arr.length != 0) {
                    return dm2Arr[0];
                }
                rf2.r("fetchFonts failed (empty result)");
                return null;
            }
            rf2.r(pb4.i(i, "fetchFonts failed (", ")"));
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            ku4.o("provider not found", e2);
            return null;
        }
    }
}
