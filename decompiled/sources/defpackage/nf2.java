package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: nf2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nf2 {
    public final ke2 a;
    public final Executor b;
    public final qz0 c;
    public final qz0 d;
    public final wz0 e;
    public final xz0 f;
    public final d01 g;
    public final jz0 h;
    public final am6 i;

    public nf2(ke2 ke2, Executor executor, qz0 qz0, qz0 qz02, qz0 qz03, wz0 wz0, xz0 xz0, d01 d01, jz0 jz0, am6 am6) {
        this.a = ke2;
        this.b = executor;
        this.c = qz0;
        this.d = qz02;
        this.e = wz0;
        this.f = xz0;
        this.g = d01;
        this.h = jz0;
        this.i = am6;
    }

    public static ArrayList d(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    public final HashMap a() {
        String str;
        qf2 qf2;
        xz0 xz0 = this.f;
        HashSet hashSet = new HashSet();
        hashSet.addAll(xz0.a(xz0.c));
        hashSet.addAll(xz0.a(xz0.d));
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            sz0 c2 = xz0.c.c();
            String str3 = null;
            if (c2 != null) {
                try {
                    str = c2.b.getString(str2);
                } catch (JSONException unused) {
                }
                if (str == null) {
                    sz0 c3 = xz0.c.c();
                    if (c3 != null) {
                        synchronized (xz0.a) {
                            try {
                                Iterator it2 = xz0.a.iterator();
                                while (it2.hasNext()) {
                                    xz0.b.execute(new ti((z36) it2.next(), str2, c3, 3));
                                }
                            } catch (Throwable th) {
                                while (true) {
                                    throw th;
                                }
                            }
                        }
                    }
                    qf2 = new qf2(str, 2);
                } else {
                    sz0 c4 = xz0.d.c();
                    if (c4 != null) {
                        try {
                            str3 = c4.b.getString(str2);
                        } catch (JSONException unused2) {
                        }
                    }
                    if (str3 != null) {
                        qf2 = new qf2(str3, 1);
                    } else {
                        Log.w("FirebaseRemoteConfig", "No value of type 'FirebaseRemoteConfigValue' exists for parameter key '" + str2 + "'.");
                        qf2 = new qf2("", 0);
                    }
                }
                hashMap.put(str2, qf2);
            }
            str = null;
            if (str == null) {
            }
            hashMap.put(str2, qf2);
        }
        return hashMap;
    }

    public final bc4 b() {
        bc4 bc4;
        d01 d01 = this.g;
        synchronized (d01.b) {
            try {
                d01.a.getLong("last_fetch_time_in_millis", -1);
                int i2 = d01.a.getInt("last_fetch_status", 0);
                long j = d01.a.getLong("fetch_timeout_in_seconds", 60);
                if (j >= 0) {
                    long j2 = d01.a.getLong("minimum_fetch_interval_in_seconds", 43200);
                    if (j2 >= 0) {
                        bc4 = new bc4(i2, 2);
                    } else {
                        throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j2 + " is an invalid argument");
                    }
                } else {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", new Object[]{Long.valueOf(j)}));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bc4;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void c(boolean r5) {
        /*
            r4 = this;
            jz0 r4 = r4.h
            monitor-enter(r4)
            java.lang.Object r0 = r4.y     // Catch:{ all -> 0x0048 }
            a01 r0 = (defpackage.a01) r0     // Catch:{ all -> 0x0048 }
            java.lang.Object r1 = r0.r     // Catch:{ all -> 0x0048 }
            monitor-enter(r1)     // Catch:{ all -> 0x0048 }
            r0.e = r5     // Catch:{ all -> 0x0013 }
            nz0 r2 = r0.g     // Catch:{ all -> 0x0013 }
            if (r2 == 0) goto L_0x0015
            r2.a = r5     // Catch:{ all -> 0x0013 }
            goto L_0x0015
        L_0x0013:
            r5 = move-exception
            goto L_0x0044
        L_0x0015:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0013 }
            r3 = 26
            if (r2 < r3) goto L_0x0024
            if (r5 == 0) goto L_0x0024
            java.net.HttpURLConnection r0 = r0.f     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0024
            r0.disconnect()     // Catch:{ all -> 0x0013 }
        L_0x0024:
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            if (r5 != 0) goto L_0x0042
            monitor-enter(r4)     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = r4.x     // Catch:{ all -> 0x003c }
            java.util.LinkedHashSet r5 = (java.util.LinkedHashSet) r5     // Catch:{ all -> 0x003c }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x003c }
            if (r5 != 0) goto L_0x003e
            java.lang.Object r5 = r4.y     // Catch:{ all -> 0x003c }
            a01 r5 = (defpackage.a01) r5     // Catch:{ all -> 0x003c }
            r0 = 0
            r5.e(r0)     // Catch:{ all -> 0x003c }
            goto L_0x003e
        L_0x003c:
            r5 = move-exception
            goto L_0x0040
        L_0x003e:
            monitor-exit(r4)     // Catch:{ all -> 0x0048 }
            goto L_0x0042
        L_0x0040:
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            throw r5     // Catch:{ all -> 0x0048 }
        L_0x0042:
            monitor-exit(r4)
            return
        L_0x0044:
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            throw r5     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r4)     // Catch:{ all -> 0x0048 }
            throw r5
        L_0x0048:
            r5 = move-exception
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nf2.c(boolean):void");
    }
}
