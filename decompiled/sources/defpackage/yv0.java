package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Trace;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.common.api.ApiException;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: yv0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class yv0 implements xv0, e77, g61, c55, y45, zi0, ko1, ps6, xa6, y97 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ yv0(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    public void K(yb9 yb9) {
        ((FirebaseMessagingService) this.x).b((Intent) this.y);
    }

    public boolean a() {
        tn5 tn5 = (tn5) this.x;
        d20 d20 = (d20) this.y;
        if (!tn5.q) {
            tn5.h();
            long a = d20.a(tn5.o, d20.a);
            d20.a = a;
            tn5.q = !tn5.g(tn5.n, a + d20.b);
        }
        return tn5.q;
    }

    public Object apply(Object obj) {
        za6 za6 = (za6) this.x;
        u10 u10 = (u10) this.y;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        q00 q00 = za6.z;
        ArrayList o = za6.o(sQLiteDatabase, u10, q00.b);
        for (to5 to5 : to5.values()) {
            if (to5 != u10.c) {
                int size = q00.b - o.size();
                if (size <= 0) {
                    break;
                }
                o.addAll(za6.o(sQLiteDatabase, u10.b(to5), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < o.size(); i++) {
            sb.append(((e10) o.get(i)).a);
            if (i < o.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new ya6(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                Throwable th2 = th;
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = o.listIterator();
        while (listIterator.hasNext()) {
            e10 e10 = (e10) listIterator.next();
            long j2 = e10.a;
            if (hashMap.containsKey(Long.valueOf(j2))) {
                o00 c = e10.c.c();
                for (ya6 ya6 : (Set) hashMap.get(Long.valueOf(j2))) {
                    c.b(ya6.a, ya6.b);
                }
                listIterator.set(new e10(j2, e10.b, c.c()));
            }
        }
        return o;
    }

    public Object b(yi0 yi0) {
        int i = this.w;
        ev1 ev1 = ev1.w;
        Object obj = this.y;
        Executor executor = (Executor) this.x;
        switch (i) {
            case 10:
                mm0 mm0 = (mm0) obj;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                o84 o84 = new o84(atomicBoolean, 0);
                m56 m56 = yi0.c;
                if (m56 != null) {
                    m56.a(o84, ev1);
                }
                executor.execute(new ti(atomicBoolean, yi0, mm0, 7));
                return "setForegroundAsync";
            default:
                sr2 sr2 = (sr2) obj;
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                o84 o842 = new o84(atomicBoolean2, 1);
                m56 m562 = yi0.c;
                if (m562 != null) {
                    m562.a(o842, ev1);
                }
                executor.execute(new ti(atomicBoolean2, yi0, sr2, 14));
                return vs7.a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r9v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r9v11 */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public java.lang.Object c(defpackage.yb9 r14) {
        /*
            r13 = this;
            int r0 = r13.w
            r1 = 1
            r2 = 8
            r3 = 0
            switch(r0) {
                case 2: goto L_0x029f;
                case 3: goto L_0x0290;
                case 4: goto L_0x00f3;
                case 5: goto L_0x0009;
                case 6: goto L_0x0009;
                case 7: goto L_0x0096;
                case 8: goto L_0x0020;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r13.y
            r1 = r0
            kg5 r1 = (defpackage.kg5) r1
            java.lang.Object r13 = r13.x
            java.lang.String r13 = (java.lang.String) r13
            monitor-enter(r1)
            java.lang.Object r0 = r1.y     // Catch:{ all -> 0x001c }
            js r0 = (defpackage.js) r0     // Catch:{ all -> 0x001c }
            r0.remove(r13)     // Catch:{ all -> 0x001c }
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            return r14
        L_0x001c:
            r0 = move-exception
            r13 = r0
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            throw r13
        L_0x0020:
            java.lang.Object r0 = r13.y
            o9 r0 = (defpackage.o9) r0
            java.lang.Object r13 = r13.x
            r8 = r13
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r13 = r0.y
            oe2 r13 = (defpackage.oe2) r13
            boolean r1 = r14.k()
            if (r1 != 0) goto L_0x004f
            java.lang.Exception r13 = r14.h()
            if (r13 == 0) goto L_0x003e
            java.lang.Exception r13 = r14.h()
            goto L_0x004a
        L_0x003e:
            java.util.concurrent.ExecutionException r13 = new java.util.concurrent.ExecutionException
            java.lang.RuntimeException r14 = new java.lang.RuntimeException
            java.lang.String r0 = "Unexpected Error"
            r14.<init>(r0)
            r13.<init>(r14)
        L_0x004a:
            yb9 r13 = defpackage.b35.k(r13)
            goto L_0x0095
        L_0x004f:
            java.lang.Object r14 = r14.i()
            x00 r14 = (defpackage.x00) r14
            java.lang.String r9 = r14.a
            r13.a()
            cf2 r14 = r13.c
            java.lang.String r7 = r14.a
            r13.a()
            java.lang.String r6 = r14.b
            java.lang.String r5 = defpackage.gk4.c(r13)
            o26 r4 = new o26
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r13 = r0.x
            yf3 r13 = (defpackage.yf3) r13
            r13.getClass()
            za0 r14 = defpackage.i93.b()
            cc2 r0 = defpackage.dh4.z
            cc2[] r0 = new defpackage.cc2[]{r0}
            r14.e = r0
            k68 r0 = new k68
            r1 = 19
            r0.<init>(r1, r13, r4)
            r14.d = r0
            r0 = 39001(0x9859, float:5.4652E-41)
            r14.b = r0
            xg8 r14 = r14.a()
            yb9 r13 = r13.b(r3, r14)
        L_0x0095:
            return r13
        L_0x0096:
            java.lang.Object r0 = r13.x
            o9 r0 = (defpackage.o9) r0
            java.lang.Object r13 = r13.y
            java.util.concurrent.ExecutorService r13 = (java.util.concurrent.ExecutorService) r13
            r0.getClass()
            boolean r1 = r14.k()
            if (r1 != 0) goto L_0x00c3
            java.lang.Exception r13 = r14.h()
            if (r13 == 0) goto L_0x00b2
            java.lang.Exception r13 = r14.h()
            goto L_0x00be
        L_0x00b2:
            java.util.concurrent.ExecutionException r13 = new java.util.concurrent.ExecutionException
            java.lang.RuntimeException r14 = new java.lang.RuntimeException
            java.lang.String r0 = "Unexpected Error"
            r14.<init>(r0)
            r13.<init>(r14)
        L_0x00be:
            yb9 r13 = defpackage.b35.k(r13)
            goto L_0x00f2
        L_0x00c3:
            java.lang.Object r14 = r14.i()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r1 = r0.z
            we2 r1 = (defpackage.we2) r1
            ve2 r1 = (defpackage.ve2) r1
            yb9 r1 = r1.d()
            ar4 r3 = new ar4
            java.lang.String r4 = "Firebase-Messaging-Network-Io"
            r3.<init>(r4)
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newSingleThreadExecutor(r3)
            yv0 r4 = new yv0
            r4.<init>((int) r2, (java.lang.Object) r0, (java.lang.String) r14)
            yb9 r0 = r1.g(r3, r4)
            c9 r1 = new c9
            r2 = 10
            r1.<init>(r2, r14)
            yb9 r13 = r0.f(r13, r1)
        L_0x00f2:
            return r13
        L_0x00f3:
            java.lang.Object r14 = r13.x
            r4 = r14
            a01 r4 = (defpackage.a01) r4
            java.lang.Object r13 = r13.y
            yb9 r13 = (defpackage.yb9) r13
            java.lang.String r14 = "Unable to connect to the server. Try again in a few minutes. HTTP status code: %d"
            xb4 r5 = r4.p
            r6 = 403(0x193, float:5.65E-43)
            r7 = 200(0xc8, float:2.8E-43)
            r8 = 0
            boolean r0 = r13.k()     // Catch:{ IOException -> 0x01ad, all -> 0x01a8 }
            if (r0 == 0) goto L_0x01b1
            java.lang.Object r13 = r13.i()     // Catch:{ IOException -> 0x01ad, all -> 0x01a8 }
            java.net.HttpURLConnection r13 = (java.net.HttpURLConnection) r13     // Catch:{ IOException -> 0x01ad, all -> 0x01a8 }
            r4.f = r13     // Catch:{ IOException -> 0x01ad, all -> 0x01a8 }
            java.io.InputStream r13 = r13.getInputStream()     // Catch:{ IOException -> 0x01ad, all -> 0x01a8 }
            java.net.HttpURLConnection r0 = r4.f     // Catch:{ IOException -> 0x01a4, all -> 0x01a0 }
            java.io.InputStream r9 = r0.getErrorStream()     // Catch:{ IOException -> 0x01a4, all -> 0x01a0 }
            java.net.HttpURLConnection r0 = r4.f     // Catch:{ IOException -> 0x019d, all -> 0x019a }
            int r0 = r0.getResponseCode()     // Catch:{ IOException -> 0x019d, all -> 0x019a }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x019d, all -> 0x019a }
            if (r0 != r7) goto L_0x014a
            monitor-enter(r4)     // Catch:{ IOException -> 0x0144 }
            r4.c = r2     // Catch:{ all -> 0x0147 }
            monitor-exit(r4)     // Catch:{ IOException -> 0x0144 }
            d01 r11 = r4.q     // Catch:{ IOException -> 0x0144 }
            java.util.Date r12 = defpackage.d01.f     // Catch:{ IOException -> 0x0144 }
            r11.e(r3, r12)     // Catch:{ IOException -> 0x0144 }
            java.net.HttpURLConnection r11 = r4.f     // Catch:{ IOException -> 0x0144 }
            nz0 r11 = r4.j(r11)     // Catch:{ IOException -> 0x0144 }
            r4.g = r11     // Catch:{ IOException -> 0x0144 }
            r11.c()     // Catch:{ IOException -> 0x0144 }
            goto L_0x014a
        L_0x0140:
            r0 = move-exception
        L_0x0141:
            r8 = r13
            goto L_0x0231
        L_0x0144:
            r0 = move-exception
            goto L_0x01bb
        L_0x0147:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0147 }
            throw r0     // Catch:{ IOException -> 0x0144 }
        L_0x014a:
            r4.b(r13, r9)
            monitor-enter(r4)
            r4.b = r3     // Catch:{ all -> 0x0196 }
            monitor-exit(r4)
            boolean r13 = r4.e
            if (r13 != 0) goto L_0x015c
            boolean r13 = defpackage.a01.d(r0)
            if (r13 == 0) goto L_0x015c
            goto L_0x015d
        L_0x015c:
            r1 = r3
        L_0x015d:
            if (r1 == 0) goto L_0x016e
            java.util.Date r13 = new java.util.Date
            r5.getClass()
            long r11 = java.lang.System.currentTimeMillis()
            r13.<init>(r11)
            r4.k(r13)
        L_0x016e:
            if (r1 != 0) goto L_0x0191
            if (r0 != r7) goto L_0x0173
            goto L_0x0191
        L_0x0173:
            java.lang.Object[] r13 = new java.lang.Object[]{r10}
            java.lang.String r13 = java.lang.String.format(r14, r13)
            if (r0 != r6) goto L_0x0187
            java.net.HttpURLConnection r13 = r4.f
            java.io.InputStream r13 = r13.getErrorStream()
            java.lang.String r13 = defpackage.a01.f(r13)
        L_0x0187:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r14 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException
            r14.<init>((int) r0, (int) r3, (java.lang.String) r13)
        L_0x018c:
            r4.g()
            goto L_0x0224
        L_0x0191:
            r4.h()
            goto L_0x0224
        L_0x0196:
            r0 = move-exception
            r13 = r0
            monitor-exit(r4)     // Catch:{ all -> 0x0196 }
            throw r13
        L_0x019a:
            r0 = move-exception
            r10 = r8
            goto L_0x0141
        L_0x019d:
            r0 = move-exception
            r10 = r8
            goto L_0x01bb
        L_0x01a0:
            r0 = move-exception
            r9 = r8
            r10 = r9
            goto L_0x0141
        L_0x01a4:
            r0 = move-exception
            r9 = r8
        L_0x01a6:
            r10 = r9
            goto L_0x01bb
        L_0x01a8:
            r0 = move-exception
            r9 = r8
            r10 = r9
            goto L_0x0231
        L_0x01ad:
            r0 = move-exception
            r13 = r8
            r9 = r13
            goto L_0x01a6
        L_0x01b1:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01ad, all -> 0x01a8 }
            java.lang.Exception r13 = r13.h()     // Catch:{ IOException -> 0x01ad, all -> 0x01a8 }
            r0.<init>(r13)     // Catch:{ IOException -> 0x01ad, all -> 0x01a8 }
            throw r0     // Catch:{ IOException -> 0x01ad, all -> 0x01a8 }
        L_0x01bb:
            boolean r11 = r4.e     // Catch:{ all -> 0x0140 }
            if (r11 == 0) goto L_0x01c7
            monitor-enter(r4)     // Catch:{ all -> 0x0140 }
            r4.c = r2     // Catch:{ all -> 0x01c4 }
            monitor-exit(r4)     // Catch:{ all -> 0x0140 }
            goto L_0x01ce
        L_0x01c4:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01c4 }
            throw r0     // Catch:{ all -> 0x0140 }
        L_0x01c7:
            java.lang.String r2 = "FirebaseRemoteConfig"
            java.lang.String r11 = "Exception connecting to real-time RC backend. Retrying the connection..."
            android.util.Log.d(r2, r11, r0)     // Catch:{ all -> 0x0140 }
        L_0x01ce:
            r4.b(r13, r9)
            monitor-enter(r4)
            r4.b = r3     // Catch:{ all -> 0x022d }
            monitor-exit(r4)
            boolean r13 = r4.e
            if (r13 != 0) goto L_0x01e6
            if (r10 == 0) goto L_0x01e7
            int r13 = r10.intValue()
            boolean r13 = defpackage.a01.d(r13)
            if (r13 == 0) goto L_0x01e6
            goto L_0x01e7
        L_0x01e6:
            r1 = r3
        L_0x01e7:
            if (r1 == 0) goto L_0x01f8
            java.util.Date r13 = new java.util.Date
            r5.getClass()
            long r11 = java.lang.System.currentTimeMillis()
            r13.<init>(r11)
            r4.k(r13)
        L_0x01f8:
            if (r1 != 0) goto L_0x0191
            int r13 = r10.intValue()
            if (r13 != r7) goto L_0x0201
            goto L_0x0191
        L_0x0201:
            java.lang.Object[] r13 = new java.lang.Object[]{r10}
            java.lang.String r13 = java.lang.String.format(r14, r13)
            int r14 = r10.intValue()
            if (r14 != r6) goto L_0x0219
            java.net.HttpURLConnection r13 = r4.f
            java.io.InputStream r13 = r13.getErrorStream()
            java.lang.String r13 = defpackage.a01.f(r13)
        L_0x0219:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r14 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException
            int r0 = r10.intValue()
            r14.<init>((int) r0, (int) r3, (java.lang.String) r13)
            goto L_0x018c
        L_0x0224:
            r4.f = r8
            r4.g = r8
            yb9 r13 = defpackage.b35.l(r8)
            return r13
        L_0x022d:
            r0 = move-exception
            r13 = r0
            monitor-exit(r4)     // Catch:{ all -> 0x022d }
            throw r13
        L_0x0231:
            r4.b(r8, r9)
            monitor-enter(r4)
            r4.b = r3     // Catch:{ all -> 0x028c }
            monitor-exit(r4)
            boolean r13 = r4.e
            if (r13 != 0) goto L_0x0249
            if (r10 == 0) goto L_0x024a
            int r13 = r10.intValue()
            boolean r13 = defpackage.a01.d(r13)
            if (r13 == 0) goto L_0x0249
            goto L_0x024a
        L_0x0249:
            r1 = r3
        L_0x024a:
            if (r1 == 0) goto L_0x025b
            java.util.Date r13 = new java.util.Date
            r5.getClass()
            long r8 = java.lang.System.currentTimeMillis()
            r13.<init>(r8)
            r4.k(r13)
        L_0x025b:
            if (r1 != 0) goto L_0x0288
            int r13 = r10.intValue()
            if (r13 == r7) goto L_0x0288
            java.lang.Object[] r13 = new java.lang.Object[]{r10}
            java.lang.String r13 = java.lang.String.format(r14, r13)
            int r14 = r10.intValue()
            if (r14 != r6) goto L_0x027b
            java.net.HttpURLConnection r13 = r4.f
            java.io.InputStream r13 = r13.getErrorStream()
            java.lang.String r13 = defpackage.a01.f(r13)
        L_0x027b:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r14 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException
            int r1 = r10.intValue()
            r14.<init>((int) r1, (int) r3, (java.lang.String) r13)
            r4.g()
            goto L_0x028b
        L_0x0288:
            r4.h()
        L_0x028b:
            throw r0
        L_0x028c:
            r0 = move-exception
            r13 = r0
            monitor-exit(r4)     // Catch:{ all -> 0x028c }
            throw r13
        L_0x0290:
            java.lang.Object r0 = r13.x
            wz0 r0 = (defpackage.wz0) r0
            java.lang.Object r13 = r13.y
            java.util.HashMap r13 = (java.util.HashMap) r13
            r1 = 0
            yb9 r13 = r0.b(r14, r1, r13)
            return r13
        L_0x029f:
            java.lang.Object r0 = r13.x
            wz0 r0 = (defpackage.wz0) r0
            java.lang.Object r13 = r13.y
            java.util.Date r13 = (java.util.Date) r13
            boolean r2 = r14.k()
            if (r2 == 0) goto L_0x02d4
            java.lang.Object r0 = r0.g
            d01 r0 = (defpackage.d01) r0
            java.lang.Object r2 = r0.b
            monitor-enter(r2)
            android.content.SharedPreferences r0 = r0.a     // Catch:{ all -> 0x02d0 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x02d0 }
            java.lang.String r1 = "last_fetch_status"
            r3 = -1
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r3)     // Catch:{ all -> 0x02d0 }
            java.lang.String r1 = "last_fetch_time_in_millis"
            long r3 = r13.getTime()     // Catch:{ all -> 0x02d0 }
            android.content.SharedPreferences$Editor r13 = r0.putLong(r1, r3)     // Catch:{ all -> 0x02d0 }
            r13.apply()     // Catch:{ all -> 0x02d0 }
            monitor-exit(r2)     // Catch:{ all -> 0x02d0 }
            goto L_0x030d
        L_0x02d0:
            r0 = move-exception
            r13 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x02d0 }
            throw r13
        L_0x02d4:
            java.lang.Exception r13 = r14.h()
            if (r13 != 0) goto L_0x02db
            goto L_0x030d
        L_0x02db:
            boolean r13 = r13 instanceof com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException
            java.lang.Object r0 = r0.g
            d01 r0 = (defpackage.d01) r0
            java.lang.Object r2 = r0.b
            if (r13 == 0) goto L_0x02fc
            monitor-enter(r2)
            android.content.SharedPreferences r13 = r0.a     // Catch:{ all -> 0x02f8 }
            android.content.SharedPreferences$Editor r13 = r13.edit()     // Catch:{ all -> 0x02f8 }
            java.lang.String r0 = "last_fetch_status"
            r1 = 2
            android.content.SharedPreferences$Editor r13 = r13.putInt(r0, r1)     // Catch:{ all -> 0x02f8 }
            r13.apply()     // Catch:{ all -> 0x02f8 }
            monitor-exit(r2)     // Catch:{ all -> 0x02f8 }
            goto L_0x030d
        L_0x02f8:
            r0 = move-exception
            r13 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x02f8 }
            throw r13
        L_0x02fc:
            monitor-enter(r2)
            android.content.SharedPreferences r13 = r0.a     // Catch:{ all -> 0x030e }
            android.content.SharedPreferences$Editor r13 = r13.edit()     // Catch:{ all -> 0x030e }
            java.lang.String r0 = "last_fetch_status"
            android.content.SharedPreferences$Editor r13 = r13.putInt(r0, r1)     // Catch:{ all -> 0x030e }
            r13.apply()     // Catch:{ all -> 0x030e }
            monitor-exit(r2)     // Catch:{ all -> 0x030e }
        L_0x030d:
            return r14
        L_0x030e:
            r0 = move-exception
            r13 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x030e }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv0.c(yb9):java.lang.Object");
    }

    public Object d(kd6 kd6) {
        int i = this.w;
        Object obj = this.y;
        String str = (String) this.x;
        switch (i) {
            case b85.b:
                gv0 gv0 = (gv0) obj;
                try {
                    Trace.beginSection(str);
                    return gv0.f.d(kd6);
                } finally {
                    Trace.endSection();
                }
            default:
                Context context = (Context) kd6.a(Context.class);
                int i2 = ((ta1) obj).w;
                String str2 = "";
                switch (i2) {
                    case 21:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            str2 = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        break;
                    case 22:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            str2 = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                        break;
                    case 23:
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        str2 = "embedded";
                                        break;
                                    }
                                } else {
                                    str2 = "auto";
                                    break;
                                }
                            } else {
                                str2 = "watch";
                                break;
                            }
                        } else {
                            str2 = "tv";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            str2 = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                        break;
                }
                return new y00(str, str2);
        }
    }

    public void e(nu5 nu5) {
        ((ko1) this.x).e(nu5);
        ((ko1) this.y).e(nu5);
    }

    public Object f() {
        int i = this.w;
        Object obj = this.y;
        z00 z00 = (z00) this.x;
        switch (i) {
            case 16:
                Iterable iterable = (Iterable) obj;
                za6 za6 = (za6) z00.c;
                za6.getClass();
                if (iterable.iterator().hasNext()) {
                    za6.a().compileStatement("DELETE FROM events WHERE _id in ".concat(za6.B(iterable))).execute();
                }
                return null;
            default:
                for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                    ((za6) z00.i).u((long) ((Integer) entry.getValue()).intValue(), sb4.C, (String) entry.getKey());
                }
                return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0084 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
    public void j(Exception exc) {
        String str;
        GetCredentialException getCredentialException;
        rb1 rb1 = (rb1) this.x;
        CancellationSignal cancellationSignal = (CancellationSignal) this.y;
        if (!(exc instanceof ApiException) || !sb1.a.contains(Integer.valueOf(((ApiException) exc).w.w))) {
            str = "GET_NO_CREDENTIALS";
        } else {
            str = "GET_INTERRUPTED";
        }
        String str2 = "During begin sign in, failure response from one tap: " + exc.getMessage();
        int hashCode = str.hashCode();
        if (hashCode != -1567968963) {
            if (hashCode != -154594663) {
                if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                    getCredentialException = new NoCredentialException(str2);
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (ac1.a(cancellationSignal)) {
                        rb1.d().execute(new pb1(rb1, getCredentialException, 0));
                        return;
                    }
                    return;
                }
            } else if (str.equals("GET_INTERRUPTED")) {
                getCredentialException = new GetCredentialInterruptedException(str2);
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (ac1.a(cancellationSignal)) {
                }
            }
        } else if (str.equals("GET_CANCELED_TAG")) {
            getCredentialException = new GetCredentialCancellationException(str2);
            CredentialProviderPlayServicesImpl.Companion.getClass();
            if (ac1.a(cancellationSignal)) {
            }
        }
        getCredentialException = new GetCredentialUnknownException(str2);
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (ac1.a(cancellationSignal)) {
        }
    }

    public yb9 q(Object obj) {
        qz0 qz0 = (qz0) this.x;
        sz0 sz0 = (sz0) this.y;
        Void voidR = (Void) obj;
        synchronized (qz0) {
            qz0.c = b35.l(sz0);
        }
        return b35.l(sz0);
    }

    public /* synthetic */ yv0(int i, Object obj, String str) {
        this.w = i;
        this.y = obj;
        this.x = str;
    }
}
