package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: nt2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nt2 implements Runnable {
    public final /* synthetic */ int w;
    public Object x;
    public final Object y;

    public nt2(v49 v49, ju8 ju8) {
        this.w = 28;
        this.x = ju8;
        Objects.requireNonNull(v49);
        this.y = v49;
    }

    private final void a() {
        try {
            ((Runnable) this.y).run();
            synchronized (((ol6) this.x).A) {
                ((ol6) this.x).a();
            }
        } catch (Throwable th) {
            synchronized (((ol6) this.x).A) {
                ((ol6) this.x).a();
                throw th;
            }
        }
    }

    private final void b() {
        be8 be8;
        lp5 lp5 = ((fa7) this.y).w.f;
        String str = (String) this.x;
        synchronized (lp5.k) {
            try {
                re8 c = lp5.c(str);
                if (c != null) {
                    be8 = c.a;
                } else {
                    be8 = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (be8 != null && !sg3.e(j31.j, be8.j)) {
            synchronized (((fa7) this.y).y) {
                ((fa7) this.y).B.put(z85.h(be8), be8);
                fa7 fa7 = (fa7) this.y;
                ((fa7) this.y).C.put(z85.h(be8), bd8.a(fa7.D, be8, fa7.x.b, fa7));
            }
        }
    }

    private final void c() {
        a09 a09 = (a09) this.y;
        synchronized (a09.y) {
            ((y45) a09.z).K((yb9) this.x);
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [kr8, y29] */
    /* JADX WARNING: type inference failed for: r0v33, types: [in8, fy8, c59] */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03e8, code lost:
        if (r11.z1() == 1) goto L_0x03ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02a5 A[SYNTHETIC, Splitter:B:104:0x02a5] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x056f  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x059e  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x05d1  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x063f  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x07ad  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0813  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0179 A[Catch:{ NameNotFoundException -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0240 A[Catch:{ IllegalStateException -> 0x0263 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0241 A[Catch:{ IllegalStateException -> 0x0263 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x024d A[Catch:{ IllegalStateException -> 0x0263 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x024e A[Catch:{ IllegalStateException -> 0x0263 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0253 A[Catch:{ IllegalStateException -> 0x0263 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0286  */
    private final void d() {
        long j;
        String str;
        vy8 vy8;
        String str2;
        String str3;
        String str4;
        int i;
        int b;
        Bundle o1;
        Integer num;
        List list;
        ? fy8;
        boolean z;
        d99 d99;
        mz8 mz8;
        y19 y19;
        h39 h39;
        h39 h392;
        y19 y192;
        int i2;
        c39 s1;
        c39 s12;
        l09 l09;
        v09 v09;
        y19 y193;
        d99 d992;
        pz8 pz8;
        l90 l90;
        boolean z2;
        Boolean bool;
        mz8 mz82;
        String str5;
        PackageInfo packageInfo;
        Bundle bundle;
        y19 y194 = (y19) this.y;
        m39 m39 = (m39) this.x;
        r19 r19 = y194.C;
        pz8 pz82 = y194.B;
        q09 q09 = y194.A;
        d99 d993 = y194.E;
        y19.g(r19);
        r19.b1();
        tp8 tp8 = y194.z;
        ((y19) tp8.w).getClass();
        ? y29 = new y29(y194);
        y29.f1();
        y194.O = y29;
        iv8 iv8 = m39.d;
        if (iv8 == null) {
            j = 0;
        } else {
            j = iv8.w;
        }
        String str6 = "";
        if (iv8 == null || (bundle = iv8.z) == null) {
            str = str6;
        } else {
            str = bundle.getString("runtime_google_app_id", str6);
        }
        vy8 vy82 = new vy8(y194, m39.c, j, str);
        vy82.e1();
        y194.P = vy82;
        cz8 cz8 = new cz8(y194);
        cz8.e1();
        y194.M = cz8;
        r69 r69 = new r69(y194);
        r69.e1();
        y194.N = r69;
        boolean z3 = d993.x;
        y19 y195 = (y19) d993.w;
        if (!z3) {
            d993.b1();
            SecureRandom secureRandom = new SecureRandom();
            long nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                nextLong = secureRandom.nextLong();
                if (nextLong == 0) {
                    pz8 pz83 = ((y19) d993.w).B;
                    y19.g(pz83);
                    pz83.E.a("Utils falling back to Random for random id");
                }
            }
            d993.z.set(nextLong);
            y195.Y.incrementAndGet();
            d993.x = true;
            if (!q09.x) {
                SharedPreferences sharedPreferences = ((y19) q09.w).w.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                q09.y = sharedPreferences;
                boolean z4 = sharedPreferences.getBoolean("has_been_opened", false);
                q09.N = z4;
                if (!z4) {
                    SharedPreferences.Editor edit = q09.y.edit();
                    edit.putBoolean("has_been_opened", true);
                    edit.apply();
                }
                pz8 pz84 = pz82;
                q09.A = new rb2(q09, Math.max(0, ((Long) by8.d.a((Object) null)).longValue()));
                ((y19) q09.w).Y.incrementAndGet();
                q09.x = true;
                vy8 vy83 = y194.P;
                if (!vy83.x) {
                    y19 y196 = (y19) vy83.w;
                    pz8 pz85 = y196.B;
                    pz8 pz86 = y196.B;
                    y19.g(pz85);
                    y19 y197 = y195;
                    String str7 = "Can't initialize twice";
                    pz85.J.c(Long.valueOf(vy83.F), Long.valueOf(vy83.E), "sdkVersion bundled with app, dynamiteVersion");
                    Context context = y196.w;
                    String packageName = context.getPackageName();
                    PackageManager packageManager = context.getPackageManager();
                    String str8 = "Unknown";
                    String str9 = "unknown";
                    if (packageManager == null) {
                        y19.g(pz86);
                        pz86.B.b("PackageManager is null, app identity information might be inaccurate. appId", pz8.k1(packageName));
                    } else {
                        try {
                            str9 = packageManager.getInstallerPackageName(packageName);
                        } catch (IllegalArgumentException unused) {
                            y19.g(pz86);
                            pz86.B.b("Error retrieving app installer package name. appId", pz8.k1(packageName));
                        }
                        String str10 = str9;
                        if (str10 == null) {
                            str10 = "manual_install";
                        } else if ("com.android.vending".equals(str10)) {
                            str9 = str6;
                            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                            if (packageInfo != null) {
                                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                if (!TextUtils.isEmpty(applicationLabel)) {
                                    str3 = applicationLabel.toString();
                                } else {
                                    str3 = str8;
                                }
                                try {
                                    str2 = packageInfo.versionName;
                                    try {
                                        i = packageInfo.versionCode;
                                        vy8 = vy82;
                                        str4 = str9;
                                    } catch (PackageManager.NameNotFoundException unused2) {
                                        str8 = str2;
                                        y19.g(pz86);
                                        vy8 = vy82;
                                        pz86.B.c(pz8.k1(packageName), str3, "Error retrieving package info. appId, appName");
                                        str2 = str8;
                                        str4 = str9;
                                        i = Integer.MIN_VALUE;
                                        vy83.y = packageName;
                                        vy83.B = str4;
                                        vy83.z = str2;
                                        vy83.A = i;
                                        vy83.C = str3;
                                        String str11 = packageName;
                                        vy83.D = 0;
                                        b = y196.b();
                                        if (b == 0) {
                                        }
                                        vy83.K = str6;
                                        str5 = vy83.I;
                                        if (TextUtils.isEmpty(str5)) {
                                        }
                                        if (!TextUtils.isEmpty(str5)) {
                                        }
                                        vy83.K = str6;
                                        if (b == 0) {
                                        }
                                        vy83.G = null;
                                        tp8 tp82 = y196.z;
                                        y19 y198 = (y19) tp82.w;
                                        z65.h("analytics.safelisted_events");
                                        o1 = tp82.o1();
                                        if (o1 == null) {
                                        }
                                        num = null;
                                        if (num != null) {
                                        }
                                        list = null;
                                        if (list != null) {
                                        }
                                        vy83.G = list;
                                        if (packageManager == null) {
                                        }
                                        ((y19) vy83.w).Y.incrementAndGet();
                                        vy83.x = true;
                                        fy8 = new fy8(y194);
                                        fy8.e1();
                                        y194.Q = fy8;
                                        if (fy8.x) {
                                        }
                                    }
                                } catch (PackageManager.NameNotFoundException unused3) {
                                    y19.g(pz86);
                                    vy8 = vy82;
                                    pz86.B.c(pz8.k1(packageName), str3, "Error retrieving package info. appId, appName");
                                    str2 = str8;
                                    str4 = str9;
                                    i = Integer.MIN_VALUE;
                                    vy83.y = packageName;
                                    vy83.B = str4;
                                    vy83.z = str2;
                                    vy83.A = i;
                                    vy83.C = str3;
                                    String str112 = packageName;
                                    vy83.D = 0;
                                    b = y196.b();
                                    if (b == 0) {
                                    }
                                    vy83.K = str6;
                                    str5 = vy83.I;
                                    if (TextUtils.isEmpty(str5)) {
                                    }
                                    if (!TextUtils.isEmpty(str5)) {
                                    }
                                    vy83.K = str6;
                                    if (b == 0) {
                                    }
                                    vy83.G = null;
                                    tp8 tp822 = y196.z;
                                    y19 y1982 = (y19) tp822.w;
                                    z65.h("analytics.safelisted_events");
                                    o1 = tp822.o1();
                                    if (o1 == null) {
                                    }
                                    num = null;
                                    if (num != null) {
                                    }
                                    list = null;
                                    if (list != null) {
                                    }
                                    vy83.G = list;
                                    if (packageManager == null) {
                                    }
                                    ((y19) vy83.w).Y.incrementAndGet();
                                    vy83.x = true;
                                    fy8 = new fy8(y194);
                                    fy8.e1();
                                    y194.Q = fy8;
                                    if (fy8.x) {
                                    }
                                }
                                vy83.y = packageName;
                                vy83.B = str4;
                                vy83.z = str2;
                                vy83.A = i;
                                vy83.C = str3;
                                String str1122 = packageName;
                                vy83.D = 0;
                                b = y196.b();
                                if (b == 0) {
                                    y19.g(pz86);
                                    pz86.J.a("App measurement collection enabled");
                                } else if (b == 1) {
                                    y19.g(pz86);
                                    pz86.H.a("App measurement deactivated via the manifest");
                                } else if (b == 3) {
                                    y19.g(pz86);
                                    pz86.H.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                                } else if (b == 4) {
                                    y19.g(pz86);
                                    pz86.H.a("App measurement disabled via the manifest");
                                } else if (b == 6) {
                                    y19.g(pz86);
                                    pz86.G.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                                } else if (b == 7) {
                                    y19.g(pz86);
                                    pz86.H.a("App measurement disabled via the global data collection setting");
                                } else if (b != 8) {
                                    y19.g(pz86);
                                    pz86.H.a("App measurement disabled");
                                    y19.g(pz86);
                                    pz86.C.a("Invalid scion state in identity");
                                } else {
                                    y19.g(pz86);
                                    pz86.H.a("App measurement disabled due to denied storage consent");
                                }
                                vy83.K = str6;
                                str5 = vy83.I;
                                if (TextUtils.isEmpty(str5)) {
                                    str5 = b35.F(context, y196.L);
                                }
                                if (!TextUtils.isEmpty(str5)) {
                                    str6 = str5;
                                }
                                vy83.K = str6;
                                if (b == 0) {
                                    y19.g(pz86);
                                    pz86.J.c(vy83.y, vy83.K, "App measurement enabled for app package, google app id");
                                }
                                vy83.G = null;
                                tp8 tp8222 = y196.z;
                                y19 y19822 = (y19) tp8222.w;
                                z65.h("analytics.safelisted_events");
                                o1 = tp8222.o1();
                                if (o1 == null) {
                                    pz8 pz87 = y19822.B;
                                    y19.g(pz87);
                                    pz87.B.a("Failed to load metadata: Metadata bundle is null");
                                } else if (o1.containsKey("analytics.safelisted_events")) {
                                    num = Integer.valueOf(o1.getInt("analytics.safelisted_events"));
                                    if (num != null) {
                                        try {
                                            String[] stringArray = y19822.w.getResources().getStringArray(num.intValue());
                                            if (stringArray != null) {
                                                list = Arrays.asList(stringArray);
                                                if (list != null) {
                                                    if (!list.isEmpty()) {
                                                        Iterator it = list.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                break;
                                                            }
                                                            d99 d994 = y196.E;
                                                            y19.e(d994);
                                                            if (!d994.g2("safelisted event", (String) it.next())) {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        y19.g(pz86);
                                                        pz86.G.a("Safelisted event list is empty. Ignoring");
                                                    }
                                                    if (packageManager == null) {
                                                        vy83.J = rd3.B(context) ? 1 : 0;
                                                    } else {
                                                        vy83.J = 0;
                                                    }
                                                    ((y19) vy83.w).Y.incrementAndGet();
                                                    vy83.x = true;
                                                    fy8 = new fy8(y194);
                                                    fy8.e1();
                                                    y194.Q = fy8;
                                                    if (fy8.x) {
                                                        fy8.y = (JobScheduler) ((y19) fy8.w).w.getSystemService("jobscheduler");
                                                        ((y19) fy8.w).Y.incrementAndGet();
                                                        fy8.x = true;
                                                        y19.g(pz84);
                                                        pz8 pz88 = pz84;
                                                        mz8 mz83 = pz88.I;
                                                        mz8 mz84 = pz88.H;
                                                        mz8 mz85 = pz88.J;
                                                        mz8 mz86 = pz88.B;
                                                        tp8.i1();
                                                        mz84.b("App measurement initialized, version", 161000L);
                                                        y19.g(pz88);
                                                        mz84.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                                        String i1 = vy8.i1();
                                                        if (d993.H1(i1, tp8.y)) {
                                                            y19.g(pz88);
                                                            mz84.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                                        } else {
                                                            y19.g(pz88);
                                                            mz84.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(i1)));
                                                        }
                                                        y19.g(pz88);
                                                        mz83.a("Debug-level message logging enabled");
                                                        int i3 = y194.W;
                                                        AtomicInteger atomicInteger = y194.Y;
                                                        if (i3 != atomicInteger.get()) {
                                                            y19.g(pz88);
                                                            mz86.c(Integer.valueOf(y194.W), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                                                        }
                                                        y194.R = true;
                                                        long j2 = y194.Z;
                                                        v49 v49 = y194.I;
                                                        r19 r192 = y194.C;
                                                        y19.g(r192);
                                                        r192.b1();
                                                        y19.d(y194.Q);
                                                        int h1 = y194.Q.h1();
                                                        wo8.a();
                                                        boolean n1 = tp8.n1((String) null, by8.P0);
                                                        if (h1 == 2) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        if (n1) {
                                                            d993.b1();
                                                        }
                                                        if (z) {
                                                            z = true;
                                                            d993.b1();
                                                            IntentFilter intentFilter = new IntentFilter();
                                                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                            boolean z5 = z;
                                                            ag8.D(y197.w, new to(y197), intentFilter);
                                                            pz8 pz89 = y197.B;
                                                            y19.g(pz89);
                                                            pz89.I.a("Registered app receiver");
                                                            if (z5) {
                                                                y19.d(y194.Q);
                                                                y194.Q.g1(((Long) by8.C.a((Object) null)).longValue());
                                                            }
                                                        }
                                                        l90 l902 = q09.C;
                                                        h39 j1 = q09.j1();
                                                        int i4 = j1.b;
                                                        h39 h393 = j1;
                                                        pz8 pz810 = pz88;
                                                        c39 s13 = tp8.s1("google_analytics_default_allow_ad_storage", false);
                                                        y19 y199 = y197;
                                                        c39 s14 = tp8.s1("google_analytics_default_allow_analytics_storage", false);
                                                        f39 f39 = f39.ANALYTICS_STORAGE;
                                                        l90 l903 = l902;
                                                        Class<f39> cls = f39.class;
                                                        mz8 mz87 = mz84;
                                                        c39 c39 = c39.UNINITIALIZED;
                                                        if (s13 == c39 && s14 == c39) {
                                                            y19 = y194;
                                                            mz8 = mz86;
                                                            d99 = d993;
                                                        } else {
                                                            y19 = y194;
                                                            mz8 = mz86;
                                                            d99 = d993;
                                                            if (h39.l(-10, q09.g1().getInt("consent_source", 100))) {
                                                                EnumMap enumMap = new EnumMap(cls);
                                                                enumMap.put(f39.AD_STORAGE, s13);
                                                                enumMap.put(f39, s14);
                                                                h39 = new h39(enumMap, -10);
                                                                if (h39 == null) {
                                                                    y19.f(v49);
                                                                    v49.y1(h39, true);
                                                                    h392 = h39;
                                                                } else {
                                                                    h392 = h393;
                                                                }
                                                                y19.f(v49);
                                                                y192 = (y19) v49.w;
                                                                v49.C1(h392);
                                                                q09.b1();
                                                                i2 = ir8.b(q09.g1().getString("dma_consent_settings", (String) null)).a;
                                                                s1 = tp8.s1("google_analytics_default_allow_ad_personalization_signals", true);
                                                                if (s1 != c39) {
                                                                    y19.g(pz810);
                                                                    mz85.b("Default ad personalization consent from Manifest", s1);
                                                                }
                                                                s12 = tp8.s1("google_analytics_default_allow_ad_user_data", true);
                                                                if (s12 != c39 && h39.l(-10, i2)) {
                                                                    y19.f(v49);
                                                                    EnumMap enumMap2 = new EnumMap(cls);
                                                                    enumMap2.put(f39.AD_USER_DATA, s12);
                                                                    v49.x1(new ir8(enumMap2, -10, (Boolean) null, (String) null), true);
                                                                } else if (!TextUtils.isEmpty(y19.l().j1()) && (i2 == 0 || i2 == 30)) {
                                                                    y19.f(v49);
                                                                    v49.x1(new ir8((Boolean) null, -10, (Boolean) null, (String) null), true);
                                                                }
                                                                Boolean p1 = tp8.p1("google_analytics_tcf_data_enabled");
                                                                if (p1 == null || p1.booleanValue()) {
                                                                    y19.g(pz810);
                                                                    mz83.a("TCF client enabled.");
                                                                    y19.f(v49);
                                                                    v49.b1();
                                                                    pz8 pz811 = y192.B;
                                                                    y19.g(pz811);
                                                                    pz811.I.a("Register tcfPrefChangeListener.");
                                                                    if (v49.P == null) {
                                                                        v49.Q = new p39(v49, y192, 2);
                                                                        v49.P = new r49(v49);
                                                                    }
                                                                    q09 q092 = y192.A;
                                                                    y19.e(q092);
                                                                    q092.h1().registerOnSharedPreferenceChangeListener(v49.P);
                                                                    y19.f(v49);
                                                                    v49.i1();
                                                                }
                                                                l09 = q09.B;
                                                                if (l09.a() == 0) {
                                                                    y19.g(pz810);
                                                                    mz85.b("Persisting first open", Long.valueOf(j2));
                                                                    l09.b(j2);
                                                                }
                                                                y19.f(v49);
                                                                v09 = v49.M;
                                                                if (v09.e() && v09.d()) {
                                                                    q09 q093 = v09.w.A;
                                                                    y19.e(q093);
                                                                    q093.S.k((String) null);
                                                                }
                                                                if (y19.c()) {
                                                                    if (y19.a()) {
                                                                        d992 = d99;
                                                                        if (!d992.F1("android.permission.INTERNET")) {
                                                                            y19.g(pz810);
                                                                            mz82 = mz8;
                                                                            mz82.a("App is missing INTERNET permission");
                                                                        } else {
                                                                            mz82 = mz8;
                                                                        }
                                                                        if (!d992.F1("android.permission.ACCESS_NETWORK_STATE")) {
                                                                            y19.g(pz810);
                                                                            mz82.a("App is missing ACCESS_NETWORK_STATE permission");
                                                                        }
                                                                        y193 = y19;
                                                                        Context context2 = y193.w;
                                                                        if (!cf8.a(context2).d() && !tp8.f1()) {
                                                                            if (!d99.X1(context2)) {
                                                                                y19.g(pz810);
                                                                                mz82.a("AppMeasurementReceiver not registered/enabled");
                                                                            }
                                                                            if (!d99.x1(context2)) {
                                                                                y19.g(pz810);
                                                                                mz82.a("AppMeasurementService not registered/enabled");
                                                                            }
                                                                        }
                                                                        y19.g(pz810);
                                                                        mz82.a("Uploading is not possible. App measurement disabled");
                                                                    } else {
                                                                        y193 = y19;
                                                                        d992 = d99;
                                                                    }
                                                                    pz8 = pz810;
                                                                } else {
                                                                    y193 = y19;
                                                                    d992 = d99;
                                                                    if (!TextUtils.isEmpty(y193.l().j1())) {
                                                                        String j12 = y193.l().j1();
                                                                        q09.b1();
                                                                        String string = q09.g1().getString("gmp_app_id", (String) null);
                                                                        boolean isEmpty = TextUtils.isEmpty(j12);
                                                                        boolean isEmpty2 = TextUtils.isEmpty(string);
                                                                        if (!isEmpty && !isEmpty2) {
                                                                            z65.k(j12);
                                                                            if (!j12.equals(string)) {
                                                                                y19.g(pz810);
                                                                                mz87.a("Rechecking which service to use due to a GMP App Id change");
                                                                                q09.b1();
                                                                                q09.b1();
                                                                                if (q09.g1().contains("measurement_enabled")) {
                                                                                    bool = Boolean.valueOf(q09.g1().getBoolean("measurement_enabled", true));
                                                                                } else {
                                                                                    bool = null;
                                                                                }
                                                                                SharedPreferences.Editor edit2 = q09.g1().edit();
                                                                                edit2.clear();
                                                                                edit2.apply();
                                                                                if (bool != null) {
                                                                                    q09.b1();
                                                                                    SharedPreferences.Editor edit3 = q09.g1().edit();
                                                                                    edit3.putBoolean("measurement_enabled", bool.booleanValue());
                                                                                    edit3.apply();
                                                                                }
                                                                                y193.i().g1();
                                                                                y193.N.k1();
                                                                                y193.N.i1();
                                                                                l09.b(j2);
                                                                                l90 = l903;
                                                                                l90.k((String) null);
                                                                                String j13 = y193.l().j1();
                                                                                q09.b1();
                                                                                SharedPreferences.Editor edit4 = q09.g1().edit();
                                                                                edit4.putString("gmp_app_id", j13);
                                                                                edit4.apply();
                                                                            }
                                                                        }
                                                                        l90 = l903;
                                                                        String j132 = y193.l().j1();
                                                                        q09.b1();
                                                                        SharedPreferences.Editor edit42 = q09.g1().edit();
                                                                        edit42.putString("gmp_app_id", j132);
                                                                        edit42.apply();
                                                                    } else {
                                                                        l90 = l903;
                                                                    }
                                                                    if (!q09.j1().i(f39)) {
                                                                        l90.k((String) null);
                                                                    }
                                                                    y19.f(v49);
                                                                    v49.C.set(l90.j());
                                                                    try {
                                                                        y199.w.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                                                    } catch (ClassNotFoundException unused4) {
                                                                        l90 l904 = q09.R;
                                                                        if (!TextUtils.isEmpty(l904.j())) {
                                                                            y19.g(pz810);
                                                                            pz8 = pz810;
                                                                            pz8.E.a("Remote config removed with active feature rollouts");
                                                                            l904.k((String) null);
                                                                        }
                                                                    }
                                                                    pz8 = pz810;
                                                                    if (!TextUtils.isEmpty(y193.l().j1())) {
                                                                        boolean a = y193.a();
                                                                        SharedPreferences sharedPreferences2 = q09.y;
                                                                        if (sharedPreferences2 == null) {
                                                                            z2 = false;
                                                                        } else {
                                                                            z2 = sharedPreferences2.contains("deferred_analytics_collection");
                                                                        }
                                                                        if (!z2 && !tp8.q1()) {
                                                                            q09.k1(!a);
                                                                        }
                                                                        if (a) {
                                                                            y19.f(v49);
                                                                            v49.o1();
                                                                        }
                                                                        o79 o79 = y193.D;
                                                                        y19.f(o79);
                                                                        o79.A.k();
                                                                        y193.j().g1(new AtomicReference());
                                                                        y193.j().h1(q09.U.e());
                                                                    }
                                                                }
                                                                wo8.a();
                                                                if (tp8.n1((String) null, by8.P0)) {
                                                                    d992.b1();
                                                                    if (d992.z1() == 1) {
                                                                        long nextInt = (long) new Random().nextInt(5000);
                                                                        y193.G.getClass();
                                                                        long max = Math.max(500, ((((long) ((Integer) by8.w0.a((Object) null)).intValue()) * 1000) + nextInt) - SystemClock.elapsedRealtime());
                                                                        if (max > 500) {
                                                                            y19.g(pz8);
                                                                            mz85.b("Waiting to fetch trigger URIs until some time after boot. Delay in millis", Long.valueOf(max));
                                                                        }
                                                                        y19.f(v49);
                                                                        v49.b1();
                                                                        if (v49.H == null) {
                                                                            v49.H = new p39(v49, y192, 0);
                                                                        }
                                                                        v49.H.b(max);
                                                                    }
                                                                }
                                                                q09.K.b(true);
                                                                return;
                                                            }
                                                        }
                                                        if (!TextUtils.isEmpty(y19.l().j1()) && (i4 == 0 || i4 == 30 || i4 == 10 || i4 == 40)) {
                                                            y19.f(v49);
                                                            v49.y1(new h39(-10), false);
                                                        }
                                                        h39 = null;
                                                        if (h39 == null) {
                                                        }
                                                        y19.f(v49);
                                                        y192 = (y19) v49.w;
                                                        v49.C1(h392);
                                                        q09.b1();
                                                        i2 = ir8.b(q09.g1().getString("dma_consent_settings", (String) null)).a;
                                                        s1 = tp8.s1("google_analytics_default_allow_ad_personalization_signals", true);
                                                        if (s1 != c39) {
                                                        }
                                                        s12 = tp8.s1("google_analytics_default_allow_ad_user_data", true);
                                                        if (s12 != c39 || h39.l(-10, i2)) {
                                                        }
                                                        Boolean p12 = tp8.p1("google_analytics_tcf_data_enabled");
                                                        y19.g(pz810);
                                                        mz83.a("TCF client enabled.");
                                                        y19.f(v49);
                                                        v49.b1();
                                                        pz8 pz8112 = y192.B;
                                                        y19.g(pz8112);
                                                        pz8112.I.a("Register tcfPrefChangeListener.");
                                                        if (v49.P == null) {
                                                        }
                                                        q09 q0922 = y192.A;
                                                        y19.e(q0922);
                                                        q0922.h1().registerOnSharedPreferenceChangeListener(v49.P);
                                                        y19.f(v49);
                                                        v49.i1();
                                                        l09 = q09.B;
                                                        if (l09.a() == 0) {
                                                        }
                                                        y19.f(v49);
                                                        v09 = v49.M;
                                                        q09 q0932 = v09.w.A;
                                                        y19.e(q0932);
                                                        q0932.S.k((String) null);
                                                        if (y19.c()) {
                                                        }
                                                        wo8.a();
                                                        if (tp8.n1((String) null, by8.P0)) {
                                                        }
                                                        q09.K.b(true);
                                                        return;
                                                    }
                                                    h.s(str7);
                                                    return;
                                                }
                                                vy83.G = list;
                                                if (packageManager == null) {
                                                }
                                                ((y19) vy83.w).Y.incrementAndGet();
                                                vy83.x = true;
                                                fy8 = new fy8(y194);
                                                fy8.e1();
                                                y194.Q = fy8;
                                                if (fy8.x) {
                                                }
                                            }
                                        } catch (Resources.NotFoundException e) {
                                            pz8 pz812 = y19822.B;
                                            y19.g(pz812);
                                            pz812.B.b("Failed to load string array from metadata: resource not found", e);
                                        }
                                    }
                                    list = null;
                                    if (list != null) {
                                    }
                                    vy83.G = list;
                                    if (packageManager == null) {
                                    }
                                    ((y19) vy83.w).Y.incrementAndGet();
                                    vy83.x = true;
                                    fy8 = new fy8(y194);
                                    fy8.e1();
                                    y194.Q = fy8;
                                    if (fy8.x) {
                                    }
                                }
                                num = null;
                                if (num != null) {
                                }
                                list = null;
                                if (list != null) {
                                }
                                vy83.G = list;
                                if (packageManager == null) {
                                }
                                ((y19) vy83.w).Y.incrementAndGet();
                                vy83.x = true;
                                fy8 = new fy8(y194);
                                fy8.e1();
                                y194.Q = fy8;
                                if (fy8.x) {
                                }
                            }
                        }
                        str9 = str10;
                        try {
                            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                            if (packageInfo != null) {
                            }
                        } catch (PackageManager.NameNotFoundException unused5) {
                            str3 = str8;
                            y19.g(pz86);
                            vy8 = vy82;
                            pz86.B.c(pz8.k1(packageName), str3, "Error retrieving package info. appId, appName");
                            str2 = str8;
                            str4 = str9;
                            i = Integer.MIN_VALUE;
                            vy83.y = packageName;
                            vy83.B = str4;
                            vy83.z = str2;
                            vy83.A = i;
                            vy83.C = str3;
                            String str11222 = packageName;
                            vy83.D = 0;
                            b = y196.b();
                            if (b == 0) {
                            }
                            vy83.K = str6;
                            str5 = vy83.I;
                            if (TextUtils.isEmpty(str5)) {
                            }
                            if (!TextUtils.isEmpty(str5)) {
                            }
                            vy83.K = str6;
                            if (b == 0) {
                            }
                            vy83.G = null;
                            tp8 tp82222 = y196.z;
                            y19 y198222 = (y19) tp82222.w;
                            z65.h("analytics.safelisted_events");
                            o1 = tp82222.o1();
                            if (o1 == null) {
                            }
                            num = null;
                            if (num != null) {
                            }
                            list = null;
                            if (list != null) {
                            }
                            vy83.G = list;
                            if (packageManager == null) {
                            }
                            ((y19) vy83.w).Y.incrementAndGet();
                            vy83.x = true;
                            fy8 = new fy8(y194);
                            fy8.e1();
                            y194.Q = fy8;
                            if (fy8.x) {
                            }
                        }
                    }
                    vy8 = vy82;
                    str3 = str8;
                    str2 = str3;
                    str4 = str9;
                    i = Integer.MIN_VALUE;
                    vy83.y = packageName;
                    vy83.B = str4;
                    vy83.z = str2;
                    vy83.A = i;
                    vy83.C = str3;
                    String str112222 = packageName;
                    vy83.D = 0;
                    b = y196.b();
                    if (b == 0) {
                    }
                    vy83.K = str6;
                    try {
                        str5 = vy83.I;
                        if (TextUtils.isEmpty(str5)) {
                        }
                        if (!TextUtils.isEmpty(str5)) {
                        }
                        vy83.K = str6;
                        if (b == 0) {
                        }
                    } catch (IllegalStateException e2) {
                        y19.g(pz86);
                        pz86.B.c(pz8.k1(str112222), e2, "Fetching Google App Id failed with exception. appId");
                    }
                    vy83.G = null;
                    tp8 tp822222 = y196.z;
                    y19 y1982222 = (y19) tp822222.w;
                    z65.h("analytics.safelisted_events");
                    o1 = tp822222.o1();
                    if (o1 == null) {
                    }
                    num = null;
                    if (num != null) {
                    }
                    list = null;
                    if (list != null) {
                    }
                    vy83.G = list;
                    if (packageManager == null) {
                    }
                    ((y19) vy83.w).Y.incrementAndGet();
                    vy83.x = true;
                    fy8 = new fy8(y194);
                    fy8.e1();
                    y194.Q = fy8;
                    if (fy8.x) {
                    }
                } else {
                    h.s("Can't initialize twice");
                }
            } else {
                h.s("Can't initialize twice");
            }
        } else {
            h.s("Can't initialize twice");
        }
    }

    private final void e() {
        IBinder iBinder = (IBinder) this.y;
        r89 r89 = (r89) this.x;
        synchronized (r89) {
            if (iBinder == null) {
                r89.b("Null service connection");
                return;
            }
            try {
                r89.y = new k68(iBinder);
                r89.w = 2;
                ((ScheduledExecutorService) r89.B.z).execute(new u29(r89, 1));
            } catch (RemoteException e) {
                r89.b(e.getMessage());
            }
        }
    }

    private final void f() {
        a09 a09 = (a09) this.y;
        synchronized (a09.y) {
            try {
                c55 c55 = (c55) a09.z;
                if (c55 != null) {
                    Exception h = ((yb9) this.x).h();
                    z65.k(h);
                    c55.j(h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        r0 = r0 | java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        ((java.lang.Runnable) r13.x).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0061, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r8 = defpackage.jl6.B;
        r9 = java.util.logging.Level.SEVERE;
        r10 = java.lang.String.valueOf((java.lang.Runnable) r13.x);
        r12 = new java.lang.StringBuilder(r10.length() + 35);
        r12.append("Exception while executing runnable ");
        r12.append(r10);
        r8.log(r9, r12.toString(), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ab, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d6, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00df, code lost:
        r0 = r0 | java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        ((java.lang.Runnable) r13.x).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00ee, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        defpackage.il6.B.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r13.x), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        return;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public void g() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        switch (this.w) {
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                z = false;
                while (true) {
                    synchronized (((il6) this.y).x) {
                        if (!z3) {
                            il6 il6 = (il6) this.y;
                            if (il6.y == 4) {
                                break;
                            } else {
                                il6.z++;
                                il6.y = 4;
                                z3 = true;
                            }
                        }
                        Runnable runnable = (Runnable) ((il6) this.y).x.poll();
                        this.x = runnable;
                        if (runnable == null) {
                            ((il6) this.y).y = 1;
                            break;
                        }
                    }
                    this.x = null;
                }
                Thread.currentThread().interrupt();
                return;
            default:
                z2 = false;
                while (true) {
                    synchronized (((jl6) this.y).x) {
                        if (!z3) {
                            jl6 jl6 = (jl6) this.y;
                            if (jl6.y == 4) {
                                break;
                            } else {
                                jl6.z++;
                                jl6.y = 4;
                                z3 = true;
                            }
                        }
                        Runnable runnable2 = (Runnable) ((jl6) this.y).x.poll();
                        this.x = runnable2;
                        if (runnable2 == null) {
                            ((jl6) this.y).y = 1;
                            break;
                        }
                    }
                    this.x = null;
                }
                Thread.currentThread().interrupt();
                return;
        }
        try {
            this.x = null;
        } catch (Throwable th) {
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
        try {
            this.x = null;
        } catch (Throwable th2) {
            if (z2) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }

    /* JADX WARNING: type inference failed for: r3v22, types: [gg8] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x008d A[SYNTHETIC, Splitter:B:15:0x008d] */
    public final void run() {
        Throwable o;
        ri4 ri4;
        j73 j73;
        Set set;
        boolean z;
        boolean z2;
        boolean z3;
        j73 j732;
        Long l;
        int i = 0;
        switch (this.w) {
            case b85.b:
                k68 k68 = (k68) this.y;
                ListenableFuture listenableFuture = (ListenableFuture) this.x;
                if (!(listenableFuture instanceof x1) || (o = ((x1) listenableFuture).o()) == null) {
                    try {
                        pt2.b(listenableFuture);
                        v49 v49 = (v49) k68.y;
                        v49.b1();
                        y19 y19 = (y19) v49.w;
                        q09 q09 = y19.A;
                        y19.e(q09);
                        SparseArray i1 = q09.i1();
                        u79 u79 = (u79) k68.x;
                        i1.put(u79.y, Long.valueOf(u79.x));
                        q09 q092 = y19.A;
                        y19.e(q092);
                        int[] iArr = new int[i1.size()];
                        long[] jArr = new long[i1.size()];
                        for (int i2 = 0; i2 < i1.size(); i2++) {
                            iArr[i2] = i1.keyAt(i2);
                            jArr[i2] = ((Long) i1.valueAt(i2)).longValue();
                        }
                        Bundle bundle = new Bundle();
                        bundle.putIntArray("uriSources", iArr);
                        bundle.putLongArray("uriTimestamps", jArr);
                        q092.J.i(bundle);
                        v49.E = false;
                        v49.F = 1;
                        pz8 pz8 = y19.B;
                        y19.g(pz8);
                        pz8.I.b("Successfully registered trigger URI", u79.w);
                        v49.B1();
                        return;
                    } catch (ExecutionException e) {
                        k68.g(e.getCause());
                        return;
                    } catch (Error | RuntimeException e2) {
                        k68.g(e2);
                        return;
                    }
                } else {
                    k68.g(o);
                    return;
                }
            case 1:
                a8 a8Var = (a8) this.x;
                d8 d8Var = (d8) this.y;
                ti4 ti4 = d8Var.y;
                if (!(ti4 == null || (ri4 = ti4.e) == null)) {
                    ri4.s(ti4);
                }
                View view = (View) d8Var.D;
                if (!(view == null || view.getWindowToken() == null)) {
                    if (!a8Var.b()) {
                        if (a8Var.e != null) {
                            a8Var.d(0, 0, false, false);
                        }
                    }
                    d8Var.O = a8Var;
                }
                d8Var.Q = null;
                return;
            case 2:
                ((o8) this.x).w = this.y;
                return;
            case 3:
                ((Application) this.x).unregisterActivityLifecycleCallbacks((o8) this.y);
                return;
            case 4:
                Object obj = this.y;
                Object obj2 = this.x;
                try {
                    Method method = p8.d;
                    if (method != null) {
                        method.invoke(obj2, new Object[]{obj, Boolean.FALSE, "AppCompat recreation"});
                        return;
                    } else {
                        p8.e.invoke(obj2, new Object[]{obj, Boolean.FALSE});
                        return;
                    }
                } catch (RuntimeException e3) {
                    if (e3.getClass() == RuntimeException.class && e3.getMessage() != null && e3.getMessage().startsWith("Unable to stop")) {
                        throw e3;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 5:
                Typeface typeface = (Typeface) this.y;
                b85 b85 = (b85) ((br4) this.x).x;
                if (b85 != null) {
                    b85.p(typeface);
                    return;
                }
                return;
            case 6:
                bc4 k = bc4.k();
                String str = uo1.e;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                be8 be8 = (be8) this.x;
                sb.append(be8.a);
                k.e(str, sb.toString());
                ((uo1) this.y).a.e(be8);
                return;
            case 7:
                break;
            case 8:
                tt ttVar = (tt) this.y;
                Object obj3 = this.x;
                boolean z4 = ttVar.y.get();
                ai8 ai8 = ttVar.A;
                if (!z4) {
                    if (ai8.i == ttVar) {
                        if (!ai8.e) {
                            SystemClock.uptimeMillis();
                            ai8.i = null;
                            switch (ai8.k) {
                                case 1:
                                    List list = (List) obj3;
                                    ai8.l = list;
                                    ai8.b(list);
                                    break;
                                default:
                                    ai8.b(obj3);
                                    break;
                            }
                        }
                    } else if (ai8.j == ttVar) {
                        SystemClock.uptimeMillis();
                        ai8.j = null;
                        ai8.c();
                    }
                } else if (ai8.j == ttVar) {
                    SystemClock.uptimeMillis();
                    ai8.j = null;
                    ai8.c();
                }
                ttVar.x = 3;
                return;
            case 9:
                ((ol2) this.x).accept(this.y);
                return;
            case 10:
                ((kk0) this.y).G((g82) this.x);
                return;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                try {
                    g();
                    return;
                } catch (Error e4) {
                    synchronized (((il6) this.y).x) {
                        ((il6) this.y).y = 1;
                        throw e4;
                    }
                }
            case 12:
                try {
                    g();
                    return;
                } catch (Error e5) {
                    synchronized (((jl6) this.y).x) {
                        ((jl6) this.y).y = 1;
                        throw e5;
                    }
                }
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                a();
                return;
            case 14:
                i58 i58 = ((SwipeDismissBehavior) this.y).a;
                if (i58 != null && i58.f()) {
                    ((View) this.x).postOnAnimation(this);
                    return;
                }
                return;
            case h75.g:
                b();
                return;
            case 16:
                m11 m11 = (m11) this.x;
                ge1 ge1 = (ge1) this.y;
                iw2 iw2 = (iw2) ge1.y;
                ng8 ng8 = (ng8) ((pw2) ge1.B).F.get((ln) ge1.x);
                if (ng8 != null) {
                    if (m11.x == 0) {
                        ge1.w = true;
                        if (!iw2.r()) {
                            try {
                                if (iw2.r()) {
                                    set = iw2.z;
                                } else {
                                    set = Collections.EMPTY_SET;
                                }
                                iw2.j((j73) null, set);
                                return;
                            } catch (SecurityException e6) {
                                Log.e("GoogleApiManager", "Failed to get service from broker. ", e6);
                                iw2.d("Failed to get service from broker.");
                                ng8.o(new m11(10, (PendingIntent) null, (String) null), (RuntimeException) null);
                                return;
                            }
                        } else if (ge1.w && (j73 = (j73) ge1.z) != null) {
                            iw2.j(j73, (Set) ge1.A);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        ng8.o(m11, (RuntimeException) null);
                        return;
                    }
                } else {
                    return;
                }
            case 17:
                uy5 uy5 = (uy5) this.y;
                x84 x84 = (x84) ((uw2) this.x).b;
                if (x84 != null) {
                    k68 k682 = x84.a;
                    try {
                        gl8 gl8 = gl8.a;
                        int i3 = rk8.a;
                        a99 u = a99.u((byte[]) uy5.x, gl8.b);
                        Iterator it = ((n99) k682.y).f.iterator();
                        boolean z5 = false;
                        while (it.hasNext()) {
                            List<String> t = u.t();
                            ((l89) it.next()).getClass();
                            q11 q11 = w89.i;
                            q11.getClass();
                            if (t == null || t.isEmpty()) {
                                z = false;
                            } else {
                                z = false;
                                for (String str2 : t) {
                                    d89 d89 = (d89) q11.a.get(str2);
                                    if (d89 != null) {
                                        w89 w89 = d89.a;
                                        if (!w89.e) {
                                            z2 = true;
                                        } else {
                                            ge2 ge2 = w89.a;
                                            if (ge2 != null && (ge2.a || ((dv5) ge2.e).b == 3 || w89.h.g())) {
                                                synchronized (w89) {
                                                    try {
                                                        ge2 ge22 = w89.a;
                                                        if (ge22 != null) {
                                                            if (!ge22.a) {
                                                                if (((dv5) ge22.e).b == 3) {
                                                                    z3 = true;
                                                                } else {
                                                                    z3 = false;
                                                                }
                                                                if (!z3) {
                                                                    if (w89.h.g()) {
                                                                    }
                                                                }
                                                            }
                                                            w89.a = null;
                                                            ((AtomicInteger) w89.g.x).incrementAndGet();
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                            z2 = false;
                                        }
                                        z |= z2;
                                    }
                                }
                            }
                            if (z && !z5) {
                                ((q99) k682.x).a();
                                z5 = true;
                            }
                        }
                        return;
                    } catch (zzaeh unused) {
                        return;
                    }
                } else {
                    return;
                }
            case 18:
                wg8 wg8 = (wg8) this.y;
                oh8 oh8 = (oh8) this.x;
                wg8.getClass();
                m11 m112 = oh8.x;
                if (m112.x == 0) {
                    th8 th8 = oh8.y;
                    z65.k(th8);
                    m11 m113 = th8.y;
                    if (m113.x == 0) {
                        ge1 ge12 = wg8.k;
                        IBinder iBinder = th8.x;
                        if (iBinder == null) {
                            j732 = null;
                        } else {
                            int i4 = v5.e;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof j73) {
                                j732 = (j73) queryLocalInterface;
                            } else {
                                j732 = new gg8(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                            }
                        }
                        Set set2 = wg8.h;
                        ge12.getClass();
                        if (j732 == null || set2 == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            ge12.c(new m11(4, (PendingIntent) null, (String) null));
                        } else {
                            ge12.z = j732;
                            ge12.A = set2;
                            if (ge12.w) {
                                ((iw2) ge12.y).j(j732, set2);
                            }
                        }
                    } else {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(m113)), new Exception());
                        wg8.k.c(m113);
                        wg8.j.c();
                        return;
                    }
                } else {
                    wg8.k.c(m112);
                }
                wg8.j.c();
                return;
            case 19:
                a39 a39 = (a39) this.x;
                a39.A();
                if (ts2.o()) {
                    a39.n0().l1(this);
                    return;
                }
                xq8 xq8 = (xq8) this.y;
                if (xq8.c != 0) {
                    i = 1;
                }
                xq8.c = 0;
                if (i != 0) {
                    xq8.a();
                    return;
                }
                return;
            case 20:
                yb9 yb9 = (yb9) this.x;
                boolean z6 = yb9.d;
                wu8 wu8 = (wu8) this.y;
                if (z6) {
                    wu8.z.p();
                    return;
                }
                try {
                    ((wu8) this.y).z.m(wu8.y.c(yb9));
                    return;
                } catch (RuntimeExecutionException e7) {
                    boolean z7 = e7.getCause() instanceof Exception;
                    wu8 wu82 = (wu8) this.y;
                    if (z7) {
                        wu82.z.o((Exception) e7.getCause());
                        return;
                    }
                    wu82.z.o(e7);
                    return;
                } catch (Exception e8) {
                    ((wu8) this.y).z.o(e8);
                    return;
                }
            case 21:
                wu8 wu83 = (wu8) this.y;
                try {
                    yb9 yb92 = (yb9) wu83.y.c((yb9) this.x);
                    if (yb92 == null) {
                        wu83.j(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    gv1 gv1 = yb7.b;
                    yb92.e(gv1, wu83);
                    yb92.d(gv1, wu83);
                    yb92.a(gv1, wu83);
                    return;
                } catch (RuntimeExecutionException e9) {
                    if (e9.getCause() instanceof Exception) {
                        wu83.z.o((Exception) e9.getCause());
                        return;
                    }
                    wu83.z.o(e9);
                    return;
                } catch (Exception e10) {
                    wu83.z.o(e10);
                    return;
                }
            case 22:
                t09 t09 = (t09) this.y;
                y19 y192 = t09.x.w;
                r19 r19 = y192.C;
                y19.g(r19);
                r19.b1();
                Bundle bundle2 = new Bundle();
                bundle2.putString("package_name", t09.w);
                try {
                    is8 is8 = (is8) ((ls8) this.x);
                    Parcel I = is8.I();
                    ds8.b(I, bundle2);
                    Parcel H = is8.H(I, 1);
                    Bundle bundle3 = (Bundle) ds8.a(H, Bundle.CREATOR);
                    H.recycle();
                    if (bundle3 == null) {
                        pz8 pz82 = y192.B;
                        y19.g(pz82);
                        pz82.B.a("Install Referrer Service returned a null response");
                    }
                } catch (Exception e11) {
                    pz8 pz83 = y192.B;
                    y19.g(pz83);
                    pz83.B.b("Exception occurred while retrieving the Install Referrer", e11.getMessage());
                }
                r19 r192 = y192.C;
                y19.g(r192);
                r192.b1();
                throw new IllegalStateException("Unexpected call on client side");
            case 23:
                c();
                return;
            case 24:
                d();
                return;
            case 25:
                w29 w29 = (w29) this.y;
                w29.d.T();
                xn8 xn8 = (xn8) this.x;
                Object f = xn8.y.f();
                v89 v89 = w29.d;
                if (f == null) {
                    v89.getClass();
                    String str3 = xn8.w;
                    z65.k(str3);
                    z99 N = v89.N(str3);
                    if (N != null) {
                        v89.Y(xn8, N);
                        return;
                    }
                    return;
                }
                v89.getClass();
                String str4 = xn8.w;
                z65.k(str4);
                z99 N2 = v89.N(str4);
                if (N2 != null) {
                    v89.X(xn8, N2);
                    return;
                }
                return;
            case 26:
                f();
                return;
            case 27:
                e();
                return;
            case 28:
                ju8 ju8 = (ju8) this.x;
                v49 v492 = (v49) this.y;
                o79 o79 = ((y19) v492.w).D;
                y19.f(o79);
                y19 y193 = (y19) o79.w;
                q09 q093 = y193.A;
                q09 q094 = y193.A;
                y19.e(q093);
                if (!q093.j1().i(f39.ANALYTICS_STORAGE)) {
                    pz8 pz84 = y193.B;
                    y19.g(pz84);
                    pz84.G.a("Analytics storage consent denied; will not get session id");
                } else {
                    y19.e(q094);
                    y193.G.getClass();
                    if (!q094.l1(System.currentTimeMillis())) {
                        y19.e(q094);
                        if (q094.M.a() != 0) {
                            y19.e(q094);
                            l = Long.valueOf(q094.M.a());
                            if (l == null) {
                                d99 d99 = ((y19) v492.w).E;
                                y19.e(d99);
                                d99.Q1(ju8, l.longValue());
                                return;
                            }
                            try {
                                ju8.z((Bundle) null);
                                return;
                            } catch (RemoteException e12) {
                                pz8 pz85 = ((y19) v492.w).B;
                                y19.g(pz85);
                                pz85.B.b("getSessionId failed with exception", e12);
                                return;
                            }
                        }
                    }
                }
                l = null;
                if (l == null) {
                }
            default:
                ((v49) this.y).t1((Boolean) this.x, true);
                return;
        }
        while (true) {
            try {
                ((Runnable) this.x).run();
            } catch (Throwable th3) {
                f64 f64 = (f64) this.y;
                synchronized (f64.C) {
                    f64.D.decrementAndGet(f64);
                    throw th3;
                }
            }
            Runnable o0 = ((f64) this.y).o0();
            if (o0 != null) {
                this.x = o0;
                i++;
                if (i >= 16) {
                    f64 f642 = (f64) this.y;
                    if (tv1.c(f642.z, f642)) {
                        f64 f643 = (f64) this.y;
                        tv1.b(f643.z, f643, this);
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public String toString() {
        int i = this.w;
        String str = "IDLE";
        Object obj = this.y;
        switch (i) {
            case b85.b:
                cf4 cf4 = new cf4(nt2.class.getSimpleName(), 3);
                hv2 hv2 = new hv2(16);
                ((hv2) cf4.z).x = hv2;
                cf4.z = hv2;
                hv2.y = (k68) obj;
                return cf4.toString();
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                Runnable runnable = (Runnable) this.x;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i2 = ((il6) obj).y;
                if (i2 != 1) {
                    if (i2 == 2) {
                        str = "QUEUING";
                    } else if (i2 == 3) {
                        str = "QUEUED";
                    } else if (i2 != 4) {
                        str = "null";
                    } else {
                        str = "RUNNING";
                    }
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            case 12:
                Runnable runnable2 = (Runnable) this.x;
                if (runnable2 != null) {
                    String valueOf = String.valueOf(runnable2);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 34);
                    sb2.append("SequentialExecutorWorker{running=");
                    sb2.append(valueOf);
                    sb2.append("}");
                    return sb2.toString();
                }
                int i3 = ((jl6) obj).y;
                if (i3 != 1) {
                    if (i3 == 2) {
                        str = "QUEUING";
                    } else if (i3 == 3) {
                        str = "QUEUED";
                    } else if (i3 != 4) {
                        str = "null";
                    } else {
                        str = "RUNNING";
                    }
                }
                StringBuilder sb3 = new StringBuilder(str.length() + 32);
                sb3.append("SequentialExecutorWorker{state=");
                sb3.append(str);
                sb3.append("}");
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ nt2(Object obj, boolean z, Object obj2, int i) {
        this.w = i;
        this.y = obj;
        this.x = obj2;
    }

    public /* synthetic */ nt2(Executor executor, int i) {
        this.w = i;
        this.y = executor;
    }

    public nt2(t09 t09, ls8 ls8, t09 t092) {
        this.w = 22;
        this.x = ls8;
        this.y = t09;
    }

    public /* synthetic */ nt2(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    public nt2(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.w = 14;
        this.y = swipeDismissBehavior;
        this.x = view;
    }
}
