package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Objects;

/* renamed from: zb2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zb2 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int w;
    public final Object x;

    public zb2() {
        this.w = 0;
        this.x = new ArrayDeque(10);
    }

    public void a(Intent intent) {
        boolean z;
        ArrayDeque arrayDeque = (ArrayDeque) this.x;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (!arrayDeque.contains(string)) {
                        arrayDeque.add(string);
                    } else {
                        return;
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (bundle == null) {
            z = false;
        } else {
            z = "1".equals(bundle.getString("google.c.a.e"));
        }
        if (z) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    ac acVar = (ac) oe2.c().b(ac.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (acVar != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        bc bcVar = (bc) acVar;
                        if (at8.a("fcm") && at8.c("fcm", "_ln")) {
                            yw8 yw8 = bcVar.a.a;
                            yw8.c(new kv8(yw8, string2, 0));
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string2);
                        bcVar.a("fcm", "_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            sg3.H("_no", bundle);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a A[Catch:{ RuntimeException -> 0x002c, all -> 0x0028 }] */
    public void j(jv8 jv8, Bundle bundle) {
        y19 y19;
        Uri uri;
        String str;
        boolean z;
        v49 v49 = (v49) this.x;
        try {
            y19 y192 = (y19) v49.w;
            pz8 pz8 = y192.B;
            y19.g(pz8);
            pz8.J.a("onActivityCreated");
            Intent intent = jv8.y;
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (!data.isHierarchical()) {
                    }
                    uri = data;
                    if (uri != null) {
                        if (uri.isHierarchical()) {
                            y19.e(y192.E);
                            if (d99.e2(intent)) {
                                str = "gs";
                            } else {
                                str = "auto";
                            }
                            String str2 = str;
                            String queryParameter = uri.getQueryParameter("referrer");
                            if (bundle == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean z2 = z;
                            r19 r19 = y192.C;
                            y19.g(r19);
                            r19.l1(new w39(this, z2, uri, str2, queryParameter));
                            y19 = (y19) v49.w;
                            l59 l59 = y19.H;
                            y19.f(l59);
                            l59.j1(jv8, bundle);
                        }
                    }
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string)) {
                        data = Uri.parse(string);
                        uri = data;
                        if (uri != null) {
                        }
                    }
                }
                uri = null;
                if (uri != null) {
                }
            }
            y19 = (y19) v49.w;
        } catch (RuntimeException e) {
            RuntimeException runtimeException = e;
            pz8 pz82 = ((y19) v49.w).B;
            y19.g(pz82);
            pz82.B.b("Throwable caught in onActivityCreated", runtimeException);
        } catch (Throwable th) {
            Throwable th2 = th;
            l59 l592 = ((y19) v49.w).H;
            y19.f(l592);
            l592.j1(jv8, bundle);
            throw th2;
        }
        l59 l593 = y19.H;
        y19.f(l593);
        l593.j1(jv8, bundle);
    }

    public void k(jv8 jv8) {
        l59 l59 = ((y19) ((v49) this.x).w).H;
        y19.f(l59);
        synchronized (l59.H) {
            try {
                if (Objects.equals(l59.C, jv8)) {
                    l59.C = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (((y19) l59.w).z.r1()) {
            l59.B.remove(Integer.valueOf(jv8.w));
        }
    }

    public void l(jv8 jv8) {
        y19 y19 = (y19) ((v49) this.x).w;
        l59 l59 = y19.H;
        y19.f(l59);
        synchronized (l59.H) {
            l59.G = false;
            l59.D = true;
        }
        y19 y192 = (y19) l59.w;
        y192.G.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!y192.z.r1()) {
            l59.y = null;
            r19 r19 = y192.C;
            y19.g(r19);
            r19.l1(new xs8(l59, elapsedRealtime));
        } else {
            f59 m1 = l59.m1(jv8);
            l59.z = l59.y;
            l59.y = null;
            r19 r192 = y192.C;
            y19.g(r192);
            r192.l1(new w97(l59, m1, elapsedRealtime));
        }
        o79 o79 = y19.D;
        y19.f(o79);
        y19 y193 = (y19) o79.w;
        y193.G.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        r19 r193 = y193.C;
        y19.g(r193);
        r193.l1(new c79(o79, elapsedRealtime2, 1));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Unknown Source)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Unknown Source)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Unknown Source)
        	at java.base/java.util.Objects.checkIndex(Unknown Source)
        	at java.base/java.util.ArrayList.get(Unknown Source)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void m(defpackage.jv8 r7) {
        /*
            r6 = this;
            java.lang.Object r6 = r6.x
            v49 r6 = (defpackage.v49) r6
            java.lang.Object r6 = r6.w
            y19 r6 = (defpackage.y19) r6
            o79 r0 = r6.D
            defpackage.y19.f(r0)
            java.lang.Object r1 = r0.w
            y19 r1 = (defpackage.y19) r1
            xb4 r2 = r1.G
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            r19 r1 = r1.C
            defpackage.y19.g(r1)
            c79 r4 = new c79
            r5 = 0
            r4.<init>(r0, r2, r5)
            r1.l1(r4)
            l59 r6 = r6.H
            defpackage.y19.f(r6)
            java.lang.Object r0 = r6.H
            monitor-enter(r0)
            r1 = 1
            r6.G = r1     // Catch:{ all -> 0x005f }
            jv8 r2 = r6.C     // Catch:{ all -> 0x005f }
            boolean r2 = java.util.Objects.equals(r7, r2)     // Catch:{ all -> 0x005f }
            if (r2 == 0) goto L_0x003c
            goto L_0x0061
        L_0x003c:
            monitor-enter(r0)     // Catch:{ all -> 0x005f }
            r6.C = r7     // Catch:{ all -> 0x00ad }
            r6.D = r5     // Catch:{ all -> 0x00ad }
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            java.lang.Object r2 = r6.w     // Catch:{ all -> 0x005f }
            y19 r2 = (defpackage.y19) r2     // Catch:{ all -> 0x005f }
            tp8 r3 = r2.z     // Catch:{ all -> 0x005f }
            boolean r3 = r3.r1()     // Catch:{ all -> 0x005f }
            if (r3 == 0) goto L_0x0061
            r3 = 0
            r6.E = r3     // Catch:{ all -> 0x005f }
            r19 r2 = r2.C     // Catch:{ all -> 0x005f }
            defpackage.y19.g(r2)     // Catch:{ all -> 0x005f }
            i59 r3 = new i59     // Catch:{ all -> 0x005f }
            r3.<init>(r6, r1)     // Catch:{ all -> 0x005f }
            r2.l1(r3)     // Catch:{ all -> 0x005f }
            goto L_0x0061
        L_0x005f:
            r6 = move-exception
            goto L_0x00b0
        L_0x0061:
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            java.lang.Object r0 = r6.w
            y19 r0 = (defpackage.y19) r0
            tp8 r1 = r0.z
            boolean r1 = r1.r1()
            if (r1 != 0) goto L_0x0080
            f59 r7 = r6.E
            r6.y = r7
            r19 r7 = r0.C
            defpackage.y19.g(r7)
            i59 r0 = new i59
            r0.<init>(r6, r5)
            r7.l1(r0)
            return
        L_0x0080:
            f59 r0 = r6.m1(r7)
            java.lang.String r7 = r7.x
            r6.k1(r7, r0, r5)
            java.lang.Object r6 = r6.w
            y19 r6 = (defpackage.y19) r6
            ev8 r6 = r6.J
            defpackage.y19.d(r6)
            java.lang.Object r7 = r6.w
            y19 r7 = (defpackage.y19) r7
            xb4 r0 = r7.G
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r19 r7 = r7.C
            defpackage.y19.g(r7)
            xs8 r2 = new xs8
            r2.<init>((defpackage.ev8) r6, (long) r0)
            r7.l1(r2)
            return
        L_0x00ad:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            throw r6     // Catch:{ all -> 0x005f }
        L_0x00b0:
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb2.m(jv8):void");
    }

    public void n(jv8 jv8, Bundle bundle) {
        f59 f59;
        l59 l59 = ((y19) ((v49) this.x).w).H;
        y19.f(l59);
        if (((y19) l59.w).z.r1() && bundle != null && (f59 = (f59) l59.B.get(Integer.valueOf(jv8.w))) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", f59.c);
            bundle2.putString("name", f59.a);
            bundle2.putString("referrer_name", f59.b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.w) {
            case b85.b:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT <= 25) {
                        new Handler(Looper.getMainLooper()).post(new ga(22, (Object) this, (Object) intent));
                        return;
                    } else {
                        a(intent);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                ((yw8) this.x).c(new tv8(this, bundle, activity));
                return;
            default:
                j(jv8.f(activity), bundle);
                return;
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        switch (this.w) {
            case b85.b:
                return;
            case 1:
                ((yw8) this.x).c(new xw8(this, activity, 4));
                return;
            default:
                k(jv8.f(activity));
                return;
        }
    }

    public final void onActivityPaused(Activity activity) {
        switch (this.w) {
            case b85.b:
                return;
            case 1:
                ((yw8) this.x).c(new xw8(this, activity, 2));
                return;
            default:
                l(jv8.f(activity));
                return;
        }
    }

    public final void onActivityResumed(Activity activity) {
        switch (this.w) {
            case b85.b:
                return;
            case 1:
                ((yw8) this.x).c(new xw8(this, activity, 1));
                return;
            default:
                m(jv8.f(activity));
                return;
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.w) {
            case b85.b:
                return;
            case 1:
                xt8 xt8 = new xt8();
                ((yw8) this.x).c(new tv8(this, activity, xt8));
                Bundle b = xt8.b(50);
                if (b != null) {
                    bundle.putAll(b);
                    return;
                }
                return;
            default:
                n(jv8.f(activity), bundle);
                return;
        }
    }

    public final void onActivityStarted(Activity activity) {
        switch (this.w) {
            case b85.b:
                return;
            case 1:
                ((yw8) this.x).c(new xw8(this, activity, 0));
                return;
            default:
                return;
        }
    }

    public final void onActivityStopped(Activity activity) {
        switch (this.w) {
            case b85.b:
                return;
            case 1:
                ((yw8) this.x).c(new xw8(this, activity, 3));
                return;
            default:
                return;
        }
    }

    public /* synthetic */ zb2(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }
}
