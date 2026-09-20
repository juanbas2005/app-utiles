package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: i88  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i88 {
    public static volatile ScheduledExecutorService n;
    public static final Object o = new Object();
    public final Object a = new Object();
    public final PowerManager.WakeLock b;
    public int c = 0;
    public ScheduledFuture d;
    public long e;
    public final HashSet f = new HashSet();
    public boolean g = true;
    public zq8 h;
    public final xb4 i = xb4.P;
    public final String j;
    public final HashMap k = new HashMap();
    public final AtomicInteger l = new AtomicInteger(0);
    public final ScheduledExecutorService m;

    public i88(Context context) {
        boolean z;
        String str;
        String packageName = context.getPackageName();
        z65.i("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            if ("wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
                str = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
            } else {
                str = new String("*gcore*:");
            }
            this.j = str;
        } else {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            Method method = yd8.a;
            synchronized (yd8.class) {
                Boolean bool = yd8.c;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    if (ag8.k(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    yd8.c = Boolean.valueOf(z);
                }
            }
            if (z) {
                int i2 = c57.a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (!(context.getPackageManager() == null || packageName == null)) {
                    try {
                        ApplicationInfo b2 = cf8.a(context).b(0, packageName);
                        if (b2 == null) {
                            Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                        } else {
                            int i3 = b2.uid;
                            workSource = new WorkSource();
                            Method method2 = yd8.b;
                            if (method2 != null) {
                                try {
                                    method2.invoke(workSource, new Object[]{Integer.valueOf(i3), packageName});
                                } catch (Exception e2) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                                }
                            } else {
                                Method method3 = yd8.a;
                                if (method3 != null) {
                                    try {
                                        method3.invoke(workSource, new Object[]{Integer.valueOf(i3)});
                                    } catch (Exception e3) {
                                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
                                    }
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                    }
                }
                if (workSource != null) {
                    try {
                        this.b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e4) {
                        Log.wtf("WakeLock", e4.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = n;
            if (scheduledExecutorService == null) {
                synchronized (o) {
                    try {
                        scheduledExecutorService = n;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            n = scheduledExecutorService;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.m = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("expected a non-null reference", 0, 29);
        throw new RuntimeException(sb.toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: zs8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: zs8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: zs8} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void a() {
        this.l.incrementAndGet();
        long j2 = Long.MAX_VALUE;
        long min = Math.min(60000, Math.max(Math.min(Long.MAX_VALUE, 31622400000L), 1));
        synchronized (this.a) {
            try {
                if (!b()) {
                    this.h = zq8.w;
                    this.b.acquire();
                    this.i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.c++;
                if (this.g) {
                    TextUtils.isEmpty((CharSequence) null);
                }
                zs8 zs8 = (zs8) this.k.get((Object) null);
                zs8 zs82 = zs8;
                if (zs8 == null) {
                    Object obj = new Object();
                    this.k.put((Object) null, obj);
                    zs82 = obj;
                }
                zs82.a++;
                this.i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > min) {
                    j2 = elapsedRealtime + min;
                }
                if (j2 > this.e) {
                    this.e = j2;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.m.schedule(new ge(22, (Object) this), min, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            if (this.c > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void c() {
        if (this.l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.j).concat(" release without a matched acquire!"));
        }
        synchronized (this.a) {
            try {
                if (this.g) {
                    TextUtils.isEmpty((CharSequence) null);
                }
                if (this.k.containsKey((Object) null)) {
                    zs8 zs8 = (zs8) this.k.get((Object) null);
                    if (zs8 != null) {
                        int i2 = zs8.a - 1;
                        zs8.a = i2;
                        if (i2 == 0) {
                            this.k.remove((Object) null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f;
        if (!hashSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(hashSet);
            hashSet.clear();
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                ku4.a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a4, code lost:
        return;
     */
    public final void e() {
        synchronized (this.a) {
            try {
                if (b()) {
                    if (this.g) {
                        int i2 = this.c - 1;
                        this.c = i2;
                        if (i2 > 0) {
                            return;
                        }
                    } else {
                        this.c = 0;
                    }
                    d();
                    for (zs8 zs8 : this.k.values()) {
                        zs8.a = 0;
                    }
                    this.k.clear();
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.d = null;
                        this.e = 0;
                    }
                    if (this.b.isHeld()) {
                        this.b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.j).concat(" should be held!"));
                    }
                }
            } catch (RuntimeException e2) {
                if (e2.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(this.j).concat(" failed to release!"), e2);
                    if (this.h != null) {
                        this.h = null;
                    }
                } else {
                    throw e2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
