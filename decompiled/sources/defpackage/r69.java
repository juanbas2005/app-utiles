package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: r69  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r69 extends fy8 {
    public volatile Boolean A;
    public final z59 B;
    public ScheduledExecutorService C;
    public final cp0 D;
    public final ArrayList E = new ArrayList();
    public final z59 F;
    public final m69 y;
    public iy8 z;

    public r69(y19 y19) {
        super(y19);
        this.D = new cp0(y19.G);
        this.y = new m69(this);
        this.B = new z59(this, y19, 0);
        this.F = new z59(this, y19, 1);
    }

    public final boolean f1() {
        return false;
    }

    public final void g1(AtomicReference atomicReference) {
        b1();
        d1();
        q1(new z46(this, atomicReference, s1(false)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    public final void h1(Bundle bundle) {
        boolean z2;
        boolean z3;
        b1();
        d1();
        ur8 ur8 = new ur8(bundle);
        o1();
        y19 y19 = (y19) this.w;
        if (y19.z.n1((String) null, by8.W0)) {
            cz8 i = y19.i();
            y19 y192 = (y19) i.w;
            d99 d99 = y192.E;
            pz8 pz8 = y192.B;
            y19.e(d99);
            byte[] L1 = d99.L1(ur8);
            if (L1 == null) {
                y19.g(pz8);
                pz8.C.a("Null default event parameters; not writing to database");
            } else if (L1.length > 131072) {
                y19.g(pz8);
                pz8.C.a("Default event parameters too long for local database. Sending directly to service");
            } else {
                z3 = i.j1(4, L1);
                if (z3) {
                    z2 = true;
                    q1(new w39(this, s1(false), z2, ur8, bundle));
                }
            }
            z3 = false;
            if (z3) {
            }
        }
        z2 = false;
        q1(new w39(this, s1(false), z2, ur8, bundle));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [y50, hz8] */
    public final void i1() {
        b1();
        d1();
        if (!t1()) {
            if (!j1()) {
                y19 y19 = (y19) this.w;
                if (!y19.z.f1()) {
                    List<ResolveInfo> queryIntentServices = y19.w.getPackageManager().queryIntentServices(new Intent().setClassName(y19.w, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        pz8 pz8 = y19.B;
                        y19.g(pz8);
                        pz8.B.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                        return;
                    }
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    intent.setComponent(new ComponentName(y19.w, "com.google.android.gms.measurement.AppMeasurementService"));
                    m69 m69 = this.y;
                    r69 r69 = m69.y;
                    r69.b1();
                    Context context = ((y19) r69.w).w;
                    q11 b = q11.b();
                    synchronized (m69) {
                        try {
                            boolean z2 = m69.w;
                            r69 r692 = m69.y;
                            if (z2) {
                                pz8 pz82 = ((y19) r692.w).B;
                                y19.g(pz82);
                                pz82.J.a("Connection attempt already in progress");
                                return;
                            }
                            pz8 pz83 = ((y19) r692.w).B;
                            y19.g(pz83);
                            pz83.J.a("Using local app measurement service");
                            m69.w = true;
                            b.a(context, intent, r692.y, 129);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                m69 m692 = this.y;
                r69 r693 = m692.y;
                r693.b1();
                Context context2 = ((y19) r693.w).w;
                synchronized (m692) {
                    try {
                        if (m692.w) {
                            pz8 pz84 = ((y19) m692.y.w).B;
                            y19.g(pz84);
                            pz84.J.a("Connection attempt already in progress");
                        } else if (m692.x == null || (!m692.x.q() && !m692.x.p())) {
                            m692.x = new y50(context2, Looper.getMainLooper(), g99.a(context2), mw2.b, 93, m692, m692, (String) null);
                            pz8 pz85 = ((y19) m692.y.w).B;
                            y19.g(pz85);
                            pz85.J.a("Connecting to remote service");
                            m692.w = true;
                            z65.k(m692.x);
                            m692.x.a();
                        } else {
                            pz8 pz86 = ((y19) m692.y.w).B;
                            y19.g(pz86);
                            pz86.J.a("Already awaiting connection attempt");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010f  */
    public final boolean j1() {
        Boolean bool;
        b1();
        d1();
        if (this.A == null) {
            b1();
            d1();
            y19 y19 = (y19) this.w;
            q09 q09 = y19.A;
            y19.e(q09);
            q09.b1();
            boolean z2 = false;
            if (!q09.g1().contains("use_service")) {
                bool = null;
            } else {
                bool = Boolean.valueOf(q09.g1().getBoolean("use_service", false));
            }
            boolean z3 = true;
            if (bool == null || !bool.booleanValue()) {
                vy8 l = ((y19) this.w).l();
                l.d1();
                if (l.J != 1) {
                    pz8 pz8 = y19.B;
                    y19.g(pz8);
                    pz8.J.a("Checking service availability");
                    d99 d99 = y19.E;
                    y19.e(d99);
                    int b = mw2.b.b(((y19) d99.w).w, 12451000);
                    if (b != 0) {
                        if (b == 1) {
                            pz8 pz82 = y19.B;
                            y19.g(pz82);
                            pz82.J.a("Service missing");
                        } else if (b != 2) {
                            if (b != 3) {
                                pz8 pz83 = y19.B;
                                if (b == 9) {
                                    y19.g(pz83);
                                    pz83.E.a("Service invalid");
                                } else if (b != 18) {
                                    y19.g(pz83);
                                    pz83.E.b("Unexpected service status", Integer.valueOf(b));
                                } else {
                                    y19.g(pz83);
                                    pz83.E.a("Service updating");
                                }
                            } else {
                                pz8 pz84 = y19.B;
                                y19.g(pz84);
                                pz84.E.a("Service disabled");
                            }
                            z3 = false;
                        } else {
                            pz8 pz85 = y19.B;
                            y19.g(pz85);
                            pz85.I.a("Service container out of date");
                            d99 d992 = y19.E;
                            y19.e(d992);
                            if (d992.N1() >= 17443) {
                                if (bool != null) {
                                    z3 = false;
                                }
                                z2 = z3;
                                z3 = false;
                            }
                        }
                        if (!z2 && y19.z.f1()) {
                            pz8 pz86 = y19.B;
                            y19.g(pz86);
                            pz86.B.a("No way to upload. Consider using the full version of Analytics");
                        } else if (z3) {
                            q09 q092 = y19.A;
                            y19.e(q092);
                            q092.b1();
                            SharedPreferences.Editor edit = q092.g1().edit();
                            edit.putBoolean("use_service", z2);
                            edit.apply();
                        }
                        z3 = z2;
                    } else {
                        pz8 pz87 = y19.B;
                        y19.g(pz87);
                        pz87.J.a("Service available");
                    }
                }
                z2 = true;
                if (!z2 || y19.z.f1()) {
                }
                z3 = z2;
            }
            this.A = Boolean.valueOf(z3);
        }
        return this.A.booleanValue();
    }

    public final void k1() {
        b1();
        d1();
        m69 m69 = this.y;
        if (m69.x != null && (m69.x.p() || m69.x.q())) {
            m69.x.c();
        }
        m69.x = null;
        try {
            q11.b().c(((y19) this.w).w, m69);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.z = null;
    }

    public final boolean l1() {
        b1();
        d1();
        if (!j1()) {
            return true;
        }
        d99 d99 = ((y19) this.w).E;
        y19.e(d99);
        if (d99.N1() >= ((Integer) by8.J0.a((Object) null)).intValue()) {
            return true;
        }
        return false;
    }

    public final boolean m1() {
        b1();
        d1();
        if (!j1()) {
            return true;
        }
        d99 d99 = ((y19) this.w).E;
        y19.e(d99);
        if (d99.N1() >= 241200) {
            return true;
        }
        return false;
    }

    public final void n1(ComponentName componentName) {
        b1();
        if (this.z != null) {
            this.z = null;
            pz8 pz8 = ((y19) this.w).B;
            y19.g(pz8);
            pz8.J.b("Disconnected from device MeasurementService", componentName);
            b1();
            i1();
        }
    }

    public final void o1() {
        ((y19) this.w).getClass();
    }

    public final void p1() {
        b1();
        cp0 cp0 = this.D;
        ((xb4) cp0.y).getClass();
        cp0.x = SystemClock.elapsedRealtime();
        ((y19) this.w).getClass();
        this.B.b(((Long) by8.Y.a((Object) null)).longValue());
    }

    public final void q1(Runnable runnable) {
        b1();
        if (t1()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.E;
        y19 y19 = (y19) this.w;
        y19.getClass();
        if (((long) arrayList.size()) >= 1000) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            pz8.B.a("Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.F.b(60000);
        i1();
    }

    public final void r1() {
        b1();
        y19 y19 = (y19) this.w;
        pz8 pz8 = y19.B;
        y19.g(pz8);
        mz8 mz8 = pz8.J;
        ArrayList arrayList = this.E;
        mz8.b("Processing queued up service tasks", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                pz8 pz82 = y19.B;
                y19.g(pz82);
                pz82.B.b("Task exception while flushing queue", e);
            }
        }
        arrayList.clear();
        this.F.c();
    }

    public final z99 s1(boolean z2) {
        long j;
        Pair pair;
        y19 y19 = (y19) this.w;
        y19.getClass();
        vy8 l = y19.l();
        String str = null;
        if (z2) {
            pz8 pz8 = y19.B;
            y19.g(pz8);
            y19 y192 = (y19) pz8.w;
            q09 q09 = y192.A;
            y19.e(q09);
            if (q09.A != null) {
                q09 q092 = y192.A;
                y19.e(q092);
                rb2 rb2 = q092.A;
                q09 q093 = (q09) rb2.A;
                q093.b1();
                q093.b1();
                long j2 = ((q09) rb2.A).g1().getLong((String) rb2.x, 0);
                if (j2 == 0) {
                    rb2.d();
                    j = 0;
                } else {
                    ((y19) q093.w).G.getClass();
                    j = Math.abs(j2 - System.currentTimeMillis());
                }
                long j3 = rb2.w;
                if (j >= j3) {
                    if (j > j3 + j3) {
                        rb2.d();
                    } else {
                        String string = q093.g1().getString((String) rb2.z, (String) null);
                        long j4 = q093.g1().getLong((String) rb2.y, 0);
                        rb2.d();
                        if (string == null || j4 <= 0) {
                            pair = q09.V;
                        } else {
                            pair = new Pair(string, Long.valueOf(j4));
                        }
                        if (!(pair == null || pair == q09.V)) {
                            String valueOf = String.valueOf(pair.second);
                            String str2 = (String) pair.first;
                            str = f21.m(new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length()), valueOf, ":", str2);
                        }
                    }
                }
                pair = null;
                String valueOf2 = String.valueOf(pair.second);
                String str22 = (String) pair.first;
                str = f21.m(new StringBuilder(valueOf2.length() + 1 + String.valueOf(str22).length()), valueOf2, ":", str22);
            }
        }
        return l.g1(str);
    }

    public final boolean t1() {
        b1();
        d1();
        if (this.z != null) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v13, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v10, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v95, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v98, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v20, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v50, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v48, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v49, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v178, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v59, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v60, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v87, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v85, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v90, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v91, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v96, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v101, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v116, resolved type: android.database.Cursor} */
    /* JADX WARNING: type inference failed for: r28v11 */
    /* JADX WARNING: type inference failed for: r26v22 */
    /* JADX WARNING: type inference failed for: r24v21 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:136|137|138|139) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:150|151|152|153) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:166|167|168|169) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:196|197|198|199) */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01b0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01b1, code lost:
        r28 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01b3, code lost:
        r4 = r40;
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        r24 = r24;
        r26 = r26;
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01fd, code lost:
        r0 = th;
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01ff, code lost:
        r0 = e;
        r24 = r24;
        r26 = r26;
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0201, code lost:
        r0 = e;
        r24 = r24;
        r26 = r26;
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0203, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r0 = r7.B;
        defpackage.y19.g(r0);
        r0.B.a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0211, code lost:
        r28 = r28;
        r28 = r28;
        r28 = r28;
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        r8.recycle();
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0215, code lost:
        r8.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0218, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0236, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        r0 = r7.B;
        defpackage.y19.g(r0);
        r0.B.a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r1.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0253, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0256, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0272, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        r0 = r7.B;
        defpackage.y19.g(r0);
        r0.B.a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
        r1.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0290, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0293, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x02af, code lost:
        r0 = e;
        r28 = r28;
        r26 = r26;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        r28 = r28;
        r26 = r26;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x02b8, code lost:
        r0 = e;
        r28 = r28;
        r26 = r26;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x02bd, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        r0 = r7.B;
        defpackage.y19.g(r0);
        r0.B.a("Failed to load default event parameters from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x02cf, code lost:
        r24 = r24;
        r24 = r24;
        r24 = r24;
        r26 = r26;
        r26 = r26;
        r26 = r26;
        r28 = r28;
        r28 = r28;
        r28 = r28;
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
        r1.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0084, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0085, code lost:
        r4 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0315, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0316, code lost:
        r28 = r3;
        r24 = r24;
        r26 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0319, code lost:
        r28 = r3;
        r24 = r24;
        r26 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0089, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x031c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x031d, code lost:
        r28 = r3;
        r24 = r24;
        r26 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0320, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0321, code lost:
        r28 = r3;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0323, code lost:
        r26 = r15;
        r28 = r28;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0326, code lost:
        r28 = r3;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0328, code lost:
        r26 = r15;
        r28 = r28;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x032b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        r36 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x032c, code lost:
        r28 = r3;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x032e, code lost:
        r26 = r15;
        r28 = r28;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0331, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0332, code lost:
        r28 = r3;
        r24 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0337, code lost:
        r28 = r3;
        r24 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x033c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x033d, code lost:
        r28 = r3;
        r24 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0342, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0343, code lost:
        r28 = r3;
        r24 = r9;
        r26 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008c, code lost:
        r37 = r8;
        r26 = r15;
        r4 = r24;
        r23 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x034b, code lost:
        r28 = r3;
        r24 = r9;
        r26 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0353, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0354, code lost:
        r28 = r3;
        r24 = r9;
        r26 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0095, code lost:
        r24 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x039a, code lost:
        r11 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x039e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x039f, code lost:
        r28 = r3;
        r24 = r9;
        r26 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        r36 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x03ab, code lost:
        r28 = r3;
        r24 = r9;
        r26 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x03b7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x03b8, code lost:
        r28 = r3;
        r24 = r9;
        r26 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x03c4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x03c5, code lost:
        r26 = r15;
        r4 = r24;
        r24 = r9;
        r23 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x03d9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x03da, code lost:
        r26 = r15;
        r4 = r24;
        r24 = r9;
        r23 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x03e4, code lost:
        r26 = r15;
        r4 = r24;
        r24 = r9;
        r23 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x03ee, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x03ef, code lost:
        r37 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x03f2, code lost:
        r37 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x03f5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009b, code lost:
        r37 = r8;
        r26 = r15;
        r4 = r24;
        r23 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x03f6, code lost:
        r37 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        r24 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x043e, code lost:
        if (r4.inTransaction() != false) goto L_0x0440;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0440, code lost:
        r4.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0452, code lost:
        r28.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a9, code lost:
        r36 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x046d, code lost:
        r28.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0476, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0496, code lost:
        r28.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x04aa, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x04af, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ea, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0149, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x014a, code lost:
        r23 = 5;
        r26 = r15;
        r4 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0153, code lost:
        r23 = 5;
        r26 = r15;
        r4 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x015c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015d, code lost:
        r23 = 5;
        r26 = r15;
        r4 = r24;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:136:0x0205 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:150:0x0238 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:166:0x0274 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:196:0x02c3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01b0 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:87:0x017a] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01fd A[ExcHandler: all (th java.lang.Throwable), PHI: r28 
      PHI: (r28v33 android.database.Cursor) = (r28v50 android.database.Cursor), (r28v50 android.database.Cursor), (r28v50 android.database.Cursor), (r28v50 android.database.Cursor), (r28v50 android.database.Cursor), (r28v50 android.database.Cursor), (r28v64 android.database.Cursor), (r28v68 android.database.Cursor), (r28v72 android.database.Cursor), (r28v76 android.database.Cursor), (r28v95 android.database.Cursor), (r28v97 android.database.Cursor), (r28v105 android.database.Cursor), (r28v109 android.database.Cursor), (r28v113 android.database.Cursor), (r28v120 android.database.Cursor), (r28v124 android.database.Cursor), (r28v129 android.database.Cursor) binds: [B:168:0x0280, B:163:0x026e, B:164:?, B:152:0x0244, B:147:0x0232, B:148:?, B:91:0x0181, B:94:0x0186, B:97:0x018d, B:100:0x0196, B:213:0x02f1, B:176:0x0297, B:198:0x02cf, B:183:0x02ab, B:184:?, B:123:0x01d8, B:138:0x0211, B:127:0x01ec] A[DONT_GENERATE, DONT_INLINE], Splitter:B:123:0x01d8] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0084 A[Catch:{ SQLiteFullException -> 0x00a8, SQLiteDatabaseLockedException -> 0x0099, SQLiteException -> 0x0089, all -> 0x0084 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:17:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x03c4 A[ExcHandler: SQLiteException (e android.database.sqlite.SQLiteException), Splitter:B:65:0x0126] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x03d9 A[ExcHandler: SQLiteFullException (e android.database.sqlite.SQLiteFullException), Splitter:B:65:0x0126] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x040f A[SYNTHETIC, Splitter:B:286:0x040f] */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x043a A[SYNTHETIC, Splitter:B:305:0x043a] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x04af  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0597 A[SYNTHETIC, Splitter:B:356:0x0597] */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0626  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x064b  */
    /* JADX WARNING: Removed duplicated region for block: B:417:0x0419 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x049c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x049c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x049c A[SYNTHETIC] */
    public final void u1(iy8 iy8, a3 a3Var, z99 z99) {
        cz8 i;
        String str;
        String str2;
        String str3;
        y19 y19;
        pz8 pz8;
        Context context;
        y19 y192;
        ArrayList arrayList;
        int i2;
        int i3;
        int size;
        int i4;
        int i5;
        ay8 ay8;
        Context context2;
        y19 y193;
        pz8 pz82;
        long j;
        long j2;
        int i6;
        int i7;
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        String str4;
        int i8;
        String str5;
        String str6;
        int i9;
        Cursor cursor2;
        String str7;
        String str8;
        String str9;
        SQLiteDatabase i1;
        Cursor cursor3;
        String str10;
        SQLiteDatabase sQLiteDatabase2;
        int i10;
        long j3;
        long j4;
        String[] strArr;
        String str11;
        int i11;
        String str12;
        SQLiteDatabase sQLiteDatabase3;
        String str13;
        String str14;
        ay8 ay82;
        String str15;
        Cursor cursor4;
        long j5;
        Cursor cursor5;
        int i12;
        ur8 ur8;
        a3 a3Var2 = a3Var;
        b1();
        d1();
        o1();
        y19 y194 = (y19) this.w;
        y194.getClass();
        Context context3 = y194.w;
        tp8 tp8 = y194.z;
        pz8 pz83 = y194.B;
        xb4 xb4 = y194.G;
        int i13 = 100;
        z99 z992 = z99;
        int i14 = 100;
        int i15 = 0;
        while (i15 < 1001 && i14 == i13) {
            ArrayList arrayList2 = new ArrayList();
            i = y194.i();
            str = "entry";
            int i16 = i13;
            str2 = "type";
            str3 = "rowid";
            xb4 xb42 = xb4;
            y19 = (y19) i.w;
            i.b1();
            int i17 = i15;
            if (i.z) {
                y192 = y194;
                context = context3;
                pz8 = pz83;
            } else {
                arrayList = new ArrayList();
                y192 = y194;
                if (((y19) i.w).w.getDatabasePath("google_app_measurement_local.db").exists()) {
                    i6 = 5;
                    context = context3;
                    pz8 = pz83;
                    i7 = 0;
                    int i18 = 5;
                    while (i7 < i6) {
                        try {
                            i1 = i.i1();
                            if (i1 == null) {
                                try {
                                    i.z = true;
                                } catch (SQLiteFullException e) {
                                } catch (SQLiteDatabaseLockedException unused) {
                                    str8 = str;
                                    sQLiteDatabase = i1;
                                    str7 = str2;
                                    i9 = 5;
                                    cursor2 = null;
                                    SystemClock.sleep((long) i18);
                                    i18 += 20;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i7 = i8 + 1;
                                    i6 = i9;
                                    str2 = str6;
                                    str = str5;
                                    str3 = str4;
                                } catch (SQLiteException e2) {
                                } catch (Throwable th) {
                                }
                            } else {
                                i1.beginTransaction();
                                try {
                                    cursor3 = i1.query("messages", new String[]{str3}, "type=?", new String[]{"3"}, (String) null, (String) null, "rowid desc", "1");
                                    try {
                                        j3 = -1;
                                        if (cursor3.moveToFirst()) {
                                            i8 = i7;
                                            try {
                                                j4 = cursor3.getLong(0);
                                                cursor3.close();
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str4 = str3;
                                                str10 = str;
                                                sQLiteDatabase2 = i1;
                                                i10 = 5;
                                                str7 = str2;
                                                if (cursor3 != null) {
                                                    try {
                                                        cursor3.close();
                                                    } catch (SQLiteFullException e3) {
                                                        e = e3;
                                                        cursor2 = null;
                                                        str5 = str8;
                                                        str6 = str7;
                                                        pz8 pz84 = y19.B;
                                                        y19.g(pz84);
                                                        pz84.B.b("Error reading entries from local database", e);
                                                        i.z = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i7 = i8 + 1;
                                                        i6 = i9;
                                                        str2 = str6;
                                                        str = str5;
                                                        str3 = str4;
                                                    } catch (SQLiteDatabaseLockedException unused2) {
                                                        cursor2 = null;
                                                        SystemClock.sleep((long) i18);
                                                        i18 += 20;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i7 = i8 + 1;
                                                        i6 = i9;
                                                        str2 = str6;
                                                        str = str5;
                                                        str3 = str4;
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        cursor2 = null;
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        pz8 pz85 = y19.B;
                                                        y19.g(pz85);
                                                        pz85.B.b("Error reading entries from local database", e);
                                                        i.z = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i7 = i8 + 1;
                                                        i6 = i9;
                                                        str2 = str6;
                                                        str = str5;
                                                        str3 = str4;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        cursor = null;
                                                        if (cursor != null) {
                                                        }
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i8 = i7;
                                            cursor3.close();
                                            j4 = -1;
                                        }
                                        if (j4 != -1) {
                                            str11 = "rowid<?";
                                            strArr = new String[]{String.valueOf(j4)};
                                        } else {
                                            str11 = null;
                                            strArr = null;
                                        }
                                        String[] strArr2 = {str3, str2, str};
                                        tp8 tp82 = y19.z;
                                        ay8 ay83 = by8.W0;
                                        str4 = str3;
                                        int i19 = 4;
                                        int i20 = 3;
                                        if (tp82.n1((String) null, ay83)) {
                                            i11 = 5;
                                            strArr2 = new String[]{str4, str2, str, "app_version", "app_version_int"};
                                        } else {
                                            i11 = 5;
                                        }
                                        String[] strArr3 = strArr2;
                                        Cursor query = i1.query("messages", strArr3, str11, strArr, (String) null, (String) null, "rowid asc", Integer.toString(i16));
                                        SQLiteDatabase sQLiteDatabase4 = i1;
                                        while (query.moveToNext()) {
                                            try {
                                                Cursor cursor6 = strArr;
                                                Cursor cursor7 = strArr;
                                                Cursor cursor8 = strArr;
                                                Cursor cursor9 = strArr;
                                                String str16 = strArr3;
                                                String str17 = strArr3;
                                                String str18 = strArr3;
                                                String str19 = i1;
                                                String str20 = i1;
                                                String str21 = i1;
                                                j3 = query.getLong(0);
                                                cursor6 = strArr;
                                                cursor7 = strArr;
                                                cursor8 = strArr;
                                                cursor9 = strArr;
                                                str16 = strArr3;
                                                str17 = strArr3;
                                                str18 = strArr3;
                                                str19 = i1;
                                                str20 = i1;
                                                str21 = i1;
                                                int i21 = query.getInt(1);
                                                str13 = str2;
                                                cursor6 = strArr;
                                                cursor7 = strArr;
                                                cursor8 = strArr;
                                                cursor9 = strArr;
                                                str16 = strArr3;
                                                str17 = strArr3;
                                                str18 = strArr3;
                                                str19 = str13;
                                                str20 = str13;
                                                str21 = str13;
                                                byte[] blob = query.getBlob(2);
                                                str14 = str;
                                                cursor6 = strArr;
                                                cursor7 = strArr;
                                                cursor8 = strArr;
                                                cursor9 = strArr;
                                                str19 = str13;
                                                str20 = str13;
                                                str21 = str13;
                                                str16 = str14;
                                                str17 = str14;
                                                str18 = str14;
                                                if (y19.z.n1((String) null, ay83)) {
                                                    str15 = query.getString(i20);
                                                    cursor4 = query;
                                                    ay82 = ay83;
                                                    j5 = query.getLong(i19);
                                                } else {
                                                    cursor4 = query;
                                                    ay82 = ay83;
                                                    j5 = 0;
                                                    str15 = null;
                                                }
                                                if (i21 == 0) {
                                                    Cursor cursor10 = cursor4;
                                                    try {
                                                        cursor9 = cursor10;
                                                        cursor9 = cursor10;
                                                        cursor9 = cursor10;
                                                        cursor9 = cursor10;
                                                        Parcel obtain = Parcel.obtain();
                                                        obtain.unmarshall(blob, 0, blob.length);
                                                        obtain.setDataPosition(0);
                                                        zr8 createFromParcel = zr8.CREATOR.createFromParcel(obtain);
                                                        cursor9 = cursor10;
                                                        cursor9 = cursor10;
                                                        cursor9 = cursor10;
                                                        cursor9 = cursor10;
                                                        obtain.recycle();
                                                        cursor9 = cursor10;
                                                        if (createFromParcel != null) {
                                                            arrayList.add(new zy8(createFromParcel, str15, j5));
                                                            cursor9 = cursor10;
                                                        }
                                                    } catch (SQLiteFullException e5) {
                                                        e = e5;
                                                        String str22 = str13;
                                                        String str23 = str14;
                                                        Cursor cursor11 = cursor9;
                                                        cursor2 = cursor11;
                                                        String str24 = str23;
                                                        String str25 = str22;
                                                        sQLiteDatabase3 = sQLiteDatabase4;
                                                        str12 = str24;
                                                        str9 = str25;
                                                        i9 = 5;
                                                        str5 = str12;
                                                        str6 = str9;
                                                        pz8 pz842 = y19.B;
                                                        y19.g(pz842);
                                                        pz842.B.b("Error reading entries from local database", e);
                                                        i.z = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i7 = i8 + 1;
                                                        i6 = i9;
                                                        str2 = str6;
                                                        str = str5;
                                                        str3 = str4;
                                                    } catch (SQLiteDatabaseLockedException unused3) {
                                                        String str26 = str13;
                                                        String str27 = str14;
                                                        Cursor cursor12 = cursor9;
                                                        Cursor cursor13 = cursor12;
                                                        String str28 = str27;
                                                        String str29 = str26;
                                                        sQLiteDatabase3 = sQLiteDatabase4;
                                                        cursor2 = cursor13;
                                                        str12 = str28;
                                                        str9 = str29;
                                                        i9 = 5;
                                                        SystemClock.sleep((long) i18);
                                                        i18 += 20;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i7 = i8 + 1;
                                                        i6 = i9;
                                                        str2 = str6;
                                                        str = str5;
                                                        str3 = str4;
                                                    } catch (SQLiteException e6) {
                                                        e = e6;
                                                        String str30 = str13;
                                                        String str31 = str14;
                                                        Cursor cursor14 = cursor9;
                                                        Cursor cursor15 = cursor14;
                                                        String str32 = str31;
                                                        String str33 = str30;
                                                        sQLiteDatabase3 = sQLiteDatabase4;
                                                        cursor2 = cursor15;
                                                        str12 = str32;
                                                        str9 = str33;
                                                        i9 = 5;
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        pz8 pz852 = y19.B;
                                                        y19.g(pz852);
                                                        pz852.B.b("Error reading entries from local database", e);
                                                        i.z = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i7 = i8 + 1;
                                                        i6 = i9;
                                                        str2 = str6;
                                                        str = str5;
                                                        str3 = str4;
                                                    } catch (Throwable th4) {
                                                    }
                                                } else {
                                                    cursor9 = cursor4;
                                                    if (i21 == 1) {
                                                        Parcel obtain2 = Parcel.obtain();
                                                        obtain2.unmarshall(blob, 0, blob.length);
                                                        obtain2.setDataPosition(0);
                                                        z89 z89 = z89.CREATOR.createFromParcel(obtain2);
                                                        obtain2.recycle();
                                                        if (z89 != null) {
                                                            arrayList.add(new zy8(z89, str15, j5));
                                                        }
                                                    } else if (i21 == 2) {
                                                        Parcel obtain3 = Parcel.obtain();
                                                        obtain3.unmarshall(blob, 0, blob.length);
                                                        obtain3.setDataPosition(0);
                                                        xn8 xn8 = xn8.CREATOR.createFromParcel(obtain3);
                                                        obtain3.recycle();
                                                        if (xn8 != null) {
                                                            arrayList.add(new zy8(xn8, str15, j5));
                                                        }
                                                    } else if (i21 == 4) {
                                                        cursor9 = cursor9;
                                                        Parcel obtain4 = Parcel.obtain();
                                                        try {
                                                            obtain4.unmarshall(blob, 0, blob.length);
                                                            obtain4.setDataPosition(0);
                                                            ur8 = ur8.CREATOR.createFromParcel(obtain4);
                                                            str19 = str13;
                                                            str20 = str13;
                                                            str21 = str13;
                                                            str16 = str14;
                                                            str17 = str14;
                                                            str18 = str14;
                                                            cursor6 = cursor9;
                                                            cursor7 = cursor9;
                                                            cursor8 = cursor9;
                                                            cursor9 = cursor9;
                                                            obtain4.recycle();
                                                            str19 = str13;
                                                            str20 = str13;
                                                            str21 = str13;
                                                            str16 = str14;
                                                            str17 = str14;
                                                            str18 = str14;
                                                            cursor6 = cursor9;
                                                            cursor7 = cursor9;
                                                            cursor8 = cursor9;
                                                            cursor9 = cursor9;
                                                        } catch (SafeParcelReader$ParseException unused4) {
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            obtain4.recycle();
                                                            throw th;
                                                        }
                                                        if (ur8 != null) {
                                                            arrayList.add(new zy8(ur8, str15, j5));
                                                        }
                                                        i12 = 3;
                                                        cursor5 = cursor9;
                                                        i20 = i12;
                                                        str2 = str13;
                                                        str = str14;
                                                        ay83 = ay82;
                                                        query = cursor5;
                                                        i19 = 4;
                                                        i1 = str13;
                                                        strArr3 = str14;
                                                        strArr = cursor5;
                                                    } else {
                                                        pz8 pz86 = y19.B;
                                                        i12 = 3;
                                                        if (i21 == 3) {
                                                            str19 = str13;
                                                            str20 = str13;
                                                            str21 = str13;
                                                            str16 = str14;
                                                            str17 = str14;
                                                            str18 = str14;
                                                            cursor6 = cursor9;
                                                            cursor7 = cursor9;
                                                            cursor8 = cursor9;
                                                            cursor9 = cursor9;
                                                            y19.g(pz86);
                                                            pz86.J.a("Skipping app launch break");
                                                            cursor5 = cursor9;
                                                        } else {
                                                            y19.g(pz86);
                                                            pz86.B.a("Unknown record type in local database");
                                                            cursor5 = cursor9;
                                                        }
                                                        i20 = i12;
                                                        str2 = str13;
                                                        str = str14;
                                                        ay83 = ay82;
                                                        query = cursor5;
                                                        i19 = 4;
                                                        i1 = str13;
                                                        strArr3 = str14;
                                                        strArr = cursor5;
                                                    }
                                                }
                                                i12 = 3;
                                                cursor5 = cursor9;
                                                i20 = i12;
                                                str2 = str13;
                                                str = str14;
                                                ay83 = ay82;
                                                query = cursor5;
                                                i19 = 4;
                                                i1 = str13;
                                                strArr3 = str14;
                                                strArr = cursor5;
                                            } catch (SQLiteFullException e7) {
                                                e = e7;
                                                Cursor cursor16 = query;
                                                String str34 = str13;
                                                String str35 = str14;
                                                sQLiteDatabase3 = sQLiteDatabase4;
                                                str12 = str35;
                                                str9 = str34;
                                                i9 = 5;
                                                str5 = str12;
                                                str6 = str9;
                                                pz8 pz8422 = y19.B;
                                                y19.g(pz8422);
                                                pz8422.B.b("Error reading entries from local database", e);
                                                i.z = true;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i7 = i8 + 1;
                                                i6 = i9;
                                                str2 = str6;
                                                str = str5;
                                                str3 = str4;
                                            } catch (SQLiteDatabaseLockedException unused5) {
                                                Cursor cursor17 = query;
                                                String str36 = str13;
                                                String str37 = str14;
                                                sQLiteDatabase3 = sQLiteDatabase4;
                                                i9 = 5;
                                                SystemClock.sleep((long) i18);
                                                i18 += 20;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i7 = i8 + 1;
                                                i6 = i9;
                                                str2 = str6;
                                                str = str5;
                                                str3 = str4;
                                            } catch (SQLiteException e8) {
                                                e = e8;
                                                Cursor cursor18 = query;
                                                str9 = str13;
                                                str12 = str14;
                                                sQLiteDatabase3 = sQLiteDatabase4;
                                                i9 = 5;
                                                if (sQLiteDatabase != null) {
                                                }
                                                pz8 pz8522 = y19.B;
                                                y19.g(pz8522);
                                                pz8522.B.b("Error reading entries from local database", e);
                                                i.z = true;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i7 = i8 + 1;
                                                i6 = i9;
                                                str2 = str6;
                                                str = str5;
                                                str3 = str4;
                                            } catch (Throwable th6) {
                                            }
                                        }
                                        cursor2 = query;
                                        str9 = str2;
                                        str12 = str;
                                        i2 = 0;
                                        sQLiteDatabase3 = sQLiteDatabase4;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        i8 = i7;
                                        str4 = str3;
                                        str10 = str;
                                        sQLiteDatabase2 = i1;
                                        i10 = 5;
                                        str7 = str2;
                                        if (cursor3 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    i8 = i7;
                                    str4 = str3;
                                    str10 = str;
                                    sQLiteDatabase2 = i1;
                                    i10 = 5;
                                    str7 = str2;
                                    cursor3 = null;
                                    if (cursor3 != null) {
                                    }
                                    throw th;
                                }
                                try {
                                    if (sQLiteDatabase3.delete("messages", "rowid <= ?", new String[]{Long.toString(j3)}) < arrayList.size()) {
                                        pz8 pz87 = y19.B;
                                        y19.g(pz87);
                                        pz87.B.a("Fewer entries removed from local database than expected");
                                    }
                                    sQLiteDatabase3.setTransactionSuccessful();
                                    sQLiteDatabase3.endTransaction();
                                    cursor2.close();
                                    sQLiteDatabase3.close();
                                } catch (SQLiteFullException e9) {
                                    e = e9;
                                    i9 = 5;
                                    str5 = str12;
                                    str6 = str9;
                                    pz8 pz84222 = y19.B;
                                    y19.g(pz84222);
                                    pz84222.B.b("Error reading entries from local database", e);
                                    i.z = true;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i7 = i8 + 1;
                                    i6 = i9;
                                    str2 = str6;
                                    str = str5;
                                    str3 = str4;
                                } catch (SQLiteDatabaseLockedException unused6) {
                                    i9 = 5;
                                    SystemClock.sleep((long) i18);
                                    i18 += 20;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i7 = i8 + 1;
                                    i6 = i9;
                                    str2 = str6;
                                    str = str5;
                                    str3 = str4;
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    i9 = 5;
                                    if (sQLiteDatabase != null) {
                                    }
                                    pz8 pz85222 = y19.B;
                                    y19.g(pz85222);
                                    pz85222.B.b("Error reading entries from local database", e);
                                    i.z = true;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i7 = i8 + 1;
                                    i6 = i9;
                                    str2 = str6;
                                    str = str5;
                                    str3 = str4;
                                }
                            }
                        } catch (SQLiteFullException e11) {
                            e = e11;
                            i8 = i7;
                            str4 = str3;
                            str7 = str2;
                            str8 = str;
                            i9 = 5;
                            sQLiteDatabase = null;
                            cursor2 = null;
                            str5 = str8;
                            str6 = str7;
                            pz8 pz842222 = y19.B;
                            y19.g(pz842222);
                            pz842222.B.b("Error reading entries from local database", e);
                            i.z = true;
                            if (cursor2 != null) {
                            }
                            if (sQLiteDatabase == null) {
                            }
                            sQLiteDatabase.close();
                            i7 = i8 + 1;
                            i6 = i9;
                            str2 = str6;
                            str = str5;
                            str3 = str4;
                        } catch (SQLiteDatabaseLockedException unused7) {
                            i8 = i7;
                            str4 = str3;
                            str7 = str2;
                            str8 = str;
                            i9 = 5;
                            sQLiteDatabase = null;
                            cursor2 = null;
                            SystemClock.sleep((long) i18);
                            i18 += 20;
                            if (cursor2 != null) {
                            }
                            if (sQLiteDatabase == null) {
                            }
                            sQLiteDatabase.close();
                            i7 = i8 + 1;
                            i6 = i9;
                            str2 = str6;
                            str = str5;
                            str3 = str4;
                        } catch (SQLiteException e12) {
                            e = e12;
                            i8 = i7;
                            str4 = str3;
                            str7 = str2;
                            str8 = str;
                            i9 = 5;
                            sQLiteDatabase = null;
                            cursor2 = null;
                            if (sQLiteDatabase != null) {
                            }
                            pz8 pz852222 = y19.B;
                            y19.g(pz852222);
                            pz852222.B.b("Error reading entries from local database", e);
                            i.z = true;
                            if (cursor2 != null) {
                            }
                            if (sQLiteDatabase == null) {
                            }
                            sQLiteDatabase.close();
                            i7 = i8 + 1;
                            i6 = i9;
                            str2 = str6;
                            str = str5;
                            str3 = str4;
                        } catch (Throwable th9) {
                            th = th9;
                            sQLiteDatabase = null;
                            cursor = null;
                            if (cursor != null) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    }
                    i2 = 0;
                    pz8 pz88 = y19.B;
                    y19.g(pz88);
                    pz88.E.a("Failed to read events from database in reasonable time");
                    arrayList = null;
                } else {
                    context = context3;
                    pz8 = pz83;
                    i2 = 0;
                }
                if (arrayList == null) {
                    arrayList2.addAll(arrayList);
                    i3 = arrayList.size();
                } else {
                    i3 = i2;
                }
                int i22 = i16;
                if (a3Var2 != null && i3 < i22) {
                    arrayList2.add(new zy8(a3Var2, z992.y, z992.F));
                }
                size = arrayList2.size();
                i4 = i2;
                while (i4 < size) {
                    zy8 zy8 = (zy8) arrayList2.get(i4);
                    a3 a3Var3 = zy8.a;
                    ay8 ay84 = by8.W0;
                    if (tp8.n1((String) null, ay84)) {
                        String str38 = zy8.b;
                        if (!TextUtils.isEmpty(str38)) {
                            long j6 = zy8.c;
                            String str39 = z992.w;
                            String str40 = z992.x;
                            String str41 = z992.z;
                            ay8 = ay84;
                            long j7 = z992.A;
                            String str42 = str39;
                            i5 = i3;
                            long j8 = z992.B;
                            String str43 = z992.C;
                            boolean z2 = z992.D;
                            String str44 = str43;
                            boolean z3 = z992.E;
                            String str45 = z992.G;
                            boolean z4 = z2;
                            long j9 = z992.H;
                            int i23 = z992.I;
                            boolean z5 = z992.J;
                            boolean z6 = z5;
                            String str46 = str41;
                            long j10 = j7;
                            String str47 = str38;
                            long j11 = j6;
                            String str48 = str40;
                            z992 = new z99(str42, str48, str47, j11, str46, j10, j8, str44, z4, z3, str45, j9, i23, z6, z992.K, z992.L, z992.M, z992.N, z992.O, z992.P, z992.Q, z992.R, z992.S, z992.T, z992.U, z992.V, z992.W, z992.X, z992.Y, z992.Z, z992.a0, z992.b0);
                            if (!(a3Var3 instanceof zr8)) {
                                try {
                                    xb42.getClass();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    try {
                                        xb42.getClass();
                                        j2 = SystemClock.elapsedRealtime();
                                    } catch (RemoteException e13) {
                                        e = e13;
                                        iy8 iy82 = iy8;
                                        y193 = y192;
                                        context2 = context;
                                        pz82 = pz8;
                                        j2 = 0;
                                        j = currentTimeMillis;
                                        y19.g(pz82);
                                        pz82.B.b("Failed to send event to the service", e);
                                        if (j != 0) {
                                            if (fm8.A == null) {
                                                fm8.A = new fm8(context2, y193);
                                            }
                                            fm8 fm8 = fm8.A;
                                            xb42.getClass();
                                            long currentTimeMillis2 = System.currentTimeMillis();
                                            xb42.getClass();
                                            fm8.e(13, (int) (SystemClock.elapsedRealtime() - j2), j, currentTimeMillis2);
                                        }
                                        i4++;
                                        pz8 = pz82;
                                        y192 = y193;
                                        context = context2;
                                        i3 = i5;
                                    }
                                    try {
                                        try {
                                            iy8.r((zr8) a3Var3, z992);
                                            y19.g(pz8);
                                            pz82 = pz8;
                                            try {
                                                pz82.J.a("Logging telemetry for logEvent from database");
                                                if (fm8.A == null) {
                                                    y193 = y192;
                                                    context2 = context;
                                                    try {
                                                        fm8.A = new fm8(context2, y193);
                                                    } catch (RemoteException e14) {
                                                        e = e14;
                                                        j = currentTimeMillis;
                                                        y19.g(pz82);
                                                        pz82.B.b("Failed to send event to the service", e);
                                                        if (j != 0) {
                                                        }
                                                        i4++;
                                                        pz8 = pz82;
                                                        y192 = y193;
                                                        context = context2;
                                                        i3 = i5;
                                                    }
                                                } else {
                                                    y193 = y192;
                                                    context2 = context;
                                                }
                                                fm8 fm82 = fm8.A;
                                                xb42.getClass();
                                                long currentTimeMillis3 = System.currentTimeMillis();
                                                xb42.getClass();
                                                fm82.e(0, (int) (SystemClock.elapsedRealtime() - j2), currentTimeMillis, currentTimeMillis3);
                                            } catch (RemoteException e15) {
                                                e = e15;
                                                y193 = y192;
                                                context2 = context;
                                                j = currentTimeMillis;
                                                y19.g(pz82);
                                                pz82.B.b("Failed to send event to the service", e);
                                                if (j != 0) {
                                                }
                                                i4++;
                                                pz8 = pz82;
                                                y192 = y193;
                                                context = context2;
                                                i3 = i5;
                                            }
                                        } catch (RemoteException e16) {
                                            e = e16;
                                            y193 = y192;
                                            context2 = context;
                                            pz82 = pz8;
                                            j = currentTimeMillis;
                                            y19.g(pz82);
                                            pz82.B.b("Failed to send event to the service", e);
                                            if (j != 0) {
                                            }
                                            i4++;
                                            pz8 = pz82;
                                            y192 = y193;
                                            context = context2;
                                            i3 = i5;
                                        }
                                    } catch (RemoteException e17) {
                                        e = e17;
                                        iy8 iy83 = iy8;
                                        y193 = y192;
                                        context2 = context;
                                        pz82 = pz8;
                                        j = currentTimeMillis;
                                        y19.g(pz82);
                                        pz82.B.b("Failed to send event to the service", e);
                                        if (j != 0) {
                                        }
                                        i4++;
                                        pz8 = pz82;
                                        y192 = y193;
                                        context = context2;
                                        i3 = i5;
                                    }
                                } catch (RemoteException e18) {
                                    e = e18;
                                    iy8 iy84 = iy8;
                                    y193 = y192;
                                    context2 = context;
                                    pz82 = pz8;
                                    j2 = 0;
                                    j = 0;
                                    y19.g(pz82);
                                    pz82.B.b("Failed to send event to the service", e);
                                    if (j != 0) {
                                    }
                                    i4++;
                                    pz8 = pz82;
                                    y192 = y193;
                                    context = context2;
                                    i3 = i5;
                                }
                            } else {
                                iy8 iy85 = iy8;
                                y193 = y192;
                                context2 = context;
                                pz82 = pz8;
                                if (a3Var3 instanceof z89) {
                                    try {
                                        iy85.o((z89) a3Var3, z992);
                                    } catch (RemoteException e19) {
                                        y19.g(pz82);
                                        pz82.B.b("Failed to send user property to the service", e19);
                                    }
                                } else if (a3Var3 instanceof xn8) {
                                    try {
                                        iy85.y((xn8) a3Var3, z992);
                                    } catch (RemoteException e20) {
                                        y19.g(pz82);
                                        pz82.B.b("Failed to send conditional user property to the service", e20);
                                    }
                                } else if (!tp8.n1((String) null, ay8) || !(a3Var3 instanceof ur8)) {
                                    y19.g(pz82);
                                    pz82.B.a("Discarding data. Unrecognized parcel type.");
                                    i4++;
                                    pz8 = pz82;
                                    y192 = y193;
                                    context = context2;
                                    i3 = i5;
                                } else {
                                    try {
                                        iy85.j(((ur8) a3Var3).l(), z992);
                                    } catch (RemoteException e21) {
                                        y19.g(pz82);
                                        pz82.B.b("Failed to send default event parameters to the service", e21);
                                    }
                                    i4++;
                                    pz8 = pz82;
                                    y192 = y193;
                                    context = context2;
                                    i3 = i5;
                                }
                            }
                            i4++;
                            pz8 = pz82;
                            y192 = y193;
                            context = context2;
                            i3 = i5;
                        }
                    }
                    i5 = i3;
                    ay8 = ay84;
                    if (!(a3Var3 instanceof zr8)) {
                    }
                    i4++;
                    pz8 = pz82;
                    y192 = y193;
                    context = context2;
                    i3 = i5;
                }
                int i24 = i3;
                iy8 iy86 = iy8;
                pz83 = pz8;
                y194 = y192;
                context3 = context;
                xb4 = xb42;
                i13 = 100;
                i15 = i17 + 1;
                i14 = i24;
            }
            i2 = 0;
            arrayList = null;
            if (arrayList == null) {
            }
            int i222 = i16;
            arrayList2.add(new zy8(a3Var2, z992.y, z992.F));
            size = arrayList2.size();
            i4 = i2;
            while (i4 < size) {
            }
            int i242 = i3;
            iy8 iy862 = iy8;
            pz83 = pz8;
            y194 = y192;
            context3 = context;
            xb4 = xb42;
            i13 = 100;
            i15 = i17 + 1;
            i14 = i242;
        }
        return;
        str4 = str3;
        String str49 = str;
        SQLiteDatabase sQLiteDatabase5 = i1;
        int i25 = 5;
        str7 = str2;
        cursor2 = null;
        str5 = str8;
        str6 = str7;
        pz8 pz8422222 = y19.B;
        y19.g(pz8422222);
        pz8422222.B.b("Error reading entries from local database", e);
        i.z = true;
        if (cursor2 != null) {
        }
        if (sQLiteDatabase == null) {
        }
        sQLiteDatabase.close();
        i7 = i8 + 1;
        i6 = i9;
        str2 = str6;
        str = str5;
        str3 = str4;
    }

    public final void v1(xn8 xn8) {
        boolean z2;
        b1();
        d1();
        y19 y19 = (y19) this.w;
        y19.getClass();
        cz8 i = y19.i();
        y19 y192 = (y19) i.w;
        y19.e(y192.E);
        byte[] L1 = d99.L1(xn8);
        if (L1.length > 131072) {
            pz8 pz8 = y192.B;
            y19.g(pz8);
            pz8.C.a("Conditional user property too long for local database. Sending directly to service");
            z2 = false;
        } else {
            z2 = i.j1(2, L1);
        }
        q1(new hy8(this, s1(true), z2, new xn8(xn8)));
    }
}
