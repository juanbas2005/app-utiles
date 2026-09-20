package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b46  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b46 implements of2 {
    public static final Random j = new Random();
    public static final HashMap k = new HashMap();
    public final HashMap a = new HashMap();
    public final Context b;
    public final ScheduledExecutorService c;
    public final oe2 d;
    public final we2 e;
    public final ke2 f;
    public final nu5 g;
    public final String h;
    public final HashMap i = new HashMap();

    /* JADX WARNING: type inference failed for: r5v2, types: [u30, java.lang.Object] */
    public b46(Context context, ScheduledExecutorService scheduledExecutorService, oe2 oe2, we2 we2, ke2 ke2, nu5 nu5) {
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = oe2;
        this.e = we2;
        this.f = ke2;
        this.g = nu5;
        oe2.a();
        this.h = oe2.c.b;
        AtomicReference atomicReference = a46.a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = a46.a;
        if (atomicReference2.get() == null) {
            ? obj = new Object();
            while (true) {
                if (!atomicReference2.compareAndSet((Object) null, obj)) {
                    if (atomicReference2.get() != null) {
                        break;
                    }
                } else {
                    v30.b(application);
                    v30.A.a(obj);
                    break;
                }
            }
        }
        b35.d(scheduledExecutorService, new oz0(2, this));
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized defpackage.nf2 a(defpackage.oe2 r13, java.lang.String r14, defpackage.we2 r15, defpackage.ke2 r16, java.util.concurrent.Executor r17, defpackage.qz0 r18, defpackage.qz0 r19, defpackage.qz0 r20, defpackage.wz0 r21, defpackage.xz0 r22, defpackage.d01 r23, defpackage.am6 r24) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.util.HashMap r0 = r12.a     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.containsKey(r14)     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x0068
            nf2 r1 = new nf2     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = "firebase"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0023
            r13.a()     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = r13.b     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = "[DEFAULT]"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0023
            r2 = r16
            goto L_0x0025
        L_0x0023:
            r0 = 0
            r2 = r0
        L_0x0025:
            android.content.Context r8 = r12.b     // Catch:{ all -> 0x0061 }
            monitor-enter(r12)     // Catch:{ all -> 0x0061 }
            jz0 r3 = new jz0     // Catch:{ all -> 0x0064 }
            java.util.concurrent.ScheduledExecutorService r11 = r12.c     // Catch:{ all -> 0x0064 }
            r4 = r13
            r9 = r14
            r5 = r15
            r7 = r19
            r6 = r21
            r10 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0064 }
            monitor-exit(r12)     // Catch:{ all -> 0x0061 }
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r11 = r24
            r10 = r3
            r3 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0061 }
            r19.b()     // Catch:{ all -> 0x0061 }
            r20.b()     // Catch:{ all -> 0x0061 }
            r18.b()     // Catch:{ all -> 0x0061 }
            java.util.HashMap r0 = r12.a     // Catch:{ all -> 0x0061 }
            r0.put(r14, r1)     // Catch:{ all -> 0x0061 }
            java.util.HashMap r0 = k     // Catch:{ all -> 0x0061 }
            r0.put(r14, r1)     // Catch:{ all -> 0x0061 }
            goto L_0x0068
        L_0x0061:
            r0 = move-exception
            r13 = r0
            goto L_0x0072
        L_0x0064:
            r0 = move-exception
            r13 = r0
            monitor-exit(r12)     // Catch:{ all -> 0x0064 }
            throw r13     // Catch:{ all -> 0x0061 }
        L_0x0068:
            java.util.HashMap r0 = r12.a     // Catch:{ all -> 0x0061 }
            java.lang.Object r13 = r0.get(r14)     // Catch:{ all -> 0x0061 }
            nf2 r13 = (defpackage.nf2) r13     // Catch:{ all -> 0x0061 }
            monitor-exit(r12)
            return r13
        L_0x0072:
            monitor-exit(r12)     // Catch:{ all -> 0x0061 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b46.a(oe2, java.lang.String, we2, ke2, java.util.concurrent.Executor, qz0, qz0, qz0, wz0, xz0, d01, am6):nf2");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065 A[Catch:{ all -> 0x0074, all -> 0x007a }] */
    public final synchronized nf2 b(String str) {
        Throwable th;
        b46 b46;
        d01 d01;
        xz0 xz0;
        kg5 kg5;
        try {
            qz0 c2 = c(str, "fetch");
            qz0 c3 = c(str, "activate");
            qz0 c4 = c(str, "defaults");
            Context context = this.b;
            String str2 = this.h;
            try {
                d01 = new d01(context.getSharedPreferences("frc_" + str2 + "_" + str + "_settings", 0));
                xz0 = new xz0(this.c, c3, c4);
                oe2 oe2 = this.d;
                nu5 nu5 = this.g;
                oe2.a();
                if (oe2.b.equals("[DEFAULT]")) {
                    try {
                        if (str.equals("firebase")) {
                            kg5 = new kg5(nu5);
                            if (kg5 != null) {
                                z36 z36 = new z36(kg5);
                                synchronized (xz0.a) {
                                    xz0.a.add(z36);
                                }
                            }
                            kg5 kg52 = new kg5(8, false);
                            kg52.x = c3;
                            kg52.y = c4;
                            ScheduledExecutorService scheduledExecutorService = this.c;
                            am6 am6 = new am6(22, false);
                            am6.A = Collections.newSetFromMap(new ConcurrentHashMap());
                            am6.x = c3;
                            am6.y = kg52;
                            am6.z = scheduledExecutorService;
                            b46 = this;
                            nf2 a2 = b46.a(this.d, str, this.e, this.f, this.c, c2, c3, c4, d(str, c2, d01), xz0, d01, am6);
                            return a2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        b46 = this;
                    }
                }
                kg5 = null;
                if (kg5 != null) {
                }
                kg5 kg522 = new kg5(8, false);
                kg522.x = c3;
                kg522.y = c4;
                ScheduledExecutorService scheduledExecutorService2 = this.c;
                am6 am62 = new am6(22, false);
                am62.A = Collections.newSetFromMap(new ConcurrentHashMap());
                am62.x = c3;
                am62.y = kg522;
                am62.z = scheduledExecutorService2;
                b46 = this;
            } catch (Throwable th3) {
                b46 = this;
                th = th3;
                throw th;
            }
            try {
                nf2 a22 = b46.a(this.d, str, this.e, this.f, this.c, c2, c3, c4, d(str, c2, d01), xz0, d01, am62);
                return a22;
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            b46 = this;
            th = th;
            throw th;
        }
    }

    public final qz0 c(String str, String str2) {
        e01 e01;
        qz0 qz0;
        String l = f21.l(f21.o("frc_", this.h, "_", str, "_"), str2, ".json");
        ScheduledExecutorService scheduledExecutorService = this.c;
        Context context = this.b;
        HashMap hashMap = e01.c;
        synchronized (e01.class) {
            try {
                HashMap hashMap2 = e01.c;
                if (!hashMap2.containsKey(l)) {
                    hashMap2.put(l, new e01(context, l));
                }
                e01 = (e01) hashMap2.get(l);
            } finally {
                while (true) {
                }
            }
        }
        HashMap hashMap3 = qz0.d;
        synchronized (qz0.class) {
            try {
                String str3 = e01.b;
                HashMap hashMap4 = qz0.d;
                if (!hashMap4.containsKey(str3)) {
                    hashMap4.put(str3, new qz0(scheduledExecutorService, e01));
                }
                qz0 = (qz0) hashMap4.get(str3);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return qz0;
    }

    public final synchronized wz0 d(String str, qz0 qz0, d01 d01) {
        wz0 wz0;
        Object aw0;
        d01 d012 = d01;
        synchronized (this) {
            try {
                we2 we2 = this.e;
                oe2 oe2 = this.d;
                oe2.a();
                if (oe2.b.equals("[DEFAULT]")) {
                    aw0 = this.g;
                } else {
                    aw0 = new aw0(9);
                }
                Object obj = aw0;
                ScheduledExecutorService scheduledExecutorService = this.c;
                Random random = j;
                oe2 oe22 = this.d;
                oe22.a();
                String str2 = oe22.c.a;
                oe2 oe23 = this.d;
                oe23.a();
                String str3 = oe23.c.b;
                String str4 = str;
                qz0 qz02 = qz0;
                wz0 = new wz0(we2, obj, scheduledExecutorService, random, qz02, new ConfigFetchHttpClient(this.b, str3, str2, str4, d012.a.getLong("fetch_timeout_in_seconds", 60), d012.a.getLong("fetch_timeout_in_seconds", 60)), d012, this.i);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return wz0;
    }
}
