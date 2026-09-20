package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: gn7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class gn7 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ hn7 x;

    public /* synthetic */ gn7(hn7 hn7, int i) {
        this.w = i;
        this.x = hn7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.lang.Object, l01] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void run() {
        l01 l01;
        String str;
        int i = this.w;
        hn7 hn7 = this.x;
        switch (i) {
            case b85.b:
                bw5 bw5 = hn7.H;
                boolean z = hn7.M;
                bw5.d.a(z);
                bw5.e.a(z);
                return;
            default:
                oe2 oe2 = hn7.z;
                oe2.a();
                Context context = oe2.a;
                hn7.F = context;
                hn7.K = context.getPackageName();
                hn7.G = b01.e();
                hn7.H = new bw5(hn7.F, new zv5(100, 1, TimeUnit.MINUTES));
                hn7.I = wq.a();
                nu5 nu5 = hn7.C;
                b01 b01 = hn7.G;
                b01.getClass();
                l01 l012 = l01.G;
                synchronized (l01.class) {
                    try {
                        if (l01.G == null) {
                            l01.G = new Object();
                        }
                        l01 = l01.G;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
                l01.getClass();
                Long l = (Long) b01.a.getRemoteConfigValueOrDefault("fpr_log_source", -1L);
                l.getClass();
                Map map = l01.H;
                if (!map.containsKey(l) || (str = (String) map.get(l)) == null) {
                    n75 d = b01.d(l01);
                    if (d.b()) {
                        str = d.a();
                    } else {
                        str = "FIREPERF";
                    }
                } else {
                    b01.c.f("com.google.firebase.perf.LogSourceName", str);
                }
                hn7.D = new dh2(nu5, str);
                ConcurrentLinkedQueue concurrentLinkedQueue = hn7.x;
                wq wqVar = hn7.I;
                WeakReference weakReference = new WeakReference(hn7.O);
                synchronized (wqVar.B) {
                    try {
                        wqVar.B.add(weakReference);
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                            break;
                        }
                    }
                }
                fr D = ir.D();
                hn7.J = D;
                oe2 oe22 = hn7.z;
                oe22.a();
                String str2 = oe22.c.b;
                D.h();
                ir.s((ir) D.x, str2);
                id y = kd.y();
                String str3 = hn7.K;
                y.h();
                kd.s((kd) y.x, str3);
                y.h();
                kd.t((kd) y.x);
                Context context2 = hn7.F;
                String str4 = "";
                try {
                    String str5 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (str5 != null) {
                        str4 = str5;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                y.h();
                kd.u((kd) y.x, str4);
                D.h();
                ir.w((ir) D.x, (kd) y.g());
                hn7.y.set(true);
                while (!concurrentLinkedQueue.isEmpty()) {
                    kf5 kf5 = (kf5) concurrentLinkedQueue.poll();
                    if (kf5 != null) {
                        hn7.E.execute(new e66(3, hn7, kf5));
                    }
                }
                return;
        }
    }
}
